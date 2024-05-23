package p090d3;

import com.adtima.Adtima;
import org.json.JSONObject;
import p009a3.C0098c;
import p148f3.C18710b;

/* renamed from: d3.b */
/* loaded from: classes2.dex */
public final class C17719b {

    /* renamed from: c */
    private static final String f89804c = "b";

    /* renamed from: a */
    public C0098c f89805a = null;

    /* renamed from: b */
    public C18710b f89806b = null;

    /* renamed from: a */
    public static C17719b m93793a(JSONObject jSONObject) {
        C17719b c17719b = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            C0098c m442g = C0098c.m442g(jSONObject.optJSONObject("adsInfo"));
            C18710b m98677a = C18710b.m98677a(jSONObject.optJSONObject("adsRender"));
            C17719b c17719b2 = new C17719b();
            try {
                c17719b2.f89805a = m442g;
                c17719b2.f89806b = m98677a;
                return c17719b2;
            } catch (Exception e11) {
                e = e11;
                c17719b = c17719b2;
                Adtima.m18329e(f89804c, "deserialize", e);
                return c17719b;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: b */
    public JSONObject m93794b() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e12) {
            e11 = e12;
            jSONObject = null;
        }
        try {
            try {
                C0098c c0098c = this.f89805a;
                if (c0098c != null) {
                    jSONObject.put("adsInfo", c0098c.m446i());
                }
            } catch (Exception e13) {
                Adtima.m18329e(f89804c, "serialize", e13);
            }
            try {
                C18710b c18710b = this.f89806b;
                if (c18710b != null) {
                    jSONObject.put("adsRender", c18710b.m98679c());
                }
            } catch (Exception e14) {
                Adtima.m18329e(f89804c, "serialize", e14);
            }
        } catch (Exception e15) {
            e11 = e15;
            Adtima.m18329e(f89804c, "serialize", e11);
            return jSONObject;
        }
        return jSONObject;
    }
}
