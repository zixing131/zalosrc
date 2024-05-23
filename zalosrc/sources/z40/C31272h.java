package z40;

import ag0.AbstractC0837p0;
import ag0.C0809c1;
import ag0.C0815e1;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import b50.C2553a;
import b50.C2556d;
import c50.C3297h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.settings.C11128a;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import dg0.AbstractC17927b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p128ed.C18389d;
import p205hc.AbstractC19962a;
import p297kd.C21690e;
import p320ld.C22432d;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22442n;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p361nb.C23651h;
import p361nb.C23669z;
import p363nh.AbstractC23775p0;
import p420pb.C24709a;
import p421pc.C24720a;
import p484ri.C25804a;
import p484ri.C25806c;
import p525ti.C26701b;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import s00.AbstractC26084s;
import si.C26263i;
import z40.C31272h;

/* renamed from: z40.h */
/* loaded from: classes5.dex */
public final class C31272h extends AbstractC19962a implements InterfaceC31258a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f144292A;

    /* renamed from: B */
    private int f144293B;

    /* renamed from: C */
    private boolean f144294C;

    /* renamed from: D */
    private boolean f144295D;

    /* renamed from: t */
    private final C25806c f144296t;

    /* renamed from: u */
    private final C25804a f144297u;

    /* renamed from: v */
    private final C24720a f144298v;

    /* renamed from: w */
    private final InterfaceC24854k f144299w;

    /* renamed from: x */
    private final C26701b f144300x;

    /* renamed from: y */
    private String[] f144301y;

    /* renamed from: z */
    private int f144302z;

    /* renamed from: z40.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z40.h$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ boolean f144303a;

        /* renamed from: b */
        final /* synthetic */ C31272h f144304b;

        b(boolean z11, C31272h c31272h) {
            this.f144303a = z11;
            this.f144304b = c31272h;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Integer num;
            C23651h m123961i;
            C23669z c23669z;
            try {
                if (this.f144303a) {
                    if (this.f144304b.m152179Zp().containsKey("1") && (c23669z = (C23669z) this.f144304b.m152179Zp().get("1")) != null) {
                        c23669z.f114660g = false;
                        return;
                    }
                    return;
                }
                if (this.f144304b.m152179Zp().containsKey("1")) {
                    C23669z c23669z2 = (C23669z) this.f144304b.m152179Zp().get("1");
                    if (c23669z2 instanceof C23651h) {
                        if (((C23651h) c23669z2).f114659f == null || !((C23651h) c23669z2).m123964l() || ((C23651h) c23669z2).f114660g) {
                            return;
                        }
                        ((C23651h) c23669z2).f114660g = true;
                        String str = ((C23651h) c23669z2).f114659f[0];
                        if (str == null || str.length() == 0) {
                            str = "1";
                        }
                        ((C23651h) c23669z2).f114659f[0] = String.valueOf(Integer.parseInt(str) + 1);
                    }
                } else {
                    C2556d m12981o = C2556d.m12981o();
                    C11128a c11128a = (C11128a) this.f144304b.m103744Fp();
                    if (c11128a != null) {
                        num = Integer.valueOf(c11128a.m58224d());
                    } else {
                        num = null;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(num);
                    String[] m13000q = m12981o.m13000q("1", "3", sb2.toString());
                    if (m13000q == null || (m123961i = C23651h.m123961i(30, (String[]) Arrays.copyOf(m13000q, m13000q.length))) == null) {
                        return;
                    }
                    m123961i.f114656c = System.currentTimeMillis();
                    m123961i.f114654a = 3;
                    m123961i.f114655b = 1;
                    m123961i.f114657d = 30;
                    m123961i.f114660g = true;
                    this.f144304b.m152179Zp().put("1", m123961i);
                }
                C23669z c23669z3 = (C23669z) this.f144304b.m152179Zp().get("1");
                if (c23669z3 != null) {
                    C24709a.m128299t(MainApplication.Companion.m35500c()).m128305K(c23669z3);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z40.h$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f144306r;

        /* renamed from: s */
        final /* synthetic */ int f144307s;

        /* renamed from: t */
        final /* synthetic */ C7924a f144308t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, int i11, C7924a c7924a) {
            super(1);
            this.f144306r = z11;
            this.f144307s = i11;
            this.f144308t = c7924a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m152209d(C31272h c31272h, C7924a c7924a, boolean z11, int i11) {
            AbstractC19074t.m100208f(c31272h, "this$0");
            AbstractC19074t.m100208f(c7924a, "$backupInfoServer");
            if (((InterfaceC31260b) c31272h.m103742Dp()).mo45894h0()) {
                c31272h.m152174Sp(c7924a);
                c31272h.m152195pq(0);
                if (z11) {
                    if (!C22438j.m115948p(i11)) {
                        c31272h.m152199xq(c7924a, i11, true);
                    } else {
                        c31272h.m152206zq(c7924a, i11);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m152210e(C31272h c31272h, C7924a c7924a) {
            AbstractC19074t.m100208f(c31272h, "this$0");
            if (!((InterfaceC31260b) c31272h.m103742Dp()).mo45894h0()) {
                return;
            }
            AbstractC20110a.f98889a.mo104548a("get info success invalid", new Object[0]);
            c31272h.m152174Sp(c7924a);
            c31272h.m152195pq(1);
        }

        /* renamed from: c */
        public final void m152211c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                final C7924a c7924a = new C7924a(jSONObject);
                if (c7924a.m40975d()) {
                    C22447s.m116065x0(jSONObject);
                    C26263i.m135055u().m135092z0(c7924a, jSONObject.toString());
                    InterfaceC31260b interfaceC31260b = (InterfaceC31260b) C31272h.this.m103742Dp();
                    final C31272h c31272h = C31272h.this;
                    final boolean z11 = this.f144306r;
                    final int i11 = this.f144307s;
                    interfaceC31260b.mo70710wy(new Runnable() { // from class: z40.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            C31272h.c.m152209d(C31272h.this, c7924a, z11, i11);
                        }
                    });
                } else {
                    InterfaceC31260b interfaceC31260b2 = (InterfaceC31260b) C31272h.this.m103742Dp();
                    final C31272h c31272h2 = C31272h.this;
                    final C7924a c7924a2 = this.f144308t;
                    interfaceC31260b2.mo70710wy(new Runnable() { // from class: z40.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C31272h.c.m152210e(C31272h.this, c7924a2);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m152211c((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z40.h$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C7924a f144310r;

        /* renamed from: s */
        final /* synthetic */ boolean f144311s;

        /* renamed from: t */
        final /* synthetic */ int f144312t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C7924a c7924a, boolean z11, int i11) {
            super(2);
            this.f144310r = c7924a;
            this.f144311s = z11;
            this.f144312t = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m152213c(C31272h c31272h, int i11, C7924a c7924a, boolean z11, int i12) {
            AbstractC19074t.m100208f(c31272h, "this$0");
            try {
                if (!((InterfaceC31260b) c31272h.m103742Dp()).mo45894h0()) {
                    return;
                }
                if (i11 == 1001) {
                    c31272h.m152174Sp(c7924a);
                    c31272h.m152195pq(1);
                    if (z11 && !C22438j.m115948p(i12)) {
                        c31272h.m152199xq(null, i12, false);
                    }
                } else if (c7924a == null || !c7924a.m40975d()) {
                    c31272h.m152174Sp(c7924a);
                    c31272h.m152195pq(1);
                } else {
                    c31272h.m152174Sp(c7924a);
                    c31272h.m152195pq(0);
                    ((InterfaceC31260b) c31272h.m103742Dp()).mo58212u3();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* renamed from: b */
        public final void m152214b(final int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            InterfaceC31260b interfaceC31260b = (InterfaceC31260b) C31272h.this.m103742Dp();
            final C31272h c31272h = C31272h.this;
            final C7924a c7924a = this.f144310r;
            final boolean z11 = this.f144311s;
            final int i12 = this.f144312t;
            interfaceC31260b.mo70710wy(new Runnable() { // from class: z40.k
                @Override // java.lang.Runnable
                public final void run() {
                    C31272h.d.m152213c(C31272h.this, i11, c7924a, z11, i12);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m152214b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z40.h$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f144313q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31272h(InterfaceC31260b interfaceC31260b, C25806c c25806c, C25804a c25804a, C24720a c24720a) {
        super(interfaceC31260b);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC31260b, "mvpView");
        AbstractC19074t.m100208f(c25806c, "backupRestoreRepo");
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepo");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        this.f144296t = c25806c;
        this.f144297u = c25804a;
        this.f144298v = c24720a;
        m129210a = AbstractC24856m.m129210a(e.f144313q);
        this.f144299w = m129210a;
        this.f144300x = C26701b.Companion.m137270a();
        this.f144293B = 8;
        this.f144294C = true;
        this.f144295D = true;
    }

    /* renamed from: Aq */
    private final boolean m152164Aq() {
        if (this.f144296t.m133056r() == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public final void m152174Sp(C7924a c7924a) {
        if (c7924a != null && c7924a.m40975d()) {
            C22447s.m116032f(c7924a.f42886u, this.f144300x);
            ((InterfaceC31260b) m103742Dp()).mo58216z2(this.f144300x);
        } else {
            ((InterfaceC31260b) m103742Dp()).mo58180J2();
        }
        ((InterfaceC31260b) m103742Dp()).mo58197a4();
    }

    /* renamed from: Tp */
    private final boolean m152175Tp() {
        if (!this.f144298v.m128398O() || !C22447s.m116047m0(C26263i.m135058w(), false, 2, null)) {
            return false;
        }
        ((InterfaceC31260b) m103742Dp()).mo58183M();
        return true;
    }

    /* renamed from: Wp */
    private final void m152176Wp() {
        ((InterfaceC31260b) m103742Dp()).mo58178I0();
        C2556d.m12981o().m12984B();
    }

    /* renamed from: Xp */
    private final void m152177Xp() {
        ((InterfaceC31260b) m103742Dp()).mo58184M0();
    }

    /* renamed from: Yp */
    private final void m152178Yp() {
        ((InterfaceC31260b) m103742Dp()).mo58215z0();
        C22436h.f109760a.m115917l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zp */
    public final HashMap m152179Zp() {
        return (HashMap) this.f144299w.getValue();
    }

    /* renamed from: aq */
    private final int m152180aq(boolean z11) {
        return z11 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bq */
    public static final void m152181bq(int i11) {
        C26263i.m135055u().m135085r0(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cq */
    public static final void m152182cq(C31272h c31272h, C11128a c11128a) {
        AbstractC19074t.m100208f(c31272h, "this$0");
        AbstractC19074t.m100208f(c11128a, "$it");
        ((InterfaceC31260b) c31272h.m103742Dp()).mo58209s1(c11128a.m58223c(), c11128a.m58225e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dq */
    public static final void m152183dq(C31272h c31272h) {
        AbstractC19074t.m100208f(c31272h, "this$0");
        c31272h.m152205yq(15);
    }

    /* renamed from: eq */
    private final void m152184eq(boolean z11, int i11) {
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (!C22447s.m116017S(m135087t)) {
            this.f144296t.m133049i(new c(z11, i11, m135087t), new d(m135087t, z11, i11));
            m152195pq(2);
        } else {
            AbstractC19074t.m100205c(m135087t);
            m152174Sp(m135087t);
            m152195pq(0);
        }
    }

    /* renamed from: fq */
    private final void m152185fq() {
        ((InterfaceC31260b) m103742Dp()).mo58185M1();
    }

    /* renamed from: gq */
    private final boolean m152186gq() {
        if (C18389d.m97401a()) {
            m152185fq();
            return true;
        }
        m152177Xp();
        return false;
    }

    /* renamed from: hq */
    private final boolean m152187hq() {
        try {
            C22436h c22436h = C22436h.f109760a;
            if (c22436h.m115922r()) {
                ((InterfaceC31260b) m103742Dp()).mo58173C3(c22436h.m115924w());
                c22436h.m115925y();
                return true;
            }
            ((InterfaceC31260b) m103742Dp()).mo58215z0();
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: iq */
    private final void m152188iq(C21690e c21690e) {
        int m115997D = C22447s.m115997D(c21690e);
        int m115991A = C22447s.m115991A(c21690e, c21690e.f105269f);
        int m115993B = C22447s.m115993B(c21690e.f105269f);
        ((InterfaceC31260b) m103742Dp()).mo58177H1(C3297h.m16738h(C22442n.m115988d(m115993B, m115997D, 0, m115991A, c21690e.m111869G()), c21690e), C22447s.m116061v(m115997D, m115993B));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:11:0x0028, B:14:0x0032), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x000c, B:7:0x0016, B:11:0x0028, B:14:0x0032), top: B:2:0x0001 }] */
    /* renamed from: jq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m152189jq() {
        boolean z11;
        boolean z12;
        C2553a.a m13001r;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (C2556d.m12981o().m12998l() && (m13001r = C2556d.m12981o().m13001r()) != null) {
            if (!m13001r.m12947a()) {
                z11 = true;
                z12 = false;
                if (!z11) {
                    ((InterfaceC31260b) m103742Dp()).mo58179J0(z12);
                    return true;
                }
                ((InterfaceC31260b) m103742Dp()).mo58178I0();
                return false;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        z12 = true;
        if (!z11) {
        }
    }

    /* renamed from: kq */
    private final boolean m152190kq() {
        C21690e m133053o = this.f144296t.m133053o();
        if (m133053o == null || m133053o.m143172f() || m133053o.mo96995c()) {
            return false;
        }
        return true;
    }

    /* renamed from: lq */
    private final void m152191lq() {
        if (m152164Aq()) {
            this.f144296t.m133034N(0);
        }
    }

    /* renamed from: mq */
    private final boolean m152192mq(int i11, TargetBackupInfo targetBackupInfo) {
        if (!C22438j.m115946n(i11) || !this.f144298v.m128398O() || !C22447s.m116047m0(targetBackupInfo, false, 2, null)) {
            return false;
        }
        return true;
    }

    /* renamed from: nq */
    private final void m152193nq() {
        final C21690e m133053o = this.f144296t.m133053o();
        if (m133053o != null) {
            if (!m133053o.mo96995c()) {
                m133053o.m143173h(true);
                m133053o.m143176k(true);
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: z40.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C31272h.m152194oq(C31272h.this, m133053o);
                    }
                });
                return;
            }
            AbstractC20110a.f98889a.mo104548a("lastSyncSessionInfo is already canceled !!! Ignore", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oq */
    public static final void m152194oq(C31272h c31272h, C21690e c21690e) {
        AbstractC19074t.m100208f(c31272h, "this$0");
        AbstractC19074t.m100208f(c21690e, "$it");
        c31272h.f144296t.m133036P(c21690e.mo96996g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pq */
    public final void m152195pq(int i11) {
        AbstractC20110a.f98889a.mo104548a("onChangeBackupInfoState, state=" + i11, new Object[0]);
        C21690e m133053o = this.f144296t.m133053o();
        if (m133053o != null) {
            if (!m133053o.m143171e() && !m133053o.mo96995c()) {
                ((InterfaceC31260b) m103742Dp()).mo58208s0(true);
                if (i11 != 3 && m152197tq(m133053o)) {
                    i11 = 3;
                }
                ((InterfaceC31260b) m103742Dp()).mo58195Y0();
                if (m133053o.m143172f()) {
                    ((InterfaceC31260b) m103742Dp()).mo58202m2(C22442n.m115985a(m133053o));
                    m133053o.m111886X(true);
                } else {
                    m152188iq(m133053o);
                }
            } else {
                ((InterfaceC31260b) m103742Dp()).mo58208s0(false);
            }
        }
        ((InterfaceC31260b) m103742Dp()).mo58191R1(i11);
    }

    /* renamed from: rq */
    private final void m152196rq(String str, BaseZaloView baseZaloView) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC27218a m92692wK = baseZaloView.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C22447s.m116007J(0, 2, null, m92692wK, false, false, 48, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        hashMap.put("name", baseZaloView.m92652XI(AbstractC8020f0.str_change_account));
        hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_change_account));
        arrayList.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", baseZaloView.m92652XI(AbstractC8020f0.str_not_use_gdrvie_account));
        hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_not_use_gdrvie_account));
        arrayList.add(hashMap2);
        ((InterfaceC31260b) m103742Dp()).mo58188N3(str, arrayList);
    }

    /* renamed from: tq */
    private final boolean m152197tq(C21690e c21690e) {
        if (!c21690e.m143172f() && !c21690e.m143171e() && !c21690e.mo96995c()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vq */
    public static final void m152198vq() {
        C26263i.m135055u().m135085r0(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xq */
    public final void m152199xq(C7924a c7924a, int i11, boolean z11) {
        TargetBackupInfo m135059x = C26263i.m135059x(c7924a);
        if (z11 && m152192mq(i11, m135059x)) {
            this.f144302z = i11;
            this.f144294C = true;
            ((InterfaceC31260b) m103742Dp()).mo58203m3();
        } else {
            this.f144293B = i11;
            ((InterfaceC31260b) m103742Dp()).mo58207r0(i11, m135059x);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: A2 */
    public void mo152120A2() {
        AbstractC23647d.m123897g("5580107");
        this.f144297u.m132982A("", -2);
        ((InterfaceC31260b) m103742Dp()).mo58198g4("");
    }

    /* renamed from: Bq */
    public boolean m152200Bq() {
        if (!C22447s.m116055r() && !m152190kq() && !mo152153q0()) {
            return true;
        }
        return false;
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: C2 */
    public void mo152121C2() {
        ((InterfaceC31260b) m103742Dp()).mo58200j4(this.f144296t.m133023A());
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: F */
    public void mo152122F() {
        AbstractC26084s.m134268p(1, ((InterfaceC31260b) m103742Dp()).mo58205o0(), true);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: G1 */
    public void mo152123G1(boolean z11) {
        if (!((InterfaceC31260b) m103742Dp()).mo58194V0()) {
            return;
        }
        if (C26263i.m135053s()) {
            ((InterfaceC31260b) m103742Dp()).mo58175F();
            AbstractC23647d.m123897g("711301");
            AbstractC23647d.m123897g("711309");
        } else {
            this.f144295D = z11;
            if (!m152175Tp()) {
                mo152150o0();
            }
        }
        if (z11) {
            AbstractC26084s.m134269q(0, 112);
            C0815e1.m2079N(112, 1, 0, 0, 0);
        } else {
            C2556d.m12981o().m12990O("5", "");
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: G3 */
    public void mo152124G3() {
        C26263i.m135055u().m135082n();
        AbstractC23647d.m123897g("5811300");
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: I0 */
    public void mo152125I0() {
        if (!this.f144298v.m128395L()) {
            ((InterfaceC31260b) m103742Dp()).mo58187N1();
        } else {
            ((InterfaceC31260b) m103742Dp()).mo58198g4(this.f144297u.m132993i());
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: I1 */
    public void mo152126I1() {
        if (m152200Bq()) {
            ((InterfaceC31260b) m103742Dp()).mo58213w3();
            if (m152164Aq()) {
                ((InterfaceC31260b) m103742Dp()).mo58192S2();
                return;
            } else {
                ((InterfaceC31260b) m103742Dp()).mo58174E1();
                return;
            }
        }
        ((InterfaceC31260b) m103742Dp()).mo58182L1();
        m152191lq();
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: J2 */
    public void mo152127J2() {
        AbstractC23775p0.m124197b("db");
        AbstractC23775p0.m124197b("pc_request_sync");
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: K */
    public void mo152128K() {
        m152184eq(false, 1);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: K1 */
    public void mo152129K1() {
        try {
            AbstractC23647d.m123897g("580101");
            C0815e1.m2079N(60, 1, 0, 0, 0);
            m152203uq(8);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: L0 */
    public void mo152130L0() {
        try {
            m152205yq(14);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:            r9 = 10;     */
    @Override // z40.InterfaceC31258a
    /* renamed from: L2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo152131L2(int i11, int i12, Intent intent) {
        String str = null;
        int i13 = 0;
        boolean z11 = false;
        r4 = 0;
        int i14 = 0;
        if (i11 != 18054) {
            if (i11 != 18055) {
                if (i11 != 18061) {
                    switch (i11) {
                        case 1804:
                            ((InterfaceC31260b) m103742Dp()).mo58197a4();
                            if (i12 == -1 && intent != null && intent.getIntExtra("extra_action", 0) == 3 && this.f144298v.m128395L()) {
                                ((InterfaceC31260b) m103742Dp()).mo58198g4("");
                                return;
                            }
                            return;
                        case 1805:
                            ((InterfaceC31260b) m103742Dp()).mo58197a4();
                            int i15 = 2;
                            if (intent != null) {
                                i15 = intent.getIntExtra("extra_entry_point", 2);
                            }
                            if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                                i14 = 1;
                            }
                            if (i12 == -1) {
                                if (i14 == 0) {
                                    C26263i.m135055u().m135085r0(i15);
                                    return;
                                }
                                try {
                                    ((InterfaceC31260b) m103742Dp()).mo58198g4("");
                                    return;
                                } catch (Exception e11) {
                                    AbstractC20110a.f98889a.mo104552e(e11);
                                    return;
                                }
                            }
                            return;
                        case 1806:
                            if (i12 == -1) {
                                try {
                                    ((InterfaceC31260b) m103742Dp()).mo58182L1();
                                    if (intent != null) {
                                        str = intent.getStringExtra("extra_acc_local_auth");
                                    }
                                    if (intent != null) {
                                        z11 = intent.getBooleanExtra("return_setted_pass", false);
                                    }
                                    if (str != null && str.length() != 0) {
                                        m152201qq(str);
                                        break;
                                    }
                                    final int i16 = this.f144293B;
                                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: z40.c
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C31272h.m152181bq(i16);
                                        }
                                    });
                                    return;
                                } catch (Exception e12) {
                                    AbstractC20110a.f98889a.mo104552e(e12);
                                    return;
                                }
                            }
                            if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                                ((InterfaceC31260b) m103742Dp()).mo58198g4("");
                                return;
                            }
                            return;
                        case 1807:
                            if (i12 == -1) {
                                String m132993i = this.f144297u.m132993i();
                                if (!TextUtils.isEmpty(m132993i)) {
                                    ((InterfaceC31260b) m103742Dp()).mo58198g4(m132993i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                if (i12 == -1) {
                    if (intent != null) {
                        str = intent.getStringExtra("extra_acc_local_auth");
                    }
                    if (str != null) {
                        m152201qq(str);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 == -1) {
                if (intent != null) {
                    str = intent.getStringExtra("extra_acc_local_auth");
                }
                if (intent != null) {
                    i13 = intent.getIntExtra("extra_from_pos", 0);
                }
                if (str != null) {
                    m152201qq(str);
                    if (i13 != 1) {
                        ((InterfaceC31260b) m103742Dp()).mo58206r(3, i13);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == -1) {
            if (intent != null) {
                str = intent.getStringExtra("extra_acc_local_auth");
            }
            if (str != null && str.length() != 0) {
                m152201qq(str);
                ((InterfaceC31260b) m103742Dp()).mo58206r(4, 0);
            }
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: M */
    public void mo152132M() {
        try {
            if (this.f144292A != 0) {
                AbstractC23647d.m123897g("5580110");
            } else {
                AbstractC23647d.m123897g("5580109");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: M0 */
    public void mo152133M0() {
        try {
            ((InterfaceC31260b) m103742Dp()).mo58215z0();
            C22436h.f109760a.m115914F();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: N */
    public void mo152134N() {
        ((InterfaceC31260b) m103742Dp()).mo58190Q();
        AbstractC26084s.m134269q(0, 128);
        C0815e1.m2079N(128, 1, 0, 0, 0);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: P1 */
    public void mo152135P1(boolean z11) {
        this.f144296t.m133031K(z11 ? 1 : 0);
        ((InterfaceC31260b) m103742Dp()).mo58200j4(z11);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: P2 */
    public void mo152136P2() {
        try {
            C11128a c11128a = (C11128a) m103744Fp();
            if (c11128a != null && c11128a.m58226f()) {
                if (!mo152153q0()) {
                    m152203uq(7);
                }
                ((InterfaceC31260b) m103742Dp()).mo58196Y3("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: Q1 */
    public void mo152137Q1() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_backup_wifi_only);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_backup_wifi_3g);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f144301y = new String[]{m118743r0, m118743r02};
        this.f144292A = !this.f144296t.m133024B() ? 1 : 0;
        InterfaceC31260b interfaceC31260b = (InterfaceC31260b) m103742Dp();
        String[] strArr = this.f144301y;
        if (strArr == null) {
            AbstractC19074t.m100223u("arrayConditionWifi");
            strArr = null;
        }
        interfaceC31260b.mo58172B(strArr[this.f144292A]);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: R2 */
    public void mo152138R2() {
        try {
            if (((InterfaceC31260b) m103742Dp()).mo58199j2()) {
                return;
            }
            C0809c1.m2050b(new b(!((InterfaceC31260b) m103742Dp()).mo58214w4(), this));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: S3 */
    public boolean mo152139S3() {
        return C22447s.m116020V();
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: T2 */
    public void mo152140T2() {
        AbstractC26084s.m134269q(0, 58);
        C0815e1.m2079N(58, 1, 0, 0, 0);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: U3 */
    public String mo152141U3() {
        String m118743r0;
        try {
            if (!C22447s.m116057s(C26263i.m135058w())) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_remind_restore_login_msg);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_remind_restore_login_msg_media);
            }
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: Y3 */
    public void mo152142Y3(int i11, InterfaceC27218a interfaceC27218a, int i12) {
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        if (i11 == 7) {
            AbstractC17927b.Companion.m94536b().mo94527a("THROTTLE_FIRST_CLICK_SETTING_RESTORE", new Runnable() { // from class: z40.f
                @Override // java.lang.Runnable
                public final void run() {
                    C31272h.m152183dq(C31272h.this);
                }
            }, 1000L);
        } else {
            C22447s.m116011M(i11, interfaceC27218a, 0, i12);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: Z0 */
    public void mo152143Z0() {
        AbstractC23647d.m123897g("5811301");
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: Z1 */
    public void mo152144Z1() {
        C22432d.m115876i(C22432d.f109743a, false, 1, null);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: g0 */
    public void mo152145g0() {
        try {
            AbstractC23647d.m123897g("5580108");
            InterfaceC31260b interfaceC31260b = (InterfaceC31260b) m103742Dp();
            String[] strArr = this.f144301y;
            if (strArr == null) {
                AbstractC19074t.m100223u("arrayConditionWifi");
                strArr = null;
            }
            interfaceC31260b.mo58176H(strArr, this.f144292A);
            AbstractC26084s.m134269q(0, 60);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: k2 */
    public void mo152146k2() {
        final C11128a c11128a = (C11128a) m103744Fp();
        if (c11128a != null && c11128a.m58227g() && !TextUtils.isEmpty(c11128a.m58223c()) && !TextUtils.isEmpty(c11128a.m58225e())) {
            ((InterfaceC31260b) m103742Dp()).mo78955kl(new Runnable() { // from class: z40.d
                @Override // java.lang.Runnable
                public final void run() {
                    C31272h.m152182cq(C31272h.this, c11128a);
                }
            }, 300L);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: k3 */
    public void mo152147k3() {
        ((InterfaceC31260b) m103742Dp()).mo58201l3();
        AbstractC26084s.m134269q(0, 58);
        C0815e1.m2079N(58, 1, 0, 0, 0);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: m2 */
    public void mo152148m2() {
        if (this.f144294C) {
            m152204wq();
        } else {
            m152202sq();
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: n3 */
    public void mo152149n3() {
        if (this.f144298v.m128398O() && C22447s.m116047m0(C26263i.m135058w(), false, 2, null)) {
            this.f144294C = false;
            ((InterfaceC31260b) m103742Dp()).mo58203m3();
        } else {
            m152202sq();
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: o0 */
    public void mo152150o0() {
        ((InterfaceC31260b) m103742Dp()).mo58193U(m152180aq(!this.f144295D));
        AbstractC23647d.m123897g("711300");
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: p */
    public void mo152151p() {
        m152174Sp(C26263i.m135055u().m135087t());
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: p0 */
    public void mo152152p0() {
        try {
            m152199xq(null, 8, false);
            if (this.f144296t.m133056r() == 1) {
                this.f144296t.m133034N(0);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: q0 */
    public boolean mo152153q0() {
        return C26263i.m135055u().m135071M();
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: q3 */
    public void mo152154q3(BaseZaloView baseZaloView) {
        AbstractC19074t.m100208f(baseZaloView, "zaloView");
        if (mo152153q0()) {
            return;
        }
        String m132993i = this.f144297u.m132993i();
        if (!TextUtils.isEmpty(m132993i)) {
            AbstractC23647d.m123897g("5580106");
        } else {
            AbstractC23647d.m123897g("5580105");
        }
        m152196rq(m132993i, baseZaloView);
    }

    /* renamed from: qq */
    public final void m152201qq(String str) {
        AbstractC19074t.m100208f(str, "emailAuthen");
        ((InterfaceC31260b) m103742Dp()).mo58198g4(str);
        ((InterfaceC31260b) m103742Dp()).mo58184M0();
        this.f144297u.m132982A(str, 1);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: r */
    public boolean mo152155r() {
        return this.f144298v.m128403T();
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: r0 */
    public boolean mo152156r0() {
        return C26263i.m135053s();
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: s0 */
    public void mo152157s0(int i11) {
        try {
            this.f144292A = i11;
            InterfaceC31260b interfaceC31260b = (InterfaceC31260b) m103742Dp();
            String[] strArr = this.f144301y;
            if (strArr == null) {
                AbstractC19074t.m100223u("arrayConditionWifi");
                strArr = null;
            }
            interfaceC31260b.mo58172B(strArr[i11]);
            if (i11 == 0) {
                AbstractC23647d.m123897g("5580109");
                this.f144296t.m133039T(true);
            } else {
                AbstractC23647d.m123897g("5580110");
                this.f144296t.m133039T(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: s2 */
    public void mo152158s2(boolean z11) {
        if (z11) {
            this.f144298v.m128407Y(2);
            ((InterfaceC31260b) m103742Dp()).mo58204mk(true);
        } else {
            this.f144298v.m128407Y(-1);
            ((InterfaceC31260b) m103742Dp()).mo58204mk(false);
        }
        ((InterfaceC31260b) m103742Dp()).mo58186N0(z11);
    }

    /* renamed from: sq */
    public void m152202sq() {
        AbstractC23647d.m123897g("5580101");
        mo152158s2(true);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: u3 */
    public void mo152159u3(int i11) {
        try {
            if (mo152153q0()) {
                AbstractC20110a.f98889a.mo104548a("invalidateDataBannersChanged: don't show any banner when syncing -> return", new Object[0]);
                return;
            }
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104548a("invalidateDataBannersChanged: bannerTypeTrigger=%s", Integer.valueOf(i11));
            if (((InterfaceC31260b) m103742Dp()).mo58210t0()) {
                m152178Yp();
                m152177Xp();
                m152176Wp();
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind setting", new Object[0]);
                return;
            }
            if (m152187hq()) {
                m152177Xp();
                m152176Wp();
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind restore", new Object[0]);
            } else if (m152186gq()) {
                m152176Wp();
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind auth google", new Object[0]);
            } else if (m152189jq()) {
                aVar.mo104548a("invalidateDataBannersChanged, valid show Remind backup password", new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLSettingBackupRestoreView", e11);
        }
    }

    /* renamed from: uq */
    public void m152203uq(int i11) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2461l()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: z40.e
                @Override // java.lang.Runnable
                public final void run() {
                    C31272h.m152198vq();
                }
            });
            return;
        }
        this.f144297u.m133007z();
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (C22447s.m116017S(m135087t)) {
            m152199xq(m135087t, i11, true);
        } else {
            m152184eq(true, i11);
        }
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: v2 */
    public void mo152160v2() {
        m152193nq();
        mo152128K();
        C22436h.m115891B(C22436h.f109760a, 3, false, 2, null);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: w0 */
    public boolean mo152161w0() {
        return this.f144294C;
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: w1 */
    public void mo152162w1() {
        if (this.f144298v.m128392I()) {
            ((InterfaceC31260b) m103742Dp()).mo58204mk(true);
            ((InterfaceC31260b) m103742Dp()).mo58186N0(true);
        } else {
            ((InterfaceC31260b) m103742Dp()).mo58204mk(false);
            ((InterfaceC31260b) m103742Dp()).mo58186N0(false);
        }
    }

    /* renamed from: wq */
    public void m152204wq() {
        m152199xq(C26263i.m135055u().m135087t(), this.f144302z, false);
    }

    @Override // z40.InterfaceC31258a
    /* renamed from: x3 */
    public void mo152163x3(Bundle bundle) {
        if (bundle == null) {
            C26263i.m135055u().m135077j0(true);
        }
    }

    /* renamed from: yq */
    public void m152205yq(int i11) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (C22447s.m116017S(m135087t)) {
            m152206zq(m135087t, i11);
        } else {
            m152184eq(true, i11);
        }
    }

    /* renamed from: zq */
    public void m152206zq(C7924a c7924a, int i11) {
        ((InterfaceC31260b) m103742Dp()).mo58181K3();
        TargetBackupInfo m135059x = C26263i.m135059x(c7924a);
        if (m135059x != null) {
            ((InterfaceC31260b) m103742Dp()).mo58189O0(i11, m135059x);
        }
    }
}
