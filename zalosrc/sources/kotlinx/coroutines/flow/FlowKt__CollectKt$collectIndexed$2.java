package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;

/* loaded from: classes7.dex */
public final class FlowKt__CollectKt$collectIndexed$2 implements FlowCollector<Object> {

    /* renamed from: p */
    private int f106510p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106511q;

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        Object m142578e;
        InterfaceC18510q interfaceC18510q = this.f106511q;
        int i11 = this.f106510p;
        this.f106510p = i11 + 1;
        if (i11 >= 0) {
            Object mo45599Hr = interfaceC18510q.mo45599Hr(AbstractC29094b.m145341c(i11), obj, continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo45599Hr == m142578e) {
                return mo45599Hr;
            }
            return C24848g0.f119245a;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
}
