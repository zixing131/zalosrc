package p229i5;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.C4155e;
import p289k5.C21472e;

/* renamed from: i5.u */
/* loaded from: classes.dex */
public abstract class AbstractC20300u {
    /* renamed from: a */
    public static boolean m105963a(Context context, int i11) {
        if (!m105964b(context, i11, "com.google.android.gms")) {
            return false;
        }
        try {
            return C4155e.m19594a(context).m19598b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m105964b(Context context, int i11, String str) {
        return C21472e.m111067a(context).m111066h(i11, str);
    }
}
