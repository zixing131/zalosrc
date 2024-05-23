package p009a3;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p223i.AbstractC20170a;

/* renamed from: a3.a */
/* loaded from: classes2.dex */
public class C0096a extends AbstractC20170a {

    /* renamed from: a */
    public int f458a;

    /* renamed from: b */
    public String f459b;

    /* renamed from: c */
    public static ArrayList m431c(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            C0096a m432e = m432e(jSONArray.getJSONObject(i11));
                            if (m432e != null) {
                                arrayList.add(m432e);
                            }
                        } catch (Exception unused) {
                            return arrayList;
                        }
                    }
                    return arrayList;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C0096a m432e(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("id");
                String optString = jSONObject.optString("data");
                C0096a c0096a = new C0096a();
                try {
                    c0096a.f458a = optInt;
                    c0096a.f459b = optString;
                    return c0096a;
                } catch (Exception unused) {
                    return c0096a;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: a */
    protected Object mo433a(JSONObject jSONObject) {
        return m432e(jSONObject);
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: b */
    protected JSONObject mo434b() {
        return m436f();
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0096a clone() {
        return (C0096a) super.clone();
    }

    /* renamed from: f */
    public JSONObject m436f() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", this.f459b);
                jSONObject.put("id", this.f458a);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
