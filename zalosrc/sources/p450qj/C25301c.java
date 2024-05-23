package p450qj;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: qj.c */
/* loaded from: classes3.dex */
public class C25301c {

    /* renamed from: a */
    public String f121347a;

    /* renamed from: b */
    public String f121348b;

    /* renamed from: c */
    public int f121349c;

    /* renamed from: d */
    public String f121350d;

    /* renamed from: e */
    public boolean f121351e;

    /* renamed from: f */
    public String f121352f;

    /* renamed from: g */
    public List f121353g = new ArrayList();

    public C25301c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        this.f121349c = 0;
        try {
            if (jSONObject.has("name")) {
                this.f121347a = AbstractC18069a.m96089h(jSONObject, "name");
            }
            if (jSONObject.has("actionId")) {
                this.f121348b = AbstractC18069a.m96089h(jSONObject, "actionId");
            }
            if (jSONObject.has("isMain")) {
                this.f121349c = AbstractC18069a.m96085d(jSONObject, "isMain");
            }
            if (jSONObject.has("id_tracking")) {
                this.f121350d = AbstractC18069a.m96089h(jSONObject, "id_tracking");
            }
            if (jSONObject.has("is_tracking")) {
                this.f121351e = AbstractC18069a.m96083b(jSONObject, "is_tracking");
            }
            if (jSONObject.has("data")) {
                this.f121352f = AbstractC18069a.m96089h(jSONObject, "data");
            }
            if (jSONObject.has("data_popup") && (optJSONArray = jSONObject.optJSONArray("data_popup")) != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    this.f121353g.add(new C25302d(optJSONArray.getJSONObject(i11)));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
