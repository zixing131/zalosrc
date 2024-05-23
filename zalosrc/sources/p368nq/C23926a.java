package p368nq;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: nq.a */
/* loaded from: classes4.dex */
public final class C23926a {

    /* renamed from: a */
    public static final C23926a f115594a = new C23926a();

    /* renamed from: b */
    private static boolean f115595b;

    /* renamed from: c */
    private static boolean f115596c;

    private C23926a() {
    }

    /* renamed from: a */
    public final void m125052a(String str) {
        AbstractC19074t.m100208f(str, "jsonString");
        try {
            if (str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                m125058g(jSONObject.getBoolean("has_user_album"));
                m125057f(jSONObject.getBoolean("has_requested_data"));
            } else {
                m125058g(false);
                m125057f(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final boolean m125053b() {
        return f115595b;
    }

    /* renamed from: c */
    public final void m125054c() {
        String m4010m4 = AbstractC0924m0.m4010m4();
        AbstractC19074t.m100205c(m4010m4);
        m125052a(m4010m4);
    }

    /* renamed from: d */
    public final void m125055d() {
        m125057f(false);
        m125058g(false);
        m125056e();
    }

    /* renamed from: e */
    public final void m125056e() {
        AbstractC0924m0.m3406Rl(m125060i());
    }

    /* renamed from: f */
    public final void m125057f(boolean z11) {
        f115596c = z11;
        m125056e();
    }

    /* renamed from: g */
    public final void m125058g(boolean z11) {
        f115595b = z11;
        m125056e();
    }

    /* renamed from: h */
    public final boolean m125059h() {
        return !f115596c;
    }

    /* renamed from: i */
    public final String m125060i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("has_user_album", f115595b);
        jSONObject.put("has_requested_data", f115596c);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
