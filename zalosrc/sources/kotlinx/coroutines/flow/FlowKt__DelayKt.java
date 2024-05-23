package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__DelayKt {
    /* renamed from: a */
    public static final Flow m113331a(Flow flow, long j11) {
        if (j11 >= 0) {
            if (j11 == 0) {
                return flow;
            }
            return m113332b(flow, new FlowKt__DelayKt$debounce$2(j11));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* renamed from: b */
    private static final Flow m113332b(Flow flow, InterfaceC18505l interfaceC18505l) {
        return FlowCoroutineKt.m113551b(new FlowKt__DelayKt$debounceInternal$1(interfaceC18505l, flow, null));
    }

    /* renamed from: c */
    public static final ReceiveChannel m113333c(CoroutineScope coroutineScope, long j11, long j12) {
        if (j11 >= 0) {
            if (j12 >= 0) {
                return ProduceKt.m113188e(coroutineScope, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j12, j11, null), 1, null);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j12 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j11 + " ms").toString());
    }

    /* renamed from: d */
    public static /* synthetic */ ReceiveChannel m113334d(CoroutineScope coroutineScope, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = j11;
        }
        return FlowKt.m113307y(coroutineScope, j11, j12);
    }
}
