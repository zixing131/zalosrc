package er;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.util.SparseIntArray;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import bo.C3054x;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.storyarchive.C8763a;
import com.zing.zalo.p062db.C7960e;
import en0.InterfaceC18494a;
import er.C18578b;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gr.C19589a;
import gr.C19590b;
import is.AbstractC20826v0;
import is.AbstractC20833z;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import nh0.C23793c;
import org.json.JSONObject;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p361nb.C23648e;
import p363nh.C23744a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import vg.C28023b6;

/* renamed from: er.k */
/* loaded from: classes4.dex */
public final class C18587k extends AbstractC19963b {

    /* renamed from: A */
    private final C1761c0 f93370A;

    /* renamed from: B */
    private final C1761c0 f93371B;

    /* renamed from: C */
    private final C1761c0 f93372C;

    /* renamed from: D */
    private final C1761c0 f93373D;

    /* renamed from: E */
    private final C1761c0 f93374E;

    /* renamed from: F */
    private String f93375F;

    /* renamed from: G */
    private String f93376G;

    /* renamed from: H */
    private boolean f93377H;

    /* renamed from: I */
    private boolean f93378I;

    /* renamed from: J */
    private String f93379J;

    /* renamed from: K */
    private final InterfaceC29232g f93380K;

    /* renamed from: L */
    private int f93381L;

    /* renamed from: M */
    private int f93382M;

    /* renamed from: N */
    private boolean f93383N;

    /* renamed from: O */
    private final a f93384O;

    /* renamed from: t */
    private final C18578b f93385t;

    /* renamed from: u */
    private final C1761c0 f93386u;

    /* renamed from: v */
    private final C1761c0 f93387v;

    /* renamed from: w */
    private final C1761c0 f93388w;

    /* renamed from: x */
    private final C1761c0 f93389x;

    /* renamed from: y */
    private final C1761c0 f93390y;

    /* renamed from: z */
    private final C1761c0 f93391z;

    /* renamed from: er.k$a */
    /* loaded from: classes4.dex */
    public static final class a implements C18578b.a {
        a() {
        }

        @Override // er.C18578b.a
        /* renamed from: a */
        public void mo98067a(C19590b c19590b) {
            AbstractC19074t.m100208f(c19590b, "response");
            C18587k.this.m98091q0(c19590b);
        }

        @Override // er.C18578b.a
        /* renamed from: b */
        public void mo98068b(C19590b c19590b) {
            AbstractC19074t.m100208f(c19590b, "response");
            C18587k.this.m98092r0(c19590b);
        }
    }

    /* renamed from: er.k$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f93393q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            return Boolean.valueOf(AbstractC0924m0.m4018mc());
        }
    }

    public C18587k(C18578b c18578b) {
        AbstractC19074t.m100208f(c18578b, "repository");
        this.f93385t = c18578b;
        this.f93386u = new C1761c0();
        this.f93387v = new C1761c0();
        this.f93388w = new C1761c0();
        this.f93389x = new C1761c0();
        this.f93390y = new C1761c0();
        this.f93391z = new C1761c0();
        this.f93370A = new C1761c0();
        this.f93371B = new C1761c0();
        this.f93372C = new C1761c0();
        this.f93373D = new C1761c0();
        this.f93374E = new C1761c0();
        this.f93375F = "0";
        this.f93376G = "0";
        this.f93379J = "";
        this.f93380K = AbstractC29233h.m145990a(b.f93393q);
        this.f93384O = new a();
    }

    /* renamed from: C0 */
    private final List m98075C0(List list, String str, String str2, String str3) {
        boolean z11;
        String str4;
        int i11;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18578b.f93336a.m98052j().clear();
        ArrayList arrayList4 = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(C23793c.Companion.m124321a().mo124311f());
        int i12 = calendar.get(6);
        int i13 = calendar.get(1);
        C31980jc c31980jc = null;
        arrayList2.add(new C19589a(1, null, false, null, null, 0, 0, null, false, 510, null));
        SparseIntArray sparseIntArray = new SparseIntArray();
        String str6 = "";
        String str7 = "";
        Iterator it = list.iterator();
        int i14 = -1;
        int i15 = 0;
        while (it.hasNext()) {
            C32123ta c32123ta = (C32123ta) it.next();
            int i16 = i12;
            calendar.setTimeInMillis(c32123ta.f148150p);
            String str8 = calendar.get(5) + " ";
            Iterator it2 = it;
            String str9 = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full)[calendar.get(2)];
            if (AbstractC19074t.m100204b(str8, str6) && AbstractC19074t.m100204b(str9, str7)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                AbstractC19074t.m100205c(str9);
                str6 = str8;
                str4 = str6;
                str7 = str9;
            } else {
                str4 = str8;
            }
            int m119196H0 = AbstractC23160o0.m119196H0(i16, calendar.get(6), i13, calendar.get(1));
            if (m119196H0 != 0) {
                i11 = 1;
                if (m119196H0 == 1) {
                    str4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_yesterday);
                }
            } else {
                i11 = 1;
                str4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
            }
            String str10 = str4;
            AbstractC19074t.m100205c(str10);
            if (m119196H0 != 0 && m119196H0 != i11) {
                str5 = str9;
            } else {
                str5 = "";
            }
            String str11 = c32123ta.f148138h;
            AbstractC19074t.m100207e(str11, "storyId");
            if (sparseIntArray.get(Integer.parseInt(str11)) == 0) {
                if (z11) {
                    if (c31980jc != null) {
                        arrayList4.add(c31980jc);
                        i15++;
                    }
                    C31980jc c31980jc2 = new C31980jc(str, str2, str3, "", false, false);
                    c31980jc2.f147019D = false;
                    c31980jc = c31980jc2;
                }
                Calendar calendar2 = calendar;
                boolean m100204b = AbstractC19074t.m100204b(c32123ta.f148138h, this.f93379J);
                AbstractC19074t.m100205c(str5);
                arrayList2.add(new C19589a(2, c32123ta, z11, str10, str5, 0, 0, null, m100204b, 224, null));
                arrayList3.add(c32123ta);
                i14++;
                C18578b.f93336a.m98052j().put(i14, i15);
                String str12 = c32123ta.f148138h;
                AbstractC19074t.m100207e(str12, "storyId");
                linkedHashMap.put(str12, Integer.valueOf(i14));
                if (c31980jc != null && (arrayList = c31980jc.f147031x) != null) {
                    arrayList.add(c32123ta);
                }
                String str13 = c32123ta.f148138h;
                AbstractC19074t.m100207e(str13, "storyId");
                int parseInt = Integer.parseInt(str13);
                String str14 = c32123ta.f148138h;
                AbstractC19074t.m100207e(str14, "storyId");
                sparseIntArray.put(parseInt, Integer.parseInt(str14));
                i12 = i16;
                calendar = calendar2;
            } else {
                i12 = i16;
            }
            it = it2;
        }
        if (c31980jc != null) {
            arrayList4.add(c31980jc);
        }
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            c18578b.m98063u(arrayList3);
            c18578b.m98066x(arrayList4);
            c18578b.m98064v(linkedHashMap);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        return arrayList2;
    }

    /* renamed from: D0 */
    private final void m98076D0(String str) {
        int i11;
        if (str.length() > 0) {
            C18578b c18578b = C18578b.f93336a;
            synchronized (c18578b.m98050h()) {
                Integer num = (Integer) c18578b.m98056n().get(str);
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = -1;
                }
            }
            if (i11 != -1) {
                this.f93371B.mo9224q(Integer.valueOf(i11));
                if (!m98090k0()) {
                    this.f93372C.mo9224q(700L);
                }
            }
        }
    }

    /* renamed from: L0 */
    private final void m98077L0() {
        this.f93385t.m98044b(this.f93384O);
    }

    /* renamed from: M0 */
    private final void m98078M0() {
        this.f93385t.m98059q(this.f93384O);
    }

    /* renamed from: N0 */
    private final void m98079N0(C19590b c19590b) {
        if (c19590b.m102555i()) {
            this.f93375F = c19590b.m102551e();
            this.f93377H = c19590b.m102550d();
        } else {
            this.f93376G = c19590b.m102551e();
            this.f93378I = c19590b.m102550d();
        }
    }

    /* renamed from: U */
    private final void m98085U() {
        if (m98090k0()) {
            AbstractC19444a.m101694b(new Runnable() { // from class: er.h
                @Override // java.lang.Runnable
                public final void run() {
                    C18587k.m98086V(C18587k.this);
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m98086V(C18587k c18587k) {
        AbstractC19074t.m100208f(c18587k, "this$0");
        c18587k.f93374E.mo9224q(new C19964c(C24848g0.f119245a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m98087Y() {
        AbstractC20826v0.m108774N0();
        C23744a.Companion.m124119a().m124116d(60060, new Object[0]);
        C7960e.m41971c6().m42250R3("1624");
        C7960e.m41971c6().m42250R3("1625");
        C7960e.m41971c6().m42250R3("1626");
        C7960e.m41971c6().m42299W3("1624");
        C7960e.m41971c6().m42299W3("1625");
        C7960e.m41971c6().m42299W3("1626");
        AbstractC20833z.m108894I();
        C28023b6.m141250h0().m141381t();
    }

    /* renamed from: a0 */
    private final C3054x m98088a0(C19590b c19590b) {
        int i11;
        int i12;
        String m118743r0;
        String m118743r02;
        String m118743r03;
        C3054x c3054x = new C3054x(false, 1, null);
        if (c19590b.m102557k()) {
            if (C23212s8.m119602i()) {
                i11 = AbstractC16803z.ic_story_archive_empty_state_dark;
            } else {
                i11 = AbstractC16803z.ic_story_archive_empty_state;
            }
        } else if (C23212s8.m119602i()) {
            i11 = AbstractC23322a.zds_il_no_connection_dark_spot_1_1;
        } else {
            i11 = AbstractC23322a.zds_il_no_connection_light_spot_1_1;
        }
        c3054x.m14657O(i11);
        if (c19590b.m102557k()) {
            i12 = 2;
        } else {
            i12 = 1;
        }
        c3054x.m14664V(i12);
        if (c19590b.m102557k()) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_empty_state_title);
        } else if (c19590b.m102549c() == 50001) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_error_network_state_title);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_error_general_state_title);
        }
        c3054x.m14666X(m118743r0);
        if (c19590b.m102557k()) {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_empty_state_desc);
        } else if (c19590b.m102549c() == 50001) {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_error_network_state_desc);
        } else {
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_error_general_state_desc);
        }
        c3054x.m14650H(m118743r02);
        if (c19590b.m102557k()) {
            m118743r03 = "";
        } else {
            m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_error_state_prompt);
        }
        c3054x.m14667Y(m118743r03);
        c3054x.m14652J(!c19590b.m102557k());
        return c3054x;
    }

    /* renamed from: e0 */
    private final List m98089e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19589a(1, null, false, null, null, 0, 0, null, false, 510, null));
        arrayList.add(new C19589a(6, null, false, null, null, 0, 0, null, false, 510, null));
        return arrayList;
    }

    /* renamed from: k0 */
    private final boolean m98090k0() {
        return ((Boolean) this.f93380K.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m98091q0(C19590b c19590b) {
        m98079N0(c19590b);
        if (!c19590b.m102552f().isEmpty()) {
            synchronized (C18578b.f93336a.m98050h()) {
                this.f93387v.mo9224q(m98075C0(c19590b.m102552f(), c19590b.m102554h(), c19590b.m102548b(), c19590b.m102547a()));
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
        this.f93386u.mo9224q(new C19964c(C24848g0.f119245a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final void m98092r0(C19590b c19590b) {
        List m102552f;
        List m131225y0;
        int i11 = !c19590b.m102555i() ? 1 : 0;
        int m102549c = c19590b.m102549c();
        if (c19590b.m102557k()) {
            m98079N0(c19590b);
            if (c19590b.m102553g() != -1) {
                this.f93381L = c19590b.m102553g();
            }
            C18578b c18578b = C18578b.f93336a;
            synchronized (c18578b.m98050h()) {
                try {
                    if (c19590b.m102556j()) {
                        if (c19590b.m102555i()) {
                            m131225y0 = AbstractC25332a0.m131225y0(c19590b.m102552f());
                            m102552f = AbstractC25332a0.m131222v0(m131225y0, c18578b.m98055m());
                        } else {
                            m102552f = AbstractC25332a0.m131222v0(c18578b.m98055m(), c19590b.m102552f());
                        }
                    } else {
                        m102552f = c19590b.m102552f();
                    }
                    if (m102552f.isEmpty()) {
                        this.f93388w.mo9224q(m98088a0(c19590b));
                    } else {
                        this.f93387v.mo9224q(m98075C0(m102552f, c19590b.m102554h(), c19590b.m102548b(), c19590b.m102547a()));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c19590b.m102556j()) {
                this.f93373D.mo9224q(new C18577a(0, i11, m102549c));
            }
            m98076D0(this.f93379J);
            return;
        }
        if (m98094v0()) {
            this.f93388w.mo9224q(m98088a0(c19590b));
        } else if (c19590b.m102556j()) {
            this.f93373D.mo9224q(new C18577a(2, i11, m102549c));
        } else {
            this.f93390y.mo9224q(new C19964c(C24848g0.f119245a));
            this.f93389x.mo9224q(new C19964c(Boolean.FALSE));
        }
    }

    /* renamed from: u0 */
    private final void m98093u0(C8763a c8763a) {
        String m46905b;
        if (c8763a != null) {
            String str = "";
            if (AbstractC19074t.m100204b(c8763a.m46905b(), "0")) {
                m46905b = "";
            } else {
                m46905b = c8763a.m46905b();
            }
            this.f93379J = m46905b;
            int m46906c = c8763a.m46906c();
            if (m46906c != 1) {
                if (m46906c != 2) {
                    if (m46906c != 3) {
                        if (m46906c == 4) {
                            str = "notif_outapp";
                        }
                    } else {
                        str = "notif_inapp";
                    }
                } else {
                    str = "snackbar";
                }
            } else {
                str = "social_profile_quick_access";
            }
            String str2 = str;
            if (str2.length() > 0) {
                C0815e1.m2075D().m2100V(new C23648e(29, str2, 1, "archive_view", new String[0]), false);
            }
            this.f93381L = c8763a.m46904a();
        }
    }

    /* renamed from: v0 */
    private final boolean m98094v0() {
        List m98055m;
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            m98055m = c18578b.m98055m();
        }
        return m98055m.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m98095x0(C18587k c18587k) {
        AbstractC19074t.m100208f(c18587k, "this$0");
        c18587k.f93385t.m98051i();
    }

    /* renamed from: z0 */
    private final void m98096z0(String str) {
        this.f93385t.m98062t(2);
        this.f93387v.mo9224q(m98089e0());
        this.f93385t.m98054l(str, false, true);
        this.f93385t.m98054l(str, true, false);
    }

    /* renamed from: A0 */
    public final void m98097A0() {
        this.f93380K.reset();
        this.f93372C.mo9224q(100L);
    }

    /* renamed from: B0 */
    public void m98098B0(C8763a c8763a) {
        super.m103748N(c8763a);
        m98093u0(c8763a);
        m98077L0();
        m98085U();
    }

    /* renamed from: E0 */
    public final void m98099E0(boolean z11) {
        this.f93377H = z11;
    }

    /* renamed from: F0 */
    public final void m98100F0(boolean z11) {
        this.f93378I = z11;
    }

    /* renamed from: G0 */
    public final void m98101G0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f93375F = str;
    }

    /* renamed from: I0 */
    public final void m98102I0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f93376G = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        super.mo9130J();
        m98078M0();
    }

    /* renamed from: J0 */
    public final void m98103J0() {
        JSONObject jSONObject = new JSONObject();
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            jSONObject.put("tt", this.f93381L);
            jSONObject.put("tl", c18578b.m98055m().size());
            jSONObject.put("i", this.f93382M);
            jSONObject.put("scroll", this.f93383N);
        }
        C0815e1.m2075D().m2100V(new C23648e(29, "", 1, "archive_view_total", jSONObject.toString()), false);
    }

    /* renamed from: K0 */
    public final void m98104K0(int i11) {
        JSONObject jSONObject = new JSONObject();
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            jSONObject.put("tt", this.f93381L);
            jSONObject.put("tl", c18578b.m98055m().size());
            jSONObject.put("ts", i11);
        }
        C0815e1.m2075D().m2100V(new C23648e(29, "story_archive", 1, "archive_story_view", jSONObject.toString()), false);
    }

    /* renamed from: O0 */
    public final void m98105O0(int i11, boolean z11) {
        this.f93382M = i11 + 1;
        this.f93383N = z11;
    }

    /* renamed from: T */
    public final void m98106T() {
        if (this.f93379J.length() > 0) {
            m98096z0(this.f93379J);
        } else {
            m98124w0();
        }
    }

    /* renamed from: W */
    public final void m98107W() {
        this.f93385t.m98045c();
    }

    /* renamed from: X */
    public final void m98108X() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: er.j
            @Override // java.lang.Runnable
            public final void run() {
                C18587k.m98087Y();
            }
        });
    }

    /* renamed from: Z */
    public final void m98109Z(List list) {
        String str;
        String str2;
        String str3;
        int m131511r;
        int m131400e;
        int m116580c;
        Object m131205e0;
        Object m131216p0;
        Object m131205e02;
        Object m131205e03;
        Object m131205e04;
        AbstractC19074t.m100208f(list, "deletedStoryIdList");
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            try {
                if (!c18578b.m98058p().isEmpty()) {
                    m131205e04 = AbstractC25332a0.m131205e0(c18578b.m98058p());
                    str = ((C31980jc) m131205e04).f147023p;
                } else {
                    str = "";
                }
                if (!c18578b.m98058p().isEmpty()) {
                    m131205e03 = AbstractC25332a0.m131205e0(c18578b.m98058p());
                    str2 = ((C31980jc) m131205e03).f147024q;
                } else {
                    str2 = "";
                }
                if (!c18578b.m98058p().isEmpty()) {
                    m131205e02 = AbstractC25332a0.m131205e0(c18578b.m98058p());
                    str3 = ((C31980jc) m131205e02).f147025r;
                } else {
                    str3 = "";
                }
                List list2 = list;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                m131400e = AbstractC25361o0.m131400e(m131511r);
                m116580c = AbstractC22543l.m116580c(m131400e, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
                for (Object obj : list2) {
                    linkedHashMap.put(obj, (String) obj);
                }
                List m98055m = C18578b.f93336a.m98055m();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m98055m) {
                    if (!linkedHashMap.containsKey(((C32123ta) obj2).f148138h)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    m131205e0 = AbstractC25332a0.m131205e0(arrayList);
                    String str4 = ((C32123ta) m131205e0).f148138h;
                    AbstractC19074t.m100207e(str4, "storyId");
                    this.f93375F = str4;
                    m131216p0 = AbstractC25332a0.m131216p0(arrayList);
                    String str5 = ((C32123ta) m131216p0).f148138h;
                    AbstractC19074t.m100207e(str5, "storyId");
                    this.f93376G = str5;
                }
                this.f93385t.m98047e(list);
                AbstractC19074t.m100205c(str);
                AbstractC19074t.m100205c(str2);
                AbstractC19074t.m100205c(str3);
                List m98075C0 = m98075C0(arrayList, str, str2, str3);
                if (C18578b.f93336a.m98055m().isEmpty()) {
                    m98124w0();
                } else {
                    this.f93387v.mo9224q(m98075C0);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b0 */
    public final LiveData m98110b0() {
        return this.f93388w;
    }

    /* renamed from: c0 */
    public final LiveData m98111c0() {
        return this.f93373D;
    }

    /* renamed from: f0 */
    public final LiveData m98112f0() {
        return this.f93370A;
    }

    /* renamed from: g0 */
    public final LiveData m98113g0() {
        return this.f93374E;
    }

    /* renamed from: h0 */
    public final LiveData m98114h0() {
        return this.f93391z;
    }

    /* renamed from: i0 */
    public final LiveData m98115i0() {
        return this.f93372C;
    }

    /* renamed from: j0 */
    public final LiveData m98116j0() {
        return this.f93371B;
    }

    /* renamed from: l0 */
    public final LiveData m98117l0() {
        return this.f93389x;
    }

    /* renamed from: m0 */
    public final LiveData m98118m0() {
        return this.f93390y;
    }

    /* renamed from: n0 */
    public final LiveData m98119n0() {
        return this.f93387v;
    }

    /* renamed from: o0 */
    public final int m98120o0(C32123ta c32123ta) {
        int i11 = -1;
        if (c32123ta == null) {
            return -1;
        }
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            Integer num = (Integer) c18578b.m98056n().get(c32123ta.f148138h);
            if (num != null) {
                i11 = num.intValue();
            }
        }
        return i11;
    }

    /* renamed from: p0 */
    public final LiveData m98121p0() {
        return this.f93386u;
    }

    /* renamed from: s0 */
    public final void m98122s0(C32123ta c32123ta) {
        int i11;
        if (c32123ta != null) {
            C18578b c18578b = C18578b.f93336a;
            synchronized (c18578b.m98050h()) {
                Integer num = (Integer) c18578b.m98056n().get(c32123ta.f148138h);
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = -1;
                }
            }
            if (i11 != -1) {
                this.f93370A.mo9224q(new C19964c(Integer.valueOf(i11)));
            }
        }
    }

    /* renamed from: t0 */
    public final void m98123t0(int i11) {
        C18578b c18578b = C18578b.f93336a;
        synchronized (c18578b.m98050h()) {
            C32123ta c32123ta = (C32123ta) c18578b.m98055m().get(i11);
            C1761c0 c1761c0 = this.f93391z;
            int i12 = c18578b.m98052j().get(i11);
            String str = c32123ta.f148138h;
            AbstractC19074t.m100207e(str, "storyId");
            c1761c0.mo9224q(new C18589m(i12, str, this.f93377H, this.f93378I));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tt", this.f93381L);
            jSONObject.put("tl", c18578b.m98055m().size());
            jSONObject.put("i", i11 + 1);
            C0815e1.m2075D().m2100V(new C23648e(29, "story_archive", 0, "archive_click", jSONObject.toString()), false);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: w0 */
    public final void m98124w0() {
        if (m98094v0()) {
            this.f93387v.mo9224q(m98089e0());
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: er.i
            @Override // java.lang.Runnable
            public final void run() {
                C18587k.m98095x0(C18587k.this);
            }
        }, 200L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y0 */
    public final void m98125y0(boolean z11, int i11) {
        boolean z12;
        String str;
        this.f93385t.m98062t(1);
        if (i11 == -1) {
            z12 = 1;
        } else {
            z12 = 0;
        }
        int i12 = !z12;
        if (z11) {
            if (z12 != 0) {
                str = this.f93375F;
            } else {
                str = this.f93376G;
            }
            if ((z12 != 0 && this.f93377H) || (z12 == 0 && this.f93378I)) {
                this.f93373D.mo9224q(new C18577a(1, i12, 0));
                this.f93379J = "";
                this.f93385t.m98054l(str, z12, false);
                return;
            }
            return;
        }
        if (!m98094v0() && C23055e5.m118273h(false, 1, null)) {
            this.f93389x.mo9224q(new C19964c(Boolean.TRUE));
        }
        this.f93379J = "";
        this.f93385t.m98054l("0", z12, false);
    }
}
