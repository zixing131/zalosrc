package p404ou;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ou.b */
/* loaded from: classes4.dex */
public class C24556b {

    /* renamed from: a */
    public ArrayList f118240a;

    /* renamed from: b */
    public String f118241b;

    public C24556b(JSONObject jSONObject) {
        try {
            this.f118240a = new ArrayList();
            this.f118241b = jSONObject.getString("filterType");
            JSONArray jSONArray = jSONObject.getJSONArray("regex");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                this.f118240a.add((String) jSONArray.get(i11));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
