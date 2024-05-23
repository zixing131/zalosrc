package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18514u;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", m145345f = "Zip.kt", m145346l = {273}, m145347m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5 */
/* loaded from: classes7.dex */
public final class C21854xd7c321ea extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107047t;

    /* renamed from: u */
    private /* synthetic */ Object f107048u;

    /* renamed from: v */
    final /* synthetic */ Flow[] f107049v;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", m145345f = "Zip.kt", m145346l = {333}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f107050t;

        /* renamed from: u */
        private /* synthetic */ Object f107051u;

        /* renamed from: v */
        /* synthetic */ Object f107052v;

        public AnonymousClass1(Continuation continuation, InterfaceC18514u interfaceC18514u) {
            super(3, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            int i11 = this.f107050t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            Object[] objArr = (Object[]) this.f107052v;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            this.f107050t = 1;
            AbstractC19072r.m100202c(6);
            throw null;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, null);
            anonymousClass1.f107051u = flowCollector;
            anonymousClass1.f107052v = objArr;
            return anonymousClass1.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21854xd7c321ea(Flow[] flowArr, Continuation continuation, InterfaceC18514u interfaceC18514u) {
        super(2, continuation);
        this.f107049v = flowArr;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        C21854xd7c321ea c21854xd7c321ea = new C21854xd7c321ea(this.f107049v, continuation, null);
        c21854xd7c321ea.f107048u = obj;
        return c21854xd7c321ea;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        InterfaceC18494a m113403c;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107047t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107048u;
            Flow[] flowArr = this.f107049v;
            m113403c = FlowKt__ZipKt.m113403c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null);
            this.f107047t = 1;
            if (CombineKt.m113542a(flowCollector, flowArr, m113403c, anonymousClass1, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((C21854xd7c321ea) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
