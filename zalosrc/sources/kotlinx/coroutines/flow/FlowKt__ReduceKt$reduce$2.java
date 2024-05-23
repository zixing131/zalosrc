package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$reduce$2<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ C19059j0 f106842p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106843q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ReduceKt$reduce$2(C19059j0 c19059j0, InterfaceC18510q interfaceC18510q) {
        this.f106842p = c19059j0;
        this.f106843q = interfaceC18510q;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        C19059j0 c19059j02;
        if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            int i12 = flowKt__ReduceKt$reduce$2$emit$1.f106847v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.f106847v = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__ReduceKt$reduce$2$emit$1.f106845t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ReduceKt$reduce$2$emit$1.f106847v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j02 = (C19059j0) flowKt__ReduceKt$reduce$2$emit$1.f106844s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    c19059j0 = this.f106842p;
                    Object obj3 = c19059j0.f94941p;
                    if (obj3 != NullSurrogateKt.f107313a) {
                        InterfaceC18510q interfaceC18510q = this.f106843q;
                        flowKt__ReduceKt$reduce$2$emit$1.f106844s = c19059j0;
                        flowKt__ReduceKt$reduce$2$emit$1.f106847v = 1;
                        Object mo45599Hr = interfaceC18510q.mo45599Hr(obj3, obj, flowKt__ReduceKt$reduce$2$emit$1);
                        if (mo45599Hr == m142578e) {
                            return m142578e;
                        }
                        obj2 = mo45599Hr;
                        c19059j02 = c19059j0;
                    }
                    c19059j0.f94941p = obj;
                    return C24848g0.f119245a;
                }
                Object obj4 = obj2;
                c19059j0 = c19059j02;
                obj = obj4;
                c19059j0.f94941p = obj;
                return C24848g0.f119245a;
            }
        }
        flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
        Object obj22 = flowKt__ReduceKt$reduce$2$emit$1.f106845t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ReduceKt$reduce$2$emit$1.f106847v;
        if (i11 == 0) {
        }
        Object obj42 = obj22;
        c19059j0 = c19059j02;
        obj = obj42;
        c19059j0.f94941p = obj;
        return C24848g0.f119245a;
    }
}
