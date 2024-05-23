package n20;

import androidx.lifecycle.AbstractC1798u0;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import j20.InterfaceC20907a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n20.AbstractC23524a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import r10.C25607d;
import r10.C25611h;
import t10.C26449a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: n20.c */
/* loaded from: classes5.dex */
public final class C23526c extends AbstractC23524a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final MutableStateFlow f114232A;

    /* renamed from: B */
    private final StateFlow f114233B;

    /* renamed from: C */
    private final MutableStateFlow f114234C;

    /* renamed from: D */
    private final StateFlow f114235D;

    /* renamed from: E */
    private final MutableSharedFlow f114236E;

    /* renamed from: F */
    private final SharedFlow f114237F;

    /* renamed from: G */
    private int f114238G;

    /* renamed from: u */
    private final C25607d f114239u;

    /* renamed from: v */
    private final C25611h f114240v;

    /* renamed from: w */
    private final MutableStateFlow f114241w;

    /* renamed from: x */
    private final StateFlow f114242x;

    /* renamed from: y */
    private final MutableStateFlow f114243y;

    /* renamed from: z */
    private final StateFlow f114244z;

    /* renamed from: n20.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114245t;

        /* renamed from: n20.c$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114247t;

            /* renamed from: u */
            /* synthetic */ Object f114248u;

            /* renamed from: v */
            final /* synthetic */ C23526c f114249v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23526c c23526c, Continuation continuation) {
                super(3, continuation);
                this.f114249v = c23526c;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114247t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114249v.f114241w.setValue(new InterfaceC20907a.a((Throwable) this.f114248u));
                    this.f114249v.f114238G = 0;
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114249v, continuation);
                aVar.f114248u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.c$b$b */
        /* loaded from: classes5.dex */
        public static final class C32900b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23526c f114250p;

            C32900b(C23526c c23526c) {
                this.f114250p = c23526c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(Section section, Continuation continuation) {
                this.f114250p.f114241w.setValue(new InterfaceC20907a.d(section));
                this.f114250p.f114238G = section.m51168m().size();
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
            int i11 = this.f114245t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23526c.this.f114241w.setValue(InterfaceC20907a.c.f102733a);
                Flow flow = (Flow) C23526c.this.f114239u.m101509a(new C25607d.a(null));
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23526c.this, null))) != null) {
                    C32900b c32900b = new C32900b(C23526c.this);
                    this.f114245t = 1;
                    if (m113288f.mo97893a(c32900b, this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.c$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114251t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f114253v;

        /* renamed from: n20.c$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114254t;

            /* renamed from: u */
            /* synthetic */ Object f114255u;

            /* renamed from: v */
            final /* synthetic */ C23526c f114256v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23526c c23526c, Continuation continuation) {
                super(3, continuation);
                this.f114256v = c23526c;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114254t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114256v.f114241w.setValue(new InterfaceC20907a.a((Throwable) this.f114255u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114256v, continuation);
                aVar.f114255u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.c$c$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23526c f114257p;

            b(C23526c c23526c) {
                this.f114257p = c23526c;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(Section section, Continuation continuation) {
                this.f114257p.f114241w.setValue(new InterfaceC20907a.d(section));
                this.f114257p.f114238G += section.m51168m().size();
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(2, continuation);
            this.f114253v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f114253v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114251t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23526c.this.f114241w.setValue(InterfaceC20907a.c.f102733a);
                Flow flow = (Flow) C23526c.this.f114239u.m101509a(new C25607d.a(this.f114253v));
                if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23526c.this, null))) != null) {
                    b bVar = new b(C23526c.this);
                    this.f114251t = 1;
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
    /* renamed from: n20.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114258t;

        /* renamed from: v */
        final /* synthetic */ Channel f114260v;

        /* renamed from: n20.c$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114261t;

            /* renamed from: u */
            /* synthetic */ Object f114262u;

            /* renamed from: v */
            final /* synthetic */ C23526c f114263v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23526c c23526c, Continuation continuation) {
                super(3, continuation);
                this.f114263v = c23526c;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114261t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114263v.f114234C.setValue(new InterfaceC20907a.a((Throwable) this.f114262u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114263v, continuation);
                aVar.f114262u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.c$d$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23526c f114264p;

            /* renamed from: q */
            final /* synthetic */ Channel f114265q;

            b(C23526c c23526c, Channel channel) {
                this.f114264p = c23526c;
                this.f114265q = channel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(PersonalizeChannel personalizeChannel, Continuation continuation) {
                this.f114264p.f114234C.setValue(new InterfaceC20907a.d(this.f114265q));
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Channel channel, Continuation continuation) {
            super(2, continuation);
            this.f114260v = channel;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f114260v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114258t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C23526c c23526c = C23526c.this;
                AbstractC23524a.b bVar = new AbstractC23524a.b("follow", this.f114260v);
                this.f114258t = 1;
                if (c23526c.m123444O(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            C23526c.this.f114234C.setValue(InterfaceC20907a.c.f102733a);
            Flow flow = (Flow) C23526c.this.f114240v.m101509a(new C25611h.a.C32964a(this.f114260v.m50769l(), null, null, null, null, 30, null));
            if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23526c.this, null))) != null) {
                b bVar2 = new b(C23526c.this, this.f114260v);
                this.f114258t = 2;
                if (m113288f.mo97893a(bVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.c$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114266t;

        /* renamed from: v */
        final /* synthetic */ Channel f114268v;

        /* renamed from: n20.c$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f114269t;

            /* renamed from: u */
            /* synthetic */ Object f114270u;

            /* renamed from: v */
            final /* synthetic */ C23526c f114271v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C23526c c23526c, Continuation continuation) {
                super(3, continuation);
                this.f114271v = c23526c;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f114269t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f114271v.f114232A.setValue(new InterfaceC20907a.a((Throwable) this.f114270u));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r */
            public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
                a aVar = new a(this.f114271v, continuation);
                aVar.f114270u = th2;
                return aVar.mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: n20.c$e$b */
        /* loaded from: classes5.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C23526c f114272p;

            /* renamed from: q */
            final /* synthetic */ Channel f114273q;

            b(C23526c c23526c, Channel channel) {
                this.f114272p = c23526c;
                this.f114273q = channel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(PersonalizeChannel personalizeChannel, Continuation continuation) {
                this.f114272p.f114232A.setValue(new InterfaceC20907a.d(this.f114273q));
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Channel channel, Continuation continuation) {
            super(2, continuation);
            this.f114268v = channel;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f114268v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow m113288f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114266t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C23526c c23526c = C23526c.this;
                AbstractC23524a.b bVar = new AbstractC23524a.b("unfollow", this.f114268v);
                this.f114266t = 1;
                if (c23526c.m123444O(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            C23526c.this.f114232A.setValue(InterfaceC20907a.c.f102733a);
            Flow flow = (Flow) C23526c.this.f114240v.m101509a(new C25611h.a.b(this.f114268v.m50769l(), null, null, 6, null));
            if (flow != null && (m113288f = FlowKt.m113288f(flow, new a(C23526c.this, null))) != null) {
                b bVar2 = new b(C23526c.this, this.f114268v);
                this.f114266t = 2;
                if (m113288f.mo97893a(bVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n20.c$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f114274t;

        /* renamed from: v */
        final /* synthetic */ String f114276v;

        /* renamed from: w */
        final /* synthetic */ boolean f114277w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f114276v = str;
            this.f114277w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f114276v, this.f114277w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f114274t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C23526c.this.f114236E;
                C24860q c24860q = new C24860q(this.f114276v, AbstractC29094b.m145339a(this.f114277w));
                this.f114274t = 1;
                if (mutableSharedFlow.mo12109b(c24860q, this) == m142578e) {
                    return m142578e;
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

    public C23526c() {
        C26449a c26449a = C26449a.f125639a;
        this.f114239u = c26449a.m136341f();
        this.f114240v = c26449a.m136345j();
        InterfaceC20907a.b bVar = InterfaceC20907a.b.f102732a;
        MutableStateFlow m113503a = StateFlowKt.m113503a(bVar);
        this.f114241w = m113503a;
        this.f114242x = FlowKt.m113284b(m113503a);
        MutableStateFlow m113503a2 = StateFlowKt.m113503a(Boolean.TRUE);
        this.f114243y = m113503a2;
        this.f114244z = FlowKt.m113284b(m113503a2);
        MutableStateFlow m113503a3 = StateFlowKt.m113503a(bVar);
        this.f114232A = m113503a3;
        this.f114233B = FlowKt.m113284b(m113503a3);
        MutableStateFlow m113503a4 = StateFlowKt.m113503a(bVar);
        this.f114234C = m113503a4;
        this.f114235D = FlowKt.m113284b(m113503a4);
        MutableSharedFlow m113478b = SharedFlowKt.m113478b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f114236E = m113478b;
        this.f114237F = FlowKt.m113283a(m113478b);
    }

    /* renamed from: X */
    public final StateFlow m123491X() {
        return this.f114235D;
    }

    /* renamed from: Y */
    public final SharedFlow m123492Y() {
        return this.f114237F;
    }

    /* renamed from: Z */
    public final StateFlow m123493Z() {
        return this.f114242x;
    }

    /* renamed from: a */
    public final void m123494a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(loadMoreInfo, null), 3, null);
    }

    /* renamed from: a0 */
    public final StateFlow m123495a0() {
        return this.f114244z;
    }

    /* renamed from: b0 */
    public final StateFlow m123496b0() {
        return this.f114233B;
    }

    /* renamed from: c0 */
    public final boolean m123497c0() {
        return this.f114242x.getValue() instanceof InterfaceC20907a.a;
    }

    /* renamed from: e0 */
    public final boolean m123498e0() {
        return this.f114238G > 0;
    }

    /* renamed from: f0 */
    public final void m123499f0(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        m123443N(new AbstractC23524a.b("view_channel_detail", channel));
    }

    /* renamed from: g0 */
    public final void m123500g0(Channel channel, boolean z11) {
        AbstractC19074t.m100208f(channel, "channel");
        if (z11) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(channel, null), 3, null);
        } else {
            m123443N(new AbstractC23524a.b("confirm_unfollow", channel));
        }
    }

    /* renamed from: h0 */
    public final void m123501h0(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e(channel, null), 3, null);
    }

    /* renamed from: i */
    public final void m123502i() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b(null), 3, null);
    }

    /* renamed from: i0 */
    public final void m123503i0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "channelId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new f(str, z11, null), 3, null);
    }

    /* renamed from: j0 */
    public final void m123504j0(boolean z11) {
        this.f114243y.setValue(Boolean.valueOf(z11));
    }
}
