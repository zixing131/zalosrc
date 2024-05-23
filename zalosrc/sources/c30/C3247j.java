package c30;

import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import me0.AbstractC23080g8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p588vw.C28644j;

/* renamed from: c30.j */
/* loaded from: classes5.dex */
public class C3247j {

    /* renamed from: a */
    public int f13888a;

    /* renamed from: b */
    public int f13889b;

    /* renamed from: c */
    public int f13890c;

    /* renamed from: d */
    public String f13891d;

    /* renamed from: e */
    public String f13892e;

    /* renamed from: f */
    public String f13893f;

    /* renamed from: g */
    public String f13894g;

    /* renamed from: h */
    public String f13895h;

    /* renamed from: i */
    public int f13896i;

    public C3247j() {
        this.f13888a = 0;
        this.f13889b = 0;
        this.f13890c = 0;
        this.f13891d = "";
        this.f13892e = "";
        this.f13893f = "";
        this.f13894g = "";
        this.f13895h = "";
        this.f13896i = 0;
    }

    /* renamed from: a */
    public String m16499a() {
        return C28644j.m143232X() + "&eid=" + this.f13890c + "&size=" + AbstractC23080g8.m118401f(MainApplication.getAppContext());
    }

    public C3247j(JSONObject jSONObject) {
        this.f13888a = 0;
        this.f13889b = 0;
        this.f13890c = 0;
        this.f13891d = "";
        this.f13892e = "";
        this.f13893f = "";
        this.f13894g = "";
        this.f13895h = "";
        this.f13896i = 0;
        try {
            if (jSONObject.has("id")) {
                this.f13890c = AbstractC18069a.m96085d(jSONObject, "id");
            }
            if (jSONObject.has("text")) {
                this.f13891d = AbstractC18069a.m96089h(jSONObject, "text");
            }
            if (jSONObject.has(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                this.f13892e = AbstractC18069a.m96089h(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            }
            if (jSONObject.has("thumbUrl")) {
                this.f13893f = AbstractC18069a.m96089h(jSONObject, "thumbUrl");
            }
            if (jSONObject.has("uri")) {
                this.f13895h = AbstractC18069a.m96089h(jSONObject, "uri");
            }
            if (jSONObject.has("fkey")) {
                this.f13896i = AbstractC18069a.m96085d(jSONObject, "fkey");
            }
            if (jSONObject.has("cateId")) {
                this.f13889b = AbstractC18069a.m96085d(jSONObject, "cateId");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
