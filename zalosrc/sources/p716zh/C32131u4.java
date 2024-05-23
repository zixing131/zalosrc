package p716zh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p471r3.C25630b;

/* renamed from: zh.u4 */
/* loaded from: classes3.dex */
public class C32131u4 {

    /* renamed from: a */
    public String f148196a;

    /* renamed from: b */
    public int f148197b;

    /* renamed from: c */
    public String f148198c;

    /* renamed from: d */
    public String f148199d;

    /* renamed from: e */
    public String f148200e;

    /* renamed from: f */
    public String f148201f;

    /* renamed from: g */
    public String f148202g;

    /* renamed from: h */
    public List f148203h;

    public C32131u4(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            if (jSONObject.has("eventboxId")) {
                this.f148196a = AbstractC18069a.m96089h(jSONObject, "eventboxId");
            }
            if (jSONObject.has("eventboxGender")) {
                this.f148197b = AbstractC18069a.m96085d(jSONObject, "eventboxGender");
            }
            if (jSONObject.has("guideSticker")) {
                this.f148198c = AbstractC18069a.m96089h(jSONObject, "guideSticker");
            }
            if (jSONObject.has("guideSelect")) {
                this.f148199d = AbstractC18069a.m96089h(jSONObject, "guideSelect");
            }
            if (jSONObject.has("eventboxBG")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("eventboxBG");
                if (optJSONObject.has("bgHeaderLeft")) {
                    this.f148200e = AbstractC18069a.m96089h(optJSONObject, "bgHeaderLeft");
                }
                if (optJSONObject.has("bgHeaderCenter")) {
                    this.f148201f = AbstractC18069a.m96089h(optJSONObject, "bgHeaderCenter");
                }
                if (optJSONObject.has("bgHeaderRight")) {
                    this.f148202g = AbstractC18069a.m96089h(optJSONObject, "bgHeaderRight");
                }
            }
            if (jSONObject.has("eventboxSticker") && (jSONArray = jSONObject.getJSONArray("eventboxSticker")) != null && jSONArray.length() > 0) {
                this.f148203h = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        int parseInt = Integer.parseInt(jSONObject2.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                        int parseInt2 = Integer.parseInt(jSONObject2.getString("catId"));
                        int parseInt3 = Integer.parseInt(jSONObject2.getString("id"));
                        C25630b c25630b = new C25630b();
                        c25630b.m132404N(parseInt2);
                        c25630b.m132414X(parseInt2);
                        c25630b.m132410T(parseInt);
                        c25630b.m132405O(parseInt3);
                        this.f148203h.add(c25630b);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
