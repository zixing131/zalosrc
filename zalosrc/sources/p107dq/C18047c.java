package p107dq;

import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dq.c */
/* loaded from: classes4.dex */
public final class C18047c {

    /* renamed from: a */
    private int f91333a;

    /* renamed from: b */
    private C18048d f91334b;

    public C18047c(int i11, int i12, int i13, int i14, int i15) {
        this.f91333a = i11;
        this.f91334b = new C18048d(new C18046b(i12, i14), new C18046b(i13, i15));
    }

    /* renamed from: a */
    public final C18048d m95922a() {
        return this.f91334b;
    }

    /* renamed from: b */
    public final int m95923b() {
        return this.f91333a;
    }

    /* renamed from: c */
    public final JSONObject m95924c() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("direction", this.f91333a);
            C18048d c18048d = this.f91334b;
            if (c18048d != null) {
                jSONObject = c18048d.m95927c();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("color", jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject2;
    }

    public C18047c(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("direction")) {
                    this.f91333a = jSONObject.getInt("direction");
                }
                if (jSONObject.has("color")) {
                    this.f91334b = new C18048d(jSONObject.getJSONObject("color"));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }
}
