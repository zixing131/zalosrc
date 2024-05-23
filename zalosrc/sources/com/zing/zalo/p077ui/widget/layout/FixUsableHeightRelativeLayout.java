package com.zing.zalo.p077ui.widget.layout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.zview.AbstractC17484n;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class FixUsableHeightRelativeLayout extends RelativeLayout {

    /* renamed from: p */
    private final Rect f70603p;

    /* renamed from: q */
    private final int[] f70604q;

    /* renamed from: r */
    View.OnLayoutChangeListener f70605r;

    public FixUsableHeightRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70603p = new Rect();
        this.f70604q = new int[2];
        this.f70605r = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.widget.layout.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FixUsableHeightRelativeLayout.this.m76377d(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m76376c() {
        try {
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m76377d(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i11 != i15 || i12 != i16 || i13 != i17 || i14 != i18) {
            post(new Runnable() { // from class: com.zing.zalo.ui.widget.layout.d
                @Override // java.lang.Runnable
                public final void run() {
                    FixUsableHeightRelativeLayout.this.m76376c();
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getRootView() != null) {
            getRootView().addOnLayoutChangeListener(this.f70605r);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getRootView() != null) {
            getRootView().removeOnLayoutChangeListener(this.f70605r);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        WindowInsets rootWindowInsets;
        boolean z11;
        int min;
        int min2;
        int min3;
        boolean z12;
        int i13;
        DisplayCutout displayCutout;
        int i14;
        View findViewById;
        boolean isInMultiWindowMode;
        try {
            View rootView = getRootView();
            int width = rootView.getWidth();
            int height = rootView.getHeight();
            rootView.getWindowVisibleDisplayFrame(this.f70603p);
            int i15 = Build.VERSION.SDK_INT;
            int i16 = 0;
            if (i15 >= 23) {
                rootWindowInsets = rootView.getRootWindowInsets();
                if (i15 >= 28) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    if (displayCutout != null) {
                        z11 = true;
                        int min4 = Math.min(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getStableInsetLeft());
                        min = Math.min(rootWindowInsets.getSystemWindowInsetTop(), this.f70603p.top);
                        min2 = Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom());
                        min3 = Math.min(rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getStableInsetRight());
                        z12 = z11;
                        i13 = min4;
                    }
                }
                z11 = false;
                int min42 = Math.min(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getStableInsetLeft());
                min = Math.min(rootWindowInsets.getSystemWindowInsetTop(), this.f70603p.top);
                min2 = Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom());
                min3 = Math.min(rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getStableInsetRight());
                z12 = z11;
                i13 = min42;
            } else {
                Rect m155410i = AbstractC32226c.m155410i(rootView);
                i13 = m155410i.left;
                int i17 = m155410i.top;
                int i18 = m155410i.bottom;
                min3 = m155410i.right;
                min2 = i18;
                min = i17;
                z12 = false;
            }
            int i19 = height - min2;
            if (i15 >= 24 && (getContext() instanceof Activity)) {
                isInMultiWindowMode = ((Activity) getContext()).isInMultiWindowMode();
                if (isInMultiWindowMode) {
                    getLocationInWindow(this.f70604q);
                    i19 -= this.f70604q[1];
                }
            }
            if (!(getContext() instanceof InterfaceC27218a)) {
                if (getRootView() != null && (findViewById = getRootView().findViewById(AbstractC6918a0.zalo_view_container)) != null && findViewById.getMeasuredWidth() > 0 && findViewById.getMeasuredHeight() > 0 && (findViewById instanceof UpArrowLayout)) {
                    Point pointTo = ((UpArrowLayout) findViewById).getPointTo();
                    if (getResources().getConfiguration().orientation == 1) {
                        i19 -= pointTo.y;
                    } else {
                        width -= pointTo.x;
                        i19 -= min;
                    }
                }
            } else if (getResources().getConfiguration().orientation == 2) {
                if (i15 >= 30) {
                    i14 = i13 + min3;
                } else {
                    int i21 = i13 + min3;
                    if (z12) {
                        i16 = AbstractC17484n.Companion.m92931b();
                    }
                    i14 = i21 + i16;
                }
                width -= i14;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        } catch (Exception unused) {
            super.onMeasure(i11, i12);
        }
    }
}
