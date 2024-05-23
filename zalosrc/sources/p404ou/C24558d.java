package p404ou;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ou.d */
/* loaded from: classes4.dex */
public class C24558d {

    /* renamed from: a */
    public String f118245a;

    /* renamed from: b */
    public ArrayList f118246b = new ArrayList();

    /* renamed from: c */
    public C24557c f118247c;

    public C24558d(JSONObject jSONObject) {
        this.f118245a = "";
        try {
            this.f118245a = jSONObject.getString("regexType");
            JSONArray jSONArray = jSONObject.getJSONArray("regex");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                this.f118246b.add((String) jSONArray.get(i11));
            }
            if (this.f118245a.equals("custom") && jSONObject.has("regexInfo")) {
                this.f118247c = new C24557c(jSONObject.getJSONObject("regexInfo"));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
