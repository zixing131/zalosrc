package fa0;

import ag0.AbstractC0837p0;
import ag0.InterfaceC0806b1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.searchglobal.subscreen.C13029a;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fa0.C18850p;
import fa0.InterfaceC18835a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.AbstractC19358r1;
import ga0.C19308b;
import ga0.C19318e0;
import ga0.C19319e1;
import ga0.C19325g1;
import gg0.AbstractC19444a;
import ha0.C19955h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.C23024b7;
import me0.C23212s8;
import on0.C24329j;
import p056cj.AbstractC3552t;
import p056cj.C3549q;
import p056cj.C3550r;
import p056cj.C3551s;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p239ih.C20556f;
import p363nh.C23744a;
import p510sq.C26365a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p612wk.C29070b;
import p612wk.C29078j;
import p612wk.C29079k;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import p716zh.C32002l4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;

/* renamed from: fa0.p */
/* loaded from: classes6.dex */
public final class C18850p extends AbstractC19962a implements InterfaceC18835a, InterfaceC18319c {

    /* renamed from: A */
    private C29078j f94156A;

    /* renamed from: B */
    private final InterfaceC29232g f94157B;

    /* renamed from: C */
    private final InterfaceC29232g f94158C;

    /* renamed from: D */
    private final InterfaceC29232g f94159D;

    /* renamed from: E */
    private final InterfaceC29232g f94160E;

    /* renamed from: F */
    private final HashSet f94161F;

    /* renamed from: G */
    private final i f94162G;

    /* renamed from: t */
    private AbstractC19358r1 f94163t;

    /* renamed from: u */
    private boolean f94164u;

    /* renamed from: v */
    private boolean f94165v;

    /* renamed from: w */
    private final C29234i f94166w;

    /* renamed from: x */
    private final C19325g1 f94167x;

    /* renamed from: y */
    private final InterfaceC29232g f94168y;

    /* renamed from: z */
    private final InterfaceC29232g f94169z;

    /* renamed from: fa0.p$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC29069a.f mo12V4() {
            String str;
            int i11;
            C13029a c13029a = (C13029a) C18850p.this.m103744Fp();
            if (c13029a != null) {
                str = c13029a.m73239c();
            } else {
                str = null;
            }
            C13029a c13029a2 = (C13029a) C18850p.this.m103744Fp();
            if (c13029a2 != null) {
                i11 = c13029a2.m73237a();
            } else {
                i11 = 15;
            }
            return new AbstractC29069a.f(str, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fa0.p$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C18316b f94171q;

        /* renamed from: r */
        final /* synthetic */ C18850p f94172r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C18316b c18316b, C18850p c18850p) {
            super(0);
            this.f94171q = c18316b;
            this.f94172r = c18850p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m98877d(final C18850p c18850p) {
            AbstractC19074t.m100208f(c18850p, "this$0");
            C23024b7.f111993a.m118075x(c18850p.f94167x);
            AbstractC19444a.m101695c(new Runnable() { // from class: fa0.r
                @Override // java.lang.Runnable
                public final void run() {
                    C18850p.b.m98878e(C18850p.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m98878e(C18850p c18850p) {
            AbstractC19074t.m100208f(c18850p, "this$0");
            ((InterfaceC18836b) c18850p.m103742Dp()).mo73234vs();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m98879c();
            return C24848g0.f119245a;
        }

        /* renamed from: c */
        public final void m98879c() {
            if ((this.f94171q.m97245a() instanceof AbstractC29069a.a) && (this.f94171q.m97248d() instanceof C20556f)) {
                ((InterfaceC18836b) this.f94172r.m103742Dp()).mo73227W((C20556f) this.f94171q.m97248d());
                InterfaceC0806b1 m2237f = AbstractC0837p0.Companion.m2237f();
                final C18850p c18850p = this.f94172r;
                m2237f.mo2040a(new Runnable() { // from class: fa0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18850p.b.m98877d(C18850p.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fa0.p$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C18316b f94173q;

        /* renamed from: r */
        final /* synthetic */ C18850p f94174r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C18316b c18316b, C18850p c18850p) {
            super(0);
            this.f94173q = c18316b;
            this.f94174r = c18850p;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m98880a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m98880a() {
            ((InterfaceC18836b) this.f94174r.m103742Dp()).mo73233q2(new C26365a.b((String) this.f94173q.m97247c(), C32002l4.Companion.m154287a(16)).m135743b(), 0);
        }
    }

    /* renamed from: fa0.p$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m73238b;
            C13029a c13029a = (C13029a) C18850p.this.m103744Fp();
            if (c13029a == null || (m73238b = c13029a.m73238b()) == null) {
                return "";
            }
            return m73238b;
        }
    }

    /* renamed from: fa0.p$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC29076h mo12V4() {
            C13029a c13029a = (C13029a) C18850p.this.m103744Fp();
            if (c13029a != null) {
                return c13029a.m73242f();
            }
            return null;
        }
    }

    /* renamed from: fa0.p$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC29080l mo12V4() {
            C13029a c13029a = (C13029a) C18850p.this.m103744Fp();
            if (c13029a != null) {
                return c13029a.m73243g();
            }
            return null;
        }
    }

    /* renamed from: fa0.p$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            AbstractC29080l m73243g;
            AbstractC29076h m73242f;
            C13029a c13029a = (C13029a) C18850p.this.m103744Fp();
            int i11 = 2;
            if (c13029a != null && (m73242f = c13029a.m73242f()) != null) {
                if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.b.f134816b)) {
                    if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.c.f134817b)) {
                        if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.d.f134818b)) {
                            if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.e.f134819b)) {
                                if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.f.f134820b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.g.f134821b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.h.f134822b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.i.f134823b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.j.f134824b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.k.f134825b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.l.f134826b)) {
                                    if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.m.f134827b)) {
                                        if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.n.f134828b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.o.f134829b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.p.f134830b)) {
                                            if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.q.f134831b)) {
                                                if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.r.f134832b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.s.f134833b)) {
                                                    if (AbstractC19074t.m100204b(m73242f, AbstractC29076h.u.f134835b)) {
                                                        i11 = 32;
                                                    } else if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.w.f134836b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.y.f134838b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.z.f134839b) && !AbstractC19074t.m100204b(m73242f, AbstractC29076h.t.f134834b)) {
                                                        if (!AbstractC19074t.m100204b(m73242f, AbstractC29076h.x.f134837b)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = 4;
                                }
                            }
                            i11 = 8;
                        }
                    }
                    i11 = 33;
                }
                i11 = 1;
            } else {
                C13029a c13029a2 = (C13029a) C18850p.this.m103744Fp();
                if (c13029a2 != null && (m73243g = c13029a2.m73243g()) != null && !AbstractC19074t.m100204b(m73243g, AbstractC29080l.a.f134882b)) {
                    if (!AbstractC19074t.m100204b(m73243g, AbstractC29080l.c.f134883b) && !AbstractC19074t.m100204b(m73243g, AbstractC29080l.h.f134888b) && !AbstractC19074t.m100204b(m73243g, AbstractC29080l.i.f134889b)) {
                        if (!AbstractC19074t.m100204b(m73243g, AbstractC29080l.d.f134884b)) {
                            if (!AbstractC19074t.m100204b(m73243g, AbstractC29080l.e.f134885b)) {
                                if (!AbstractC19074t.m100204b(m73243g, AbstractC29080l.f.f134886b)) {
                                    if (!AbstractC19074t.m100204b(m73243g, AbstractC29080l.g.f134887b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                i11 = 4;
                            }
                            i11 = 8;
                        }
                        i11 = 33;
                    }
                    i11 = 1;
                } else {
                    i11 = 0;
                }
            }
            return Integer.valueOf(i11);
        }
    }

    /* renamed from: fa0.p$h */
    /* loaded from: classes6.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return C18850p.this.f94167x.m101211f();
        }
    }

    /* renamed from: fa0.p$i */
    /* loaded from: classes6.dex */
    public static final class i implements C17945a0.x {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18836b f94180p;

        i(InterfaceC18836b interfaceC18836b) {
            this.f94180p = interfaceC18836b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m98887b(InterfaceC18836b interfaceC18836b, int i11, MessageId messageId) {
            AbstractC19074t.m100208f(interfaceC18836b, "$mvpView");
            AbstractC19074t.m100208f(messageId, "$messageId");
            interfaceC18836b.mo73229Yc(i11, messageId);
        }

        @Override // dj.C17945a0.x
        /* renamed from: G */
        public void mo61268G(final int i11, final MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "messageId");
            final InterfaceC18836b interfaceC18836b = this.f94180p;
            AbstractC19444a.m101697e(new Runnable() { // from class: fa0.s
                @Override // java.lang.Runnable
                public final void run() {
                    C18850p.i.m98887b(InterfaceC18836b.this, i11, messageId);
                }
            });
        }

        @Override // dj.C17945a0.x
        /* renamed from: H */
        public void mo61269H(MessageId messageId, boolean z11) {
        }

        @Override // dj.C17945a0.x
        /* renamed from: m */
        public void mo61273m(int i11, MessageId messageId) {
            AbstractC19074t.m100208f(messageId, "messageId");
        }

        @Override // dj.C17945a0.x
        /* renamed from: s */
        public void mo61274s(MessageId messageId, String str, boolean z11) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18850p(InterfaceC18836b interfaceC18836b) {
        super(interfaceC18836b);
        AbstractC19074t.m100208f(interfaceC18836b, "mvpView");
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f94166w = m145994a;
        this.f94167x = new C19325g1();
        this.f94168y = AbstractC29233h.m145991b(m145994a, new g());
        this.f94169z = AbstractC29233h.m145991b(m145994a, new a());
        this.f94157B = AbstractC29233h.m145991b(m145994a, new h());
        this.f94158C = AbstractC29233h.m145991b(m145994a, new d());
        this.f94159D = AbstractC29233h.m145991b(m145994a, new f());
        this.f94160E = AbstractC29233h.m145991b(m145994a, new e());
        this.f94161F = new HashSet();
        this.f94162G = new i(interfaceC18836b);
    }

    /* renamed from: Zp */
    private final AbstractC29069a.f m98849Zp() {
        return (AbstractC29069a.f) this.f94169z.getValue();
    }

    /* renamed from: aq */
    private final String m98850aq() {
        return (String) this.f94158C.getValue();
    }

    /* renamed from: bq */
    private final AbstractC19358r1 m98851bq() {
        return this.f94163t;
    }

    /* renamed from: cq */
    private final AbstractC29076h m98852cq() {
        return (AbstractC29076h) this.f94160E.getValue();
    }

    /* renamed from: dq */
    private final AbstractC29080l m98853dq() {
        return (AbstractC29080l) this.f94159D.getValue();
    }

    /* renamed from: eq */
    private final int m98854eq() {
        return ((Number) this.f94168y.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hq */
    public static final void m98855hq(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$dispatchAction");
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iq */
    public static final void m98856iq(C18850p c18850p, C18316b c18316b) {
        AbstractC19074t.m100208f(c18850p, "this$0");
        AbstractC19074t.m100208f(c18316b, "$action");
        ((InterfaceC18836b) c18850p.m103742Dp()).mo73229Yc(((Number) c18316b.m97245a()).intValue(), (MessageId) c18316b.m97248d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jq */
    public static final void m98857jq() {
        ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kq */
    public static final void m98858kq(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$dispatchAction");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: mq */
    private final void m98859mq() {
        this.f94167x.m101198X("2");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fa0.g
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98860nq(C18850p.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nq */
    public static final void m98860nq(C18850p c18850p) {
        AbstractC19074t.m100208f(c18850p, "this$0");
        C19955h.f98250a.m103731u(c18850p.f94167x, "5");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oq */
    public static final void m98861oq(final C18850p c18850p, AbstractC29069a.a aVar, int i11) {
        AbstractC19074t.m100208f(c18850p, "$this_runCatching");
        AbstractC19074t.m100208f(aVar, "$data");
        C23024b7.f111993a.m118075x(c18850p.f94167x);
        AbstractC19444a.m101695c(new Runnable() { // from class: fa0.e
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98862pq(C18850p.this);
            }
        });
        C19955h.f98250a.m103730s(c18850p.f94167x, aVar, i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pq */
    public static final void m98862pq(C18850p c18850p) {
        AbstractC19074t.m100208f(c18850p, "$this_runCatching");
        ((InterfaceC18836b) c18850p.m103742Dp()).mo73234vs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qq */
    public static final void m98863qq(final C18850p c18850p, AbstractC3552t abstractC3552t, AbstractC29069a.a aVar, int i11) {
        int i12;
        AbstractC19074t.m100208f(c18850p, "this$0");
        AbstractC19074t.m100208f(abstractC3552t, "$media");
        AbstractC19074t.m100208f(aVar, "$data");
        C23024b7.f111993a.m118075x(c18850p.f94167x);
        AbstractC19444a.m101695c(new Runnable() { // from class: fa0.d
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98864rq(C18850p.this);
            }
        });
        if (abstractC3552t instanceof C3551s) {
            i12 = 10;
        } else if (abstractC3552t instanceof C3549q) {
            i12 = 9;
        } else if (abstractC3552t instanceof C3550r) {
            i12 = 1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C19955h.f98250a.m103730s(c18850p.f94167x, aVar, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rq */
    public static final void m98864rq(C18850p c18850p) {
        AbstractC19074t.m100208f(c18850p, "this$0");
        ((InterfaceC18836b) c18850p.m103742Dp()).mo73234vs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sq */
    public static final void m98865sq(final C18850p c18850p, AbstractC3552t abstractC3552t, AbstractC29069a abstractC29069a, int i11) {
        int i12;
        AbstractC19074t.m100208f(c18850p, "$this_runCatching");
        AbstractC19074t.m100208f(abstractC3552t, "$media");
        AbstractC19074t.m100208f(abstractC29069a, "$data");
        C23024b7.f111993a.m118075x(c18850p.f94167x);
        AbstractC19444a.m101695c(new Runnable() { // from class: fa0.f
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98866tq(C18850p.this);
            }
        });
        if (abstractC3552t instanceof C3551s) {
            i12 = 10;
        } else if (abstractC3552t instanceof C3549q) {
            i12 = 9;
        } else if (abstractC3552t instanceof C3550r) {
            i12 = 1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C19955h.f98250a.m103730s(c18850p.f94167x, abstractC29069a, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tq */
    public static final void m98866tq(C18850p c18850p) {
        AbstractC19074t.m100208f(c18850p, "$this_runCatching");
        ((InterfaceC18836b) c18850p.m103742Dp()).mo73234vs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uq */
    public static final void m98867uq(final C18850p c18850p, AbstractC29069a abstractC29069a, int i11) {
        AbstractC19074t.m100208f(c18850p, "this$0");
        AbstractC19074t.m100208f(abstractC29069a, "$data");
        C23024b7.f111993a.m118075x(c18850p.f94167x);
        AbstractC19444a.m101695c(new Runnable() { // from class: fa0.o
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98868vq(C18850p.this);
            }
        });
        C19955h.f98250a.m103730s(c18850p.f94167x, abstractC29069a, i11, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vq */
    public static final void m98868vq(C18850p c18850p) {
        AbstractC19074t.m100208f(c18850p, "this$0");
        ((InterfaceC18836b) c18850p.m103742Dp()).mo73234vs();
    }

    /* renamed from: xq */
    private final void m98869xq(List list) {
        Object obj;
        AbstractC29080l m98853dq = m98853dq();
        if (m98853dq == null) {
            ((InterfaceC18836b) m103742Dp()).mo73225Qw(true);
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((C29078j) obj).m145307g(), m98853dq)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C29078j c29078j = (C29078j) obj;
        if (c29078j == null) {
            c29078j = new C29078j(m98853dq, new ArrayList(), 0, null, 0, false, 0, 120, null);
        }
        m98873wq(c29078j);
        c29078j.m145308h(-1);
        if (!this.f94164u) {
            this.f94165v = true;
        } else {
            this.f94165v = false;
            ((InterfaceC18836b) m103742Dp()).mo73225Qw(true);
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: C9 */
    public String mo98814C9() {
        return m98850aq();
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        String str;
        super.mo994F2();
        this.f94166w.m145993b();
        C13029a c13029a = (C13029a) m103744Fp();
        if (c13029a != null) {
            str = c13029a.m73244h();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(str, this.f94167x.m101211f())) {
            C13029a c13029a2 = (C13029a) m103744Fp();
            if (c13029a2 == null || c13029a2.m73240d() != this.f94167x.m101235r()) {
                C23744a.Companion.m124119a().m124116d(7001, this.f94167x.m101211f(), Integer.valueOf(this.f94167x.m101235r()));
            }
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Gh */
    public C29078j mo98815Gh() {
        return this.f94156A;
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Hf */
    public void mo98816Hf(final AbstractC29069a abstractC29069a, final AbstractC3552t abstractC3552t, final int i11, int i12) {
        Object m129218b;
        AbstractC19074t.m100208f(abstractC29069a, "data");
        AbstractC19074t.m100208f(abstractC3552t, "media");
        try {
            C24861r.a aVar = C24861r.f119264q;
            this.f94167x.m101198X("1");
            if (i12 == AbstractC8020f0.share) {
                ((InterfaceC18836b) m103742Dp()).mo73232lE(abstractC29069a, abstractC3552t);
            } else if (i12 == AbstractC8020f0.str_media_store_copy_link) {
                if (abstractC3552t instanceof C3551s) {
                    ((InterfaceC18836b) m103742Dp()).mo73224G1(((C3551s) abstractC3552t).m18051f());
                } else if (abstractC3552t instanceof C3550r) {
                    InterfaceC18836b interfaceC18836b = (InterfaceC18836b) m103742Dp();
                    String m95090b5 = ((C3550r) abstractC3552t).m18045a().m40599m().m95090b5();
                    AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
                    interfaceC18836b.mo73224G1(m95090b5);
                }
            } else if (i12 != AbstractC8020f0.str_media_store_download_file && i12 == AbstractC8020f0.str_view_original_msg) {
                if (abstractC29069a instanceof AbstractC29069a.a) {
                    ((InterfaceC18836b) m103742Dp()).mo73235wk(((AbstractC29069a.a) abstractC29069a).m145142f().m18037d().m18055d(), MessageId.Companion.m41063a(((AbstractC29069a.a) abstractC29069a).m145142f().m18037d().m18052a(), ((AbstractC29069a.a) abstractC29069a).m145142f().m18037d().m18053b(), ((AbstractC29069a.a) abstractC29069a).m145142f().m18037d().m18055d(), ((AbstractC29069a.a) abstractC29069a).m145142f().m18037d().m18056e()), Integer.valueOf(this.f94167x.m101237s()), m98870fq());
                } else if (abstractC29069a instanceof AbstractC29069a.e) {
                    InterfaceC18836b interfaceC18836b2 = (InterfaceC18836b) m103742Dp();
                    String mo95039W2 = ((AbstractC29069a.e) abstractC29069a).m145174b().m40599m().mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    interfaceC18836b2.mo73235wk(mo95039W2, ((AbstractC29069a.e) abstractC29069a).m145174b().m40571M(), Integer.valueOf(this.f94167x.m101237s()), m98870fq());
                } else if (abstractC29069a instanceof AbstractC29069a.j) {
                    InterfaceC18836b interfaceC18836b3 = (InterfaceC18836b) m103742Dp();
                    String mo95039W22 = ((AbstractC29069a.j) abstractC29069a).m145186b().m40599m().mo95039W2();
                    AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                    interfaceC18836b3.mo73235wk(mo95039W22, ((AbstractC29069a.j) abstractC29069a).m145186b().m40571M(), Integer.valueOf(this.f94167x.m101237s()), m98870fq());
                }
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fa0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C18850p.m98865sq(C18850p.this, abstractC3552t, abstractC29069a, i11);
                }
            });
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Ii */
    public void mo98817Ii() {
        this.f94164u = true;
        if (this.f94165v) {
            this.f94165v = false;
            ((InterfaceC18836b) m103742Dp()).mo73225Qw(true);
        }
        ((InterfaceC18836b) m103742Dp()).mo73228Wk(C23212s8.m119610r(AbstractC16781w.SecondaryBackgroundColor));
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Oe */
    public void mo98818Oe(C29070b c29070b) {
        C19319e1 c19319e1;
        AbstractC19074t.m100208f(c29070b, "pageScrollInfo");
        AbstractC29080l m98853dq = m98853dq();
        if (m98853dq != null && C19318e0.Companion.m101097f(m98853dq) && c29070b.m145235a() >= Math.max(0, c29070b.m145236b() - 25)) {
            AbstractC19358r1 m98851bq = m98851bq();
            if (m98851bq instanceof C19319e1) {
                c19319e1 = (C19319e1) m98851bq;
            } else {
                c19319e1 = null;
            }
            if (c19319e1 != null && !c19319e1.isCancelled()) {
                new C19318e0(c19319e1, new C18316b("ACTION_HANDLE_LOAD_MORE", c29070b, m98853dq, null, 8, null), m98870fq(), c19319e1.m101106o()).m101442j();
            }
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Q */
    public void mo98819Q() {
        m98859mq();
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: U */
    public void mo98820U(int i11, Object... objArr) {
        Object m131364L;
        AbstractC19074t.m100208f(objArr, "args");
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (i11 == 6) {
                m131364L = AbstractC25358n.m131364L(objArr, 0);
                MessageId messageId = (MessageId) m131364L;
                if (messageId != null) {
                    ((InterfaceC18836b) m103742Dp()).mo73223F5(messageId);
                }
            }
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Uj */
    public void mo98821Uj(final AbstractC29069a abstractC29069a, final int i11) {
        AbstractC19074t.m100208f(abstractC29069a, "data");
        this.f94167x.m101198X("1");
        if (abstractC29069a instanceof AbstractC29069a.a) {
            AbstractC29069a.a aVar = (AbstractC29069a.a) abstractC29069a;
            ((InterfaceC18836b) m103742Dp()).mo73235wk(aVar.m145142f().m18037d().m18055d(), MessageId.Companion.m41063a(aVar.m145142f().m18037d().m18052a(), aVar.m145142f().m18037d().m18053b(), aVar.m145142f().m18037d().m18055d(), aVar.m145142f().m18037d().m18056e()), Integer.valueOf(this.f94167x.m101237s()), m98870fq());
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fa0.c
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98867uq(C18850p.this, abstractC29069a, i11);
            }
        });
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: Vg */
    public void mo98822Vg(AbstractC29069a abstractC29069a, int i11) {
        AbstractC19074t.m100208f(abstractC29069a, "data");
        if (abstractC29069a instanceof AbstractC29069a.e) {
            mo98823ib(abstractC29069a, new C3550r(((AbstractC29069a.e) abstractC29069a).m145174b()), i11);
        } else if (abstractC29069a instanceof AbstractC29069a.j) {
            mo98823ib(abstractC29069a, new C3550r(((AbstractC29069a.j) abstractC29069a).m145186b()), i11);
        }
    }

    /* renamed from: fq */
    public final String m98870fq() {
        return (String) this.f94157B.getValue();
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: gq, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(final C18316b c18316b) {
        AbstractC29069a.a aVar;
        C17945a0 m145141e;
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        switch (m97246b.hashCode()) {
            case -1956766579:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_OPEN_FILE")) {
                    return null;
                }
                final b bVar = new b(c18316b, this);
                if (AbstractC19444a.m101693a()) {
                    bVar.mo12V4();
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: fa0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18850p.m98855hq(InterfaceC18494a.this);
                    }
                });
                return null;
            case -1710800710:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_DISPATCH_DOWNLOAD_FILE_PROGRESS") || !(c18316b.m97245a() instanceof Integer) || !(c18316b.m97247c() instanceof AbstractC29069a.a) || !(c18316b.m97248d() instanceof MessageId)) {
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: fa0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18850p.m98856iq(C18850p.this, c18316b);
                    }
                });
                return null;
            case -1666117543:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_OPEN_RECOMMENED_CONTACT") || !(c18316b.m97245a() instanceof AbstractC29069a.a) || !(c18316b.m97247c() instanceof String)) {
                    return null;
                }
                final c cVar = new c(c18316b, this);
                if (AbstractC19444a.m101693a()) {
                    cVar.mo12V4();
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: fa0.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18850p.m98858kq(InterfaceC18494a.this);
                    }
                });
                return null;
            case -899125093:
                if (!m97246b.equals("HandleActionCompactMessageItem:ACTION_SHOW_ERROR_GENERAL_MESSAGE")) {
                    return null;
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: fa0.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18850p.m98857jq();
                    }
                });
                return null;
            case 241870710:
                if (!m97246b.equals("ACTION_START_SEARCH_TASK")) {
                    return null;
                }
                mo98826nc();
                return null;
            case 866207848:
                if (!m97246b.equals("Search.GetSearchSessionData")) {
                    return null;
                }
                return new C18316b("Search.GetSearchSessionData", this.f94167x, null, null, 12, null);
            case 1517742221:
                if (!m97246b.equals("Search.Result.ToggleUploadDownloadCallback")) {
                    return null;
                }
                Object m97245a = c18316b.m97245a();
                if (m97245a instanceof AbstractC29069a.a) {
                    aVar = (AbstractC29069a.a) m97245a;
                } else {
                    aVar = null;
                }
                if (aVar == null || (m145141e = aVar.m145141e()) == null) {
                    return null;
                }
                mo98827no(m145141e, AbstractC19074t.m100204b(c18316b.m97247c(), Boolean.TRUE));
                return null;
            case 1523681309:
                m97246b.equals("ACTION_RESULT_JUMP_TO_TARGET");
                return null;
            case 1887550944:
                if (!m97246b.equals("ACTION_SUBMIT_LIST_RESULT") || !(c18316b.m97245a() instanceof C29079k)) {
                    return null;
                }
                m98869xq(((C29079k) c18316b.m97245a()).m145311a());
                return null;
            default:
                return null;
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: ib */
    public void mo98823ib(AbstractC29069a abstractC29069a, AbstractC3552t abstractC3552t, int i11) {
        Object m129218b;
        AbstractC19074t.m100208f(abstractC29069a, "data");
        AbstractC19074t.m100208f(abstractC3552t, "media");
        try {
            C24861r.a aVar = C24861r.f119264q;
            List list = null;
            if (!(abstractC3552t instanceof C3549q)) {
                if (abstractC3552t instanceof C3551s) {
                    if (!AbstractC19074t.m100204b(((C3551s) abstractC3552t).m18046a(), "recommened.user")) {
                        list = AbstractC25368s.m131506n(Integer.valueOf(AbstractC8020f0.share), Integer.valueOf(AbstractC8020f0.str_media_store_copy_link));
                    }
                } else if (abstractC3552t instanceof C3550r) {
                    if (abstractC29069a instanceof AbstractC29069a.e) {
                        list = AbstractC25368s.m131506n(Integer.valueOf(AbstractC8020f0.share), Integer.valueOf(AbstractC8020f0.str_view_original_msg));
                    } else if (abstractC29069a instanceof AbstractC29069a.j) {
                        list = AbstractC25368s.m131506n(Integer.valueOf(AbstractC8020f0.share), Integer.valueOf(AbstractC8020f0.str_media_store_copy_link), Integer.valueOf(AbstractC8020f0.str_view_original_msg));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                ((InterfaceC18836b) m103742Dp()).mo73226Rt(abstractC29069a, abstractC3552t, i11, list);
            }
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: l */
    public void mo98824l(int i11) {
        if (i11 == 16908332) {
            m98859mq();
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: lq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C13029a c13029a, InterfaceC19968g interfaceC19968g) {
        String str;
        super.mo995Nd(c13029a, interfaceC19968g);
        C19325g1 c19325g1 = this.f94167x;
        if (c13029a == null || (str = c13029a.m73244h()) == null) {
            str = "";
        }
        c19325g1.m101204b0(str);
        if (c13029a != null) {
            long longValue = Long.valueOf(c13029a.m73241e()).longValue();
            if (longValue != 0) {
                this.f94167x.m101252z0(longValue);
            }
        }
        if (c13029a != null) {
            this.f94167x.m101226m0(Integer.valueOf(c13029a.m73240d()).intValue());
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: mm */
    public void mo98825mm() {
        m98859mq();
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: nc */
    public void mo98826nc() {
        AbstractC19358r1 abstractC19358r1 = this.f94163t;
        if (abstractC19358r1 != null) {
            abstractC19358r1.m101436c();
        }
        C19319e1 c19319e1 = new C19319e1(this, m98870fq(), null, m98854eq(), m98849Zp(), false, 4, null);
        c19319e1.m101442j();
        this.f94163t = c19319e1;
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: no */
    public void mo98827no(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (z11) {
            this.f94161F.add(c17945a0);
            c17945a0.m94859Bb(this.f94162G);
        } else {
            this.f94161F.remove(c17945a0);
            c17945a0.m94997R9(this.f94162G);
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: og */
    public void mo98828og(final AbstractC29069a.a aVar, final AbstractC3552t abstractC3552t, final int i11) {
        C3551s c3551s;
        String str;
        AbstractC19074t.m100208f(aVar, "data");
        AbstractC19074t.m100208f(abstractC3552t, "media");
        this.f94167x.m101198X("1");
        if (abstractC3552t instanceof C3551s) {
            if (AbstractC19074t.m100204b(((C3551s) abstractC3552t).m18046a(), "recommened.user")) {
                new C19308b(this, new C18316b("HandleActionCompactMessageItem:ACTION_CHECK_AND_OPEN_RECOMMENED_CONTACT", aVar, null, null, 12, null), m98870fq()).m101442j();
            } else {
                AbstractC3552t m18035b = aVar.m145142f().m18035b();
                if (m18035b instanceof C3551s) {
                    c3551s = (C3551s) m18035b;
                } else {
                    c3551s = null;
                }
                if (c3551s == null || (str = c3551s.m18051f()) == null) {
                    str = "";
                }
                if (!new C24329j("(?i)^(http://|https://).*").m127018f(str)) {
                    str = "https://" + str;
                }
                ((InterfaceC18836b) m103742Dp()).mo73222Bt(str);
            }
        } else if (abstractC3552t instanceof C3549q) {
            new C19308b(this, new C18316b("HandleActionCompactMessageItem:ACTION_CHECK_DOWNLOAD_AND_OPEN_FILE", aVar, abstractC3552t, null, 8, null), m98870fq()).m101442j();
        } else {
            boolean z11 = abstractC3552t instanceof C3550r;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fa0.h
            @Override // java.lang.Runnable
            public final void run() {
                C18850p.m98863qq(C18850p.this, abstractC3552t, aVar, i11);
            }
        });
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: p5 */
    public void mo98829p5(boolean z11) {
        if (z11) {
            for (C17945a0 c17945a0 : this.f94161F) {
                InterfaceC18836b interfaceC18836b = (InterfaceC18836b) m103742Dp();
                MessageId m95029V3 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                interfaceC18836b.mo73223F5(m95029V3);
                c17945a0.m94859Bb(this.f94162G);
            }
            return;
        }
        Iterator it = this.f94161F.iterator();
        while (it.hasNext()) {
            ((C17945a0) it.next()).m94997R9(this.f94162G);
        }
        this.f94161F.clear();
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: pf */
    public void mo98830pf(final AbstractC29069a.a aVar, final int i11) {
        Object m129218b;
        AbstractC19074t.m100208f(aVar, "data");
        try {
            C24861r.a aVar2 = C24861r.f119264q;
            ((InterfaceC18836b) m103742Dp()).mo73230gE(m98870fq(), m98853dq(), m98852cq(), aVar.m145142f().m18037d().m18055d(), aVar.m145150n(), m98849Zp().m145178d(), this.f94167x.m101251z(), this.f94167x.m101235r());
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fa0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C18850p.m98861oq(C18850p.this, aVar, i11);
                }
            });
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Throwable m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            m129221e.printStackTrace();
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: ql */
    public void mo98831ql(AbstractC29069a.f fVar) {
        C19319e1 c19319e1;
        AbstractC19074t.m100208f(fVar, "data");
        AbstractC19358r1 m98851bq = m98851bq();
        if (m98851bq instanceof C19319e1) {
            c19319e1 = (C19319e1) m98851bq;
        } else {
            c19319e1 = null;
        }
        if (c19319e1 != null && !c19319e1.isCancelled()) {
            new C19318e0(c19319e1, new C18316b("ACTION_HANDLE_TAB_RELOAD", fVar, m98853dq(), null, 8, null), m98870fq(), c19319e1.m101106o()).m101442j();
        }
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: wk */
    public void mo98832wk() {
        InterfaceC18835a.a.m98834a(this);
    }

    /* renamed from: wq */
    public void m98873wq(C29078j c29078j) {
        this.f94156A = c29078j;
    }

    @Override // fa0.InterfaceC18835a
    /* renamed from: y0 */
    public AbstractC29069a.f mo98833y0() {
        return this.f94167x.m101247x().m145291s().mo145251y0();
    }
}
