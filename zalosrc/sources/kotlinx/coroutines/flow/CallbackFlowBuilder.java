package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class CallbackFlowBuilder<T> extends ChannelFlowBuilder<T> {

    /* renamed from: t */
    private final InterfaceC18509p f106406t;

    public /* synthetic */ CallbackFlowBuilder(InterfaceC18509p interfaceC18509p, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, int i12, AbstractC19060k abstractC19060k) {
        this(interfaceC18509p, (i12 & 2) != 0 ? C27316g.f128559p : interfaceC27315f, (i12 & 4) != 0 ? -2 : i11, (i12 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo113258g(ProducerScope producerScope, Continuation continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        Object m142578e;
        int i11;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i12 = callbackFlowBuilder$collectTo$1.f106410v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.f106410v = i12 - Integer.MIN_VALUE;
                Object obj = callbackFlowBuilder$collectTo$1.f106408t;
                m142578e = AbstractC28298d.m142578e();
                i11 = callbackFlowBuilder$collectTo$1.f106410v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        producerScope = (ProducerScope) callbackFlowBuilder$collectTo$1.f106407s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    callbackFlowBuilder$collectTo$1.f106407s = producerScope;
                    callbackFlowBuilder$collectTo$1.f106410v = 1;
                    if (super.mo113258g(producerScope, callbackFlowBuilder$collectTo$1) == m142578e) {
                        return m142578e;
                    }
                }
                if (!producerScope.mo112909T()) {
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, continuation);
        Object obj2 = callbackFlowBuilder$collectTo$1.f106408t;
        m142578e = AbstractC28298d.m142578e();
        i11 = callbackFlowBuilder$collectTo$1.f106410v;
        if (i11 == 0) {
        }
        if (!producerScope.mo112909T()) {
        }
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    protected ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f106406t, interfaceC27315f, i11, bufferOverflow);
    }

    public CallbackFlowBuilder(InterfaceC18509p interfaceC18509p, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        super(interfaceC18509p, interfaceC27315f, i11, bufferOverflow);
        this.f106406t = interfaceC18509p;
    }
}
