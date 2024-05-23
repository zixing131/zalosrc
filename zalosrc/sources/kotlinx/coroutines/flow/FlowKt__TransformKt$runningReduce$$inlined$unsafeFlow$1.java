package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106960p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106961q;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = NullSurrogateKt.f107313a;
        Object mo97893a = this.f106960p.mo97893a(new FlowKt__TransformKt$runningReduce$1$1(c19059j0, this.f106961q, flowCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
