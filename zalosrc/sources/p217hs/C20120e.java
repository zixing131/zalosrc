package p217hs;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: hs.e */
/* loaded from: classes4.dex */
public final class C20120e {

    /* renamed from: a */
    public static final C20120e f99217a;

    /* renamed from: b */
    private static final ArrayList f99218b;

    /* renamed from: c */
    private static final ArrayList f99219c;

    static {
        C20120e c20120e = new C20120e();
        f99217a = c20120e;
        f99218b = new ArrayList();
        f99219c = new ArrayList();
        c20120e.m104725e();
    }

    private C20120e() {
    }

    /* renamed from: a */
    private final void m104721a() {
        f99218b.clear();
        f99219c.clear();
    }

    /* renamed from: d */
    private final void m104722d(JSONObject jSONObject) {
        try {
            f99218b.clear();
            f99219c.clear();
            if (jSONObject.has("visible_entry")) {
                JSONArray jSONArray = jSONObject.getJSONArray("visible_entry");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    ArrayList arrayList = f99218b;
                    Object obj = jSONArray.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                    arrayList.add((Integer) obj);
                }
            }
            if (jSONObject.has("send_direct")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("send_direct");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    ArrayList arrayList2 = f99219c;
                    Object obj2 = jSONArray2.get(i12);
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                    arrayList2.add((Integer) obj2);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final boolean m104723b(int i11) {
        return f99219c.contains(Integer.valueOf(i11));
    }

    /* renamed from: c */
    public final boolean m104724c(int i11) {
        return f99218b.contains(Integer.valueOf(i11));
    }

    /* renamed from: e */
    public final void m104725e() {
        String m3772e6 = AbstractC0924m0.m3772e6();
        AbstractC19074t.m100205c(m3772e6);
        if (m3772e6.length() == 0) {
            m104721a();
        } else {
            m104722d(new JSONObject(m3772e6));
        }
    }
}
