package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", m145345f = "Zip.kt", m145346l = {292, 292}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$6$2 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    int f107068t;

    /* renamed from: u */
    private /* synthetic */ Object f107069u;

    /* renamed from: v */
    /* synthetic */ Object f107070v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18509p f107071w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$2(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(3, continuation);
        this.f107071w = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        FlowCollector flowCollector;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107068t;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f107069u;
            AbstractC24862s.m129228b(obj);
        } else {
            AbstractC24862s.m129228b(obj);
            flowCollector = (FlowCollector) this.f107069u;
            Object[] objArr = (Object[]) this.f107070v;
            InterfaceC18509p interfaceC18509p = this.f107071w;
            this.f107069u = flowCollector;
            this.f107068t = 1;
            obj = interfaceC18509p.mo240pC(objArr, this);
            if (obj == m142578e) {
                return m142578e;
            }
        }
        this.f107069u = null;
        this.f107068t = 2;
        if (flowCollector.mo12109b(obj, this) == m142578e) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
        AbstractC19074t.m100212j();
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.f107071w, continuation);
        flowKt__ZipKt$combine$6$2.f107069u = flowCollector;
        flowKt__ZipKt$combine$6$2.f107070v = objArr;
        return flowKt__ZipKt$combine$6$2.mo239o(C24848g0.f119245a);
    }
}
