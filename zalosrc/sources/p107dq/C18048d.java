package p107dq;

import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dq.d */
/* loaded from: classes4.dex */
public final class C18048d {

    /* renamed from: a */
    private C18046b f91335a;

    /* renamed from: b */
    private C18046b f91336b;

    public C18048d(C18046b c18046b, C18046b c18046b2) {
        this.f91335a = c18046b;
        this.f91336b = c18046b2;
    }

    /* renamed from: a */
    public final C18046b m95925a() {
        return this.f91336b;
    }

    /* renamed from: b */
    public final C18046b m95926b() {
        return this.f91335a;
    }

    /* renamed from: c */
    public final JSONObject m95927c() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            C18046b c18046b = this.f91335a;
            JSONObject jSONObject3 = null;
            if (c18046b != null) {
                jSONObject = c18046b.m95921c();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("start", jSONObject);
            C18046b c18046b2 = this.f91336b;
            if (c18046b2 != null) {
                jSONObject3 = c18046b2.m95921c();
            }
            jSONObject2.put("end", jSONObject3);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject2;
    }

    public C18048d(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("start")) {
                    this.f91335a = new C18046b(jSONObject.getJSONObject("start"));
                }
                if (jSONObject.has("end")) {
                    this.f91336b = new C18046b(jSONObject.getJSONObject("end"));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }
}
