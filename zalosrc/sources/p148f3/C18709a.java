package p148f3;

import com.adtima.Adtima;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p009a3.C0096a;
import p178g3.C19212g;
import p313l3.AbstractC22009b;

/* renamed from: f3.a */
/* loaded from: classes2.dex */
public final class C18709a {

    /* renamed from: f */
    private static final String f94003f = "a";

    /* renamed from: a */
    public String f94004a;

    /* renamed from: b */
    public String f94005b;

    /* renamed from: c */
    public String f94006c = null;

    /* renamed from: d */
    public String f94007d = null;

    /* renamed from: e */
    public long f94008e = 0;

    /* renamed from: a */
    public static C18709a m98673a(C0096a c0096a) {
        try {
            C18709a c18709a = new C18709a();
            try {
                c18709a.f94006c = c0096a.f459b;
                return c18709a;
            } catch (Exception unused) {
                return c18709a;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static C18709a m98674b(JSONObject jSONObject) {
        Exception e11;
        C18709a c18709a;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("size");
                String optString2 = jSONObject.optString("kind");
                String optString3 = jSONObject.optString("template_0");
                String optString4 = jSONObject.optString("template_1");
                long optLong = jSONObject.optLong("cacheTime", 0L);
                if (optString3 != null && optString3.length() != 0 && optString3.startsWith("file:")) {
                    File file = new File(C19212g.m100811q().m100825o() + optString3.replace("file:", ""));
                    if (file.exists()) {
                        optString3 = AbstractC22009b.m114895b(file.getAbsolutePath());
                    }
                }
                if (optString4 != null && optString4.length() != 0 && optString4.startsWith("file:")) {
                    File file2 = new File(C19212g.m100811q().m100825o() + optString4.replace("file:", ""));
                    if (file2.exists()) {
                        optString4 = AbstractC22009b.m114895b(file2.getAbsolutePath());
                    }
                }
                c18709a = new C18709a();
                try {
                    c18709a.f94004a = optString;
                    c18709a.f94005b = optString2;
                    c18709a.f94006c = optString3;
                    c18709a.f94007d = optString4;
                    c18709a.f94008e = optLong;
                } catch (Exception e12) {
                    e11 = e12;
                    Adtima.m18329e(f94003f, "deserialize", e11);
                    return c18709a;
                }
            } catch (Exception e13) {
                e11 = e13;
                c18709a = null;
            }
            return c18709a;
        }
        return null;
    }

    /* renamed from: c */
    public static ArrayList m98675c(JSONArray jSONArray) {
        ArrayList arrayList = null;
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    C18709a m98674b = m98674b((JSONObject) jSONArray.get(i11));
                    if (m98674b != null) {
                        arrayList2.add(m98674b);
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList = arrayList2;
                    Adtima.m18329e(f94003f, "deserialize", e);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: d */
    public JSONObject m98676d() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("size", this.f94004a);
                jSONObject.put("kind", this.f94005b);
                jSONObject.put("template_0", this.f94006c);
                jSONObject.put("template_1", this.f94007d);
                jSONObject.put("cacheTime", this.f94008e);
            } catch (Exception e12) {
                e11 = e12;
                Adtima.m18329e(f94003f, "serialize", e11);
                return jSONObject;
            }
        } catch (Exception e13) {
            e11 = e13;
            jSONObject = null;
        }
        return jSONObject;
    }
}
