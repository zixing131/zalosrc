package bo;

import fn0.AbstractC19074t;
import org.json.JSONObject;
import vg.C28227x3;

/* renamed from: bo.f */
/* loaded from: classes4.dex */
public final class C2969f extends AbstractC2959d {

    /* renamed from: e */
    private long f11734e;

    /* renamed from: f */
    private String f11735f;

    /* renamed from: g */
    private int f11736g;

    /* renamed from: h */
    private String f11737h;

    public C2969f() {
        this(new JSONObject());
    }

    @Override // bo.AbstractC2959d
    /* renamed from: i */
    public JSONObject mo14018i() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("videoid", this.f11734e);
        jSONObject2.put("hls", this.f11735f);
        jSONObject2.put("video_auto_play", this.f11736g);
        jSONObject2.put("media_id", this.f11737h);
        jSONObject2.put("thumb", m14012c());
        jSONObject2.put("origin", m14011b());
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
    public final String m14046j() {
        return this.f11735f;
    }

    /* renamed from: k */
    public final String m14047k() {
        return this.f11737h;
    }

    /* renamed from: l */
    public final int m14048l() {
        return this.f11736g;
    }

    /* renamed from: m */
    public final long m14049m() {
        return this.f11734e;
    }

    /* renamed from: n */
    public final void m14050n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11735f = str;
    }

    /* renamed from: o */
    public final void m14051o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f11737h = str;
    }

    /* renamed from: p */
    public final void m14052p(int i11) {
        this.f11736g = i11;
    }

    /* renamed from: q */
    public final void m14053q(long j11) {
        this.f11734e = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969f(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f11735f = "";
        this.f11737h = "";
        this.f11734e = jSONObject.optLong("videoid");
        String optString = jSONObject.optString("hls");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f11735f = optString;
        this.f11736g = jSONObject.optInt("video_auto_play");
        String optString2 = jSONObject.optString("media_id");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f11737h = optString2;
    }
}
