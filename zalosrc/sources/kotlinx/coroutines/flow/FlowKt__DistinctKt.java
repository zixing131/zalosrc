package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a */
    private static final InterfaceC18505l f106594a = FlowKt__DistinctKt$defaultKeySelector$1.f106597q;

    /* renamed from: b */
    private static final InterfaceC18509p f106595b = FlowKt__DistinctKt$defaultAreEquivalent$1.f106596q;

    /* renamed from: a */
    public static final Flow m113351a(Flow flow) {
        if (!(flow instanceof StateFlow)) {
            return m113352b(flow, f106594a, f106595b);
        }
        return flow;
    }

    /* renamed from: b */
    private static final Flow m113352b(Flow flow, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.f106421q == interfaceC18505l && distinctFlowImpl.f106422r == interfaceC18509p) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, interfaceC18505l, interfaceC18509p);
    }
}
