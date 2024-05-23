package p009a3;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p223i.AbstractC20170a;

/* renamed from: a3.b */
/* loaded from: classes2.dex */
public final class C0097b extends AbstractC20170a {

    /* renamed from: a */
    public int f460a;

    /* renamed from: b */
    public String f461b;

    /* renamed from: c */
    public ArrayList f462c;

    /* renamed from: d */
    public ArrayList f463d;

    /* renamed from: e */
    public ArrayList f464e;

    /* renamed from: f */
    public String f465f;

    /* renamed from: d */
    public static C0097b m437d(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (jSONObject != null) {
            try {
                int optInt = jSONObject.optInt("template_ver");
                String optString = jSONObject.optString("map");
                JSONArray optJSONArray = jSONObject.optJSONArray("css");
                if (optJSONArray != null) {
                    arrayList = new ArrayList();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        String optString2 = optJSONArray.optString(i11);
                        if (optString2 != null && optString2.length() != 0) {
                            arrayList.add(optString2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("html");
                if (optJSONArray2 != null) {
                    arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                        String optString3 = optJSONArray2.optString(i12);
                        if (optString3 != null && optString3.length() != 0) {
                            arrayList2.add(optString3);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("img");
                if (optJSONArray3 != null) {
                    arrayList3 = new ArrayList();
                    for (int i13 = 0; i13 < optJSONArray3.length(); i13++) {
                        String optString4 = optJSONArray3.optString(i13);
                        if (optString4 != null && optString4.length() != 0) {
                            arrayList3.add(optString4);
                        }
                    }
                } else {
                    arrayList3 = null;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("ext");
                String optString5 = optJSONObject != null ? optJSONObject.optString("inventory") : null;
                if (optInt <= 0 || arrayList == null || arrayList2 == null || arrayList3 == null) {
                    return null;
                }
                C0097b c0097b = new C0097b();
                try {
                    c0097b.f460a = optInt;
                    c0097b.f461b = optString;
                    c0097b.f462c = arrayList;
                    c0097b.f463d = arrayList2;
                    c0097b.f464e = arrayList3;
                    c0097b.f465f = optString5;
                } catch (Exception unused) {
                }
                return c0097b;
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: a */
    protected Object mo433a(JSONObject jSONObject) {
        return m437d(jSONObject);
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: b */
    protected JSONObject mo434b() {
        return m439e();
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0097b clone() {
        return (C0097b) super.clone();
    }

    /* renamed from: e */
    public JSONObject m439e() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("template_ver", this.f460a);
                jSONObject.put("map", this.f461b);
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f462c.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("css", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.f463d.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
                jSONObject.put("html", jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.f464e.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put((String) it3.next());
                }
                jSONObject.put("img", jSONArray3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("inventory", this.f465f);
                jSONObject.put("ext", jSONObject2);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
