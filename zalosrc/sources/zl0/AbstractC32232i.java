package zl0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17484n;
import le0.AbstractC22459a;

/* renamed from: zl0.i */
/* loaded from: classes.dex */
public abstract class AbstractC32232i {

    /* renamed from: a */
    public static final int f148649a;

    /* renamed from: b */
    public static String f148650b;

    /* renamed from: c */
    public static String f148651c;

    static {
        f148649a = Build.VERSION.SDK_INT >= 26 ? 2038 : 2007;
        f148650b = "";
        f148651c = "";
    }

    /* renamed from: a */
    public static int m155453a(float f11) {
        if (f11 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * f11);
    }

    /* renamed from: b */
    public static float m155454b(float f11, boolean z11) {
        float f12;
        float f13 = f11 / 2.54f;
        if (z11) {
            f12 = Resources.getSystem().getDisplayMetrics().xdpi;
        } else {
            f12 = Resources.getSystem().getDisplayMetrics().ydpi;
        }
        return f13 * f12;
    }

    /* renamed from: c */
    public static int m155455c(Context context) {
        if (context.getResources().getIdentifier("status_bar_height", "dimen", "android") > 0) {
            return (int) Math.ceil(context.getResources().getDimension(r0));
        }
        return 0;
    }

    /* renamed from: d */
    public static Point m155456d(View view) {
        int i11;
        int i12;
        int i13;
        View rootView;
        WindowInsets rootWindowInsets;
        int min;
        Rect rect = new Rect();
        try {
            rootView = view.getRootView();
            rootView.getWindowVisibleDisplayFrame(rect);
        } catch (Exception e11) {
            e11.printStackTrace();
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            i11 = displayMetrics.widthPixels;
            i12 = displayMetrics.heightPixels;
        }
        if (rootView.getHeight() > 0 && rootView.getWidth() > 0) {
            i13 = rootView.getWidth();
            int height = rootView.getHeight();
            int i14 = 0;
            if (Build.VERSION.SDK_INT >= 23) {
                rootWindowInsets = rootView.getRootWindowInsets();
                min = Math.min(rootWindowInsets.getStableInsetBottom(), rootWindowInsets.getSystemWindowInsetBottom());
            } else {
                if (rect.top != 0) {
                    i14 = AbstractC17484n.Companion.m92931b();
                }
                min = AbstractC32226c.m155408g(rootView);
            }
            i12 = height - (i14 + min);
            return new Point(i13, i12);
        }
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        i11 = displayMetrics2.widthPixels;
        i12 = displayMetrics2.heightPixels;
        i13 = i11;
        return new Point(i13, i12);
    }

    /* renamed from: e */
    public static boolean m155457e(String str) {
        for (String str2 : Build.SUPPORTED_ABIS) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static void m155458f(View view) {
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (view.getWindowToken() != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: g */
    public static boolean m155459g(Context context) {
        boolean canDrawOverlays;
        if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(context);
            return canDrawOverlays;
        }
        if (!AbstractC32228e.m155422c() && !AbstractC32228e.m155424e()) {
            return true;
        }
        return AbstractC32228e.m155421b(context);
    }

    /* renamed from: h */
    public static boolean m155460h() {
        return false;
    }

    /* renamed from: i */
    public static void m155461i(Context context, WindowManager.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 28) {
            if (context.getResources().getConfiguration().orientation == 2) {
                layoutParams.layoutInDisplayCutoutMode = 2;
            } else {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
        }
    }

    /* renamed from: j */
    public static void m155462j(View view, int i11, Paint paint) {
        if (view != null) {
            view.setLayerType(i11, paint);
        }
    }

    /* renamed from: k */
    public static void m155463k(View view, boolean z11) {
        float f11;
        if (view == null) {
            return;
        }
        if (z11) {
            f11 = view.getResources().getDimension(AbstractC17454d.width_shadow_action_bar);
        } else {
            f11 = 0.0f;
        }
        view.setElevation(f11);
    }

    /* renamed from: l */
    public static void m155464l(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    /* renamed from: m */
    public static int m155465m(Context context, int i11) {
        return AbstractC22459a.m116119a(context, i11);
    }

    /* renamed from: n */
    public static Drawable m155466n(Context context, int i11) {
        return AbstractC22459a.m116120b(context, i11);
    }

    /* renamed from: o */
    public static void m155467o(Context context, WindowManager.LayoutParams layoutParams) {
        if (!(context instanceof Activity) && m155459g(context)) {
            layoutParams.type = f148649a;
        }
    }
}
