package bo;

import org.json.JSONObject;

/* renamed from: bo.o */
/* loaded from: classes4.dex */
public class C3014o {

    /* renamed from: a */
    public boolean f11995a;

    /* renamed from: b */
    public boolean f11996b;

    /* renamed from: c */
    public boolean f11997c;

    /* renamed from: d */
    public boolean f11998d;

    /* renamed from: e */
    public boolean f11999e;

    /* renamed from: f */
    public boolean f12000f;

    public C3014o(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f11995a = false;
        this.f11996b = false;
        this.f11997c = false;
        this.f11998d = false;
        this.f11999e = false;
        this.f12000f = false;
        if (jSONObject != null) {
            try {
                if (jSONObject.optInt("hide_on_click") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f11995a = z11;
                if (jSONObject.optInt("hide_on_refresh") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f11996b = z12;
                if (jSONObject.optInt("hide_on_icon") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f11997c = z13;
                if (jSONObject.optInt("hide_icon_footer") == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f11998d = z14;
                if (jSONObject.optInt("hide_footer_bar") == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f11999e = z15;
                this.f12000f = jSONObject.optInt("is_force_refresh_bg_feed") == 1;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public String m14432a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hide_on_click", this.f11995a ? 1 : 0);
            jSONObject.put("hide_on_refresh", this.f11996b ? 1 : 0);
            jSONObject.put("hide_on_icon", this.f11997c ? 1 : 0);
            jSONObject.put("hide_icon_footer", this.f11998d ? 1 : 0);
            jSONObject.put("hide_footer_bar", this.f11999e ? 1 : 0);
            jSONObject.put("is_force_refresh_bg_feed", this.f12000f ? 1 : 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }
}
