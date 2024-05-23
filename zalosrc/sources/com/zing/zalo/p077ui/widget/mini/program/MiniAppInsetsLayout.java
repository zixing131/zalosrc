package com.zing.zalo.p077ui.widget.mini.program;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.zing.zalo.p077ui.widget.mini.program.MiniAppInsetsLayout;
import com.zing.zalo.zview.AbstractC17484n;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p227i3.C20218v;
import xl0.InterfaceC30160a;

/* loaded from: classes6.dex */
public final class MiniAppInsetsLayout extends FrameLayout {

    /* renamed from: p */
    private Object f70724p;

    /* renamed from: q */
    private boolean f70725q;

    /* renamed from: r */
    private boolean f70726r;

    /* renamed from: s */
    private boolean f70727s;

    /* renamed from: t */
    private InterfaceC30160a f70728t;

    /* renamed from: u */
    private boolean f70729u;

    public MiniAppInsetsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final WindowInsets m76425b(MiniAppInsetsLayout miniAppInsetsLayout, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(miniAppInsetsLayout, "this$0");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(windowInsets, "insets");
        MiniAppInsetsLayout miniAppInsetsLayout2 = (MiniAppInsetsLayout) view;
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if (systemWindowInsetTop != 0 || miniAppInsetsLayout.f70727s) {
            AbstractC17484n.b bVar = AbstractC17484n.Companion;
            if (bVar.m92931b() != systemWindowInsetTop) {
                bVar.m92932c(systemWindowInsetTop);
            }
        }
        miniAppInsetsLayout.f70727s = false;
        miniAppInsetsLayout.f70724p = windowInsets;
        InterfaceC30160a interfaceC30160a = miniAppInsetsLayout.f70728t;
        if (interfaceC30160a != null) {
            AbstractC19074t.m100205c(interfaceC30160a);
            interfaceC30160a.mo35574m(windowInsets);
        }
        miniAppInsetsLayout2.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }

    /* renamed from: c */
    private final void m76426c(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i11) {
        int systemWindowInsetBottom;
        int systemWindowInsetBottom2;
        WindowInsets windowInsets = (WindowInsets) obj;
        int i12 = 0;
        if (i11 != 8388611) {
            if (i11 == 8388613) {
                AbstractC19074t.m100205c(windowInsets);
                int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
                if (this.f70729u) {
                    systemWindowInsetBottom2 = 0;
                } else {
                    systemWindowInsetBottom2 = windowInsets.getSystemWindowInsetBottom();
                }
                windowInsets = windowInsets.replaceSystemWindowInsets(0, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom2);
            }
        } else {
            AbstractC19074t.m100205c(windowInsets);
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            int systemWindowInsetTop2 = windowInsets.getSystemWindowInsetTop();
            if (this.f70729u) {
                systemWindowInsetBottom = 0;
            } else {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            }
            windowInsets = windowInsets.replaceSystemWindowInsets(systemWindowInsetLeft, systemWindowInsetTop2, 0, systemWindowInsetBottom);
        }
        AbstractC19074t.m100205c(windowInsets);
        marginLayoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
        if (!this.f70729u) {
            i12 = windowInsets.getSystemWindowInsetBottom();
        }
        marginLayoutParams.bottomMargin = i12;
    }

    /* renamed from: d */
    private final void m76427d(View view, Object obj, int i11) {
        int systemWindowInsetBottom;
        int systemWindowInsetBottom2;
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i11 != 8388611) {
            if (i11 == 8388613) {
                AbstractC19074t.m100205c(windowInsets);
                int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
                if (this.f70729u) {
                    systemWindowInsetBottom2 = 0;
                } else {
                    systemWindowInsetBottom2 = windowInsets.getSystemWindowInsetBottom();
                }
                windowInsets = windowInsets.replaceSystemWindowInsets(0, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom2);
            }
        } else {
            AbstractC19074t.m100205c(windowInsets);
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            int systemWindowInsetTop2 = windowInsets.getSystemWindowInsetTop();
            if (this.f70729u) {
                systemWindowInsetBottom = 0;
            } else {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            }
            windowInsets = windowInsets.replaceSystemWindowInsets(systemWindowInsetLeft, systemWindowInsetTop2, 0, systemWindowInsetBottom);
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    public final Object getLastInsets() {
        return this.f70724p;
    }

    public final InterfaceC30160a getMApplyWindowInsetsListener() {
        return this.f70728t;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f70725q = true;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i16 = layoutParams2.leftMargin;
                childAt.layout(i16, layoutParams2.topMargin, childAt.getMeasuredWidth() + i16, layoutParams2.topMargin + childAt.getMeasuredHeight());
            }
        }
        this.f70725q = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        if (this.f70724p != null && this.f70726r) {
            z11 = true;
        } else {
            z11 = false;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (z11) {
                    if (childAt.getFitsSystemWindows()) {
                        AbstractC19074t.m100205c(childAt);
                        m76427d(childAt, this.f70724p, layoutParams2.gravity);
                    } else if (childAt.getTag() == null) {
                        m76426c(layoutParams2, this.f70724p, layoutParams2.gravity);
                    }
                }
                childAt.measure(ViewGroup.getChildMeasureSpec(i11, layoutParams2.leftMargin + layoutParams2.rightMargin, layoutParams2.width), ViewGroup.getChildMeasureSpec(i12, layoutParams2.topMargin + layoutParams2.bottomMargin, layoutParams2.height));
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f70725q) {
            super.requestLayout();
        }
    }

    public final void setAllowApplyInsets(boolean z11) {
        this.f70726r = z11;
        requestLayout();
    }

    public final void setApplyWindowInsetsListener(InterfaceC30160a interfaceC30160a) {
        this.f70728t = interfaceC30160a;
    }

    public final void setHideNavigationBar(boolean z11) {
        this.f70729u = z11;
        requestLayout();
    }

    public final void setLastInsets(Object obj) {
        this.f70724p = obj;
    }

    public final void setMApplyWindowInsetsListener(InterfaceC30160a interfaceC30160a) {
        this.f70728t = interfaceC30160a;
    }

    public /* synthetic */ MiniAppInsetsLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppInsetsLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100205c(context);
        this.f70726r = true;
        this.f70727s = true;
        setDescendantFocusability(262144);
        setFocusableInTouchMode(true);
        setFitsSystemWindows(true);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hb0.e
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m76425b;
                m76425b = MiniAppInsetsLayout.m76425b(MiniAppInsetsLayout.this, view, windowInsets);
                return m76425b;
            }
        });
        setSystemUiVisibility(1280);
    }
}
