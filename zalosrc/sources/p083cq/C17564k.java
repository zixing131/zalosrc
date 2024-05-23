package p083cq;

import aq.C2288h;
import bg0.C2797c;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p083cq.C17564k;
import p185gc.AbstractC19384h;
import p458qr.AbstractC25468a;
import p716zh.C32078q7;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: cq.k */
/* loaded from: classes4.dex */
public final class C17564k extends AbstractC19384h {

    /* renamed from: a */
    private final C2288h f89469a;

    /* renamed from: b */
    private final C2797c f89470b;

    /* renamed from: cq.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C32078q7 f89471a;

        public a(C32078q7 c32078q7) {
            AbstractC19074t.m100208f(c32078q7, "notificationItem");
            this.f89471a = c32078q7;
        }

        /* renamed from: a */
        public final C32078q7 m93526a() {
            return this.f89471a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f89471a, ((a) obj).f89471a);
        }

        public int hashCode() {
            return this.f89471a.hashCode();
        }

        public String toString() {
            return "Params(notificationItem=" + this.f89471a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cq.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f89472t;

        /* renamed from: u */
        private /* synthetic */ Object f89473u;

        /* renamed from: w */
        final /* synthetic */ a f89475w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f89475w = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m93528t(a aVar, C17564k c17564k, ProducerScope producerScope) {
            try {
                String m154738A = aVar.m93526a().m154738A();
                int m154749L = aVar.m93526a().m154749L();
                String m154761r = aVar.m93526a().m154761r();
                C2288h c2288h = c17564k.f89469a;
                AbstractC19074t.m100205c(m154738A);
                String valueOf = String.valueOf(m154749L);
                AbstractC19074t.m100205c(m154761r);
                c2288h.mo12058b(m154738A, valueOf, m154761r);
                producerScope.mo112912p(new AbstractC25468a.c(200));
            } catch (Exception e11) {
                producerScope.mo112912p(new AbstractC25468a.a(e11));
            }
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f89475w, continuation);
            bVar.f89473u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f89472t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                final ProducerScope producerScope = (ProducerScope) this.f89473u;
                C2797c c2797c = C17564k.this.f89470b;
                final a aVar = this.f89475w;
                final C17564k c17564k = C17564k.this;
                c2797c.mo13474a(new Runnable() { // from class: cq.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17564k.b.m93528t(C17564k.a.this, c17564k, producerScope);
                    }
                });
                this.f89472t = 1;
                if (ProduceKt.m113185b(producerScope, null, this, 1, null) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((b) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C17564k(C2288h c2288h, C2797c c2797c) {
        AbstractC19074t.m100208f(c2288h, "repository");
        AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
        this.f89469a = c2288h;
        this.f89470b = c2797c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113287e(new b(aVar, null));
    }
}
