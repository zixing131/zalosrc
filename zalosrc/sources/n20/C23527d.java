package n20;

import androidx.lifecycle.AbstractC1798u0;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import j20.InterfaceC20907a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n20.AbstractC23524a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import r10.C25604a;
import r10.C25605b;
import r10.C25608e;
import r10.C25609f;
import r10.C25612i;
import r10.C25613j;
import r10.C25614k;
import t10.C26449a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: n20.d */
/* loaded from: classes5.dex */
public final class C23527d extends AbstractC23524a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final InterfaceC24854k f114278A;

    /* renamed from: B */
    private final MutableStateFlow f114279B;

    /* renamed from: C */
    private final StateFlow f114280C;

    /* renamed from: D */
    private final MutableStateFlow f114281D;

    /* renamed from: E */
    private final StateFlow f114282E;

    /* renamed from: F */
    private final MutableStateFlow f114283F;

    /* renamed from: G */
    private final StateFlow f114284G;

    /* renamed from: H */
    private final MutableStateFlow f114285H;

    /* renamed from: I */
    private final StateFlow f114286I;

    /* renamed from: u */
    private final InterfaceC24854k f114287u;

    /* renamed from: v */
    private final InterfaceC24854k f114288v;

    /* renamed from: w */
    private final InterfaceC24854k f114289w;

    /* renamed from: x */
    private final InterfaceC24854k f114290x;

    /* renamed from: y */
    private final InterfaceC24854k f114291y;

    /* renamed from: z */
    private final InterfaceC24854k f114292z;

    /* renamed from: n20.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: n20.d$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114293t;

        /* renamed from: n20.d$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114295t;

            /* renamed from: u */
            /* synthetic */ Object f114296u;

            /* renamed from: v */
            final /* synthetic */ C23527d f114297v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23527d c23527d, Continuation continuation) {
                super(3, continuation);
                this.f114297v = c23527d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114295t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114297v.f114281D.setValue(new InterfaceC20907a.a((Throwable) this.f114296u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114297v, continuation);
                aVar.f114296u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.d$b$b */
        /* loaded from: classes5.dex */
        public static final class C32901b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23527d f114298p;

            C32901b(C23527d c23527d) {
                this.f114298p = c23527d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(Channel channel, Continuation continuation) {
                Object aVar;
                MutableStateFlow mutableStateFlow = this.f114298p.f114281D;
                if (channel != null) {
                    aVar = new InterfaceC20907a.d(channel);
                } else {
                    aVar = new InterfaceC20907a.a(null, 1, null);
                }
                mutableStateFlow.setValue(aVar);
                return C24848g0.f119245a;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114293t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C23527d.this.m123529e0().m101506a();
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23527d.this, null))) != null) {
                    C32901b c32901b = new C32901b(C23527d.this);
                    this.f114293t = 1;
                    if (m113288f.mo97893a(c32901b, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: n20.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114299t;

        /* renamed from: n20.d$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114301t;

            /* renamed from: u */
            final /* synthetic */ C23527d f114302u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23527d c23527d, Continuation continuation) {
                super(3, continuation);
                this.f114302u = c23527d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114301t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114302u.f114283F.setValue(AbstractC29094b.m145339a(false));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                return new a(this.f114302u, continuation).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.d$c$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23527d f114303p;

            b(C23527d c23527d) {
                this.f114303p = c23527d;
            }

            /* renamed from: a */
            public final Object m123560a(boolean z11, Continuation continuation) {
                this.f114303p.f114283F.setValue(AbstractC29094b.m145339a(z11));
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m123560a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114299t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C23527d.this.m123528c0().m101506a();
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23527d.this, null))) != null) {
                    b bVar = new b(C23527d.this);
                    this.f114299t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f114304q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25604a mo12V4() {
            return C26449a.f125639a.m136338c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f114305q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25605b mo12V4() {
            return C26449a.f125639a.m136339d();
        }
    }

    /* renamed from: n20.d$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114306t;

        /* renamed from: n20.d$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114308t;

            /* renamed from: u */
            /* synthetic */ Object f114309u;

            /* renamed from: v */
            final /* synthetic */ C23527d f114310v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23527d c23527d, Continuation continuation) {
                super(3, continuation);
                this.f114310v = c23527d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114308t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114310v.f114279B.setValue(new InterfaceC20907a.a((Throwable) this.f114309u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114310v, continuation);
                aVar.f114309u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.d$f$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23527d f114311p;

            b(C23527d c23527d) {
                this.f114311p = c23527d;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(User user, Continuation continuation) {
                Object aVar;
                MutableStateFlow mutableStateFlow = this.f114311p.f114279B;
                if (user != null) {
                    aVar = new InterfaceC20907a.d(user);
                } else {
                    aVar = new InterfaceC20907a.a(null, 1, null);
                }
                mutableStateFlow.setValue(aVar);
                return C24848g0.f119245a;
            }
        }

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114306t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C23527d.this.m123531g0().m101506a();
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23527d.this, null))) != null) {
                    b bVar = new b(C23527d.this);
                    this.f114306t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: n20.d$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114312t;

        /* renamed from: n20.d$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114314t;

            /* renamed from: u */
            final /* synthetic */ C23527d f114315u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23527d c23527d, Continuation continuation) {
                super(3, continuation);
                this.f114315u = c23527d;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114314t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114315u.f114285H.setValue(AbstractC29094b.m145339a(false));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                return new a(this.f114315u, continuation).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.d$g$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23527d f114316p;

            b(C23527d c23527d) {
                this.f114316p = c23527d;
            }

            /* renamed from: a */
            public final Object m123568a(boolean z11, Continuation continuation) {
                this.f114316p.f114285H.setValue(AbstractC29094b.m145339a(z11));
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m123568a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114312t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) C23527d.this.m123530f0().m101506a();
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23527d.this, null))) != null) {
                    b bVar = new b(C23527d.this);
                    this.f114312t = 1;
                    if (m113288f.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f114317q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25608e mo12V4() {
            return C26449a.f125639a.m136342g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f114318q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25609f mo12V4() {
            return C26449a.f125639a.m136343h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f114319q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25612i mo12V4() {
            return C26449a.f125639a.m136346k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f114320q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25613j mo12V4() {
            return C26449a.f125639a.m136347l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.d$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f114321q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25614k mo12V4() {
            return C26449a.f125639a.m136348m();
        }
    }

    public C23527d() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        m129210a = AbstractC24856m.m129210a(e.f114305q);
        this.f114287u = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f114304q);
        this.f114288v = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(j.f114319q);
        this.f114289w = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(i.f114318q);
        this.f114290x = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(h.f114317q);
        this.f114291y = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(l.f114321q);
        this.f114292z = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(k.f114320q);
        this.f114278A = m129210a7;
        InterfaceC20907a.b bVar = InterfaceC20907a.b.f102732a;
        MutableStateFlow m113503a = StateFlowKt.m113503a(bVar);
        this.f114279B = m113503a;
        this.f114280C = FlowKt.m113284b(m113503a);
        MutableStateFlow m113503a2 = StateFlowKt.m113503a(bVar);
        this.f114281D = m113503a2;
        this.f114282E = FlowKt.m113284b(m113503a2);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow m113503a3 = StateFlowKt.m113503a(bool);
        this.f114283F = m113503a3;
        this.f114284G = FlowKt.m113284b(m113503a3);
        MutableStateFlow m113503a4 = StateFlowKt.m113503a(bool);
        this.f114285H = m113503a4;
        this.f114286I = FlowKt.m113284b(m113503a4);
    }

    /* renamed from: X */
    private final void m123526X() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b(null), 3, null);
    }

    /* renamed from: Z */
    private final void m123527Z() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(null), 3, null);
    }

    /* renamed from: c0 */
    public final C25604a m123528c0() {
        return (C25604a) this.f114288v.getValue();
    }

    /* renamed from: e0 */
    public final C25605b m123529e0() {
        return (C25605b) this.f114287u.getValue();
    }

    /* renamed from: f0 */
    public final C25608e m123530f0() {
        return (C25608e) this.f114291y.getValue();
    }

    /* renamed from: g0 */
    public final C25609f m123531g0() {
        return (C25609f) this.f114290x.getValue();
    }

    /* renamed from: h0 */
    private final C25612i m123532h0() {
        return (C25612i) this.f114289w.getValue();
    }

    /* renamed from: i0 */
    private final C25613j m123533i0() {
        return (C25613j) this.f114278A.getValue();
    }

    /* renamed from: j0 */
    private final C25614k m123534j0() {
        return (C25614k) this.f114292z.getValue();
    }

    /* renamed from: k0 */
    private final void m123535k0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new f(null), 3, null);
    }

    /* renamed from: m0 */
    private final void m123536m0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new g(null), 3, null);
    }

    /* renamed from: A0 */
    public final void m123537A0() {
        InterfaceC20907a.d dVar;
        User user;
        Object value = this.f114280C.getValue();
        if (value instanceof InterfaceC20907a.d) {
            dVar = (InterfaceC20907a.d) value;
        } else {
            dVar = null;
        }
        if (dVar != null && (user = (User) dVar.m109379a()) != null) {
            m123443N(new AbstractC23524a.b("show_view_more_bts", user));
        }
    }

    /* renamed from: Y */
    public final StateFlow m123538Y() {
        return this.f114282E;
    }

    /* renamed from: a0 */
    public final StateFlow m123539a0() {
        return this.f114284G;
    }

    /* renamed from: b0 */
    public final void m123540b0() {
        m123535k0();
        m123526X();
        m123527Z();
        m123536m0();
    }

    /* renamed from: l0 */
    public final StateFlow m123541l0() {
        return this.f114280C;
    }

    /* renamed from: n0 */
    public final StateFlow m123542n0() {
        return this.f114286I;
    }

    /* renamed from: o0 */
    public final void m123543o0() {
        m123443N(new AbstractC23524a.b("open_blocked_page", null, 2, null));
    }

    /* renamed from: p0 */
    public final void m123544p0() {
        m123443N(new AbstractC23524a.b("open_bookmark_page", null, 2, null));
    }

    /* renamed from: q0 */
    public final void m123545q0(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        m123443N(new AbstractC23524a.b("open_channel_page", channel));
    }

    /* renamed from: r0 */
    public final void m123546r0() {
        m123526X();
    }

    /* renamed from: s0 */
    public final void m123547s0() {
        m123443N(new AbstractC23524a.b("open_channel_notif_page", null, 2, null));
        C25612i m123532h0 = m123532h0();
        Boolean bool = Boolean.FALSE;
        m123532h0.m101508a(bool);
        this.f114283F.setValue(bool);
        if (!((Boolean) this.f114285H.getValue()).booleanValue()) {
            NotificationReceiver.Companion.m53755c(false);
            m123533i0().m101508a(bool);
        }
    }

    /* renamed from: t0 */
    public final void m123548t0(boolean z11) {
        this.f114283F.setValue(Boolean.valueOf(z11));
    }

    /* renamed from: u0 */
    public final void m123549u0() {
        m123443N(new AbstractC23524a.b("open_following_list", null, 2, null));
    }

    /* renamed from: v0 */
    public final void m123550v0(String str) {
        AbstractC19074t.m100208f(str, "statsUrl");
        m123443N(new AbstractC23524a.b("open_insight", str));
    }

    /* renamed from: w0 */
    public final void m123551w0() {
        m123443N(new AbstractC23524a.b("open_liked_page", null, 2, null));
    }

    /* renamed from: x0 */
    public final void m123552x0(String str) {
        AbstractC19074t.m100208f(str, "privacyUrl");
        m123443N(new AbstractC23524a.b("open_privacy", str));
    }

    /* renamed from: y0 */
    public final void m123553y0() {
        m123443N(new AbstractC23524a.b("open_user_notif_page", null, 2, null));
        C25614k m123534j0 = m123534j0();
        Boolean bool = Boolean.FALSE;
        m123534j0.m101508a(bool);
        this.f114285H.setValue(bool);
        if (!((Boolean) this.f114284G.getValue()).booleanValue()) {
            NotificationReceiver.Companion.m53755c(false);
            m123533i0().m101508a(bool);
        }
    }

    /* renamed from: z0 */
    public final void m123554z0(boolean z11) {
        this.f114285H.setValue(Boolean.valueOf(z11));
    }
}
