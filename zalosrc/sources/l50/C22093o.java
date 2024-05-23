package l50;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.o */
/* loaded from: classes5.dex */
public final class C22093o extends AbstractC19377a {

    /* renamed from: a */
    private final C20304a f108759a;

    /* renamed from: l50.o$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final int f108760a;

        /* renamed from: b */
        private final String f108761b;

        public a(int i11, String str) {
            AbstractC19074t.m100208f(str, "ringtoneId");
            this.f108760a = i11;
            this.f108761b = str;
        }

        /* renamed from: a */
        public final String m115288a() {
            return this.f108761b;
        }

        /* renamed from: b */
        public final int m115289b() {
            return this.f108760a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f108760a == aVar.f108760a && AbstractC19074t.m100204b(this.f108761b, aVar.f108761b);
        }

        public int hashCode() {
            return (this.f108760a * 31) + this.f108761b.hashCode();
        }

        public String toString() {
            return "Param(type=" + this.f108760a + ", ringtoneId=" + this.f108761b + ")";
        }
    }

    /* renamed from: l50.o$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f108762t;

        /* renamed from: u */
        int f108763u;

        /* renamed from: v */
        private /* synthetic */ Object f108764v;

        /* renamed from: x */
        final /* synthetic */ a f108766x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f108766x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f108766x, continuation);
            bVar.f108764v = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v6 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            AbstractC24900c.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f108763u;
            try {
            } catch (Exception e11) {
                e = e11;
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
                    flowCollector = (FlowCollector) this.f108762t;
                    flowCollector2 = (FlowCollector) this.f108764v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC24900c.c(obj);
                        this.f108764v = flowCollector2;
                        this.f108762t = null;
                        this.f108763u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        AbstractC24900c.a aVar = new AbstractC24900c.a(e);
                        this.f108764v = null;
                        this.f108762t = null;
                        this.f108763u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f108764v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f108764v;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f108764v = flowCollector3;
                this.f108763u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            C20304a m115286c = C22093o.this.m115286c();
            int m115289b = this.f108766x.m115289b();
            String m115288a = this.f108766x.m115288a();
            this.f108764v = flowCollector;
            this.f108762t = flowCollector;
            this.f108763u = 2;
            obj = m115286c.mo105991k(m115289b, m115288a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            cVar = new AbstractC24900c.c(obj);
            this.f108764v = flowCollector2;
            this.f108762t = null;
            this.f108763u = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22093o(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "repo");
        this.f108759a = c20304a;
    }

    /* renamed from: c */
    public final C20304a m115286c() {
        return this.f108759a;
    }

    @Override // p185gc.AbstractC19377a
    /* renamed from: d */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }

    public /* synthetic */ C22093o(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
