package bo;

import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONObject;

/* renamed from: bo.v0 */
/* loaded from: classes4.dex */
public class C3047v0 {

    /* renamed from: i */
    public String f12287i;

    /* renamed from: l */
    public String f12290l;

    /* renamed from: m */
    public String f12291m = "";

    /* renamed from: n */
    public String f12292n = "";

    /* renamed from: a */
    public int f12279a = 0;

    /* renamed from: b */
    public String f12280b = "";

    /* renamed from: c */
    public String f12281c = "";

    /* renamed from: d */
    public String f12282d = "";

    /* renamed from: e */
    public String f12283e = "";

    /* renamed from: j */
    public String f12288j = null;

    /* renamed from: f */
    public String f12284f = null;

    /* renamed from: g */
    public int f12285g = -1;

    /* renamed from: h */
    public String f12286h = null;

    /* renamed from: k */
    public Integer f12289k = null;

    /* renamed from: a */
    public JSONObject m14632a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f12280b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("uid", str);
            jSONObject.put("utype", this.f12279a);
            String str2 = this.f12282d;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("dpn", str2);
            String str3 = this.f12283e;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("avt", str3);
            String str4 = this.f12281c;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("uidto", str4);
            String str5 = this.f12291m;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("activity", str5);
            jSONObject.put(ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE, this.f12292n);
            JSONObject jSONObject2 = new JSONObject();
            String str6 = this.f12284f;
            if (str6 != null && this.f12285g >= 0 && this.f12286h != null && this.f12288j != null) {
                jSONObject2.put("appid", str6);
                jSONObject2.put("clktype", this.f12285g);
                jSONObject2.put("param", this.f12286h);
                jSONObject2.put("apptitle", this.f12288j);
            }
            if (!TextUtils.isEmpty(this.f12290l)) {
                jSONObject2.put("packagename", this.f12290l);
            } else {
                jSONObject2.put("packagename", "");
            }
            jSONObject.put("app", jSONObject2);
            Integer num = this.f12289k;
            if (num != null) {
                jSONObject.put("group_msg", num.intValue());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
