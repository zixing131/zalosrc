package vi;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p128ed.C18388c;
import p128ed.C18390e;
import p543uc.C27224b;

/* renamed from: vi.a */
/* loaded from: classes3.dex */
public class C28255a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f131746a;

    /* renamed from: b */
    private String f131747b;

    /* renamed from: c */
    private String f131748c;

    /* renamed from: d */
    private String f131749d;

    /* renamed from: e */
    private long f131750e;

    /* renamed from: f */
    private long f131751f;

    /* renamed from: g */
    private String f131752g;

    /* renamed from: h */
    private ArrayList f131753h;

    /* renamed from: vi.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28255a m142284a(String str, String str2, long j11, long j12) {
            AbstractC19074t.m100208f(str, "md5URL");
            AbstractC19074t.m100208f(str2, "driveId");
            C28255a c28255a = new C28255a();
            c28255a.mo142280t(str);
            c28255a.m142275o(str2);
            c28255a.m142283w(j11);
            c28255a.m142276p(j12);
            return c28255a;
        }

        /* renamed from: b */
        public final C28255a m142285b(String str, long j11, String str2) {
            AbstractC19074t.m100208f(str, "localPath");
            AbstractC19074t.m100208f(str2, "md5URL");
            C28255a c28255a = new C28255a();
            c28255a.m142278r(str);
            c28255a.m142283w(j11);
            c28255a.mo142280t(str2);
            c28255a.m142276p(C18388c.f92779a.m97393d(str));
            return c28255a;
        }

        /* renamed from: c */
        public final C28255a m142286c(C28255a c28255a) {
            AbstractC19074t.m100208f(c28255a, "clone");
            C28255a c28255a2 = new C28255a();
            c28255a2.m142275o(c28255a.m142266e());
            c28255a2.mo142280t(c28255a.mo142271k());
            c28255a2.m142278r(c28255a.m142269i());
            c28255a2.m142281u(c28255a.m142272l());
            c28255a2.m142276p(c28255a.m142267g());
            c28255a2.m142283w(c28255a.m142274n());
            c28255a2.m142279s(c28255a.m142270j());
            c28255a2.m142277q(c28255a.m142268h());
            return c28255a2;
        }

        /* renamed from: d */
        public final C28255a m142287d(JSONObject jSONObject) {
            long j11;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("id");
            String optString3 = jSONObject.optString("mimeType");
            long optLong = jSONObject.optLong("size");
            JSONObject optJSONObject = jSONObject.optJSONObject("properties");
            if (optJSONObject != null) {
                j11 = optJSONObject.optLong("timestamp");
            } else {
                j11 = 0;
            }
            C28255a c28255a = new C28255a();
            c28255a.m142278r("");
            AbstractC19074t.m100205c(optString2);
            c28255a.m142275o(optString2);
            AbstractC19074t.m100205c(optString3);
            c28255a.m142281u(optString3);
            c28255a.m142276p(optLong);
            c28255a.m142283w(j11);
            AbstractC19074t.m100205c(optString);
            c28255a.mo142280t(optString);
            c28255a.m142282v(null);
            return c28255a;
        }
    }

    public C28255a() {
        this.f131746a = "";
        this.f131747b = "";
        this.f131748c = "";
        this.f131749d = "image/*";
        this.f131752g = "type_image";
    }

    /* renamed from: e */
    public final String m142266e() {
        return this.f131746a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !C28255a.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return AbstractC19074t.m100204b(((C28255a) obj).mo142271k(), mo142271k());
    }

    /* renamed from: g */
    public final long m142267g() {
        return this.f131750e;
    }

    /* renamed from: h */
    public final ArrayList m142268h() {
        return this.f131753h;
    }

    public int hashCode() {
        return C18390e.f92781a.m97418e(mo142271k());
    }

    /* renamed from: i */
    public final String m142269i() {
        return this.f131748c;
    }

    /* renamed from: j */
    public final String m142270j() {
        return this.f131752g;
    }

    /* renamed from: k */
    public String mo142271k() {
        return this.f131747b;
    }

    /* renamed from: l */
    public final String m142272l() {
        return this.f131749d;
    }

    /* renamed from: m */
    public final String m142273m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", mo142271k());
            JSONArray jSONArray = new JSONArray();
            if (this.f131753h != null) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f131753h;
                    AbstractC19074t.m100205c(arrayList);
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    ArrayList arrayList2 = this.f131753h;
                    AbstractC19074t.m100205c(arrayList2);
                    jSONArray.put(arrayList2.get(i11));
                    i11++;
                }
            } else {
                jSONArray.put(C27224b.f127988a.m139322b());
            }
            jSONObject.put("parents", jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("user", CoreUtility.f89233i.toString());
            jSONObject2.put("local_type", this.f131752g);
            jSONObject2.put("timestamp", this.f131751f);
            jSONObject.put("properties", jSONObject2);
            jSONObject.put("mimeType", this.f131749d);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        AbstractC20110a.f98889a.mo104548a("Export param:" + jSONObject, new Object[0]);
        String jSONObject3 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    /* renamed from: n */
    public final long m142274n() {
        return this.f131751f;
    }

    /* renamed from: o */
    public final void m142275o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131746a = str;
    }

    /* renamed from: p */
    public final void m142276p(long j11) {
        this.f131750e = j11;
    }

    /* renamed from: q */
    public final void m142277q(ArrayList arrayList) {
        this.f131753h = arrayList;
    }

    /* renamed from: r */
    public final void m142278r(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131748c = str;
    }

    /* renamed from: s */
    public final void m142279s(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131752g = str;
    }

    /* renamed from: t */
    public void mo142280t(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131747b = str;
    }

    public String toString() {
        return "{ driveId=" + this.f131746a + ", md5URL=" + mo142271k() + ", localPath=" + this.f131748c + ", mimeType=" + this.f131749d + ", fileSize=" + this.f131750e + ", timestamp=" + this.f131751f + ", localType=" + this.f131752g + " }";
    }

    /* renamed from: u */
    public final void m142281u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131749d = str;
    }

    /* renamed from: v */
    public final void m142282v(String str) {
        if (str != null && str.length() != 0) {
            if (this.f131753h == null) {
                this.f131753h = new ArrayList();
            }
            ArrayList arrayList = this.f131753h;
            if (arrayList != null) {
                arrayList.add(str);
            }
        }
    }

    /* renamed from: w */
    public final void m142283w(long j11) {
        this.f131751f = j11;
    }

    public C28255a(String str, String str2) {
        AbstractC19074t.m100208f(str, "driveId");
        AbstractC19074t.m100208f(str2, "localPath");
        this.f131747b = "";
        this.f131749d = "image/*";
        this.f131752g = "type_image";
        this.f131746a = str;
        this.f131748c = str2;
    }
}
