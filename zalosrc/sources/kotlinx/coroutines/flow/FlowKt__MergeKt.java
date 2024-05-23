package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a */
    private static final int f106744a = SystemPropsKt.m113714b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* renamed from: a */
    public static final Flow m113369a(Flow flow, InterfaceC18509p interfaceC18509p) {
        return FlowKt.m113282R(flow, new FlowKt__MergeKt$mapLatest$1(interfaceC18509p, null));
    }

    /* renamed from: b */
    public static final Flow m113370b(Flow flow, InterfaceC18510q interfaceC18510q) {
        return new ChannelFlowTransformLatest(interfaceC18510q, flow, null, 0, null, 28, null);
    }
}
