package h40;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.zing.zalocore.CoreUtility;
import java.util.Iterator;
import java.util.Set;
import mm0.AbstractC23350e;
import p267jh.C21253b;

/* renamed from: h40.s1 */
/* loaded from: classes5.dex */
public abstract class AbstractC19849s1 {

    /* renamed from: a */
    static int f98012a = CoreUtility.getAppContext().getResources().getDisplayMetrics().widthPixels;

    /* renamed from: b */
    static int f98013b = CoreUtility.getAppContext().getResources().getDisplayMetrics().heightPixels;

    /* renamed from: c */
    static final Set f98014c = new C21253b();

    /* renamed from: h40.s1$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo39223a(int i11, int i12);
    }

    /* renamed from: a */
    public static void m103549a(a aVar) {
        Set set = f98014c;
        synchronized (set) {
            set.add(aVar);
        }
    }

    /* renamed from: b */
    public static int m103550b() {
        return Math.max(f98012a, f98013b);
    }

    /* renamed from: c */
    public static int m103551c() {
        return Math.min(f98012a, f98013b);
    }

    /* renamed from: d */
    public static Point m103552d() {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        Point point = new Point();
        try {
            WindowManager windowManager = (WindowManager) CoreUtility.getAppContext().getSystemService("window");
            if (Build.VERSION.SDK_INT >= 30) {
                maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
                bounds = maximumWindowMetrics.getBounds();
                AbstractC23350e.m122772b("--------", new Object[0]);
                AbstractC23350e.m122772b("getRealScreenSize " + bounds, new Object[0]);
                AbstractC23350e.m122772b("getRealScreenSize before " + point, new Object[0]);
                point.x = bounds.right - bounds.left;
                point.y = bounds.bottom - bounds.top;
                AbstractC23350e.m122772b("getRealScreenSize after " + point, new Object[0]);
                AbstractC23350e.m122772b("--------", new Object[0]);
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return point;
    }

    /* renamed from: e */
    public static void m103553e(a aVar) {
        Set set = f98014c;
        synchronized (set) {
            set.remove(aVar);
        }
    }

    /* renamed from: f */
    public static void m103554f(int i11, int i12) {
        if (i11 != 0 && i12 != 0) {
            if (f98012a == i11 && f98013b == i12) {
                f98012a = i11;
                f98013b = i12;
                return;
            }
            f98012a = i11;
            f98013b = i12;
            Set set = f98014c;
            synchronized (set) {
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).mo39223a(i11, i12);
                    }
                } finally {
                }
            }
        }
    }
}
