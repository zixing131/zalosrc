package p056cj;

import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: cj.f */
/* loaded from: classes3.dex */
public class C3538f {

    /* renamed from: i */
    public static final int f14923i = AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.black_25);

    /* renamed from: j */
    public static int f14924j = AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.profile_header_action_bar_color);

    /* renamed from: a */
    public String f14925a;

    /* renamed from: b */
    public String f14926b;

    /* renamed from: c */
    public String f14927c;

    /* renamed from: d */
    public String f14928d;

    /* renamed from: e */
    public String f14929e;

    /* renamed from: f */
    public int f14930f;

    /* renamed from: g */
    public String f14931g;

    /* renamed from: h */
    public String f14932h;

    public C3538f() {
        this.f14925a = "";
        this.f14926b = "";
        this.f14927c = "";
        this.f14928d = "";
        this.f14929e = "";
        this.f14930f = f14923i;
        this.f14931g = "";
        this.f14932h = "";
    }

    /* renamed from: a */
    public String m17982a() {
        String m118220s = AbstractC23041d2.m118220s(this.f14927c);
        if (TextUtils.isEmpty(this.f14932h)) {
            this.f14932h = AbstractC23352g.m122788d(this.f14927c) + m118220s;
        }
        return this.f14932h;
    }

    /* renamed from: b */
    public boolean m17983b() {
        return this.f14925a.equals("0");
    }

    /* renamed from: c */
    public void m17984c() {
        String str = this.f14931g;
        String str2 = this.f14927c;
        this.f14931g = C7960e.m41911P4(str);
        this.f14928d = C7960e.m41911P4(this.f14928d);
        this.f14927c = C7960e.m41911P4(this.f14927c);
        if (!str.equals(this.f14931g) || !str2.equals(this.f14927c)) {
            AbstractC23309i.m122173mj(m17986e());
        }
    }

    /* renamed from: d */
    public void m17985d() {
        int i11;
        String str;
        if (!TextUtils.isEmpty(this.f14929e)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f14929e);
                if (!jSONObject.isNull("actionBarColor")) {
                    i11 = jSONObject.getInt("actionBarColor");
                } else {
                    i11 = f14923i;
                }
                this.f14930f = i11;
                String str2 = "";
                if (jSONObject.isNull("backgroundUrl")) {
                    str = "";
                } else {
                    str = jSONObject.getString("backgroundUrl");
                }
                this.f14927c = str;
                if (!jSONObject.isNull("thumUrl")) {
                    str2 = jSONObject.getString("thumUrl");
                }
                this.f14928d = str2;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public String m17986e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f14925a);
            jSONObject.put("title", this.f14926b);
            jSONObject.put("localPath", this.f14931g);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionBarColor", this.f14930f);
            jSONObject2.put("backgroundUrl", this.f14927c);
            jSONObject2.put("thumUrl", this.f14928d);
            jSONObject.put("data", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public C3538f(JSONObject jSONObject) {
        this.f14925a = "";
        this.f14926b = "";
        this.f14927c = "";
        this.f14928d = "";
        this.f14929e = "";
        int i11 = f14923i;
        this.f14930f = i11;
        this.f14931g = "";
        this.f14932h = "";
        if (jSONObject != null) {
            try {
                this.f14925a = !jSONObject.isNull("id") ? jSONObject.getString("id") : "";
                this.f14926b = !jSONObject.isNull("title") ? jSONObject.getString("title") : "";
                this.f14931g = !jSONObject.isNull("localPath") ? jSONObject.getString("localPath") : "";
                JSONObject jSONObject2 = !jSONObject.isNull("data") ? jSONObject.getJSONObject("data") : null;
                if (jSONObject2 != null) {
                    this.f14929e = jSONObject2.toString();
                    this.f14930f = jSONObject2.isNull("actionBarColor") ? i11 : jSONObject2.getInt("actionBarColor");
                    this.f14927c = !jSONObject2.isNull("backgroundUrl") ? jSONObject2.getString("backgroundUrl") : "";
                    this.f14928d = jSONObject2.isNull("thumUrl") ? "" : jSONObject2.getString("thumUrl");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
