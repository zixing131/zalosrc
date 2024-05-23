package r10;

import com.zing.zalo.shortvideo.data.model.User;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p185gc.AbstractC19381e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;

/* renamed from: r10.f */
/* loaded from: classes5.dex */
public final class C25609f extends AbstractC19381e {

    /* renamed from: a */
    private final InterfaceC29280a f122431a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r10.f$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122432t;

        /* renamed from: u */
        private /* synthetic */ Object f122433u;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f122433u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122432t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f122433u;
                User mo146327b = C25609f.this.f122431a.mo146327b();
                this.f122432t = 1;
                if (flowCollector.mo12109b(mo146327b, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((a) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25609f(InterfaceC29280a interfaceC29280a) {
        AbstractC19074t.m100208f(interfaceC29280a, "cacheRepository");
        this.f122431a = interfaceC29280a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Flow mo93498b() {
        return FlowKt.m113265A(new a(null));
    }
}
