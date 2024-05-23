package bo;

import org.json.JSONObject;

/* renamed from: bo.z1 */
/* loaded from: classes4.dex */
public class C3064z1 {

    /* renamed from: a */
    public long f12385a;

    /* renamed from: b */
    public boolean f12386b;

    /* renamed from: c */
    public boolean f12387c;

    /* renamed from: d */
    public int f12388d;

    /* renamed from: e */
    public boolean f12389e;

    /* renamed from: f */
    public int f12390f;

    /* renamed from: g */
    public boolean f12391g;

    /* renamed from: h */
    public int f12392h;

    public C3064z1(JSONObject jSONObject) {
        boolean z11;
        this.f12387c = false;
        this.f12388d = 0;
        this.f12389e = false;
        this.f12390f = 0;
        this.f12392h = 0;
        if (jSONObject != null) {
            try {
                this.f12385a = jSONObject.optLong("expire_time");
                boolean z12 = true;
                if (jSONObject.optInt("hide_on_refresh") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f12386b = z11;
                if (jSONObject.optInt("hide_on_click") != 1) {
                    z12 = false;
                }
                this.f12391g = z12;
                if (jSONObject.has("hide_on_refresh_config")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("hide_on_refresh_config");
                    boolean has = jSONObject2.has("refresh_count");
                    this.f12387c = has;
                    if (has) {
                        this.f12388d = jSONObject2.optInt("refresh_count", 0);
                    }
                    boolean has2 = jSONObject2.has("refresh_count_after_click");
                    this.f12389e = has2;
                    if (has2) {
                        this.f12390f = jSONObject2.optInt("refresh_count_after_click", 0);
                    }
                }
                this.f12392h = jSONObject.optInt("time_auto_hide", 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public boolean m14735a() {
        return this.f12387c && this.f12388d > 0;
    }

    /* renamed from: b */
    public boolean m14736b() {
        return this.f12389e && this.f12390f > 0;
    }

    /* renamed from: c */
    public boolean m14737c() {
        return this.f12392h > 0;
    }

    /* renamed from: d */
    public JSONObject m14738d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("expire_time", this.f12385a);
            jSONObject.put("hide_on_refresh", this.f12386b ? 1 : 0);
            jSONObject.put("hide_on_click", this.f12391g ? 1 : 0);
            jSONObject.put("time_auto_hide", this.f12392h);
            JSONObject jSONObject2 = new JSONObject();
            if (this.f12387c) {
                jSONObject2.put("refresh_count", this.f12388d);
            }
            if (this.f12389e) {
                jSONObject2.put("refresh_count_after_click", this.f12390f);
            }
            jSONObject.put("hide_on_refresh_config", jSONObject2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
