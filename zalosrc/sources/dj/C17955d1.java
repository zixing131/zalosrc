package dj;

import android.text.TextUtils;
import com.zing.zalo.control.C7907e;
import me0.AbstractC23041d2;
import me0.AbstractC23138m0;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.d1 */
/* loaded from: classes3.dex */
public class C17955d1 extends C17969i0 {

    /* renamed from: B */
    public String f90888B;

    /* renamed from: C */
    public String f90889C;

    /* renamed from: D */
    public int f90890D;

    /* renamed from: E */
    public String f90891E;

    /* renamed from: F */
    public C7907e.a f90892F;

    public C17955d1(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        m95413i();
    }

    /* renamed from: i */
    private void m95413i() {
        try {
            if (!TextUtils.isEmpty(this.f91017v)) {
                JSONObject jSONObject = new JSONObject(this.f91017v);
                if (jSONObject.has("id")) {
                    this.f90888B = AbstractC18069a.m96089h(jSONObject, "id");
                }
                if (jSONObject.has("title")) {
                    this.f90889C = AbstractC18069a.m96089h(jSONObject, "title");
                }
                if (jSONObject.has("data")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject.has("actionBarColor")) {
                        this.f90890D = AbstractC18069a.m96085d(optJSONObject, "actionBarColor");
                    }
                    if (optJSONObject.has("backgroundUrl")) {
                        this.f90891E = AbstractC18069a.m96089h(optJSONObject, "backgroundUrl");
                    }
                }
                if (jSONObject.has("localSenderMention")) {
                    this.f90892F = new C7907e.a(jSONObject.getJSONObject("localSenderMention"));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public String m95414g() {
        return this.f90888B + "_" + AbstractC23138m0.m118769a() + AbstractC23041d2.m118220s(this.f90891E);
    }

    /* renamed from: h */
    public String m95415h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f90888B);
            jSONObject.put("title", this.f90889C);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionBarColor", this.f90890D);
            String str = this.f90891E;
            if (str == null) {
                str = "";
            }
            jSONObject2.put("backgroundUrl", str);
            jSONObject.put("data", jSONObject2);
            C7907e.a aVar = this.f90892F;
            if (aVar != null) {
                jSONObject.put("localSenderMention", aVar.m40870h());
            }
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public C17955d1(JSONObject jSONObject) {
        super(jSONObject);
        m95413i();
    }
}
