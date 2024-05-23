package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1 implements FlowCollector<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106712p;

    public FlowKt__LimitKt$collectWhile$collector$1(InterfaceC18509p interfaceC18509p) {
        this.f106712p = interfaceC18509p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        Object obj2;
        Object m142578e;
        int i11;
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            int i12 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f106716v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.f106716v = i12 - Integer.MIN_VALUE;
                obj2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f106714t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f106716v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.f106713s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    InterfaceC18509p interfaceC18509p = this.f106712p;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.f106713s = this;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.f106716v = 1;
                    obj2 = interfaceC18509p.mo240pC(obj, flowKt__LimitKt$collectWhile$collector$1$emit$1);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    flowKt__LimitKt$collectWhile$collector$1 = this;
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return C24848g0.f119245a;
                }
                throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
            }
        }
        flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        obj2 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f106714t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__LimitKt$collectWhile$collector$1$emit$1.f106716v;
        if (i11 == 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
