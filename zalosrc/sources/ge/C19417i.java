package ge;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ge.i */
/* loaded from: classes3.dex */
public class C19417i {

    /* renamed from: a */
    public int f96338a;

    /* renamed from: b */
    public int f96339b;

    /* renamed from: c */
    public ArrayList f96340c;

    public C19417i(int i11, int i12, ArrayList arrayList) {
        this.f96338a = 0;
        this.f96339b = 0;
        new ArrayList();
        this.f96338a = i11;
        this.f96339b = i12;
        this.f96340c = arrayList;
    }

    /* renamed from: a */
    public JSONObject m101554a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f96338a);
            jSONObject.put("numResponse", this.f96339b);
            ArrayList arrayList = this.f96340c;
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < this.f96340c.size(); i11++) {
                    jSONArray.put(this.f96340c.get(i11));
                }
                jSONObject.put("responseUids", jSONArray);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    public C19417i(JSONObject jSONObject) {
        this.f96338a = 0;
        this.f96339b = 0;
        this.f96340c = new ArrayList();
        if (jSONObject == null) {
            return;
        }
        this.f96338a = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
        this.f96339b = jSONObject.optInt("numResponse", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("responseUids");
        if (optJSONArray != null) {
            this.f96340c = new ArrayList();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                this.f96340c.add(optJSONArray.optString(i11));
            }
            return;
        }
        this.f96340c = new ArrayList();
    }
}
