package bo;

import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.c0 */
/* loaded from: classes4.dex */
public class C2955c0 {

    /* renamed from: a */
    HashMap f11659a = new HashMap();

    /* renamed from: b */
    HashMap f11660b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bo.c0$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        private static final C2955c0 f11661a = new C2955c0();
    }

    /* renamed from: b */
    public static C2955c0 m13996b() {
        return a.f11661a;
    }

    /* renamed from: e */
    public static void m13997e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            C2955c0 m13996b = m13996b();
            JSONArray optJSONArray = jSONObject.optJSONArray("templates");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    m13996b.m13998a(C2945a0.m13941b(optJSONArray.getJSONObject(i11)));
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("mapping_year");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m13996b.m14001f(next, m13996b.m13999c(optJSONObject.optInt(next)));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: a */
    public void m13998a(C2945a0 c2945a0) {
        HashMap hashMap = this.f11659a;
        if (hashMap != null && c2945a0 != null) {
            hashMap.put(Integer.valueOf(c2945a0.m13943d()), c2945a0);
        }
    }

    /* renamed from: c */
    public C2945a0 m13999c(int i11) {
        HashMap hashMap = this.f11659a;
        if (hashMap != null && hashMap.containsKey(Integer.valueOf(i11))) {
            return (C2945a0) this.f11659a.get(Integer.valueOf(i11));
        }
        return null;
    }

    /* renamed from: d */
    public C2945a0 m14000d(String str) {
        HashMap hashMap = this.f11660b;
        if (hashMap != null && hashMap.containsKey(str)) {
            return (C2945a0) this.f11660b.get(str);
        }
        return null;
    }

    /* renamed from: f */
    public void m14001f(String str, C2945a0 c2945a0) {
        HashMap hashMap = this.f11660b;
        if (hashMap != null) {
            hashMap.put(str, c2945a0);
        }
    }
}
