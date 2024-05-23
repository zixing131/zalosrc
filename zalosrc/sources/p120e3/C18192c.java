package p120e3;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p223i.AbstractC20170a;

/* renamed from: e3.c */
/* loaded from: classes2.dex */
public class C18192c extends AbstractC20170a {

    /* renamed from: a */
    public String f92365a;

    /* renamed from: b */
    public String f92366b;

    /* renamed from: c */
    public String f92367c;

    /* renamed from: d */
    public String f92368d;

    /* renamed from: e */
    public String f92369e;

    /* renamed from: f */
    public String f92370f;

    /* renamed from: g */
    public ArrayList f92371g;

    /* renamed from: d */
    public static C18192c m96956d(JSONObject jSONObject) {
        String str;
        ArrayList arrayList;
        JSONArray jSONArray;
        String str2;
        Object obj;
        String str3;
        JSONArray jSONArray2;
        String str4;
        String str5 = "text";
        Object obj2 = null;
        if (jSONObject != null) {
            try {
                C18192c c18192c = new C18192c();
                try {
                    String optString = jSONObject.optString("logo", null);
                    String optString2 = jSONObject.optString("title", null);
                    String optString3 = jSONObject.optString("button", null);
                    String optString4 = jSONObject.optString("button_scheme", null);
                    String optString5 = jSONObject.optString("logo_scheme", null);
                    String optString6 = jSONObject.optString("tracking", null);
                    JSONArray jSONArray3 = jSONObject.getJSONArray("messages");
                    if (jSONArray3 == null || jSONArray3.length() <= 0) {
                        str = optString6;
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = 0;
                        while (i11 < jSONArray3.length()) {
                            JSONObject jSONObject2 = jSONArray3.getJSONObject(i11);
                            if (jSONObject2 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                jSONArray = jSONArray3;
                                String optString7 = jSONObject2.optString(str5, null);
                                str3 = optString6;
                                String optString8 = jSONObject2.optString("image", null);
                                String optString9 = jSONObject2.optString("scheme", null);
                                String optString10 = jSONObject2.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE, null);
                                JSONArray jSONArray4 = jSONObject2.getJSONArray("buttons");
                                if (jSONArray4 != null && jSONArray4.length() > 0) {
                                    int i12 = 0;
                                    while (i12 < jSONArray4.length()) {
                                        JSONObject jSONObject3 = jSONArray4.getJSONObject(i12);
                                        if (jSONObject3 != null) {
                                            jSONArray2 = jSONArray4;
                                            str4 = str5;
                                            arrayList3.add(new C18190a(jSONObject3.optString(str5, null), jSONObject3.optString("tracking", null), jSONObject3.optString("data", null), jSONObject3.optString("scheme", null), jSONObject3.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE, null)));
                                        } else {
                                            jSONArray2 = jSONArray4;
                                            str4 = str5;
                                        }
                                        i12++;
                                        jSONArray4 = jSONArray2;
                                        str5 = str4;
                                    }
                                }
                                str2 = str5;
                                obj = null;
                                arrayList2.add(new C18191b(optString7, optString9, optString10, optString8, arrayList3));
                            } else {
                                jSONArray = jSONArray3;
                                str2 = str5;
                                obj = obj2;
                                str3 = optString6;
                            }
                            i11++;
                            obj2 = obj;
                            str5 = str2;
                            jSONArray3 = jSONArray;
                            optString6 = str3;
                        }
                        str = optString6;
                        arrayList = arrayList2;
                    }
                    c18192c.f92365a = optString;
                    c18192c.f92366b = optString2;
                    c18192c.f92368d = optString4;
                    c18192c.f92369e = optString5;
                    c18192c.f92367c = optString3;
                    c18192c.f92370f = str;
                    c18192c.f92371g = arrayList;
                } catch (Exception unused) {
                }
                return c18192c;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: a */
    protected Object mo433a(JSONObject jSONObject) {
        return m96956d(jSONObject);
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: b */
    protected JSONObject mo434b() {
        return m96958e();
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C18192c clone() {
        return (C18192c) super.clone();
    }

    /* renamed from: e */
    public JSONObject m96958e() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sLogo", this.f92365a);
                jSONObject.put("sTitle", this.f92366b);
                jSONObject.put("sButton", this.f92367c);
                jSONObject.put("sButtonScheme", this.f92368d);
                jSONObject.put("sLogoScheme", this.f92369e);
                jSONObject.put("sTracking", this.f92370f);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = this.f92371g;
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i11 = 0; i11 < this.f92371g.size(); i11++) {
                        jSONArray.put(this.f92371g.get(i11));
                    }
                }
                jSONObject.put("messages", jSONArray);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
