package com.zing.zalo.p077ui.widget.springback;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1535c0;
import androidx.core.view.C1547f0;
import androidx.core.view.InterfaceC1491a0;
import androidx.core.view.InterfaceC1543e0;
import androidx.core.widget.AbstractC1634f;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class HorizontalNestedScrollView extends FrameLayout implements InterfaceC1491a0, InterfaceC1543e0 {

    /* renamed from: A */
    private final InterfaceC24854k f71308A;

    /* renamed from: B */
    private int f71309B;

    /* renamed from: C */
    private int f71310C;

    /* renamed from: D */
    private boolean f71311D;

    /* renamed from: E */
    private int f71312E;

    /* renamed from: F */
    private int f71313F;

    /* renamed from: G */
    private long f71314G;

    /* renamed from: p */
    private final int f71315p;

    /* renamed from: q */
    private final InterfaceC24854k f71316q;

    /* renamed from: r */
    private final InterfaceC24854k f71317r;

    /* renamed from: s */
    private final InterfaceC24854k f71318s;

    /* renamed from: t */
    private final InterfaceC24854k f71319t;

    /* renamed from: u */
    private final InterfaceC24854k f71320u;

    /* renamed from: v */
    private VelocityTracker f71321v;

    /* renamed from: w */
    private final InterfaceC24854k f71322w;

    /* renamed from: x */
    private final InterfaceC24854k f71323x;

    /* renamed from: y */
    private final boolean f71324y;

    /* renamed from: z */
    private final InterfaceC24854k f71325z;

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$a */
    /* loaded from: classes6.dex */
    static final class C13780a extends AbstractC19075u implements InterfaceC18494a {
        C13780a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1535c0 mo12V4() {
            C1535c0 c1535c0 = new C1535c0(HorizontalNestedScrollView.this);
            c1535c0.m7724m(true);
            return c1535c0;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$b */
    /* loaded from: classes6.dex */
    static final class C13781b extends AbstractC19075u implements InterfaceC18494a {
        C13781b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EdgeEffect mo12V4() {
            return new EdgeEffect(HorizontalNestedScrollView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$c */
    /* loaded from: classes6.dex */
    static final class C13782c extends AbstractC19075u implements InterfaceC18494a {
        C13782c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EdgeEffect mo12V4() {
            return new EdgeEffect(HorizontalNestedScrollView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$d */
    /* loaded from: classes6.dex */
    static final class C13783d extends AbstractC19075u implements InterfaceC18494a {
        C13783d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(HorizontalNestedScrollView.this.getViewConfiguration().getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$e */
    /* loaded from: classes6.dex */
    static final class C13784e extends AbstractC19075u implements InterfaceC18494a {
        C13784e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(HorizontalNestedScrollView.this.getViewConfiguration().getScaledMinimumFlingVelocity());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$f */
    /* loaded from: classes6.dex */
    static final class C13785f extends AbstractC19075u implements InterfaceC18494a {
        C13785f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1547f0 mo12V4() {
            C1547f0 c1547f0 = new C1547f0(HorizontalNestedScrollView.this);
            HorizontalNestedScrollView.this.setNestedScrollingEnabled(true);
            return c1547f0;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$g */
    /* loaded from: classes6.dex */
    static final class C13786g extends AbstractC19075u implements InterfaceC18494a {
        C13786g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OverScroller mo12V4() {
            return new OverScroller(HorizontalNestedScrollView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$h */
    /* loaded from: classes6.dex */
    static final class C13787h extends AbstractC19075u implements InterfaceC18494a {
        C13787h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(HorizontalNestedScrollView.this.getViewConfiguration().getScaledTouchSlop());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.springback.HorizontalNestedScrollView$i */
    /* loaded from: classes6.dex */
    static final class C13788i extends AbstractC19075u implements InterfaceC18494a {
        C13788i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewConfiguration mo12V4() {
            return ViewConfiguration.get(HorizontalNestedScrollView.this.getContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalNestedScrollView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        AbstractC19074t.m100208f(context, "context");
        this.f71315p = 250;
        m129210a = AbstractC24856m.m129210a(new C13788i());
        this.f71316q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13787h());
        this.f71317r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13784e());
        this.f71318s = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C13783d());
        this.f71319t = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C13786g());
        this.f71320u = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C13782c());
        this.f71322w = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C13781b());
        this.f71323x = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C13785f());
        this.f71325z = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C13780a());
        this.f71308A = m129210a9;
        this.f71309B = -1;
        this.f71310C = -1;
        m76976h();
    }

    /* renamed from: a */
    private final void m76972a() {
        getScroller().abortAnimation();
    }

    /* renamed from: e */
    private final void m76974e() {
        this.f71309B = -1;
        this.f71310C = -1;
        this.f71311D = false;
        m76980q();
        getEdgeGlowStart().onRelease();
        getEdgeGlowEnd().onRelease();
        m76983A(0);
    }

    /* renamed from: g */
    private final boolean m76975g(int i11, int i12) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollX = getScrollX();
        View childAt = getChildAt(0);
        if (i12 < childAt.getTop() || i12 >= childAt.getBottom() || i11 < childAt.getLeft() - scrollX || i11 >= childAt.getRight() - scrollX) {
            return false;
        }
        return true;
    }

    private final C1535c0 getChildHelper() {
        return (C1535c0) this.f71308A.getValue();
    }

    private final EdgeEffect getEdgeGlowEnd() {
        return (EdgeEffect) this.f71323x.getValue();
    }

    private final EdgeEffect getEdgeGlowStart() {
        return (EdgeEffect) this.f71322w.getValue();
    }

    private final int getMaxVelocity() {
        return ((Number) this.f71319t.getValue()).intValue();
    }

    private final int getMinVelocity() {
        return ((Number) this.f71318s.getValue()).intValue();
    }

    private final C1547f0 getParentHelper() {
        return (C1547f0) this.f71325z.getValue();
    }

    private final OverScroller getScroller() {
        return (OverScroller) this.f71320u.getValue();
    }

    private final int getTouchSlop() {
        return ((Number) this.f71317r.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewConfiguration getViewConfiguration() {
        Object value = this.f71316q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ViewConfiguration) value;
    }

    /* renamed from: h */
    private final void m76976h() {
        setClickable(true);
        setFocusable(true);
        setWillNotDraw(false);
    }

    /* renamed from: l */
    private final void m76977l() {
        VelocityTracker velocityTracker = this.f71321v;
        if (velocityTracker == null) {
            this.f71321v = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: m */
    private final void m76978m() {
        if (this.f71321v == null) {
            this.f71321v = VelocityTracker.obtain();
        }
    }

    /* renamed from: n */
    private final void m76979n(int i11, int i12, int[] iArr) {
        int scrollX = getScrollX();
        m76987p(i11, getScrollX(), getScrollRangeX());
        int scrollX2 = getScrollX() - scrollX;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
        }
        getChildHelper().m7719e(scrollX2, 0, i11 - scrollX2, 0, null, i12, iArr);
    }

    /* renamed from: q */
    private final void m76980q() {
        VelocityTracker velocityTracker = this.f71321v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f71321v = null;
    }

    /* renamed from: u */
    private final void m76981u(boolean z11) {
        if (z11) {
            m76990z(1, 1);
        } else {
            m76983A(1);
        }
        this.f71312E = getScrollX();
        AbstractC1579n0.m7898r0(this);
    }

    /* renamed from: x */
    public static /* synthetic */ void m76982x(HorizontalNestedScrollView horizontalNestedScrollView, int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = 250;
        }
        if ((i14 & 8) != 0) {
            z11 = false;
        }
        horizontalNestedScrollView.m76988w(i11, i12, i13, z11);
    }

    /* renamed from: A */
    public void m76983A(int i11) {
        getChildHelper().m7728r(i11);
    }

    /* renamed from: c */
    public boolean m76984c(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getChildHelper().m7718d(i11, i12, iArr, iArr2, i13);
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        if (getChildCount() <= 1) {
            int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
            if (getChildCount() == 0) {
                return width;
            }
            View childAt = getChildAt(0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            int right = childAt.getRight();
            if (marginLayoutParams != null) {
                i11 = marginLayoutParams.getMarginEnd();
            } else {
                i11 = 0;
            }
            int i12 = right + i11;
            int max = Math.max(0, i12 - width);
            int scrollX = getScrollX();
            if (scrollX < 0) {
                return i12 - scrollX;
            }
            if (scrollX > max) {
                return i12 + (scrollX - max);
            }
            return i12;
        }
        throw new IllegalStateException("HorizontalNestedScrollView only support one child.".toString());
    }

    @Override // android.view.View
    public void computeScroll() {
        int i11;
        if (getScroller().isFinished()) {
            return;
        }
        getScroller().computeScrollOffset();
        int currX = getScroller().getCurrX();
        int i12 = currX - this.f71312E;
        this.f71312E = currX;
        int[] iArr = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr[i13] = 0;
        }
        if (m76984c(i12, 0, iArr, null, 1)) {
            i11 = i12 - iArr[0];
        } else {
            i11 = i12;
        }
        if (i11 != 0) {
            int scrollX = getScrollX();
            m76987p(i12, scrollX, getScrollRangeX());
            int scrollX2 = getScrollX() - scrollX;
            int i14 = i11 - scrollX2;
            iArr[0] = 0;
            m76985d(scrollX2, 0, i14, 0, null, 1, iArr);
            i11 = i14 - iArr[0];
        }
        if (i11 < 0) {
            if (getEdgeGlowStart().isFinished()) {
                getEdgeGlowStart().onAbsorb((int) getScroller().getCurrVelocity());
            }
            m76972a();
        }
        if (i11 > 0) {
            if (getEdgeGlowEnd().isFinished()) {
                getEdgeGlowEnd().onAbsorb((int) getScroller().getCurrVelocity());
            }
            m76972a();
        }
        if (!getScroller().isFinished()) {
            AbstractC1579n0.m7898r0(this);
        } else {
            m76983A(1);
        }
    }

    /* renamed from: d */
    public void m76985d(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        AbstractC19074t.m100208f(iArr2, "consumed");
        getChildHelper().m7719e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getChildHelper().m7715a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return getChildHelper().m7716b(f11, f12);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.draw(canvas);
        if (this.f71324y) {
            if (!getEdgeGlowStart().isFinished()) {
                int save = canvas.save();
                float width = getWidth();
                float height = getHeight();
                canvas.rotate(270.0f);
                canvas.translate(-height, Math.min(0.0f, getScrollX()));
                getEdgeGlowStart().setSize((int) height, (int) width);
                if (getEdgeGlowStart().draw(canvas)) {
                    AbstractC1579n0.m7898r0(this);
                }
                canvas.restoreToCount(save);
            }
            if (!getEdgeGlowEnd().isFinished()) {
                int save2 = canvas.save();
                float width2 = getWidth();
                float height2 = getHeight();
                canvas.rotate(90.0f);
                canvas.translate(0.0f, -(Math.max(getScrollRangeX(), getScrollX()) + width2));
                getEdgeGlowEnd().setSize((int) height2, (int) width2);
                if (getEdgeGlowEnd().draw(canvas)) {
                    AbstractC1579n0.m7898r0(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: f */
    public final void m76986f(int i11) {
        if (getChildCount() > 0) {
            getScroller().fling(getScrollX(), getScrollY(), i11, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0);
            m76981u(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return getParentHelper().m7761a();
    }

    public final int getScrollRangeX() {
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return Math.max(0, ((childAt.getWidth() + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        getParentHelper().m7763c(view, view2, i11, i12);
        m76990z(1, i12);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: j */
    public void mo5177j(View view, int i11) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        getParentHelper().m7765e(view, i11);
        m76983A(i11);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(iArr, "consumed");
        m76984c(i11, i12, iArr, null, i13);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i11, int i12) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
        }
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.bottomMargin, 0), ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer num;
        Integer num2;
        Integer num3 = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        int i11 = 1;
        if (num != null && num.intValue() == 2 && this.f71311D) {
            return true;
        }
        if (num != null && num.intValue() == 0) {
            int x11 = (int) (motionEvent.getX() + 0.5d);
            if (!m76975g(x11, (int) (motionEvent.getY() + 0.5d))) {
                this.f71311D = false;
                m76980q();
            } else {
                this.f71309B = x11;
                this.f71310C = motionEvent.getPointerId(0);
                m76977l();
                VelocityTracker velocityTracker = this.f71321v;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                getScroller().computeScrollOffset();
                this.f71311D = !getScroller().isFinished();
                m76990z(1, 0);
                return this.f71311D;
            }
        } else if (num != null && num.intValue() == 2) {
            if (motionEvent.findPointerIndex(this.f71310C) != -1) {
                num2 = Integer.valueOf((int) (motionEvent.getX(r3) + 0.5d));
            } else {
                num2 = null;
            }
            if (num2 != null) {
                num3 = Integer.valueOf(Math.abs(this.f71309B - num2.intValue()));
            }
            if (num2 != null && num3 != null && num3.intValue() > getTouchSlop() && (getNestedScrollAxes() & 1) == 0) {
                this.f71311D = true;
                this.f71309B = num2.intValue();
                m76978m();
                VelocityTracker velocityTracker2 = this.f71321v;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                this.f71313F = 0;
                ViewParent parent = getParent();
                if (parent == null) {
                    return true;
                }
                parent.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            this.f71311D = false;
            this.f71310C = -1;
            m76980q();
            if (getScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRangeX(), 0, 0)) {
                AbstractC1579n0.m7898r0(this);
            }
            m76983A(0);
        } else if (num != null && num.intValue() == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.f71310C) {
                if (actionIndex != 0) {
                    i11 = 0;
                }
                this.f71310C = motionEvent.getPointerId(i11);
                this.f71309B = (int) (motionEvent.getX(i11) + 0.5d);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        if (!z11) {
            dispatchNestedFling(f11, f12, z11);
            m76986f(-((int) f11));
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f11;
        int i11;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        m76978m();
        if (motionEvent != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (motionEvent.getActionMasked() == 0) {
                f11 = 0.0f;
            } else {
                f11 = this.f71313F;
            }
            obtain.offsetLocation(f11, 0.0f);
            int actionIndex = motionEvent.getActionIndex();
            int actionMasked = motionEvent.getActionMasked();
            int i12 = 0;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked == 6 && motionEvent.getPointerId(actionIndex) == this.f71310C) {
                                    if (actionIndex == 0) {
                                        i12 = 1;
                                    }
                                    this.f71310C = motionEvent.getPointerId(i12);
                                    this.f71309B = (int) (motionEvent.getX(i12) + 0.5d);
                                }
                            } else {
                                this.f71310C = motionEvent.getPointerId(actionIndex);
                                this.f71309B = (int) (motionEvent.getX(motionEvent.findPointerIndex(r0)) + 0.5d);
                            }
                        } else {
                            if (this.f71311D && getChildCount() > 0 && getScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRangeX(), 0, 0)) {
                                AbstractC1579n0.m7898r0(this);
                            }
                            m76974e();
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f71310C);
                        int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5d);
                        int i13 = this.f71309B - x11;
                        if (!this.f71311D && Math.abs(i13) > getTouchSlop()) {
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f71311D = true;
                            i13 = i13 > 0 ? i13 - getTouchSlop() : i13 + getTouchSlop();
                        }
                        int i14 = i13;
                        if (this.f71311D) {
                            int[] iArr = new int[2];
                            for (int i15 = 0; i15 < 2; i15++) {
                                iArr[i15] = 0;
                            }
                            int[] iArr2 = new int[2];
                            for (int i16 = 0; i16 < 2; i16++) {
                                iArr2[i16] = 0;
                            }
                            if (m76984c(i14, 0, iArr, iArr2, 0)) {
                                i14 -= iArr[0];
                                this.f71313F += iArr2[0];
                            }
                            this.f71309B = x11 - iArr2[0];
                            int scrollX = getScrollX();
                            if (m76987p(i14, getScrollX(), getScrollRangeX()) && (velocityTracker = this.f71321v) != null) {
                                velocityTracker.clear();
                            }
                            int scrollX2 = getScrollX() - scrollX;
                            iArr[0] = 0;
                            int i17 = i14;
                            m76985d(scrollX2, 0, i14 - scrollX2, 0, iArr2, 0, iArr);
                            int i18 = this.f71309B;
                            int i19 = iArr2[0];
                            this.f71309B = i18 - i19;
                            this.f71313F += i19;
                            if (this.f71324y) {
                                int i21 = scrollX + i17;
                                if (i21 < 0) {
                                    AbstractC1634f.m8383c(getEdgeGlowStart(), i17 / getWidth(), 1.0f - (motionEvent.getY(findPointerIndex) / getHeight()));
                                    if (!getEdgeGlowEnd().isFinished()) {
                                        getEdgeGlowEnd().onRelease();
                                    }
                                } else if (i21 > getScrollRangeX()) {
                                    AbstractC1634f.m8383c(getEdgeGlowEnd(), i17 / getWidth(), motionEvent.getY(findPointerIndex) / getHeight());
                                    if (!getEdgeGlowStart().isFinished()) {
                                        getEdgeGlowStart().onRelease();
                                    }
                                }
                                if (!getEdgeGlowEnd().isFinished() || !getEdgeGlowStart().isFinished()) {
                                    AbstractC1579n0.m7898r0(this);
                                }
                            }
                        }
                    }
                } else {
                    VelocityTracker velocityTracker2 = this.f71321v;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000, getMaxVelocity());
                    }
                    if (velocityTracker2 != null) {
                        i12 = (int) velocityTracker2.getXVelocity(this.f71310C);
                    }
                    if (Math.abs(i12) > getMinVelocity()) {
                        float f12 = -i12;
                        if (!dispatchNestedPreFling(f12, 0.0f)) {
                            dispatchNestedFling(f12, 0.0f, true);
                            m76986f(-i12);
                        }
                    } else if (getScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRangeX(), 0, 0)) {
                        AbstractC1579n0.m7898r0(this);
                    }
                    m76974e();
                }
                z12 = true;
            } else {
                this.f71313F = 0;
                this.f71310C = motionEvent.getPointerId(actionIndex);
                this.f71309B = (int) (motionEvent.getX(motionEvent.findPointerIndex(r0)) + 0.5d);
                if (!getScroller().isFinished()) {
                    ViewParent parent2 = getParent();
                    i11 = 1;
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m76972a();
                } else {
                    i11 = 1;
                }
                if (getChildCount() == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                m76990z(i11, 0);
                z12 = z11;
            }
            VelocityTracker velocityTracker3 = this.f71321v;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(obtain);
            }
            obtain.recycle();
            return z12;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean m76987p(int i11, int i12, int i13) {
        int i14 = i11 + i12;
        if (i13 < i14) {
            scrollTo(i13, 0);
            return true;
        }
        if (i14 < 0) {
            scrollTo(0, 0);
            return true;
        }
        scrollTo(i14, 0);
        return false;
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(iArr, "consumed");
        m76979n(i13, i15, iArr);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        m76979n(i13, i15, null);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        return (i11 & 1) != 0;
    }

    /* renamed from: w */
    public final void m76988w(int i11, int i12, int i13, boolean z11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f71314G > this.f71315p) {
            View childAt = getChildAt(0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int width = childAt.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int scrollX = getScrollX();
            getScroller().startScroll(scrollX, getScrollY(), Math.max(0, Math.min(i11 + scrollX, Math.max(0, width - width2))) - scrollX, 0, i13);
            postInvalidateOnAnimation();
            m76981u(z11);
        } else {
            if (!getScroller().isFinished()) {
                getScroller().abortAnimation();
            }
            scrollBy(i11, i12);
        }
        this.f71314G = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: y */
    public final void m76989y(int i11, int i12) {
        m76982x(this, i11 - getScrollX(), i12 - getScrollY(), 0, false, 12, null);
    }

    /* renamed from: z */
    public boolean m76990z(int i11, int i12) {
        return getChildHelper().m7726p(i11, i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f71315p = 250;
        m129210a = AbstractC24856m.m129210a(new C13788i());
        this.f71316q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13787h());
        this.f71317r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13784e());
        this.f71318s = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C13783d());
        this.f71319t = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C13786g());
        this.f71320u = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C13782c());
        this.f71322w = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C13781b());
        this.f71323x = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C13785f());
        this.f71325z = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C13780a());
        this.f71308A = m129210a9;
        this.f71309B = -1;
        this.f71310C = -1;
        m76976h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalNestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        InterfaceC24854k m129210a9;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f71315p = 250;
        m129210a = AbstractC24856m.m129210a(new C13788i());
        this.f71316q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13787h());
        this.f71317r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13784e());
        this.f71318s = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C13783d());
        this.f71319t = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C13786g());
        this.f71320u = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new C13782c());
        this.f71322w = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(new C13781b());
        this.f71323x = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(new C13785f());
        this.f71325z = m129210a8;
        m129210a9 = AbstractC24856m.m129210a(new C13780a());
        this.f71308A = m129210a9;
        this.f71309B = -1;
        this.f71310C = -1;
        m76976h();
    }
}
