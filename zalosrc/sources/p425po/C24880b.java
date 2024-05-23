package p425po;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: po.b */
/* loaded from: classes4.dex */
public final class C24880b {

    /* renamed from: a */
    private int f119380a;

    /* renamed from: b */
    private C24879a f119381b;

    public C24880b(int i11, C24879a c24879a) {
        this.f119380a = i11;
        this.f119381b = c24879a;
    }

    /* renamed from: c */
    private final void m129378c(JSONObject jSONObject) {
        try {
            this.f119381b = C24879a.Companion.m129377a(jSONObject);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: a */
    public final int m129379a() {
        return this.f119380a;
    }

    /* renamed from: b */
    public final C24879a m129380b() {
        return this.f119381b;
    }

    public C24880b(int i11, String str) {
        AbstractC19074t.m100208f(str, "extraErrorJsonString");
        try {
            this.f119380a = i11;
            if (str.length() > 0) {
                m129378c(new JSONObject(str));
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
