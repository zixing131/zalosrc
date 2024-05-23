package zl0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Method;
import me0.AbstractC23171p0;

/* renamed from: zl0.f */
/* loaded from: classes7.dex */
public abstract class AbstractC32229f {

    /* renamed from: a */
    private static Boolean f148641a;

    /* renamed from: b */
    private static Boolean f148642b;

    /* renamed from: c */
    private static int[] f148643c;

    /* renamed from: d */
    private static Rect f148644d;

    /* renamed from: e */
    private static Rect f148645e;

    /* renamed from: f */
    private static Rect f148646f;

    /* renamed from: g */
    private static Rect f148647g;

    /* renamed from: h */
    private static Boolean f148648h;

    /* renamed from: a */
    private static boolean m155429a(View view) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        rootWindowInsets = view.getRootWindowInsets();
        boolean z11 = false;
        if (rootWindowInsets != null) {
            displayCutout = rootWindowInsets.getDisplayCutout();
            if (displayCutout != null) {
                z11 = true;
            }
            Boolean valueOf = Boolean.valueOf(z11);
            f148641a = valueOf;
            return valueOf.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    private static void m155430b() {
        f148645e = null;
        f148647g = null;
    }

    /* renamed from: c */
    private static Rect m155431c(Context context) {
        if (AbstractC23171p0.m119370b()) {
            boolean m155449u = m155449u(context);
            Boolean bool = f148648h;
            if (bool != null && bool.booleanValue() != m155449u) {
                m155430b();
            }
            f148648h = Boolean.valueOf(m155449u);
        }
        int m155441m = m155441m(context);
        if (m155441m == 1) {
            if (f148645e == null) {
                f148645e = m155439k(context);
            }
            return f148645e;
        }
        if (m155441m == 2) {
            if (f148646f == null) {
                f148646f = m155437i(context);
            }
            return f148646f;
        }
        if (m155441m == 3) {
            if (f148647g == null) {
                f148647g = m155438j(context);
            }
            return f148647g;
        }
        if (f148644d == null) {
            f148644d = m155436h(context);
        }
        return f148644d;
    }

    /* renamed from: d */
    public static int m155432d(Context context) {
        return AbstractC32232i.m155453a(27.0f);
    }

    /* renamed from: e */
    public static int m155433e(Context context) {
        int identifier = context.getResources().getIdentifier("notch_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return AbstractC32232i.m155455c(context);
    }

    /* renamed from: f */
    public static int[] m155434f(Context context) {
        if (f148643c == null) {
            f148643c = new int[]{0, 0};
            try {
                Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
                f148643c = (int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return f148643c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:            r3 = r3.getRootWindowInsets();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:            r3 = r3.getDisplayCutout();     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m155435g(View view, Rect rect) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int safeInsetLeft;
        int safeInsetTop;
        int safeInsetRight;
        int safeInsetBottom;
        if (view != null && rootWindowInsets != null && displayCutout != null) {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetRight = displayCutout.getSafeInsetRight();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            rect.set(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom);
        }
    }

    /* renamed from: h */
    private static Rect m155436h(Context context) {
        Rect rect = new Rect();
        if (AbstractC23171p0.m119374f()) {
            rect.top = m155432d(context);
            rect.bottom = 0;
        } else if (AbstractC23171p0.m119372d()) {
            rect.top = AbstractC32232i.m155455c(context);
            rect.bottom = 0;
        } else if (AbstractC23171p0.m119370b()) {
            rect.top = m155434f(context)[1];
            rect.bottom = 0;
        } else if (AbstractC23171p0.m119375g()) {
            rect.top = m155433e(context);
            rect.bottom = 0;
        }
        return rect;
    }

    /* renamed from: i */
    private static Rect m155437i(Context context) {
        Rect rect = new Rect();
        if (AbstractC23171p0.m119374f()) {
            rect.top = 0;
            rect.bottom = m155432d(context);
        } else if (AbstractC23171p0.m119372d()) {
            rect.top = 0;
            rect.bottom = AbstractC32232i.m155455c(context);
        } else if (AbstractC23171p0.m119370b()) {
            int[] m155434f = m155434f(context);
            rect.top = 0;
            rect.bottom = m155434f[1];
        } else if (AbstractC23171p0.m119375g()) {
            rect.top = 0;
            rect.bottom = m155433e(context);
        }
        return rect;
    }

    /* renamed from: j */
    private static Rect m155438j(Context context) {
        Rect rect = new Rect();
        if (AbstractC23171p0.m119374f()) {
            rect.right = m155432d(context);
            rect.left = 0;
        } else if (AbstractC23171p0.m119372d()) {
            rect.right = AbstractC32232i.m155455c(context);
            rect.left = 0;
        } else if (AbstractC23171p0.m119370b()) {
            if (f148648h.booleanValue()) {
                rect.right = m155434f(context)[1];
            } else {
                rect.right = 0;
            }
            rect.left = 0;
        } else if (AbstractC23171p0.m119375g()) {
            rect.right = m155433e(context);
            rect.left = 0;
        }
        return rect;
    }

    /* renamed from: k */
    private static Rect m155439k(Context context) {
        Rect rect = new Rect();
        if (AbstractC23171p0.m119374f()) {
            rect.left = m155432d(context);
            rect.right = 0;
        } else if (AbstractC23171p0.m119372d()) {
            rect.left = AbstractC32232i.m155455c(context);
            rect.right = 0;
        } else if (AbstractC23171p0.m119370b()) {
            if (f148648h.booleanValue()) {
                rect.left = m155434f(context)[1];
            } else {
                rect.left = 0;
            }
            rect.right = 0;
        } else if (AbstractC23171p0.m119375g()) {
            rect.left = m155433e(context);
            rect.right = 0;
        }
        return rect;
    }

    /* renamed from: l */
    public static Rect m155440l(View view) {
        if (m155450v()) {
            Rect rect = new Rect();
            m155435g(view, rect);
            return rect;
        }
        return m155431c(view.getContext());
    }

    /* renamed from: m */
    private static int m155441m(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    /* renamed from: n */
    public static boolean m155442n(Activity activity) {
        View decorView;
        if (f148641a == null) {
            if (m155450v()) {
                Window window = activity.getWindow();
                if (window == null || (decorView = window.getDecorView()) == null || !m155429a(decorView)) {
                    return false;
                }
            } else {
                f148641a = Boolean.valueOf(m155448t(activity));
            }
        }
        return f148641a.booleanValue();
    }

    /* renamed from: o */
    public static boolean m155443o(View view) {
        if (f148641a == null) {
            if (m155450v()) {
                if (!m155429a(view)) {
                    return false;
                }
            } else {
                f148641a = Boolean.valueOf(m155448t(view.getContext()));
            }
        }
        return f148641a.booleanValue();
    }

    /* renamed from: p */
    static boolean m155444p(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m155445q(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* renamed from: r */
    public static boolean m155446r(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            Method[] declaredMethods = loadClass.getDeclaredMethods();
            if (declaredMethods == null) {
                return false;
            }
            for (Method method : declaredMethods) {
                if (method.getName().equalsIgnoreCase("isFeatureSupport")) {
                    return ((Boolean) method.invoke(loadClass, 32)).booleanValue();
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: s */
    public static boolean m155447s(Context context) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(null, "ro.miui.notch", 0)).intValue() != 1) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m155448t(Context context) {
        try {
            if (f148642b == null) {
                if (AbstractC23171p0.m119370b()) {
                    f148642b = Boolean.valueOf(m155444p(context));
                } else if (AbstractC23171p0.m119374f()) {
                    f148642b = Boolean.valueOf(m155446r(context));
                } else if (AbstractC23171p0.m119372d()) {
                    f148642b = Boolean.valueOf(m155445q(context));
                } else if (AbstractC23171p0.m119375g()) {
                    f148642b = Boolean.valueOf(m155447s(context));
                } else {
                    f148642b = Boolean.FALSE;
                }
            }
            return f148642b.booleanValue();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: u */
    public static boolean m155449u(Context context) {
        if (Settings.Secure.getInt(context.getContentResolver(), "display_notch_status", 0) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m155450v() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
