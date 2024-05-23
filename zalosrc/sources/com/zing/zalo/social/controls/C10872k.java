package com.zing.zalo.social.controls;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import me0.AbstractC23080g8;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.C23307g;

/* renamed from: com.zing.zalo.social.controls.k */
/* loaded from: classes5.dex */
public class C10872k {

    /* renamed from: a */
    private final String f54869a = "thumb";

    /* renamed from: b */
    private final String f54870b = "origin";

    /* renamed from: c */
    private final String f54871c = "params";

    /* renamed from: d */
    private final String f54872d = "stickerId";

    /* renamed from: e */
    private final String f54873e = "cateId";

    /* renamed from: f */
    private final String f54874f = "photo_dimension";

    /* renamed from: g */
    private final String f54875g = "picId";

    /* renamed from: h */
    private final String f54876h = ZinstantMetaConstant.IMPRESSION_META_TYPE;

    /* renamed from: i */
    public String f54877i;

    /* renamed from: j */
    public String f54878j;

    /* renamed from: k */
    public String f54879k;

    /* renamed from: l */
    public C23307g f54880l;

    /* renamed from: m */
    public int f54881m;

    /* renamed from: n */
    public int f54882n;

    /* renamed from: o */
    public String f54883o;

    /* renamed from: p */
    public int f54884p;

    public C10872k(String str, String str2, int i11, int i12, int i13) {
        this.f54877i = str;
        this.f54878j = str2;
        this.f54881m = i11;
        this.f54882n = i12;
        this.f54884p = i13;
    }

    /* renamed from: a */
    public JSONObject m56420a() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f54877i;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("thumb", str);
            String str3 = this.f54878j;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("origin", str3);
            String str4 = this.f54879k;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("params", str4);
            String str5 = this.f54883o;
            if (str5 != null) {
                str2 = str5;
            }
            jSONObject.put("picId", str2);
            if (AbstractC23080g8.m118403h(this.f54881m, this.f54882n)) {
                jSONObject.put("stickerId", this.f54881m);
                jSONObject.put("cateId", this.f54882n);
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f54884p);
            }
            C23307g c23307g = this.f54880l;
            if (c23307g != null) {
                jSONObject.put("photo_dimension", c23307g.m120735a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C10872k(String str, String str2, C23307g c23307g, String str3) {
        this.f54877i = str;
        this.f54878j = str2;
        this.f54880l = c23307g;
        this.f54883o = str3;
    }

    public C10872k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.f54877i = AbstractC18069a.m96089h(jSONObject, "thumb");
            this.f54878j = AbstractC18069a.m96089h(jSONObject, "origin");
            this.f54879k = AbstractC18069a.m96089h(jSONObject, "params");
            this.f54881m = AbstractC18069a.m96085d(jSONObject, "stickerId");
            this.f54882n = AbstractC18069a.m96085d(jSONObject, "cateId");
            this.f54880l = !jSONObject.isNull("photo_dimension") ? new C23307g(jSONObject.getJSONObject("photo_dimension")) : null;
            this.f54883o = AbstractC18069a.m96089h(jSONObject, "picId");
            this.f54884p = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
