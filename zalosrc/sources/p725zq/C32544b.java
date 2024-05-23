package p725zq;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p618wq.C29190a;

/* renamed from: zq.b */
/* loaded from: classes4.dex */
public final class C32544b {

    /* renamed from: a */
    public static final C32544b f150395a = new C32544b();

    private C32544b() {
    }

    /* renamed from: a */
    public final String m157601a() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return str;
    }

    /* renamed from: b */
    public final List m157602b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            try {
                optJSONObject = jSONObject.optJSONObject("data");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else {
            optJSONObject = null;
        }
        if (optJSONObject != null) {
            if (optJSONObject.has("feeds") && (optJSONObject2 = optJSONObject.optJSONObject("feeds")) != null) {
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C29190a.a aVar = C29190a.f135245f;
                    AbstractC19074t.m100205c(next);
                    arrayList.add(aVar.m145744b(next, optJSONObject2.optJSONObject(next)));
                }
            }
            if (optJSONObject.has("cmd_cfg")) {
                JSONObject jSONObject2 = optJSONObject.getJSONObject("cmd_cfg");
                if (jSONObject2.has("sup_duration")) {
                    C32543a.f150389a.m157597j(jSONObject2.getLong("sup_duration") * 1000);
                }
                if (jSONObject2.has("num_feeds_preload")) {
                    C32543a.f150389a.m157599l(jSONObject2.getInt("num_feeds_preload"));
                }
                if (jSONObject2.has("queue_size_req")) {
                    C32543a.f150389a.m157600m(jSONObject2.getInt("queue_size_req"));
                }
                if (jSONObject2.has("retry_ttl")) {
                    C32543a.f150389a.m157598k(jSONObject2.getLong("retry_ttl") * 1000);
                }
            }
        }
        return arrayList;
    }
}
