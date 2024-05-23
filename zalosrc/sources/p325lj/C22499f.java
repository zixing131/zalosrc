package p325lj;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p369ns.AbstractC23933a;
import p461qu.AbstractC25495a;

/* renamed from: lj.f */
/* loaded from: classes3.dex */
public final class C22499f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f110092a;

    /* renamed from: b */
    private final int f110093b;

    /* renamed from: c */
    private final int f110094c;

    /* renamed from: d */
    private final int f110095d;

    /* renamed from: e */
    private final String f110096e;

    /* renamed from: f */
    private final String f110097f;

    /* renamed from: g */
    private final String f110098g;

    /* renamed from: h */
    private final String f110099h;

    /* renamed from: i */
    private final String f110100i;

    /* renamed from: j */
    private final C22495b f110101j;

    /* renamed from: k */
    private final C22497d f110102k;

    /* renamed from: l */
    private String f110103l;

    /* renamed from: m */
    private String f110104m;

    /* renamed from: n */
    private int f110105n;

    /* renamed from: o */
    private boolean f110106o;

    /* renamed from: lj.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22499f m116340a(String str) {
            AbstractC19074t.m100208f(str, "jsonStr");
            if (str.length() == 0) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("enable");
                int optInt2 = jSONObject.optInt("enable_social");
                String optString = jSONObject.optString("packageCheckInstall");
                String optString2 = jSONObject.optString("iconUrl");
                String optString3 = jSONObject.optString("actionUrl");
                int optInt3 = jSONObject.optInt("action", 1);
                String optString4 = jSONObject.optString("iconUrl40");
                String optString5 = jSONObject.optString("attachmentIcon");
                C22495b m116291a = C22495b.Companion.m116291a(jSONObject.optJSONObject("attachmentDesc"));
                C22497d m116308a = C22497d.Companion.m116308a(jSONObject.optJSONObject("split_money"));
                AbstractC19074t.m100205c(optString3);
                AbstractC19074t.m100205c(optString);
                AbstractC19074t.m100205c(optString2);
                AbstractC19074t.m100205c(optString4);
                AbstractC19074t.m100205c(optString5);
                return new C22499f(str, optInt, optInt2, optInt3, optString3, optString, optString2, optString4, optString5, m116291a, m116308a);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
    }

    public C22499f(String str, int i11, int i12, int i13, String str2, String str3, String str4, String str5, String str6, C22495b c22495b, C22497d c22497d) {
        AbstractC19074t.m100208f(str, "jsonStr");
        AbstractC19074t.m100208f(str2, "actionUrl");
        AbstractC19074t.m100208f(str3, "packageName");
        AbstractC19074t.m100208f(str4, "iconUrl");
        AbstractC19074t.m100208f(str5, "iconUrl40");
        AbstractC19074t.m100208f(str6, "attachmentIcon");
        AbstractC19074t.m100208f(c22495b, "attachmentDesc");
        this.f110092a = str;
        this.f110093b = i11;
        this.f110094c = i12;
        this.f110095d = i13;
        this.f110096e = str2;
        this.f110097f = str3;
        this.f110098g = str4;
        this.f110099h = str5;
        this.f110100i = str6;
        this.f110101j = c22495b;
        this.f110102k = c22497d;
        this.f110103l = "";
        this.f110104m = "";
    }

    /* renamed from: a */
    public static final C22499f m116325a(String str) {
        return Companion.m116340a(str);
    }

    /* renamed from: b */
    public final int m116326b() {
        return this.f110095d;
    }

    /* renamed from: c */
    public final String m116327c() {
        return this.f110096e;
    }

    /* renamed from: d */
    public final String m116328d() {
        C22495b c22495b = this.f110101j;
        String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_send_money);
        AbstractC19074t.m100207e(string, "getString(...)");
        return c22495b.m116290a(string);
    }

    /* renamed from: e */
    public final String m116329e() {
        return this.f110100i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22499f)) {
            return false;
        }
        C22499f c22499f = (C22499f) obj;
        return AbstractC19074t.m100204b(this.f110092a, c22499f.f110092a) && this.f110093b == c22499f.f110093b && this.f110094c == c22499f.f110094c && this.f110095d == c22499f.f110095d && AbstractC19074t.m100204b(this.f110096e, c22499f.f110096e) && AbstractC19074t.m100204b(this.f110097f, c22499f.f110097f) && AbstractC19074t.m100204b(this.f110098g, c22499f.f110098g) && AbstractC19074t.m100204b(this.f110099h, c22499f.f110099h) && AbstractC19074t.m100204b(this.f110100i, c22499f.f110100i) && AbstractC19074t.m100204b(this.f110101j, c22499f.f110101j) && AbstractC19074t.m100204b(this.f110102k, c22499f.f110102k);
    }

    /* renamed from: f */
    public final int m116330f() {
        return this.f110105n;
    }

    /* renamed from: g */
    public final String m116331g() {
        int i11;
        JSONObject jSONObject = new JSONObject();
        try {
            int i12 = 0;
            if (this.f110103l.length() > 0) {
                i11 = Integer.parseInt(this.f110103l);
            } else {
                i11 = 0;
            }
            jSONObject.put("partnerId", i11);
            if (this.f110104m.length() > 0) {
                i12 = Integer.parseInt(this.f110104m);
            }
            jSONObject.put("ownerId", i12);
            jSONObject.put("isInstalled", this.f110106o ? 1 : 0);
            jSONObject.put("fromSource", this.f110105n);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: h */
    public final String m116332h() {
        return this.f110104m;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.f110092a.hashCode() * 31) + this.f110093b) * 31) + this.f110094c) * 31) + this.f110095d) * 31) + this.f110096e.hashCode()) * 31) + this.f110097f.hashCode()) * 31) + this.f110098g.hashCode()) * 31) + this.f110099h.hashCode()) * 31) + this.f110100i.hashCode()) * 31) + this.f110101j.hashCode()) * 31;
        C22497d c22497d = this.f110102k;
        return hashCode + (c22497d == null ? 0 : c22497d.hashCode());
    }

    /* renamed from: i */
    public final String m116333i() {
        return this.f110097f;
    }

    /* renamed from: j */
    public final String m116334j() {
        return this.f110103l;
    }

    /* renamed from: k */
    public final C22497d m116335k() {
        return this.f110102k;
    }

    /* renamed from: l */
    public final boolean m116336l() {
        int i11 = this.f110093b;
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2 && AbstractC23933a.m125288c(this.f110097f)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m116337m() {
        return this.f110094c == 1;
    }

    /* renamed from: n */
    public final boolean m116338n() {
        return this.f110106o;
    }

    /* renamed from: o */
    public final void m116339o(String str, String str2, boolean z11, int i11) {
        AbstractC19074t.m100208f(str, "partnerId");
        AbstractC19074t.m100208f(str2, "ownerId");
        if (AbstractC25495a.m132079d(str)) {
            str = AbstractC25495a.m132088m(str);
        }
        this.f110103l = str;
        this.f110104m = str2;
        this.f110105n = i11;
        this.f110106o = z11;
    }

    public String toString() {
        return this.f110092a;
    }
}
