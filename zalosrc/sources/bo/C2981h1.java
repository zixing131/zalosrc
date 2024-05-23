package bo;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.h1 */
/* loaded from: classes4.dex */
public final class C2981h1 {

    /* renamed from: a */
    private long f11785a;

    /* renamed from: b */
    private JSONArray f11786b;

    public C2981h1(long j11, JSONArray jSONArray) {
        this.f11785a = j11;
        this.f11786b = jSONArray;
    }

    /* renamed from: a */
    public final long m14136a() {
        return this.f11785a;
    }

    /* renamed from: b */
    public final JSONArray m14137b() {
        return this.f11786b;
    }

    /* renamed from: c */
    public final String m14138c() {
        String jSONObject = m14139d().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    /* renamed from: d */
    public final JSONObject m14139d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("create_time", this.f11785a);
            jSONObject.put("suggestion_feeds", this.f11786b);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    public /* synthetic */ C2981h1(long j11, JSONArray jSONArray, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? null : jSONArray);
    }

    public C2981h1(String str) {
        this(0L, null, 3, null);
        if (str != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                this.f11785a = jSONObject.optLong("create_time", 0L);
                this.f11786b = jSONObject.optJSONArray("suggestion_feeds");
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
