package is;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: is.m */
/* loaded from: classes4.dex */
public class C20807m {

    /* renamed from: e */
    static volatile C20807m f102245e;

    /* renamed from: b */
    private final int f102247b = 100;

    /* renamed from: c */
    private final String f102248c = "key";

    /* renamed from: d */
    private final String f102249d = "value";

    /* renamed from: a */
    protected Map f102246a = new a();

    /* renamed from: is.m$a */
    /* loaded from: classes4.dex */
    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }
    }

    private C20807m() {
    }

    /* renamed from: a */
    public static synchronized C20807m m108556a() {
        C20807m c20807m;
        synchronized (C20807m.class) {
            try {
                if (f102245e == null) {
                    synchronized (C20807m.class) {
                        try {
                            if (f102245e == null) {
                                f102245e = new C20807m();
                            }
                        } finally {
                        }
                    }
                }
                c20807m = f102245e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20807m;
    }

    /* renamed from: b */
    public void m108557b() {
        try {
            String m121930g4 = AbstractC23309i.m121930g4();
            if (TextUtils.isEmpty(m121930g4)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(m121930g4);
            this.f102246a.clear();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (jSONObject != null) {
                    String optString = jSONObject.optString("key");
                    String optString2 = jSONObject.optString("value");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        this.f102246a.put(optString, optString2);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
