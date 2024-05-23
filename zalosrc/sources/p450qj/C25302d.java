package p450qj;

import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: qj.d */
/* loaded from: classes3.dex */
public class C25302d {

    /* renamed from: a */
    public String f121354a;

    /* renamed from: b */
    public String f121355b;

    /* renamed from: c */
    public String f121356c;

    /* renamed from: d */
    public C25299a f121357d;

    /* renamed from: e */
    public C25300b f121358e;

    public C25302d(JSONObject jSONObject) {
        try {
            if (jSONObject.has("content")) {
                this.f121354a = AbstractC18069a.m96089h(jSONObject, "content");
            }
            if (jSONObject.has("popup")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("popup");
                if (jSONObject2.has("title")) {
                    this.f121355b = AbstractC18069a.m96089h(jSONObject2, "title");
                }
                if (jSONObject2.has("desc")) {
                    this.f121356c = AbstractC18069a.m96089h(jSONObject2, "desc");
                }
                if (jSONObject2.has("buttons")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("buttons");
                    if (jSONObject3.has("cancel")) {
                        this.f121357d = new C25299a(jSONObject3.getJSONObject("cancel"));
                    }
                    if (jSONObject3.has("ok")) {
                        this.f121358e = new C25300b(jSONObject3.getJSONObject("ok"));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
