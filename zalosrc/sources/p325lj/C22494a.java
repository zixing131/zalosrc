package p325lj;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: lj.a */
/* loaded from: classes3.dex */
public final class C22494a {

    /* renamed from: a */
    public static final C22494a f110026a;

    /* renamed from: b */
    private static boolean f110027b;

    /* renamed from: c */
    private static String f110028c;

    /* renamed from: d */
    private static boolean f110029d;

    static {
        C22494a c22494a = new C22494a();
        f110026a = c22494a;
        f110028c = "";
        try {
            String m3705c = AbstractC0924m0.m3705c();
            if (m3705c != null && m3705c.length() != 0) {
                c22494a.m116284e(new JSONObject(m3705c));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    private C22494a() {
    }

    /* renamed from: e */
    private final void m116284e(JSONObject jSONObject) {
        boolean z11;
        try {
            boolean z12 = false;
            if (jSONObject.optInt("enable", 0) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            f110027b = z11;
            String optString = jSONObject.optString("mini_app_url", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            f110028c = optString;
            if (jSONObject.optInt("show_beta", 0) > 0) {
                z12 = true;
            }
            f110029d = z12;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f */
    private final void m116285f() {
        f110027b = false;
        f110028c = "";
        f110029d = false;
    }

    /* renamed from: a */
    public final void m116286a(JSONObject jSONObject) {
        C24848g0 c24848g0;
        String str;
        if (jSONObject != null) {
            f110026a.m116284e(jSONObject);
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            m116285f();
        }
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        AbstractC0924m0.m3021Ed(str);
    }

    /* renamed from: b */
    public final boolean m116287b() {
        return f110027b;
    }

    /* renamed from: c */
    public final String m116288c() {
        return f110028c;
    }

    /* renamed from: d */
    public final boolean m116289d() {
        return f110029d;
    }
}
