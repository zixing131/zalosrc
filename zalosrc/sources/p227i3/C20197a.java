package p227i3;

import android.content.Context;
import android.os.Bundle;
import com.adtima.Adtima;
import p009a3.C0097b;
import p178g3.C19206a;

/* renamed from: i3.a */
/* loaded from: classes2.dex */
public class C20197a {

    /* renamed from: b */
    private static final String f99749b = "a";

    /* renamed from: c */
    private static C20197a f99750c;

    /* renamed from: a */
    private Context f99751a;

    private C20197a(Context context) {
        this.f99751a = context;
    }

    /* renamed from: a */
    public static C20197a m105323a(Context context) {
        if (f99750c == null) {
            f99750c = new C20197a(context);
        }
        return f99750c;
    }

    /* renamed from: b */
    public String m105324b() {
        try {
            String m105380x = C20205i.m105364t().m105380x();
            C0097b m105518m = C20215s.m105509k().m105518m();
            int i11 = m105518m == null ? 1 : m105518m.f460a;
            String packageName = this.f99751a.getPackageName();
            String m105657b = C20220x.m105656c().m105657b();
            String m100794a = C19206a.m100793b().m100794a();
            String m105381y = C20205i.m105364t().m105381y();
            Bundle bundle = new Bundle();
            bundle.putString("deviceId", m105380x);
            bundle.putString("sdkVer", String.valueOf(Adtima.SDK_VERSION_CODE));
            bundle.putString("sdkName", Adtima.SDK_VERSION_NAME);
            bundle.putString("sdkBuild", Adtima.SDK_BUILD_NUMBER);
            bundle.putString("templateVer", String.valueOf(i11));
            bundle.putString("appId", packageName);
            bundle.putString("appVer", m100794a);
            bundle.putString("zaloSdkVer", m105381y);
            bundle.putString("udata", m105657b);
            String str = AbstractC20202f.f99816i0;
            if (str != null && str.length() != 0) {
                bundle.putString("siteId", AbstractC20202f.f99816i0);
            }
            String m105504s = C20214r.m105487b().m105504s(AbstractC20206j.m105387c(), bundle, 2);
            if (m105504s != null) {
                if (m105504s.length() != 0) {
                    return m105504s;
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99749b, "getAdsPreload", e11);
        }
        return null;
    }
}
