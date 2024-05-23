package p471r3;

import android.util.Size;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.Serializable;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import on0.C24329j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r3.b */
/* loaded from: classes2.dex */
public final class C25630b implements Serializable {

    /* renamed from: O */
    public static final a f122553O = new a(null);

    /* renamed from: P */
    private static final int f122554P = 0;

    /* renamed from: Q */
    private static final int f122555Q = 0;

    /* renamed from: A */
    private int f122556A;

    /* renamed from: B */
    private boolean f122557B;

    /* renamed from: C */
    private int f122558C;

    /* renamed from: D */
    private int f122559D;

    /* renamed from: E */
    private int f122560E;

    /* renamed from: F */
    private int f122561F;

    /* renamed from: G */
    private int f122562G;

    /* renamed from: H */
    private String f122563H;

    /* renamed from: I */
    private int f122564I;

    /* renamed from: J */
    private int f122565J;

    /* renamed from: K */
    private int f122566K;

    /* renamed from: L */
    private int f122567L;

    /* renamed from: M */
    private boolean f122568M;

    /* renamed from: N */
    private boolean f122569N;

    /* renamed from: p */
    private int f122570p;

    /* renamed from: q */
    private int f122571q;

    /* renamed from: r */
    private int f122572r;

    /* renamed from: s */
    private int f122573s;

    /* renamed from: t */
    private String f122574t;

    /* renamed from: u */
    private int f122575u;

    /* renamed from: v */
    private String f122576v;

    /* renamed from: w */
    private String f122577w;

    /* renamed from: x */
    private String f122578x;

    /* renamed from: y */
    private String f122579y;

    /* renamed from: z */
    private int f122580z;

    /* renamed from: r3.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m132449a(C25630b c25630b) {
            if (c25630b != null && c25630b.m132440r() == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m132450b(C25630b c25630b) {
            if (c25630b != null && c25630b.m132440r() == 3) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean m132451c(C25630b c25630b) {
            if (c25630b != null && c25630b.m132442t() == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m132452d(C25630b c25630b) {
            if (c25630b != null && c25630b.m132440r() == 2) {
                return true;
            }
            return false;
        }
    }

    public C25630b(int i11, int i12) {
        this.f122570p = -1;
        this.f122571q = -1;
        this.f122572r = -1;
        this.f122573s = -1;
        this.f122574t = "";
        this.f122576v = "";
        this.f122577w = "";
        this.f122578x = "";
        this.f122560E = -1;
        this.f122563H = "";
        this.f122566K = i11;
        this.f122567L = i12;
    }

    /* renamed from: I */
    public static final boolean m132391I(C25630b c25630b) {
        return f122553O.m132451c(c25630b);
    }

    /* renamed from: M */
    private final void m132392M(String str) {
        JSONObject jSONObject;
        try {
            this.f122574t = str;
            if (str.length() == 0 || AbstractC19074t.m100204b(str, "null")) {
                return;
            }
            String optString = new JSONObject(str).optString("params");
            AbstractC19074t.m100205c(optString);
            if (optString.length() > 0) {
                jSONObject = new JSONObject(optString);
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.f122562G = jSONObject.optInt("subtype");
                String optString2 = jSONObject.optString("thumbUrl");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f122563H = optString2;
                m132422c0(jSONObject.optInt("width"), jSONObject.optInt("height"));
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A */
    public final boolean m132393A() {
        String m132439q = m132439q();
        if (m132439q.length() > 0 && AbstractC23041d2.m118194A(m132439q)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m132394B() {
        String str = this.f122577w;
        if (str != null && str.length() > 0 && AbstractC23041d2.m118194A(this.f122577w)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m132395C() {
        return this.f122557B;
    }

    /* renamed from: D */
    public final boolean m132396D(C25630b c25630b) {
        if (c25630b == null || c25630b.f122571q != this.f122571q || c25630b.f122570p != this.f122570p) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m132397E() {
        return this.f122569N;
    }

    /* renamed from: F */
    public final boolean m132398F() {
        return this.f122580z > 0;
    }

    /* renamed from: G */
    public final boolean m132399G() {
        int i11 = this.f122573s;
        return i11 == 4 || i11 == 5 || i11 == 8 || i11 == 6;
    }

    /* renamed from: H */
    public final boolean m132400H() {
        return (this.f122570p == -1 || this.f122571q == -1) ? false : true;
    }

    /* renamed from: J */
    public final void m132401J(int i11) {
        this.f122556A = i11;
    }

    /* renamed from: K */
    public final void m132402K(int i11) {
        this.f122580z = i11;
    }

    /* renamed from: L */
    public final void m132403L(boolean z11) {
        this.f122568M = z11;
    }

    /* renamed from: N */
    public final void m132404N(int i11) {
        this.f122571q = i11;
        if (this.f122568M && i11 == 0) {
            AbstractC20110a.f98889a.mo104552e(new Exception("Set gifCate DEFAULT"));
        }
    }

    /* renamed from: O */
    public final void m132405O(int i11) {
        this.f122570p = i11;
    }

    /* renamed from: P */
    public final void m132406P(int i11) {
        this.f122575u = i11;
    }

    /* renamed from: Q */
    public final void m132407Q(String str) {
        String m132439q;
        try {
            int i11 = this.f122567L;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    this.f122577w = str;
                    return;
                }
                return;
            }
            if (m132448z()) {
                m132439q = str;
            } else {
                m132439q = m132439q();
            }
            this.f122577w = m132439q;
        } catch (Exception e11) {
            this.f122577w = str;
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R */
    public final void m132408R(int i11) {
        this.f122572r = i11;
        if (this.f122568M && i11 == 0) {
            AbstractC20110a.f98889a.mo104552e(new Exception("Set gifOriginalCate DEFAULT"));
        }
    }

    /* renamed from: S */
    public final void m132409S(String str) {
        this.f122576v = str;
    }

    /* renamed from: T */
    public final void m132410T(int i11) {
        this.f122573s = i11;
    }

    /* renamed from: U */
    public final void m132411U(String str) {
        AbstractC19074t.m100208f(str, "voiceUrl");
        this.f122578x = str;
    }

    /* renamed from: V */
    public final void m132412V(boolean z11) {
        this.f122557B = z11;
    }

    /* renamed from: W */
    public final void m132413W(boolean z11) {
        this.f122569N = z11;
    }

    /* renamed from: X */
    public final void m132414X(int i11) {
        m132408R(i11);
    }

    /* renamed from: Y */
    public final void m132415Y(int i11, int i12) {
        this.f122558C = i11;
        this.f122559D = i12;
    }

    /* renamed from: Z */
    public final void m132416Z(int i11) {
        this.f122567L = i11;
    }

    /* renamed from: a */
    public final String m132417a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("subtype", this.f122562G);
            jSONObject.put("thumbUrl", this.f122563H);
            jSONObject.put("width", this.f122564I);
            jSONObject.put("height", this.f122565J);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", jSONObject.toString());
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: a0 */
    public final void m132418a0(int i11) {
        this.f122566K = i11;
    }

    /* renamed from: b */
    public final void m132419b(String str, int i11) {
        AbstractC19074t.m100208f(str, "urlCommand");
        this.f122561F = i11;
        int i12 = this.f122570p;
        if (i12 > 0) {
            this.f122579y = str + "&eid=" + i12 + "&size=" + i11;
        }
    }

    /* renamed from: b0 */
    public final void m132420b0(int i11) {
        this.f122562G = i11;
    }

    /* renamed from: c */
    public final String m132421c() {
        return this.f122570p + "_" + m132446x();
    }

    /* renamed from: c0 */
    public final void m132422c0(int i11, int i12) {
        this.f122564I = i11;
        this.f122565J = i12;
    }

    /* renamed from: d */
    public final int m132423d() {
        return this.f122556A;
    }

    /* renamed from: d0 */
    public final void m132424d0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f122563H = str;
    }

    /* renamed from: e */
    public final int m132425e() {
        return this.f122580z;
    }

    /* renamed from: e0 */
    public final void m132426e0(int i11) {
        this.f122560E = i11;
    }

    /* renamed from: f */
    public final int m132427f() {
        return this.f122571q;
    }

    /* renamed from: f0 */
    public final void m132428f0(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f122579y = str;
    }

    /* renamed from: g */
    public final int m132429g() {
        return this.f122570p;
    }

    /* renamed from: h */
    public final int m132430h() {
        return this.f122575u;
    }

    /* renamed from: i */
    public final String m132431i() {
        String str = this.f122577w;
        return str != null ? str : "";
    }

    /* renamed from: j */
    public final int m132432j() {
        int i11 = this.f122572r;
        return i11 >= 0 ? i11 : this.f122571q;
    }

    /* renamed from: k */
    public final String m132433k() {
        String str = this.f122576v;
        return str != null ? str : "";
    }

    /* renamed from: l */
    public final int m132434l() {
        return this.f122573s;
    }

    /* renamed from: m */
    public final String m132435m() {
        int i11 = this.f122573s;
        String str = "";
        if (i11 != 4 && i11 != 5 && i11 != 6) {
            if (i11 != 8) {
                return "";
            }
            return this.f122578x;
        }
        String str2 = this.f122577w;
        if (str2 != null) {
            AbstractC19074t.m100205c(str2);
            str = new C24329j(".gif|.jpeg|.jpg|.png").m127019g(str2, ".amr");
        }
        this.f122578x = str;
        return str;
    }

    /* renamed from: n */
    public final String m132436n() {
        return m132439q() + "/metadata";
    }

    /* renamed from: o */
    public final int m132437o() {
        return this.f122558C;
    }

    /* renamed from: p */
    public final int m132438p() {
        return this.f122559D;
    }

    /* renamed from: q */
    public final String m132439q() {
        return C20131e.f99303a.m104942a0() + m132432j() + "/" + this.f122570p;
    }

    /* renamed from: r */
    public final int m132440r() {
        return this.f122567L;
    }

    /* renamed from: s */
    public final int m132441s() {
        return this.f122561F;
    }

    /* renamed from: t */
    public final int m132442t() {
        return this.f122562G;
    }

    /* renamed from: u */
    public final Size m132443u() {
        return new Size(this.f122564I, this.f122565J);
    }

    /* renamed from: v */
    public final String m132444v() {
        return this.f122563H;
    }

    /* renamed from: w */
    public final int m132445w() {
        return this.f122560E;
    }

    /* renamed from: x */
    public final String m132446x() {
        String str = this.f122579y;
        if (str != null) {
            AbstractC19074t.m100205c(str);
            return str;
        }
        return "";
    }

    /* renamed from: y */
    public final boolean m132447y() {
        return this.f122571q == -10;
    }

    /* renamed from: z */
    public final boolean m132448z() {
        if (m132432j() == 0) {
            return true;
        }
        return false;
    }

    public C25630b() {
        this.f122570p = -1;
        this.f122571q = -1;
        this.f122572r = -1;
        this.f122573s = -1;
        this.f122574t = "";
        this.f122576v = "";
        this.f122577w = "";
        this.f122578x = "";
        this.f122560E = -1;
        this.f122563H = "";
        this.f122566K = f122554P;
        this.f122567L = f122555Q;
    }

    public C25630b(int i11, int i12, int i13, int i14, int i15, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str3, "voiceUrl");
        this.f122571q = -1;
        this.f122572r = -1;
        this.f122573s = -1;
        this.f122574t = "";
        this.f122576v = "";
        this.f122577w = "";
        this.f122578x = "";
        this.f122560E = -1;
        this.f122563H = "";
        this.f122566K = f122554P;
        this.f122567L = f122555Q;
        this.f122570p = i11;
        m132404N(i12);
        m132408R(i13);
        this.f122573s = i14;
        this.f122575u = i15;
        this.f122576v = str;
        this.f122577w = str2;
        this.f122578x = str3;
    }

    public C25630b(JSONObject jSONObject) {
        this.f122570p = -1;
        this.f122571q = -1;
        this.f122572r = -1;
        this.f122573s = -1;
        this.f122574t = "";
        this.f122576v = "";
        this.f122577w = "";
        this.f122578x = "";
        this.f122560E = -1;
        this.f122563H = "";
        this.f122566K = f122554P;
        this.f122567L = f122555Q;
        if (jSONObject == null) {
            return;
        }
        this.f122570p = jSONObject.optInt("id", -1);
        m132404N(jSONObject.optInt("catId"));
        m132408R(this.f122571q);
        this.f122573s = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        String optString = jSONObject.optString("extInfo");
        AbstractC19074t.m100207e(optString, "optString(...)");
        m132392M(optString);
    }

    public C25630b(int i11, int i12, int i13, String str) {
        AbstractC19074t.m100208f(str, "extInfo");
        this.f122571q = -1;
        this.f122572r = -1;
        this.f122573s = -1;
        this.f122574t = "";
        this.f122576v = "";
        this.f122577w = "";
        this.f122578x = "";
        this.f122560E = -1;
        this.f122563H = "";
        this.f122566K = f122554P;
        this.f122567L = f122555Q;
        this.f122570p = i11;
        m132404N(i12);
        this.f122573s = i13;
        m132392M(str);
    }

    public C25630b(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        this.f122570p = -1;
        this.f122571q = -1;
        this.f122572r = -1;
        this.f122573s = -1;
        this.f122574t = "";
        this.f122576v = "";
        this.f122577w = "";
        this.f122578x = "";
        this.f122560E = -1;
        this.f122563H = "";
        this.f122566K = f122554P;
        this.f122567L = f122555Q;
        this.f122570p = c25630b.f122570p;
        m132404N(c25630b.f122571q);
        m132408R(c25630b.m132432j());
        this.f122573s = c25630b.f122573s;
        this.f122575u = c25630b.f122575u;
        this.f122576v = c25630b.f122576v;
        this.f122577w = c25630b.f122577w;
        this.f122578x = c25630b.f122578x;
        this.f122579y = c25630b.f122579y;
        this.f122580z = c25630b.f122580z;
        this.f122556A = c25630b.f122556A;
        this.f122557B = c25630b.f122557B;
        this.f122566K = c25630b.f122566K;
        this.f122567L = c25630b.f122567L;
        this.f122560E = c25630b.f122560E;
        this.f122562G = c25630b.f122562G;
        this.f122564I = c25630b.f122564I;
        this.f122565J = c25630b.f122565J;
        this.f122563H = c25630b.f122563H;
    }
}
