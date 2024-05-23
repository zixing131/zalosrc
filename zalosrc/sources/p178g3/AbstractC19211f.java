package p178g3;

import android.os.Build;
import com.adtima.Adtima;

/* renamed from: g3.f */
/* loaded from: classes2.dex */
public abstract class AbstractC19211f {

    /* renamed from: a */
    private static final String f95653a = "f";

    /* renamed from: b */
    public static boolean f95654b = false;

    /* renamed from: a */
    public static boolean m100806a(int i11) {
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f95653a, "supportAtLeast", e11);
        }
        return Build.VERSION.SDK_INT >= i11;
    }

    /* renamed from: b */
    public static boolean m100807b(int i11) {
        try {
        } catch (Exception e11) {
            Adtima.m18329e(f95653a, "supportNoneAtLeast", e11);
        }
        return Build.VERSION.SDK_INT < i11;
    }
}
