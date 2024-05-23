package com.zing.zalo.uicontrol.drawer;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: com.zing.zalo.uicontrol.drawer.b */
/* loaded from: classes4.dex */
public abstract class AbstractC16583b {

    /* renamed from: a */
    private static final int[] f83783a = {R.attr.colorPrimaryDark};

    /* renamed from: com.zing.zalo.uicontrol.drawer.b$a */
    /* loaded from: classes4.dex */
    static class a implements View.OnApplyWindowInsetsListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z11;
            InterfaceC16584c interfaceC16584c = (InterfaceC16584c) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC16584c.mo88335a(windowInsets, z11);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: a */
    public static void m88365a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i11) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i11 == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i11 == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: b */
    public static void m88366b(View view) {
        if (view instanceof InterfaceC16584c) {
            view.setOnApplyWindowInsetsListener(new a());
            view.setSystemUiVisibility(1280);
        }
    }

    /* renamed from: c */
    public static void m88367c(View view, Object obj, int i11) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i11 == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i11 == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: d */
    public static Drawable m88368d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f83783a);
        try {
            return obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static int m88369e(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }
        return 0;
    }
}
