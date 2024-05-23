package l50;

import androidx.work.AbstractC2144f;
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

/* renamed from: l50.m */
/* loaded from: classes5.dex */
public final class C22091m extends AbstractC19377a {
    public static final a Companion = new a(null);

    /* renamed from: l50.m$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: l50.m$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f108746a;

        /* renamed from: b */
        private final boolean f108747b;

        public b(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "keyword");
            this.f108746a = str;
            this.f108747b = z11;
        }

        /* renamed from: a */
        public final String m115278a() {
            return this.f108746a;
        }

        /* renamed from: b */
        public final boolean m115279b() {
            return this.f108747b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f108746a, bVar.f108746a) && this.f108747b == bVar.f108747b;
        }

        public int hashCode() {
            return (this.f108746a.hashCode() * 31) + AbstractC2144f.m11520a(this.f108747b);
        }

        public String toString() {
            return "Param(keyword=" + this.f108746a + ", needRefresh=" + this.f108747b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l50.m$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f108748t;

        /* renamed from: u */
        int f108749u;

        /* renamed from: v */
        private /* synthetic */ Object f108750v;

        /* renamed from: w */
        final /* synthetic */ b f108751w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f108751w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f108751w, continuation);
            cVar.f108750v = obj;
            return cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
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
            ?? r12 = this.f108749u;
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
                    flowCollector = (FlowCollector) this.f108748t;
                    flowCollector2 = (FlowCollector) this.f108750v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC24900c.c(obj);
                        this.f108750v = flowCollector2;
                        this.f108748t = null;
                        this.f108749u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        AbstractC24900c.a aVar = new AbstractC24900c.a(e);
                        this.f108750v = null;
                        this.f108748t = null;
                        this.f108749u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f108750v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f108750v;
                AbstractC24900c.b bVar = AbstractC24900c.b.f119472a;
                this.f108750v = flowCollector3;
                this.f108749u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            C20304a m106001a = C20304a.Companion.m106001a();
            String m115278a = this.f108751w.m115278a();
            boolean m115279b = this.f108751w.m115279b();
            this.f108750v = flowCollector;
            this.f108748t = flowCollector;
            this.f108749u = 2;
            obj = m106001a.m105977B(m115278a, 200, m115279b, this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            cVar = new AbstractC24900c.c(obj);
            this.f108750v = flowCollector2;
            this.f108748t = null;
            this.f108749u = 3;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(b bVar, Continuation continuation) {
        return FlowKt.m113265A(new c(bVar, null));
    }
}
