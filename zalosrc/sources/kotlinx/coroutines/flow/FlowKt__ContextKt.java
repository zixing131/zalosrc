package kotlinx.coroutines.flow;

import fn0.AbstractC19074t;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import um0.C27316g;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__ContextKt {
    /* renamed from: a */
    public static final Flow m113324a(Flow flow, int i11, BufferOverflow bufferOverflow) {
        int i12;
        BufferOverflow bufferOverflow2;
        if (i11 < 0 && i11 != -2 && i11 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i11).toString());
        }
        if (i11 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i11 == -1) {
            bufferOverflow2 = BufferOverflow.DROP_OLDEST;
            i12 = 0;
        } else {
            i12 = i11;
            bufferOverflow2 = bufferOverflow;
        }
        if (flow instanceof FusibleFlow) {
            return FusibleFlow.DefaultImpls.m113554a((FusibleFlow) flow, null, i12, bufferOverflow2, 1, null);
        }
        return new ChannelFlowOperatorImpl(flow, null, i12, bufferOverflow2, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ Flow m113325b(Flow flow, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -2;
        }
        if ((i12 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.m113285c(flow, i11, bufferOverflow);
    }

    /* renamed from: c */
    private static final void m113326c(InterfaceC27315f interfaceC27315f) {
        if (interfaceC27315f.mo112624d(Job.f105897m) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC27315f).toString());
    }

    /* renamed from: d */
    public static final Flow m113327d(Flow flow) {
        Flow m113325b;
        m113325b = m113325b(flow, -1, null, 2, null);
        return m113325b;
    }

    /* renamed from: e */
    public static final Flow m113328e(Flow flow, InterfaceC27315f interfaceC27315f) {
        m113326c(interfaceC27315f);
        if (!AbstractC19074t.m100204b(interfaceC27315f, C27316g.f128559p)) {
            if (flow instanceof FusibleFlow) {
                return FusibleFlow.DefaultImpls.m113554a((FusibleFlow) flow, interfaceC27315f, 0, null, 6, null);
            }
            return new ChannelFlowOperatorImpl(flow, interfaceC27315f, 0, null, 12, null);
        }
        return flow;
    }
}
