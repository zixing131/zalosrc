package wd0;

import ag0.C0804b;
import ag0.C0814e0;
import ag0.C0833n0;
import androidx.work.AbstractC2144f;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import dj.C17952c1;
import dj.C17969i0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19620d0;
import gw.C19636i1;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23195r2;
import p019aj.C0872f;
import p019aj.C0876j;
import p056cj.C3533a;
import p132ej.C18446h;
import p161fg.C18922m;
import p185gc.AbstractC19378b;
import p241ij.C20567d;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p577vj.C28266a;
import p716zh.C31879d1;
import p716zh.C31894e1;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import sm0.AbstractC26327c;
import vg.C28023b6;
import ws.C29210k;

/* renamed from: wd0.k */
/* loaded from: classes4.dex */
public final class C28931k extends AbstractC19378b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C19669z f133955a;

    /* renamed from: b */
    private final C19636i1 f133956b;

    /* renamed from: c */
    private final C0876j f133957c;

    /* renamed from: d */
    private final C0872f f133958d;

    /* renamed from: wd0.k$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.k$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final Conversation f133959a;

        /* renamed from: b */
        private final List f133960b;

        /* renamed from: c */
        private final d f133961c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(Conversation conversation, C17945a0 c17945a0) {
            this(conversation, c17945a0, null, 4, null);
            AbstractC19074t.m100208f(conversation, "conversation");
            AbstractC19074t.m100208f(c17945a0, "msg");
        }

        /* renamed from: a */
        public final Conversation m144564a() {
            return this.f133959a;
        }

        /* renamed from: b */
        public final List m144565b() {
            return this.f133960b;
        }

        /* renamed from: c */
        public final d m144566c() {
            return this.f133961c;
        }

        public b(Conversation conversation, List list, d dVar) {
            AbstractC19074t.m100208f(conversation, "conversation");
            AbstractC19074t.m100208f(list, "msgs");
            AbstractC19074t.m100208f(dVar, "rules");
            this.f133959a = conversation;
            this.f133960b = list;
            this.f133961c = dVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Conversation conversation, C17945a0 c17945a0, d dVar) {
            this(conversation, r3, dVar);
            List m131496e;
            AbstractC19074t.m100208f(conversation, "conversation");
            AbstractC19074t.m100208f(c17945a0, "msg");
            AbstractC19074t.m100208f(dVar, "rules");
            m131496e = AbstractC25366r.m131496e(c17945a0);
        }

        public /* synthetic */ b(Conversation conversation, C17945a0 c17945a0, d dVar, int i11, AbstractC19060k abstractC19060k) {
            this(conversation, c17945a0, (i11 & 4) != 0 ? d.Companion.m144585a() : dVar);
        }
    }

    /* renamed from: wd0.k$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final C17945a0 f133962a;

        /* renamed from: b */
        private final C17945a0 f133963b;

        /* renamed from: c */
        private final C17945a0 f133964c;

        /* renamed from: d */
        private final C17945a0 f133965d;

        /* renamed from: e */
        private final C17945a0 f133966e;

        /* renamed from: f */
        private final C17945a0 f133967f;

        /* renamed from: g */
        private final C7908f f133968g;

        /* renamed from: h */
        private final boolean f133969h;

        /* renamed from: i */
        private final boolean f133970i;

        /* renamed from: j */
        private final boolean f133971j;

        /* renamed from: k */
        private final int f133972k;

        public c(C17945a0 c17945a0, C17945a0 c17945a02, C17945a0 c17945a03, C17945a0 c17945a04, C17945a0 c17945a05, C17945a0 c17945a06, C7908f c7908f, boolean z11, boolean z12, boolean z13, int i11) {
            AbstractC19074t.m100208f(c17945a0, "lastMsg");
            this.f133962a = c17945a0;
            this.f133963b = c17945a02;
            this.f133964c = c17945a03;
            this.f133965d = c17945a04;
            this.f133966e = c17945a05;
            this.f133967f = c17945a06;
            this.f133968g = c7908f;
            this.f133969h = z11;
            this.f133970i = z12;
            this.f133971j = z13;
            this.f133972k = i11;
        }

        /* renamed from: a */
        public final C17945a0 m144567a() {
            return this.f133966e;
        }

        /* renamed from: b */
        public final C17945a0 m144568b() {
            return this.f133967f;
        }

        /* renamed from: c */
        public final C17945a0 m144569c() {
            return this.f133965d;
        }

        /* renamed from: d */
        public final boolean m144570d() {
            return this.f133970i;
        }

        /* renamed from: e */
        public final boolean m144571e() {
            return this.f133969h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f133962a, cVar.f133962a) && AbstractC19074t.m100204b(this.f133963b, cVar.f133963b) && AbstractC19074t.m100204b(this.f133964c, cVar.f133964c) && AbstractC19074t.m100204b(this.f133965d, cVar.f133965d) && AbstractC19074t.m100204b(this.f133966e, cVar.f133966e) && AbstractC19074t.m100204b(this.f133967f, cVar.f133967f) && AbstractC19074t.m100204b(this.f133968g, cVar.f133968g) && this.f133969h == cVar.f133969h && this.f133970i == cVar.f133970i && this.f133971j == cVar.f133971j && this.f133972k == cVar.f133972k;
        }

        /* renamed from: f */
        public final C17945a0 m144572f() {
            return this.f133963b;
        }

        /* renamed from: g */
        public final C17945a0 m144573g() {
            return this.f133962a;
        }

        /* renamed from: h */
        public final C17945a0 m144574h() {
            return this.f133964c;
        }

        public int hashCode() {
            int hashCode = this.f133962a.hashCode() * 31;
            C17945a0 c17945a0 = this.f133963b;
            int hashCode2 = (hashCode + (c17945a0 == null ? 0 : c17945a0.hashCode())) * 31;
            C17945a0 c17945a02 = this.f133964c;
            int hashCode3 = (hashCode2 + (c17945a02 == null ? 0 : c17945a02.hashCode())) * 31;
            C17945a0 c17945a03 = this.f133965d;
            int hashCode4 = (hashCode3 + (c17945a03 == null ? 0 : c17945a03.hashCode())) * 31;
            C17945a0 c17945a04 = this.f133966e;
            int hashCode5 = (hashCode4 + (c17945a04 == null ? 0 : c17945a04.hashCode())) * 31;
            C17945a0 c17945a05 = this.f133967f;
            int hashCode6 = (hashCode5 + (c17945a05 == null ? 0 : c17945a05.hashCode())) * 31;
            C7908f c7908f = this.f133968g;
            return ((((((((hashCode6 + (c7908f != null ? c7908f.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f133969h)) * 31) + AbstractC2144f.m11520a(this.f133970i)) * 31) + AbstractC2144f.m11520a(this.f133971j)) * 31) + this.f133972k;
        }

        /* renamed from: i */
        public final C7908f m144575i() {
            return this.f133968g;
        }

        /* renamed from: j */
        public final boolean m144576j() {
            return this.f133971j;
        }

        /* renamed from: k */
        public final int m144577k() {
            return this.f133972k;
        }

        public String toString() {
            return "PreparedData(lastMsg=" + this.f133962a + ", lastMineMsg=" + this.f133963b + ", lastReceivedMsg=" + this.f133964c + ", firstUnreadMsg=" + this.f133965d + ", firstUnreadFileMsg=" + this.f133966e + ", firstUnreadMention=" + this.f133967f + ", lastTopOut=" + this.f133968g + ", forceThreadTypeOA=" + this.f133969h + ", forceAddExistsChat=" + this.f133970i + ", needResetUnread=" + this.f133971j + ", totalMsgUnread=" + this.f133972k + ")";
        }
    }

    /* renamed from: wd0.k$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private final boolean f133976a;

        /* renamed from: b */
        private final boolean f133977b;

        /* renamed from: c */
        private final boolean f133978c;
        public static final a Companion = new a(null);

        /* renamed from: d */
        private static final d f133973d = new d(false, false, false, 7, null);

        /* renamed from: e */
        private static final d f133974e = new d(false, false, false, 4, null);

        /* renamed from: f */
        private static final d f133975f = new d(false, true, false, 4, null);

        /* renamed from: wd0.k$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m144585a() {
                return d.f133973d;
            }

            /* renamed from: b */
            public final d m144586b() {
                return d.f133975f;
            }

            /* renamed from: c */
            public final d m144587c() {
                return d.f133974e;
            }
        }

        public d(boolean z11) {
            this(z11, false, false, 6, null);
        }

        /* renamed from: e */
        public static final d m144581e() {
            return Companion.m144587c();
        }

        /* renamed from: d */
        public final boolean m144582d() {
            return this.f133976a;
        }

        /* renamed from: f */
        public final boolean m144583f() {
            return this.f133978c;
        }

        /* renamed from: g */
        public final boolean m144584g() {
            return this.f133977b;
        }

        public d(boolean z11, boolean z12, boolean z13) {
            this.f133976a = z11;
            this.f133977b = z12;
            this.f133978c = z13;
        }

        public /* synthetic */ d(boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? true : z13);
        }
    }

    /* renamed from: wd0.k$e */
    /* loaded from: classes4.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C17945a0) obj).m94974P4()), Long.valueOf(((C17945a0) obj2).m94974P4()));
            return m135478b;
        }
    }

    public C28931k(C19669z c19669z, C19636i1 c19636i1, C0876j c0876j, C0872f c0872f) {
        AbstractC19074t.m100208f(c19669z, "msgManager");
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        this.f133955a = c19669z;
        this.f133956b = c19636i1;
        this.f133957c = c0876j;
        this.f133958d = c0872f;
    }

    /* renamed from: e */
    private final void m144550e(long j11) {
        if (this.f133958d.m2528W() && j11 > this.f133958d.m2567z()) {
            this.f133958d.m2554p0(j11);
        }
    }

    /* renamed from: f */
    private final void m144551f(String str, int i11, int i12, C17945a0 c17945a0, C17945a0 c17945a02) {
        m144550e(c17945a0.m94974P4());
        m144557m(str, c17945a02);
        if (i12 > 0 && C21927m.m114302u().m114345m(str)) {
            AbstractC23195r2.f112446h.add(str);
        }
        if (c17945a0.m94879E5()) {
            C0833n0.f2934p.m2208g(c17945a0, true);
        }
        if (i11 != 2) {
            if (i11 == 3) {
                C23744a.Companion.m124119a().m124116d(13000, new Object[0]);
            }
        } else {
            C23744a.Companion.m124119a().m124116d(6064, new Object[0]);
        }
        C29210k.b bVar = C29210k.Companion;
        if (bVar.m145896a().m145888v(c17945a0.m94847A6(), c17945a0.m94889F6())) {
            if (bVar.m145896a().m145874m0()) {
                bVar.m145896a().m145841M(c17945a0);
            } else {
                bVar.m145896a().m145862b1(c17945a0);
            }
        }
        m144561q(c17945a0);
        C23744a.Companion.m124119a().m124116d(168, str);
    }

    /* renamed from: g */
    private final c m144552g(String str, List list, d dVar) {
        List<C17945a0> m131177E0;
        Object m131216p0;
        list.isEmpty();
        int i11 = 1;
        if (list.size() != 1) {
            m131177E0 = AbstractC25332a0.m131177E0(list, new e());
        } else {
            m131177E0 = list;
        }
        m131216p0 = AbstractC25332a0.m131216p0(m131177E0);
        C17945a0 c17945a0 = (C17945a0) m131216p0;
        C17945a0 c17945a02 = null;
        C17945a0 c17945a03 = null;
        C17945a0 c17945a04 = null;
        C17945a0 c17945a05 = null;
        C17945a0 c17945a06 = null;
        C7908f c7908f = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        for (C17945a0 c17945a07 : m131177E0) {
            if (c17945a07.m95032V6()) {
                c17945a02 = c17945a07;
            }
            if (!c17945a07.m95032V6() && c17945a07.m95029V3().m41053q()) {
                if (c17945a03 == null || c17945a03.m95029V3().m41047k() < c17945a07.m95029V3().m41047k()) {
                    c17945a03 = c17945a07;
                }
                if (c17945a04 == null) {
                    z14 = c17945a07.m94933K7();
                    c17945a04 = c17945a07;
                }
                if (c17945a07.m95276v6() && c17945a05 == null) {
                    c17945a05 = c17945a07;
                }
                if (c17945a06 == null && ((c17945a07.m94995R6() || c17945a07.m94986Q6()) && !this.f133956b.m102760Q(str, c17945a07) && dVar.m144582d())) {
                    c17945a06 = c17945a07;
                }
                if (dVar.m144582d() && c17945a07.m94956N2() == i11 && c17945a07.m95021U5() && !c17945a07.m94848A7() && c17945a07.m95118e4() != -1 && !this.f133956b.m102760Q(str, c17945a07)) {
                    i12++;
                }
            } else if (c17945a07.m95180k8() && !c17945a07.m95092b7()) {
                if (!z14) {
                    c17945a04 = null;
                }
                c17945a05 = null;
                c17945a06 = null;
                z13 = true;
                i12 = 0;
            }
            if (c17945a07.m95304y6()) {
                z11 = true;
            }
            if (c17945a07.m95122e8() && (c17945a07.m94929K2() instanceof C17952c1)) {
                C17969i0 m94929K2 = c17945a07.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentSuggestFriend");
                if (((C17952c1) m94929K2).f90880N == 1) {
                    z12 = true;
                }
            }
            if (c17945a07.m94993R4() != null) {
                c7908f = c17945a07.m94993R4();
            }
            i11 = 1;
        }
        return new c(c17945a0, c17945a02, c17945a03, c17945a04, c17945a05, c17945a06, c7908f, z11, z12, z13, i12);
    }

    /* renamed from: h */
    private final C20567d m144553h(Conversation conversation, c cVar, d dVar) {
        boolean z11;
        String str;
        C20567d m107015a;
        long j11;
        String str2;
        String str3 = conversation.f42893q;
        boolean m132079d = AbstractC25495a.m132079d(str3);
        C19669z.b bVar = C19669z.Companion;
        if (bVar.m103232a().m103228r0(conversation.f42893q)) {
            bVar.m103232a().m103229t0();
        }
        Conversation m103202S = this.f133955a.m103202S(str3);
        if (m103202S != null && !dVar.m144584g() && !m144556l(cVar.m144573g(), m103202S)) {
            z11 = false;
        } else {
            z11 = true;
        }
        String m102703w = AbstractC19620d0.m102703w(cVar.m144573g());
        String m102705y = AbstractC19620d0.m102705y(conversation, cVar.m144573g());
        int m144555j = m144555j(str3, cVar.m144573g(), cVar.m144575i(), cVar.m144571e(), cVar.m144570d());
        int m144562r = m144562r(str3, m144555j, cVar.m144574h(), cVar.m144577k(), cVar.m144576j(), dVar.m144582d());
        FirstUnreadMsg m144558n = m144558n(str3, m144562r, cVar.m144576j(), cVar.m144569c(), cVar.m144567a());
        if (cVar.m144568b() != null) {
            this.f133956b.m102755L0(str3, cVar.m144568b());
        }
        if (!m132079d && (((str2 = conversation.f42894r) == null || str2.length() == 0) && cVar.m144574h() != null)) {
            String m94854B4 = cVar.m144574h().m94854B4();
            AbstractC19074t.m100207e(m94854B4, "getSenderName(...)");
            conversation.f42894r = m94854B4;
        }
        C3533a m144560p = m144560p(str3, cVar.m144574h());
        if (m103202S != null && !z11) {
            m107015a = C20567d.Companion.m107016b(m103202S, m144562r, m144558n, this.f133956b.m102752J(str3), this.f133956b.m102794x(str3), cVar.m144573g().m94993R4(), m144560p);
        } else {
            C20567d.a aVar = C20567d.Companion;
            C17945a0 m144573g = cVar.m144573g();
            int i11 = !this.f133956b.m102765V(str3) ? 1 : 0;
            C28266a m102752J = this.f133956b.m102752J(str3);
            LastDeliveredSeenData m102794x = this.f133956b.m102794x(str3);
            if (m132079d) {
                str = m102705y;
            } else {
                str = "";
            }
            m107015a = aVar.m107015a(m144573g, m144555j, m144562r, i11, m144558n, m102752J, m102794x, m102703w, str, cVar.m144573g().m94993R4(), m144560p);
            if (!dVar.m144583f()) {
                if (m103202S != null) {
                    j11 = m103202S.m41008l();
                } else {
                    j11 = 0;
                }
                if (j11 > 0) {
                    m107015a.m107014v(j11 + 1);
                }
            }
        }
        m144559o(conversation, m107015a);
        return m107015a;
    }

    /* renamed from: i */
    private final void m144554i(String str) {
        if (this.f133956b.m102792v0(str) > 0) {
            C18922m.m99141t().m99146P(str);
            C28023b6.m141250h0().m141293J(str);
        }
        this.f133956b.m102787s0(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:            if (p304ks.AbstractC21935u.m114559z(r3) == 0) goto L144;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m144555j(String str, C17945a0 c17945a0, C7908f c7908f, boolean z11, boolean z12) {
        int i11 = 1;
        if (AbstractC25495a.m132079d(str) || AbstractC25495a.m132086k(str) || AbstractC25495a.m132078c(str)) {
            return 1;
        }
        try {
            int m114538e = AbstractC21935u.m114538e(str);
            if (z11 && m114538e != 1) {
                Map map = AbstractC23304d.f113417o;
                AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                synchronized (map) {
                    AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                    map.put(str, str);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                m114538e = 1;
            }
            if (m114538e != 0) {
                if (m114538e != 1) {
                    return 1;
                }
                C19669z.f97574V.remove(str);
                try {
                    if (c17945a0.m95304y6()) {
                        if (c7908f != null && c7908f.m40874d() >= 1) {
                            c17945a0.m95290wb(c7908f);
                            return i11;
                        }
                        i11 = 3;
                        return i11;
                    }
                    Conversation m103202S = this.f133955a.m103202S(str);
                    if (c17945a0.m95032V6() && m103202S != null) {
                        i11 = m103202S.f42897u;
                        C7908f c7908f2 = m103202S.f42898v;
                        if (c7908f2 != null) {
                            AbstractC19074t.m100205c(c7908f2);
                            if (c7908f2.m40874d() != -1) {
                                c17945a0.m95290wb(m103202S.f42898v);
                            }
                        }
                    }
                    return i11;
                } catch (Exception e11) {
                    e = e11;
                    i11 = 3;
                    AbstractC20110a.f98889a.m104564x("UpdateLastMessage").mo104552e(e);
                    return i11;
                }
            }
            c17945a0.m95290wb(null);
            if (this.f133958d.m2561t(str) != 2) {
                return 1;
            }
            if (!z12 && (!c17945a0.m95032V6() || c17945a0.m95160i6())) {
                return 2;
            }
            this.f133958d.m2540i(str);
            return 1;
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.f98889a.m104564x("UpdateLastMessage").mo104552e(e);
            return i11;
        }
    }

    /* renamed from: l */
    private final boolean m144556l(C17945a0 c17945a0, Conversation conversation) {
        C18446h m41003g = conversation.m41003g();
        if (m41003g == null) {
            return true;
        }
        if ((c17945a0.m95032V6() && Objects.equals(c17945a0.m95029V3(), conversation.m41005i())) || c17945a0.mo95213o() >= m41003g.m97753r()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final void m144557m(String str, C17945a0 c17945a0) {
        if (c17945a0 != null) {
            C31879d1 m153254a = C31894e1.f146524a.m153254a(str);
            if (m153254a.m153194f() != 0) {
                m153254a.m153202o(0L);
                m153254a.m153199k();
            }
        }
    }

    /* renamed from: n */
    private final FirstUnreadMsg m144558n(String str, int i11, boolean z11, C17945a0 c17945a0, C17945a0 c17945a02) {
        if (z11) {
            this.f133956b.m102774l0(str);
        }
        FirstUnreadMsg firstUnreadMsg = null;
        if (i11 == 0 && ((c17945a0 != null && !c17945a0.m94933K7()) || (c17945a0 != null && c17945a0.m95032V6()))) {
            this.f133956b.m102774l0(str);
            return null;
        }
        if (c17945a0 != null) {
            firstUnreadMsg = this.f133956b.m102775m(str, c17945a0);
        }
        if (c17945a02 != null) {
            this.f133956b.m102781p(str, c17945a02);
        }
        return firstUnreadMsg;
    }

    /* renamed from: o */
    private final void m144559o(Conversation conversation, C20567d c20567d) {
        if (!C7959d.Companion.m41850e().m41801k3(conversation, c20567d)) {
            return;
        }
        int m106993a = c20567d.m106993a();
        boolean m107013u = c20567d.m107013u();
        C7908f m107007o = c20567d.m107007o();
        C18446h c18446h = new C18446h(c20567d.m107009q(), c20567d.m107000h(), c20567d.m107006n(), c20567d.m107012t(), c20567d.m107013u(), c20567d.m107001i(), c20567d.m106997e(), c20567d.m107008p(), c20567d.m107011s());
        c18446h.m97761z(c20567d.m107002j());
        c18446h.m97742C(c20567d.m107004l());
        c18446h.m97741B(c20567d.m107003k());
        conversation.m41019z(c18446h);
        conversation.f42897u = m106993a;
        conversation.f42898v = m107007o;
        this.f133955a.m103225o0(conversation, true, m107013u);
        this.f133955a.m103213Z0();
    }

    /* renamed from: p */
    private final C3533a m144560p(String str, C17945a0 c17945a0) {
        if (c17945a0 != null) {
            C3533a m2606G = this.f133957c.m2606G(str);
            if (m2606G != null && c17945a0.m95029V3().m41047k() <= m2606G.m17912g()) {
                return m2606G;
            }
            C3533a c3533a = new C3533a(c17945a0);
            this.f133957c.m2617U(str, c3533a);
            return c3533a;
        }
        return null;
    }

    /* renamed from: q */
    private final void m144561q(C17945a0 c17945a0) {
        if (!c17945a0.m95032V6()) {
            C0814e0.m2073s(c17945a0.mo95039W2());
        }
    }

    /* renamed from: r */
    private final int m144562r(String str, int i11, C17945a0 c17945a0, int i12, boolean z11, boolean z12) {
        int m102746E;
        if (z11) {
            m144554i(str);
        }
        if (z12 && i12 > 0) {
            m102746E = this.f133956b.m102763T(str, i12);
        } else {
            m102746E = this.f133956b.m102746E(str);
        }
        if (m102746E == 0 && z12 && c17945a0 != null && !this.f133956b.m102760Q(str, c17945a0)) {
            this.f133956b.m102793w0(str, c17945a0.m94956N2());
        }
        if (i11 == 3) {
            if (C0804b.m2025g().m2033i(str)) {
                this.f133956b.m102792v0(str);
            } else if (z12) {
                AbstractC23309i.m121924fz(AbstractC23309i.m121009Hd() + 1);
            }
        }
        return m102746E;
    }

    @Override // p185gc.AbstractC19378b
    /* renamed from: k */
    public void mo1884d(b bVar, AbstractC19378b.a aVar) {
        AbstractC19074t.m100208f(bVar, "params");
        Conversation m144564a = bVar.m144564a();
        List m144565b = bVar.m144565b();
        d m144566c = bVar.m144566c();
        if (m144564a.f42893q.length() == 0) {
            AbstractC20110a.f98889a.mo104551d("UpdateLastMessage", "Conversation uid CANNOT be empty!");
            return;
        }
        if (m144565b.isEmpty()) {
            AbstractC20110a.f98889a.mo104551d("UpdateLastMessage", "List MSG CANNOT be empty!");
            return;
        }
        try {
            try {
                String str = m144564a.f42893q;
                c m144552g = m144552g(str, m144565b, m144566c);
                C20567d m144553h = m144553h(m144564a, m144552g, m144566c);
                m144551f(str, m144553h.m106993a(), m144553h.m106995c(), m144552g.m144573g(), m144552g.m144572f());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("UpdateLastMessage").mo104552e(e11);
            }
        } finally {
            this.f133955a.m103198O0();
        }
    }
}
