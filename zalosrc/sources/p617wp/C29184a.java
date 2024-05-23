package p617wp;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p458qr.AbstractC25468a;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p582vp.C28567c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: wp.a */
/* loaded from: classes4.dex */
public final class C29184a extends AbstractC19377a {

    /* renamed from: a */
    private final C28567c f135184a;

    /* renamed from: b */
    private final InterfaceC26357f f135185b;

    /* renamed from: wp.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final long f135186a;

        public a(long j11) {
            this.f135186a = j11;
        }

        /* renamed from: a */
        public final long m145690a() {
            return this.f135186a;
        }
    }

    /* renamed from: wp.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ a f135187q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f135187q = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start executing use case: " + this.f135187q;
        }
    }

    /* renamed from: wp.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f135188t;

        /* renamed from: u */
        private /* synthetic */ Object f135189u;

        /* renamed from: w */
        final /* synthetic */ a f135191w;

        /* renamed from: wp.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f135192q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Emitting state loading";
            }
        }

        /* renamed from: wp.a$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ boolean f135193q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11) {
                super(0);
                this.f135193q = z11;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed success. Emitting result: " + this.f135193q;
            }
        }

        /* renamed from: wp.a$c$c */
        /* loaded from: classes4.dex */
        public static final class C33042c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Exception f135194q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33042c(Exception exc) {
                super(0);
                this.f135194q = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed fail. Emitting error: " + this.f135194q;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f135191w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f135191w, continuation);
            cVar.f135189u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f135188t;
            try {
            } catch (Exception e11) {
                C29184a.this.f135185b.mo135685a("SETTING_INLINE", "USE_CASE_DELETE_FEED_NOTIFICATION", new C33042c(e11));
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f135189u = null;
                this.f135188t = 4;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f135189u;
                    AbstractC24862s.m129228b(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    C29184a.this.f135185b.mo135685a("SETTING_INLINE", "USE_CASE_DELETE_FEED_NOTIFICATION", new b(booleanValue));
                    cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue));
                    this.f135189u = flowCollector;
                    this.f135188t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f135189u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f135189u;
                C29184a.this.f135185b.mo135685a("SETTING_INLINE", "USE_CASE_DELETE_FEED_NOTIFICATION", a.f135192q);
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f135189u = flowCollector2;
                this.f135188t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C28567c c28567c = C29184a.this.f135184a;
            long m145690a = this.f135191w.m145690a();
            this.f135189u = flowCollector;
            this.f135188t = 2;
            obj = c28567c.m142980c(m145690a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            boolean booleanValue2 = ((Boolean) obj).booleanValue();
            C29184a.this.f135185b.mo135685a("SETTING_INLINE", "USE_CASE_DELETE_FEED_NOTIFICATION", new b(booleanValue2));
            cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue2));
            this.f135189u = flowCollector;
            this.f135188t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C29184a(C28567c c28567c, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C28567c.a.m142987c(C28567c.Companion, null, null, null, 7, null) : c28567c, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
    }

    @Override // p185gc.AbstractC19377a
    /* renamed from: e */
    public Object mo451b(a aVar, Continuation continuation) {
        this.f135185b.mo135685a("SETTING_INLINE", "USE_CASE_DELETE_FEED_NOTIFICATION", new b(aVar));
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C29184a(C28567c c28567c, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c28567c, "repository");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f135184a = c28567c;
        this.f135185b = interfaceC26357f;
    }
}
