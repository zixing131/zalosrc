package d60;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: d60.i */
/* loaded from: classes5.dex */
public final class C17800i {

    /* renamed from: a */
    private long f90041a;

    /* renamed from: b */
    private int f90042b;

    /* renamed from: c */
    private int f90043c;

    /* renamed from: d */
    private int f90044d;

    /* renamed from: e */
    private int f90045e;

    /* renamed from: f */
    private JSONObject f90046f;

    public C17800i(long j11, int i11, int i12, int i13, int i14, JSONObject jSONObject) {
        this.f90041a = j11;
        this.f90042b = i11;
        this.f90043c = i12;
        this.f90044d = i13;
        this.f90045e = i14;
        this.f90046f = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m94031a() {
        return this.f90046f;
    }

    /* renamed from: b */
    public final void m94032b(JSONObject jSONObject) {
        this.f90046f = jSONObject;
    }

    /* renamed from: c */
    public final void m94033c(int i11) {
        this.f90042b = i11;
    }

    /* renamed from: d */
    public final void m94034d(long j11) {
        this.f90041a = j11;
    }

    /* renamed from: e */
    public final void m94035e(int i11) {
        this.f90043c = i11;
    }

    /* renamed from: f */
    public final void m94036f(int i11) {
        this.f90045e = i11;
    }

    /* renamed from: g */
    public final void m94037g(int i11) {
        this.f90044d = i11;
    }

    /* renamed from: h */
    public final String m94038h() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("fileId", this.f90041a);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f90044d);
        jSONArray.put(this.f90042b);
        jSONArray.put(this.f90043c);
        jSONArray.put(this.f90045e);
        jSONObject2.put("wer", jSONArray);
        Object obj = this.f90046f;
        if (obj == null) {
            obj = "";
        }
        jSONObject2.put("asr", obj);
        jSONObject.put("stt", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public /* synthetic */ C17800i(long j11, int i11, int i12, int i13, int i14, JSONObject jSONObject, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? 0L : j11, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) == 0 ? i14 : 0, (i15 & 32) != 0 ? null : jSONObject);
    }
}
