package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DistinctFlowImpl<T> implements Flow<T> {

    /* renamed from: p */
    private final Flow f106420p;

    /* renamed from: q */
    public final InterfaceC18505l f106421q;

    /* renamed from: r */
    public final InterfaceC18509p f106422r;

    public DistinctFlowImpl(Flow flow, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        this.f106420p = flow;
        this.f106421q = interfaceC18505l;
        this.f106422r = interfaceC18509p;
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = NullSurrogateKt.f107313a;
        Object mo97893a = this.f106420p.mo97893a(new DistinctFlowImpl$collect$2(this, c19059j0, flowCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
