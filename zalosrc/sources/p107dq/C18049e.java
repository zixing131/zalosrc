package p107dq;

import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dq.e */
/* loaded from: classes4.dex */
public final class C18049e {

    /* renamed from: a */
    private int f91337a;

    /* renamed from: b */
    private C18045a f91338b;

    public C18049e() {
    }

    public C18049e(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("id")) {
                    this.f91337a = jSONObject.getInt("id");
                }
                if (jSONObject.has("background")) {
                    this.f91338b = new C18045a(jSONObject.getJSONObject("background"));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: a */
    public final C18045a m95928a() {
        return this.f91338b;
    }

    /* renamed from: b */
    public final int m95929b() {
        return this.f91337a;
    }

    /* renamed from: c */
    public final void m95930c(C18045a c18045a) {
        this.f91338b = c18045a;
    }

    /* renamed from: d */
    public final void m95931d(int i11) {
        this.f91337a = i11;
    }

    /* renamed from: e */
    public final JSONObject m95932e() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.f91337a);
            C18045a c18045a = this.f91338b;
            if (c18045a != null) {
                jSONObject = c18045a.m95918f();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("background", jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject2;
    }
}
