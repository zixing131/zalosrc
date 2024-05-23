package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m145345f = "Share.kt", m145346l = {419, 423}, m145347m = "onSubscription")
/* loaded from: classes7.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f107175s;

    /* renamed from: t */
    Object f107176t;

    /* renamed from: u */
    /* synthetic */ Object f107177u;

    /* renamed from: v */
    final /* synthetic */ SubscribedFlowCollector f107178v;

    /* renamed from: w */
    int f107179w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector subscribedFlowCollector, Continuation continuation) {
        super(continuation);
        this.f107178v = subscribedFlowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107177u = obj;
        this.f107179w |= Integer.MIN_VALUE;
        return this.f107178v.m113513a(this);
    }
}
