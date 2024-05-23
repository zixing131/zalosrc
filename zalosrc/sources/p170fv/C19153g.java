package p170fv;

import android.graphics.Color;
import org.json.JSONObject;

/* renamed from: fv.g */
/* loaded from: classes4.dex */
public class C19153g extends AbstractC19147a {
    public C19153g(JSONObject jSONObject) {
        super(jSONObject);
        m100486r(2);
        if (jSONObject != null) {
            String optString = jSONObject.optString("backgroundColor", "");
            try {
                m100485q(m100473e());
                m100481m(Integer.valueOf(Color.parseColor(optString)));
                m100480l(jSONObject.optString("backgroundImage", "null"));
            } catch (Exception unused) {
            }
        }
    }
}
