package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18510q;
import en0.InterfaceC18512s;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow[] f106990p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18512s f106991q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m145345f = "Zip.kt", m145346l = {333, 262}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
    /* loaded from: classes7.dex */
    public static final class C218462 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f106992t;

        /* renamed from: u */
        private /* synthetic */ Object f106993u;

        /* renamed from: v */
        /* synthetic */ Object f106994v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18512s f106995w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C218462(Continuation continuation, InterfaceC18512s interfaceC18512s) {
            super(3, continuation);
            this.f106995w = interfaceC18512s;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f106992t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f106993u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f106993u;
                Object[] objArr = (Object[]) this.f106994v;
                InterfaceC18512s interfaceC18512s = this.f106995w;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f106993u = flowCollector;
                this.f106992t = 1;
                AbstractC19072r.m100202c(6);
                obj = interfaceC18512s.mo97872aD(obj2, obj3, obj4, obj5, this);
                AbstractC19072r.m100202c(7);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            this.f106993u = null;
            this.f106992t = 2;
            if (flowCollector.mo12109b(obj, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            C218462 c218462 = new C218462(continuation, this.f106995w);
            c218462.f106993u = flowCollector;
            c218462.f106994v = objArr;
            return c218462.mo239o(C24848g0.f119245a);
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        InterfaceC18494a m113403c;
        Object m142578e;
        Flow[] flowArr = this.f106990p;
        m113403c = FlowKt__ZipKt.m113403c();
        Object m113542a = CombineKt.m113542a(flowCollector, flowArr, m113403c, new C218462(null, this.f106991q), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113542a == m142578e) {
            return m113542a;
        }
        return C24848g0.f119245a;
    }
}
