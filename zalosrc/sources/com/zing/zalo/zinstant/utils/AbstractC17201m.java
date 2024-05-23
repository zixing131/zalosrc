package com.zing.zalo.zinstant.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.URLUtil;
import com.zing.zalo.zinstant.AbstractC17158i1;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.zing.zalo.zinstant.utils.m */
/* loaded from: classes.dex */
public abstract class AbstractC17201m {
    /* renamed from: a */
    public static boolean m91809a(AtomicBoolean... atomicBooleanArr) {
        if (atomicBooleanArr == null) {
            return true;
        }
        for (AtomicBoolean atomicBoolean : atomicBooleanArr) {
            if (atomicBoolean != null && !atomicBoolean.get()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m91810b(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m91811c() {
        Object systemService;
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        Rect bounds2;
        if (Build.VERSION.SDK_INT >= 30) {
            Context m91742a = AbstractC17158i1.m91742a();
            systemService = m91742a.getSystemService((Class<Object>) WindowManager.class);
            maximumWindowMetrics = ((WindowManager) systemService).getMaximumWindowMetrics();
            if (m91820l(m91742a)) {
                bounds2 = maximumWindowMetrics.getBounds();
                return bounds2.height();
            }
            bounds = maximumWindowMetrics.getBounds();
            return bounds.width();
        }
        Display defaultDisplay = ((WindowManager) AbstractC17158i1.m91742a().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return Math.min(point.y, point.x);
    }

    /* renamed from: d */
    public static float m91812d() {
        return AbstractC17158i1.f87697g;
    }

    /* renamed from: e */
    public static float m91813e() {
        return AbstractC17158i1.f87696f;
    }

    /* renamed from: f */
    public static int m91814f() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: g */
    public static int m91815g() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: h */
    public static int m91816h(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: i */
    public static float m91817i() {
        return AbstractC17158i1.f87695e;
    }

    /* renamed from: j */
    public static int m91818j(Object... objArr) {
        int hashCode;
        if (objArr == null) {
            return 0;
        }
        int i11 = 1;
        for (Object obj : objArr) {
            int i12 = (i11 << 5) - i11;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i11 = hashCode + i12;
        }
        return i11;
    }

    /* renamed from: k */
    public static boolean m91819k(String[] strArr, int i11) {
        int i12;
        if (i11 < 0) {
            return false;
        }
        for (String str : strArr) {
            String[] split = str.split("-");
            if (split.length <= 2) {
                try {
                    int parseInt = Integer.parseInt(split[0].trim());
                    if (split.length == 2) {
                        i12 = Integer.parseInt(split[1].trim());
                    } else {
                        i12 = parseInt;
                    }
                    if (parseInt <= i12 && i11 >= parseInt && i11 <= i12) {
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    private static boolean m91820l(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m91821m(String str) {
        if (!URLUtil.isValidUrl(str) && !C17205q.m91839b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m91822n(View view, Rect rect) {
        if (view == null || !view.isShown() || !view.getGlobalVisibleRect(rect) || rect.bottom - rect.top <= 0 || rect.right - rect.left <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static void m91823o(String str, String str2, Throwable th2) {
    }

    /* renamed from: p */
    public static void m91824p(String str, String str2, Throwable th2) {
        m91825q(6, str, str2, th2);
    }

    /* renamed from: q */
    private static void m91825q(int i11, String str, String str2, Throwable th2) {
        AbstractC20110a.m104543l(str).mo104557p(i11, th2, str2, new Object[0]);
    }

    /* renamed from: r */
    public static float m91826r(float f11) {
        return (float) Math.ceil(f11 / AbstractC17158i1.f87696f);
    }

    /* renamed from: s */
    public static float m91827s(float f11) {
        return m91826r(m91829u(f11));
    }

    /* renamed from: t */
    public static float m91828t(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return AbstractC17158i1.f87696f * f11;
    }

    /* renamed from: u */
    public static float m91829u(float f11) {
        return AbstractC17158i1.f87695e * f11;
    }
}
