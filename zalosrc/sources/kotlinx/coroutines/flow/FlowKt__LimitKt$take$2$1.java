package kotlinx.coroutines.flow;

import fn0.C19055h0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ C19055h0 f106734p;

    /* renamed from: q */
    final /* synthetic */ int f106735q;

    /* renamed from: r */
    final /* synthetic */ FlowCollector f106736r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$take$2$1(C19055h0 c19055h0, int i11, FlowCollector flowCollector) {
        this.f106734p = c19055h0;
        this.f106735q = i11;
        this.f106736r = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        Object m142578e;
        int i11;
        Object m113367d;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i12 = flowKt__LimitKt$take$2$1$emit$1.f106739u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.f106739u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$take$2$1$emit$1.f106737s;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__LimitKt$take$2$1$emit$1.f106739u;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj2);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj2);
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj2);
                C19055h0 c19055h0 = this.f106734p;
                int i13 = c19055h0.f94931p + 1;
                c19055h0.f94931p = i13;
                if (i13 < this.f106735q) {
                    FlowCollector flowCollector = this.f106736r;
                    flowKt__LimitKt$take$2$1$emit$1.f106739u = 1;
                    if (flowCollector.mo12109b(obj, flowKt__LimitKt$take$2$1$emit$1) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                FlowCollector flowCollector2 = this.f106736r;
                flowKt__LimitKt$take$2$1$emit$1.f106739u = 2;
                m113367d = FlowKt__LimitKt.m113367d(flowCollector2, obj, flowKt__LimitKt$take$2$1$emit$1);
                if (m113367d == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$take$2$1$emit$1.f106737s;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__LimitKt$take$2$1$emit$1.f106739u;
        if (i11 == 0) {
        }
    }
}
