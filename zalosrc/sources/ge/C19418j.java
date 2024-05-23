package ge;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import org.json.JSONException;
import org.json.JSONObject;
import p716zh.C31868c5;

/* renamed from: ge.j */
/* loaded from: classes3.dex */
public class C19418j extends C31868c5 {

    /* renamed from: c */
    public String f96341c;

    /* renamed from: d */
    public String f96342d;

    public C19418j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
        if (optJSONObject != null) {
            m153172d(optJSONObject.optDouble("lon", 0.0d));
            m153171c(optJSONObject.optDouble("lat", 0.0d));
        } else {
            m153171c(0.0d);
            m153172d(0.0d);
        }
        this.f96341c = jSONObject.optString("title");
        this.f96342d = jSONObject.optString("address");
    }

    /* renamed from: e */
    public JSONObject m101555e() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("lat", m153169a());
            jSONObject2.put("lon", m153170b());
            jSONObject.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, jSONObject2);
            jSONObject.put("title", this.f96341c);
            jSONObject.put("address", this.f96342d);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
