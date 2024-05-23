package my;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25368s;

/* renamed from: my.g */
/* loaded from: classes4.dex */
public final class C23484g {

    /* renamed from: b */
    private String f114021b;

    /* renamed from: c */
    private String f114022c;

    /* renamed from: f */
    private List f114025f;

    /* renamed from: a */
    private String f114020a = "";

    /* renamed from: d */
    private String f114023d = "";

    /* renamed from: e */
    private String f114024e = "";

    public C23484g() {
        ArrayList m131500h;
        m131500h = AbstractC25368s.m131500h(-11571822, -13678490);
        this.f114025f = m131500h;
    }

    /* renamed from: a */
    public final String m123271a() {
        return this.f114024e;
    }

    /* renamed from: b */
    public final String m123272b() {
        return this.f114023d;
    }

    /* renamed from: c */
    public final List m123273c() {
        return this.f114025f;
    }

    /* renamed from: d */
    public final String m123274d() {
        return this.f114022c;
    }

    /* renamed from: e */
    public final String m123275e() {
        return this.f114020a;
    }

    /* renamed from: f */
    public final String m123276f() {
        return this.f114021b;
    }

    /* renamed from: g */
    public final void m123277g(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject != null) {
            String optString = jSONObject.optString("qrImgLink", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f114020a = optString;
            this.f114021b = jSONObject.optString("title", null);
            this.f114022c = jSONObject.optString("desc", null);
            this.f114023d = jSONObject.optString("actionType", "");
            this.f114024e = jSONObject.optString("actionData", "");
            this.f114025f.clear();
            if (jSONObject.has("bgColor") && (optJSONArray = jSONObject.optJSONArray("bgColor")) != null) {
                AbstractC19074t.m100205c(optJSONArray);
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    try {
                        this.f114025f.add(Integer.valueOf(Integer.parseInt(optJSONArray.getString(i11), 16) | (-16777216)));
                    } catch (Exception unused) {
                    }
                }
            }
            if (this.f114025f.isEmpty()) {
                this.f114025f.add(-11571822);
                this.f114025f.add(-13678490);
            }
        }
    }
}
