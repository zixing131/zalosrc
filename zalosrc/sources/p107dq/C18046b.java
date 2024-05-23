package p107dq;

import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: dq.b */
/* loaded from: classes4.dex */
public final class C18046b {

    /* renamed from: a */
    private int f91331a;

    /* renamed from: b */
    private int f91332b;

    public C18046b(int i11, int i12) {
        this.f91331a = i11;
        this.f91332b = i12;
    }

    /* renamed from: a */
    public final int m95919a() {
        return this.f91332b;
    }

    /* renamed from: b */
    public final int m95920b() {
        return this.f91331a;
    }

    /* renamed from: c */
    public final JSONObject m95921c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("l", this.f91331a);
        jSONObject.put("d", this.f91332b);
        return jSONObject;
    }

    public C18046b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("l")) {
                    this.f91331a = jSONObject.getInt("l");
                }
                if (jSONObject.has("d")) {
                    this.f91332b = jSONObject.getInt("d");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }
}
