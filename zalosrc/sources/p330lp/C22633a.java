package p330lp;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import jp.AbstractC21339c;
import jp.C21337a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kp.C21908d;
import kp.InterfaceC21906b;
import p185gc.AbstractC19377a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: lp.a */
/* loaded from: classes4.dex */
public final class C22633a extends AbstractC19377a {

    /* renamed from: a */
    private final InterfaceC21906b f111004a;

    /* renamed from: lp.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C21337a f111005a;

        public a(C21337a c21337a) {
            AbstractC19074t.m100208f(c21337a, "likeDetailInfo");
            this.f111005a = c21337a;
        }

        /* renamed from: a */
        public final C21337a m117186a() {
            return this.f111005a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lp.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f111006t;

        /* renamed from: u */
        int f111007u;

        /* renamed from: v */
        private /* synthetic */ Object f111008v;

        /* renamed from: w */
        final /* synthetic */ a f111009w;

        /* renamed from: x */
        final /* synthetic */ C22633a f111010x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C22633a c22633a, Continuation continuation) {
            super(2, continuation);
            this.f111009w = aVar;
            this.f111010x = c22633a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f111009w, this.f111010x, continuation);
            bVar.f111008v = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            AbstractC21339c.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f111007u;
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
                    flowCollector = (FlowCollector) this.f111006t;
                    flowCollector2 = (FlowCollector) this.f111008v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC21339c.c(obj);
                        this.f111008v = flowCollector2;
                        this.f111006t = null;
                        this.f111007u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        AbstractC21339c.a aVar = new AbstractC21339c.a(e);
                        this.f111008v = null;
                        this.f111006t = null;
                        this.f111007u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f111008v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f111008v;
                if (!this.f111009w.m117186a().m110513f()) {
                    return C24848g0.f119245a;
                }
                AbstractC21339c.b bVar = AbstractC21339c.b.f103939a;
                this.f111008v = flowCollector3;
                this.f111007u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            InterfaceC21906b m117184c = this.f111010x.m117184c();
            C21337a m117186a = this.f111009w.m117186a();
            this.f111008v = flowCollector;
            this.f111006t = flowCollector;
            this.f111007u = 2;
            obj = m117184c.mo114140c(m117186a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            cVar = new AbstractC21339c.c(obj);
            this.f111008v = flowCollector2;
            this.f111006t = null;
            this.f111007u = 3;
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

    public C22633a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: c */
    public final InterfaceC21906b m117184c() {
        return this.f111004a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C22633a(InterfaceC21906b interfaceC21906b) {
        AbstractC19074t.m100208f(interfaceC21906b, "likeDetailRepo");
        this.f111004a = interfaceC21906b;
    }

    public /* synthetic */ C22633a(InterfaceC21906b interfaceC21906b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C21908d.a.m114146c(C21908d.Companion, null, 1, null) : interfaceC21906b);
    }
}
