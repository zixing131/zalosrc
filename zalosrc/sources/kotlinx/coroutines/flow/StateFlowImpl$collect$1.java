package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.StateFlowImpl", m145345f = "StateFlow.kt", m145346l = {384, 396, 401}, m145347m = "collect")
/* loaded from: classes7.dex */
public final class StateFlowImpl$collect$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f107162s;

    /* renamed from: t */
    Object f107163t;

    /* renamed from: u */
    Object f107164u;

    /* renamed from: v */
    Object f107165v;

    /* renamed from: w */
    Object f107166w;

    /* renamed from: x */
    /* synthetic */ Object f107167x;

    /* renamed from: y */
    final /* synthetic */ StateFlowImpl f107168y;

    /* renamed from: z */
    int f107169z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl stateFlowImpl, Continuation continuation) {
        super(continuation);
        this.f107168y = stateFlowImpl;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107167x = obj;
        this.f107169z |= Integer.MIN_VALUE;
        return this.f107168y.mo97893a(null, this);
    }
}
