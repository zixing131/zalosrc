package p254j3;

import com.adtima.Adtima;
import p009a3.C0101f;
import p116e.C18151b;
import p116e.C18153d;
import p227i3.AbstractC20202f;

/* renamed from: j3.a */
/* loaded from: classes2.dex */
final class C20910a {

    /* renamed from: a */
    public static final String f102736a = "a";

    /* renamed from: b */
    private static C20910a f102737b;

    private C20910a() {
    }

    /* renamed from: a */
    public static C20910a m109380a() {
        if (f102737b == null) {
            f102737b = new C20910a();
        }
        return f102737b;
    }

    /* renamed from: b */
    public boolean m109381b(String str, String str2, String str3) {
        String str4;
        try {
            C18153d m109384e = m109384e();
            if (str3 != null && str3.trim().length() != 0) {
                str4 = str + "-" + str2 + "-" + str3;
                m109384e.m96448c(str4, null);
                return true;
            }
            str4 = str + "-" + str2;
            m109384e.m96448c(str4, null);
            return true;
        } catch (Exception e11) {
            Adtima.m18329e(f102736a, "updateNativeServeCache", e11);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m109382c(String str, String str2, String str3, C0101f c0101f) {
        String str4;
        try {
            C18153d m109384e = m109384e();
            if (str3 != null && str3.trim().length() != 0) {
                str4 = str + "-" + str2 + "-" + str3;
                m109384e.m96449d(str4, c0101f, AbstractC20202f.f99811g);
                return true;
            }
            str4 = str + "-" + str2;
            m109384e.m96449d(str4, c0101f, AbstractC20202f.f99811g);
            return true;
        } catch (Exception e11) {
            Adtima.m18329e(f102736a, "setNativeServeCache", e11);
            return false;
        }
    }

    /* renamed from: d */
    public C0101f m109383d(String str, String str2, String str3) {
        String str4;
        try {
            C18153d m109384e = m109384e();
            if (str3 != null && str3.trim().length() != 0) {
                str4 = str + "-" + str2 + "-" + str3;
                return (C0101f) m109384e.m96447b(str4);
            }
            str4 = str + "-" + str2;
            return (C0101f) m109384e.m96447b(str4);
        } catch (Exception e11) {
            Adtima.m18329e(f102736a, "getNativeServeCache", e11);
            return null;
        }
    }

    /* renamed from: e */
    public C18153d m109384e() {
        try {
            return C18151b.m96441a().m96442b(f102736a, 4194304);
        } catch (Exception e11) {
            Adtima.m18329e(f102736a, "getLRUCacheAdapter", e11);
            return null;
        }
    }

    /* renamed from: f */
    public boolean m109385f(String str, String str2, String str3, C0101f c0101f) {
        String str4;
        try {
            C18153d m109384e = m109384e();
            if (str3 != null && str3.trim().length() != 0) {
                str4 = str + "-" + str2 + "-" + str3;
                m109384e.m96450e(str4, c0101f);
                return true;
            }
            str4 = str + "-" + str2;
            m109384e.m96450e(str4, c0101f);
            return true;
        } catch (Exception e11) {
            Adtima.m18329e(f102736a, "updateNativeServeCache", e11);
            return false;
        }
    }
}
