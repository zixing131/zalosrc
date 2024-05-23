package p227i3;

import android.content.Context;
import com.adtima.Adtima;
import p009a3.C0100e;

/* renamed from: i3.t */
/* loaded from: classes2.dex */
public abstract class AbstractC20216t {

    /* renamed from: a */
    public static final String f99969a = "t";

    /* renamed from: a */
    public static C0100e m105520a(Context context) {
        C0100e c0100e = new C0100e();
        try {
            c0100e.f572a = m105523d(context);
            c0100e.f573b = m105521b(context);
            c0100e.f574c = m105522c(context);
        } catch (Exception e11) {
            Adtima.m18329e(f99969a, "getScreenConfig", e11);
        }
        return c0100e;
    }

    /* renamed from: b */
    public static int m105521b(Context context) {
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e11) {
            Adtima.m18329e(f99969a, "getScreenHeight", e11);
            return 0;
        }
    }

    /* renamed from: c */
    public static int m105522c(Context context) {
        try {
            return context.getResources().getConfiguration().orientation;
        } catch (Exception e11) {
            Adtima.m18329e(f99969a, "getScreenOrientation", e11);
            return 0;
        }
    }

    /* renamed from: d */
    public static int m105523d(Context context) {
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e11) {
            Adtima.m18329e(f99969a, "getScreenWidth", e11);
            return 0;
        }
    }
}
