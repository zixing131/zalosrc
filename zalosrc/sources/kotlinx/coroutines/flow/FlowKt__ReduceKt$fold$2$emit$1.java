package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m145345f = "Reduce.kt", m145346l = {45}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$fold$2$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106827s;

    /* renamed from: t */
    /* synthetic */ Object f106828t;

    /* renamed from: u */
    final /* synthetic */ FlowKt__ReduceKt$fold$2 f106829u;

    /* renamed from: v */
    int f106830v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$fold$2$emit$1(FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2, Continuation continuation) {
        super(continuation);
        this.f106829u = flowKt__ReduceKt$fold$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106828t = obj;
        this.f106830v |= Integer.MIN_VALUE;
        return this.f106829u.mo12109b(null, this);
    }
}
