package au;

import android.content.Context;
import android.os.Build;
import com.zing.zalo.biometric.C7321d;

/* renamed from: au.f */
/* loaded from: classes4.dex */
public abstract class AbstractC2345f {

    /* renamed from: a */
    static Boolean f9858a;

    /* renamed from: a */
    public static boolean m12312a(Context context) {
        if (f9858a == null) {
            f9858a = Boolean.valueOf(m12313b(context));
        }
        return f9858a.booleanValue();
    }

    /* renamed from: b */
    public static boolean m12313b(Context context) {
        C7321d m37305c = C7321d.m37305c(context);
        if (Build.VERSION.SDK_INT < 23 || m37305c.m37306a(false) != 0) {
            return false;
        }
        return true;
    }
}
