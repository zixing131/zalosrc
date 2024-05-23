package is;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: is.f */
/* loaded from: classes.dex */
public final class C20793f {

    /* renamed from: a */
    public static final C20793f f102166a;

    /* renamed from: b */
    private static boolean f102167b;

    /* renamed from: c */
    private static boolean f102168c;

    /* renamed from: d */
    private static boolean f102169d;

    static {
        C20793f c20793f = new C20793f();
        f102166a = c20793f;
        f102167b = true;
        String m3587Y = AbstractC0924m0.m3587Y();
        if (m3587Y == null) {
            m3587Y = "";
        }
        c20793f.m108494d(m3587Y, false);
    }

    private C20793f() {
    }

    /* renamed from: a */
    public final boolean m108491a() {
        return f102169d;
    }

    /* renamed from: b */
    public final boolean m108492b() {
        return f102167b;
    }

    /* renamed from: c */
    public final boolean m108493c() {
        return f102168c;
    }

    /* renamed from: d */
    public final void m108494d(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "str");
        try {
            if (str.length() > 0) {
                m108495e(new JSONObject(str), z11);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m108495e(JSONObject jSONObject, boolean z11) {
        boolean z12;
        boolean z13;
        if (jSONObject == null) {
            return;
        }
        try {
            boolean z14 = false;
            if (jSONObject.optInt("enable_tabdiscovery", 0) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f102168c = z12;
            if (jSONObject.optInt("enable_streamline", 0) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            f102169d = z13;
            if (jSONObject.optInt("enable_global_search", 0) == 1) {
                z14 = true;
            }
            f102167b = z14;
            if (z11) {
                AbstractC0924m0.m3138Ie(jSONObject.toString());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
