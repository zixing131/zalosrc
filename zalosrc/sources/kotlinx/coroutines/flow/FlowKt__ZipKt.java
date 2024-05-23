package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
final /* synthetic */ class FlowKt__ZipKt {
    /* renamed from: b */
    public static final Flow m113402b(Flow flow, Flow flow2, Flow flow3, final InterfaceC18511r interfaceC18511r) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m145345f = "Zip.kt", m145346l = {333, 262}, m145347m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 */
            /* loaded from: classes7.dex */
            public static final class C218452 extends AbstractC29104l implements InterfaceC18510q {

                /* renamed from: t */
                int f106986t;

                /* renamed from: u */
                private /* synthetic */ Object f106987u;

                /* renamed from: v */
                /* synthetic */ Object f106988v;

                /* renamed from: w */
                final /* synthetic */ InterfaceC18511r f106989w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C218452(Continuation continuation, InterfaceC18511r interfaceC18511r) {
                    super(3, continuation);
                    this.f106989w = interfaceC18511r;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    FlowCollector flowCollector;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f106986t;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) this.f106987u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        AbstractC24862s.m129228b(obj);
                        flowCollector = (FlowCollector) this.f106987u;
                        Object[] objArr = (Object[]) this.f106988v;
                        InterfaceC18511r interfaceC18511r = this.f106989w;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.f106987u = flowCollector;
                        this.f106986t = 1;
                        AbstractC19072r.m100202c(6);
                        obj = interfaceC18511r.mo49340Uc(obj2, obj3, obj4, this);
                        AbstractC19072r.m100202c(7);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    this.f106987u = null;
                    this.f106986t = 2;
                    if (flowCollector.mo12109b(obj, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18510q
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
                    C218452 c218452 = new C218452(continuation, this.f106989w);
                    c218452.f106987u = flowCollector;
                    c218452.f106988v = objArr;
                    return c218452.mo239o(C24848g0.f119245a);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            /* renamed from: a */
            public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                InterfaceC18494a m113403c;
                Object m142578e;
                Flow[] flowArr2 = flowArr;
                m113403c = FlowKt__ZipKt.m113403c();
                Object m113542a = CombineKt.m113542a(flowCollector, flowArr2, m113403c, new C218452(null, interfaceC18511r), continuation);
                m142578e = AbstractC28298d.m142578e();
                if (m113542a == m142578e) {
                    return m113542a;
                }
                return C24848g0.f119245a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final InterfaceC18494a m113403c() {
        return FlowKt__ZipKt$nullArrayFactory$1.f107102q;
    }
}
