package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.zview.AbstractC17484n;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class FixUsableHeightFrameLayout extends FrameLayout {

    /* renamed from: p */
    private InterfaceC13668a f70600p;

    /* renamed from: q */
    Rect f70601q;

    /* renamed from: r */
    View.OnLayoutChangeListener f70602r;

    /* renamed from: com.zing.zalo.ui.widget.layout.FixUsableHeightFrameLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13668a {
        /* renamed from: a */
        void mo76373a(MotionEvent motionEvent);
    }

    public FixUsableHeightFrameLayout(Context context) {
        super(context);
        this.f70600p = null;
        this.f70601q = new Rect();
        this.f70602r = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.widget.layout.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FixUsableHeightFrameLayout.this.m76372d(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m76371c() {
        try {
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m76372d(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i11 != i15 || i12 != i16 || i13 != i17 || i14 != i18) {
            post(new Runnable() { // from class: com.zing.zalo.ui.widget.layout.b
                @Override // java.lang.Runnable
                public final void run() {
                    FixUsableHeightFrameLayout.this.m76371c();
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getRootView() != null) {
            getRootView().addOnLayoutChangeListener(this.f70602r);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getRootView() != null) {
            getRootView().removeOnLayoutChangeListener(this.f70602r);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC13668a interfaceC13668a = this.f70600p;
        if (interfaceC13668a != null) {
            interfaceC13668a.mo76373a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
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
        try {
            View rootView = getRootView();
            int width = rootView.getWidth();
            int height = rootView.getHeight();
            rootView.getWindowVisibleDisplayFrame(this.f70601q);
            int i15 = Build.VERSION.SDK_INT;
            int i16 = 0;
            if (i15 >= 23) {
                rootWindowInsets = getRootView().getRootWindowInsets();
                if (i15 >= 28) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    if (displayCutout != null) {
                        z11 = true;
                        int min4 = Math.min(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getStableInsetLeft());
                        min = Math.min(rootWindowInsets.getSystemWindowInsetTop(), this.f70601q.top);
                        min2 = Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom());
                        min3 = Math.min(rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getStableInsetRight());
                        z12 = z11;
                        i13 = min4;
                    }
                }
                z11 = false;
                int min42 = Math.min(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getStableInsetLeft());
                min = Math.min(rootWindowInsets.getSystemWindowInsetTop(), this.f70601q.top);
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

    public void setOnTouchEventListener(InterfaceC13668a interfaceC13668a) {
        this.f70600p = interfaceC13668a;
    }

    public FixUsableHeightFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70600p = null;
        this.f70601q = new Rect();
        this.f70602r = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.widget.layout.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                FixUsableHeightFrameLayout.this.m76372d(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
    }
}
