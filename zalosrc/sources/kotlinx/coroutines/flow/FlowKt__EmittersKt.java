package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__EmittersKt {
    /* renamed from: b */
    public static final void m113355b(FlowCollector flowCollector) {
        if (!(flowCollector instanceof ThrowingCollector)) {
        } else {
            throw ((ThrowingCollector) flowCollector).f107185p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113356c(FlowCollector flowCollector, InterfaceC18510q interfaceC18510q, Throwable th2, Continuation continuation) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof FlowKt__EmittersKt$invokeSafely$1) {
                flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuation;
                int i12 = flowKt__EmittersKt$invokeSafely$1.f106628u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$invokeSafely$1.f106628u = i12 - Integer.MIN_VALUE;
                    Object obj = flowKt__EmittersKt$invokeSafely$1.f106627t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = flowKt__EmittersKt$invokeSafely$1.f106628u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            th2 = (Throwable) flowKt__EmittersKt$invokeSafely$1.f106626s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        flowKt__EmittersKt$invokeSafely$1.f106626s = th2;
                        flowKt__EmittersKt$invokeSafely$1.f106628u = 1;
                        if (interfaceC18510q.mo45599Hr(flowCollector, th2, flowKt__EmittersKt$invokeSafely$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            if (i11 == 0) {
            }
            return C24848g0.f119245a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                AbstractC24845f.m129182a(th3, th2);
            }
            throw th3;
        }
        flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
        Object obj2 = flowKt__EmittersKt$invokeSafely$1.f106627t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__EmittersKt$invokeSafely$1.f106628u;
    }
}
