package kotlinx.coroutines.flow;

import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DistinctFlowImpl$collect$2<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ DistinctFlowImpl f106423p;

    /* renamed from: q */
    final /* synthetic */ C19059j0 f106424q;

    /* renamed from: r */
    final /* synthetic */ FlowCollector f106425r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DistinctFlowImpl$collect$2(DistinctFlowImpl distinctFlowImpl, C19059j0 c19059j0, FlowCollector flowCollector) {
        this.f106423p = distinctFlowImpl;
        this.f106424q = c19059j0;
        this.f106425r = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        Object m142578e;
        int i11;
        if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
            int i12 = distinctFlowImpl$collect$2$emit$1.f106428u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.f106428u = i12 - Integer.MIN_VALUE;
                Object obj2 = distinctFlowImpl$collect$2$emit$1.f106426s;
                m142578e = AbstractC28298d.m142578e();
                i11 = distinctFlowImpl$collect$2$emit$1.f106428u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    Object mo205i9 = this.f106423p.f106421q.mo205i9(obj);
                    Object obj3 = this.f106424q.f94941p;
                    if (obj3 != NullSurrogateKt.f107313a && ((Boolean) this.f106423p.f106422r.mo240pC(obj3, mo205i9)).booleanValue()) {
                        return C24848g0.f119245a;
                    }
                    this.f106424q.f94941p = mo205i9;
                    FlowCollector flowCollector = this.f106425r;
                    distinctFlowImpl$collect$2$emit$1.f106428u = 1;
                    if (flowCollector.mo12109b(obj, distinctFlowImpl$collect$2$emit$1) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
        Object obj22 = distinctFlowImpl$collect$2$emit$1.f106426s;
        m142578e = AbstractC28298d.m142578e();
        i11 = distinctFlowImpl$collect$2$emit$1.f106428u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
