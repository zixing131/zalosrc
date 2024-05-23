package kotlinx.coroutines.flow;

import fn0.C19055h0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.C25345g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ FlowCollector f106979p;

    /* renamed from: q */
    final /* synthetic */ C19055h0 f106980q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__TransformKt$withIndex$1$1(FlowCollector flowCollector, C19055h0 c19055h0) {
        this.f106979p = flowCollector;
        this.f106980q = c19055h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        Object m142578e;
        int i11;
        if (continuation instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) continuation;
            int i12 = flowKt__TransformKt$withIndex$1$1$emit$1.f106983u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.f106983u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__TransformKt$withIndex$1$1$emit$1.f106981s;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__TransformKt$withIndex$1$1$emit$1.f106983u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    FlowCollector flowCollector = this.f106979p;
                    C19055h0 c19055h0 = this.f106980q;
                    int i13 = c19055h0.f94931p;
                    c19055h0.f94931p = i13 + 1;
                    if (i13 >= 0) {
                        C25345g0 c25345g0 = new C25345g0(i13, obj);
                        flowKt__TransformKt$withIndex$1$1$emit$1.f106983u = 1;
                        if (flowCollector.mo12109b(c25345g0, flowKt__TransformKt$withIndex$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__TransformKt$withIndex$1$1$emit$1.f106981s;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__TransformKt$withIndex$1$1$emit$1.f106983u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
