package p716zh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import vg.C28202u5;

/* renamed from: zh.b6 */
/* loaded from: classes3.dex */
public class C31854b6 {

    /* renamed from: a */
    public Map f146276a = new HashMap();

    public C31854b6(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        C28202u5 c28202u5 = new C28202u5(optJSONObject);
                        if (c28202u5.m141796a()) {
                            this.f146276a.put(c28202u5.f131404b, c28202u5);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m153140a() {
        Map map = this.f146276a;
        if (map != null && map.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public JSONArray m153141b() {
        JSONArray jSONArray = new JSONArray();
        try {
            Map map = this.f146276a;
            if (map != null && !map.isEmpty()) {
                Iterator it = this.f146276a.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C28202u5) it.next()).m141797b());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONArray;
    }
}
