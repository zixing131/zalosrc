package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ C19059j0 f106963p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106964q;

    /* renamed from: r */
    final /* synthetic */ FlowCollector f106965r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__TransformKt$runningFold$1$1(C19059j0 c19059j0, InterfaceC18510q interfaceC18510q, FlowCollector flowCollector) {
        this.f106963p = c19059j0;
        this.f106964q = interfaceC18510q;
        this.f106965r = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        Object m142578e;
        int i11;
        FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        C19059j0 c19059j0;
        FlowCollector flowCollector;
        Object obj2;
        if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            int i12 = flowKt__TransformKt$runningFold$1$1$emit$1.f106970w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.f106970w = i12 - Integer.MIN_VALUE;
                Object obj3 = flowKt__TransformKt$runningFold$1$1$emit$1.f106968u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__TransformKt$runningFold$1$1$emit$1.f106970w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj3);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19059j0 = (C19059j0) flowKt__TransformKt$runningFold$1$1$emit$1.f106967t;
                    flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.f106966s;
                    AbstractC24862s.m129228b(obj3);
                } else {
                    AbstractC24862s.m129228b(obj3);
                    C19059j0 c19059j02 = this.f106963p;
                    InterfaceC18510q interfaceC18510q = this.f106964q;
                    Object obj4 = c19059j02.f94941p;
                    flowKt__TransformKt$runningFold$1$1$emit$1.f106966s = this;
                    flowKt__TransformKt$runningFold$1$1$emit$1.f106967t = c19059j02;
                    flowKt__TransformKt$runningFold$1$1$emit$1.f106970w = 1;
                    Object mo45599Hr = interfaceC18510q.mo45599Hr(obj4, obj, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (mo45599Hr == m142578e) {
                        return m142578e;
                    }
                    flowKt__TransformKt$runningFold$1$1 = this;
                    obj3 = mo45599Hr;
                    c19059j0 = c19059j02;
                }
                c19059j0.f94941p = obj3;
                flowCollector = flowKt__TransformKt$runningFold$1$1.f106965r;
                obj2 = flowKt__TransformKt$runningFold$1$1.f106963p.f94941p;
                flowKt__TransformKt$runningFold$1$1$emit$1.f106966s = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.f106967t = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.f106970w = 2;
                if (flowCollector.mo12109b(obj2, flowKt__TransformKt$runningFold$1$1$emit$1) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        Object obj32 = flowKt__TransformKt$runningFold$1$1$emit$1.f106968u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__TransformKt$runningFold$1$1$emit$1.f106970w;
        if (i11 == 0) {
        }
        c19059j0.f94941p = obj32;
        flowCollector = flowKt__TransformKt$runningFold$1$1.f106965r;
        obj2 = flowKt__TransformKt$runningFold$1$1.f106963p.f94941p;
        flowKt__TransformKt$runningFold$1$1$emit$1.f106966s = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.f106967t = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.f106970w = 2;
        if (flowCollector.mo12109b(obj2, flowKt__TransformKt$runningFold$1$1$emit$1) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
