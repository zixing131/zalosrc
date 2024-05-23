package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m145345f = "Zip.kt", m145346l = {33, 33}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__ZipKt$combine$1$1 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    int f107058t;

    /* renamed from: u */
    private /* synthetic */ Object f107059u;

    /* renamed from: v */
    /* synthetic */ Object f107060v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18510q f107061w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(3, continuation);
        this.f107061w = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        FlowCollector flowCollector;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107058t;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f107059u;
            AbstractC24862s.m129228b(obj);
        } else {
            AbstractC24862s.m129228b(obj);
            flowCollector = (FlowCollector) this.f107059u;
            Object[] objArr = (Object[]) this.f107060v;
            InterfaceC18510q interfaceC18510q = this.f107061w;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f107059u = flowCollector;
            this.f107058t = 1;
            obj = interfaceC18510q.mo45599Hr(obj2, obj3, this);
            if (obj == m142578e) {
                return m142578e;
            }
        }
        this.f107059u = null;
        this.f107058t = 2;
        if (flowCollector.mo12109b(obj, this) == m142578e) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f107061w, continuation);
        flowKt__ZipKt$combine$1$1.f107059u = flowCollector;
        flowKt__ZipKt$combine$1$1.f107060v = objArr;
        return flowKt__ZipKt$combine$1$1.mo239o(C24848g0.f119245a);
    }
}
