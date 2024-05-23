package com.zing.zalo.zview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.widget.InsetsLayout;
import xl0.InterfaceC30160a;

/* loaded from: classes.dex */
public class InsetsLayout extends FrameLayout {

    /* renamed from: p */
    Object f89216p;

    /* renamed from: q */
    private boolean f89217q;

    /* renamed from: r */
    private boolean f89218r;

    /* renamed from: s */
    private boolean f89219s;

    /* renamed from: t */
    InterfaceC30160a f89220t;

    public InsetsLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m93145b(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i11, boolean z11) {
        WindowInsets windowInsets = (WindowInsets) obj;
        int i12 = 0;
        if (i11 == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i11 == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
        if (!z11) {
            i12 = windowInsets.getSystemWindowInsetTop();
        }
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: c */
    private void m93146c(View view, Object obj, int i11) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i11 == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i11 == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ WindowInsets m93147d(View view, WindowInsets windowInsets) {
        InsetsLayout insetsLayout = (InsetsLayout) view;
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if (systemWindowInsetTop != 0 || this.f89219s) {
            AbstractC17484n.b bVar = AbstractC17484n.Companion;
            if (bVar.m92931b() != systemWindowInsetTop) {
                bVar.m92932c(systemWindowInsetTop);
            }
        }
        this.f89219s = false;
        this.f89216p = windowInsets;
        InterfaceC30160a interfaceC30160a = this.f89220t;
        if (interfaceC30160a != null) {
            interfaceC30160a.mo35574m(windowInsets);
        }
        insetsLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f89217q = true;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int i16 = layoutParams.leftMargin;
                childAt.layout(i16, layoutParams.topMargin, childAt.getMeasuredWidth() + i16, layoutParams.topMargin + childAt.getMeasuredHeight());
            }
        }
        this.f89217q = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        if (this.f89216p != null && this.f89218r) {
            z11 = true;
        } else {
            z11 = false;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (z11) {
                    if (childAt.getFitsSystemWindows()) {
                        m93146c(childAt, this.f89216p, layoutParams.gravity);
                    } else if (childAt.getTag() == null) {
                        m93145b(layoutParams, this.f89216p, layoutParams.gravity, true);
                    }
                }
                childAt.measure(ViewGroup.getChildMeasureSpec(i11, layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i12, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f89217q) {
            super.requestLayout();
        }
    }

    public void setAllowApplyInsets(boolean z11) {
        this.f89218r = z11;
        requestLayout();
    }

    public void setApplyWindowInsetsListener(InterfaceC30160a interfaceC30160a) {
        this.f89220t = interfaceC30160a;
    }

    public InsetsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InsetsLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f89217q = false;
        this.f89218r = true;
        this.f89219s = true;
        setDescendantFocusability(262144);
        setFocusableInTouchMode(true);
        setFitsSystemWindows(true);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: am0.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m93147d;
                m93147d = InsetsLayout.this.m93147d(view, windowInsets);
                return m93147d;
            }
        });
        setSystemUiVisibility(1280);
    }
}
