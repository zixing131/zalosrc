package bh;

import ag0.AbstractC0826k;
import ag0.C0804b;
import ag0.C0824j;
import ag0.C0843s0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Context;
import android.text.TextUtils;
import bi.C2804c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C18005u0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fj.C18961d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19669z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23174p3;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o70.C24099q0;
import on0.AbstractC24337r;
import on0.AbstractC24341v;
import on0.C24329j;
import on0.InterfaceC24327h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.C3535c;
import p056cj.C3543k;
import p132ej.C18450l;
import p161fg.C18922m;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p459qs.C25489b;
import p645xh.C29628e;
import p656xs.AbstractC30200a;
import p656xs.C30202c;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32005l7;
import p716zh.C32076q5;
import p716zh.C32118t5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import tg.C26664o;
import tj.C26710b;
import vg.C28023b6;
import vg.C28203u6;
import xd0.C29595k;

/* renamed from: bh.a */
/* loaded from: classes3.dex */
public final class C2799a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f11164A;

    /* renamed from: E */
    private String f11168E;

    /* renamed from: K */
    private C31973j5 f11174K;

    /* renamed from: L */
    private C32076q5 f11175L;

    /* renamed from: M */
    private int f11176M;

    /* renamed from: N */
    private boolean f11177N;

    /* renamed from: R */
    private boolean f11181R;

    /* renamed from: T */
    private final InterfaceC24854k f11183T;

    /* renamed from: a */
    private String f11184a;

    /* renamed from: b */
    private String f11185b;

    /* renamed from: c */
    private String f11186c;

    /* renamed from: d */
    private String f11187d;

    /* renamed from: e */
    private String f11188e;

    /* renamed from: f */
    private long f11189f;

    /* renamed from: g */
    private String f11190g;

    /* renamed from: h */
    private String f11191h;

    /* renamed from: i */
    private String f11192i;

    /* renamed from: j */
    private int f11193j;

    /* renamed from: l */
    private int f11195l;

    /* renamed from: m */
    private JSONObject f11196m;

    /* renamed from: n */
    private JSONObject f11197n;

    /* renamed from: o */
    private boolean f11198o;

    /* renamed from: p */
    private boolean f11199p;

    /* renamed from: q */
    private boolean f11200q;

    /* renamed from: r */
    private boolean f11201r;

    /* renamed from: s */
    private boolean f11202s;

    /* renamed from: t */
    private boolean f11203t;

    /* renamed from: u */
    private boolean f11204u;

    /* renamed from: v */
    private boolean f11205v;

    /* renamed from: w */
    private int f11206w;

    /* renamed from: y */
    private long f11208y;

    /* renamed from: k */
    private int f11194k = 1;

    /* renamed from: x */
    private String f11207x = "";

    /* renamed from: z */
    private String f11209z = "";

    /* renamed from: B */
    private String f11165B = "";

    /* renamed from: C */
    private final C18005u0.a f11166C = new C18005u0.a();

    /* renamed from: D */
    private final ArrayList f11167D = new ArrayList();

    /* renamed from: F */
    private ArrayList f11169F = new ArrayList();

    /* renamed from: G */
    private final ArrayList f11170G = new ArrayList();

    /* renamed from: H */
    private final ArrayList f11171H = new ArrayList();

    /* renamed from: I */
    private ArrayList f11172I = new ArrayList();

    /* renamed from: J */
    private String f11173J = "";

    /* renamed from: O */
    private final StringBuilder f11178O = new StringBuilder();

    /* renamed from: P */
    private String f11179P = "";

    /* renamed from: Q */
    private long f11180Q = -1;

    /* renamed from: S */
    private int f11182S = -1;

    /* renamed from: bh.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m13513a(String str, ArrayList arrayList) {
            if (str != null && arrayList != null && !arrayList.isEmpty()) {
                try {
                    for (InterfaceC24327h interfaceC24327h : C24329j.m127014e(new C24329j("%(\\d+)\\$s"), str, 0, 2, null)) {
                        int parseInt = Integer.parseInt((String) interfaceC24327h.mo127002a().get(1)) - 1;
                        if (parseInt >= 0 && parseInt < arrayList.size()) {
                            if (str != null) {
                                String str2 = (String) interfaceC24327h.mo127002a().get(0);
                                String str3 = ((C32118t5) arrayList.get(parseInt)).f148056b;
                                AbstractC19074t.m100207e(str3, "dpn");
                                str = AbstractC24341v.m127114D(str, str2, str3, false, 4, null);
                            } else {
                                str = null;
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                return str;
            }
            return "";
        }

        /* renamed from: b */
        public final String m13514b(String str, int i11, int i12, int i13) {
            String m127114D;
            AbstractC19074t.m100208f(str, "currentStringFormat");
            if (i11 >= i12) {
                return str;
            }
            try {
                InterfaceC24327h m127013c = C24329j.m127013c(new C24329j("%" + i11 + "\\$s"), str, 0, 2, null);
                if (m127013c != null) {
                    StringBuilder sb2 = new StringBuilder();
                    while (i11 < i12) {
                        sb2.append("%");
                        sb2.append(i11);
                        sb2.append("$s, ");
                        i11++;
                    }
                    sb2.append("%");
                    sb2.append(i12);
                    sb2.append("$s");
                    if (i13 > 1) {
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tag_others_text, Integer.valueOf(i13)));
                    }
                    String value = m127013c.getValue();
                    String sb3 = sb2.toString();
                    AbstractC19074t.m100207e(sb3, "toString(...)");
                    m127114D = AbstractC24341v.m127114D(str, value, sb3, false, 4, null);
                    return m127114D;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            return null;
        }
    }

    /* renamed from: bh.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f11210q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f11210q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C31973j5.b bVar) {
            AbstractC19074t.m100208f(bVar, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(bVar.m153802d(), this.f11210q));
        }
    }

    /* renamed from: bh.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42479nd(C2799a.this.m13511d(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bh.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f11212q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29595k mo12V4() {
            return AbstractC23306f.m120685l0();
        }
    }

    public C2799a() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(d.f11212q);
        this.f11183T = m129210a;
    }

    /* renamed from: A */
    private final void m13486A() {
        C31973j5 c31973j5 = this.f11174K;
        if (c31973j5 != null && c31973j5.m153781r().length() > 0) {
            c31973j5.m153735P0(this.f11194k);
            c31973j5.m153727L0(this.f11195l);
            c31973j5.m153731N0(this.f11193j);
            c31973j5.m153725K0(this.f11164A);
            c31973j5.m153710C0(this.f11187d);
            if (this.f11204u) {
                c31973j5.m153723J0(false);
            }
            C32076q5 c32076q5 = this.f11175L;
            if (c32076q5 == null) {
                c32076q5 = new C32076q5(c31973j5.m153781r());
            }
            c32076q5.m154713b(c31973j5.m153758f());
            c32076q5.m154714c(c31973j5.m153758f());
            C0943w.f3447a.m4477n(c31973j5, c32076q5);
        }
    }

    /* renamed from: a */
    private final void m13487a(C31973j5 c31973j5) {
        String m118743r0;
        ArrayList m131500h;
        String m118743r02;
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e) && !TextUtils.isEmpty(this.f11165B)) {
            if (c31973j5.m153768k0()) {
                if (c31973j5.m153747Y()) {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_msg_info_view_members_for_owner_admin_by_other);
                } else {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_view_members_for_admins_by_other);
                }
            } else {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_view_members_for_all_by_other);
            }
            this.f11168E = m118743r02;
            this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
            this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
            String sb2 = this.f11178O.toString();
            AbstractC19074t.m100207e(sb2, "toString(...)");
            this.f11179P = sb2;
        } else {
            StringBuilder sb3 = this.f11178O;
            if (c31973j5.m153768k0()) {
                if (c31973j5.m153747Y()) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_msg_info_view_members_for_owner_admin_by_me);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_view_members_for_admins_by_me_v2);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_view_members_for_all_by_me);
            }
            sb3.append(m118743r0);
        }
        C18005u0.a aVar = this.f11166C;
        aVar.m95730l(this.f11168E);
        aVar.m95726h(this.f11167D);
        String str = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, this.f11188e, null, 2, null);
        if (m141798e != null) {
            str = m141798e.f42446v;
        }
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        if (str.length() > 0) {
            m131500h = AbstractC25368s.m131500h(str);
            aVar.m95724f(m131500h);
        }
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
            aVar.m95719a("action.open.inapp", AbstractC23306f.m120583H().m110204g().m116320l(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_lock_view_members_learn_more));
        }
        aVar.m95727i(16);
    }

    /* renamed from: b */
    private final void m13488b() {
        this.f11174K = null;
        this.f11175L = null;
    }

    /* renamed from: c */
    public static final String m13489c(String str, ArrayList arrayList) {
        return Companion.m13513a(str, arrayList);
    }

    /* renamed from: e */
    private final C29595k m13490e() {
        return (C29595k) this.f11183T.getValue();
    }

    /* renamed from: f */
    private final void m13491f() {
        try {
            if (this.f11174K != null && (!this.f11172I.isEmpty())) {
                Iterator it = this.f11172I.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                        C8967m m47867E = C8967m.m47867E();
                        C31973j5 c31973j5 = this.f11174K;
                        AbstractC19074t.m100205c(c31973j5);
                        m47867E.m47920j0("group_" + c31973j5.m153781r());
                    } else {
                        C8967m m47867E2 = C8967m.m47867E();
                        C31973j5 c31973j52 = this.f11174K;
                        AbstractC19074t.m100205c(c31973j52);
                        m47867E2.m47894A("group_" + c31973j52.m153781r(), str);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    private final void m13492g(String str, String str2, String str3) {
        boolean z11;
        if (str2 != null && str2.length() != 0) {
            if (!AbstractC19074t.m100204b(this.f11188e, CoreUtility.f89233i) && this.f11182S != 6) {
                z11 = true;
            } else {
                z11 = false;
            }
            C25489b.f122105a.m132051q(str2, str3, z11);
            AbstractC23306f.m120584H0().m2629l(str2);
            AbstractC23184q2.m119446d(str, str2);
            C23744a.Companion.m124119a().m124116d(52, str2);
            if (!AbstractC23174p3.m119377b() && !C21927m.m114302u().m114345m(str2) && this.f11182S != 6) {
                m13509y();
            }
            try {
                C28023b6.m141250h0().m141293J(str2);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (C26664o.m136836a().m136837b(str2)) {
                C23744a.Companion.m124119a().m124116d(12002, new Object[0]);
            }
        }
    }

    /* renamed from: h */
    private final void m13493h(List list) {
        List m153760g;
        int size = list.size();
        C31986k3 c31986k3 = C31986k3.f147083a;
        C31973j5 c31973j5 = this.f11174K;
        AbstractC19074t.m100205c(c31973j5);
        boolean m154108R1 = c31986k3.m154108R1(c31973j5.m153730N());
        for (int i11 = 0; i11 < size; i11++) {
            String str = (String) list.get(i11);
            C32076q5 c32076q5 = this.f11175L;
            AbstractC19074t.m100205c(c32076q5);
            c32076q5.m154728q(str);
            C31973j5 c31973j52 = this.f11174K;
            if (c31973j52 != null && (m153760g = c31973j52.m153760g()) != null) {
                AbstractC25378x.m131542D(m153760g, new b(str));
            }
            if (m154108R1) {
                C31986k3 c31986k32 = C31986k3.f147083a;
                C31973j5 c31973j53 = this.f11174K;
                AbstractC19074t.m100205c(c31973j53);
                c31986k32.m154090G2(c31973j53.m153730N(), Integer.parseInt(str));
            }
        }
    }

    /* renamed from: i */
    private final void m13494i() {
        Context m35500c;
        int i11;
        Context m35500c2;
        int i12;
        C31973j5 c31973j5 = this.f11174K;
        if (c31973j5 != null) {
            boolean m153755d0 = c31973j5.m153755d0();
            boolean m153766j0 = c31973j5.m153766j0();
            boolean m153751b0 = c31973j5.m153751b0();
            boolean m153768k0 = c31973j5.m153768k0();
            c31973j5.m153794y0(this.f11196m);
            if (m153755d0 != c31973j5.m153755d0()) {
                if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e) && !TextUtils.isEmpty(this.f11165B)) {
                    if (c31973j5.m153755d0()) {
                        m35500c2 = MainApplication.Companion.m35500c();
                        if (c31973j5.m153747Y()) {
                            i12 = AbstractC8020f0.str_notice_community_enable_approve_join;
                        } else {
                            i12 = AbstractC8020f0.str_notice_group_enable_approve_join_v2;
                        }
                    } else {
                        m35500c2 = MainApplication.Companion.m35500c();
                        if (c31973j5.m153747Y()) {
                            i12 = AbstractC8020f0.str_notice_community_disable_approve_join;
                        } else {
                            i12 = AbstractC8020f0.str_notice_group_disable_approve_join_v2;
                        }
                    }
                    this.f11168E = m35500c2.getString(i12);
                    this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                    this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
                    String sb2 = this.f11178O.toString();
                    AbstractC19074t.m100207e(sb2, "toString(...)");
                    this.f11179P = sb2;
                } else {
                    StringBuilder sb3 = this.f11178O;
                    if (c31973j5.m153755d0()) {
                        m35500c = MainApplication.Companion.m35500c();
                        if (c31973j5.m153747Y()) {
                            i11 = AbstractC8020f0.str_notice_community_enable_approve_join_by_me;
                        } else {
                            i11 = AbstractC8020f0.str_notice_group_enable_approve_join_by_me;
                        }
                    } else {
                        m35500c = MainApplication.Companion.m35500c();
                        if (c31973j5.m153747Y()) {
                            i11 = AbstractC8020f0.str_notice_community_disable_approve_join_by_me;
                        } else {
                            i11 = AbstractC8020f0.str_notice_group_disable_approve_join_by_me;
                        }
                    }
                    sb3.append(m35500c.getString(i11));
                }
                this.f11166C.m95730l(this.f11168E).m95726h(this.f11167D).m95727i(2);
                this.f11203t = true;
            }
            if (m153766j0 != c31973j5.m153766j0()) {
                C23744a.Companion.m124119a().m124116d(113, this.f11186c);
            }
            if (m153751b0 != c31973j5.m153751b0() && c31973j5.m153751b0()) {
                C0876j m120584H0 = AbstractC23306f.m120584H0();
                String str = this.f11192i;
                AbstractC19074t.m100205c(str);
                C3535c m2634q = m120584H0.m2634q(str);
                if (m2634q != null) {
                    m2634q.m17953R0(true);
                }
            }
            if (C30202c.f140315a.m148952c(c31973j5) && m153768k0 != c31973j5.m153768k0()) {
                m13487a(c31973j5);
                this.f11203t = true;
                C23744a.Companion.m124119a().m124116d(6080, new Object[0]);
            }
        }
    }

    /* renamed from: j */
    private final void m13495j() {
        int i11;
        int i12;
        int size = this.f11172I.size() - 1;
        if (size >= 0) {
            while (true) {
                int i13 = size - 1;
                Object obj = this.f11172I.get(size);
                AbstractC19074t.m100207e(obj, "get(...)");
                C32076q5 c32076q5 = this.f11175L;
                AbstractC19074t.m100205c(c32076q5);
                c32076q5.m154712a((String) obj, this.f11187d);
                if (i13 < 0) {
                    break;
                } else {
                    size = i13;
                }
            }
        }
        if (this.f11198o) {
            if (this.f11167D.size() == 0) {
                this.f11168E = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_noti_set_admin_for_me_v2);
                this.f11203t = true;
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                this.f11166C.m95727i(4).m95730l(this.f11168E).m95726h(this.f11167D);
            } else {
                ArrayList arrayList = this.f11167D;
                String str = this.f11173J;
                Locale locale = Locale.getDefault();
                AbstractC19074t.m100207e(locale, "getDefault(...)");
                String lowerCase = str.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                arrayList.add(0, new C32118t5("0", lowerCase, false));
                int size2 = this.f11167D.size() + 1;
                C31973j5 c31973j5 = this.f11174K;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    i12 = AbstractC8020f0.str_msg_info_set_community_admin_for_other_by_other;
                } else {
                    i12 = AbstractC8020f0.str_noti_set_admin_for_me_v2_2;
                }
                a aVar = Companion;
                String string = MainApplication.Companion.m35500c().getString(i12);
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f11168E = aVar.m13514b(string, 2, size2, this.f11176M);
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                this.f11203t = true;
                this.f11166C.m95727i(4).m95730l(this.f11168E).m95726h(this.f11167D);
            }
        } else if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
            int size3 = this.f11167D.size() + 1;
            a aVar2 = Companion;
            C31973j5 c31973j52 = this.f11174K;
            if (c31973j52 != null && c31973j52.m153747Y()) {
                i11 = AbstractC8020f0.str_msg_info_set_community_admin_for_other_by_other;
            } else {
                i11 = AbstractC8020f0.str_msg_info_set_admin_for_normal_mem_v2;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            this.f11168E = aVar2.m13514b(m118743r0, 2, size3, this.f11176M);
            this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
            this.f11166C.m95727i(4).m95730l(this.f11168E).m95726h(this.f11167D);
            this.f11203t = true;
        }
        this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
        if (this.f11198o) {
            String sb2 = this.f11178O.toString();
            AbstractC19074t.m100207e(sb2, "toString(...)");
            this.f11179P = sb2;
        }
        this.f11177N = true;
    }

    /* renamed from: k */
    private final void m13496k() {
        boolean z11;
        int i11;
        int i12;
        m13491f();
        if (this.f11193j <= 0) {
            m13497l();
            return;
        }
        if (m13504s()) {
            C31973j5 c31973j5 = this.f11174K;
            if (c31973j5 != null && c31973j5.m153747Y()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                int size = this.f11167D.size();
                if (this.f11181R) {
                    if (z11) {
                        i12 = AbstractC8020f0.str_msg_info_community_force_leave_for_actor_2;
                    } else {
                        i12 = AbstractC8020f0.str_msg_info_group_force_leave_for_actor_2;
                    }
                } else if (z11) {
                    i12 = AbstractC8020f0.str_msg_info_community_force_leave_for_actor;
                } else {
                    i12 = AbstractC8020f0.str_msg_info_group_force_leave_for_actor;
                }
                a aVar = Companion;
                String string = MainApplication.Companion.m35500c().getString(i12);
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f11168E = aVar.m13514b(string, 1, size, this.f11176M);
            } else {
                int size2 = this.f11167D.size() + 1;
                if (this.f11181R) {
                    if (z11) {
                        i11 = AbstractC8020f0.str_msg_info_community_force_leave_for_not_actor_2;
                    } else {
                        i11 = AbstractC8020f0.str_msg_info_group_force_leave_for_not_actor_2;
                    }
                } else if (z11) {
                    i11 = AbstractC8020f0.str_msg_info_community_force_leave_for_not_actor;
                } else {
                    i11 = AbstractC8020f0.str_msg_info_group_force_leave_for_not_actor;
                }
                a aVar2 = Companion;
                String string2 = MainApplication.Companion.m35500c().getString(i11);
                AbstractC19074t.m100207e(string2, "getString(...)");
                this.f11168E = aVar2.m13514b(string2, 2, size2, this.f11176M);
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
            }
            this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
            this.f11166C.m95723e(this.f11171H).m95731m(this.f11172I.size()).m95730l(this.f11168E).m95726h(this.f11167D);
        }
        C31973j5 c31973j52 = this.f11174K;
        if (c31973j52 != null) {
            AbstractC19074t.m100205c(c31973j52);
            if (!TextUtils.isEmpty(c31973j52.m153781r())) {
                if (this.f11198o) {
                    m13492g(this.f11186c, this.f11192i, "2");
                    m13488b();
                } else {
                    m13493h(this.f11172I);
                }
                this.f11177N = true;
                return;
            }
        }
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11187d) && this.f11198o) {
            m13488b();
        }
    }

    /* renamed from: l */
    private final void m13497l() {
        C31973j5 c31973j5 = this.f11174K;
        if (c31973j5 != null) {
            AbstractC19074t.m100205c(c31973j5);
            if (c31973j5.m153793y().length() > 0) {
                StringBuilder sb2 = this.f11178O;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_notice_content_group_delete);
                AbstractC19074t.m100207e(string, "getString(...)");
                C31973j5 c31973j52 = this.f11174K;
                AbstractC19074t.m100205c(c31973j52);
                String format = String.format(string, Arrays.copyOf(new Object[]{c31973j52.m153793y()}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                sb2.append(format);
            }
            m13492g(this.f11186c, this.f11192i, "1");
            m13488b();
        }
    }

    /* renamed from: m */
    private final void m13498m() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C31973j5 c31973j5 = this.f11174K;
        if (c31973j5 != null) {
            int i18 = this.f11182S;
            int i19 = 2;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 != 3) {
                            if (i18 != 4) {
                                if (i18 == 7) {
                                    AbstractC19074t.m100205c(c31973j5);
                                    if (c31973j5.m153738R() != this.f11194k) {
                                        C31973j5 c31973j52 = this.f11174K;
                                        AbstractC19074t.m100205c(c31973j52);
                                        c31973j52.m153735P0(this.f11194k);
                                        if (AbstractC30200a.m148947f()) {
                                            C23744a.Companion.m124119a().m124116d(169, this.f11186c);
                                            C0824j.m2153b(new c());
                                        }
                                    }
                                }
                            } else {
                                if (this.f11197n != null) {
                                    AbstractC19074t.m100205c(c31973j5);
                                    JSONObject jSONObject = this.f11197n;
                                    AbstractC19074t.m100205c(jSONObject);
                                    c31973j5.m153791w0(jSONObject);
                                }
                                C23744a.Companion.m124119a().m124116d(112, this.f11186c);
                            }
                        } else {
                            String str = this.f11190g;
                            AbstractC19074t.m100205c(c31973j5);
                            if (!AbstractC19074t.m100204b(str, c31973j5.m153765j())) {
                                C31973j5 c31973j53 = this.f11174K;
                                AbstractC19074t.m100205c(c31973j53);
                                c31973j53.m153712D0(this.f11190g);
                                boolean isEmpty = TextUtils.isEmpty(this.f11190g);
                                C31973j5 c31973j54 = this.f11174K;
                                if (c31973j54 != null && c31973j54.m153747Y()) {
                                    if (isEmpty) {
                                        i16 = AbstractC8020f0.str_notice_community_remove_desc;
                                    } else {
                                        i16 = AbstractC8020f0.str_notice_community_update_desc;
                                    }
                                } else if (isEmpty) {
                                    i16 = AbstractC8020f0.str_notice_group_remove_desc;
                                } else {
                                    i16 = AbstractC8020f0.str_notice_group_update_desc;
                                }
                                this.f11168E = AbstractC23136l9.m118743r0(i16);
                                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                                C18005u0.a m95726h = this.f11166C.m95730l(this.f11168E).m95726h(this.f11167D);
                                if (isEmpty) {
                                    i19 = 14;
                                }
                                m95726h.m95727i(i19);
                                C31973j5 c31973j55 = this.f11174K;
                                AbstractC19074t.m100205c(c31973j55);
                                if (c31973j55.m153742T() && !isEmpty) {
                                    C18005u0.a aVar = this.f11166C;
                                    C31973j5 c31973j56 = this.f11174K;
                                    if (c31973j56 != null && c31973j56.m153747Y()) {
                                        i17 = AbstractC8020f0.str_manage_community;
                                    } else {
                                        i17 = AbstractC8020f0.str_manage_group;
                                    }
                                    aVar.m95719a("action.group.open.admintool", "", AbstractC23136l9.m118743r0(i17));
                                }
                                this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
                                String sb2 = this.f11178O.toString();
                                AbstractC19074t.m100207e(sb2, "toString(...)");
                                this.f11179P = sb2;
                            }
                        }
                    } else {
                        AbstractC19074t.m100205c(c31973j5);
                        if (c31973j5.m153740S() != this.f11206w) {
                            C31973j5 c31973j57 = this.f11174K;
                            AbstractC19074t.m100205c(c31973j57);
                            c31973j57.m153737Q0(this.f11206w);
                            this.f11168E = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_group_update_visibility);
                            this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                            ArrayList arrayList = this.f11167D;
                            C31973j5 c31973j58 = this.f11174K;
                            AbstractC19074t.m100205c(c31973j58);
                            arrayList.add(1, new C32118t5("0", c31973j58.m153777p(), false));
                            this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
                            String sb3 = this.f11178O.toString();
                            AbstractC19074t.m100207e(sb3, "toString(...)");
                            this.f11179P = sb3;
                            this.f11166C.m95727i(2).m95730l(this.f11168E).m95726h(this.f11167D);
                        }
                    }
                } else if (!TextUtils.isEmpty(this.f11191h)) {
                    String str2 = this.f11191h;
                    C31973j5 c31973j59 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j59);
                    if (!AbstractC19074t.m100204b(str2, c31973j59.m153756e())) {
                        C31973j5 c31973j510 = this.f11174K;
                        AbstractC19074t.m100205c(c31973j510);
                        c31973j510.m153708B0(this.f11191h, this.f11207x);
                        if (this.f11192i != null) {
                            C7959d m41850e = C7959d.Companion.m41850e();
                            String str3 = this.f11192i;
                            AbstractC19074t.m100205c(str3);
                            String str4 = this.f11191h;
                            AbstractC19074t.m100205c(str4);
                            m41850e.m41769Z2(str3, str4);
                        }
                        if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                            String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne);
                            AbstractC19074t.m100207e(string, "getString(...)");
                            this.f11173J = string;
                            this.f11167D.add(0, new C32118t5("0", string, false));
                        } else {
                            this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                        }
                        C31973j5 c31973j511 = this.f11174K;
                        if (c31973j511 != null && c31973j511.m153747Y()) {
                            i14 = AbstractC8020f0.str_notice_avatar_community_update_for_other_mems;
                        } else {
                            i14 = AbstractC8020f0.str_notice_avatar_group_update_for_other_mems_v2;
                        }
                        String m118743r0 = AbstractC23136l9.m118743r0(i14);
                        this.f11168E = m118743r0;
                        this.f11178O.append(Companion.m13513a(m118743r0, this.f11167D));
                        String sb4 = this.f11178O.toString();
                        AbstractC19074t.m100207e(sb4, "toString(...)");
                        this.f11179P = sb4;
                        this.f11170G.add(this.f11191h);
                        this.f11166C.m95724f(this.f11170G).m95730l(this.f11168E).m95726h(this.f11167D);
                        C31973j5 c31973j512 = this.f11174K;
                        AbstractC19074t.m100205c(c31973j512);
                        if (c31973j512.m153778p0() && !AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                            C18005u0.a aVar2 = this.f11166C;
                            C31973j5 c31973j513 = this.f11174K;
                            if (c31973j513 != null && c31973j513.m153747Y()) {
                                i15 = AbstractC8020f0.str_manage_community;
                            } else {
                                i15 = AbstractC8020f0.str_manage_group;
                            }
                            aVar2.m95719a("action.group.open.admintool", "", AbstractC23136l9.m118743r0(i15));
                        }
                        this.f11177N = true;
                    }
                }
            } else if (!TextUtils.isEmpty(this.f11185b)) {
                String str5 = this.f11185b;
                C31973j5 c31973j514 = this.f11174K;
                AbstractC19074t.m100205c(c31973j514);
                if (!AbstractC19074t.m100204b(str5, c31973j514.m153793y())) {
                    C31973j5 c31973j515 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j515);
                    String m153793y = c31973j515.m153793y();
                    C31973j5 c31973j516 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j516);
                    boolean m153772m0 = c31973j516.m153772m0();
                    C31973j5 c31973j517 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j517);
                    String str6 = this.f11185b;
                    AbstractC19074t.m100205c(str6);
                    c31973j517.m153721I0(str6);
                    if (this.f11192i != null && this.f11185b != null) {
                        C7959d m41850e2 = C7959d.Companion.m41850e();
                        String str7 = this.f11192i;
                        AbstractC19074t.m100205c(str7);
                        String str8 = this.f11185b;
                        AbstractC19074t.m100205c(str8);
                        m41850e2.m41787g3(str7, str8);
                    }
                    if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                        C31973j5 c31973j518 = this.f11174K;
                        if (c31973j518 != null && c31973j518.m153747Y()) {
                            i13 = AbstractC8020f0.str_msg_info_change_community_name_by_myself;
                        } else {
                            i13 = AbstractC8020f0.str_msg_info_change_group_name_by_myselft_v2;
                        }
                        this.f11168E = AbstractC23136l9.m118743r0(i13);
                    } else {
                        C31973j5 c31973j519 = this.f11174K;
                        if (c31973j519 != null && c31973j519.m153747Y()) {
                            i11 = AbstractC8020f0.str_notice_content_community_update_for_other_mems;
                        } else {
                            i11 = AbstractC8020f0.str_notice_content_group_update_for_other_mems_v2;
                        }
                        this.f11168E = AbstractC23136l9.m118743r0(i11);
                        this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                    }
                    this.f11167D.add(new C32118t5("0", m153793y, false));
                    this.f11167D.add(new C32118t5("0", this.f11185b, false));
                    this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
                    String sb5 = this.f11178O.toString();
                    AbstractC19074t.m100207e(sb5, "toString(...)");
                    this.f11179P = sb5;
                    this.f11166C.m95730l(this.f11168E).m95726h(this.f11167D).m95727i(2);
                    C31973j5 c31973j520 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j520);
                    if (c31973j520.m153778p0() && !AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                        C18005u0.a aVar3 = this.f11166C;
                        C31973j5 c31973j521 = this.f11174K;
                        if (c31973j521 != null && c31973j521.m153747Y()) {
                            i12 = AbstractC8020f0.str_manage_community;
                        } else {
                            i12 = AbstractC8020f0.str_manage_group;
                        }
                        aVar3.m95719a("action.group.open.admintool", "", AbstractC23136l9.m118743r0(i12));
                    }
                    if (m153772m0) {
                        C0943w.f3447a.m4467a(this.f11174K, m153793y);
                    }
                }
            }
        }
        this.f11203t = true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x02fb -> B:66:0x02fe). Please report as a decompilation issue!!! */
    /* renamed from: n */
    private final void m13499n() {
        int i11;
        String m13514b;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        if (this.f11172I.size() == 0) {
            return;
        }
        if (this.f11172I.size() == 1 && AbstractC19074t.m100204b(this.f11172I.get(0), this.f11188e)) {
            if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e) && !TextUtils.isEmpty(this.f11165B)) {
                int size = this.f11167D.size();
                a aVar = Companion;
                Context m35500c = MainApplication.Companion.m35500c();
                C31973j5 c31973j5 = this.f11174K;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    i15 = AbstractC8020f0.str_join_community_link_myself;
                } else {
                    i15 = AbstractC8020f0.str_join_group_link_myself_v2;
                }
                String string = m35500c.getString(i15);
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f11168E = aVar.m13514b(string, 1, size, this.f11176M);
            } else {
                Context m35500c2 = MainApplication.Companion.m35500c();
                C31973j5 c31973j52 = this.f11174K;
                if (c31973j52 != null && c31973j52.m153747Y()) {
                    i14 = AbstractC8020f0.str_join_community_link_myself;
                } else {
                    i14 = AbstractC8020f0.str_join_group_link_myself_v2;
                }
                this.f11168E = m35500c2.getString(i14);
                this.f11167D.add(new C32118t5("0", this.f11173J, false));
            }
            C2804c c2804c = C2804c.f11236a;
            String str = this.f11186c;
            AbstractC19074t.m100205c(str);
            c2804c.m13560L(str);
        } else if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e) && !TextUtils.isEmpty(this.f11165B)) {
            C31973j5 c31973j53 = this.f11174K;
            if (c31973j53 != null && c31973j53.m153747Y()) {
                if (this.f11181R) {
                    i13 = AbstractC8020f0.str_msg_join_community_not_for_actor_2;
                } else {
                    i13 = AbstractC8020f0.str_msg_join_community_not_for_actor;
                }
            } else if (this.f11181R) {
                i13 = AbstractC8020f0.str_msg_join_group_not_for_actor_2;
            } else {
                i13 = AbstractC8020f0.str_msg_join_group_not_for_actor;
            }
            if (TextUtils.isEmpty(this.f11173J)) {
                int size2 = this.f11167D.size() + 1;
                a aVar2 = Companion;
                String string2 = MainApplication.Companion.m35500c().getString(i13);
                AbstractC19074t.m100207e(string2, "getString(...)");
                this.f11168E = aVar2.m13514b(string2, 2, size2, this.f11176M);
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
            } else {
                this.f11167D.add(0, new C32118t5("0", this.f11173J, false));
                int size3 = this.f11167D.size() + 1;
                a aVar3 = Companion;
                String string3 = MainApplication.Companion.m35500c().getString(i13);
                AbstractC19074t.m100207e(string3, "getString(...)");
                this.f11168E = aVar3.m13514b(string3, 2, size3, this.f11176M);
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
            }
        } else {
            if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                int size4 = this.f11167D.size();
                C31973j5 c31973j54 = this.f11174K;
                if (c31973j54 != null && c31973j54.m153747Y()) {
                    if (this.f11181R) {
                        i12 = AbstractC8020f0.str_notice_community_join_by_me_2;
                    } else {
                        i12 = AbstractC8020f0.str_notice_community_join_by_me;
                    }
                } else if (this.f11181R) {
                    i12 = AbstractC8020f0.str_notice_join_by_me_2;
                } else {
                    i12 = AbstractC8020f0.str_notice_join_by_me;
                }
                a aVar4 = Companion;
                String string4 = MainApplication.Companion.m35500c().getString(i12);
                AbstractC19074t.m100207e(string4, "getString(...)");
                m13514b = aVar4.m13514b(string4, 1, size4, this.f11176M);
            } else {
                this.f11167D.add(0, new C32118t5("0", this.f11173J, false));
                int size5 = this.f11167D.size();
                a aVar5 = Companion;
                Context m35500c3 = MainApplication.Companion.m35500c();
                C31973j5 c31973j55 = this.f11174K;
                if (c31973j55 != null && c31973j55.m153747Y()) {
                    i11 = AbstractC8020f0.str_notice_content_community_join;
                } else {
                    i11 = AbstractC8020f0.str_notice_content_group_join_v2;
                }
                String string5 = m35500c3.getString(i11);
                AbstractC19074t.m100207e(string5, "getString(...)");
                m13514b = aVar5.m13514b(string5, 1, size5, this.f11176M);
            }
            this.f11168E = m13514b;
        }
        this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
        this.f11203t = AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e);
        if (this.f11198o) {
            JSONObject jSONObject = this.f11196m;
            if (jSONObject != null) {
                AbstractC19074t.m100205c(jSONObject);
                if (jSONObject.optInt("enableMsgHistory") == 1) {
                    z11 = true;
                    if (AbstractC0924m0.m3356Q0() == 1 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f11204u = z12;
                    String sb2 = this.f11178O.toString();
                    AbstractC19074t.m100207e(sb2, "toString(...)");
                    this.f11179P = sb2;
                    this.f11203t = true;
                }
            }
            z11 = false;
            if (AbstractC0924m0.m3356Q0() == 1) {
            }
            z12 = false;
            this.f11204u = z12;
            String sb22 = this.f11178O.toString();
            AbstractC19074t.m100207e(sb22, "toString(...)");
            this.f11179P = sb22;
            this.f11203t = true;
        }
        C31973j5 c31973j56 = this.f11174K;
        if (c31973j56 != null) {
            AbstractC19074t.m100205c(c31973j56);
            if (!TextUtils.isEmpty(c31973j56.m153781r())) {
                C31986k3 c31986k3 = C31986k3.f147083a;
                C31973j5 c31973j57 = this.f11174K;
                AbstractC19074t.m100205c(c31973j57);
                boolean m154108R1 = c31986k3.m154108R1(c31973j57.m153730N());
                int size6 = this.f11172I.size();
                for (int i16 = 0; i16 < size6; i16++) {
                    Object obj = this.f11172I.get(i16);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    String str2 = (String) obj;
                    C32076q5 c32076q5 = this.f11175L;
                    AbstractC19074t.m100205c(c32076q5);
                    c32076q5.m154713b(str2);
                    if (m154108R1) {
                        C31986k3 c31986k32 = C31986k3.f147083a;
                        C31973j5 c31973j58 = this.f11174K;
                        AbstractC19074t.m100205c(c31973j58);
                        c31986k32.m154127f0(c31973j58.m153730N(), Integer.parseInt(str2));
                    }
                }
            }
        }
        this.f11166C.m95723e(this.f11171H).m95731m(this.f11172I.size()).m95730l(this.f11168E).m95726h(this.f11167D);
        if (this.f11172I.size() > 0 && AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
            try {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_undo_add_member);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f11171H.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InviteContactProfile((ContactProfile) it.next()));
                }
                String m102879B0 = AbstractC19646n0.m102879B0(arrayList, 20, C23793c.Companion.m124321a().mo124311f());
                AbstractC19074t.m100207e(m102879B0, "getDataJSONStringInviteContactListView(...)");
                this.f11166C.m95719a("action.open.undo.invitee_list", m102879B0, m118743r0);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } else {
            try {
                if (!m13504s()) {
                    AbstractC24337r.m127103i(this.f11178O);
                    this.f11179P = "";
                } else {
                    String m122640z4 = AbstractC23309i.m122640z4();
                    if (!TextUtils.isEmpty(m122640z4)) {
                        this.f11166C.m95720b(new C32005l7(new JSONObject(m122640z4)));
                    }
                }
            } catch (JSONException e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
        this.f11177N = true;
    }

    /* renamed from: o */
    private final void m13500o() {
        int i11;
        m13491f();
        if (m13504s()) {
            int size = this.f11167D.size();
            a aVar = Companion;
            Context m35500c = MainApplication.Companion.m35500c();
            C31973j5 c31973j5 = this.f11174K;
            if (c31973j5 != null && c31973j5.m153747Y()) {
                i11 = AbstractC8020f0.str_notice_content_community_leave;
            } else {
                i11 = AbstractC8020f0.str_notice_content_group_leave_v2;
            }
            String string = m35500c.getString(i11);
            AbstractC19074t.m100207e(string, "getString(...)");
            String m13514b = aVar.m13514b(string, 1, size, this.f11176M);
            this.f11168E = m13514b;
            this.f11178O.append(aVar.m13513a(m13514b, this.f11167D));
            this.f11166C.m95723e(this.f11171H).m95731m(this.f11172I.size()).m95730l(this.f11168E).m95726h(this.f11167D);
        }
        C31973j5 c31973j52 = this.f11174K;
        if (c31973j52 != null) {
            AbstractC19074t.m100205c(c31973j52);
            if (!TextUtils.isEmpty(c31973j52.m153781r())) {
                m13493h(this.f11172I);
                C31973j5 c31973j53 = this.f11174K;
                AbstractC19074t.m100205c(c31973j53);
                if (!AbstractC19074t.m100204b(c31973j53.m153758f(), this.f11187d)) {
                    this.f11200q = true;
                    C31973j5 c31973j54 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j54);
                    c31973j54.m153710C0(this.f11187d);
                    C32076q5 c32076q5 = this.f11175L;
                    AbstractC19074t.m100205c(c32076q5);
                    c32076q5.m154714c(this.f11187d);
                }
                if (this.f11198o) {
                    m13488b();
                } else {
                    this.f11177N = true;
                }
            }
        }
    }

    /* renamed from: p */
    private final void m13501p() {
        int i11;
        int i12;
        int i13;
        int size = this.f11172I.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = this.f11172I.get(i14);
            AbstractC19074t.m100207e(obj, "get(...)");
            C32076q5 c32076q5 = this.f11175L;
            AbstractC19074t.m100205c(c32076q5);
            c32076q5.m154727p((String) obj);
        }
        if (this.f11198o) {
            StringBuilder sb2 = this.f11178O;
            Context m35500c = MainApplication.Companion.m35500c();
            C31973j5 c31973j5 = this.f11174K;
            if (c31973j5 != null && c31973j5.m153747Y()) {
                i13 = AbstractC8020f0.str_msg_info_unset_community_admin_for_me;
            } else {
                i13 = AbstractC8020f0.str_noti_unset_admin_for_me_v2;
            }
            sb2.append(m35500c.getString(i13));
            this.f11166C.m95727i(7);
            String sb3 = this.f11178O.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            this.f11179P = sb3;
            this.f11203t = true;
        } else {
            C31973j5 c31973j52 = this.f11174K;
            AbstractC19074t.m100205c(c31973j52);
            if (c31973j52.m153778p0()) {
                int size2 = this.f11167D.size();
                C31973j5 c31973j53 = this.f11174K;
                if (c31973j53 != null && c31973j53.m153747Y()) {
                    i12 = AbstractC8020f0.str_msg_info_unset_community_admin_for_owner;
                } else {
                    i12 = AbstractC8020f0.str_msg_info_unset_admin_for_owner_v2;
                }
                a aVar = Companion;
                String m118743r0 = AbstractC23136l9.m118743r0(i12);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                this.f11168E = aVar.m13514b(m118743r0, 1, size2, this.f11176M);
                this.f11166C.m95727i(7).m95730l(this.f11168E).m95726h(this.f11167D);
                this.f11178O.append(aVar.m13513a(this.f11168E, this.f11167D));
                this.f11203t = true;
            } else {
                int size3 = this.f11167D.size() + 1;
                C31973j5 c31973j54 = this.f11174K;
                if (c31973j54 != null && c31973j54.m153747Y()) {
                    i11 = AbstractC8020f0.str_msg_info_unset_community_admin_for_other_by_other;
                } else {
                    i11 = AbstractC8020f0.str_msg_info_unset_admin_for_normal_mem_v2;
                }
                a aVar2 = Companion;
                String m118743r02 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                this.f11168E = aVar2.m13514b(m118743r02, 2, size3, this.f11176M);
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
                this.f11166C.m95727i(7).m95730l(this.f11168E).m95726h(this.f11167D);
                this.f11178O.append(aVar2.m13513a(this.f11168E, this.f11167D));
                this.f11203t = true;
            }
        }
        this.f11177N = true;
    }

    /* renamed from: q */
    private final void m13502q() {
    }

    /* renamed from: r */
    private final void m13503r() {
        int i11;
        int i12;
        this.f11199p = true;
        m13491f();
        if (this.f11193j <= 0) {
            m13497l();
            return;
        }
        if (!this.f11198o) {
            if (AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e)) {
                int size = this.f11167D.size();
                C31973j5 c31973j5 = this.f11174K;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    if (this.f11181R) {
                        i12 = AbstractC8020f0.str_msg_info_banned_mem_from_community_by_me_2;
                    } else {
                        i12 = AbstractC8020f0.str_msg_info_banned_mem_from_community_by_me_1;
                    }
                } else if (this.f11181R) {
                    i12 = AbstractC8020f0.str_msg_info_banned_mem_from_group_by_me_2;
                } else {
                    i12 = AbstractC8020f0.str_msg_info_banned_mem_from_group_by_me_1;
                }
                a aVar = Companion;
                String m118743r0 = AbstractC23136l9.m118743r0(i12);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                this.f11168E = aVar.m13514b(m118743r0, 1, size, this.f11176M);
            } else {
                int size2 = this.f11167D.size() + 1;
                C31973j5 c31973j52 = this.f11174K;
                if (c31973j52 != null && c31973j52.m153747Y()) {
                    if (this.f11181R) {
                        i11 = AbstractC8020f0.str_msg_info_banned_mem_from_community_for_normal_mem_2;
                    } else {
                        i11 = AbstractC8020f0.str_msg_info_banned_mem_from_community_for_normal_mem_1;
                    }
                } else if (this.f11181R) {
                    i11 = AbstractC8020f0.str_msg_info_banned_mem_for_normal_mem_2;
                } else {
                    i11 = AbstractC8020f0.str_msg_info_banned_mem_for_normal_mem_1;
                }
                a aVar2 = Companion;
                String m118743r02 = AbstractC23136l9.m118743r0(i11);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                this.f11168E = aVar2.m13514b(m118743r02, 2, size2, this.f11176M);
                this.f11167D.add(0, new C32118t5(this.f11188e, this.f11165B, false));
            }
            this.f11166C.m95730l(this.f11168E).m95726h(this.f11167D);
            this.f11203t = true;
        }
        this.f11178O.append(Companion.m13513a(this.f11168E, this.f11167D));
        String sb2 = this.f11178O.toString();
        AbstractC19074t.m100207e(sb2, "toString(...)");
        this.f11179P = sb2;
        this.f11166C.m95723e(this.f11171H).m95731m(this.f11172I.size()).m95730l(this.f11168E).m95726h(this.f11167D);
        C31973j5 c31973j53 = this.f11174K;
        if (c31973j53 != null) {
            AbstractC19074t.m100205c(c31973j53);
            if (!TextUtils.isEmpty(c31973j53.m153781r())) {
                if (this.f11198o) {
                    m13492g(this.f11186c, this.f11192i, "2");
                    m13488b();
                } else {
                    m13493h(this.f11172I);
                }
                this.f11177N = true;
                return;
            }
        }
        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11187d) && this.f11198o) {
            m13488b();
        }
    }

    /* renamed from: s */
    private final boolean m13504s() {
        C31973j5 c31973j5 = this.f11174K;
        if (c31973j5 != null) {
            AbstractC19074t.m100205c(c31973j5);
            if (c31973j5.m153764i0()) {
                C31973j5 c31973j52 = this.f11174K;
                AbstractC19074t.m100205c(c31973j52);
                if (c31973j52.m153742T()) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private final void m13505u(JSONObject jSONObject) {
        this.f11169F = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("currentMems");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = optJSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj;
                String optString = jSONObject2.optString("id");
                String optString2 = jSONObject2.optString("dName");
                String optString3 = jSONObject2.optString("avatar");
                int optInt = jSONObject2.optInt("typeContact");
                if (!TextUtils.isEmpty(optString)) {
                    this.f11169F.add(optString);
                    AbstractC19074t.m100205c(optString);
                    AbstractC19074t.m100205c(optString2);
                    AbstractC19074t.m100205c(optString3);
                    m13510z(optString, optString2, optString3, optInt);
                }
            }
        }
    }

    /* renamed from: v */
    private final void m13506v(JSONObject jSONObject) {
        this.f11184a = jSONObject.optString("id");
        this.f11185b = jSONObject.optString("name");
        this.f11186c = jSONObject.optString("groupId");
        this.f11187d = jSONObject.optString("creatorId");
        this.f11188e = jSONObject.optString("senderId");
        String optString = jSONObject.optString("senderName");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f11165B = optString;
        ContactProfile contactProfile = null;
        if (!TextUtils.isEmpty(this.f11188e)) {
            contactProfile = C28203u6.m141798e(C28203u6.f131407a, this.f11188e, null, 2, null);
        }
        if (contactProfile != null) {
            String m114542i = AbstractC21935u.m114542i(contactProfile.f42434r, contactProfile.m40383Q(true, false));
            AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
            this.f11165B = m114542i;
        }
        this.f11189f = jSONObject.optLong("ts", -1L);
        this.f11190g = jSONObject.optString("desc");
        this.f11191h = jSONObject.optString("avt");
        this.f11192i = "group_" + this.f11186c;
        this.f11193j = jSONObject.optInt("totalMembers");
        this.f11194k = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f11195l = jSONObject.optInt("subType");
        this.f11196m = jSONObject.optJSONObject("setting");
        JSONObject optJSONObject = jSONObject.optJSONObject("extraInfo");
        this.f11197n = optJSONObject;
        if (optJSONObject != null) {
            AbstractC19074t.m100205c(optJSONObject);
            this.f11182S = optJSONObject.optInt("updateType", -1);
        }
        this.f11180Q = jSONObject.optLong("ttl", -1L);
        this.f11205v = jSONObject.optBoolean("hideMsgInfo", false);
        this.f11206w = jSONObject.optInt("visibility", 0);
        String optString2 = jSONObject.optString("fullAvt", "");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f11207x = optString2;
        this.f11208y = jSONObject.optLong("lastActive");
        String optString3 = jSONObject.optString("joinQuestion");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f11209z = optString3;
        this.f11164A = jSONObject.optInt("requestCount");
    }

    /* renamed from: w */
    private final void m13507w(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        this.f11172I = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("updateMems");
        if (optJSONArray != null) {
            this.f11176M = optJSONArray.length() - 3;
            if (optJSONArray.length() > 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (optJSONArray.length() > 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f11181R = z12;
            int length = optJSONArray.length();
            boolean z13 = true;
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = optJSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj;
                String optString = jSONObject2.optString("id");
                String optString2 = jSONObject2.optString("dName");
                String optString3 = jSONObject2.optString("avatar");
                int optInt = jSONObject2.optInt("typeContact");
                ContactProfile contactProfile = new ContactProfile(optString);
                contactProfile.f42437s = optString2;
                contactProfile.f42446v = optString3;
                contactProfile.f42352K0 = optInt;
                this.f11171H.add(contactProfile);
                if (!TextUtils.isEmpty(optString)) {
                    this.f11172I.add(optString);
                    AbstractC19074t.m100205c(optString);
                    AbstractC19074t.m100205c(optString2);
                    AbstractC19074t.m100205c(optString3);
                    m13510z(optString, optString2, optString3, optInt);
                }
                String m114542i = AbstractC21935u.m114542i(optString, optString2);
                if (!AbstractC19074t.m100204b(optString, CoreUtility.f89233i)) {
                    if (z13) {
                        this.f11167D.add(new C32118t5(optString, m114542i, false));
                        if (i11 != optJSONArray.length() - 1 && i11 == 2 && z11) {
                            z13 = false;
                        }
                    }
                } else {
                    this.f11198o = true;
                }
            }
            if (this.f11198o) {
                if (this.f11176M > 1 && this.f11167D.size() == 3) {
                    ArrayList arrayList = this.f11167D;
                    arrayList.remove(arrayList.size() - 1);
                }
                String string = MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne);
                AbstractC19074t.m100207e(string, "getString(...)");
                this.f11173J = string;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: x */
    private final void m13508x(String str) {
        String join = TextUtils.join(";", this.f11172I);
        int i11 = 4;
        switch (str.hashCode()) {
            case -2077831163:
                if (str.equals("group.force.leave.v2")) {
                    if (this.f11172I.size() == 0) {
                        join = join + ";" + CoreUtility.f89233i;
                        break;
                    }
                }
                i11 = 0;
                break;
            case -877859503:
                if (str.equals("group.join.v2")) {
                    i11 = 3;
                    break;
                }
                i11 = 0;
                break;
            case -682464488:
                if (str.equals("group.update") && this.f11182S == 4) {
                    i11 = 7;
                    break;
                }
                i11 = 0;
                break;
            case -307751288:
                if (str.equals("group.leave")) {
                    if (this.f11200q) {
                        join = join + ";" + this.f11187d;
                        i11 = 5;
                        break;
                    }
                }
                i11 = 0;
                break;
            case 116846970:
                if (str.equals("group.update.setting")) {
                    i11 = 9;
                    break;
                }
                i11 = 0;
                break;
            case 373451319:
                if (str.equals("group.update.block")) {
                    i11 = 10;
                    break;
                }
                i11 = 0;
                break;
            case 459108468:
                if (str.equals("group.remove.admin")) {
                    i11 = 2;
                    break;
                }
                i11 = 0;
                break;
            case 1948525331:
                if (str.equals("group.add.admin")) {
                    if (this.f11172I.size() > 0 && AbstractC19074t.m100204b(this.f11172I.get(0), this.f11187d)) {
                        i11 = 11;
                        break;
                    } else {
                        i11 = 1;
                        break;
                    }
                }
                i11 = 0;
                break;
            default:
                i11 = 0;
                break;
        }
        AbstractC23184q2.m119440E(this.f11186c, i11, join);
    }

    /* renamed from: y */
    private final void m13509y() {
        boolean z11;
        int i11;
        int i12;
        int i13;
        C31973j5 c31973j5 = this.f11174K;
        if (c31973j5 != null && c31973j5.m153747Y()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f11199p) {
            if (this.f11198o) {
                C31973j5 c31973j52 = this.f11174K;
                AbstractC19074t.m100205c(c31973j52);
                if (!TextUtils.isEmpty(c31973j52.m153793y())) {
                    if (z11) {
                        i13 = AbstractC8020f0.str_msg_toast_you_banned_from_community;
                    } else {
                        i13 = AbstractC8020f0.str_msg_toast_you_banned_from_group_v2;
                    }
                    C31973j5 c31973j53 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j53);
                    ToastUtils.m89268p(AbstractC23136l9.m118746s0(i13, c31973j53.m153793y()));
                    return;
                }
                return;
            }
            return;
        }
        if (this.f11172I.size() == 0) {
            C31973j5 c31973j54 = this.f11174K;
            AbstractC19074t.m100205c(c31973j54);
            if (!TextUtils.isEmpty(c31973j54.m153793y())) {
                if (z11) {
                    i12 = AbstractC8020f0.str_msg_toast_community_was_deleted;
                } else {
                    i12 = AbstractC8020f0.str_msg_toast_group_was_deleted;
                }
                C31973j5 c31973j55 = this.f11174K;
                AbstractC19074t.m100205c(c31973j55);
                ToastUtils.m89268p(AbstractC23136l9.m118746s0(i12, c31973j55.m153793y()));
                return;
            }
            return;
        }
        if ((this.f11172I.size() != 1 || !AbstractC19074t.m100204b(this.f11172I.get(0), this.f11188e)) && this.f11198o) {
            C31973j5 c31973j56 = this.f11174K;
            AbstractC19074t.m100205c(c31973j56);
            if (!TextUtils.isEmpty(c31973j56.m153793y())) {
                if (z11) {
                    i11 = AbstractC8020f0.str_msg_toast_you_were_removed_from_community;
                } else {
                    i11 = AbstractC8020f0.str_msg_toast_you_were_removed_from_group;
                }
                C31973j5 c31973j57 = this.f11174K;
                AbstractC19074t.m100205c(c31973j57);
                ToastUtils.m89268p(AbstractC23136l9.m118746s0(i11, c31973j57.m153793y()));
            }
        }
    }

    /* renamed from: z */
    private final void m13510z(String str, String str2, String str3, int i11) {
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e == null) {
            ContactProfile contactProfile = new ContactProfile(str);
            contactProfile.f42437s = str2;
            contactProfile.f42446v = str3;
            contactProfile.f42352K0 = i11;
            C7960e.m41971c6().m42221O7(contactProfile, false);
            return;
        }
        if (TextUtils.isEmpty(m141798e.f42437s) || TextUtils.isEmpty(m141798e.f42446v) || i11 != m141798e.f42352K0) {
            ContactProfile contactProfile2 = new ContactProfile(str);
            contactProfile2.f42437s = str2;
            contactProfile2.f42446v = str3;
            contactProfile2.f42352K0 = i11;
            C7960e.m41971c6().m42221O7(contactProfile2, false);
        }
    }

    /* renamed from: d */
    public final String m13511d() {
        return this.f11186c;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0227 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:15:0x0086, B:16:0x00d5, B:18:0x00d9, B:19:0x00df, B:20:0x00e3, B:22:0x0198, B:25:0x01a1, B:27:0x01ae, B:29:0x01b2, B:30:0x01da, B:32:0x01de, B:36:0x01f9, B:62:0x020e, B:42:0x0215, B:47:0x0218, B:49:0x0227, B:51:0x022c, B:53:0x0232, B:55:0x023a, B:56:0x025e, B:58:0x0262, B:70:0x02a2, B:72:0x02a9, B:74:0x02ad, B:75:0x02be, B:76:0x02cd, B:78:0x02d1, B:80:0x02e0, B:82:0x02e8, B:83:0x02f1, B:84:0x02f6, B:86:0x02fa, B:89:0x0304, B:92:0x0313, B:94:0x031b, B:96:0x0325, B:98:0x0331, B:100:0x0337, B:101:0x0348, B:103:0x0354, B:104:0x0362, B:106:0x0368, B:109:0x0373, B:112:0x0377, B:115:0x0381, B:118:0x038d, B:130:0x00ea, B:133:0x00f6, B:134:0x00fb, B:137:0x0107, B:138:0x010c, B:141:0x0118, B:142:0x011d, B:145:0x0129, B:146:0x0130, B:149:0x013c, B:150:0x0140, B:153:0x014b, B:154:0x014f, B:157:0x015a, B:158:0x015e, B:161:0x0169, B:162:0x016d, B:164:0x0177, B:165:0x017b, B:168:0x0186, B:169:0x018a, B:172:0x0195), top: B:14:0x0086 }] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13512t(C3543k c3543k) {
        long j11;
        String str;
        String str2;
        String str3;
        String m153730N;
        int i11;
        boolean z11;
        String str4;
        AbstractC19074t.m100208f(c3543k, "packet");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject m18009b = c3543k.m18009b();
            String m18010c = c3543k.m18010c();
            this.f11198o = false;
            this.f11200q = false;
            this.f11201r = false;
            this.f11203t = false;
            this.f11204u = false;
            this.f11205v = false;
            m13506v(m18009b);
            m13505u(m18009b);
            m13507w(m18009b);
            C0943w c0943w = C0943w.f3447a;
            this.f11174K = c0943w.m4472f(this.f11186c);
            this.f11175L = c0943w.m4476k(this.f11186c);
            if (this.f11174K != null) {
                str = "toString(...)";
                str2 = m18010c;
                j11 = currentTimeMillis;
            } else {
                this.f11201r = true;
                JSONObject jSONObject = this.f11196m;
                String str5 = "";
                if (jSONObject == null) {
                    str4 = "";
                } else {
                    str4 = String.valueOf(jSONObject);
                }
                JSONObject jSONObject2 = this.f11197n;
                if (jSONObject2 != null) {
                    str5 = String.valueOf(jSONObject2);
                }
                String str6 = str5;
                String str7 = this.f11186c;
                AbstractC19074t.m100205c(str7);
                String str8 = this.f11185b;
                AbstractC19074t.m100205c(str8);
                j11 = currentTimeMillis;
                try {
                    str = "toString(...)";
                    str2 = m18010c;
                    this.f11174K = new C31973j5(str7, str8, this.f11190g, this.f11187d, String.valueOf(this.f11189f), this.f11191h, this.f11169F, this.f11193j, str4, this.f11194k, this.f11195l, str6, this.f11208y, this.f11206w, this.f11207x, this.f11209z, String.valueOf(this.f11189f));
                    String str9 = this.f11186c;
                    AbstractC19074t.m100205c(str9);
                    C32076q5 c32076q5 = new C32076q5(str9);
                    C31973j5 c31973j5 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j5);
                    c32076q5.m154715d(c31973j5, this.f11169F, new ArrayList());
                    this.f11175L = c32076q5;
                } catch (Exception e11) {
                    e = e11;
                    long currentTimeMillis2 = System.currentTimeMillis() - j11;
                    String str10 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str10, "currentUserUid");
                    AbstractC20887g.m109232j(str10, 15002, e.toString(), currentTimeMillis2, 15000, CoreUtility.f89236l);
                    AbstractC23350e.m122778h(e);
                    return;
                }
            }
            String str11 = this.f11192i;
            if (str11 != null) {
                AbstractC19074t.m100205c(str11);
                C25489b.m132042t(str11);
            }
            switch (str2.hashCode()) {
                case -2077831163:
                    str3 = str2;
                    if (str3.equals("group.force.leave.v2")) {
                        m13496k();
                        break;
                    } else {
                        break;
                    }
                case -1179076614:
                    str3 = str2;
                    if (str3.equals("group.delete")) {
                        m13497l();
                        break;
                    } else {
                        break;
                    }
                case -877859503:
                    str3 = str2;
                    if (str3.equals("group.join.v2")) {
                        m13499n();
                        break;
                    }
                    break;
                case -682464488:
                    str3 = str2;
                    if (str3.equals("group.update")) {
                        m13498m();
                        break;
                    } else {
                        break;
                    }
                case -307751288:
                    str3 = str2;
                    if (str3.equals("group.leave")) {
                        m13500o();
                        break;
                    } else {
                        break;
                    }
                case 116846970:
                    str3 = str2;
                    if (str3.equals("group.update.setting")) {
                        m13494i();
                        break;
                    } else {
                        break;
                    }
                case 373451319:
                    str3 = str2;
                    if (str3.equals("group.update.block")) {
                        m13503r();
                        break;
                    } else {
                        break;
                    }
                case 390165209:
                    str3 = str2;
                    if (str3.equals("group.update.topic")) {
                        this.f11201r = true;
                        this.f11202s = true;
                        break;
                    } else {
                        break;
                    }
                case 459108468:
                    str3 = str2;
                    if (str3.equals("group.remove.admin")) {
                        m13501p();
                        break;
                    } else {
                        break;
                    }
                case 476985940:
                    str3 = str2;
                    if (str3.equals("group.remove.topic")) {
                        m13502q();
                        break;
                    } else {
                        break;
                    }
                case 1948525331:
                    str3 = str2;
                    if (str3.equals("group.add.admin")) {
                        m13495j();
                        break;
                    } else {
                        break;
                    }
                default:
                    str3 = str2;
                    break;
            }
            m13486A();
            C31973j5 c31973j52 = this.f11174K;
            if (c31973j52 != null) {
                AbstractC19074t.m100205c(c31973j52);
                if (!TextUtils.isEmpty(c31973j52.m153781r()) && this.f11177N) {
                    C18922m m99141t = C18922m.m99141t();
                    C31973j5 c31973j53 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j53);
                    String str12 = "group_" + c31973j53.m153781r();
                    C31973j5 c31973j54 = this.f11174K;
                    AbstractC19074t.m100205c(c31973j54);
                    m99141t.m99151U(str12, c31973j54.m153756e());
                }
            }
            if (!this.f11205v) {
                String sb2 = this.f11178O.toString();
                String str13 = str;
                AbstractC19074t.m100207e(sb2, str13);
                int length = sb2.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(sb2.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (z11) {
                        length--;
                    } else if (!TextUtils.isEmpty(sb2.subSequence(i12, length + 1).toString())) {
                        C31973j5 c31973j55 = this.f11174K;
                        C26710b c26710b = null;
                        if (c31973j55 != null && (m153730N = c31973j55.m153730N()) != null && !TextUtils.isEmpty(this.f11184a)) {
                            c26710b = new C26710b(CoreUtility.f89233i + this.f11184a + this.f11188e, 0L, m153730N, null, 8, null);
                        }
                        C31973j5 c31973j56 = this.f11174K;
                        if (c31973j56 != null) {
                            String str14 = "group_" + c31973j56.m153781r();
                            C29595k m13490e = m13490e();
                            String sb3 = this.f11178O.toString();
                            AbstractC19074t.m100207e(sb3, str13);
                            m13490e.m101508a(new C29595k.b(str14, sb3, this.f11166C.m95721c(), this.f11180Q, this.f11189f, new C29595k.c(this.f11203t, c26710b), false, 64, null));
                        }
                    }
                }
                if (!TextUtils.isEmpty(sb2.subSequence(i12, length + 1).toString())) {
                }
            }
            m13508x(str3);
            if (this.f11201r) {
                if (this.f11202s) {
                    C0843s0.m2286r().m2294e(new AbstractC0826k.a(this.f11192i, 8));
                } else {
                    C0843s0.m2286r().m2294e(new AbstractC0826k.a(this.f11192i, 0));
                }
            }
            if (this.f11204u) {
                C29628e.m147249E0().m147281j1(this.f11186c, 20);
                C31973j5 c31973j57 = this.f11174K;
                if (c31973j57 != null) {
                    c31973j57.m153723J0(true);
                    C32076q5 c32076q52 = this.f11175L;
                    if (c32076q52 == null) {
                        c32076q52 = new C32076q5(c31973j57.m153781r());
                    }
                    C0943w.f3447a.m4477n(c31973j57, c32076q52);
                }
            }
            if (!this.f11205v) {
                MainTabView m67645lM = MainTabView.m67645lM();
                if ((!AbstractC23304d.f113254A0 || m67645lM == null || m67645lM.f63251m1 != C24099q0.Companion.m125984a().m125971o()) && !TextUtils.isEmpty(this.f11179P) && !AbstractC19074t.m100204b(CoreUtility.f89233i, this.f11188e) && !C0804b.m2025g().m2033i(this.f11192i) && AbstractC23309i.m122450u()) {
                    C18961d.Companion.m99497a().m99494n(this.f11186c, this.f11185b, this.f11191h, this.f11179P);
                }
            }
            if (C21933s.m114404I().m114451X().f147679k != null) {
                for (C18450l c18450l : C21933s.m114404I().m114451X().f147679k) {
                    if (c18450l.f92990a == 2 && c18450l.f92989l != null && !TextUtils.isEmpty(c18450l.mo97719a()) && AbstractC19074t.m100204b(c18450l.mo97719a(), this.f11186c)) {
                        C19669z.f97569Q.set(false);
                        C19669z.Companion.m103232a().m103198O0();
                        return;
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
            j11 = currentTimeMillis;
        }
    }
}
