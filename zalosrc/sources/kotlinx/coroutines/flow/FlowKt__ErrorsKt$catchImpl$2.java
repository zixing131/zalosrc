package kotlinx.coroutines.flow;

import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$catchImpl$2<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ FlowCollector f106668p;

    /* renamed from: q */
    final /* synthetic */ C19059j0 f106669q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ErrorsKt$catchImpl$2(FlowCollector flowCollector, C19059j0 c19059j0) {
        this.f106668p = flowCollector;
        this.f106669q = c19059j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        Object m142578e;
        int i11;
        FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
            int i12 = flowKt__ErrorsKt$catchImpl$2$emit$1.f106673v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.f106673v = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f106671t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ErrorsKt$catchImpl$2$emit$1.f106673v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.f106670s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                        } catch (Throwable th2) {
                            th = th2;
                            flowKt__ErrorsKt$catchImpl$2.f106669q.f94941p = th;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    try {
                        FlowCollector flowCollector = this.f106668p;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.f106670s = this;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.f106673v = 1;
                        if (flowCollector.mo12109b(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == m142578e) {
                            return m142578e;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        flowKt__ErrorsKt$catchImpl$2 = this;
                        flowKt__ErrorsKt$catchImpl$2.f106669q.f94941p = th;
                        throw th;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
        Object obj22 = flowKt__ErrorsKt$catchImpl$2$emit$1.f106671t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ErrorsKt$catchImpl$2$emit$1.f106673v;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
