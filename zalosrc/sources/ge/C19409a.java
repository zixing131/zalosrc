package ge;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ge.a */
/* loaded from: classes3.dex */
public class C19409a {

    /* renamed from: a */
    public boolean f96249a;

    /* renamed from: b */
    public int f96250b;

    /* renamed from: c */
    public ArrayList f96251c = new ArrayList();

    public C19409a(JSONObject jSONObject) {
        this.f96249a = false;
        this.f96250b = 0;
        if (jSONObject == null) {
            return;
        }
        this.f96249a = jSONObject.optInt("enable", 1) == 1;
        this.f96250b = jSONObject.optInt("userResponse", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("responseInfo");
        if (optJSONArray != null) {
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                if (optJSONObject != null) {
                    this.f96251c.add(new C19417i(optJSONObject));
                }
            }
        }
    }

    /* renamed from: a */
    public JSONObject m101524a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", this.f96249a ? 1 : 0);
            jSONObject.put("userResponse", this.f96250b);
            ArrayList arrayList = this.f96251c;
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < this.f96251c.size(); i11++) {
                    jSONArray.put(((C19417i) this.f96251c.get(i11)).m101554a());
                }
                jSONObject.put("responseInfo", jSONArray);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
