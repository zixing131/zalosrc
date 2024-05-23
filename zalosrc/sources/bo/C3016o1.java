package bo;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: bo.o1 */
/* loaded from: classes4.dex */
public class C3016o1 {

    /* renamed from: a */
    public String f12001a;

    /* renamed from: b */
    public String f12002b;

    /* renamed from: c */
    public a f12003c;

    /* renamed from: bo.o1$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public int f12004a;

        /* renamed from: b */
        public int f12005b;

        public a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    this.f12004a = jSONObject.optInt("start_color", 6346919);
                    this.f12005b = jSONObject.optInt("end_color", 10342715);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public JSONObject m14434a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start_color", this.f12004a);
                jSONObject.put("end_color", this.f12005b);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    public C3016o1(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f12001a = jSONObject.optString("icon");
                this.f12002b = jSONObject.optString("bg");
                JSONObject optJSONObject = jSONObject.optJSONObject("gradient");
                if (optJSONObject != null) {
                    this.f12003c = new a(optJSONObject);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14433a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = "";
            if (TextUtils.isEmpty(this.f12001a)) {
                str = "";
            } else {
                str = this.f12001a;
            }
            jSONObject.put("icon", str);
            if (!TextUtils.isEmpty(this.f12002b)) {
                str2 = this.f12002b;
            }
            jSONObject.put("bg", str2);
            a aVar = this.f12003c;
            if (aVar != null) {
                jSONObject.put("gradient", aVar.m14434a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}
