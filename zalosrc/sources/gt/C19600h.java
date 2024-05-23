package gt;

import gt.AbstractC19593a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: gt.h */
/* loaded from: classes4.dex */
public class C19600h extends AbstractC19593a {

    /* renamed from: c */
    public float[] f97367c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19600h(JSONObject jSONObject) {
        super(jSONObject);
        this.f97340b = AbstractC19593a.a.VECTOR;
        JSONArray jSONArray = jSONObject.getJSONArray("data");
        this.f97367c = new float[jSONArray.length()];
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            this.f97367c[i11] = (float) jSONArray.getDouble(i11);
        }
    }
}
