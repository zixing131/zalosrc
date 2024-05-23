package com.zing.zalo.uicontrol.draggableview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1622z;
import com.zing.zalo.uicontrol.draggableview.DraggableView;
import p337m1.C22712c;
import s30.AbstractC26126b;
import s30.AbstractC26127c;
import uc0.C27235d;
import uc0.InterfaceC27232a;

/* loaded from: classes4.dex */
public class DraggableView extends RelativeLayout {

    /* renamed from: h0 */
    public static int f83691h0 = 20;

    /* renamed from: A */
    boolean f83692A;

    /* renamed from: B */
    boolean f83693B;

    /* renamed from: C */
    int f83694C;

    /* renamed from: D */
    int f83695D;

    /* renamed from: E */
    public int f83696E;

    /* renamed from: F */
    int f83697F;

    /* renamed from: G */
    boolean f83698G;

    /* renamed from: H */
    public int f83699H;

    /* renamed from: I */
    public int f83700I;

    /* renamed from: J */
    float f83701J;

    /* renamed from: K */
    float f83702K;

    /* renamed from: L */
    float f83703L;

    /* renamed from: M */
    boolean f83704M;

    /* renamed from: N */
    boolean f83705N;

    /* renamed from: O */
    Drawable f83706O;

    /* renamed from: P */
    int f83707P;

    /* renamed from: Q */
    int f83708Q;

    /* renamed from: R */
    float f83709R;

    /* renamed from: S */
    boolean f83710S;

    /* renamed from: T */
    boolean f83711T;

    /* renamed from: U */
    boolean f83712U;

    /* renamed from: V */
    float f83713V;

    /* renamed from: W */
    Paint f83714W;

    /* renamed from: a0 */
    float f83715a0;

    /* renamed from: b0 */
    float f83716b0;

    /* renamed from: c0 */
    float f83717c0;

    /* renamed from: d0 */
    float f83718d0;

    /* renamed from: e0 */
    float f83719e0;

    /* renamed from: f0 */
    public boolean f83720f0;

    /* renamed from: g0 */
    public boolean f83721g0;

    /* renamed from: p */
    int f83722p;

    /* renamed from: q */
    float f83723q;

    /* renamed from: r */
    C22712c f83724r;

    /* renamed from: s */
    View f83725s;

    /* renamed from: t */
    InterfaceC27232a f83726t;

    /* renamed from: u */
    public float f83727u;

    /* renamed from: v */
    public float f83728v;

    /* renamed from: w */
    public int f83729w;

    /* renamed from: x */
    public int f83730x;

    /* renamed from: y */
    int f83731y;

    /* renamed from: z */
    boolean f83732z;

    public DraggableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83722p = -1;
        this.f83727u = 0.5f;
        this.f83728v = 0.3f;
        this.f83732z = false;
        this.f83692A = false;
        this.f83694C = 255;
        this.f83695D = 0;
        this.f83696E = 0;
        this.f83697F = 0;
        this.f83698G = false;
        this.f83699H = 0;
        this.f83700I = 0;
        this.f83701J = 0.0f;
        this.f83702K = 0.0f;
        this.f83703L = 0.0f;
        this.f83704M = false;
        this.f83705N = true;
        this.f83707P = 0;
        this.f83708Q = 255;
        this.f83709R = 0.0f;
        this.f83710S = true;
        this.f83711T = true;
        this.f83712U = true;
        this.f83714W = new Paint();
        this.f83720f0 = true;
        this.f83721g0 = true;
        m88303i(attributeSet);
    }

    /* renamed from: u */
    public /* synthetic */ void m88293u() {
        try {
            this.f83695D = this.f83725s.getBottom();
            this.f83696E = this.f83725s.getTop();
            this.f83697F = this.f83725s.getLeft();
            AbstractC1579n0.m7839T0(this.f83725s, 0.0f);
            AbstractC1579n0.m7841U0(this.f83725s, 0.0f);
            InterfaceC27232a interfaceC27232a = this.f83726t;
            if (interfaceC27232a != null) {
                interfaceC27232a.mo66402n1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public /* synthetic */ void m88294v() {
        this.f83697F = this.f83725s.getLeft();
        this.f83696E = this.f83725s.getTop();
        this.f83695D = this.f83725s.getBottom();
    }

    /* renamed from: A */
    public void m88295A() {
        if (this.f83725s.getBottom() <= 0) {
            return;
        }
        this.f83705N = true;
        this.f83724r.m117513a();
        this.f83699H = 0;
        this.f83700I = 0;
        this.f83697F = 0;
        this.f83696E = 0;
        this.f83695D = 0;
        this.f83702K = 0.0f;
        this.f83701J = 0.0f;
        this.f83704M = false;
        AbstractC1579n0.m7845W0(this.f83725s, 1.0f);
        AbstractC1579n0.m7847X0(this.f83725s, 1.0f);
        AbstractC1579n0.m7869f1(this.f83725s, 0.0f);
        AbstractC1579n0.m7839T0(this.f83725s, 0.0f);
        AbstractC1579n0.m7841U0(this.f83725s, 0.0f);
        AbstractC1579n0.m7805C0(this.f83725s, 1.0f);
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(this.f83694C);
        }
        InterfaceC27232a interfaceC27232a = this.f83726t;
        if (interfaceC27232a != null) {
            interfaceC27232a.mo66401hE();
        }
    }

    /* renamed from: B */
    public boolean m88296B(MotionEvent motionEvent, float f11, boolean z11) {
        if (Math.abs(f11) < 10.0f && motionEvent.getAction() != 2 && z11) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    void m88297c(MotionEvent motionEvent, boolean z11) {
        InterfaceC27232a interfaceC27232a;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float x11 = motionEvent.getX() - this.f83723q;
                if (m88296B(motionEvent, x11, z11)) {
                    if (m88311r() && this.f83732z) {
                        m88313w();
                    } else if (m88309p() && this.f83692A) {
                        m88314x();
                    }
                }
                if (Math.abs(x11) < 10.0f && (interfaceC27232a = this.f83726t) != null) {
                    if (z11) {
                        interfaceC27232a.mo66397H5();
                    } else {
                        interfaceC27232a.mo66400g7();
                    }
                }
                this.f83710S = false;
                this.f83712U = true;
                return;
            }
            return;
        }
        this.f83723q = motionEvent.getX();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!isInEditMode() && this.f83724r.m117518n(true)) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: d */
    MotionEvent m88298d(MotionEvent motionEvent, int i11) {
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i11, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    /* renamed from: e */
    public void m88299e() {
        if (this.f83724r.m117511P(this.f83725s, -this.f83699H, (int) this.f83701J)) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: f */
    public void m88300f() {
        if (this.f83724r.m117511P(this.f83725s, this.f83697F, (int) this.f83701J)) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: g */
    public void m88301g() {
        if (this.f83721g0) {
            C22712c c22712c = this.f83724r;
            View view = this.f83725s;
            if (c22712c.m117511P(view, view.getLeft(), -this.f83725s.getMeasuredHeight())) {
                AbstractC1579n0.m7898r0(this);
            }
        }
    }

    public int getDragViewId() {
        return this.f83731y;
    }

    /* renamed from: h */
    void m88302h(MotionEvent motionEvent, MotionEvent... motionEventArr) {
        if (motionEvent == null) {
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                if (rect.contains((int) obtainNoHistory.getX(), (int) obtainNoHistory.getY())) {
                    float f11 = -childAt.getLeft();
                    float f12 = -childAt.getTop();
                    boolean z11 = false;
                    if (motionEventArr != null) {
                        boolean z12 = false;
                        for (MotionEvent motionEvent2 : motionEventArr) {
                            if (motionEvent2 != null) {
                                MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(motionEvent2);
                                obtainNoHistory2.offsetLocation(f11, f12);
                                z12 |= childAt.dispatchTouchEvent(obtainNoHistory2);
                            }
                        }
                        z11 = z12;
                    }
                    obtainNoHistory.offsetLocation(f11, f12);
                    if ((childAt.dispatchTouchEvent(obtainNoHistory) | z11) != 0) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: i */
    void m88303i(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC26127c.draggable_view);
        this.f83693B = obtainStyledAttributes.getBoolean(AbstractC26127c.draggable_view_enable_minimized_horizontal_alpha_effect, true);
        this.f83732z = obtainStyledAttributes.getBoolean(AbstractC26127c.draggable_view_enable_click_to_maximize_view, true);
        this.f83692A = obtainStyledAttributes.getBoolean(AbstractC26127c.draggable_view_enable_click_to_minimize_view, false);
        this.f83729w = obtainStyledAttributes.getDimensionPixelSize(AbstractC26127c.draggable_view_top_view_margin_bottom, 30);
        this.f83730x = obtainStyledAttributes.getDimensionPixelSize(AbstractC26127c.draggable_view_top_view_margin_right, 30);
        this.f83731y = obtainStyledAttributes.getResourceId(AbstractC26127c.draggable_view_top_view_id, AbstractC26126b.drag_view);
        this.f83707P = obtainStyledAttributes.getResourceId(AbstractC26127c.draggable_view_drag_view_background, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    public boolean m88304j() {
        View view;
        if (!m88305k() && !m88306l() && ((view = this.f83725s) == null || view.getBottom() > 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m88305k() {
        View view = this.f83725s;
        if (view == null || view.getRight() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m88306l() {
        View view = this.f83725s;
        if (view == null || view.getLeft() < getWidth()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m88307m() {
        if (Math.abs(AbstractC1579n0.m7846X(this.f83725s) - ((((getHeight() - (this.f83725s.getHeight() * this.f83728v)) - this.f83729w) - f83691h0) - getPaddingBottom())) <= 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m88308n() {
        if (Math.abs(AbstractC1579n0.m7844W(this.f83725s) - ((((((getWidth() - this.f83697F) - (this.f83725s.getWidth() * this.f83727u)) - this.f83730x) - f83691h0) - getPaddingRight()) + (this.f83725s.getPaddingRight() * AbstractC1579n0.m7826N(this.f83725s)))) <= 1.0f) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i11;
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background != null && (i11 = this.f83708Q) != this.f83694C) {
            background.setAlpha(i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha(this.f83694C);
        }
        Drawable drawable = this.f83706O;
        if (drawable != null) {
            drawable.setAlpha(255);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f83701J > this.f83696E) {
            Drawable drawable = this.f83706O;
            if (drawable != null) {
                drawable.setBounds((int) this.f83715a0, (int) this.f83716b0, (int) this.f83717c0, (int) this.f83718d0);
                this.f83706O.setAlpha((int) (this.f83719e0 * 255.0f));
                this.f83706O.draw(canvas);
            } else {
                this.f83714W.setAlpha((int) (this.f83719e0 * 255.0f));
                canvas.drawRect(this.f83715a0, this.f83716b0, this.f83717c0, this.f83718d0, this.f83714W);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            setWillNotDraw(false);
            this.f83714W.setColor(-1);
            this.f83725s = findViewById(this.f83731y);
            if (this.f83707P != 0) {
                if (Build.VERSION.SDK_INT >= 22) {
                    this.f83706O = getContext().getResources().getDrawable(this.f83707P, getContext().getTheme());
                } else {
                    this.f83706O = getContext().getResources().getDrawable(this.f83707P);
                }
            }
            Drawable background = getBackground();
            if (background != null) {
                background.setAlpha(this.f83694C);
            }
            this.f83725s.post(new Runnable() { // from class: uc0.b
                public /* synthetic */ RunnableC27233b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DraggableView.this.m88293u();
                }
            });
            this.f83724r = C22712c.m117493o(this, 1.0f, new C27235d(this, this.f83725s));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C22712c c22712c;
        boolean z11;
        try {
            if (isEnabled() && (c22712c = this.f83724r) != null) {
                if (c22712c != null && c22712c.m117501A() == 2) {
                    return true;
                }
                int m8275c = AbstractC1622z.m8275c(motionEvent) & 255;
                if (m8275c != 0) {
                    if (m8275c == 1 || m8275c == 3) {
                        this.f83724r.m117514b();
                        return false;
                    }
                } else {
                    this.f83722p = AbstractC1622z.m8276d(motionEvent, AbstractC1622z.m8274b(motionEvent));
                    this.f83709R = motionEvent.getY();
                    if (this.f83722p == -1) {
                        return false;
                    }
                }
                if (!this.f83724r.m117504E(this.f83725s, (int) motionEvent.getX(), (int) motionEvent.getY()) && !m88309p()) {
                    z11 = false;
                    this.f83710S = z11;
                    if ((this.f83724r.m117510O(motionEvent) && !z11) || this.f83698G) {
                        return false;
                    }
                    return true;
                }
                z11 = true;
                this.f83710S = z11;
                if (this.f83724r.m117510O(motionEvent)) {
                }
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f83698G = true;
        if (isInEditMode()) {
            super.onLayout(z11, i11, i12, i13, i14);
        } else {
            this.f83699H = getMeasuredWidth();
            this.f83700I = getMeasuredHeight();
            if (this.f83705N) {
                this.f83705N = false;
                super.onLayout(z11, i11, i12, i13, i14);
            } else if (this.f83695D != 0) {
                invalidate();
                if (m88309p()) {
                    int i15 = this.f83696E;
                    float f11 = this.f83701J;
                    if (f11 < i15 && this.f83704M) {
                        i15 = (int) f11;
                    }
                    AbstractC1579n0.m7872g1(this.f83725s, i15);
                    AbstractC1579n0.m7869f1(this.f83725s, this.f83697F);
                    View view = this.f83725s;
                    int i16 = this.f83697F;
                    view.layout(i16, i15, this.f83699H + i16, this.f83700I + i15);
                } else if (AbstractC1579n0.m7826N(this.f83725s) == 1.0f && AbstractC1579n0.m7828O(this.f83725s) == 1.0f) {
                    super.onLayout(z11, i11, i12, i13, i14);
                    AbstractC1579n0.m7869f1(this.f83725s, r5.getLeft());
                    AbstractC1579n0.m7872g1(this.f83725s, r5.getTop());
                } else {
                    float f12 = this.f83701J;
                    if (f12 != 0.0f) {
                        AbstractC1579n0.m7872g1(this.f83725s, f12);
                        if (m88307m() && !m88308n()) {
                            View view2 = this.f83725s;
                            float f13 = this.f83703L;
                            float f14 = this.f83701J;
                            view2.layout((int) f13, (int) f14, this.f83699H + ((int) f13), ((int) f14) + this.f83700I);
                        } else {
                            View view3 = this.f83725s;
                            float f15 = this.f83701J;
                            view3.layout(i11, (int) f15, i13, ((int) f15) + this.f83700I);
                        }
                    } else {
                        super.onLayout(z11, i11, i12, i13, i14);
                        AbstractC1579n0.m7869f1(this.f83725s, r5.getLeft());
                        AbstractC1579n0.m7872g1(this.f83725s, r5.getTop());
                    }
                }
                AbstractC1579n0.m7839T0(this.f83725s, 0.0f);
                AbstractC1579n0.m7841U0(this.f83725s, 0.0f);
            } else {
                super.onLayout(z11, i11, i12, i13, i14);
            }
        }
        this.f83698G = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        View.MeasureSpec.getSize(i11);
        View.MeasureSpec.getSize(i12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            C22712c c22712c = this.f83724r;
            if (c22712c != null && c22712c.m117501A() == 2) {
                return true;
            }
            int m8275c = AbstractC1622z.m8275c(motionEvent);
            if ((m8275c & 255) == 0) {
                this.f83722p = AbstractC1622z.m8276d(motionEvent, m8275c);
            }
            if (this.f83722p == -1) {
                return false;
            }
            if (m88307m()) {
                this.f83724r.m117505F(motionEvent);
            } else if (m8275c == 0) {
                this.f83709R = motionEvent.getY();
                this.f83724r.m117505F(motionEvent);
            } else if (m8275c == 2) {
                if (Math.abs(motionEvent.getY() - this.f83709R) >= 10.0f && (this.f83721g0 || motionEvent.getY() - this.f83709R >= 0.0f || !m88309p())) {
                    this.f83724r.m117505F(motionEvent);
                }
            } else {
                this.f83724r.m117505F(motionEvent);
            }
            if (m88304j()) {
                return false;
            }
            boolean m88312s = m88312s(this.f83725s, (int) motionEvent.getX(), (int) motionEvent.getY());
            m88297c(motionEvent, m88312s);
            if (!m88311r()) {
                m88302h(motionEvent, new MotionEvent[0]);
            } else {
                m88302h(m88298d(motionEvent, 3), new MotionEvent[0]);
            }
            if (!m88312s) {
                if (!m88309p()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: p */
    public boolean m88309p() {
        if (this.f83725s.getBottom() > this.f83695D && (AbstractC1579n0.m7826N(this.f83725s) != 1.0f || AbstractC1579n0.m7828O(this.f83725s) != 1.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public boolean m88310q() {
        if (this.f83725s.getTop() < getHeight() * 0.6f) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m88311r() {
        if (this.f83725s == null) {
            return false;
        }
        if ((!m88307m() || !m88308n()) && (AbstractC1579n0.m7826N(this.f83725s) != this.f83727u || AbstractC1579n0.m7828O(this.f83725s) != this.f83728v)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    boolean m88312s(View view, int i11, int i12) {
        int i13;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i14 = iArr2[0] + i11;
        int i15 = iArr2[1] + i12;
        int i16 = iArr[0];
        if (i14 < i16 || i14 >= i16 + view.getWidth() || i15 < (i13 = iArr[1]) || i15 >= i13 + (view.getHeight() * AbstractC1579n0.m7828O(this.f83725s))) {
            return false;
        }
        return true;
    }

    public void setAllowDrag(boolean z11) {
        this.f83720f0 = z11;
    }

    public void setDraggableListener(InterfaceC27232a interfaceC27232a) {
        this.f83726t = interfaceC27232a;
    }

    public void setMinimizeScale(float f11) {
        this.f83713V = f11;
        this.f83727u = f11;
        this.f83728v = f11;
    }

    /* renamed from: w */
    public void m88313w() {
        try {
            int i11 = this.f83697F;
            int i12 = this.f83696E;
            this.f83712U = true;
            if (this.f83724r.m117511P(this.f83725s, i11, i12)) {
                AbstractC1579n0.m7898r0(this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public void m88314x() {
        try {
            int i11 = this.f83697F;
            int height = (int) ((((getHeight() - (this.f83725s.getHeight() * this.f83728v)) - this.f83729w) - f83691h0) - getPaddingBottom());
            if (!m88308n() && m88307m()) {
                height = (int) this.f83701J;
            }
            if (!this.f83710S) {
                this.f83710S = true;
            }
            if (this.f83724r.m117511P(this.f83725s, i11, height)) {
                AbstractC1579n0.m7898r0(this);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public void m88315y(int i11, int i12, int i13, int i14) {
        InterfaceC27232a interfaceC27232a;
        int i15;
        InterfaceC27232a interfaceC27232a2;
        InterfaceC27232a interfaceC27232a3;
        this.f83704M = true;
        if (Math.abs(i12 - this.f83696E) > 10 && (interfaceC27232a3 = this.f83726t) != null && this.f83710S) {
            this.f83712U = true;
            interfaceC27232a3.mo66399f2();
        }
        float height = (((getHeight() - (this.f83725s.getHeight() * this.f83728v)) - this.f83729w) - f83691h0) - getPaddingBottom();
        int i16 = this.f83696E;
        float f11 = height - i16;
        float f12 = i12 - i16;
        float f13 = i12;
        AbstractC1579n0.m7872g1(this.f83725s, f13);
        this.f83701J = f13;
        float f14 = 1.0f;
        if (m88307m() && i14 == 0) {
            this.f83703L = this.f83725s.getLeft();
            float abs = 1.0f - (Math.abs(this.f83725s.getLeft()) / getWidth());
            if (abs == 0.0f) {
                abs = 1.0f;
            }
            if (!m88308n()) {
                f14 = abs;
            }
            AbstractC1579n0.m7805C0(this.f83725s, f14);
            float f15 = f83691h0;
            this.f83715a0 = (this.f83703L + this.f83702K) - f15;
            this.f83716b0 = this.f83701J - f15;
            float f16 = f15 * 2.0f;
            this.f83717c0 = (AbstractC1579n0.m7826N(this.f83725s) * this.f83699H) + this.f83715a0 + f16;
            this.f83718d0 = (AbstractC1579n0.m7828O(this.f83725s) * this.f83700I) + this.f83716b0 + f16;
            this.f83719e0 = f14;
            if (m88305k()) {
                InterfaceC27232a interfaceC27232a4 = this.f83726t;
                if (interfaceC27232a4 != null && this.f83711T) {
                    this.f83711T = false;
                    interfaceC27232a4.mo66396Gn();
                }
            } else if (m88306l() && (interfaceC27232a2 = this.f83726t) != null && this.f83711T) {
                this.f83711T = false;
                interfaceC27232a2.mo66404v7();
            }
        } else {
            this.f83703L = 0.0f;
            AbstractC1579n0.m7805C0(this.f83725s, 1.0f);
            Drawable background = getBackground();
            if (background != null) {
                int top = this.f83725s.getTop();
                int i17 = this.f83696E;
                if (top > i17) {
                    int i18 = this.f83694C;
                    i15 = i18 - ((int) (i18 * (f12 / f11)));
                } else {
                    i15 = (int) (this.f83694C * (f13 / i17));
                }
                int i19 = this.f83694C;
                if (i15 > i19) {
                    i15 = i19;
                } else if (i15 < 0) {
                    i15 = 0;
                }
                this.f83708Q = i15;
                background.setAlpha(i15);
            }
            float f17 = f12 / f11;
            float f18 = 1.0f - ((1.0f - this.f83727u) * f17);
            float f19 = 1.0f - ((1.0f - this.f83728v) * f17);
            float width = this.f83697F + (f17 * (((((getWidth() - this.f83697F) - (this.f83699H * this.f83727u)) - this.f83730x) - f83691h0) + (this.f83725s.getPaddingRight() * f18)));
            if (this.f83725s.getTop() <= this.f83696E) {
                width = this.f83697F;
                f18 = 1.0f;
                f19 = 1.0f;
            }
            this.f83702K = width;
            AbstractC1579n0.m7869f1(this.f83725s, width);
            AbstractC1579n0.m7845W0(this.f83725s, f18);
            AbstractC1579n0.m7847X0(this.f83725s, f19);
            AbstractC1579n0.m7839T0(this.f83725s, 0.0f);
            AbstractC1579n0.m7841U0(this.f83725s, 0.0f);
            int i21 = f83691h0;
            float f21 = i21 * ((this.f83727u + 1.0f) - f18);
            float f22 = (this.f83703L + this.f83702K) - f21;
            this.f83715a0 = f22;
            float f23 = this.f83701J - f21;
            this.f83716b0 = f23;
            float f24 = 2.0f * f21;
            this.f83717c0 = (this.f83699H * f18) + f22 + f24;
            this.f83718d0 = (this.f83700I * f18) + f23 + f24;
            this.f83719e0 = (f21 * 1.0f) / i21;
            InterfaceC27232a interfaceC27232a5 = this.f83726t;
            if (interfaceC27232a5 != null) {
                interfaceC27232a5.mo66395Ef(f18, f19);
            }
            if (this.f83725s.getTop() == this.f83696E) {
                InterfaceC27232a interfaceC27232a6 = this.f83726t;
                if (interfaceC27232a6 != null && this.f83712U) {
                    this.f83712U = false;
                    interfaceC27232a6.mo66403qq();
                }
            } else if (m88307m() && m88308n()) {
                InterfaceC27232a interfaceC27232a7 = this.f83726t;
                if (interfaceC27232a7 != null && this.f83712U) {
                    this.f83712U = false;
                    interfaceC27232a7.mo66405xE();
                }
            } else if (this.f83725s.getBottom() <= 0 && (interfaceC27232a = this.f83726t) != null && this.f83711T) {
                this.f83711T = false;
                interfaceC27232a.mo66398Ir();
            }
        }
        invalidate();
    }

    /* renamed from: z */
    public void m88316z() {
        if (this.f83725s.getBottom() <= 0) {
            return;
        }
        this.f83725s.post(new Runnable() { // from class: uc0.c
            public /* synthetic */ RunnableC27234c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                DraggableView.this.m88294v();
            }
        });
    }
}
