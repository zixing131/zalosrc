package p450qj;

import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: qj.a */
/* loaded from: classes3.dex */
public class C25299a {

    /* renamed from: a */
    public String f121343a;

    /* renamed from: b */
    public int f121344b;

    public C25299a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("label")) {
                this.f121343a = AbstractC18069a.m96089h(jSONObject, "label");
            }
            if (jSONObject.has("hidden")) {
                this.f121344b = AbstractC18069a.m96085d(jSONObject, "hidden");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
