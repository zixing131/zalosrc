package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__BuildersKt {
    /* renamed from: a */
    public static final Flow m113309a(InterfaceC18509p interfaceC18509p) {
        return new CallbackFlowBuilder(interfaceC18509p, null, 0, null, 14, null);
    }

    /* renamed from: b */
    public static final Flow m113310b(InterfaceC18509p interfaceC18509p) {
        return new ChannelFlowBuilder(interfaceC18509p, null, 0, null, 14, null);
    }

    /* renamed from: c */
    public static final Flow m113311c(InterfaceC18509p interfaceC18509p) {
        return new SafeFlow(interfaceC18509p);
    }

    /* renamed from: d */
    public static final Flow m113312d(final Object obj) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            /* renamed from: a */
            public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                Object m142578e;
                Object mo12109b = flowCollector.mo12109b(obj, continuation);
                m142578e = AbstractC28298d.m142578e();
                if (mo12109b == m142578e) {
                    return mo12109b;
                }
                return C24848g0.f119245a;
            }
        };
    }
}
