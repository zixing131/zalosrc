package p227i3;

import com.adtima.Adtima;
import p667y2.C30267d;

/* renamed from: i3.x */
/* loaded from: classes2.dex */
public final class C20220x {

    /* renamed from: a */
    private static final String f100066a = "x";

    /* renamed from: b */
    private static C20220x f100067b;

    private C20220x() {
    }

    /* renamed from: a */
    private String m105655a() {
        try {
            String m105374k = C20205i.m105364t().m105374k(AbstractC20202f.f99786N, "");
            return AbstractC20202f.f99832q0 ? AbstractC20198b.m105331g(m105374k, true) : C20204h.m105354a().m105355b(m105374k);
        } catch (Exception e11) {
            Adtima.m18329e(f100066a, "getEncUserDataFromBuilder", e11);
            return null;
        }
    }

    /* renamed from: c */
    public static C20220x m105656c() {
        if (f100067b == null) {
            f100067b = new C20220x();
        }
        return f100067b;
    }

    /* renamed from: b */
    public String m105657b() {
        try {
            String m149366w = C30267d.m149339A().m149366w();
            if (m149366w == null || m149366w.length() == 0) {
                m149366w = m105655a();
                if (m149366w == null || m149366w.length() == 0) {
                    return "__ENCRYPT_FAILED__";
                }
                C30267d.m149339A().m149365v(m149366w);
            }
            return m149366w;
        } catch (Exception e11) {
            Adtima.m18329e(f100066a, "getEncUserData", e11);
            return "__ENCRYPT_FAILED__";
        }
    }
}
