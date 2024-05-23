package p716zh;

import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p105dn.EnumC18030a;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p241ij.C20564a;
import p269jj.C21275a;
import p279jw.C21373a;
import p325lj.C22496c;
import p325lj.C22497d;
import p325lj.C22499f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.AbstractC23310j;
import p624wx.C29264g;
import p732zy.C32592h;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import vg.AbstractC28207v1;
import vg.C28176r6;

/* renamed from: zh.r */
/* loaded from: classes3.dex */
public final class C32084r {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private static final List f147805r;

    /* renamed from: s */
    private static final List f147806s;

    /* renamed from: t */
    private static final List f147807t;

    /* renamed from: u */
    private static final List f147808u;

    /* renamed from: v */
    private static final List f147809v;

    /* renamed from: w */
    private static final List f147810w;

    /* renamed from: x */
    private static final List f147811x;

    /* renamed from: y */
    private static final ArrayList f147812y;

    /* renamed from: z */
    private static final ArrayList f147813z;

    /* renamed from: a */
    private boolean f147814a;

    /* renamed from: b */
    public boolean f147815b;

    /* renamed from: c */
    private int f147816c;

    /* renamed from: d */
    private boolean f147817d;

    /* renamed from: e */
    private List f147818e;

    /* renamed from: f */
    private List f147819f;

    /* renamed from: g */
    private List f147820g;

    /* renamed from: h */
    private List f147821h;

    /* renamed from: i */
    private List f147822i;

    /* renamed from: j */
    private List f147823j;

    /* renamed from: k */
    private List f147824k;

    /* renamed from: l */
    private List f147825l;

    /* renamed from: m */
    private List f147826m;

    /* renamed from: n */
    private List f147827n;

    /* renamed from: o */
    private final InterfaceC24854k f147828o;

    /* renamed from: p */
    private final InterfaceC24854k f147829p;

    /* renamed from: q */
    private final C21275a f147830q;

    /* renamed from: zh.r$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC23310j {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zh.r$a$a */
        /* loaded from: classes3.dex */
        public static final class C33065a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C33065a f147831q = new C33065a();

            C33065a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final C32084r mo12V4() {
                return new C32084r(null);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C33065a.f147831q);
        }
    }

    /* renamed from: zh.r$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f147832a;

        static {
            int[] iArr = new int[EnumC18030a.values().length];
            try {
                iArr[EnumC18030a.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18030a.SINGLE_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18030a.SINGLE_PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f147832a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.r$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f147833q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SparseArray mo12V4() {
            return new SparseArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.r$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f147834q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SparseArray mo12V4() {
            return new SparseArray();
        }
    }

    static {
        List m131505m;
        List m131505m2;
        List m131505m3;
        List m131505m4;
        List m131505m5;
        List m131505m6;
        List m131505m7;
        List m131505m8;
        List m131496e;
        ArrayList m131500h;
        List m131496e2;
        List m131496e3;
        ArrayList m131500h2;
        m131505m = AbstractC25368s.m131505m(13, 11, 9, 10, 5, 12);
        f147805r = m131505m;
        m131505m2 = AbstractC25368s.m131505m(14, 15, 16, 17);
        f147806s = m131505m2;
        m131505m3 = AbstractC25368s.m131505m(3, 2, 1);
        f147807t = m131505m3;
        m131505m4 = AbstractC25368s.m131505m(2, 7, 8, 13, 11, 9, 10, 5);
        f147808u = m131505m4;
        m131505m5 = AbstractC25368s.m131505m(3, 4, 1);
        f147809v = m131505m5;
        m131505m6 = AbstractC25368s.m131505m(1, 2);
        f147810w = m131505m6;
        m131505m7 = AbstractC25368s.m131505m(3, 2, 11, 1);
        f147811x = m131505m7;
        m131505m8 = AbstractC25368s.m131505m(2, 1);
        m131496e = AbstractC25366r.m131496e(4);
        m131500h = AbstractC25368s.m131500h(m131505m8, m131496e);
        f147812y = m131500h;
        m131496e2 = AbstractC25366r.m131496e(5);
        m131496e3 = AbstractC25366r.m131496e(6);
        m131500h2 = AbstractC25368s.m131500h(m131496e2, m131496e3);
        f147813z = m131500h2;
    }

    public /* synthetic */ C32084r(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: d */
    private final C20564a m154784d(int i11, EnumC18030a enumC18030a, boolean z11, boolean z12, boolean z13, int i12, C11598e.e eVar, boolean z14) {
        C22499f m110205h;
        C20564a c20564a;
        String str;
        C22499f m110205h2;
        if (m154785e().size() == 0 && m154786f().size() == 0) {
            return null;
        }
        if (i11 != 5) {
            if (i11 != 19) {
                if (i11 != 7) {
                    if (i11 != 8) {
                        switch (i11) {
                            case 11:
                                if (eVar == C11598e.e.f60097q) {
                                    return null;
                                }
                                if (Build.VERSION.SDK_INT >= 29 && z12) {
                                    return null;
                                }
                                return (C20564a) m154785e().get(i11);
                            case 12:
                                if (enumC18030a != EnumC18030a.SINGLE_USER || z13 || (m110205h = this.f147830q.m110205h()) == null || !m110205h.m116336l()) {
                                    return null;
                                }
                                C32192y9 c32192y9 = AbstractC23304d.f113404k2;
                                if (c32192y9 != null && c32192y9.m155239a()) {
                                    if (TextUtils.equals(AbstractC18458a.f93019a, "vi")) {
                                        str = AbstractC23304d.f113404k2.f148476e;
                                    } else {
                                        str = AbstractC23304d.f113404k2.f148477f;
                                    }
                                    c20564a = new C20564a(-18, str, 0, "sugChat", AbstractC23304d.f113404k2.f148474c, "");
                                } else {
                                    c20564a = (C20564a) m154785e().get(i11);
                                }
                                return c20564a;
                            case 13:
                                if (AbstractC23309i.m122351rb() != 1 || !AbstractC23309i.m121331Q2()) {
                                    return null;
                                }
                                return (C20564a) m154785e().get(i11);
                            case 14:
                                if (eVar == C11598e.e.f60097q) {
                                    return null;
                                }
                                return (C20564a) m154785e().get(i11);
                            default:
                                switch (i11) {
                                    case 21:
                                        if (!AbstractC23309i.m121677Zf()) {
                                            return null;
                                        }
                                        if ((enumC18030a != EnumC18030a.GROUP && (enumC18030a != EnumC18030a.SINGLE_USER || eVar == C11598e.e.f60097q)) || z11) {
                                            return null;
                                        }
                                        return (C20564a) m154785e().get(i11);
                                    case 22:
                                        if (((enumC18030a != EnumC18030a.SINGLE_USER || eVar == C11598e.e.f60097q) && enumC18030a != EnumC18030a.GROUP) || z13 || (m110205h2 = this.f147830q.m110205h()) == null || !m110205h2.m116336l() || m110205h2.m116335k() == null) {
                                            return null;
                                        }
                                        return (C20564a) m154785e().get(i11);
                                    case 23:
                                        if (enumC18030a != EnumC18030a.GROUP || i12 > AbstractC23304d.f113271E1) {
                                            return null;
                                        }
                                        return (C20564a) m154785e().get(i11);
                                    case 24:
                                        C21373a c21373a = C21373a.f104231a;
                                        if (!c21373a.m110802n() || !c21373a.m110800l() || z13) {
                                            return null;
                                        }
                                        return (C20564a) m154785e().get(i11);
                                    case 25:
                                        if (!C32592h.f150598a.m157755b()) {
                                            return null;
                                        }
                                        return (C20564a) m154785e().get(i11);
                                    case 26:
                                        if (!C29264g.f135604a.m146199c()) {
                                            return null;
                                        }
                                        return (C20564a) m154785e().get(i11);
                                    default:
                                        C20564a c20564a2 = (C20564a) m154785e().get(i11);
                                        if (c20564a2 == null) {
                                            C22496c c22496c = (C22496c) m154786f().get(i11);
                                            if (c22496c == null || !c22496c.m116295d() || !AbstractC28207v1.m141987h1(c22496c.m116292a(), c22496c.m116293b(), null, null)) {
                                                return null;
                                            }
                                            if (c22496c.m116294c() != null && !c22496c.m116294c().m116302b(true ^ z11, z13, enumC18030a, z14)) {
                                                return null;
                                            }
                                            return new C20564a(c22496c.m116297f(), c22496c.m116298g().m116290a(""), 0, "", c22496c.m116296e(), "");
                                        }
                                        return c20564a2;
                                }
                        }
                    }
                    if (!C28176r6.m141702d().m141708i()) {
                        return null;
                    }
                    return (C20564a) m154785e().get(i11);
                }
                if ((enumC18030a != EnumC18030a.SINGLE_USER || eVar == C11598e.e.f60097q) && enumC18030a != EnumC18030a.GROUP) {
                    return null;
                }
                return (C20564a) m154785e().get(i11);
            }
            return (C20564a) m154785e().get(i11);
        }
        if (!C31845ac.m152996J().m153048c0()) {
            return null;
        }
        if (enumC18030a != EnumC18030a.GROUP && (enumC18030a != EnumC18030a.SINGLE_USER || eVar == C11598e.e.f60097q)) {
            return null;
        }
        return (C20564a) m154785e().get(i11);
    }

    /* renamed from: e */
    private final SparseArray m154785e() {
        return (SparseArray) this.f147829p.getValue();
    }

    /* renamed from: f */
    private final SparseArray m154786f() {
        return (SparseArray) this.f147828o.getValue();
    }

    /* renamed from: a */
    public final boolean m154787a(int i11) {
        return this.f147825l.contains(Integer.valueOf(i11));
    }

    /* renamed from: b */
    public final List m154788b(EnumC18030a enumC18030a) {
        AbstractC19074t.m100208f(enumC18030a, "chatMode");
        int i11 = b.f147832a[enumC18030a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return new ArrayList();
            }
            return this.f147826m;
        }
        return this.f147827n;
    }

    /* renamed from: c */
    public final C22496c m154789c(int i11) {
        return (C22496c) m154786f().get(i11);
    }

    /* renamed from: g */
    public final List m154790g(EnumC18030a enumC18030a, boolean z11, boolean z12, boolean z13, int i11, C11598e.e eVar, boolean z14) {
        boolean z15;
        boolean z16;
        ArrayList<C20564a> arrayList = new ArrayList();
        if (enumC18030a == null) {
            return arrayList;
        }
        if (enumC18030a == EnumC18030a.GROUP) {
            Iterator it = this.f147821h.iterator();
            while (it.hasNext()) {
                C20564a m154784d = m154784d(((Number) it.next()).intValue(), enumC18030a, z11, z12, z13, i11, eVar, z14);
                if (m154784d != null) {
                    arrayList.add(m154784d);
                }
            }
            arrayList.add(new C20564a());
            Iterator it2 = this.f147822i.iterator();
            boolean z17 = false;
            while (it2.hasNext()) {
                C20564a m154784d2 = m154784d(((Number) it2.next()).intValue(), enumC18030a, z11, z12, z13, i11, eVar, z14);
                if (m154784d2 != null) {
                    arrayList.add(m154784d2);
                    z17 = true;
                }
            }
            if (!z17) {
                arrayList.remove(arrayList.size() - 1);
            }
        } else if (enumC18030a == EnumC18030a.SINGLE_PAGE || enumC18030a == EnumC18030a.SINGLE_USER) {
            Iterator it3 = this.f147818e.iterator();
            while (it3.hasNext()) {
                C20564a m154784d3 = m154784d(((Number) it3.next()).intValue(), enumC18030a, z11, z12, z13, i11, eVar, z14);
                if (m154784d3 != null) {
                    arrayList.add(m154784d3);
                }
            }
            arrayList.add(new C20564a());
            Iterator it4 = this.f147819f.iterator();
            boolean z18 = false;
            while (it4.hasNext()) {
                C20564a m154784d4 = m154784d(((Number) it4.next()).intValue(), enumC18030a, z11, z12, z13, i11, eVar, z14);
                if (m154784d4 != null) {
                    arrayList.add(m154784d4);
                    z18 = true;
                }
            }
            if (!z18) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        this.f147817d = false;
        for (C20564a c20564a : arrayList) {
            int m106977a = c20564a.m106977a();
            if (this.f147816c == m106977a) {
                z15 = true;
            } else {
                z15 = false;
            }
            c20564a.m106983g(z15);
            boolean z19 = this.f147817d;
            if (this.f147816c == m106977a) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f147817d = z19 | z16;
        }
        if (this.f147816c != Integer.MIN_VALUE && !this.f147817d) {
            ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_perform_action));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List m154791h(EnumC18030a enumC18030a, C11598e.e eVar) {
        int i11;
        if (enumC18030a == null) {
            i11 = -1;
        } else {
            i11 = b.f147832a[enumC18030a.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                return new ArrayList();
            }
            if (eVar == C11598e.e.f60097q) {
                return this.f147824k;
            }
            return this.f147820g;
        }
        return this.f147823j;
    }

    /* renamed from: i */
    public final void m154792i(int i11) {
        try {
            this.f147816c = i11;
            if (!this.f147814a) {
                this.f147814a = true;
                m154785e().clear();
                m154785e().put(9, new C20564a(9, AbstractC23136l9.m118743r0(AbstractC8020f0.funcInvite), AbstractC16803z.icn_toolbar_more_sharecontact, "", "", ""));
                m154785e().put(10, new C20564a(10, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_doodle), AbstractC16803z.icn_toolbar_more_doodle, "", "", ""));
                m154785e().put(2, new C20564a(2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice), AbstractC16803z.icn_toolbar_more_recordvoice, "", "", ""));
                m154785e().put(4, new C20564a(4, AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_mention_hint), AbstractC16803z.icn_toolbar_more_mention, "", "", ""));
                m154785e().put(7, new C20564a(7, AbstractC23136l9.m118743r0(AbstractC8020f0.str_reminder), AbstractC16803z.icn_toolbar_more_reminder, "", "", ""));
                m154785e().put(11, new C20564a(11, AbstractC23136l9.m118743r0(AbstractC8020f0.str_function_send_document), AbstractC16803z.icn_toolbar_more_document, "", "", ""));
                m154785e().put(8, new C20564a(8, AbstractC23136l9.m118743r0(AbstractC8020f0.str_poll_polls), AbstractC16803z.icn_toolbar_more_poll, "", "", ""));
                m154785e().put(13, new C20564a(13, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_location), AbstractC16803z.icn_toolbar_more_location, "", "", ""));
                m154785e().put(5, new C20564a(5, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_typo), AbstractC16803z.icn_toolbar_more_typo, "", "", ""));
                SparseArray m154785e = m154785e();
                C22499f m110205h = this.f147830q.m110205h();
                AbstractC19074t.m100205c(m110205h);
                String m116328d = m110205h.m116328d();
                int i12 = AbstractC16803z.icn_sendmoney_zalopay;
                C22499f m110205h2 = this.f147830q.m110205h();
                AbstractC19074t.m100205c(m110205h2);
                String m116333i = m110205h2.m116333i();
                C22499f m110205h3 = this.f147830q.m110205h();
                AbstractC19074t.m100205c(m110205h3);
                m154785e.put(12, new C20564a(12, m116328d, i12, m116333i, m110205h3.m116329e(), ""));
                m154785e().put(18, new C20564a(18, AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_create_post_short), AbstractC16803z.icn_toolbar_more_notice, "", "", ""));
                m154785e().put(24, new C20564a(24, C21373a.f104231a.m110805u(), AbstractC16803z.ic_my_cloud, "", "", ""));
                m154785e().put(19, new C20564a(19, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_livestream), AbstractC16803z.icn_toolbar_more_livestream, "", "", ""));
                m154785e().put(20, new C20564a(20, AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_calendar_in_attachment), AbstractC16803z.icn_toolbar_more_calendar, "", "", ""));
                m154785e().put(21, new C20564a(21, AbstractC23136l9.m118743r0(AbstractC8020f0.str_item_cm_view_chat_todo), AbstractC16803z.icn_toolbar_more_todo, "", "", ""));
                C22499f m110205h4 = this.f147830q.m110205h();
                AbstractC19074t.m100205c(m110205h4);
                if (m110205h4.m116335k() != null) {
                    SparseArray m154785e2 = m154785e();
                    C22499f m110205h5 = this.f147830q.m110205h();
                    AbstractC19074t.m100205c(m110205h5);
                    C22497d m116335k = m110205h5.m116335k();
                    AbstractC19074t.m100205c(m116335k);
                    String m116306c = m116335k.m116306c();
                    int i13 = AbstractC16803z.icn_lixi_zalopay;
                    C22499f m110205h6 = this.f147830q.m110205h();
                    AbstractC19074t.m100205c(m110205h6);
                    String m116333i2 = m110205h6.m116333i();
                    C22499f m110205h7 = this.f147830q.m110205h();
                    AbstractC19074t.m100205c(m110205h7);
                    C22497d m116335k2 = m110205h7.m116335k();
                    AbstractC19074t.m100205c(m116335k2);
                    m154785e2.put(22, new C20564a(22, m116306c, i13, m116333i2, m116335k2.m116307d(), ""));
                }
                m154785e().put(23, new C20564a(23, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_group_call), AbstractC16803z.icn_toolbar_more_callgroup, "", "", ""));
                m154785e().put(25, new C20564a(25, AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message), AbstractC16803z.icn_toolbar_more_quickmessage, "", "", ""));
                m154785e().put(26, new C20564a(26, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_product_catalog), AbstractC16803z.icn_toolbar_more_product_catalog, "", "", ""));
            }
            if (!this.f147815b) {
                this.f147820g = f147807t;
                this.f147818e = f147805r;
                List list = f147806s;
                this.f147819f = list;
                this.f147826m = f147813z;
                this.f147823j = f147809v;
                this.f147821h = f147808u;
                this.f147822i = list;
                this.f147827n = f147812y;
                this.f147825l = f147810w;
                m154786f().clear();
                JSONObject jSONObject = new JSONObject(AbstractC23309i.m122124l9());
                JSONObject optJSONObject = jSONObject.optJSONObject("chat_1_1");
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    List m96093l = AbstractC18069a.m96093l(optJSONObject.optJSONArray("toolbar"), true);
                    if (m96093l != null) {
                        AbstractC19074t.m100205c(m96093l);
                        this.f147820g = m96093l;
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("attach");
                    if (optJSONObject2 != null) {
                        AbstractC19074t.m100205c(optJSONObject2);
                        List m96093l2 = AbstractC18069a.m96093l(optJSONObject2.optJSONArray("section_normal"), true);
                        if (m96093l2 != null) {
                            AbstractC19074t.m100205c(m96093l2);
                            this.f147818e = m96093l2;
                        }
                        List m96093l3 = AbstractC18069a.m96093l(optJSONObject2.optJSONArray("section_more"), true);
                        if (m96093l3 != null) {
                            AbstractC19074t.m100205c(m96093l3);
                            this.f147819f = m96093l3;
                        }
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("navbar");
                    if (optJSONObject3 != null) {
                        AbstractC19074t.m100205c(optJSONObject3);
                        this.f147826m = new ArrayList();
                        JSONArray optJSONArray = optJSONObject3.optJSONArray("item1");
                        if (optJSONArray != null) {
                            AbstractC19074t.m100205c(optJSONArray);
                            List m96093l4 = AbstractC18069a.m96093l(optJSONArray, true);
                            if (m96093l4 != null) {
                                List list2 = this.f147826m;
                                AbstractC19074t.m100205c(m96093l4);
                                list2.add(m96093l4);
                            }
                        }
                        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("item2");
                        if (optJSONArray2 != null) {
                            AbstractC19074t.m100205c(optJSONArray2);
                            List m96093l5 = AbstractC18069a.m96093l(optJSONArray2, true);
                            if (m96093l5 != null) {
                                List list3 = this.f147826m;
                                AbstractC19074t.m100205c(m96093l5);
                                list3.add(m96093l5);
                            }
                        }
                    }
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("chat_group");
                if (optJSONObject4 != null) {
                    AbstractC19074t.m100205c(optJSONObject4);
                    List m96093l6 = AbstractC18069a.m96093l(optJSONObject4.optJSONArray("toolbar"), true);
                    if (m96093l6 != null) {
                        AbstractC19074t.m100205c(m96093l6);
                        this.f147823j = m96093l6;
                    }
                    JSONObject optJSONObject5 = optJSONObject4.optJSONObject("attach");
                    if (optJSONObject5 != null) {
                        AbstractC19074t.m100205c(optJSONObject5);
                        List m96093l7 = AbstractC18069a.m96093l(optJSONObject5.optJSONArray("section_normal"), true);
                        if (m96093l7 != null) {
                            AbstractC19074t.m100205c(m96093l7);
                            this.f147821h = m96093l7;
                        }
                        List m96093l8 = AbstractC18069a.m96093l(optJSONObject5.optJSONArray("section_more"), true);
                        if (m96093l8 != null) {
                            AbstractC19074t.m100205c(m96093l8);
                            this.f147822i = m96093l8;
                        }
                    }
                    JSONObject optJSONObject6 = optJSONObject4.optJSONObject("navbar");
                    if (optJSONObject6 != null) {
                        AbstractC19074t.m100205c(optJSONObject6);
                        this.f147827n = new ArrayList();
                        JSONArray optJSONArray3 = optJSONObject6.optJSONArray("item1");
                        if (optJSONArray3 != null) {
                            AbstractC19074t.m100205c(optJSONArray3);
                            List m96093l9 = AbstractC18069a.m96093l(optJSONArray3, true);
                            if (m96093l9 != null) {
                                List list4 = this.f147827n;
                                AbstractC19074t.m100205c(m96093l9);
                                list4.add(m96093l9);
                            }
                        }
                        JSONArray optJSONArray4 = optJSONObject6.optJSONArray("item2");
                        if (optJSONArray4 != null) {
                            AbstractC19074t.m100205c(optJSONArray4);
                            List m96093l10 = AbstractC18069a.m96093l(optJSONArray4, true);
                            if (m96093l10 != null) {
                                List list5 = this.f147827n;
                                AbstractC19074t.m100205c(m96093l10);
                                list5.add(m96093l10);
                            }
                        }
                    }
                }
                List m96093l11 = AbstractC18069a.m96093l(jSONObject.optJSONArray("long_hold_tool_bar"), true);
                if (m96093l11 != null) {
                    AbstractC19074t.m100205c(m96093l11);
                    this.f147825l = m96093l11;
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("dynamic_items");
                if (optJSONObject7 != null) {
                    AbstractC19074t.m100205c(optJSONObject7);
                    Iterator<String> keys = optJSONObject7.keys();
                    AbstractC19074t.m100207e(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C22496c.a aVar = C22496c.Companion;
                        AbstractC19074t.m100205c(next);
                        String jSONObject2 = optJSONObject7.getJSONObject(next).toString();
                        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                        C22496c m116299a = aVar.m116299a(next, jSONObject2);
                        if (m116299a != null) {
                            m154786f().put(m116299a.m116297f(), m116299a);
                        }
                    }
                }
                this.f147815b = true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public final void m154793j(EnumC18030a enumC18030a) {
        List<C31887d9> m155013d = C32119t6.m155009c().m155013d(enumC18030a);
        AbstractC19074t.m100207e(m155013d, "getListCmd(...)");
        for (C31887d9 c31887d9 : m155013d) {
            if (c31887d9.m153220j() && c31887d9.m153212b() != -1) {
                C20564a c20564a = new C20564a(c31887d9.m153212b(), c31887d9.m153213c(), 0, MainApplication.Companion.m35500c().getPackageName(), c31887d9.m153211a(), "");
                c20564a.m106984h(c31887d9);
                m154785e().put(c31887d9.m153212b(), c20564a);
            }
        }
    }

    /* renamed from: k */
    public final boolean m154794k(int i11) {
        if (m154786f().get(i11) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m154795l(int i11) {
        this.f147816c = i11;
    }

    /* renamed from: m */
    public final void m154796m(boolean z11) {
        this.f147814a = z11;
    }

    private C32084r() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        this.f147816c = Integer.MIN_VALUE;
        this.f147818e = f147805r;
        List list = f147806s;
        this.f147819f = list;
        this.f147820g = f147807t;
        this.f147821h = f147808u;
        this.f147822i = list;
        this.f147823j = f147809v;
        this.f147824k = f147811x;
        this.f147825l = f147810w;
        this.f147826m = new ArrayList();
        this.f147827n = new ArrayList();
        m129210a = AbstractC24856m.m129210a(d.f147834q);
        this.f147828o = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f147833q);
        this.f147829p = m129210a2;
        C21275a m120583H = AbstractC23306f.m120583H();
        AbstractC19074t.m100207e(m120583H, "provideCommonRepo(...)");
        this.f147830q = m120583H;
    }
}
