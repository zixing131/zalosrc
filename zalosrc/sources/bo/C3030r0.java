package bo;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.r0 */
/* loaded from: classes4.dex */
public class C3030r0 {

    /* renamed from: b */
    public int f12204b;

    /* renamed from: a */
    private final boolean f12203a = false;

    /* renamed from: i */
    public int f12211i = 0;

    /* renamed from: j */
    public int f12212j = -1;

    /* renamed from: k */
    public int f12213k = -1;

    /* renamed from: l */
    public String f12214l = "";

    /* renamed from: m */
    public boolean f12215m = false;

    /* renamed from: c */
    public String f12205c = "";

    /* renamed from: d */
    public String f12206d = "";

    /* renamed from: e */
    public String f12207e = "";

    /* renamed from: f */
    public long f12208f = 0;

    /* renamed from: g */
    public String f12209g = "";

    /* renamed from: h */
    public String f12210h = "";

    public C3030r0(int i11) {
        this.f12204b = i11;
    }

    /* renamed from: a */
    public boolean m14584a() {
        if (System.currentTimeMillis() - this.f12208f < 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public JSONObject m14585b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f12206d;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("avt", str);
            String str3 = this.f12205c;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("dpn", str3);
            jSONObject.put("cts", this.f12208f);
            String str4 = this.f12209g;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("uid", str4);
            String str5 = this.f12207e;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("comment", str5);
            String str6 = this.f12210h;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("comment_id", str6);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f12211i);
            if (this.f12211i == 1) {
                jSONObject.put("stickerId", this.f12212j);
                jSONObject.put("cateId", this.f12213k);
                String str7 = this.f12214l;
                if (str7 != null) {
                    str2 = str7;
                }
                jSONObject.put("thumb", str2);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
