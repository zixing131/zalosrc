package p330lp;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import jp.AbstractC21339c;
import jp.C21338b;
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

/* renamed from: lp.b */
/* loaded from: classes4.dex */
public final class C22634b extends AbstractC19377a {

    /* renamed from: a */
    private final InterfaceC21906b f111011a;

    /* renamed from: lp.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C21338b f111012a;

        public a(C21338b c21338b) {
            AbstractC19074t.m100208f(c21338b, "likeDetailInfo");
            this.f111012a = c21338b;
        }

        /* renamed from: a */
        public final C21338b m117190a() {
            return this.f111012a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lp.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f111013t;

        /* renamed from: u */
        int f111014u;

        /* renamed from: v */
        private /* synthetic */ Object f111015v;

        /* renamed from: w */
        final /* synthetic */ a f111016w;

        /* renamed from: x */
        final /* synthetic */ C22634b f111017x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C22634b c22634b, Continuation continuation) {
            super(2, continuation);
            this.f111016w = aVar;
            this.f111017x = c22634b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f111016w, this.f111017x, continuation);
            bVar.f111015v = obj;
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
            ?? r12 = this.f111014u;
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
                    flowCollector = (FlowCollector) this.f111013t;
                    flowCollector2 = (FlowCollector) this.f111015v;
                    try {
                        AbstractC24862s.m129228b(obj);
                        cVar = new AbstractC21339c.c(obj);
                        this.f111015v = flowCollector2;
                        this.f111013t = null;
                        this.f111014u = 3;
                        if (flowCollector.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r12 = flowCollector2;
                        AbstractC21339c.a aVar = new AbstractC21339c.a(e);
                        this.f111015v = null;
                        this.f111013t = null;
                        this.f111014u = 4;
                        if (r12.mo12109b(aVar, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f111015v;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f111015v;
                if (!this.f111016w.m117190a().m110531d()) {
                    return C24848g0.f119245a;
                }
                AbstractC21339c.b bVar = AbstractC21339c.b.f103939a;
                this.f111015v = flowCollector3;
                this.f111014u = 1;
                if (flowCollector3.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector3;
            }
            InterfaceC21906b m117188c = this.f111017x.m117188c();
            C21338b m117190a = this.f111016w.m117190a();
            this.f111015v = flowCollector;
            this.f111013t = flowCollector;
            this.f111014u = 2;
            obj = m117188c.mo114138a(m117190a, this);
            if (obj == m142578e) {
                return m142578e;
            }
            flowCollector2 = flowCollector;
            cVar = new AbstractC21339c.c(obj);
            this.f111015v = flowCollector2;
            this.f111013t = null;
            this.f111014u = 3;
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

    public C22634b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: c */
    public final InterfaceC21906b m117188c() {
        return this.f111011a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113265A(new b(aVar, this, null));
    }

    public C22634b(InterfaceC21906b interfaceC21906b) {
        AbstractC19074t.m100208f(interfaceC21906b, "likeDetailRepo");
        this.f111011a = interfaceC21906b;
    }

    public /* synthetic */ C22634b(InterfaceC21906b interfaceC21906b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C21908d.a.m114146c(C21908d.Companion, null, 1, null) : interfaceC21906b);
    }
}