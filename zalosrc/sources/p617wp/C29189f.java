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

/* renamed from: wp.f */
/* loaded from: classes4.dex */
public final class C29189f extends AbstractC19377a {

    /* renamed from: a */
    private final C28567c f135234a;

    /* renamed from: b */
    private final InterfaceC26357f f135235b;

    /* renamed from: wp.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f135236a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "feedId");
            this.f135236a = str;
        }

        /* renamed from: a */
        public final String m145731a() {
            return this.f135236a;
        }
    }

    /* renamed from: wp.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ a f135237q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f135237q = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start executing use case: " + this.f135237q;
        }
    }

    /* renamed from: wp.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f135238t;

        /* renamed from: u */
        private /* synthetic */ Object f135239u;

        /* renamed from: w */
        final /* synthetic */ a f135241w;

        /* renamed from: wp.f$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f135242q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Emitting state loading";
            }
        }

        /* renamed from: wp.f$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ boolean f135243q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z11) {
                super(0);
                this.f135243q = z11;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed success. Emitting result: " + this.f135243q;
            }
        }

        /* renamed from: wp.f$c$c */
        /* loaded from: classes4.dex */
        public static final class C33046c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Exception f135244q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C33046c(Exception exc) {
                super(0);
                this.f135244q = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "Executed fail. Emitting error: " + this.f135244q;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f135241w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f135241w, continuation);
            cVar.f135239u = obj;
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
            ?? r12 = this.f135238t;
            try {
            } catch (Exception e11) {
                C29189f.this.f135235b.mo135685a("SETTING_INLINE", "USE_CASE_UNSUBSCRIBE_FEED_NOTIFICATION", new C33046c(e11));
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f135239u = null;
                this.f135238t = 4;
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
                    flowCollector = (FlowCollector) this.f135239u;
                    AbstractC24862s.m129228b(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    C29189f.this.f135235b.mo135685a("SETTING_INLINE", "USE_CASE_UNSUBSCRIBE_FEED_NOTIFICATION", new b(booleanValue));
                    cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue));
                    this.f135239u = flowCollector;
                    this.f135238t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f135239u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f135239u;
                C29189f.this.f135235b.mo135685a("SETTING_INLINE", "USE_CASE_UNSUBSCRIBE_FEED_NOTIFICATION", a.f135242q);
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f135239u = flowCollector2;
                this.f135238t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C28567c c28567c = C29189f.this.f135234a;
            String m145731a = this.f135241w.m145731a();
            this.f135239u = flowCollector;
            this.f135238t = 2;
            obj = c28567c.m142984g(m145731a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            boolean booleanValue2 = ((Boolean) obj).booleanValue();
            C29189f.this.f135235b.mo135685a("SETTING_INLINE", "USE_CASE_UNSUBSCRIBE_FEED_NOTIFICATION", new b(booleanValue2));
            cVar = new AbstractC25468a.c(AbstractC29094b.m145339a(booleanValue2));
            this.f135239u = flowCollector;
            this.f135238t = 3;
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

    public /* synthetic */ C29189f(C28567c c28567c, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C28567c.a.m142987c(C28567c.Companion, null, null, null, 7, null) : c28567c, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
    }

    @Override // p185gc.AbstractC19377a
    /* renamed from: e */
    public Object mo451b(a aVar, Continuation continuation) {
        this.f135235b.mo135685a("SETTING_INLINE", "USE_CASE_UNSUBSCRIBE_FEED_NOTIFICATION", new b(aVar));
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C29189f(C28567c c28567c, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c28567c, "repository");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f135234a = c28567c;
        this.f135235b = interfaceC26357f;
    }
}
