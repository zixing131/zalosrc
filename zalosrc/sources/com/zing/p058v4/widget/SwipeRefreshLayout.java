package com.zing.p058v4.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ImageView;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1622z;
import androidx.core.view.C1535c0;
import androidx.core.view.C1547f0;
import androidx.core.view.InterfaceC1531b0;
import le0.AbstractC22459a;
import p262jb.AbstractC21196a;

/* loaded from: classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC1531b0 {

    /* renamed from: i0 */
    private static int f37741i0 = -328966;

    /* renamed from: j0 */
    static final int[] f37742j0 = {R.attr.enabled};

    /* renamed from: k0 */
    private static final int[] f37743k0 = new int[1];

    /* renamed from: A */
    boolean f37744A;

    /* renamed from: B */
    int f37745B;

    /* renamed from: C */
    int f37746C;

    /* renamed from: D */
    boolean f37747D;

    /* renamed from: E */
    float f37748E;

    /* renamed from: F */
    float f37749F;

    /* renamed from: G */
    boolean f37750G;

    /* renamed from: H */
    int f37751H;

    /* renamed from: I */
    boolean f37752I;

    /* renamed from: J */
    boolean f37753J;

    /* renamed from: K */
    final DecelerateInterpolator f37754K;

    /* renamed from: L */
    C6893a f37755L;

    /* renamed from: M */
    int f37756M;

    /* renamed from: N */
    protected int f37757N;

    /* renamed from: O */
    float f37758O;

    /* renamed from: P */
    protected int f37759P;

    /* renamed from: Q */
    C6894b f37760Q;

    /* renamed from: R */
    Animation f37761R;

    /* renamed from: S */
    Animation f37762S;

    /* renamed from: T */
    Animation f37763T;

    /* renamed from: U */
    Animation f37764U;

    /* renamed from: V */
    Animation f37765V;

    /* renamed from: W */
    float f37766W;

    /* renamed from: a0 */
    boolean f37767a0;

    /* renamed from: b0 */
    int f37768b0;

    /* renamed from: c0 */
    int f37769c0;

    /* renamed from: d0 */
    boolean f37770d0;

    /* renamed from: e0 */
    Animation.AnimationListener f37771e0;

    /* renamed from: f0 */
    boolean f37772f0;

    /* renamed from: g0 */
    final Animation f37773g0;

    /* renamed from: h0 */
    final Animation f37774h0;

    /* renamed from: p */
    int f37775p;

    /* renamed from: q */
    View f37776q;

    /* renamed from: r */
    InterfaceC6891i f37777r;

    /* renamed from: s */
    boolean f37778s;

    /* renamed from: t */
    int f37779t;

    /* renamed from: u */
    float f37780u;

    /* renamed from: v */
    float f37781v;

    /* renamed from: w */
    final C1547f0 f37782w;

    /* renamed from: x */
    final C1535c0 f37783x;

    /* renamed from: y */
    final int[] f37784y;

    /* renamed from: z */
    final int[] f37785z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$a */
    /* loaded from: classes3.dex */
    public class AnimationAnimationListenerC6883a implements Animation.AnimationListener {
        AnimationAnimationListenerC6883a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f37778s) {
                swipeRefreshLayout.f37760Q.setAlpha(255);
                SwipeRefreshLayout.this.f37760Q.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f37767a0) {
                    InterfaceC6891i interfaceC6891i = swipeRefreshLayout2.f37777r;
                    if (interfaceC6891i != null) {
                        interfaceC6891i.mo12137a();
                    }
                    SwipeRefreshLayout.this.getClass();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f37746C = swipeRefreshLayout3.f37755L.getTop();
                return;
            }
            swipeRefreshLayout.m35369q();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$b */
    /* loaded from: classes3.dex */
    public class C6884b extends Animation {
        C6884b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f11);
        }
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$c */
    /* loaded from: classes3.dex */
    public class C6885c extends Animation {
        C6885c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f11);
        }
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$d */
    /* loaded from: classes3.dex */
    public class C6886d extends Animation {

        /* renamed from: p */
        final /* synthetic */ int f37789p;

        /* renamed from: q */
        final /* synthetic */ int f37790q;

        C6886d(int i11, int i12) {
            this.f37789p = i11;
            this.f37790q = i12;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.f37760Q.setAlpha((int) (this.f37789p + ((this.f37790q - r0) * f11)));
        }
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$e */
    /* loaded from: classes3.dex */
    public class AnimationAnimationListenerC6887e implements Animation.AnimationListener {
        AnimationAnimationListenerC6887e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f37752I) {
                swipeRefreshLayout.m35377z(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$f */
    /* loaded from: classes3.dex */
    public class C6888f extends Animation {
        C6888f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            int i11;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f37770d0) {
                i11 = (int) (swipeRefreshLayout.f37766W - Math.abs(swipeRefreshLayout.f37759P));
            } else {
                i11 = (int) swipeRefreshLayout.f37766W;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.m35373v((swipeRefreshLayout2.f37757N + ((int) ((i11 - r1) * f11))) - swipeRefreshLayout2.f37755L.getTop(), false);
            SwipeRefreshLayout.this.f37760Q.m35383e(1.0f - f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$g */
    /* loaded from: classes3.dex */
    public class C6889g extends Animation {
        C6889g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.m35367n(f11);
        }
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$h */
    /* loaded from: classes3.dex */
    public class C6890h extends Animation {
        C6890h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f12 = swipeRefreshLayout.f37758O;
            swipeRefreshLayout.setAnimationProgress(f12 + ((-f12) * f11));
            SwipeRefreshLayout.this.m35367n(f11);
        }
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$i */
    /* loaded from: classes3.dex */
    public interface InterfaceC6891i {
        /* renamed from: a */
        void mo12137a();
    }

    /* renamed from: com.zing.v4.widget.SwipeRefreshLayout$j */
    /* loaded from: classes3.dex */
    public interface InterfaceC6892j {
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37775p = 200;
        this.f37778s = false;
        this.f37780u = -1.0f;
        this.f37784y = new int[2];
        this.f37785z = new int[2];
        this.f37747D = false;
        this.f37751H = -1;
        this.f37756M = -1;
        this.f37771e0 = new AnimationAnimationListenerC6883a();
        this.f37772f0 = true;
        this.f37773g0 = new C6888f();
        this.f37774h0 = new C6889g();
        this.f37779t = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f37745B = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f37754K = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f37742j0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f11 = displayMetrics.density;
        this.f37768b0 = (int) (f11 * 40.0f);
        this.f37769c0 = (int) (f11 * 40.0f);
        m35357d();
        AbstractC1579n0.m7813G0(this, true);
        float f12 = displayMetrics.density * 64.0f;
        this.f37766W = f12;
        this.f37780u = f12;
        this.f37782w = new C1547f0(this);
        this.f37783x = new C1535c0(this);
        setNestedScrollingEnabled(true);
    }

    /* renamed from: A */
    void m35352A(int i11, Animation.AnimationListener animationListener) {
        this.f37757N = i11;
        if (m35361h()) {
            this.f37758O = this.f37760Q.getAlpha();
        } else {
            this.f37758O = AbstractC1579n0.m7826N(this.f37755L);
        }
        C6890h c6890h = new C6890h();
        this.f37765V = c6890h;
        c6890h.setDuration(150L);
        if (animationListener != null) {
            this.f37755L.m35379g(animationListener);
        }
        this.f37755L.clearAnimation();
        this.f37755L.startAnimation(this.f37765V);
    }

    /* renamed from: B */
    void m35353B(Animation.AnimationListener animationListener) {
        this.f37755L.setVisibility(0);
        this.f37760Q.setAlpha(255);
        C6884b c6884b = new C6884b();
        this.f37761R = c6884b;
        c6884b.setDuration(this.f37745B);
        if (animationListener != null) {
            this.f37755L.m35379g(animationListener);
        }
        this.f37755L.clearAnimation();
        this.f37755L.startAnimation(this.f37761R);
    }

    /* renamed from: a */
    void m35354a(int i11, Animation.AnimationListener animationListener) {
        this.f37757N = i11;
        this.f37773g0.reset();
        this.f37773g0.setDuration(this.f37775p);
        this.f37773g0.setInterpolator(this.f37754K);
        if (animationListener != null) {
            this.f37755L.m35379g(animationListener);
        }
        this.f37755L.clearAnimation();
        if (this.f37775p == 0) {
            if (animationListener != null) {
                animationListener.onAnimationStart(null);
                animationListener.onAnimationEnd(null);
                return;
            }
            return;
        }
        this.f37755L.startAnimation(this.f37773g0);
    }

    /* renamed from: b */
    void m35355b(int i11, Animation.AnimationListener animationListener) {
        if (this.f37752I) {
            m35352A(i11, animationListener);
            return;
        }
        this.f37757N = i11;
        this.f37774h0.reset();
        this.f37774h0.setDuration(200L);
        this.f37774h0.setInterpolator(this.f37754K);
        if (animationListener != null) {
            this.f37755L.m35379g(animationListener);
        }
        this.f37755L.clearAnimation();
        this.f37755L.startAnimation(this.f37774h0);
    }

    /* renamed from: c */
    public boolean mo35356c() {
        return AbstractC1579n0.m7867f(this.f37776q, -1);
    }

    /* renamed from: d */
    void m35357d() {
        f37741i0 = AbstractC22459a.m116119a(getContext(), AbstractC21196a.PopupBackgroundColor);
        this.f37755L = new C6893a(getContext(), f37741i0, 20.0f);
        C6894b c6894b = new C6894b(getContext(), this);
        this.f37760Q = c6894b;
        c6894b.m35384f(f37741i0);
        this.f37755L.setImageDrawable(this.f37760Q);
        this.f37755L.setVisibility(8);
        addView(this.f37755L);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f37783x.m7715a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f37783x.m7716b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f37783x.m7717c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f37783x.m7720f(i11, i12, i13, i14, iArr);
    }

    /* renamed from: e */
    void m35358e() {
        if (this.f37776q == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.f37755L)) {
                    this.f37776q = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    void m35359f(float f11) {
        AnimationAnimationListenerC6887e animationAnimationListenerC6887e;
        if (f11 > this.f37780u) {
            m35372u(true, true);
            return;
        }
        this.f37778s = false;
        this.f37760Q.m35389k(0.0f, 0.0f);
        if (!this.f37752I) {
            animationAnimationListenerC6887e = new AnimationAnimationListenerC6887e();
        } else {
            animationAnimationListenerC6887e = null;
        }
        m35355b(this.f37746C, animationAnimationListenerC6887e);
        this.f37760Q.m35391m(false);
    }

    /* renamed from: g */
    float m35360g(MotionEvent motionEvent, int i11) {
        int m8273a = AbstractC1622z.m8273a(motionEvent, i11);
        if (m8273a < 0) {
            return -1.0f;
        }
        return AbstractC1622z.m8278f(motionEvent, m8273a);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.f37756M;
        return i13 < 0 ? i12 : i12 == i11 + (-1) ? i13 : i12 >= i13 ? i12 + 1 : i12;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f37782w.m7761a();
    }

    public int getProgressCircleDiameter() {
        C6893a c6893a = this.f37755L;
        if (c6893a != null) {
            return c6893a.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: h */
    boolean m35361h() {
        return false;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f37783x.m7721j();
    }

    /* renamed from: i */
    boolean m35362i(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f37783x.m7723l();
    }

    /* renamed from: j */
    public boolean m35363j() {
        C6893a c6893a;
        if (getVisibility() == 0 && (c6893a = this.f37755L) != null && c6893a.getTop() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m35364k() {
        return this.f37778s;
    }

    /* renamed from: l */
    public boolean m35365l() {
        return this.f37772f0;
    }

    /* renamed from: m */
    void m35366m(float f11) {
        float f12;
        this.f37760Q.m35391m(true);
        float min = Math.min(1.0f, Math.abs(f11 / this.f37780u));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f11) - this.f37780u;
        if (this.f37770d0) {
            f12 = this.f37766W - this.f37759P;
        } else {
            f12 = this.f37766W;
        }
        double max2 = Math.max(0.0f, Math.min(abs, f12 * 2.0f) / f12) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f37759P + ((int) ((f12 * min) + (f12 * pow * 2.0f)));
        if (this.f37755L.getVisibility() != 0) {
            this.f37755L.setVisibility(0);
        }
        if (!this.f37752I) {
            AbstractC1579n0.m7845W0(this.f37755L, 1.0f);
            AbstractC1579n0.m7847X0(this.f37755L, 1.0f);
        }
        if (this.f37752I) {
            setAnimationProgress(Math.min(1.0f, f11 / this.f37780u));
        }
        if (f11 < this.f37780u) {
            if (this.f37760Q.getAlpha() > 76 && !m35362i(this.f37763T)) {
                m35376y();
            }
        } else if (this.f37760Q.getAlpha() < 255 && !m35362i(this.f37764U)) {
            m35375x();
        }
        this.f37760Q.m35389k(0.0f, Math.min(0.8f, max * 0.8f));
        this.f37760Q.m35383e(Math.min(1.0f, max));
        this.f37760Q.m35386h((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        m35373v(i11 - this.f37746C, true);
    }

    /* renamed from: n */
    void m35367n(float f11) {
        m35373v((this.f37757N + ((int) ((this.f37759P - r0) * f11))) - this.f37755L.getTop(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m35369q();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m35358e();
        int m8275c = AbstractC1622z.m8275c(motionEvent);
        if (this.f37753J && m8275c == 0) {
            this.f37753J = false;
        }
        if (!isEnabled() || !m35365l() || this.f37753J || mo35356c() || this.f37778s || this.f37744A) {
            return false;
        }
        if (m8275c != 0) {
            if (m8275c != 1) {
                if (m8275c != 2) {
                    if (m8275c != 3) {
                        if (m8275c == 6) {
                            m35368p(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.f37751H;
                    if (i11 == -1) {
                        return false;
                    }
                    float m35360g = m35360g(motionEvent, i11);
                    if (m35360g == -1.0f) {
                        return false;
                    }
                    float f11 = this.f37749F;
                    float f12 = m35360g - f11;
                    int i12 = this.f37779t;
                    if (f12 > i12 && !this.f37750G) {
                        this.f37748E = f11 + i12;
                        this.f37750G = true;
                        this.f37760Q.setAlpha(76);
                    }
                }
            }
            this.f37750G = false;
            this.f37751H = -1;
        } else {
            m35373v(this.f37759P - this.f37755L.getTop(), true);
            int m8276d = AbstractC1622z.m8276d(motionEvent, 0);
            this.f37751H = m8276d;
            this.f37750G = false;
            float m35360g2 = m35360g(motionEvent, m8276d);
            if (m35360g2 == -1.0f) {
                return false;
            }
            this.f37749F = m35360g2;
        }
        return this.f37750G;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f37776q == null) {
            m35358e();
        }
        View view = this.f37776q;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f37755L.getMeasuredWidth();
        int measuredHeight2 = this.f37755L.getMeasuredHeight();
        int i15 = measuredWidth / 2;
        int i16 = measuredWidth2 / 2;
        int i17 = this.f37746C;
        this.f37755L.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f37776q == null) {
            m35358e();
        }
        View view = this.f37776q;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f37755L.measure(View.MeasureSpec.makeMeasureSpec(this.f37768b0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f37769c0, 1073741824));
        if (!this.f37770d0 && !this.f37747D) {
            this.f37747D = true;
            int i13 = -this.f37755L.getMeasuredHeight();
            this.f37759P = i13;
            this.f37746C = i13;
        }
        this.f37756M = -1;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            if (getChildAt(i14) == this.f37755L) {
                this.f37756M = i14;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f11 = this.f37781v;
            if (f11 > 0.0f) {
                float f12 = i12;
                if (f12 > f11) {
                    iArr[1] = i12 - ((int) f11);
                    this.f37781v = 0.0f;
                } else {
                    this.f37781v = f11 - f12;
                    iArr[1] = i12;
                }
                m35366m(this.f37781v);
            }
        }
        if (this.f37770d0 && i12 > 0 && this.f37781v == 0.0f && Math.abs(i12 - iArr[1]) > 0) {
            this.f37755L.setVisibility(8);
        }
        int[] iArr2 = this.f37784y;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i11, i12, i13, i14, this.f37785z);
        if (i14 + this.f37785z[1] < 0) {
            float abs = this.f37781v + Math.abs(r11);
            this.f37781v = abs;
            m35366m(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f37782w.m7762b(view, view2, i11);
        startNestedScroll(i11 & 2);
        this.f37781v = 0.0f;
        this.f37744A = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if (isEnabled() && m35365l() && mo35356c() && !this.f37753J && !this.f37778s && (i11 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f37782w.m7764d(view);
        this.f37744A = false;
        float f11 = this.f37781v;
        if (f11 > 0.0f) {
            m35359f(f11);
            this.f37781v = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int m8275c = AbstractC1622z.m8275c(motionEvent);
        if (this.f37753J && m8275c == 0) {
            this.f37753J = false;
        }
        if (!isEnabled() || !m35365l() || this.f37753J || mo35356c() || this.f37744A) {
            return false;
        }
        if (m8275c != 0) {
            if (m8275c != 1) {
                if (m8275c != 2) {
                    if (m8275c == 3) {
                        return false;
                    }
                    if (m8275c != 5) {
                        if (m8275c == 6) {
                            m35368p(motionEvent);
                        }
                    } else {
                        int m8274b = AbstractC1622z.m8274b(motionEvent);
                        if (m8274b < 0) {
                            return false;
                        }
                        this.f37751H = AbstractC1622z.m8276d(motionEvent, m8274b);
                    }
                } else {
                    int m8273a = AbstractC1622z.m8273a(motionEvent, this.f37751H);
                    if (m8273a < 0) {
                        return false;
                    }
                    float m8278f = (AbstractC1622z.m8278f(motionEvent, m8273a) - this.f37748E) * 0.5f;
                    if (this.f37750G) {
                        if (m8278f <= 0.0f) {
                            return false;
                        }
                        m35366m(m8278f);
                    }
                }
            } else {
                int m8273a2 = AbstractC1622z.m8273a(motionEvent, this.f37751H);
                if (m8273a2 < 0) {
                    return false;
                }
                float m8278f2 = (AbstractC1622z.m8278f(motionEvent, m8273a2) - this.f37748E) * 0.5f;
                this.f37750G = false;
                m35359f(m8278f2);
                this.f37751H = -1;
                return false;
            }
        } else {
            this.f37751H = AbstractC1622z.m8276d(motionEvent, 0);
            this.f37750G = false;
        }
        return true;
    }

    /* renamed from: p */
    void m35368p(MotionEvent motionEvent) {
        int i11;
        int m8274b = AbstractC1622z.m8274b(motionEvent);
        if (AbstractC1622z.m8276d(motionEvent, m8274b) == this.f37751H) {
            if (m8274b == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f37751H = AbstractC1622z.m8276d(motionEvent, i11);
        }
    }

    /* renamed from: q */
    void m35369q() {
        this.f37755L.clearAnimation();
        this.f37760Q.stop();
        this.f37755L.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f37752I) {
            setAnimationProgress(0.0f);
        } else {
            m35373v(this.f37759P - this.f37746C, true);
        }
        this.f37746C = this.f37755L.getTop();
    }

    /* renamed from: r */
    public void m35370r(boolean z11, int i11) {
        this.f37766W = i11;
        this.f37752I = z11;
        this.f37755L.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        View view = this.f37776q;
        if (view == null || AbstractC1579n0.m7868f0(view)) {
            super.requestDisallowInterceptTouchEvent(z11);
        }
    }

    /* renamed from: s */
    public void m35371s(boolean z11, int i11, int i12) {
        this.f37752I = z11;
        this.f37755L.setVisibility(8);
        this.f37746C = i11;
        this.f37759P = i11;
        this.f37766W = i12;
        this.f37770d0 = true;
        this.f37755L.invalidate();
    }

    public void setAnimateToTriggerDuration(int i11) {
        this.f37775p = i11;
    }

    void setAnimationProgress(float f11) {
        if (m35361h()) {
            setColorViewAlpha((int) (f11 * 255.0f));
        } else {
            AbstractC1579n0.m7845W0(this.f37755L, f11);
            AbstractC1579n0.m7847X0(this.f37755L, f11);
        }
    }

    @SuppressLint({"ResourceType"})
    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    @SuppressLint({"SupportAnnotationUsage"})
    public void setColorSchemeColors(int... iArr) {
        m35358e();
        this.f37760Q.m35385g(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = resources.getColor(iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    void setColorViewAlpha(int i11) {
        this.f37755L.getBackground().setAlpha(i11);
        this.f37760Q.setAlpha(i11);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f37780u = i11;
    }

    public void setImageStaticForOpenFunc(int i11) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            try {
                View childAt = getChildAt(i14);
                if (childAt != null && (childAt instanceof C6893a)) {
                    Drawable m6964f = AbstractC1388a.m6964f(getContext(), i11);
                    if (m6964f != null) {
                        i12 = m6964f.getIntrinsicWidth();
                    } else {
                        i12 = 0;
                    }
                    if (m6964f != null) {
                        i13 = m6964f.getIntrinsicHeight();
                    } else {
                        i13 = 0;
                    }
                    if (i12 <= i13) {
                        i12 = i13;
                    }
                    int i15 = i12 > 40 ? i12 - 40 : 0;
                    if (i15 > 0) {
                        childAt.setPadding(i15, i15, i15, i15);
                    }
                    ((C6893a) childAt).setImageResource(i11);
                    ((C6893a) childAt).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f37783x.m7724m(z11);
    }

    public void setOnRefreshListener(InterfaceC6891i interfaceC6891i) {
        this.f37777r = interfaceC6891i;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.f37755L.setBackgroundColor(i11);
        this.f37760Q.m35384f(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i11));
    }

    public void setRefreshing(boolean z11) {
        float f11;
        if (z11 && this.f37778s != z11) {
            this.f37778s = z11;
            if (!this.f37770d0) {
                f11 = this.f37766W + this.f37759P;
            } else {
                f11 = this.f37766W;
            }
            m35373v(((int) f11) - this.f37746C, true);
            this.f37767a0 = false;
            m35353B(this.f37771e0);
            return;
        }
        m35372u(z11, false);
    }

    public void setSize(int i11) {
        if (i11 != 0 && i11 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i11 == 0) {
            int i12 = (int) (displayMetrics.density * 56.0f);
            this.f37768b0 = i12;
            this.f37769c0 = i12;
        } else {
            int i13 = (int) (displayMetrics.density * 40.0f);
            this.f37768b0 = i13;
            this.f37769c0 = i13;
        }
        this.f37755L.setImageDrawable(null);
        this.f37760Q.m35393o(i11);
        this.f37755L.setImageDrawable(this.f37760Q);
    }

    public void setStartDragingListener(InterfaceC6892j interfaceC6892j) {
    }

    public void setSwipeRefreshEnable(boolean z11) {
        this.f37772f0 = z11;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return this.f37783x.m7725o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f37783x.m7727q();
    }

    /* renamed from: u */
    void m35372u(boolean z11, boolean z12) {
        if (this.f37778s != z11) {
            this.f37767a0 = z12;
            m35358e();
            this.f37778s = z11;
            if (z11) {
                m35354a(this.f37746C, this.f37771e0);
            } else {
                m35377z(this.f37771e0);
            }
        }
    }

    /* renamed from: v */
    void m35373v(int i11, boolean z11) {
        this.f37755L.bringToFront();
        this.f37755L.offsetTopAndBottom(i11);
        this.f37746C = this.f37755L.getTop();
    }

    /* renamed from: w */
    Animation m35374w(int i11, int i12) {
        if (this.f37752I && m35361h()) {
            return null;
        }
        C6886d c6886d = new C6886d(i11, i12);
        c6886d.setDuration(300L);
        this.f37755L.m35379g(null);
        this.f37755L.clearAnimation();
        this.f37755L.startAnimation(c6886d);
        return c6886d;
    }

    /* renamed from: x */
    void m35375x() {
        this.f37764U = m35374w(this.f37760Q.getAlpha(), 255);
    }

    /* renamed from: y */
    void m35376y() {
        this.f37763T = m35374w(this.f37760Q.getAlpha(), 76);
    }

    /* renamed from: z */
    void m35377z(Animation.AnimationListener animationListener) {
        C6885c c6885c = new C6885c();
        this.f37762S = c6885c;
        c6885c.setDuration(150L);
        this.f37755L.m35379g(animationListener);
        this.f37755L.clearAnimation();
        this.f37755L.startAnimation(this.f37762S);
    }
}
