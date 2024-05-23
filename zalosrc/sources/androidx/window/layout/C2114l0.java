package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import fn0.AbstractC19074t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.window.layout.l0 */
/* loaded from: classes2.dex */
public final class C2114l0 implements InterfaceC2108i0 {

    /* renamed from: b */
    public static final C2114l0 f8979b = new C2114l0();

    /* renamed from: c */
    private static final String f8980c;

    static {
        String simpleName = C2114l0.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f8980c = simpleName;
    }

    private C2114l0() {
    }

    /* renamed from: f */
    private final DisplayCutout m11353f(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (AbstractC2110j0.m11347a(obj)) {
                return AbstractC2112k0.m11352a(obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: g */
    private final int m11354g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: i */
    private final void m11355i(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.InterfaceC2108i0
    /* renamed from: a */
    public C2104g0 mo11343a(Activity activity) {
        Rect m11356b;
        AbstractC19074t.m100208f(activity, "activity");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            m11356b = C2099e.f8970a.m11335a(activity);
        } else if (i11 >= 29) {
            m11356b = m11359e(activity);
        } else if (i11 >= 28) {
            m11356b = m11358d(activity);
        } else if (i11 >= 24) {
            m11356b = m11357c(activity);
        } else {
            m11356b = m11356b(activity);
        }
        return new C2104g0(m11356b);
    }

    /* renamed from: b */
    public final Rect m11356b(Activity activity) {
        int i11;
        AbstractC19074t.m100208f(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        AbstractC19074t.m100207e(defaultDisplay, "defaultDisplay");
        Point m11360h = m11360h(defaultDisplay);
        Rect rect = new Rect();
        int i12 = m11360h.x;
        if (i12 != 0 && (i11 = m11360h.y) != 0) {
            rect.right = i12;
            rect.bottom = i11;
        } else {
            defaultDisplay.getRectSize(rect);
        }
        return rect;
    }

    /* renamed from: c */
    public final Rect m11357c(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C2093b.f8959a.m11327a(activity)) {
            AbstractC19074t.m100207e(defaultDisplay, "defaultDisplay");
            Point m11360h = m11360h(defaultDisplay);
            int m11354g = m11354g(activity);
            int i11 = rect.bottom;
            if (i11 + m11354g == m11360h.y) {
                rect.bottom = i11 + m11354g;
            } else {
                int i12 = rect.right;
                if (i12 + m11354g == m11360h.x) {
                    rect.right = i12 + m11354g;
                }
            }
        }
        return rect;
    }

    /* renamed from: d */
    public final Rect m11358d(Activity activity) {
        DisplayCutout m11353f;
        AbstractC19074t.m100208f(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C2093b.f8959a.m11327a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (IllegalAccessException unused) {
            m11355i(activity, rect);
        } catch (NoSuchFieldException unused2) {
            m11355i(activity, rect);
        } catch (NoSuchMethodException unused3) {
            m11355i(activity, rect);
        } catch (InvocationTargetException unused4) {
            m11355i(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C2101f c2101f = C2101f.f8971a;
        AbstractC19074t.m100207e(defaultDisplay, "currentDisplay");
        c2101f.m11336a(defaultDisplay, point);
        C2093b c2093b = C2093b.f8959a;
        if (!c2093b.m11327a(activity)) {
            int m11354g = m11354g(activity);
            int i11 = rect.bottom;
            if (i11 + m11354g == point.y) {
                rect.bottom = i11 + m11354g;
            } else {
                int i12 = rect.right;
                if (i12 + m11354g == point.x) {
                    rect.right = i12 + m11354g;
                } else if (rect.left == m11354g) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c2093b.m11327a(activity) && (m11353f = m11353f(defaultDisplay)) != null) {
            int i13 = rect.left;
            C2111k c2111k = C2111k.f8978a;
            if (i13 == c2111k.m11349b(m11353f)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c2111k.m11350c(m11353f)) {
                rect.right += c2111k.m11350c(m11353f);
            }
            if (rect.top == c2111k.m11351d(m11353f)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c2111k.m11348a(m11353f)) {
                rect.bottom += c2111k.m11348a(m11353f);
            }
        }
        return rect;
    }

    /* renamed from: e */
    public final Rect m11359e(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException unused) {
            return m11358d(activity);
        } catch (NoSuchFieldException unused2) {
            return m11358d(activity);
        } catch (NoSuchMethodException unused3) {
            return m11358d(activity);
        } catch (InvocationTargetException unused4) {
            return m11358d(activity);
        }
    }

    /* renamed from: h */
    public final Point m11360h(Display display) {
        AbstractC19074t.m100208f(display, "display");
        Point point = new Point();
        C2101f.f8971a.m11336a(display, point);
        return point;
    }
}
