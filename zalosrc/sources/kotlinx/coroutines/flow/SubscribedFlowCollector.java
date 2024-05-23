package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.SafeCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {

    /* renamed from: p */
    private final FlowCollector f107173p;

    /* renamed from: q */
    private final InterfaceC18509p f107174q;

    public SubscribedFlowCollector(FlowCollector flowCollector, InterfaceC18509p interfaceC18509p) {
        this.f107173p = flowCollector;
        this.f107174q = interfaceC18509p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m113513a(Continuation continuation) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        Object m142578e;
        ?? r22;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
        try {
            if (continuation instanceof SubscribedFlowCollector$onSubscription$1) {
                subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuation;
                int i11 = subscribedFlowCollector$onSubscription$1.f107179w;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    subscribedFlowCollector$onSubscription$1.f107179w = i11 - Integer.MIN_VALUE;
                    Object obj = subscribedFlowCollector$onSubscription$1.f107177u;
                    m142578e = AbstractC28298d.m142578e();
                    r22 = subscribedFlowCollector$onSubscription$1.f107179w;
                    if (r22 == 0) {
                        if (r22 != 1) {
                            if (r22 == 2) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.f107176t;
                        subscribedFlowCollector = (SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.f107175s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        AbstractC24862s.m129228b(obj);
                        safeCollector = new SafeCollector(this.f107173p, subscribedFlowCollector$onSubscription$1.getContext());
                        InterfaceC18509p interfaceC18509p = this.f107174q;
                        subscribedFlowCollector$onSubscription$1.f107175s = this;
                        subscribedFlowCollector$onSubscription$1.f107176t = safeCollector;
                        subscribedFlowCollector$onSubscription$1.f107179w = 1;
                        if (interfaceC18509p.mo240pC(safeCollector, subscribedFlowCollector$onSubscription$1) == m142578e) {
                            return m142578e;
                        }
                        subscribedFlowCollector = this;
                    }
                    safeCollector.mo113558p();
                    FlowCollector flowCollector = subscribedFlowCollector.f107173p;
                    r22 = flowCollector instanceof SubscribedFlowCollector;
                    if (r22 == 0) {
                        subscribedFlowCollector$onSubscription$1.f107175s = null;
                        subscribedFlowCollector$onSubscription$1.f107176t = null;
                        subscribedFlowCollector$onSubscription$1.f107179w = 2;
                        if (((SubscribedFlowCollector) flowCollector).m113513a(subscribedFlowCollector$onSubscription$1) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
            }
            if (r22 == 0) {
            }
            safeCollector.mo113558p();
            FlowCollector flowCollector2 = subscribedFlowCollector.f107173p;
            r22 = flowCollector2 instanceof SubscribedFlowCollector;
            if (r22 == 0) {
            }
        } catch (Throwable th2) {
            r22.mo113558p();
            throw th2;
        }
        subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuation);
        Object obj2 = subscribedFlowCollector$onSubscription$1.f107177u;
        m142578e = AbstractC28298d.m142578e();
        r22 = subscribedFlowCollector$onSubscription$1.f107179w;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        return this.f107173p.mo12109b(obj, continuation);
    }
}
