package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19069o0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class ChannelFlowKt {
    /* renamed from: b */
    public static final ChannelFlow m113527b(Flow flow) {
        ChannelFlow channelFlow;
        if (flow instanceof ChannelFlow) {
            channelFlow = (ChannelFlow) flow;
        } else {
            channelFlow = null;
        }
        if (channelFlow == null) {
            return new ChannelFlowOperatorImpl(flow, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    /* renamed from: c */
    public static final Object m113528c(InterfaceC27315f interfaceC27315f, Object obj, Object obj2, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        Object m113731c = ThreadContextKt.m113731c(interfaceC27315f, obj2);
        try {
            Object mo240pC = ((InterfaceC18509p) AbstractC19069o0.m100188e(interfaceC18509p, 2)).mo240pC(obj, new StackFrameContinuation(continuation, interfaceC27315f));
            ThreadContextKt.m113729a(interfaceC27315f, m113731c);
            m142578e = AbstractC28298d.m142578e();
            if (mo240pC == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return mo240pC;
        } catch (Throwable th2) {
            ThreadContextKt.m113729a(interfaceC27315f, m113731c);
            throw th2;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Object m113529d(InterfaceC27315f interfaceC27315f, Object obj, Object obj2, InterfaceC18509p interfaceC18509p, Continuation continuation, int i11, Object obj3) {
        if ((i11 & 4) != 0) {
            obj2 = ThreadContextKt.m113730b(interfaceC27315f);
        }
        return m113528c(interfaceC27315f, obj, obj2, interfaceC18509p, continuation);
    }

    /* renamed from: e */
    public static final FlowCollector m113530e(FlowCollector flowCollector, InterfaceC27315f interfaceC27315f) {
        if (!(flowCollector instanceof SendingCollector) && !(flowCollector instanceof NopCollector)) {
            return new UndispatchedContextCollector(flowCollector, interfaceC27315f);
        }
        return flowCollector;
    }
}
