package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    /* renamed from: b */
    public static final Object m113314b(FlowCollector flowCollector, ReceiveChannel receiveChannel, Continuation continuation) {
        Object m142578e;
        Object m113315c = m113315c(flowCollector, receiveChannel, true, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113315c == m142578e) {
            return m113315c;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113315c(FlowCollector flowCollector, ReceiveChannel receiveChannel, boolean z11, Continuation continuation) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        Object m142578e;
        int i11;
        ChannelIterator it;
        ChannelIterator channelIterator;
        FlowCollector flowCollector2;
        Object mo113028a;
        try {
            if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
                int i12 = flowKt__ChannelsKt$emitAllImpl$1.f106505x;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.f106505x = i12 - Integer.MIN_VALUE;
                    Object obj = flowKt__ChannelsKt$emitAllImpl$1.f106504w;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = flowKt__ChannelsKt$emitAllImpl$1.f106505x;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                z11 = flowKt__ChannelsKt$emitAllImpl$1.f106503v;
                                channelIterator = (ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.f106502u;
                                receiveChannel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.f106501t;
                                flowCollector2 = (FlowCollector) flowKt__ChannelsKt$emitAllImpl$1.f106500s;
                                AbstractC24862s.m129228b(obj);
                                it = channelIterator;
                                flowCollector = flowCollector2;
                                flowKt__ChannelsKt$emitAllImpl$1.f106500s = flowCollector;
                                flowKt__ChannelsKt$emitAllImpl$1.f106501t = receiveChannel;
                                flowKt__ChannelsKt$emitAllImpl$1.f106502u = it;
                                flowKt__ChannelsKt$emitAllImpl$1.f106503v = z11;
                                flowKt__ChannelsKt$emitAllImpl$1.f106505x = 1;
                                mo113028a = it.mo113028a(flowKt__ChannelsKt$emitAllImpl$1);
                                if (mo113028a == m142578e) {
                                    return m142578e;
                                }
                                flowCollector2 = flowCollector;
                                channelIterator = it;
                                obj = mo113028a;
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = channelIterator.next();
                                    flowKt__ChannelsKt$emitAllImpl$1.f106500s = flowCollector2;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106501t = receiveChannel;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106502u = channelIterator;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106503v = z11;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106505x = 2;
                                    if (flowCollector2.mo12109b(next, flowKt__ChannelsKt$emitAllImpl$1) == m142578e) {
                                        return m142578e;
                                    }
                                    it = channelIterator;
                                    flowCollector = flowCollector2;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106500s = flowCollector;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106501t = receiveChannel;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106502u = it;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106503v = z11;
                                    flowKt__ChannelsKt$emitAllImpl$1.f106505x = 1;
                                    mo113028a = it.mo113028a(flowKt__ChannelsKt$emitAllImpl$1);
                                    if (mo113028a == m142578e) {
                                    }
                                } else {
                                    if (z11) {
                                        ChannelsKt.m113108b(receiveChannel, null);
                                    }
                                    return C24848g0.f119245a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z11 = flowKt__ChannelsKt$emitAllImpl$1.f106503v;
                            channelIterator = (ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.f106502u;
                            receiveChannel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.f106501t;
                            flowCollector2 = (FlowCollector) flowKt__ChannelsKt$emitAllImpl$1.f106500s;
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        FlowKt.m113302t(flowCollector);
                        it = receiveChannel.iterator();
                        flowKt__ChannelsKt$emitAllImpl$1.f106500s = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.f106501t = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.f106502u = it;
                        flowKt__ChannelsKt$emitAllImpl$1.f106503v = z11;
                        flowKt__ChannelsKt$emitAllImpl$1.f106505x = 1;
                        mo113028a = it.mo113028a(flowKt__ChannelsKt$emitAllImpl$1);
                        if (mo113028a == m142578e) {
                        }
                    }
                }
            }
            if (i11 == 0) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z11) {
                    ChannelsKt.m113108b(receiveChannel, th2);
                }
                throw th3;
            }
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.f106504w;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ChannelsKt$emitAllImpl$1.f106505x;
    }

    /* renamed from: d */
    public static final ReceiveChannel m113316d(Flow flow, CoroutineScope coroutineScope) {
        return ChannelFlowKt.m113527b(flow).mo113263o(coroutineScope);
    }

    /* renamed from: e */
    public static final Flow m113317e(ReceiveChannel receiveChannel) {
        return new ChannelAsFlow(receiveChannel, false, null, 0, null, 28, null);
    }
}
