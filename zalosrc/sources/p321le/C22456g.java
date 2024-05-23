package p321le;

import bp0.AbstractC3082b0;
import com.zing.zalo.control.ContactProfile;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ie.C20525a;
import je.C21228a;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19384h;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: le.g */
/* loaded from: classes3.dex */
public final class C22456g extends AbstractC19384h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC21698a f109838a;

    /* renamed from: le.g$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: le.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C32884a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f109839t;

            /* renamed from: u */
            final /* synthetic */ C21228a f109840u;

            /* renamed from: v */
            final /* synthetic */ int f109841v;

            /* renamed from: w */
            final /* synthetic */ InterfaceC18505l f109842w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: le.g$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32885a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ InterfaceC18505l f109843p;

                C32885a(InterfaceC18505l interfaceC18505l) {
                    this.f109843p = interfaceC18505l;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                    if (abstractC25468a instanceof AbstractC25468a.c) {
                        this.f109843p.mo205i9(AbstractC29094b.m145339a(true));
                    } else if (abstractC25468a instanceof AbstractC25468a.a) {
                        this.f109843p.mo205i9(AbstractC29094b.m145339a(false));
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32884a(C21228a c21228a, int i11, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(2, continuation);
                this.f109840u = c21228a;
                this.f109841v = i11;
                this.f109842w = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32884a(this.f109840u, this.f109841v, this.f109842w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f109839t;
                int i12 = 1;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow flow = (Flow) new C22456g(null, i12, 0 == true ? 1 : 0).m101509a(new b(this.f109840u, this.f109841v));
                    if (flow != null) {
                        C32885a c32885a = new C32885a(this.f109842w);
                        this.f109839t = 1;
                        if (flow.mo97893a(c32885a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32884a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m116103a(C21228a c21228a, int i11, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(c21228a, "rbt");
            AbstractC19074t.m100208f(interfaceC18505l, "callback");
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new C32884a(c21228a, i11, interfaceC18505l, null), 3, null);
        }
    }

    /* renamed from: le.g$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final C21228a f109844a;

        /* renamed from: b */
        private final int f109845b;

        public b(C21228a c21228a, int i11) {
            AbstractC19074t.m100208f(c21228a, "ringBackTone");
            this.f109844a = c21228a;
            this.f109845b = i11;
        }

        /* renamed from: a */
        public final C21228a m116106a() {
            return this.f109844a;
        }

        /* renamed from: b */
        public final int m116107b() {
            return this.f109845b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f109844a, bVar.f109844a) && this.f109845b == bVar.f109845b;
        }

        public int hashCode() {
            return (this.f109844a.hashCode() * 31) + this.f109845b;
        }

        public String toString() {
            return "Params(ringBackTone=" + this.f109844a + ", source=" + this.f109845b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.g$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109846t;

        /* renamed from: u */
        private /* synthetic */ Object f109847u;

        /* renamed from: w */
        final /* synthetic */ b f109849w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f109849w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f109849w, continuation);
            cVar.f109847u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Exception exc;
            FlowCollector flowCollector;
            InterfaceC21698a interfaceC21698a;
            C21228a m116106a;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f109846t;
            try {
            } catch (Exception e11) {
                AbstractC25468a.a aVar = new AbstractC25468a.a(e11);
                this.f109847u = e11;
                this.f109846t = 5;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
                exc = e11;
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 != 4) {
                                if (r12 == 5) {
                                    exc = (Exception) this.f109847u;
                                    AbstractC24862s.m129228b(obj);
                                    AbstractC3082b0.m15424f("SaveRingBackToneUseCase", "ex " + exc);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        flowCollector = (FlowCollector) this.f109847u;
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC25468a.c(C24848g0.f119245a);
                        this.f109847u = flowCollector;
                        this.f109846t = 4;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f109847u;
                    AbstractC24862s.m129228b(obj);
                    interfaceC21698a = C22456g.this.f109838a;
                    m116106a = this.f109849w.m116106a();
                    this.f109847u = flowCollector;
                    this.f109846t = 3;
                    if (interfaceC21698a.mo106627h(m116106a, this) == m142578e) {
                        return m142578e;
                    }
                    cVar = new AbstractC25468a.c(C24848g0.f119245a);
                    this.f109847u = flowCollector;
                    this.f109846t = 4;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f109847u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f109847u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f109847u = flowCollector2;
                this.f109846t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            InterfaceC21698a interfaceC21698a2 = C22456g.this.f109838a;
            ContactProfile.C7868d c7868d = new ContactProfile.C7868d();
            b bVar2 = this.f109849w;
            c7868d.f42490x = Integer.parseInt(bVar2.m116106a().m110002b());
            String m40447b = c7868d.m40447b(bVar2.m116107b());
            AbstractC19074t.m100207e(m40447b, "let(...)");
            this.f109847u = flowCollector;
            this.f109846t = 2;
            if (interfaceC21698a2.mo106622c(m40447b, this) == m142578e) {
                return m142578e;
            }
            interfaceC21698a = C22456g.this.f109838a;
            m116106a = this.f109849w.m116106a();
            this.f109847u = flowCollector;
            this.f109846t = 3;
            if (interfaceC21698a.mo106627h(m116106a, this) == m142578e) {
            }
            cVar = new AbstractC25468a.c(C24848g0.f119245a);
            this.f109847u = flowCollector;
            this.f109846t = 4;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22456g(InterfaceC21698a interfaceC21698a) {
        AbstractC19074t.m100208f(interfaceC21698a, "repo");
        this.f109838a = interfaceC21698a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        return FlowKt.m113265A(new c(bVar, null));
    }

    public /* synthetic */ C22456g(InterfaceC21698a interfaceC21698a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20525a() : interfaceC21698a);
    }
}
