package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ FlowCollector f106766p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__MergeKt$flattenConcat$1$1(FlowCollector flowCollector) {
        this.f106766p = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Flow flow, Continuation continuation) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        Object m142578e;
        int i11;
        if (continuation instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) continuation;
            int i12 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f106769u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.f106769u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.f106767s;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f106769u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector = this.f106766p;
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.f106769u = 1;
                    if (FlowKt.m113301s(flowCollector, flow, flowKt__MergeKt$flattenConcat$1$1$emit$1) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
        Object obj2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f106767s;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__MergeKt$flattenConcat$1$1$emit$1.f106769u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
