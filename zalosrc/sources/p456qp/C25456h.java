package p456qp;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19377a;
import p399op.C24405q;
import p426pp.AbstractC24900c;
import p426pp.C24901d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.h */
/* loaded from: classes4.dex */
public final class C25456h extends AbstractC19377a {

    /* renamed from: a */
    private final C24405q f121927a;

    /* renamed from: qp.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C24901d f121928a;

        public a(C24901d c24901d) {
            AbstractC19074t.m100208f(c24901d, "songCategory");
            this.f121928a = c24901d;
        }

        /* renamed from: a */
        public final C24901d m131866a() {
            return this.f121928a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121928a, ((a) obj).f121928a);
        }

        public int hashCode() {
            return this.f121928a.hashCode();
        }

        public String toString() {
            return "Param(songCategory=" + this.f121928a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f121929t;

        /* renamed from: u */
        int f121930u;

        /* renamed from: v */
        private /* synthetic */ Object f121931v;

        /* renamed from: x */
        final /* synthetic */ a f121933x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f121933x = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f121933x, continuation);
            bVar.f121931v = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[RETURN] */
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
            ?? r12 = this.f121930u;
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
                    flowCollector = (FlowCollector) this.f121929t;
                    flowCollector2 = (FlowCollector) this.f121931v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC24900c.c(obj);
                        this.f121931v = flowCollector2;
                        this.f121929t = null;
                        this.f121930u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        AbstractC24900c.a aVar = new AbstractC24900c.a(e);
                        this.f121931v = null;
                        this.f121929t = null;
                        this.f121930u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f121931v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f121931v;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f121931v = flowCollector3;
                this.f121930u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            C24405q m131864c = C25456h.this.m131864c();
            C24901d m131866a = this.f121933x.m131866a();
            this.f121931v = flowCollector;
            this.f121929t = flowCollector;
            this.f121930u = 2;
            obj = m131864c.m127649y(m131866a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            cVar = new AbstractC24900c.c(obj);
            this.f121931v = flowCollector2;
            this.f121929t = null;
            this.f121930u = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25456h(C24405q c24405q) {
        AbstractC19074t.m100208f(c24405q, "repo");
        this.f121927a = c24405q;
    }

    /* renamed from: c */
    public final C24405q m131864c() {
        return this.f121927a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, null));
    }

    public /* synthetic */ C25456h(C24405q c24405q, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24405q.Companion.m127651a() : c24405q);
    }
}
