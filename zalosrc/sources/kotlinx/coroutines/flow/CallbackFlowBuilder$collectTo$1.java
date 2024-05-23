package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m145345f = "Builders.kt", m145346l = {334}, m145347m = "collectTo")
/* loaded from: classes7.dex */
public final class CallbackFlowBuilder$collectTo$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106407s;

    /* renamed from: t */
    /* synthetic */ Object f106408t;

    /* renamed from: u */
    final /* synthetic */ CallbackFlowBuilder f106409u;

    /* renamed from: v */
    int f106410v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder callbackFlowBuilder, Continuation continuation) {
        super(continuation);
        this.f106409u = callbackFlowBuilder;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106408t = obj;
        this.f106410v |= Integer.MIN_VALUE;
        return this.f106409u.mo113258g(null, this);
    }
}
