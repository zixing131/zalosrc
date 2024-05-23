package au;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalocore.CoreUtility;
import zl0.AbstractC32226c;

/* renamed from: au.w */
/* loaded from: classes.dex */
public abstract class AbstractC2379w {

    /* renamed from: a */
    private static boolean f9924a = false;

    /* renamed from: b */
    private static boolean f9925b = false;

    /* renamed from: au.w$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public final Rect f9926a = new Rect();

        /* renamed from: b */
        public final int[] f9927b = new int[2];

        /* renamed from: c */
        public final int[] f9928c = new int[2];

        /* renamed from: d */
        public int f9929d = 0;

        /* renamed from: e */
        public int f9930e = 0;

        /* renamed from: f */
        public int f9931f = 0;

        /* renamed from: g */
        public int f9932g = 0;
    }

    /* renamed from: a */
    public static void m12427a(Configuration configuration) {
        boolean z11 = true;
        f9924a = true;
        if (configuration.keyboard == 1 || configuration.hardKeyboardHidden != 1) {
            z11 = false;
        }
        f9925b = z11;
    }

    /* renamed from: b */
    public static int m12428b() {
        return Build.VERSION.SDK_INT >= 30 ? 16 : 32;
    }

    /* renamed from: c */
    public static void m12429c(View view, a aVar, int i11) {
        WindowInsets rootWindowInsets;
        int i12;
        int i13;
        if (view != null && aVar != null) {
            Context context = view.getContext();
            View rootView = view.getRootView();
            view.getWindowVisibleDisplayFrame(aVar.f9926a);
            int i14 = 0;
            if (Build.VERSION.SDK_INT >= 23) {
                rootWindowInsets = rootView.getRootWindowInsets();
                rootWindowInsets.getStableInsetTop();
                int stableInsetBottom = rootWindowInsets.getStableInsetBottom();
                int systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
                int systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
                int min = Math.min(systemWindowInsetTop, aVar.f9926a.top);
                int min2 = Math.min(stableInsetBottom, systemWindowInsetBottom);
                aVar.f9931f = min;
                aVar.f9932g = min2;
                int height = (rootView.getHeight() - aVar.f9931f) - aVar.f9932g;
                aVar.f9929d = height;
                Rect rect = aVar.f9926a;
                int i15 = rect.bottom;
                int i16 = rect.top;
                i12 = height - (i15 - i16);
                if (i12 == i16 && min == 0) {
                    i12 = 0;
                }
            } else {
                if (aVar.f9926a.top != 0) {
                    i13 = AbstractC17484n.Companion.m92931b();
                } else {
                    i13 = 0;
                }
                aVar.f9931f = i13;
                aVar.f9932g = AbstractC32226c.m155408g(rootView);
                int height2 = (rootView.getHeight() - aVar.f9931f) - aVar.f9932g;
                aVar.f9929d = height2;
                Rect rect2 = aVar.f9926a;
                i12 = height2 - (rect2.bottom - rect2.top);
            }
            if (i12 >= 0) {
                i14 = i12;
            }
            if (i14 <= rootView.getHeight() * 0.8f && ((context instanceof Activity) || i14 >= i11 || Math.abs(i14 - i11) != AbstractC17484n.Companion.m92930a())) {
                i11 = i14;
            }
            aVar.f9930e = i11;
        }
    }

    /* renamed from: d */
    public static void m12430d(View view) {
        if (view == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (view.getWindowToken() != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: e */
    public static boolean m12431e() {
        if (!f9924a) {
            m12427a(CoreUtility.getAppContext().getResources().getConfiguration());
        }
        return f9925b;
    }

    /* renamed from: f */
    public static void m12432f(View view) {
        m12433g(view, 1);
    }

    /* renamed from: g */
    public static void m12433g(View view, int i11) {
        if (view != null) {
            try {
                view.requestFocus();
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public static void m12434h(View view) {
        if (view == null) {
            return;
        }
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
