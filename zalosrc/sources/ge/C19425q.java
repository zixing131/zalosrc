package ge;

import android.text.TextUtils;
import org.json.JSONArray;

/* renamed from: ge.q */
/* loaded from: classes3.dex */
public class C19425q {

    /* renamed from: a */
    public C19424p f96376a;

    /* renamed from: b */
    public C19424p f96377b;

    /* renamed from: c */
    public C19424p f96378c;

    /* renamed from: d */
    public int f96379d;

    public C19425q() {
        this.f96379d = 0;
    }

    /* renamed from: a */
    public JSONArray m101573a() {
        JSONArray jSONArray = new JSONArray();
        C19424p c19424p = this.f96376a;
        if (c19424p != null && c19424p.f96370a != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("RRULE:");
            sb2.append(this.f96376a.m101572d());
            jSONArray.put(sb2);
        }
        if (this.f96377b != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("RDATE;");
            sb3.append(this.f96377b.m101572d());
            jSONArray.put(sb3);
        }
        if (this.f96378c != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("EXDATE;");
            sb4.append(this.f96378c.m101572d());
            jSONArray.put(sb4);
        }
        return jSONArray;
    }

    public C19425q(String str, int i11) {
        this.f96379d = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    strArr[i12] = jSONArray.getString(i12);
                }
                for (int i13 = 0; i13 < length; i13++) {
                    String str2 = strArr[i13];
                    if (str2.contains("EXDATE;")) {
                        this.f96378c = new C19424p(str2.replace("EXDATE;", ""), i11);
                    } else if (str2.contains("RDATE;")) {
                        this.f96377b = new C19424p(str2.replace("RDATE;", ""), i11);
                    } else if (str2.contains("RRULE:")) {
                        this.f96376a = new C19424p(str2.replace("RRULE:", ""), i11);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f96379d = i11;
    }

    public C19425q(JSONArray jSONArray, int i11) {
        this.f96379d = 0;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    String[] strArr = new String[length];
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        strArr[i12] = jSONArray.getString(i12);
                    }
                    for (int i13 = 0; i13 < length; i13++) {
                        String str = strArr[i13];
                        if (str.contains("EXDATE;")) {
                            this.f96378c = new C19424p(str.replace("EXDATE;", ""), i11);
                        } else if (str.contains("RDATE;")) {
                            this.f96377b = new C19424p(str.replace("RDATE;", ""), i11);
                        } else if (str.contains("RRULE:")) {
                            this.f96376a = new C19424p(str.replace("RRULE:", ""), i11);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.f96379d = i11;
    }
}
