package iq;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.text.TextUtils;
import bo.C2961d1;
import bo.C2966e1;
import bo.C2972f2;
import bo.C2973f3;
import bo.C2977g2;
import bo.C3000l0;
import bo.C3010n0;
import bo.C3019p;
import bo.C3020p0;
import bo.C3054x;
import bo.InterfaceC2946a1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalocore.CoreUtility;
import fi.C18953k;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import io.C20637a;
import iq.AbstractC20677f;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mq.C23419a;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p055ce.C3433b;
import p055ce.C3445n;
import p055ce.EnumC3440i;
import p111du.AbstractC18069a;
import p131ei.C18434b;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p187gk.C19464a;
import p205hc.AbstractC19962a;
import p302ko.C21785g;
import p304ks.C21927m;
import p331lq.C22637a;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p368nq.C23927b;
import p426pp.C24902e;
import p426pp.C24903f;
import p492rr.C25973p;
import p691yr.AbstractC31052b;
import p691yr.C31060j;
import p691yr.EnumC31051a;
import p716zh.C31862c;
import p716zh.C32002l4;
import p716zh.C32065p8;
import tr.C26878b;
import vg.C28203u6;

/* renamed from: iq.f */
/* loaded from: classes4.dex */
public abstract class AbstractC20677f extends AbstractC19962a implements InterfaceC20650a {

    /* renamed from: A */
    protected C21785g f101652A;

    /* renamed from: B */
    protected boolean f101653B;

    /* renamed from: C */
    protected boolean f101654C;

    /* renamed from: D */
    protected boolean f101655D;

    /* renamed from: E */
    protected List f101656E;

    /* renamed from: F */
    protected final Object f101657F;

    /* renamed from: G */
    C31862c f101658G;

    /* renamed from: H */
    C31862c f101659H;

    /* renamed from: I */
    C31862c f101660I;

    /* renamed from: J */
    C18434b.d f101661J;

    /* renamed from: K */
    private final InterfaceC20094a f101662K;

    /* renamed from: L */
    protected List f101663L;

    /* renamed from: M */
    protected final Object f101664M;

    /* renamed from: N */
    protected String f101665N;

    /* renamed from: O */
    protected C23419a f101666O;

    /* renamed from: P */
    protected C22637a f101667P;

    /* renamed from: t */
    protected int f101668t;

    /* renamed from: u */
    protected boolean f101669u;

    /* renamed from: v */
    protected boolean f101670v;

    /* renamed from: w */
    protected ArrayList f101671w;

    /* renamed from: x */
    protected boolean f101672x;

    /* renamed from: y */
    private boolean f101673y;

    /* renamed from: z */
    private final InterfaceC20656b f101674z;

    /* renamed from: iq.f$a */
    /* loaded from: classes4.dex */
    class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                AbstractC20677f.this.f101674z.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                AbstractC20677f.this.f101674z.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC20677f.this.f101674z.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
                AbstractC20677f.this.f101674z.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.f$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C2961d1 f101676a;

        b(C2961d1 c2961d1) {
            this.f101676a = c2961d1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m107797e(List list, boolean z11) {
            try {
                AbstractC20677f.this.mo107787rq(list, z11, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m107798f(C2961d1 c2961d1) {
            c2961d1.m14025g(false);
            AbstractC20677f.this.m107766Pp(c2961d1);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                AbstractC20677f abstractC20677f = AbstractC20677f.this;
                JSONObject m101785d = C19464a.m101785d(abstractC20677f.f101665N, abstractC20677f.m107775aq());
                final List m107759tq = AbstractC20677f.this.m107759tq(m101785d);
                final boolean m107779fq = AbstractC20677f.this.m107779fq(m101785d);
                if (m107759tq != null) {
                    ((InterfaceC20656b) AbstractC20677f.this.m103742Dp()).mo70710wy(new Runnable() { // from class: iq.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC20677f.b.this.m107797e(m107759tq, m107779fq);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                InterfaceC20656b interfaceC20656b = (InterfaceC20656b) AbstractC20677f.this.m103742Dp();
                final C2961d1 c2961d1 = this.f101676a;
                interfaceC20656b.mo70710wy(new Runnable() { // from class: iq.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC20677f.b.this.m107798f(c2961d1);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.f$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m107800d(Object obj) {
            try {
                AbstractC20677f.this.mo107787rq(AbstractC20677f.this.m107759tq((JSONObject) obj), AbstractC20677f.this.m107779fq((JSONObject) obj), false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20677f abstractC20677f = AbstractC20677f.this;
            abstractC20677f.f101653B = false;
            C19464a.m101789h(abstractC20677f.f101665N, new JSONObject().toString(), AbstractC20677f.this.m107775aq());
            AbstractC20677f.this.f101666O.m123081i().m14025g(false);
            AbstractC20677f.this.m107790vq();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(final Object obj) {
            try {
                C19464a.m101789h(AbstractC20677f.this.f101665N, obj.toString(), AbstractC20677f.this.m107775aq());
                ((InterfaceC20656b) AbstractC20677f.this.m103742Dp()).mo70710wy(new Runnable() { // from class: iq.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC20677f.c.this.m107800d(obj);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC20677f.this.f101653B = false;
        }
    }

    public AbstractC20677f(InterfaceC20656b interfaceC20656b) {
        super(interfaceC20656b);
        boolean z11;
        this.f101668t = 0;
        this.f101670v = false;
        this.f101671w = new ArrayList();
        if (AbstractC23309i.m122540wf() && AbstractC0924m0.m3278N9()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f101672x = z11;
        this.f101654C = false;
        this.f101655D = false;
        this.f101657F = new Object();
        this.f101661J = new C18434b.d() { // from class: iq.c
            @Override // p131ei.C18434b.d
            /* renamed from: a */
            public final void mo47509a(int i11, List list) {
                AbstractC20677f.this.m107756nq(i11, list);
            }
        };
        this.f101662K = new c();
        this.f101663L = Collections.synchronizedList(new ArrayList());
        this.f101664M = new Object();
        this.f101665N = "";
        this.f101666O = new C23419a();
        this.f101667P = new C22637a();
        this.f101652A = C21785g.m112430F0();
        this.f101674z = interfaceC20656b;
    }

    /* renamed from: cq */
    private void m107754cq(String str) {
        try {
            if (this.f101653B) {
                return;
            }
            this.f101653B = true;
            this.f101652A.mo112374p(str, this.f101662K);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kq */
    private boolean m107755kq() {
        if (!TextUtils.isEmpty(this.f101665N) && this.f101665N.equals(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nq */
    public /* synthetic */ void m107756nq(int i11, List list) {
        try {
            m107793yq(i11, list);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oq */
    public /* synthetic */ void m107757oq(int i11, InterfaceC2946a1 interfaceC2946a1) {
        ((InterfaceC20656b) m103742Dp()).mo82923AE(i11, interfaceC2946a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pq */
    public /* synthetic */ void m107758pq(C31862c c31862c) {
        m107767Qp(c31862c);
        mo107650fc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tq */
    public List m107759tq(JSONObject jSONObject) {
        JSONArray m96090i;
        String str;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            try {
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "data");
                if (m96091j != null && (m96090i = AbstractC18069a.m96090i(m96091j, "quick_access")) != null) {
                    for (int i11 = 0; i11 < m96090i.length(); i11++) {
                        C23927b c23927b = new C23927b(m96090i.getJSONObject(i11));
                        if (c23927b.f115598b.equals("action.open.story_archive")) {
                            if (c23927b.f115597a.isEmpty()) {
                                str = "{}";
                            } else {
                                str = c23927b.f115597a;
                            }
                            JSONObject jSONObject2 = new JSONObject(str);
                            jSONObject2.put("source", 1);
                            c23927b.f115597a = jSONObject2.toString();
                        }
                        arrayList.add(c23927b);
                    }
                }
            } catch (JSONException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Aq */
    public void m107760Aq(boolean z11) {
        this.f101673y = z11;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Bl */
    public void mo107635Bl(long j11) {
        List<C3020p0> m108769L = AbstractC20826v0.m108769L(j11, this.f101671w);
        if (!m108769L.isEmpty()) {
            Iterator it = this.f101671w.iterator();
            while (it.hasNext()) {
                C3000l0 c3000l0 = (C3000l0) it.next();
                for (C3020p0 c3020p0 : m108769L) {
                    if (c3020p0 != null) {
                        c3000l0.m14345m1(c3020p0.f12057p);
                    }
                }
                if (c3000l0.f11899s.isEmpty()) {
                    it.remove();
                }
            }
            mo107650fc();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Bq */
    public void m107761Bq(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f101668t = i11;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: C6 */
    public boolean mo107636C6() {
        return this.f101673y;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Ch */
    public int mo107637Ch(String str) {
        if (str == null) {
            return -1;
        }
        for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
            if (((C3000l0) this.f101671w.get(i11)).m14329e0(str) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Cq */
    public void m107762Cq(ContactProfile contactProfile, C3019p c3019p) {
        boolean m17341b;
        boolean z11;
        String str;
        if (m107755kq()) {
            m17341b = C3445n.m17342c();
        } else {
            m17341b = C3445n.m17341b(contactProfile.f42434r);
        }
        c3019p.m14449o(m17341b);
        C3433b m40364F = contactProfile.m40364F();
        if (m40364F != null && m40364F.m17250c() == EnumC3440i.f14449r.m17294c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (contactProfile.m40357A0() && C3445n.m17343d(contactProfile.f42434r) && !z11 && m40364F != null) {
            str = m40364F.m17251d();
        } else {
            str = "";
        }
        c3019p.m14445k(str);
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Df */
    public void mo107639Df(ProfileAlbumItem profileAlbumItem) {
        if (profileAlbumItem == null) {
            return;
        }
        List m108769L = AbstractC20826v0.m108769L(profileAlbumItem.m46300c().m46277e(), this.f101671w);
        if (!m108769L.isEmpty()) {
            for (int i11 = 0; i11 < m108769L.size(); i11++) {
                C3020p0 c3020p0 = (C3020p0) m108769L.get(i11);
                if (c3020p0 != null) {
                    c3020p0.f12023C.f12106O.m13967j(profileAlbumItem.m46300c().m46286n());
                    c3020p0.f12023C.f12106O.m13965h(profileAlbumItem.m46300c().m46285m());
                    c3020p0.f12023C.f12106O.m13966i(profileAlbumItem.m46300c().m46273a());
                    c3020p0.f12042V = profileAlbumItem.m46300c().m46282j();
                }
            }
            mo107650fc();
        }
    }

    /* renamed from: Dq */
    protected void m107763Dq(boolean z11) {
        String str;
        String str2;
        synchronized (this.f101657F) {
            try {
                if (this.f101656E != null) {
                    boolean equals = TextUtils.equals(this.f101665N, CoreUtility.f89233i);
                    for (C23927b c23927b : this.f101656E) {
                        boolean z12 = true;
                        if ((!CoreUtility.f89233i.equals(this.f101665N) && z11) || c23927b.f115601e <= 0) {
                            c23927b.f115606j = true;
                        }
                        boolean z13 = false;
                        if (m107784lq(c23927b)) {
                            C2972f2 m108783S = AbstractC20826v0.m108783S();
                            if (m108783S != null && m108783S.m14062a() && !m108783S.m14063b() && !m108783S.m14064c() && equals) {
                                z13 = true;
                            }
                            c23927b.f115604h = z13;
                            c23927b.f115605i = AbstractC20826v0.m108814i0();
                            c23927b.f115606j = true;
                            if (z13) {
                                if (!TextUtils.isEmpty(m108783S.f11747e)) {
                                    c23927b.f115602f = m108783S.f11747e;
                                }
                                if (!TextUtils.isEmpty(m108783S.f11748f)) {
                                    c23927b.f115600d = m108783S.f11748f;
                                }
                                if (AbstractC18458a.f93019a.equals("vi")) {
                                    str = m108783S.f11743a;
                                } else {
                                    str = m108783S.f11744b;
                                }
                                c23927b.f115603g = str;
                                if (AbstractC18458a.f93019a.equals("vi")) {
                                    str2 = m108783S.f11745c;
                                } else {
                                    str2 = m108783S.f11746d;
                                }
                                c23927b.f115599c = str2;
                            }
                        } else if (m107785mq(c23927b)) {
                            C2973f3 m108798a0 = AbstractC20826v0.m108798a0();
                            if (m108798a0 == null || m108798a0.m14071d() || !equals) {
                                z12 = false;
                            }
                            c23927b.f115604h = z12;
                            c23927b.f115605i = AbstractC20826v0.m108814i0();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: El */
    public void mo107642El(C3020p0 c3020p0, int i11, C32002l4 c32002l4) {
        AbstractC20697j.m107829f(this, c3020p0, i11, c32002l4);
    }

    /* renamed from: Eq */
    public void m107764Eq() {
        try {
            final C31862c m107777dq = m107777dq();
            long j11 = 0;
            if (m107777dq != null && m107777dq.f146333z != null) {
                if (m107777dq.f146333z.f146219f - (C23793c.m124316k().mo124311f() / 1000) == 1) {
                    j11 = 2000;
                }
            }
            ((InterfaceC20656b) m103742Dp()).mo78955kl(new Runnable() { // from class: iq.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20677f.this.m107758pq(m107777dq);
                }
            }, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: H6 */
    public boolean mo107643H6() {
        return this.f101672x;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: H9 */
    public C20637a mo107644H9(C3000l0 c3000l0, boolean z11) {
        C3020p0 c3020p0;
        C20637a c20637a = new C20637a();
        c20637a.m107548l(c3000l0);
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        c20637a.m107549m(c3020p0);
        c20637a.m107552p(z11);
        return c20637a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Op */
    public void m107765Op(C3019p c3019p) {
        c3019p.f12020k = m107755kq();
        this.f101666O.m123083k(c3019p);
        m107790vq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Pp */
    public void m107766Pp(C2961d1 c2961d1) {
        this.f101666O.m123088p(c2961d1);
        m107790vq();
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Q2 */
    public void mo107645Q2(C3020p0 c3020p0, C32002l4 c32002l4) {
        AbstractC20697j.m107827d(this, c3020p0, c32002l4);
    }

    /* renamed from: Qp */
    protected void m107767Qp(C31862c c31862c) {
        this.f101666O.m123089q(c31862c);
        m107790vq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Rp */
    public void m107768Rp(C3054x c3054x) {
        this.f101667P.m117206h(c3054x);
        m107790vq();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Sp */
    public void m107769Sp(C3010n0 c3010n0) {
        this.f101667P.m117208j(c3010n0);
        mo107650fc();
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: T7 */
    public void mo107646T7(C3000l0 c3000l0) {
        AbstractC20697j.m107828e(this, c3000l0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Tp */
    public void m107770Tp(C2977g2 c2977g2) {
        this.f101666O.m123096f(c2977g2);
        if (c2977g2.m14128b() == 5) {
            ((InterfaceC20656b) m103742Dp()).mo82947T();
        }
        m107790vq();
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: U6 */
    public void mo107647U6(C3000l0 c3000l0) {
        C3020p0 c3020p0;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3000l0 != null && c3020p0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(CoreUtility.f89233i);
            AbstractC20697j.m107824a(this, c3000l0, arrayList);
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Wh */
    public int mo107649Wh() {
        ArrayList arrayList = this.f101671w;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Wp */
    public void m107771Wp() {
        int i11;
        boolean m107782iq = m107782iq();
        this.f101667P.mo117197a(84);
        if (this.f101654C) {
            this.f101667P.mo117197a(78);
        }
        if (this.f101667P.m117198l().f11954a) {
            i11 = AbstractC23136l9.m118742r(25.0f);
        } else {
            i11 = 50;
        }
        int mo82937QE = this.f101674z.mo82937QE();
        int m118713h0 = AbstractC23136l9.m118713h0() + ((int) (AbstractC23136l9.m118713h0() * 0.5f));
        if (mo82937QE < m118713h0) {
            i11 = m118713h0 - mo82937QE;
        }
        this.f101667P.m117202d().m14725d(i11);
        if (this.f101667P.m117201c().m14646D()) {
            this.f101667P.m117202d().m14724c(C23212s8.m119606n(AbstractC16781w.ProfilePrimaryBackgroundColor));
        }
        if (!m107782iq) {
            this.f101667P.mo117197a(72);
        }
        if (i11 > 0) {
            this.f101667P.mo117197a(71);
        }
    }

    /* renamed from: Xp */
    public void m107772Xp() {
        this.f101672x = false;
        AbstractC0924m0.m2995Dg(false);
    }

    /* renamed from: Yp */
    public void mo107773Yp(String str) {
        try {
            if (!C23055e5.m118271f()) {
                return;
            }
            m107754cq(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Zp */
    protected abstract void mo107774Zp();

    /* renamed from: aq */
    int m107775aq() {
        if (TextUtils.equals(this.f101665N, CoreUtility.f89233i)) {
            return 4;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bq */
    public int m107776bq() {
        return this.f101668t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dq */
    public C31862c m107777dq() {
        C31862c c31862c = this.f101658G;
        return c31862c != null ? c31862c : this.f101660I;
    }

    /* renamed from: eq */
    public void m107778eq(String str) {
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            int m99337P = C18953k.m99337P(m141809c);
            int m99328E = C18953k.m99328E(m141809c);
            int m119306z = AbstractC23160o0.m119306z();
            boolean m98558u = C18644n.m98531l().m98558u(str);
            boolean contains = C21927m.m114302u().m114351p().contains(str);
            int m119234a0 = AbstractC23160o0.m119234a0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(12);
            arrayList.add(13);
            arrayList.add(14);
            C18434b.m97679l().m97687p(arrayList, str, new C18434b.c(m99337P, m99328E, m119306z, m98558u ? 1 : 0, contains ? 1 : 0, m119234a0), null, this.f101661J);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: fc */
    public void mo107650fc() {
        mo107774Zp();
        this.f101674z.mo82926Bp(this.f101663L, this.f101671w);
    }

    /* renamed from: fq */
    protected boolean m107779fq(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "data");
                if (m96091j != null) {
                    return C25973p.f123927a.m133794g(m96091j);
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: gq */
    public boolean m107780gq() {
        return this.f101655D;
    }

    /* renamed from: hq */
    public boolean m107781hq() {
        if (mo107649Wh() <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: iq */
    public boolean m107782iq() {
        if (this.f101666O.m123095e().m14128b() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: jq */
    public boolean m107783jq(C24902e c24902e) {
        C24903f m154689d = C32065p8.m154684c().m154689d();
        if (c24902e != null && m154689d != null && TextUtils.equals(c24902e.m129490f(), m154689d.m129502e()) && C32065p8.m154684c().m154691f()) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: kl */
    public void mo107652kl(C3020p0 c3020p0, int i11, String str) {
        String str2;
        String str3;
        if (c3020p0 != null) {
            try {
                if (c3020p0.f12057p != null && (str2 = c3020p0.f12022B.f12280b) != null && !str2.equals(CoreUtility.f89233i) && C23055e5.m118272g(true)) {
                    if (c3020p0.m14518m0()) {
                        str3 = "6";
                    } else {
                        str3 = "7";
                    }
                    String str4 = str3;
                    this.f101674z.mo46829Y();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new a());
                    c0766k.mo1787ya(c3020p0.f12022B.f12280b, str4, c3020p0.f12057p, "", i11, str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: lq */
    protected boolean m107784lq(C23927b c23927b) {
        return TextUtils.equals(c23927b.f115598b, "action.open.memorylist");
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: m3 */
    public int mo107653m3() {
        return this.f101667P.m117203e();
    }

    /* renamed from: mq */
    protected boolean m107785mq(C23927b c23927b) {
        return TextUtils.equals(c23927b.f115598b, "action.open.story_archive");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: qq */
    public void m107786qq() {
        if (this.f101656E == null) {
            C2961d1 c2961d1 = new C2961d1();
            c2961d1.m14024f(true);
            m107766Pp(c2961d1);
            C0824j.m2153b(new b(c2961d1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: rq */
    public void mo107787rq(List list, boolean z11, boolean z12) {
        this.f101656E = Collections.synchronizedList(list);
        m107763Dq(z11);
        C2961d1 c2961d1 = new C2961d1(this.f101656E);
        List list2 = this.f101656E;
        if (list2 != null) {
            int i11 = 0;
            if (list2.isEmpty()) {
                c2961d1.m14025g(false);
            }
            if (this.f101656E.size() == 2) {
                i11 = 1;
            }
            c2961d1.m14023e(i11);
        }
        m107766Pp(c2961d1);
    }

    /* renamed from: sq */
    protected void mo107788sq(String str) {
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: te */
    public void mo107658te(final InterfaceC2946a1 interfaceC2946a1) {
        synchronized (this.f101664M) {
            for (final int i11 = 0; i11 < this.f101663L.size(); i11++) {
                try {
                    C3020p0 c3020p0 = ((C2966e1) this.f101663L.get(i11)).f11704b;
                    if (c3020p0 != null && interfaceC2946a1 != null && interfaceC2946a1.mo13947I().equals(c3020p0.f12057p)) {
                        ((InterfaceC20656b) m103742Dp()).mo70710wy(new Runnable() { // from class: iq.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC20677f.this.m107757oq(i11, interfaceC2946a1);
                            }
                        });
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: uq */
    public void m107789uq(C23927b c23927b, C32002l4 c32002l4) {
        if (!TextUtils.isEmpty(c23927b.f115597a) && c23927b.f115598b.equals("action.open.story_archive")) {
            try {
                JSONObject jSONObject = new JSONObject(c23927b.f115597a);
                jSONObject.put("total", c23927b.f115601e);
                c23927b.f115597a = jSONObject.toString();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        ((InterfaceC20656b) m103742Dp()).mo82959Vr(c23927b.f115598b, 7, c23927b.f115597a, c32002l4, c23927b.f115608l);
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: v3 */
    public void mo107659v3(C3020p0 c3020p0, C32002l4 c32002l4, int i11, int i12, int i13) {
        EnumC31051a m150915b = C31060j.m150915b(c3020p0);
        if (AbstractC31052b.m150889b(m150915b)) {
            ((InterfaceC20656b) m103742Dp()).mo82990lp(c3020p0, c32002l4, i11, i12, i13);
            C31060j.f143193a.m150942h();
        } else if (AbstractC31052b.m150888a(m150915b)) {
            ((InterfaceC20656b) m103742Dp()).mo82963X1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: vq */
    public void m107790vq() {
        mo107774Zp();
        this.f101674z.mo82926Bp(this.f101663L, this.f101671w);
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: wl */
    public void mo107660wl(int i11, C3000l0 c3000l0) {
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14322a0() != null) {
                    C3020p0 m14322a0 = c3000l0.m14322a0();
                    if (i11 != 3) {
                        switch (i11) {
                            case 8:
                                AbstractC23647d.m123906p("6511");
                                this.f101674z.mo82956VB(c3000l0);
                                AbstractC23647d.m123893c();
                                break;
                            case 9:
                                if (!m14322a0.m14494Y()) {
                                    AbstractC23647d.m123906p("7512");
                                    this.f101674z.mo82951Ts(m14322a0);
                                    AbstractC23647d.m123893c();
                                    break;
                                }
                                break;
                            case 10:
                                if (m14322a0 != null && m14322a0.m14482K()) {
                                    if (m14322a0.f12022B.f12280b.equals(CoreUtility.f89233i)) {
                                        this.f101674z.mo82984ik(m14322a0);
                                        break;
                                    } else {
                                        this.f101674z.mo83003x6(c3000l0);
                                        break;
                                    }
                                }
                                break;
                            case 11:
                                boolean m14494Y = m14322a0.m14494Y();
                                boolean m122305q2 = AbstractC23309i.m122305q2();
                                if (m14494Y && m122305q2) {
                                    C26878b.f127183a.m138453e(c3000l0, m14322a0);
                                    this.f101674z.mo82206ad(m14322a0, c3000l0, false);
                                    break;
                                }
                                break;
                        }
                    } else {
                        AbstractC23647d.m123906p("6513");
                        this.f101674z.m107746c1(m14322a0);
                        AbstractC23647d.m123893c();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: wq */
    public void m107791wq(String str, C3020p0 c3020p0) {
        if (c3020p0 != null && str != null) {
            Iterator it = this.f101671w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3000l0 c3000l0 = (C3000l0) it.next();
                if (c3000l0.f11895q.equals(str)) {
                    c3000l0.m14345m1(c3020p0.f12057p);
                    if (c3000l0.m14375y0()) {
                        it.remove();
                    }
                }
            }
            mo107788sq(c3020p0.f12057p);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: xq */
    public void m107792xq(int i11) {
        mo107774Zp();
        this.f101674z.mo82953U6(this.f101663L, this.f101671w, i11);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0021. Please report as an issue. */
    /* renamed from: yq */
    void m107793yq(int i11, List list) {
        switch (i11) {
            case 12:
                this.f101658G = null;
                break;
            case 13:
                this.f101659H = null;
                break;
            case 14:
                this.f101660I = null;
                break;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31862c c31862c = (C31862c) it.next();
            if (c31862c != null) {
                switch (c31862c.f146308a) {
                    case 12:
                        if (this.f101658G == null) {
                            this.f101658G = c31862c;
                            break;
                        }
                        break;
                    case 13:
                        if (this.f101659H == null) {
                            this.f101659H = c31862c;
                            break;
                        }
                        break;
                    case 14:
                        if (this.f101660I == null) {
                            this.f101660I = c31862c;
                            break;
                        }
                        break;
                }
                m107764Eq();
            }
        }
    }

    /* renamed from: zq */
    public void m107794zq(boolean z11) {
        this.f101655D = z11;
    }
}
