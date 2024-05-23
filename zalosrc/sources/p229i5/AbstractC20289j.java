package p229i5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.AbstractC4150d;

/* renamed from: i5.j */
/* loaded from: classes.dex */
public abstract class AbstractC20289j {

    /* renamed from: a */
    private static Boolean f100238a;

    /* renamed from: b */
    private static Boolean f100239b;

    /* renamed from: c */
    private static Boolean f100240c;

    /* renamed from: d */
    private static Boolean f100241d;

    /* renamed from: e */
    private static Boolean f100242e;

    /* renamed from: f */
    private static Boolean f100243f;

    /* renamed from: a */
    public static boolean m105927a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f100242e == null) {
            boolean z11 = false;
            if (AbstractC20295p.m105955i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z11 = true;
            }
            f100242e = Boolean.valueOf(z11);
        }
        return f100242e.booleanValue();
    }

    /* renamed from: b */
    public static boolean m105928b(Context context) {
        if (f100243f == null) {
            boolean z11 = false;
            if (AbstractC20295p.m105958l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z11 = true;
            }
            f100243f = Boolean.valueOf(z11);
        }
        return f100243f.booleanValue();
    }

    /* renamed from: c */
    public static boolean m105929c(Context context) {
        if (f100240c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z11 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z11 = true;
            }
            f100240c = Boolean.valueOf(z11);
        }
        return f100240c.booleanValue();
    }

    /* renamed from: d */
    public static boolean m105930d(Context context) {
        return m105934h(context);
    }

    /* renamed from: e */
    public static boolean m105931e() {
        int i11 = AbstractC4150d.f16480a;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: f */
    public static boolean m105932f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f100238a == null) {
            boolean z11 = false;
            if (AbstractC20295p.m105951e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z11 = true;
            }
            f100238a = Boolean.valueOf(z11);
        }
        return f100238a.booleanValue();
    }

    /* renamed from: g */
    public static boolean m105933g(Context context) {
        if (!m105932f(context) || AbstractC20295p.m105954h()) {
            if (m105934h(context)) {
                if (!AbstractC20295p.m105955i() || AbstractC20295p.m105958l()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m105934h(Context context) {
        if (f100239b == null) {
            boolean z11 = false;
            if (AbstractC20295p.m105952f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z11 = true;
            }
            f100239b = Boolean.valueOf(z11);
        }
        return f100239b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m105935i(Context context) {
        if (f100241d == null) {
            boolean z11 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z11 = false;
            }
            f100241d = Boolean.valueOf(z11);
        }
        return f100241d.booleanValue();
    }
}
