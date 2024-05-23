package dk;

import org.json.JSONObject;

/* renamed from: dk.a */
/* loaded from: classes3.dex */
public class C18017a {

    /* renamed from: a */
    public String f91257a;

    /* renamed from: b */
    public String f91258b;

    /* renamed from: c */
    public int f91259c;

    public C18017a(JSONObject jSONObject) {
        this.f91259c = jSONObject.optInt("id", 0);
        this.f91257a = jSONObject.optString("icon", "");
        this.f91258b = jSONObject.optString("title", "");
    }
}
