package ge;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ge.r */
/* loaded from: classes3.dex */
public class C19426r extends C19411c {

    /* renamed from: C */
    public long f96380C;

    public C19426r(C19411c c19411c, long j11) {
        super(c19411c.mo101533h());
        this.f96380C = j11;
    }

    @Override // ge.C19411c
    /* renamed from: h */
    public JSONObject mo101533h() {
        JSONObject mo101533h = super.mo101533h();
        try {
            mo101533h.put("remindTime", this.f96380C);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return mo101533h;
    }

    public C19426r(JSONObject jSONObject) {
        super(jSONObject);
        this.f96380C = jSONObject.optLong("remindTime", this.f96262b);
    }
}
