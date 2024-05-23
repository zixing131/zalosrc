package im;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.AbstractC20216t;
import p227i3.C20215s;
import p227i3.C20218v;
import p227i3.C20219w;
import p667y2.C30268e;
import p667y2.C30271h;

/* renamed from: im.e */
/* loaded from: classes3.dex */
public final class C20614e {

    /* renamed from: a */
    public static final C20614e f101387a = new C20614e();

    private C20614e() {
    }

    /* renamed from: a */
    public static final String m107303a(String str) {
        AbstractC19074t.m100208f(str, "srcLog");
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("hid", 1);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return str;
        }
    }

    /* renamed from: b */
    public static final JSONObject m107304b(C20620k c20620k) {
        JSONObject jSONObject = new JSONObject();
        if (c20620k != null) {
            try {
                jSONObject.put("ct", c20620k.m107332c());
                jSONObject.put("di", c20620k.m107335f() ? 1 : 0);
                jSONObject.put(C30268e.f140632a, c20620k.m107333d());
                jSONObject.put(C30271h.f140642d, c20620k.m107336g());
                jSONObject.put("la", c20620k.m107337h());
                jSONObject.put("lo", c20620k.m107338i());
                jSONObject.put("po", c20620k.m107339j());
                jSONObject.put(C20215s.f99966b, c20620k.m107341l());
                jSONObject.put(AbstractC20216t.f99969a, c20620k.m107342m());
                jSONObject.put(C20219w.f100062c, c20620k.m107348s());
                jSONObject.put("ss", c20620k.m107340k());
                jSONObject.put("an", c20620k.m107331b());
                jSONObject.put("scsh", c20620k.m107349t() ? 1 : 0);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static final String m107305c(int i11, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", 0);
            jSONObject.put("data_source", i11);
            AbstractC20110a.f98889a.mo104548a(jSONObject.put("idl", z11 ? 1 : 0).toString(), new Object[0]);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: d */
    public static final String m107306d(String str, int i11) {
        AbstractC19074t.m100208f(str, "srcLog");
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("ds", i11);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return str;
        }
    }

    /* renamed from: e */
    public static final String m107307e(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "srcLog");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(C20218v.f100059b)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(C20218v.f100059b);
                jSONObject2.put("ic", z11 ? 1 : 0);
                jSONObject.put(C20218v.f100059b, jSONObject2);
                String jSONObject3 = jSONObject.toString();
                AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                return jSONObject3;
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return str;
    }
}
