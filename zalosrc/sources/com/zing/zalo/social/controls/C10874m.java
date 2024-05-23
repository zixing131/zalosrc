package com.zing.zalo.social.controls;

import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.C23307g;
import rd0.AbstractC25751q;
import rd0.C25748n;

/* renamed from: com.zing.zalo.social.controls.m */
/* loaded from: classes5.dex */
public class C10874m {

    /* renamed from: a */
    public int f54954a = 0;

    /* renamed from: b */
    public String f54955b;

    /* renamed from: c */
    public String f54956c;

    /* renamed from: d */
    public String f54957d;

    /* renamed from: e */
    public String f54958e;

    /* renamed from: f */
    public String f54959f;

    /* renamed from: g */
    public C23307g f54960g;

    /* renamed from: a */
    public void m56505a(int i11) {
        this.f54954a = i11;
    }

    /* renamed from: b */
    public void m56506b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (!jSONObject.isNull("sFileId")) {
                jSONObject2 = jSONObject.getJSONObject("sFileId");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                this.f54956c = AbstractC18069a.m96089h(jSONObject2, "thumb");
                this.f54955b = AbstractC18069a.m96089h(jSONObject2, "org");
                this.f54959f = AbstractC18069a.m96089h(jSONObject2, "photoId");
            }
            this.f54957d = AbstractC18069a.m96089h(jSONObject, "fileId");
            this.f54958e = AbstractC18069a.m96089h(jSONObject, "partId");
            if (!jSONObject.isNull("photo_info")) {
                this.f54960g = new C23307g(jSONObject.getJSONObject("photo_info"));
            }
            if (jSONObject.has("state")) {
                this.f54954a = jSONObject.getInt("state");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m56507c(AbstractC25751q abstractC25751q) {
        if (abstractC25751q instanceof C25748n) {
            C25748n c25748n = (C25748n) abstractC25751q;
            this.f54956c = c25748n.m132880g();
            this.f54955b = c25748n.m132878e();
            this.f54959f = c25748n.m132876c();
            this.f54957d = c25748n.m132874a();
            this.f54958e = c25748n.m132875b();
            JSONObject m132877d = c25748n.m132877d();
            if (m132877d != null) {
                this.f54960g = new C23307g(m132877d);
            }
            this.f54954a = c25748n.m132879f();
        }
    }

    /* renamed from: d */
    public String m56508d() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String str = this.f54956c;
            Object obj = "";
            if (str == null) {
                str = "";
            }
            jSONObject2.put("thumb", str);
            String str2 = this.f54955b;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("org", str2);
            String str3 = this.f54959f;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("photoId", str3);
            jSONObject.put("sFileId", jSONObject2);
            String str4 = this.f54957d;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("fileId", str4);
            String str5 = this.f54958e;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("partId", str5);
            C23307g c23307g = this.f54960g;
            if (c23307g != null) {
                obj = c23307g.m120735a();
            }
            jSONObject.put("photo_info", obj);
            jSONObject.put("state", this.f54954a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }
}
