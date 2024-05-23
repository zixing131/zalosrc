package p055ce;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ce.m */
/* loaded from: classes3.dex */
public abstract class AbstractC3444m {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m17339b(Map map, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        AbstractC19074t.m100207e(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            AbstractC19074t.m100205c(next);
            map.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
        }
    }
}
