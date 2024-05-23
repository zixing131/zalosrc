package bo;

import android.text.TextUtils;
import is.AbstractC20826v0;
import lk0.InterfaceC22508f;
import org.json.JSONObject;

/* renamed from: bo.p1 */
/* loaded from: classes4.dex */
public class C3021p1 {

    /* renamed from: a */
    public C3036s1 f12068a;

    /* renamed from: b */
    public C3031r1 f12069b;

    /* renamed from: c */
    public String f12070c;

    /* renamed from: d */
    public C3000l0 f12071d;

    /* renamed from: e */
    public C3060y1 f12072e;

    /* renamed from: f */
    public C2957c2 f12073f;

    /* renamed from: g */
    public C3026q1 f12074g;

    public C3021p1(JSONObject jSONObject) {
        C3036s1 c3036s1;
        C3031r1 c3031r1;
        C3020p0 c3020p0;
        C3060y1 c3060y1;
        C2957c2 c2957c2;
        if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("title");
                if (optJSONObject != null) {
                    c3036s1 = new C3036s1(optJSONObject);
                } else {
                    c3036s1 = null;
                }
                this.f12068a = c3036s1;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("desc");
                if (optJSONObject2 != null) {
                    c3031r1 = new C3031r1(optJSONObject2);
                } else {
                    c3031r1 = null;
                }
                this.f12069b = c3031r1;
                this.f12070c = jSONObject.optString("decor_image");
                JSONObject optJSONObject3 = jSONObject.optJSONObject("feed_item");
                if (optJSONObject3 != null) {
                    c3020p0 = AbstractC20826v0.m108752C0(optJSONObject3, 0);
                } else {
                    c3020p0 = null;
                }
                if (c3020p0 != null) {
                    C3000l0 c3000l0 = new C3000l0();
                    this.f12071d = c3000l0;
                    c3000l0.f11893p = 0;
                    c3000l0.f11899s.add(c3020p0);
                    this.f12071d.f11895q = c3020p0.f12057p;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("attachment");
                if (optJSONObject4 != null) {
                    c3060y1 = new C3060y1(optJSONObject4);
                } else {
                    c3060y1 = null;
                }
                this.f12072e = c3060y1;
                JSONObject optJSONObject5 = jSONObject.optJSONObject("time_valid");
                if (optJSONObject5 != null) {
                    c2957c2 = new C2957c2(optJSONObject5);
                } else {
                    c2957c2 = null;
                }
                this.f12073f = c2957c2;
                JSONObject optJSONObject6 = jSONObject.optJSONObject("button");
                this.f12074g = optJSONObject6 != null ? new C3026q1(optJSONObject6) : null;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String m14539a() {
        C3060y1 c3060y1 = this.f12072e;
        if (c3060y1 != null) {
            return c3060y1.m14709a();
        }
        return "";
    }

    /* renamed from: b */
    public InterfaceC22508f m14540b() {
        C3060y1 c3060y1 = this.f12072e;
        if (c3060y1 != null) {
            return c3060y1.m14710b();
        }
        return null;
    }

    /* renamed from: c */
    public boolean m14541c() {
        long currentTimeMillis = System.currentTimeMillis();
        C2957c2 c2957c2 = this.f12073f;
        if (c2957c2 != null && currentTimeMillis >= c2957c2.f11666a && currentTimeMillis <= c2957c2.f11667b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public JSONObject m14542d() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6 = new JSONObject();
        try {
            C3036s1 c3036s1 = this.f12068a;
            JSONObject jSONObject7 = null;
            if (c3036s1 != null) {
                jSONObject = c3036s1.m14613a();
            } else {
                jSONObject = null;
            }
            jSONObject6.put("title", jSONObject);
            C3031r1 c3031r1 = this.f12069b;
            if (c3031r1 != null) {
                jSONObject2 = c3031r1.m14586a();
            } else {
                jSONObject2 = null;
            }
            jSONObject6.put("desc", jSONObject2);
            if (!TextUtils.isEmpty(this.f12070c)) {
                str = this.f12070c;
            } else {
                str = "";
            }
            jSONObject6.put("decor_image", str);
            C3000l0 c3000l0 = this.f12071d;
            if (c3000l0 != null && c3000l0.m14322a0() != null) {
                jSONObject3 = this.f12071d.m14322a0().m14474E0();
            } else {
                jSONObject3 = null;
            }
            jSONObject6.put("feed_item", jSONObject3);
            C3060y1 c3060y1 = this.f12072e;
            if (c3060y1 != null) {
                jSONObject4 = c3060y1.m14711c();
            } else {
                jSONObject4 = null;
            }
            jSONObject6.put("attachment", jSONObject4);
            C2957c2 c2957c2 = this.f12073f;
            if (c2957c2 != null) {
                jSONObject5 = c2957c2.m14003a();
            } else {
                jSONObject5 = null;
            }
            jSONObject6.put("time_valid", jSONObject5);
            C3026q1 c3026q1 = this.f12074g;
            if (c3026q1 != null) {
                jSONObject7 = c3026q1.m14576a();
            }
            jSONObject6.put("button", jSONObject7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject6;
    }
}
