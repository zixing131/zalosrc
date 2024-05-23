package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18510q f106643p;

    /* renamed from: q */
    final /* synthetic */ FlowCollector f106644q;

    public FlowKt__EmittersKt$unsafeTransform$1$1(InterfaceC18510q interfaceC18510q, FlowCollector flowCollector) {
        this.f106643p = interfaceC18510q;
        this.f106644q = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 flowKt__EmittersKt$unsafeTransform$1$1$emit$1;
        Object m142578e;
        int i11;
        if (continuation instanceof FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) {
            flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = (FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) continuation;
            int i12 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106647u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106647u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106645s;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106647u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    InterfaceC18510q interfaceC18510q = this.f106643p;
                    FlowCollector flowCollector = this.f106644q;
                    flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106647u = 1;
                    if (interfaceC18510q.mo45599Hr(flowCollector, obj, flowKt__EmittersKt$unsafeTransform$1$1$emit$1) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__EmittersKt$unsafeTransform$1$1$emit$1 = new FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106645s;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__EmittersKt$unsafeTransform$1$1$emit$1.f106647u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
