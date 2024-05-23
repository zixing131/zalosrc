package p450qj;

import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: qj.b */
/* loaded from: classes3.dex */
public class C25300b {

    /* renamed from: a */
    public String f121345a;

    /* renamed from: b */
    public int f121346b;

    public C25300b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("label")) {
                this.f121345a = AbstractC18069a.m96089h(jSONObject, "label");
            }
            if (jSONObject.has("hidden")) {
                this.f121346b = AbstractC18069a.m96085d(jSONObject, "hidden");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
