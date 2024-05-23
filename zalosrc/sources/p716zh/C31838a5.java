package p716zh;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import me0.AbstractC23160o0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zh.a5 */
/* loaded from: classes3.dex */
public class C31838a5 {

    /* renamed from: a */
    public int f146117a;

    /* renamed from: b */
    public List f146118b;

    /* renamed from: c */
    public String f146119c;

    /* renamed from: d */
    public int f146120d;

    /* renamed from: e */
    public int f146121e;

    /* renamed from: f */
    public List f146122f;

    /* renamed from: zh.a5$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f146123a;

        /* renamed from: b */
        public int f146124b;

        /* renamed from: c */
        public String f146125c;

        public a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f146123a = jSONObject.optString("emoji");
            this.f146124b = jSONObject.optInt("stickerId");
            this.f146125c = jSONObject.optString("gifId");
        }
    }

    /* renamed from: zh.a5$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        int[] f146126a;

        /* renamed from: b */
        int f146127b;

        /* renamed from: c */
        int f146128c;

        /* renamed from: d */
        int f146129d;

        /* renamed from: e */
        int f146130e;

        b(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("date");
            this.f146127b = jSONObject.optInt("startH", -1);
            this.f146128c = jSONObject.optInt("startM", 0);
            this.f146129d = jSONObject.optInt("endH", -1);
            this.f146130e = jSONObject.optInt("endM", 0);
            if (optJSONArray != null) {
                this.f146126a = new int[optJSONArray.length()];
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    if (optJSONArray.optInt(i11) != 0) {
                        this.f146126a[i11] = optJSONArray.optInt(i11);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean m152965a() {
            if (this.f146126a == null) {
                return true;
            }
            int m119234a0 = AbstractC23160o0.m119234a0() + 1;
            for (int i11 : this.f146126a) {
                if (m119234a0 == i11) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean m152966b() {
            int i11;
            int i12 = this.f146127b;
            if (i12 == -1 || (i11 = this.f146128c) == -1) {
                return true;
            }
            int i13 = (i12 * 60) + i11;
            int i14 = (this.f146129d * 60) + this.f146130e;
            Calendar calendar = Calendar.getInstance();
            int i15 = (calendar.get(11) * 60) + calendar.get(12);
            if (i13 <= i15 && i15 <= i14) {
                return true;
            }
            return false;
        }
    }

    public C31838a5(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f146117a = jSONObject.optInt("msgtype");
        this.f146119c = jSONObject.optString("footerv2");
        int optInt = jSONObject.optInt("max_msg_length", 150);
        this.f146120d = optInt;
        if (optInt < 0 || optInt > 150) {
            this.f146120d = 150;
        }
        this.f146118b = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("condition");
        if (optJSONArray != null) {
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                this.f146118b.add(new a(optJSONArray.optJSONObject(i11)));
            }
        }
        this.f146121e = jSONObject.optInt("match_rule", 1);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("match_time");
        if (optJSONArray2 != null) {
            this.f146122f = new ArrayList();
            for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                this.f146122f.add(new b(optJSONArray2.optJSONObject(i12)));
            }
        }
    }
}
