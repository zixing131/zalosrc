package p404ou;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ou.c */
/* loaded from: classes4.dex */
public class C24557c {

    /* renamed from: a */
    public int f118242a;

    /* renamed from: b */
    public String f118243b;

    /* renamed from: c */
    public String f118244c;

    public C24557c(JSONObject jSONObject) {
        try {
            this.f118242a = jSONObject.getInt("calendarType");
            this.f118243b = jSONObject.getString("start");
            this.f118244c = jSONObject.getString("end");
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
