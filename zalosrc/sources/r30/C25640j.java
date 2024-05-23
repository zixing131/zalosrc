package r30;

import org.json.JSONObject;

/* renamed from: r30.j */
/* loaded from: classes5.dex */
public class C25640j {

    /* renamed from: a */
    public C25643m f122592a;

    public C25640j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("buttonFindFriend");
        if (optJSONObject != null) {
            this.f122592a = new C25643m(optJSONObject);
        } else {
            this.f122592a = null;
        }
    }
}
