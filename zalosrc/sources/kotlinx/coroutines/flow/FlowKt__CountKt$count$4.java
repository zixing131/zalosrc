package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19055h0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__CountKt$count$4<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106528p;

    /* renamed from: q */
    final /* synthetic */ C19055h0 f106529q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__CountKt$count$4(InterfaceC18509p interfaceC18509p, C19055h0 c19055h0) {
        this.f106528p = interfaceC18509p;
        this.f106529q = c19055h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        Object obj2;
        Object m142578e;
        int i11;
        FlowKt__CountKt$count$4<T> flowKt__CountKt$count$4;
        if (continuation instanceof FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) continuation;
            int i12 = flowKt__CountKt$count$4$emit$1.f106533v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.f106533v = i12 - Integer.MIN_VALUE;
                obj2 = flowKt__CountKt$count$4$emit$1.f106531t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__CountKt$count$4$emit$1.f106533v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowKt__CountKt$count$4 = (FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.f106530s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    InterfaceC18509p interfaceC18509p = this.f106528p;
                    flowKt__CountKt$count$4$emit$1.f106530s = this;
                    flowKt__CountKt$count$4$emit$1.f106533v = 1;
                    obj2 = interfaceC18509p.mo240pC(obj, flowKt__CountKt$count$4$emit$1);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    flowKt__CountKt$count$4 = this;
                }
                if (((Boolean) obj2).booleanValue()) {
                    flowKt__CountKt$count$4.f106529q.f94931p++;
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, continuation);
        obj2 = flowKt__CountKt$count$4$emit$1.f106531t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__CountKt$count$4$emit$1.f106533v;
        if (i11 == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
        return C24848g0.f119245a;
    }
}
