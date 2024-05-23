package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SubscribedSharedFlow<T> implements SharedFlow<T> {

    /* renamed from: p */
    private final SharedFlow f107180p;

    /* renamed from: q */
    private final InterfaceC18509p f107181q;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        Object m142578e;
        int i11;
        if (continuation instanceof SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1) continuation;
            int i12 = subscribedSharedFlow$collect$1.f107184u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                subscribedSharedFlow$collect$1.f107184u = i12 - Integer.MIN_VALUE;
                Object obj = subscribedSharedFlow$collect$1.f107182s;
                m142578e = AbstractC28298d.m142578e();
                i11 = subscribedSharedFlow$collect$1.f107184u;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    SharedFlow sharedFlow = this.f107180p;
                    SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(flowCollector, this.f107181q);
                    subscribedSharedFlow$collect$1.f107184u = 1;
                    if (sharedFlow.mo97893a(subscribedFlowCollector, subscribedSharedFlow$collect$1) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, continuation);
        Object obj2 = subscribedSharedFlow$collect$1.f107182s;
        m142578e = AbstractC28298d.m142578e();
        i11 = subscribedSharedFlow$collect$1.f107184u;
        if (i11 == 0) {
        }
        throw new KotlinNothingValueException();
    }
}
