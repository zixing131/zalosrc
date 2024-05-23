package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements C1072e.b, InterfaceC1078k {

    /* renamed from: E */
    private C1072e f4203E;

    /* renamed from: F */
    private Context f4204F;

    /* renamed from: G */
    private int f4205G;

    /* renamed from: H */
    private boolean f4206H;

    /* renamed from: I */
    private ActionMenuPresenter f4207I;

    /* renamed from: J */
    private InterfaceC1077j.a f4208J;

    /* renamed from: K */
    C1072e.a f4209K;

    /* renamed from: L */
    private boolean f4210L;

    /* renamed from: M */
    private int f4211M;

    /* renamed from: N */
    private int f4212N;

    /* renamed from: O */
    private int f4213O;

    /* renamed from: P */
    InterfaceC1096d f4214P;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: c */
        public boolean f4215c;

        /* renamed from: d */
        public int f4216d;

        /* renamed from: e */
        public int f4217e;

        /* renamed from: f */
        public boolean f4218f;

        /* renamed from: g */
        public boolean f4219g;

        /* renamed from: h */
        boolean f4220h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f4215c = layoutParams.f4215c;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f4215c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1093a {
        /* renamed from: c */
        boolean mo4972c();

        /* renamed from: d */
        boolean mo4973d();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes2.dex */
    public static class C1094b implements InterfaceC1077j.a {
        C1094b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: c */
        public void mo4850c(C1072e c1072e, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: d */
        public boolean mo4851d(C1072e c1072e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes2.dex */
    public class C1095c implements C1072e.a {
        C1095c() {
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: a */
        public boolean mo4805a(C1072e c1072e, MenuItem menuItem) {
            InterfaceC1096d interfaceC1096d = ActionMenuView.this.f4214P;
            if (interfaceC1096d != null && interfaceC1096d.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: b */
        public void mo4807b(C1072e c1072e) {
            C1072e.a aVar = ActionMenuView.this.f4209K;
            if (aVar != null) {
                aVar.mo4807b(c1072e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1096d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: N */
    public static int m5211N(View view, int i11, int i12, int i13, int i14) {
        ActionMenuItemView actionMenuItemView;
        boolean z11;
        int i15;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13) - i14, View.MeasureSpec.getMode(i13));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z12 = false;
        if (actionMenuItemView != null && actionMenuItemView.m4975f()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i12 > 0) {
            i15 = 2;
            if (!z11 || i12 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i16 = measuredWidth / i11;
                if (measuredWidth % i11 != 0) {
                    i16++;
                }
                if (!z11 || i16 >= 2) {
                    i15 = i16;
                }
                if (!layoutParams.f4215c && z11) {
                    z12 = true;
                }
                layoutParams.f4218f = z12;
                layoutParams.f4216d = i15;
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), makeMeasureSpec);
                return i15;
            }
        }
        i15 = 0;
        if (!layoutParams.f4215c) {
            z12 = true;
        }
        layoutParams.f4218f = z12;
        layoutParams.f4216d = i15;
        view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), makeMeasureSpec);
        return i15;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: O */
    private void m5212O(int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        int i18;
        ?? r14;
        boolean z16;
        int i19;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int i21 = size - paddingLeft;
        int i22 = this.f4212N;
        int i23 = i21 / i22;
        int i24 = i21 % i22;
        if (i23 == 0) {
            setMeasuredDimension(i21, 0);
            return;
        }
        int i25 = i22 + (i24 / i23);
        int childCount = getChildCount();
        int i26 = 0;
        int i27 = 0;
        boolean z17 = false;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        long j11 = 0;
        while (i27 < childCount) {
            View childAt = getChildAt(i27);
            int i32 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z18 = childAt instanceof ActionMenuItemView;
                int i33 = i28 + 1;
                if (z18) {
                    int i34 = this.f4213O;
                    i18 = i33;
                    r14 = 0;
                    childAt.setPadding(i34, 0, i34, 0);
                } else {
                    i18 = i33;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f4220h = r14;
                layoutParams.f4217e = r14;
                layoutParams.f4216d = r14;
                layoutParams.f4218f = r14;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = r14;
                if (z18 && ((ActionMenuItemView) childAt).m4975f()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                layoutParams.f4219g = z16;
                if (layoutParams.f4215c) {
                    i19 = 1;
                } else {
                    i19 = i23;
                }
                int m5211N = m5211N(childAt, i25, i19, childMeasureSpec, paddingTop);
                i29 = Math.max(i29, m5211N);
                if (layoutParams.f4218f) {
                    i31++;
                }
                if (layoutParams.f4215c) {
                    z17 = true;
                }
                i23 -= m5211N;
                i26 = Math.max(i26, childAt.getMeasuredHeight());
                if (m5211N == 1) {
                    j11 |= 1 << i27;
                    i26 = i26;
                }
                i28 = i18;
            }
            i27++;
            size2 = i32;
        }
        int i35 = size2;
        if (z17 && i28 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z19 = false;
        while (i31 > 0 && i23 > 0) {
            int i36 = 0;
            int i37 = 0;
            int i38 = Integer.MAX_VALUE;
            long j12 = 0;
            while (i37 < childCount) {
                boolean z21 = z19;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i37).getLayoutParams();
                int i39 = i26;
                if (layoutParams2.f4218f) {
                    int i41 = layoutParams2.f4216d;
                    if (i41 < i38) {
                        j12 = 1 << i37;
                        i38 = i41;
                        i36 = 1;
                    } else if (i41 == i38) {
                        i36++;
                        j12 |= 1 << i37;
                    }
                }
                i37++;
                i26 = i39;
                z19 = z21;
            }
            z12 = z19;
            i15 = i26;
            j11 |= j12;
            if (i36 > i23) {
                i13 = mode;
                i14 = i21;
                break;
            }
            int i42 = i38 + 1;
            int i43 = 0;
            while (i43 < childCount) {
                View childAt2 = getChildAt(i43);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i44 = i21;
                int i45 = mode;
                long j13 = 1 << i43;
                if ((j12 & j13) == 0) {
                    if (layoutParams3.f4216d == i42) {
                        j11 |= j13;
                    }
                    z15 = z11;
                } else {
                    if (z11 && layoutParams3.f4219g && i23 == 1) {
                        int i46 = this.f4213O;
                        z15 = z11;
                        childAt2.setPadding(i46 + i25, 0, i46, 0);
                    } else {
                        z15 = z11;
                    }
                    layoutParams3.f4216d++;
                    layoutParams3.f4220h = true;
                    i23--;
                }
                i43++;
                mode = i45;
                i21 = i44;
                z11 = z15;
            }
            i26 = i15;
            z19 = true;
        }
        i13 = mode;
        i14 = i21;
        z12 = z19;
        i15 = i26;
        if (!z17 && i28 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i23 > 0 && j11 != 0 && (i23 < i28 - 1 || z13 || i29 > 1)) {
            float bitCount = Long.bitCount(j11);
            if (!z13) {
                if ((j11 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f4219g) {
                    bitCount -= 0.5f;
                }
                int i47 = childCount - 1;
                if ((j11 & (1 << i47)) != 0 && !((LayoutParams) getChildAt(i47).getLayoutParams()).f4219g) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i17 = (int) ((i23 * i25) / bitCount);
            } else {
                i17 = 0;
            }
            z14 = z12;
            for (int i48 = 0; i48 < childCount; i48++) {
                if ((j11 & (1 << i48)) != 0) {
                    View childAt3 = getChildAt(i48);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f4217e = i17;
                        layoutParams4.f4220h = true;
                        if (i48 == 0 && !layoutParams4.f4219g) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (-i17) / 2;
                        }
                    } else if (layoutParams4.f4215c) {
                        layoutParams4.f4217e = i17;
                        layoutParams4.f4220h = true;
                        ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (-i17) / 2;
                    } else {
                        if (i48 != 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = i17 / 2;
                        }
                        if (i48 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = i17 / 2;
                        }
                    }
                    z14 = true;
                }
            }
        } else {
            z14 = z12;
        }
        if (z14) {
            for (int i49 = 0; i49 < childCount; i49++) {
                View childAt4 = getChildAt(i49);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f4220h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f4216d * i25) + layoutParams5.f4217e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i13 != 1073741824) {
            i16 = i15;
        } else {
            i16 = i35;
        }
        setMeasuredDimension(i14, i16);
    }

    /* renamed from: D */
    public void m5213D() {
        ActionMenuPresenter actionMenuPresenter = this.f4207I;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m5195C();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: E */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f4340b = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: F */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: G */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (layoutParams2.f4340b <= 0) {
                layoutParams2.f4340b = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    /* renamed from: H */
    public LayoutParams m5217H() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f4215c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: I */
    protected boolean m5218I(int i11) {
        boolean z11 = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof InterfaceC1093a)) {
            z11 = ((InterfaceC1093a) childAt).mo4972c();
        }
        if (i11 > 0 && (childAt2 instanceof InterfaceC1093a)) {
            return z11 | ((InterfaceC1093a) childAt2).mo4973d();
        }
        return z11;
    }

    /* renamed from: J */
    public boolean m5219J() {
        ActionMenuPresenter actionMenuPresenter = this.f4207I;
        if (actionMenuPresenter != null && actionMenuPresenter.m5197F()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public boolean m5220K() {
        ActionMenuPresenter actionMenuPresenter = this.f4207I;
        if (actionMenuPresenter != null && actionMenuPresenter.m5199H()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public boolean m5221L() {
        ActionMenuPresenter actionMenuPresenter = this.f4207I;
        if (actionMenuPresenter != null && actionMenuPresenter.m5200I()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public boolean m5222M() {
        return this.f4206H;
    }

    /* renamed from: P */
    public C1072e m5223P() {
        return this.f4203E;
    }

    /* renamed from: Q */
    public void m5224Q(InterfaceC1077j.a aVar, C1072e.a aVar2) {
        this.f4208J = aVar;
        this.f4209K = aVar2;
    }

    /* renamed from: R */
    public boolean m5225R() {
        ActionMenuPresenter actionMenuPresenter = this.f4207I;
        if (actionMenuPresenter != null && actionMenuPresenter.m5206O()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C1072e.b
    /* renamed from: c */
    public boolean mo4979c(C1074g c1074g) {
        return this.f4203E.m5061N(c1074g, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f4203E == null) {
            Context context = getContext();
            C1072e c1072e = new C1072e(context);
            this.f4203E = c1072e;
            c1072e.mo5068V(new C1095c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f4207I = actionMenuPresenter;
            actionMenuPresenter.m5205N(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f4207I;
            InterfaceC1077j.a aVar = this.f4208J;
            if (aVar == null) {
                aVar = new C1094b();
            }
            actionMenuPresenter2.mo4993h(aVar);
            this.f4203E.m5076c(this.f4207I, this.f4204F);
            this.f4207I.m5203L(this);
        }
        return this.f4203E;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f4207I.m5196E();
    }

    public int getPopupTheme() {
        return this.f4205G;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k
    /* renamed from: h */
    public void mo4980h(C1072e c1072e) {
        this.f4203E = c1072e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f4207I;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo4995l(false);
            if (this.f4207I.m5200I()) {
                this.f4207I.m5197F();
                this.f4207I.m5206O();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5213D();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int width;
        int i16;
        if (!this.f4210L) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i13 - i11;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean m5459b = AbstractC1152a2.m5459b(this);
        int i19 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4215c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m5218I(i22)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m5459b) {
                        i16 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        width = i16 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i16 = width - measuredWidth;
                    }
                    int i23 = i17 - (measuredHeight / 2);
                    childAt.layout(i16, i23, width, measuredHeight + i23);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    m5218I(i22);
                    i21++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i24 = (i18 / 2) - (measuredWidth2 / 2);
            int i25 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i24, i25, measuredWidth2 + i24, measuredHeight2 + i25);
            return;
        }
        int i26 = i21 - (i19 ^ 1);
        if (i26 > 0) {
            i15 = paddingRight / i26;
        } else {
            i15 = 0;
        }
        int max = Math.max(0, i15);
        if (m5459b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt3 = getChildAt(i27);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f4215c) {
                    int i28 = width2 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i29 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i28 - measuredWidth3, i29, i28, measuredHeight3 + i29);
                    width2 = i28 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i31 = 0; i31 < childCount; i31++) {
            View childAt4 = getChildAt(i31);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f4215c) {
                int i32 = paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i33 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i32, i33, i32 + measuredWidth4, measuredHeight4 + i33);
                paddingLeft = i32 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        C1072e c1072e;
        boolean z12 = this.f4210L;
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f4210L = z11;
        if (z12 != z11) {
            this.f4211M = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.f4210L && (c1072e = this.f4203E) != null && size != this.f4211M) {
            this.f4211M = size;
            c1072e.mo5060M(true);
        }
        int childCount = getChildCount();
        if (this.f4210L && childCount > 0) {
            m5212O(i11, i12);
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i11, i12);
    }

    public void setExpandedActionViewsExclusive(boolean z11) {
        this.f4207I.m5202K(z11);
    }

    public void setOnMenuItemClickListener(InterfaceC1096d interfaceC1096d) {
        this.f4214P = interfaceC1096d;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f4207I.m5204M(drawable);
    }

    public void setOverflowReserved(boolean z11) {
        this.f4206H = z11;
    }

    public void setPopupTheme(int i11) {
        if (this.f4205G != i11) {
            this.f4205G = i11;
            if (i11 == 0) {
                this.f4204F = getContext();
            } else {
                this.f4204F = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f4207I = actionMenuPresenter;
        actionMenuPresenter.m5203L(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f4212N = (int) (56.0f * f11);
        this.f4213O = (int) (f11 * 4.0f);
        this.f4204F = context;
        this.f4205G = 0;
    }
}
