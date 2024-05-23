package p148f3;

import com.adtima.Adtima;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p178g3.C19212g;
import p313l3.AbstractC22009b;

/* renamed from: f3.b */
/* loaded from: classes2.dex */
public final class C18710b {

    /* renamed from: e */
    public static final String f94009e = "b";

    /* renamed from: a */
    public String f94010a;

    /* renamed from: b */
    public String f94011b = null;

    /* renamed from: c */
    public String f94012c = null;

    /* renamed from: d */
    public String f94013d = null;

    /* renamed from: a */
    public static C18710b m98677a(JSONObject jSONObject) {
        C18710b c18710b = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("kind");
            String optString2 = jSONObject.optString("template_0");
            String optString3 = jSONObject.optString("template_1");
            String optString4 = jSONObject.optString("template_2");
            if (optString2 != null && optString2.length() != 0 && optString2.startsWith("file:")) {
                File file = new File(C19212g.m100811q().m100825o() + optString2.replace("file:", ""));
                if (file.exists()) {
                    optString2 = AbstractC22009b.m114895b(file.getAbsolutePath());
                }
            }
            if (optString3 != null && optString3.length() != 0 && optString3.startsWith("file:")) {
                File file2 = new File(C19212g.m100811q().m100825o() + optString3.replace("file:", ""));
                if (file2.exists()) {
                    optString3 = AbstractC22009b.m114895b(file2.getAbsolutePath());
                }
            }
            if (optString4 != null && optString4.length() != 0 && optString4.startsWith("file:")) {
                File file3 = new File(C19212g.m100811q().m100825o() + optString4.replace("file:", ""));
                if (file3.exists()) {
                    optString4 = AbstractC22009b.m114895b(file3.getAbsolutePath());
                }
            }
            C18710b c18710b2 = new C18710b();
            try {
                c18710b2.f94010a = optString;
                c18710b2.f94011b = optString2;
                c18710b2.f94012c = optString3;
                c18710b2.f94013d = optString4;
                return c18710b2;
            } catch (Exception e11) {
                e = e11;
                c18710b = c18710b2;
                Adtima.m18329e(f94009e, "deserialize - object", e);
                return c18710b;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: b */
    public static ArrayList m98678b(JSONArray jSONArray) {
        ArrayList arrayList = null;
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    C18710b m98677a = m98677a(jSONArray.getJSONObject(i11));
                    if (m98677a != null) {
                        arrayList2.add(m98677a);
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList = arrayList2;
                    Adtima.m18329e(f94009e, "deserialize - object", e);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: c */
    public JSONObject m98679c() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("kind", this.f94010a);
                jSONObject.put("template_0", this.f94011b);
                jSONObject.put("template_1", this.f94012c);
                jSONObject.put("template_2", this.f94013d);
            } catch (Exception e12) {
                e11 = e12;
                Adtima.m18329e(f94009e, "serialize - object", e11);
                return jSONObject;
            }
        } catch (Exception e13) {
            e11 = e13;
            jSONObject = null;
        }
        return jSONObject;
    }
}
