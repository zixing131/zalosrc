package p178g3;

import com.adtima.Adtima;

/* renamed from: g3.e */
/* loaded from: classes2.dex */
public abstract class AbstractC19210e {

    /* renamed from: a */
    private static final String f95652a = "e";

    /* renamed from: a */
    public static boolean m100805a(String str) {
        String str2;
        StringBuilder sb2;
        String str3;
        boolean z11 = false;
        try {
            if (Adtima.SharedContext.getPackageManager().checkPermission(str, Adtima.SharedContext.getPackageName()) == 0) {
                z11 = true;
                str2 = f95652a;
                sb2 = new StringBuilder();
                sb2.append("Permission ");
                sb2.append(str);
                str3 = " is granted";
            } else {
                str2 = f95652a;
                sb2 = new StringBuilder();
                sb2.append("Permission ");
                sb2.append(str);
                str3 = " is NOT granted";
            }
            sb2.append(str3);
            Adtima.m18328e(str2, sb2.toString());
        } catch (Exception unused) {
        }
        return z11;
    }
}
