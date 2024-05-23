package ga0;

import ai.C0862b;
import am.AbstractC0924m0;
import android.os.Build;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.C23024b7;
import me0.C23272y6;
import me0.C23282z6;
import org.json.JSONObject;
import p173fz.C19172a;
import p348mi.AbstractC23309i;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24866w;
import pm0.C24860q;

/* renamed from: ga0.f1 */
/* loaded from: classes6.dex */
public final class C19322f1 {

    /* renamed from: A */
    private static String f95938A;

    /* renamed from: B */
    private static long f95939B;

    /* renamed from: C */
    public static boolean f95940C;

    /* renamed from: D */
    private static int f95941D;

    /* renamed from: E */
    private static int f95942E;

    /* renamed from: F */
    private static int f95943F;

    /* renamed from: G */
    private static int f95944G;

    /* renamed from: H */
    private static String f95945H;

    /* renamed from: I */
    private static boolean f95946I;

    /* renamed from: J */
    private static String f95947J;

    /* renamed from: K */
    private static int f95948K;

    /* renamed from: L */
    private static int f95949L;

    /* renamed from: a */
    public static final C19322f1 f95950a;

    /* renamed from: b */
    private static boolean f95951b;

    /* renamed from: c */
    private static final InterfaceC29232g f95952c;

    /* renamed from: d */
    public static boolean f95953d;

    /* renamed from: e */
    private static int f95954e;

    /* renamed from: f */
    public static boolean f95955f;

    /* renamed from: g */
    public static int f95956g;

    /* renamed from: h */
    private static boolean f95957h;

    /* renamed from: i */
    private static boolean f95958i;

    /* renamed from: j */
    private static boolean f95959j;

    /* renamed from: k */
    private static boolean f95960k;

    /* renamed from: l */
    private static boolean f95961l;

    /* renamed from: m */
    private static boolean f95962m;

    /* renamed from: n */
    private static boolean f95963n;

    /* renamed from: o */
    private static int f95964o;

    /* renamed from: p */
    private static boolean f95965p;

    /* renamed from: q */
    private static boolean f95966q;

    /* renamed from: r */
    private static C24860q f95967r;

    /* renamed from: s */
    private static boolean f95968s;

    /* renamed from: t */
    private static boolean f95969t;

    /* renamed from: u */
    private static boolean f95970u;

    /* renamed from: v */
    private static boolean f95971v;

    /* renamed from: w */
    private static boolean f95972w;

    /* renamed from: x */
    private static boolean f95973x;

    /* renamed from: y */
    private static int f95974y;

    /* renamed from: z */
    private static C0862b f95975z;

    /* renamed from: ga0.f1$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f95976q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11 = true;
            if (AbstractC23309i.m121417Se() != 1) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    static {
        C19322f1 c19322f1 = new C19322f1();
        f95950a = c19322f1;
        f95951b = true;
        f95952c = AbstractC29233h.m145990a(a.f95976q);
        f95955f = true;
        f95960k = true;
        f95962m = true;
        f95963n = true;
        f95965p = true;
        f95966q = true;
        boolean z11 = false;
        f95967r = AbstractC24866w.m129235a(new String[0], new String[0]);
        f95968s = true;
        f95969t = true;
        f95970u = true;
        f95971v = true;
        f95972w = true;
        f95973x = true;
        f95974y = 150;
        f95939B = c19322f1.m101126d();
        if (Build.VERSION.SDK_INT <= 30) {
            z11 = true;
        }
        f95940C = z11;
        f95941D = 2;
        f95942E = 2;
        f95945H = "";
        f95946I = true;
        f95947J = "";
        f95949L = 2;
    }

    private C19322f1() {
    }

    /* renamed from: F */
    public static final boolean m101117F() {
        return f95968s;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m101118J(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        String str;
        String str2;
        JSONObject jSONObject2;
        int i11;
        AbstractC19074t.m100208f(jSONObject, "featuresJson");
        JSONObject optJSONObject = jSONObject.optJSONObject("globalsearch");
        if (optJSONObject == null) {
            return;
        }
        if (optJSONObject.optInt("ui_version", 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC0924m0.m4119pn(z11);
        if (1 == optJSONObject.optInt("display_oasuggest", 0)) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC0924m0.m3789en(z12);
        if (1 == optJSONObject.optInt("display_friendrequest", 0)) {
            z13 = true;
        } else {
            z13 = false;
        }
        AbstractC0924m0.m3759dn(z13);
        if (1 == optJSONObject.optInt("match_extend_substring", 0)) {
            z14 = true;
        } else {
            z14 = false;
        }
        AbstractC0924m0.m3909in(z14);
        if (1 == optJSONObject.optInt("split_word_extend", 0)) {
            z15 = true;
        } else {
            z15 = false;
        }
        AbstractC0924m0.m3999ln(z15);
        if (optJSONObject.optInt("update_search_message", 1) != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AbstractC0924m0.m4149qn(z16);
        AbstractC0924m0.m3969kn(optJSONObject.optInt("set_accent_bonus", 0));
        if (1 == optJSONObject.optInt("topresult_contact_section", 0)) {
            z17 = true;
        } else {
            z17 = false;
        }
        AbstractC0924m0.m4089on(z17);
        if (optJSONObject.optInt("enable_utility_tab", 1) != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        AbstractC0924m0.m3849gn(z18);
        AbstractC0924m0.m3939jn(optJSONObject.optString("search_feature_list", ""));
        if (optJSONObject.optInt("search_setting_section", 1) != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        AbstractC0924m0.m3819fn(z19);
        AbstractC0924m0.m4029mn(optJSONObject.optInt("tab_all_version", 0));
        AbstractC0924m0.m4059nn(optJSONObject.optInt("tab_asset_version", 0));
        AbstractC0924m0.m3879hn(optJSONObject.optInt("interaction_score", 0));
        AbstractC0924m0.m3291Nm(optJSONObject.optInt("big_group_member_define", 150));
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("banned_account_displayname");
        Integer num = null;
        if (optJSONObject2 != null) {
            str = optJSONObject2.optString("en");
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (optJSONObject2 != null) {
            str2 = optJSONObject2.optString("vi");
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        AbstractC0924m0.m3699bn(str);
        AbstractC0924m0.m3729cn(str2);
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("newprestate");
        if (optJSONObject3 != null) {
            jSONObject2 = optJSONObject3.optJSONObject("quick_access");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            Integer valueOf = Integer.valueOf(jSONObject2.optInt("enable", 1));
            int intValue = valueOf.intValue();
            if (intValue != 0 && intValue != 1) {
                valueOf = null;
            }
            if (valueOf != null) {
                i11 = valueOf.intValue();
                int i12 = 2;
                if (jSONObject2 != null) {
                    Integer valueOf2 = Integer.valueOf(jSONObject2.optInt("add_QR", 2));
                    int intValue2 = valueOf2.intValue();
                    if (intValue2 == 0 || intValue2 == 1 || intValue2 == 2) {
                        num = valueOf2;
                    }
                    if (num != null) {
                        i12 = num.intValue();
                    }
                }
                AbstractC0924m0.m3639Zm(i11);
                AbstractC0924m0.m3610Ym(i12);
                f95955f = true;
            }
        }
        i11 = 1;
        int i122 = 2;
        if (jSONObject2 != null) {
        }
        AbstractC0924m0.m3639Zm(i11);
        AbstractC0924m0.m3610Ym(i122);
        f95955f = true;
    }

    /* renamed from: K */
    public static final void m101119K() {
        f95955f = true;
        AbstractC0924m0.m3669an(null);
        f95938A = null;
        f95975z = null;
        C19310b1.f95897a.m101073a();
    }

    /* renamed from: L */
    public static final InterfaceC29232g m101120L() {
        return f95952c;
    }

    /* renamed from: V */
    private final void m101121V() {
        String str;
        f95975z = C23024b7.f111993a.m118069r();
        C0862b m101148e = m101148e();
        if (m101148e != null) {
            str = m101148e.mo2478b();
        } else {
            str = null;
        }
        f95938A = str;
        AbstractC0924m0.m3669an(m101149f());
    }

    /* renamed from: X */
    public static final void m101122X() {
        f95939B = f95950a.m101126d();
    }

    /* renamed from: Y */
    public static final void m101123Y(boolean z11) {
        f95968s = z11;
    }

    /* renamed from: a */
    public static final void m101124a() {
        C23272y6.m120045a();
        C23282z6.m120365a(4096);
        C23282z6.m120365a(8192);
        C23024b7.m118045a();
    }

    /* renamed from: b */
    private final int m101125b() {
        Integer valueOf = Integer.valueOf(C19172a.m100600k("globalsearch@tabdiscovery@enable_full_zinstant", 0));
        int intValue = valueOf.intValue();
        if (intValue != 0 && intValue != 1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    /* renamed from: d */
    private final long m101126d() {
        return System.currentTimeMillis();
    }

    /* renamed from: A */
    public final int m101127A() {
        return f95944G;
    }

    /* renamed from: B */
    public final String m101128B() {
        return f95945H;
    }

    /* renamed from: C */
    public final int m101129C() {
        return f95943F;
    }

    /* renamed from: D */
    public final boolean m101130D() {
        return f95946I;
    }

    /* renamed from: E */
    public final String m101131E() {
        return f95947J;
    }

    /* renamed from: G */
    public final boolean m101132G() {
        return f95969t;
    }

    /* renamed from: H */
    public final boolean m101133H() {
        return f95970u;
    }

    /* renamed from: I */
    public final int m101134I() {
        return f95954e;
    }

    /* renamed from: M */
    public final boolean m101135M() {
        if (C19172a.m100600k("globalsearch@discovery@miniapp@enable_label_name", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final boolean m101136N() {
        return f95951b;
    }

    /* renamed from: O */
    public final boolean m101137O() {
        return f95951b && f95964o == 1;
    }

    /* renamed from: P */
    public final boolean m101138P() {
        return !f95951b;
    }

    /* renamed from: Q */
    public final boolean m101139Q() {
        if (f95951b && !m101137O()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final boolean m101140R() {
        if (f95951b && !m101137O()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public final boolean m101141S() {
        return f95951b;
    }

    /* renamed from: T */
    public final boolean m101142T() {
        return m101137O();
    }

    /* renamed from: U */
    public final boolean m101143U() {
        if (m101125b() == 1 && m101151h().length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final void m101144W() {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12;
        int i13;
        int i14;
        boolean z16;
        int i15;
        int i16;
        if (f95955f) {
            f95957h = AbstractC0924m0.m3541Wb();
            f95956g = AbstractC0924m0.m3861h5();
            f95957h = AbstractC0924m0.m3512Vb();
            f95958i = AbstractC0924m0.m3599Yb();
            f95959j = AbstractC0924m0.m3628Zb();
            f95964o = AbstractC0924m0.m3891i5();
            f95961l = AbstractC0924m0.m3658ac();
            f95960k = true;
            f95962m = AbstractC0924m0.m3570Xb();
            if (f95959j) {
                i11 = 4194304;
            } else {
                i11 = 0;
            }
            f95954e = i11;
            if (AbstractC0924m0.m3921j5() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            f95965p = z11;
            if (AbstractC0924m0.m3831g5() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f95966q = z12;
            String m3801f5 = AbstractC0924m0.m3801f5();
            String str = "";
            if (m3801f5 == null) {
                m3801f5 = "";
            }
            String[] m118488a = C23282z6.m120367c(m3801f5, 16400).m118488a();
            String m3771e5 = AbstractC0924m0.m3771e5();
            if (m3771e5 != null) {
                str = m3771e5;
            }
            f95967r = AbstractC24866w.m129235a(m118488a, C23282z6.m120367c(str, 16400).m118488a());
            if (AbstractC0924m0.m3711c5() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            f95971v = z13;
            f95970u = AbstractC0924m0.m3688bc();
            f95968s = AbstractC0924m0.m3396Rb();
            f95969t = AbstractC0924m0.m3425Sb();
            int i17 = 2;
            if (AbstractC0924m0.m3681b5() == 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            f95972w = z14;
            if (AbstractC0924m0.m3681b5() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            f95973x = z15;
            String m3741d5 = AbstractC0924m0.m3741d5();
            Integer num = null;
            if (m3741d5 == null || m3741d5.length() == 0) {
                m3741d5 = null;
            }
            f95938A = m3741d5;
            Integer valueOf = Integer.valueOf(AbstractC0924m0.m3534W4());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i12 = valueOf.intValue();
            } else {
                i12 = 0;
            }
            f95974y = i12;
            Integer valueOf2 = Integer.valueOf(C19172a.m100600k("globalsearch@tabdiscovery@prestate", 0));
            int intValue = valueOf2.intValue();
            if (intValue != 0 && intValue != 1) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                i13 = valueOf2.intValue();
            } else {
                i13 = 0;
            }
            f95944G = i13;
            Integer valueOf3 = Integer.valueOf(C19172a.m100600k("globalsearch@tabdiscovery@searchresult", 0));
            int intValue2 = valueOf3.intValue();
            if (intValue2 != 0 && intValue2 != 1) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                i14 = valueOf3.intValue();
            } else {
                i14 = 0;
            }
            f95943F = i14;
            if (i14 == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            f95946I = z16;
            f95947J = C19172a.m100608s("globalsearch@tabdiscovery@searchresult_ma_template", null, 2, null);
            f95945H = C19172a.m100608s("globalsearch@tabdiscovery@prestate_template", null, 2, null);
            Integer valueOf4 = Integer.valueOf(C19172a.m100600k("globalsearch@search_server_keyword_min_length", 2));
            if (valueOf4.intValue() < 1) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                i15 = valueOf4.intValue();
            } else {
                i15 = 2;
            }
            f95941D = i15;
            Integer valueOf5 = Integer.valueOf(C19172a.m100600k("globalsearch@tabdiscovery@search_server_keyword_min_length", 1));
            if (valueOf5.intValue() < 1) {
                valueOf5 = null;
            }
            if (valueOf5 != null) {
                i16 = valueOf5.intValue();
            } else {
                i16 = 1;
            }
            f95942E = i16;
            f95948K = C19172a.m100600k("globalsearch@discovery@miniapp@limit", 0);
            Integer valueOf6 = Integer.valueOf(C19172a.m100600k("features@globalsearch@newprestate@quick_access@add_zVideo", 2));
            int intValue3 = valueOf6.intValue();
            if (intValue3 == 0 || intValue3 == 1 || intValue3 == 2) {
                num = valueOf6;
            }
            if (num != null) {
                i17 = num.intValue();
            }
            f95949L = i17;
            f95955f = false;
        }
    }

    /* renamed from: Z */
    public final void m101145Z(boolean z11) {
        f95969t = z11;
    }

    /* renamed from: a0 */
    public final void m101146a0(boolean z11) {
        f95970u = z11;
    }

    /* renamed from: c */
    public final long m101147c() {
        return f95939B;
    }

    /* renamed from: e */
    public final C0862b m101148e() {
        if (f95975z == null && f95973x) {
            m101121V();
        }
        return f95975z;
    }

    /* renamed from: f */
    public final String m101149f() {
        if (f95938A == null && f95973x) {
            m101121V();
        }
        return f95938A;
    }

    /* renamed from: g */
    public final int m101150g() {
        Integer valueOf = Integer.valueOf(C19172a.m100600k("globalsearch@tabdiscovery@enable_logic_search_zinstant", 0));
        int intValue = valueOf.intValue();
        if (intValue != 0 && intValue != 1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    /* renamed from: h */
    public final String m101151h() {
        return C19172a.m100608s("globalsearch@tabdiscovery@full_zinstant_template", null, 2, null);
    }

    /* renamed from: i */
    public final C24860q m101152i() {
        return f95967r;
    }

    /* renamed from: j */
    public final int m101153j() {
        return f95974y;
    }

    /* renamed from: k */
    public final boolean m101154k() {
        return f95960k;
    }

    /* renamed from: l */
    public final boolean m101155l() {
        return true;
    }

    /* renamed from: m */
    public final boolean m101156m() {
        return f95966q;
    }

    /* renamed from: n */
    public final boolean m101157n() {
        return f95958i;
    }

    /* renamed from: o */
    public final boolean m101158o() {
        return f95965p;
    }

    /* renamed from: p */
    public final boolean m101159p() {
        return f95960k && f95963n;
    }

    /* renamed from: q */
    public final boolean m101160q() {
        return f95960k && f95962m;
    }

    /* renamed from: r */
    public final boolean m101161r() {
        return f95961l;
    }

    /* renamed from: s */
    public final boolean m101162s() {
        return f95972w;
    }

    /* renamed from: t */
    public final boolean m101163t() {
        return f95971v && f95970u;
    }

    /* renamed from: u */
    public final boolean m101164u() {
        return f95949L == 2;
    }

    /* renamed from: v */
    public final boolean m101165v() {
        int i11 = f95949L;
        return i11 == 1 || i11 == 2;
    }

    /* renamed from: w */
    public final int m101166w() {
        return f95941D;
    }

    /* renamed from: x */
    public final int m101167x() {
        return f95942E;
    }

    /* renamed from: y */
    public final boolean m101168y() {
        return f95971v;
    }

    /* renamed from: z */
    public final int m101169z() {
        return f95948K;
    }
}
