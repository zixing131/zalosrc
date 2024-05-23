package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m145345f = "Share.kt", m145346l = {409}, m145347m = "collect")
/* loaded from: classes7.dex */
public final class SubscribedSharedFlow$collect$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f107182s;

    /* renamed from: t */
    final /* synthetic */ SubscribedSharedFlow f107183t;

    /* renamed from: u */
    int f107184u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedSharedFlow$collect$1(SubscribedSharedFlow subscribedSharedFlow, Continuation continuation) {
        super(continuation);
        this.f107183t = subscribedSharedFlow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107182s = obj;
        this.f107184u |= Integer.MIN_VALUE;
        return this.f107183t.mo97893a(null, this);
    }
}
