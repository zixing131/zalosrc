package p056cj;

import c30.C3251l;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25811c;

/* renamed from: cj.o */
/* loaded from: classes3.dex */
public class C3547o {

    /* renamed from: a */
    public String f14977a;

    /* renamed from: b */
    public String f14978b;

    /* renamed from: c */
    public String f14979c;

    /* renamed from: d */
    public String f14980d;

    /* renamed from: e */
    public Boolean f14981e;

    /* renamed from: f */
    public ArrayList f14982f = new ArrayList();

    /* renamed from: g */
    public ArrayList f14983g = new ArrayList();

    /* renamed from: h */
    public ArrayList f14984h = new ArrayList();

    public C3547o(JSONObject jSONObject) {
        boolean z11;
        this.f14977a = "";
        this.f14978b = "";
        this.f14979c = "";
        this.f14980d = "";
        this.f14981e = Boolean.FALSE;
        try {
            if (jSONObject.has("title")) {
                this.f14977a = AbstractC18069a.m96089h(jSONObject, "title");
            }
            if (jSONObject.has("hint")) {
                this.f14978b = AbstractC18069a.m96089h(jSONObject, "hint");
            }
            if (jSONObject.has("search_hint")) {
                this.f14979c = AbstractC18069a.m96089h(jSONObject, "search_hint");
            }
            if (jSONObject.has("group_title")) {
                this.f14980d = AbstractC18069a.m96089h(jSONObject, "group_title");
            }
            if (jSONObject.has("suggestion_uids")) {
                JSONArray jSONArray = jSONObject.getJSONArray("suggestion_uids");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    this.f14982f.add(jSONArray.getString(i11));
                }
            }
            if (jSONObject.optInt("check_show_tip", 0) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f14981e = Boolean.valueOf(z11);
            if (jSONObject.has("content")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("content");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i12);
                    int i13 = jSONObject2.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                C3251l c3251l = new C3251l(2);
                                c3251l.m16521k(new C25811c(jSONObject2.optJSONObject("content")));
                                this.f14983g.add(c3251l);
                            }
                        } else {
                            C3251l c3251l2 = new C3251l(1);
                            c3251l2.m16520j(new C25809a(jSONObject2.optJSONObject("content")));
                            this.f14984h.add(c3251l2);
                        }
                    } else {
                        C3251l c3251l3 = new C3251l(0);
                        JSONObject optJSONObject = jSONObject2.optJSONObject("content");
                        C25630b c25630b = new C25630b();
                        c25630b.m132404N(optJSONObject.optInt("cate_id"));
                        c25630b.m132414X(optJSONObject.optInt("cate_id"));
                        c25630b.m132410T(optJSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                        c25630b.m132405O(optJSONObject.optInt("sticker_id"));
                        if (optJSONObject.has("subtype")) {
                            c25630b.m132420b0(optJSONObject.optInt("subtype"));
                            c25630b.m132424d0(optJSONObject.optString("thumbUrl"));
                            c25630b.m132422c0(optJSONObject.optInt("width"), optJSONObject.optInt("height"));
                        }
                        c3251l3.m16522l(c25630b);
                        this.f14983g.add(c3251l3);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
