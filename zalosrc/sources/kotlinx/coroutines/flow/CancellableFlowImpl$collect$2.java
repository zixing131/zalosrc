package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class CancellableFlowImpl$collect$2<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ FlowCollector f106412p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CancellableFlowImpl$collect$2(FlowCollector flowCollector) {
        this.f106412p = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
        Object m142578e;
        int i11;
        if (continuation instanceof CancellableFlowImpl$collect$2$emit$1) {
            cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) continuation;
            int i12 = cancellableFlowImpl$collect$2$emit$1.f106415u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cancellableFlowImpl$collect$2$emit$1.f106415u = i12 - Integer.MIN_VALUE;
                Object obj2 = cancellableFlowImpl$collect$2$emit$1.f106413s;
                m142578e = AbstractC28298d.m142578e();
                i11 = cancellableFlowImpl$collect$2$emit$1.f106415u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    JobKt.m112758k(cancellableFlowImpl$collect$2$emit$1.getContext());
                    FlowCollector flowCollector = this.f106412p;
                    cancellableFlowImpl$collect$2$emit$1.f106415u = 1;
                    if (flowCollector.mo12109b(obj, cancellableFlowImpl$collect$2$emit$1) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, continuation);
        Object obj22 = cancellableFlowImpl$collect$2$emit$1.f106413s;
        m142578e = AbstractC28298d.m142578e();
        i11 = cancellableFlowImpl$collect$2$emit$1.f106415u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
