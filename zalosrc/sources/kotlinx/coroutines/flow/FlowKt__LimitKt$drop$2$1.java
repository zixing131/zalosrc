package kotlinx.coroutines.flow;

import fn0.C19055h0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$drop$2$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ C19055h0 f106717p;

    /* renamed from: q */
    final /* synthetic */ int f106718q;

    /* renamed from: r */
    final /* synthetic */ FlowCollector f106719r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$drop$2$1(C19055h0 c19055h0, int i11, FlowCollector flowCollector) {
        this.f106717p = c19055h0;
        this.f106718q = i11;
        this.f106719r = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        Object m142578e;
        int i11;
        if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            int i12 = flowKt__LimitKt$drop$2$1$emit$1.f106722u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.f106722u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.f106720s;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__LimitKt$drop$2$1$emit$1.f106722u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    C19055h0 c19055h0 = this.f106717p;
                    int i13 = c19055h0.f94931p;
                    if (i13 >= this.f106718q) {
                        FlowCollector flowCollector = this.f106719r;
                        flowKt__LimitKt$drop$2$1$emit$1.f106722u = 1;
                        if (flowCollector.mo12109b(obj, flowKt__LimitKt$drop$2$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        c19055h0.f94931p = i13 + 1;
                        return C24848g0.f119245a;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$drop$2$1$emit$1.f106720s;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__LimitKt$drop$2$1$emit$1.f106722u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
