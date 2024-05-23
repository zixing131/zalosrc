package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1535c0;
import androidx.core.view.C1547f0;
import androidx.core.view.InterfaceC1491a0;
import androidx.core.view.InterfaceC1531b0;
import androidx.core.view.InterfaceC1539d0;
import androidx.core.view.InterfaceC1543e0;
import androidx.core.widget.AbstractC1637i;

/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC1543e0, InterfaceC1539d0, InterfaceC1491a0, InterfaceC1531b0 {

    /* renamed from: h0 */
    private static final int[] f8275h0 = {R.attr.enabled};

    /* renamed from: A */
    private boolean f8276A;

    /* renamed from: B */
    private int f8277B;

    /* renamed from: C */
    int f8278C;

    /* renamed from: D */
    private float f8279D;

    /* renamed from: E */
    private float f8280E;

    /* renamed from: F */
    private boolean f8281F;

    /* renamed from: G */
    private int f8282G;

    /* renamed from: H */
    boolean f8283H;

    /* renamed from: I */
    private boolean f8284I;

    /* renamed from: J */
    private final DecelerateInterpolator f8285J;

    /* renamed from: K */
    C1956a f8286K;

    /* renamed from: L */
    private int f8287L;

    /* renamed from: M */
    protected int f8288M;

    /* renamed from: N */
    float f8289N;

    /* renamed from: O */
    protected int f8290O;

    /* renamed from: P */
    int f8291P;

    /* renamed from: Q */
    int f8292Q;

    /* renamed from: R */
    C1957b f8293R;

    /* renamed from: S */
    private Animation f8294S;

    /* renamed from: T */
    private Animation f8295T;

    /* renamed from: U */
    private Animation f8296U;

    /* renamed from: V */
    private Animation f8297V;

    /* renamed from: W */
    private Animation f8298W;

    /* renamed from: a0 */
    boolean f8299a0;

    /* renamed from: b0 */
    private int f8300b0;

    /* renamed from: c0 */
    boolean f8301c0;

    /* renamed from: d0 */
    private boolean f8302d0;

    /* renamed from: e0 */
    private Animation.AnimationListener f8303e0;

    /* renamed from: f0 */
    private final Animation f8304f0;

    /* renamed from: g0 */
    private final Animation f8305g0;

    /* renamed from: p */
    private View f8306p;

    /* renamed from: q */
    InterfaceC1955j f8307q;

    /* renamed from: r */
    boolean f8308r;

    /* renamed from: s */
    private int f8309s;

    /* renamed from: t */
    private float f8310t;

    /* renamed from: u */
    private float f8311u;

    /* renamed from: v */
    private final C1547f0 f8312v;

    /* renamed from: w */
    private final C1535c0 f8313w;

    /* renamed from: x */
    private final int[] f8314x;

    /* renamed from: y */
    private final int[] f8315y;

    /* renamed from: z */
    private final int[] f8316z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1945a();

        /* renamed from: p */
        final boolean f8317p;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        /* loaded from: classes2.dex */
        class C1945a implements Parcelable.Creator {
            C1945a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable, boolean z11) {
            super(parcelable);
            this.f8317p = z11;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f8317p ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f8317p = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    /* loaded from: classes2.dex */
    class AnimationAnimationListenerC1946a implements Animation.AnimationListener {
        AnimationAnimationListenerC1946a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC1955j interfaceC1955j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f8308r) {
                swipeRefreshLayout.f8293R.setAlpha(255);
                SwipeRefreshLayout.this.f8293R.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f8299a0 && (interfaceC1955j = swipeRefreshLayout2.f8307q) != null) {
                    interfaceC1955j.mo10764a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f8278C = swipeRefreshLayout3.f8286K.getTop();
                return;
            }
            swipeRefreshLayout.m10760p();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    /* loaded from: classes2.dex */
    public class C1947b extends Animation {
        C1947b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    /* loaded from: classes2.dex */
    public class C1948c extends Animation {
        C1948c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    /* loaded from: classes2.dex */
    public class C1949d extends Animation {

        /* renamed from: p */
        final /* synthetic */ int f8321p;

        /* renamed from: q */
        final /* synthetic */ int f8322q;

        C1949d(int i11, int i12) {
            this.f8321p = i11;
            this.f8322q = i12;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.f8293R.setAlpha((int) (this.f8321p + ((this.f8322q - r0) * f11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    /* loaded from: classes2.dex */
    public class AnimationAnimationListenerC1950e implements Animation.AnimationListener {
        AnimationAnimationListenerC1950e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f8283H) {
                swipeRefreshLayout.m10761z(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    /* loaded from: classes2.dex */
    class C1951f extends Animation {
        C1951f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            int i11;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f8301c0) {
                i11 = swipeRefreshLayout.f8291P - Math.abs(swipeRefreshLayout.f8290O);
            } else {
                i11 = swipeRefreshLayout.f8291P;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f8288M + ((int) ((i11 - r1) * f11))) - swipeRefreshLayout2.f8286K.getTop());
            SwipeRefreshLayout.this.f8293R.m10775f(1.0f - f11);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    /* loaded from: classes2.dex */
    class C1952g extends Animation {
        C1952g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout.this.m10759m(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    /* loaded from: classes2.dex */
    public class C1953h extends Animation {
        C1953h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f12 = swipeRefreshLayout.f8289N;
            swipeRefreshLayout.setAnimationProgress(f12 + ((-f12) * f11));
            SwipeRefreshLayout.this.m10759m(f11);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC1954i {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC1955j {
        /* renamed from: a */
        void mo10764a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8308r = false;
        this.f8310t = -1.0f;
        this.f8314x = new int[2];
        this.f8315y = new int[2];
        this.f8316z = new int[2];
        this.f8282G = -1;
        this.f8287L = -1;
        this.f8303e0 = new AnimationAnimationListenerC1946a();
        this.f8304f0 = new C1951f();
        this.f8305g0 = new C1952g();
        this.f8309s = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f8277B = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f8285J = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f8300b0 = (int) (displayMetrics.density * 40.0f);
        m10746d();
        setChildrenDrawingOrderEnabled(true);
        int i11 = (int) (displayMetrics.density * 64.0f);
        this.f8291P = i11;
        this.f8310t = i11;
        this.f8312v = new C1547f0(this);
        this.f8313w = new C1535c0(this);
        setNestedScrollingEnabled(true);
        int i12 = -this.f8300b0;
        this.f8278C = i12;
        this.f8290O = i12;
        m10759m(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8275h0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    private void m10742A(int i11, Animation.AnimationListener animationListener) {
        this.f8288M = i11;
        this.f8289N = this.f8286K.getScaleX();
        C1953h c1953h = new C1953h();
        this.f8298W = c1953h;
        c1953h.setDuration(150L);
        if (animationListener != null) {
            this.f8286K.m10766b(animationListener);
        }
        this.f8286K.clearAnimation();
        this.f8286K.startAnimation(this.f8298W);
    }

    /* renamed from: B */
    private void m10743B(Animation.AnimationListener animationListener) {
        this.f8286K.setVisibility(0);
        this.f8293R.setAlpha(255);
        C1947b c1947b = new C1947b();
        this.f8294S = c1947b;
        c1947b.setDuration(this.f8277B);
        if (animationListener != null) {
            this.f8286K.m10766b(animationListener);
        }
        this.f8286K.clearAnimation();
        this.f8286K.startAnimation(this.f8294S);
    }

    /* renamed from: a */
    private void m10744a(int i11, Animation.AnimationListener animationListener) {
        this.f8288M = i11;
        this.f8304f0.reset();
        this.f8304f0.setDuration(200L);
        this.f8304f0.setInterpolator(this.f8285J);
        if (animationListener != null) {
            this.f8286K.m10766b(animationListener);
        }
        this.f8286K.clearAnimation();
        this.f8286K.startAnimation(this.f8304f0);
    }

    /* renamed from: b */
    private void m10745b(int i11, Animation.AnimationListener animationListener) {
        if (this.f8283H) {
            m10742A(i11, animationListener);
            return;
        }
        this.f8288M = i11;
        this.f8305g0.reset();
        this.f8305g0.setDuration(200L);
        this.f8305g0.setInterpolator(this.f8285J);
        if (animationListener != null) {
            this.f8286K.m10766b(animationListener);
        }
        this.f8286K.clearAnimation();
        this.f8286K.startAnimation(this.f8305g0);
    }

    /* renamed from: d */
    private void m10746d() {
        this.f8286K = new C1956a(getContext());
        C1957b c1957b = new C1957b(getContext());
        this.f8293R = c1957b;
        c1957b.m10780m(1);
        this.f8286K.setImageDrawable(this.f8293R);
        this.f8286K.setVisibility(8);
        addView(this.f8286K);
    }

    /* renamed from: f */
    private void m10747f() {
        if (this.f8306p == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.f8286K)) {
                    this.f8306p = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m10748g(float f11) {
        AnimationAnimationListenerC1950e animationAnimationListenerC1950e;
        if (f11 > this.f8310t) {
            m10752q(true, true);
            return;
        }
        this.f8308r = false;
        this.f8293R.m10778k(0.0f, 0.0f);
        if (!this.f8283H) {
            animationAnimationListenerC1950e = new AnimationAnimationListenerC1950e();
        } else {
            animationAnimationListenerC1950e = null;
        }
        m10745b(this.f8278C, animationAnimationListenerC1950e);
        this.f8293R.m10774e(false);
    }

    /* renamed from: h */
    private boolean m10749h(Animation animation) {
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private void m10750l(float f11) {
        this.f8293R.m10774e(true);
        float min = Math.min(1.0f, Math.abs(f11 / this.f8310t));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f11) - this.f8310t;
        int i11 = this.f8292Q;
        if (i11 <= 0) {
            if (this.f8301c0) {
                i11 = this.f8291P - this.f8290O;
            } else {
                i11 = this.f8291P;
            }
        }
        float f12 = i11;
        double max2 = Math.max(0.0f, Math.min(abs, f12 * 2.0f) / f12) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i12 = this.f8290O + ((int) ((f12 * min) + (f12 * pow * 2.0f)));
        if (this.f8286K.getVisibility() != 0) {
            this.f8286K.setVisibility(0);
        }
        if (!this.f8283H) {
            this.f8286K.setScaleX(1.0f);
            this.f8286K.setScaleY(1.0f);
        }
        if (this.f8283H) {
            setAnimationProgress(Math.min(1.0f, f11 / this.f8310t));
        }
        if (f11 < this.f8310t) {
            if (this.f8293R.getAlpha() > 76 && !m10749h(this.f8296U)) {
                m10756y();
            }
        } else if (this.f8293R.getAlpha() < 255 && !m10749h(this.f8297V)) {
            m10755x();
        }
        this.f8293R.m10778k(0.0f, Math.min(0.8f, max * 0.8f));
        this.f8293R.m10775f(Math.min(1.0f, max));
        this.f8293R.m10777h((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i12 - this.f8278C);
    }

    /* renamed from: n */
    private void m10751n(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8282G) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f8282G = motionEvent.getPointerId(i11);
        }
    }

    /* renamed from: q */
    private void m10752q(boolean z11, boolean z12) {
        if (this.f8308r != z11) {
            this.f8299a0 = z12;
            m10747f();
            this.f8308r = z11;
            if (z11) {
                m10744a(this.f8278C, this.f8303e0);
            } else {
                m10761z(this.f8303e0);
            }
        }
    }

    private void setColorViewAlpha(int i11) {
        this.f8286K.getBackground().setAlpha(i11);
        this.f8293R.setAlpha(i11);
    }

    /* renamed from: u */
    private Animation m10753u(int i11, int i12) {
        C1949d c1949d = new C1949d(i11, i12);
        c1949d.setDuration(300L);
        this.f8286K.m10766b(null);
        this.f8286K.clearAnimation();
        this.f8286K.startAnimation(c1949d);
        return c1949d;
    }

    /* renamed from: w */
    private void m10754w(float f11) {
        float f12 = this.f8280E;
        float f13 = f11 - f12;
        int i11 = this.f8309s;
        if (f13 > i11 && !this.f8281F) {
            this.f8279D = f12 + i11;
            this.f8281F = true;
            this.f8293R.setAlpha(76);
        }
    }

    /* renamed from: x */
    private void m10755x() {
        this.f8297V = m10753u(this.f8293R.getAlpha(), 255);
    }

    /* renamed from: y */
    private void m10756y() {
        this.f8296U = m10753u(this.f8293R.getAlpha(), 76);
    }

    /* renamed from: c */
    public boolean m10757c() {
        View view = this.f8306p;
        if (view instanceof ListView) {
            return AbstractC1637i.m8397a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f8313w.m7715a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f8313w.m7716b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f8313w.m7717c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f8313w.m7720f(i11, i12, i13, i14, iArr);
    }

    /* renamed from: e */
    public void m10758e(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        if (i15 == 0) {
            this.f8313w.m7719e(i11, i12, i13, i14, iArr, i15, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.f8287L;
        return i13 < 0 ? i12 : i12 == i11 + (-1) ? i13 : i12 >= i13 ? i12 + 1 : i12;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8312v.m7761a();
    }

    public int getProgressCircleDiameter() {
        return this.f8300b0;
    }

    public int getProgressViewEndOffset() {
        return this.f8291P;
    }

    public int getProgressViewStartOffset() {
        return this.f8290O;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f8313w.m7721j();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f8313w.m7723l();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: j */
    public void mo5177j(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    /* renamed from: m */
    void m10759m(float f11) {
        setTargetOffsetTopAndBottom((this.f8288M + ((int) ((this.f8290O - r0) * f11))) - this.f8286K.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10760p();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m10747f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8284I && actionMasked == 0) {
            this.f8284I = false;
        }
        if (!isEnabled() || this.f8284I || m10757c() || this.f8308r || this.f8276A) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            m10751n(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.f8282G;
                    if (i11 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i11)) < 0) {
                        return false;
                    }
                    m10754w(motionEvent.getY(findPointerIndex));
                }
            }
            this.f8281F = false;
            this.f8282G = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f8290O - this.f8286K.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f8282G = pointerId;
            this.f8281F = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f8280E = motionEvent.getY(findPointerIndex2);
        }
        return this.f8281F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f8306p == null) {
            m10747f();
        }
        View view = this.f8306p;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f8286K.getMeasuredWidth();
        int measuredHeight2 = this.f8286K.getMeasuredHeight();
        int i15 = measuredWidth / 2;
        int i16 = measuredWidth2 / 2;
        int i17 = this.f8278C;
        this.f8286K.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f8306p == null) {
            m10747f();
        }
        View view = this.f8306p;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f8286K.measure(View.MeasureSpec.makeMeasureSpec(this.f8300b0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f8300b0, 1073741824));
        this.f8287L = -1;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13) == this.f8286K) {
                this.f8287L = i13;
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
            float f11 = this.f8311u;
            if (f11 > 0.0f) {
                float f12 = i12;
                if (f12 > f11) {
                    iArr[1] = (int) f11;
                    this.f8311u = 0.0f;
                } else {
                    this.f8311u = f11 - f12;
                    iArr[1] = i12;
                }
                m10750l(this.f8311u);
            }
        }
        if (this.f8301c0 && i12 > 0 && this.f8311u == 0.0f && Math.abs(i12 - iArr[1]) > 0) {
            this.f8286K.setVisibility(8);
        }
        int[] iArr2 = this.f8314x;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        mo5182r(view, i11, i12, i13, i14, 0, this.f8316z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f8312v.m7762b(view, view2, i11);
        startNestedScroll(i11 & 2);
        this.f8311u = 0.0f;
        this.f8276A = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f8317p);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f8308r);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if (isEnabled() && !this.f8284I && !this.f8308r && (i11 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f8312v.m7764d(view);
        this.f8276A = false;
        float f11 = this.f8311u;
        if (f11 > 0.0f) {
            m10748g(f11);
            this.f8311u = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8284I && actionMasked == 0) {
            this.f8284I = false;
        }
        if (!isEnabled() || this.f8284I || m10757c() || this.f8308r || this.f8276A) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            m10751n(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.f8282G = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f8282G);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y11 = motionEvent.getY(findPointerIndex);
                    m10754w(y11);
                    if (this.f8281F) {
                        float f11 = (y11 - this.f8279D) * 0.5f;
                        if (f11 <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        m10750l(f11);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f8282G);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                if (this.f8281F) {
                    float y12 = (motionEvent.getY(findPointerIndex2) - this.f8279D) * 0.5f;
                    this.f8281F = false;
                    m10748g(y12);
                }
                this.f8282G = -1;
                return false;
            }
        } else {
            this.f8282G = motionEvent.getPointerId(0);
            this.f8281F = false;
        }
        return true;
    }

    /* renamed from: p */
    void m10760p() {
        this.f8286K.clearAnimation();
        this.f8293R.stop();
        this.f8286K.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f8283H) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f8290O - this.f8278C);
        }
        this.f8278C = this.f8286K.getTop();
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        int i16;
        if (i15 != 0) {
            return;
        }
        int i17 = iArr[1];
        m10758e(i11, i12, i13, i14, this.f8315y, i15, iArr);
        int i18 = i14 - (iArr[1] - i17);
        if (i18 == 0) {
            i16 = i14 + this.f8315y[1];
        } else {
            i16 = i18;
        }
        if (i16 < 0 && !m10757c()) {
            float abs = this.f8311u + Math.abs(i16);
            this.f8311u = abs;
            m10750l(abs);
            iArr[1] = iArr[1] + i18;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        ViewParent parent;
        View view = this.f8306p;
        if (view != null && !AbstractC1579n0.m7868f0(view)) {
            if (!this.f8302d0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(z11);
                return;
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
        mo5182r(view, i11, i12, i13, i14, i15, this.f8316z);
    }

    void setAnimationProgress(float f11) {
        this.f8286K.setScaleX(f11);
        this.f8286K.setScaleY(f11);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m10747f();
        this.f8293R.m10776g(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = AbstractC1388a.m6961c(context, iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f8310t = i11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!z11) {
            m10760p();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z11) {
        this.f8302d0 = z11;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f8313w.m7724m(z11);
    }

    public void setOnChildScrollUpCallback(InterfaceC1954i interfaceC1954i) {
    }

    public void setOnRefreshListener(InterfaceC1955j interfaceC1955j) {
        this.f8307q = interfaceC1955j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.f8286K.setBackgroundColor(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(AbstractC1388a.m6961c(getContext(), i11));
    }

    public void setRefreshing(boolean z11) {
        int i11;
        if (z11 && this.f8308r != z11) {
            this.f8308r = z11;
            if (!this.f8301c0) {
                i11 = this.f8291P + this.f8290O;
            } else {
                i11 = this.f8291P;
            }
            setTargetOffsetTopAndBottom(i11 - this.f8278C);
            this.f8299a0 = false;
            m10743B(this.f8303e0);
            return;
        }
        m10752q(z11, false);
    }

    public void setSize(int i11) {
        if (i11 != 0 && i11 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i11 == 0) {
            this.f8300b0 = (int) (displayMetrics.density * 56.0f);
        } else {
            this.f8300b0 = (int) (displayMetrics.density * 40.0f);
        }
        this.f8286K.setImageDrawable(null);
        this.f8293R.m10780m(i11);
        this.f8286K.setImageDrawable(this.f8293R);
    }

    public void setSlingshotDistance(int i11) {
        this.f8292Q = i11;
    }

    void setTargetOffsetTopAndBottom(int i11) {
        this.f8286K.bringToFront();
        AbstractC1579n0.m7886l0(this.f8286K, i11);
        this.f8278C = this.f8286K.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return this.f8313w.m7725o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f8313w.m7727q();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            return onStartNestedScroll(view, view2, i11);
        }
        return false;
    }

    /* renamed from: z */
    void m10761z(Animation.AnimationListener animationListener) {
        C1948c c1948c = new C1948c();
        this.f8295T = c1948c;
        c1948c.setDuration(150L);
        this.f8286K.m10766b(animationListener);
        this.f8286K.clearAnimation();
        this.f8286K.startAnimation(this.f8295T);
    }
}
