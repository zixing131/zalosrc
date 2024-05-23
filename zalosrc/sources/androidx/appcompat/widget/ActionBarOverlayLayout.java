package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1547f0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1539d0;
import androidx.core.view.InterfaceC1543e0;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19183f;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1204r0, InterfaceC1539d0, InterfaceC1543e0 {

    /* renamed from: U */
    static final int[] f4138U = {AbstractC19178a.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    private int f4139A;

    /* renamed from: B */
    private int f4140B;

    /* renamed from: C */
    private final Rect f4141C;

    /* renamed from: D */
    private final Rect f4142D;

    /* renamed from: E */
    private final Rect f4143E;

    /* renamed from: F */
    private final Rect f4144F;

    /* renamed from: G */
    private final Rect f4145G;

    /* renamed from: H */
    private final Rect f4146H;

    /* renamed from: I */
    private final Rect f4147I;

    /* renamed from: J */
    private C1580n1 f4148J;

    /* renamed from: K */
    private C1580n1 f4149K;

    /* renamed from: L */
    private C1580n1 f4150L;

    /* renamed from: M */
    private C1580n1 f4151M;

    /* renamed from: N */
    private InterfaceC1085d f4152N;

    /* renamed from: O */
    private OverScroller f4153O;

    /* renamed from: P */
    ViewPropertyAnimator f4154P;

    /* renamed from: Q */
    final AnimatorListenerAdapter f4155Q;

    /* renamed from: R */
    private final Runnable f4156R;

    /* renamed from: S */
    private final Runnable f4157S;

    /* renamed from: T */
    private final C1547f0 f4158T;

    /* renamed from: p */
    private int f4159p;

    /* renamed from: q */
    private int f4160q;

    /* renamed from: r */
    private ContentFrameLayout f4161r;

    /* renamed from: s */
    ActionBarContainer f4162s;

    /* renamed from: t */
    private InterfaceC1207s0 f4163t;

    /* renamed from: u */
    private Drawable f4164u;

    /* renamed from: v */
    private boolean f4165v;

    /* renamed from: w */
    private boolean f4166w;

    /* renamed from: x */
    private boolean f4167x;

    /* renamed from: y */
    private boolean f4168y;

    /* renamed from: z */
    boolean f4169z;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes2.dex */
    class C1082a extends AnimatorListenerAdapter {
        C1082a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4154P = null;
            actionBarOverlayLayout.f4169z = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4154P = null;
            actionBarOverlayLayout.f4169z = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes2.dex */
    class RunnableC1083b implements Runnable {
        RunnableC1083b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m5185w();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4154P = actionBarOverlayLayout.f4162s.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f4155Q);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes2.dex */
    class RunnableC1084c implements Runnable {
        RunnableC1084c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m5185w();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4154P = actionBarOverlayLayout.f4162s.animate().translationY(-ActionBarOverlayLayout.this.f4162s.getHeight()).setListener(ActionBarOverlayLayout.this.f4155Q);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1085d {
        /* renamed from: a */
        void mo4944a();

        /* renamed from: b */
        void mo4945b();

        /* renamed from: c */
        void mo4946c(boolean z11);

        /* renamed from: d */
        void mo4947d();

        /* renamed from: e */
        void mo4948e();

        void onWindowVisibilityChanged(int i11);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4160q = 0;
        this.f4141C = new Rect();
        this.f4142D = new Rect();
        this.f4143E = new Rect();
        this.f4144F = new Rect();
        this.f4145G = new Rect();
        this.f4146H = new Rect();
        this.f4147I = new Rect();
        C1580n1 c1580n1 = C1580n1.f6524b;
        this.f4148J = c1580n1;
        this.f4149K = c1580n1;
        this.f4150L = c1580n1;
        this.f4151M = c1580n1;
        this.f4155Q = new C1082a();
        this.f4156R = new RunnableC1083b();
        this.f4157S = new RunnableC1084c();
        m5165x(context);
        this.f4158T = new C1547f0(this);
    }

    /* renamed from: A */
    private void m5159A() {
        m5185w();
        postDelayed(this.f4156R, 600L);
    }

    /* renamed from: C */
    private void m5160C() {
        m5185w();
        this.f4156R.run();
    }

    /* renamed from: D */
    private boolean m5161D(float f11) {
        this.f4153O.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4153O.getFinalY() > this.f4162s.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m5162m() {
        m5185w();
        this.f4157S.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m5163n(View view, Rect rect, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z11) {
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i12 = rect.left;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i12;
                z15 = true;
                if (z12) {
                    int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    int i14 = rect.top;
                    if (i13 != i14) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i14;
                        z15 = true;
                    }
                }
                if (z14) {
                    int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    int i16 = rect.right;
                    if (i15 != i16) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i16;
                        z15 = true;
                    }
                }
                if (z13) {
                    int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    int i18 = rect.bottom;
                    if (i17 != i18) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i18;
                        return true;
                    }
                }
                return z15;
            }
        }
        z15 = false;
        if (z12) {
        }
        if (z14) {
        }
        if (z13) {
        }
        return z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private InterfaceC1207s0 m5164u(View view) {
        if (view instanceof InterfaceC1207s0) {
            return (InterfaceC1207s0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: x */
    private void m5165x(Context context) {
        boolean z11;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4138U);
        boolean z12 = false;
        this.f4159p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4164u = drawable;
        if (drawable == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z12 = true;
        }
        this.f4165v = z12;
        this.f4153O = new OverScroller(context);
    }

    /* renamed from: z */
    private void m5166z() {
        m5185w();
        postDelayed(this.f4157S, 600L);
    }

    /* renamed from: B */
    void m5167B() {
        if (this.f4161r == null) {
            this.f4161r = (ContentFrameLayout) findViewById(AbstractC19183f.action_bar_activity_content);
            this.f4162s = (ActionBarContainer) findViewById(AbstractC19183f.action_bar_container);
            this.f4163t = m5164u(findViewById(AbstractC19183f.action_bar));
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: a */
    public boolean mo5168a() {
        m5167B();
        return this.f4163t.mo5691a();
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: b */
    public boolean mo5169b() {
        m5167B();
        return this.f4163t.mo5692b();
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: c */
    public boolean mo5170c() {
        m5167B();
        return this.f4163t.mo5693c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: d */
    public void mo5171d(Menu menu, InterfaceC1077j.a aVar) {
        m5167B();
        this.f4163t.mo5694d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i11;
        super.draw(canvas);
        if (this.f4164u != null && !this.f4165v) {
            if (this.f4162s.getVisibility() == 0) {
                i11 = (int) (this.f4162s.getBottom() + this.f4162s.getTranslationY() + 0.5f);
            } else {
                i11 = 0;
            }
            this.f4164u.setBounds(0, i11, getWidth(), this.f4164u.getIntrinsicHeight() + i11);
            this.f4164u.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: e */
    public boolean mo5172e() {
        m5167B();
        return this.f4163t.mo5695e();
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: f */
    public void mo5173f() {
        m5167B();
        this.f4163t.mo5696f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: g */
    public boolean mo5174g() {
        m5167B();
        return this.f4163t.mo5697g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4162s;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4158T.m7761a();
    }

    public CharSequence getTitle() {
        m5167B();
        return this.f4163t.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: h */
    public void mo5175h(int i11) {
        m5167B();
        if (i11 != 2) {
            if (i11 != 5) {
                if (i11 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f4163t.mo5710t();
            return;
        }
        this.f4163t.mo5704n();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
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

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    /* renamed from: l */
    public void mo5179l() {
        m5167B();
        this.f4163t.mo5706p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:            if (r0 != false) goto L9;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m5167B();
        C1580n1 m8047y = C1580n1.m8047y(windowInsets);
        boolean m5163n = m5163n(this.f4162s, new Rect(m8047y.m8059k(), m8047y.m8061m(), m8047y.m8060l(), m8047y.m8058j()), true, true, false, true);
        AbstractC1579n0.m7876i(this, m8047y, this.f4141C);
        Rect rect = this.f4141C;
        C1580n1 m8063o = m8047y.m8063o(rect.left, rect.top, rect.right, rect.bottom);
        this.f4148J = m8063o;
        if (!this.f4149K.equals(m8063o)) {
            this.f4149K = this.f4148J;
            m5163n = true;
        }
        if (!this.f4142D.equals(this.f4141C)) {
            this.f4142D.set(this.f4141C);
        }
        requestLayout();
        return m8047y.m8049a().m8051c().m8050b().m8071x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m5165x(getContext());
        AbstractC1579n0.m7910x0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5185w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        int measuredHeight;
        m5167B();
        measureChildWithMargins(this.f4162s, i11, 0, i12, 0);
        LayoutParams layoutParams = (LayoutParams) this.f4162s.getLayoutParams();
        int max = Math.max(0, this.f4162s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f4162s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4162s.getMeasuredState());
        if ((AbstractC1579n0.m7842V(this) & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            measuredHeight = this.f4159p;
            if (this.f4167x && this.f4162s.getTabContainer() != null) {
                measuredHeight += this.f4159p;
            }
        } else {
            measuredHeight = this.f4162s.getVisibility() != 8 ? this.f4162s.getMeasuredHeight() : 0;
        }
        this.f4143E.set(this.f4141C);
        C1580n1 c1580n1 = this.f4148J;
        this.f4150L = c1580n1;
        if (!this.f4166w && !z11) {
            Rect rect = this.f4143E;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f4150L = c1580n1.m8063o(0, measuredHeight, 0, 0);
        } else {
            this.f4150L = new C1580n1.b(this.f4150L).m8076d(C1421e.m7230b(c1580n1.m8059k(), this.f4150L.m8061m() + measuredHeight, this.f4150L.m8060l(), this.f4150L.m8058j())).m8073a();
        }
        m5163n(this.f4161r, this.f4143E, true, true, true, true);
        if (!this.f4151M.equals(this.f4150L)) {
            C1580n1 c1580n12 = this.f4150L;
            this.f4151M = c1580n12;
            AbstractC1579n0.m7879j(this.f4161r, c1580n12);
        }
        measureChildWithMargins(this.f4161r, i11, 0, i12, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f4161r.getLayoutParams();
        int max3 = Math.max(max, this.f4161r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f4161r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4161r.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (this.f4168y && z11) {
            if (m5161D(f12)) {
                m5162m();
            } else {
                m5160C();
            }
            this.f4169z = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        int i15 = this.f4139A + i12;
        this.f4139A = i15;
        setActionBarHideOffset(i15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f4158T.m7762b(view, view2, i11);
        this.f4139A = getActionBarHideOffset();
        m5185w();
        InterfaceC1085d interfaceC1085d = this.f4152N;
        if (interfaceC1085d != null) {
            interfaceC1085d.mo4948e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) != 0 && this.f4162s.getVisibility() == 0) {
            return this.f4168y;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f4168y && !this.f4169z) {
            if (this.f4139A <= this.f4162s.getHeight()) {
                m5159A();
            } else {
                m5166z();
            }
        }
        InterfaceC1085d interfaceC1085d = this.f4152N;
        if (interfaceC1085d != null) {
            interfaceC1085d.mo4945b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i11) {
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i11);
        m5167B();
        int i12 = this.f4140B ^ i11;
        this.f4140B = i11;
        boolean z12 = false;
        if ((i11 & 4) == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i11 & 256) != 0) {
            z12 = true;
        }
        InterfaceC1085d interfaceC1085d = this.f4152N;
        if (interfaceC1085d != null) {
            interfaceC1085d.mo4946c(!z12);
            if (!z11 && z12) {
                this.f4152N.mo4947d();
            } else {
                this.f4152N.mo4944a();
            }
        }
        if ((i12 & 256) != 0 && this.f4152N != null) {
            AbstractC1579n0.m7910x0(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f4160q = i11;
        InterfaceC1085d interfaceC1085d = this.f4152N;
        if (interfaceC1085d != null) {
            interfaceC1085d.onWindowVisibilityChanged(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        mo5183s(view, i11, i12, i13, i14, i15);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    public void setActionBarHideOffset(int i11) {
        m5185w();
        this.f4162s.setTranslationY(-Math.max(0, Math.min(i11, this.f4162s.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1085d interfaceC1085d) {
        this.f4152N = interfaceC1085d;
        if (getWindowToken() != null) {
            this.f4152N.onWindowVisibilityChanged(this.f4160q);
            int i11 = this.f4140B;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                AbstractC1579n0.m7910x0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z11) {
        this.f4167x = z11;
    }

    public void setHideOnContentScrollEnabled(boolean z11) {
        if (z11 != this.f4168y) {
            this.f4168y = z11;
            if (!z11) {
                m5185w();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i11) {
        m5167B();
        this.f4163t.setIcon(i11);
    }

    public void setLogo(int i11) {
        m5167B();
        this.f4163t.mo5708r(i11);
    }

    public void setOverlayMode(boolean z11) {
        boolean z12;
        this.f4166w = z11;
        if (z11 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f4165v = z12;
    }

    public void setShowingForActionMode(boolean z11) {
    }

    public void setUiOptions(int i11) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    public void setWindowCallback(Window.Callback callback) {
        m5167B();
        this.f4163t.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC1204r0
    public void setWindowTitle(CharSequence charSequence) {
        m5167B();
        this.f4163t.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        if (i12 == 0 && onStartNestedScroll(view, view2, i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    void m5185w() {
        removeCallbacks(this.f4156R);
        removeCallbacks(this.f4157S);
        ViewPropertyAnimator viewPropertyAnimator = this.f4154P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: y */
    public boolean m5186y() {
        return this.f4166w;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m5167B();
        this.f4163t.setIcon(drawable);
    }
}
