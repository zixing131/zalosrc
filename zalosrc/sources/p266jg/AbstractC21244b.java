package p266jg;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import p348mi.AbstractC23309i;

/* renamed from: jg.b */
/* loaded from: classes.dex */
public abstract class AbstractC21244b {
    /* renamed from: a */
    public static boolean m110051a(double d11, double d12, double d13, float f11, float f12, float f13, float f14) {
        return (((((double) f11) * d11) + (((double) f12) * d12)) + d13) * (((d11 * ((double) f13)) + (d12 * ((double) f14))) + d13) <= 0.0d;
    }

    /* renamed from: b */
    public static int m110052b(Context context, int i11) {
        return m110053c(context.getResources().getDisplayMetrics(), i11);
    }

    /* renamed from: c */
    public static int m110053c(DisplayMetrics displayMetrics, int i11) {
        float applyDimension = TypedValue.applyDimension(1, i11, displayMetrics);
        if (applyDimension < 1.0f) {
            applyDimension = 1.0f;
        }
        return (int) applyDimension;
    }

    /* renamed from: d */
    public static boolean m110054d(Context context) {
        if (context != null && !(context instanceof Activity)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static double m110055e(double d11, double d12) {
        if (d11 < 0.0d) {
            return 0.0d;
        }
        return d11 > d12 ? d12 : d11;
    }

    /* renamed from: f */
    public static void m110056f() {
        AbstractC23309i.m121021Hp(0);
        AbstractC23309i.m121058Ip(0L);
        AbstractC23309i.m121095Jp(0L);
    }
}
