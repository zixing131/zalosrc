package dj;

import com.zing.zalo.control.C7907e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.Serializable;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.i0 */
/* loaded from: classes3.dex */
public class C17969i0 implements Serializable {

    /* renamed from: p */
    public String f91011p;

    /* renamed from: q */
    public int f91012q;

    /* renamed from: r */
    public String f91013r;

    /* renamed from: s */
    public String f91014s;

    /* renamed from: t */
    public String f91015t;

    /* renamed from: u */
    public String f91016u;

    /* renamed from: v */
    public String f91017v;

    /* renamed from: w */
    public C7907e f91018w;

    /* renamed from: x */
    public boolean f91019x;

    /* renamed from: y */
    public boolean f91020y;

    /* renamed from: z */
    public String f91021z;
    public static final a Companion = new a(null);

    /* renamed from: A */
    private static final String f91010A = C17969i0.class.getSimpleName();

    /* renamed from: dj.i0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17969i0() {
        this.f91021z = "";
        this.f91011p = "";
        this.f91012q = 0;
        this.f91013r = "";
        this.f91014s = "";
        this.f91015t = "";
        this.f91016u = "";
        this.f91017v = "";
    }

    /* renamed from: b */
    public final boolean m95595b() {
        return this.f91019x;
    }

    /* renamed from: c */
    public String mo95393c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("\"title\":" + JSONObject.quote(this.f91011p) + ",");
        sb2.append("\"description\":" + JSONObject.quote(this.f91015t) + ",");
        sb2.append("\"href\":" + JSONObject.quote(this.f91014s) + ",");
        sb2.append("\"thumb\":" + JSONObject.quote(this.f91013r) + ",");
        sb2.append("\"childnumber\":" + JSONObject.quote(String.valueOf(this.f91012q)) + ",");
        sb2.append("\"action\":" + JSONObject.quote(this.f91016u) + ",");
        C7907e c7907e = this.f91018w;
        if (c7907e != null && c7907e.m40861l() > 0) {
            JSONArray jSONArray = new JSONArray();
            int m40861l = c7907e.m40861l();
            for (int i11 = 0; i11 < m40861l; i11++) {
                jSONArray.put(c7907e.m40855e(i11).m40870h());
            }
            sb2.append("\"mentions\":" + jSONArray + ",");
        }
        sb2.append("\"params\":" + JSONObject.quote(this.f91017v));
        sb2.append("}");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: d */
    public String m95596d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("\"msgBubbleLayoutType\":1003,");
        sb2.append("\"title\":" + JSONObject.quote(this.f91011p) + ",");
        sb2.append("\"description\":" + JSONObject.quote(this.f91015t) + ",");
        sb2.append("\"href\":" + JSONObject.quote(this.f91014s) + ",");
        sb2.append("\"thumb\":" + JSONObject.quote(this.f91013r) + ",");
        sb2.append("\"childnumber\":" + JSONObject.quote(String.valueOf(this.f91012q)) + ",");
        sb2.append("\"action\":" + JSONObject.quote(this.f91016u) + ",");
        C7907e c7907e = this.f91018w;
        if (c7907e != null && c7907e.m40861l() > 0) {
            JSONArray jSONArray = new JSONArray();
            int m40861l = c7907e.m40861l();
            for (int i11 = 0; i11 < m40861l; i11++) {
                jSONArray.put(c7907e.m40855e(i11).m40870h());
            }
            sb2.append("\"mentions\":" + jSONArray + ",");
        }
        sb2.append("\"params\":" + JSONObject.quote(this.f91017v));
        sb2.append("}");
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: e */
    public String mo95597e() {
        return this.f91013r;
    }

    /* renamed from: f */
    public String mo95598f() {
        try {
            if (this.f91017v.length() == 0) {
                return "";
            }
            String m96089h = AbstractC18069a.m96089h(new JSONObject(this.f91017v), "hd");
            AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
            return m96089h;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f91010A, e11);
            return "";
        }
    }

    public C17969i0(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        this.f91011p = "";
        this.f91013r = "";
        this.f91014s = "";
        this.f91015t = "";
        this.f91016u = "";
        this.f91017v = "";
        this.f91021z = "";
        this.f91011p = (str == null || str.length() == 0) ? "" : str;
        this.f91012q = i11;
        this.f91013r = (str2 == null || str2.length() == 0) ? "" : str2;
        this.f91014s = (str3 == null || str3.length() == 0) ? "" : str3;
        this.f91015t = (str4 == null || str4.length() == 0) ? "" : str4;
        this.f91016u = (str5 == null || str5.length() == 0) ? "" : str5;
        this.f91017v = (str6 == null || str6.length() == 0) ? "" : str6;
    }

    public C17969i0(JSONObject jSONObject) {
        JSONArray m96090i;
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f91011p = "";
        this.f91013r = "";
        this.f91014s = "";
        this.f91015t = "";
        this.f91016u = "";
        this.f91017v = "";
        this.f91021z = "";
        try {
            if (jSONObject.has("title")) {
                String optString = jSONObject.optString("title");
                AbstractC19074t.m100207e(optString, "optString(...)");
                this.f91011p = optString;
            }
            if (jSONObject.has("childnumber")) {
                this.f91012q = AbstractC18069a.m96085d(jSONObject, "childnumber");
            }
            if (jSONObject.has("thumb")) {
                String m96089h = AbstractC18069a.m96089h(jSONObject, "thumb");
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                this.f91013r = m96089h;
            }
            if (jSONObject.has("href")) {
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "href");
                AbstractC19074t.m100207e(m96089h2, "getJSONValue(...)");
                this.f91014s = m96089h2;
            }
            if (jSONObject.has("description")) {
                String m96089h3 = AbstractC18069a.m96089h(jSONObject, "description");
                AbstractC19074t.m100207e(m96089h3, "getJSONValue(...)");
                this.f91015t = m96089h3;
            }
            if (jSONObject.has("action")) {
                String m96089h4 = AbstractC18069a.m96089h(jSONObject, "action");
                AbstractC19074t.m100207e(m96089h4, "getJSONValue(...)");
                this.f91016u = m96089h4;
            }
            if (jSONObject.has("params")) {
                String m96089h5 = AbstractC18069a.m96089h(jSONObject, "params");
                AbstractC19074t.m100207e(m96089h5, "getJSONValue(...)");
                this.f91017v = m96089h5;
            }
            if (!jSONObject.has("mentions") || (m96090i = AbstractC18069a.m96090i(jSONObject, "mentions")) == null || m96090i.length() <= 0) {
                return;
            }
            C7907e c7907e = new C7907e();
            int length = m96090i.length();
            for (int i11 = 0; i11 < length; i11++) {
                c7907e.m40852b(new C7907e.a(m96090i.getJSONObject(i11)));
            }
            this.f91018w = c7907e;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
