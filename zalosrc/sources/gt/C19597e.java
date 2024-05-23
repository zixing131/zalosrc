package gt;

import gt.AbstractC19593a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: gt.e */
/* loaded from: classes4.dex */
public class C19597e extends AbstractC19593a {

    /* renamed from: c */
    public float[] f97353c;

    public C19597e(JSONObject jSONObject) {
        super(jSONObject);
        this.f97340b = AbstractC19593a.a.MATRIX;
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        this.f97353c = new float[jSONArray.length()];
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            this.f97353c[i11] = (float) jSONArray.getDouble(i11);
        }
    }
}
