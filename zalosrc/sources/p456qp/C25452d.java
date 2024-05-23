package p456qp;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19379c;
import p399op.C24405q;
import p426pp.AbstractC24900c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.d */
/* loaded from: classes4.dex */
public final class C25452d extends AbstractC19379c {

    /* renamed from: a */
    private final C24405q f121880a;

    /* renamed from: qp.d$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121881t;

        /* renamed from: u */
        int f121882u;

        /* renamed from: v */
        private /* synthetic */ Object f121883v;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f121883v = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
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
            ?? r12 = this.f121882u;
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
                    flowCollector = (FlowCollector) this.f121881t;
                    flowCollector2 = (FlowCollector) this.f121883v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC24900c.c(obj);
                        this.f121883v = flowCollector2;
                        this.f121881t = null;
                        this.f121882u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        AbstractC24900c.a aVar = new AbstractC24900c.a(e);
                        this.f121883v = null;
                        this.f121881t = null;
                        this.f121882u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f121883v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f121883v;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f121883v = flowCollector3;
                this.f121882u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            C24405q m131839c = C25452d.this.m131839c();
            this.f121883v = flowCollector;
            this.f121881t = flowCollector;
            this.f121882u = 2;
            obj = m131839c.m127648w(this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            cVar = new AbstractC24900c.c(obj);
            this.f121883v = flowCollector2;
            this.f121881t = null;
            this.f121882u = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((a) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25452d(C24405q c24405q) {
        AbstractC19074t.m100208f(c24405q, "repo");
        this.f121880a = c24405q;
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return FlowKt.m113265A(new a(null));
    }

    /* renamed from: c */
    public final C24405q m131839c() {
        return this.f121880a;
    }

    public /* synthetic */ C25452d(C24405q c24405q, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24405q.Companion.m127651a() : c24405q);
    }
}
