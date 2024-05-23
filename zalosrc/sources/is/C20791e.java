package is;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: is.e */
/* loaded from: classes4.dex */
public final class C20791e {

    /* renamed from: a */
    public static final C20791e f102159a;

    /* renamed from: b */
    private static String f102160b;

    /* renamed from: c */
    private static String f102161c;

    /* renamed from: d */
    private static boolean f102162d;

    /* renamed from: e */
    private static boolean f102163e;

    static {
        C20791e c20791e = new C20791e();
        f102159a = c20791e;
        f102160b = "17193";
        f102161c = "17194";
        f102162d = true;
        f102163e = true;
        String m3413S = AbstractC0924m0.m3413S();
        if (m3413S == null) {
            m3413S = "";
        }
        c20791e.m108489e(m3413S, false);
    }

    private C20791e() {
    }

    /* renamed from: a */
    public final String m108485a() {
        return f102161c;
    }

    /* renamed from: b */
    public final String m108486b() {
        return f102160b;
    }

    /* renamed from: c */
    public final boolean m108487c() {
        return f102162d;
    }

    /* renamed from: d */
    public final boolean m108488d() {
        return f102163e;
    }

    /* renamed from: e */
    public final void m108489e(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "str");
        try {
            if (str.length() > 0) {
                m108490f(new JSONObject(str), z11);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m108490f(JSONObject jSONObject, boolean z11) {
        boolean z12;
        if (jSONObject == null) {
            return;
        }
        try {
            String optString = jSONObject.optString("lottie_light", f102160b);
            AbstractC19074t.m100207e(optString, "optString(...)");
            f102160b = optString;
            String optString2 = jSONObject.optString("lottie_dark", f102161c);
            AbstractC19074t.m100207e(optString2, "optString(...)");
            f102161c = optString2;
            boolean z13 = false;
            if (jSONObject.optInt("enable_compose", 0) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f102162d = z12;
            if (jSONObject.optInt("enable_view", 0) == 1) {
                z13 = true;
            }
            f102163e = z13;
            AbstractC0924m0.m2964Ce(jSONObject.toString());
            if (f102162d && z11) {
                AbstractC0924m0.m2995Dg(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
