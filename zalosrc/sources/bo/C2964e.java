package bo;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import vg.C28227x3;

/* renamed from: bo.e */
/* loaded from: classes4.dex */
public final class C2964e extends AbstractC2959d {

    /* renamed from: e */
    private long f11688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2964e(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f11688e = jSONObject.optLong("photoid");
    }

    @Override // bo.AbstractC2959d
    /* renamed from: i */
    public JSONObject mo14018i() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("photoid", this.f11688e);
        jSONObject2.put("thumb", m14012c());
        jSONObject2.put("origin", m14011b());
        jSONObject2.put("thumbnailLocal", m14013d());
        C28227x3 m14010a = m14010a();
        if (m14010a != null) {
            jSONObject = m14010a.m142187c();
        } else {
            jSONObject = null;
        }
        jSONObject2.put("dimension", jSONObject);
        return jSONObject2;
    }

    /* renamed from: j */
    public final long m14027j() {
        return this.f11688e;
    }

    /* renamed from: k */
    public final void m14028k(long j11) {
        this.f11688e = j11;
    }

    public C2964e() {
        this(new JSONObject());
    }
}
