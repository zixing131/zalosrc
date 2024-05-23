package p716zh;

import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p369ns.AbstractC23933a;

/* renamed from: zh.y9 */
/* loaded from: classes3.dex */
public class C32192y9 {

    /* renamed from: a */
    public List f148472a;

    /* renamed from: b */
    public boolean f148473b;

    /* renamed from: c */
    public String f148474c;

    /* renamed from: d */
    public String f148475d;

    /* renamed from: e */
    public String f148476e;

    /* renamed from: f */
    public String f148477f;

    /* renamed from: g */
    public String f148478g;

    /* renamed from: h */
    public String f148479h;

    public C32192y9(JSONObject jSONObject) {
        boolean z11;
        String str;
        String str2;
        boolean z12;
        this.f148473b = false;
        this.f148474c = "";
        this.f148475d = "";
        this.f148476e = "";
        this.f148477f = "";
        this.f148478g = "";
        this.f148479h = "";
        try {
            if (jSONObject.has("enable") && jSONObject.optInt("enable", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f148473b = z11;
            if (!jSONObject.has("thumbBigUrl")) {
                str = "";
            } else {
                str = jSONObject.optString("thumbBigUrl", "");
            }
            this.f148474c = str;
            if (!jSONObject.has("thumbSmallUrl")) {
                str2 = "";
            } else {
                str2 = jSONObject.optString("thumbSmallUrl", "");
            }
            this.f148475d = str2;
            if (jSONObject.has("name")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("name");
                this.f148476e = optJSONObject.optString("vi", "");
                this.f148477f = optJSONObject.optString("en", "");
            }
            if (jSONObject.has("popupTitle")) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("popupTitle");
                this.f148478g = optJSONObject2.optString("vi", "");
                this.f148479h = optJSONObject2.optString("en", "");
            }
            this.f148472a = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("dataList");
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                C31907f c31907f = new C31907f();
                c31907f.f146601a = jSONObject2.optString("aPkg", "");
                c31907f.f146602b = jSONObject2.optString("aName", "");
                if (jSONObject2.optInt("checkinstall", 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c31907f.f146604d = z12;
                c31907f.f146603c = jSONObject2.optInt("launchMode", 0);
                c31907f.f146605e = jSONObject2.optString("iconUrl", "");
                if (!TextUtils.isEmpty(c31907f.f146601a)) {
                    if (c31907f.f146604d) {
                        if (AbstractC23933a.m125287b(MainApplication.getAppContext(), c31907f.f146601a, false)) {
                            this.f148472a.add(c31907f);
                        }
                    } else {
                        this.f148472a.add(c31907f);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean m155239a() {
        List list;
        if (this.f148473b && (list = this.f148472a) != null && list.size() > 0) {
            return true;
        }
        return false;
    }
}
