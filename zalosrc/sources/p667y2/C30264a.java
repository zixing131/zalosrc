package p667y2;

import com.adtima.Adtima;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p144f.AbstractC18681a;

/* renamed from: y2.a */
/* loaded from: classes2.dex */
public final class C30264a extends AbstractC18681a {

    /* renamed from: d */
    private static final String f140604d = "a";

    /* renamed from: e */
    private static final String f140605e;

    /* renamed from: f */
    private static final String f140606f;

    /* renamed from: g */
    private static final String f140607g;

    /* renamed from: h */
    private static C30264a f140608h;

    static {
        String simpleName = C30264a.class.getSimpleName();
        f140605e = simpleName + "-SAVEDREPORTADBLOCK";
        f140606f = simpleName + "-TIMEREPORTADBLOCK";
        f140607g = simpleName + "-DECTECTEDADBLOCK";
        f140608h = null;
    }

    private C30264a() {
        m98583b(Adtima.SharedContext, C30264a.class);
    }

    /* renamed from: k */
    public static C30264a m149320k() {
        if (f140608h == null) {
            f140608h = new C30264a();
        }
        return f140608h;
    }

    /* renamed from: e */
    public boolean m149321e(long j11) {
        try {
            return m98585d(f140606f, String.valueOf(j11), 0L);
        } catch (Exception e11) {
            Adtima.m18328e(f140604d, e11.toString());
            return false;
        }
    }

    /* renamed from: f */
    public boolean m149322f(HashMap hashMap) {
        try {
            return m98585d(f140605e, new JSONObject(hashMap).toString(), 0L);
        } catch (Exception e11) {
            Adtima.m18328e(f140604d, e11.toString());
            return false;
        }
    }

    /* renamed from: g */
    public boolean m149323g(boolean z11) {
        try {
            return m98585d(f140607g, z11 ? "TRUE" : "FALSE", 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    public boolean m149324h() {
        boolean z11;
        try {
            z11 = m98585d(f140605e, "", 0L);
        } catch (Exception e11) {
            Adtima.m18328e(f140604d, e11.toString());
            z11 = false;
        }
        Adtima.m18328e(f140604d, "clearAdsBlockData");
        return z11;
    }

    /* renamed from: i */
    public HashMap m149325i() {
        HashMap hashMap = new HashMap();
        try {
            String m98582a = m98582a(f140605e);
            if (m98582a != null && !m98582a.equals("")) {
                JSONObject jSONObject = new JSONObject(m98582a);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, (String) jSONObject.get(next));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: j */
    public boolean m149326j() {
        try {
            String m98582a = m98582a(f140607g);
            if (m98582a != null) {
                if (m98582a.equals("TRUE")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: l */
    public long m149327l() {
        try {
            return Long.parseLong(m98582a(f140606f));
        } catch (Exception e11) {
            Adtima.m18328e(f140604d, e11.toString());
            return 0L;
        }
    }
}
