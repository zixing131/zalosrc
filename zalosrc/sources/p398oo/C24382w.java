package p398oo;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: oo.w */
/* loaded from: classes4.dex */
public final class C24382w {

    /* renamed from: a */
    private C24378s f117744a;

    public C24382w() {
        String m4040n4 = AbstractC0924m0.m4040n4();
        AbstractC19074t.m100207e(m4040n4, "getPrioritizeTimelineConfig(...)");
        this.f117744a = m127521g(m4040n4);
    }

    /* renamed from: c */
    private final JSONObject m127520c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", this.f117744a.m127502b());
            jSONObject.put("time_delay_show_reddot", this.f117744a.m127503c());
            jSONObject.put("enable_icon_move", this.f117744a.m127501a());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    /* renamed from: g */
    private final C24378s m127521g(String str) {
        if (str.length() > 0) {
            return m127522i(str);
        }
        return new C24378s(0, 0, 0, 7, null);
    }

    /* renamed from: i */
    private final C24378s m127522i(String str) {
        try {
            return m127523j(new JSONObject(str));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return new C24378s(0, 0, 0, 7, null);
        }
    }

    /* renamed from: j */
    private final C24378s m127523j(JSONObject jSONObject) {
        C24378s c24378s = new C24378s(0, 0, 0, 7, null);
        try {
            if (jSONObject.has("enable")) {
                c24378s.m127505e(jSONObject.optInt("enable"));
            }
            if (jSONObject.has("time_delay_show_reddot")) {
                c24378s.m127506f(jSONObject.optInt("time_delay_show_reddot"));
            }
            if (jSONObject.has("enable_icon_move")) {
                c24378s.m127504d(jSONObject.optInt("enable_icon_move"));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return c24378s;
    }

    /* renamed from: k */
    private final void m127524k() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: oo.v
            @Override // java.lang.Runnable
            public final void run() {
                C24382w.m127525l(C24382w.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m127525l(C24382w c24382w) {
        AbstractC19074t.m100208f(c24382w, "this$0");
        String jSONObject = c24382w.m127520c().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        AbstractC0924m0.m3435Sl(jSONObject);
    }

    /* renamed from: b */
    public final void m127526b() {
        this.f117744a = new C24378s(0, 0, 0, 7, null);
        m127524k();
    }

    /* renamed from: d */
    public final boolean m127527d() {
        if (this.f117744a.m127501a() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m127528e() {
        if (this.f117744a.m127502b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m127529f() {
        return this.f117744a.m127503c();
    }

    /* renamed from: h */
    public final void m127530h(String str) {
        AbstractC19074t.m100208f(str, "configString");
        this.f117744a = m127521g(str);
        m127524k();
    }
}
