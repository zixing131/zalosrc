package p659xv;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.os.Build;
import fn0.AbstractC19074t;
import jm.AbstractC21289a;

/* renamed from: xv.l */
/* loaded from: classes4.dex */
public final class C30213l {
    /* renamed from: a */
    private final int m148998a(Context context) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            systemAvailableFeatures = new FeatureInfo[0];
        }
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name == null) {
                int i11 = featureInfo.reqGlEsVersion;
                if (i11 == 0) {
                    return 65536;
                }
                return i11;
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean m148999b(C30212k c30212k, Context context) {
        AbstractC19074t.m100208f(c30212k, "requirement");
        AbstractC19074t.m100208f(context, "context");
        C30207e c30207e = new C30207e(m148998a(context));
        int m110247a = AbstractC21289a.Companion.m110247a();
        int i11 = Build.VERSION.SDK_INT;
        if (m110247a != 0 && i11 >= c30212k.m148995a() && c30207e.compareTo(c30212k.m148997c()) >= 0 && m110247a >= c30212k.m148996b()) {
            return true;
        }
        return false;
    }
}
