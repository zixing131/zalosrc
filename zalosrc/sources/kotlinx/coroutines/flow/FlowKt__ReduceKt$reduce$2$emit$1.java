package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", m145345f = "Reduce.kt", m145346l = {25}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$reduce$2$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106844s;

    /* renamed from: t */
    /* synthetic */ Object f106845t;

    /* renamed from: u */
    final /* synthetic */ FlowKt__ReduceKt$reduce$2 f106846u;

    /* renamed from: v */
    int f106847v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$reduce$2$emit$1(FlowKt__ReduceKt$reduce$2 flowKt__ReduceKt$reduce$2, Continuation continuation) {
        super(continuation);
        this.f106846u = flowKt__ReduceKt$reduce$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106845t = obj;
        this.f106847v |= Integer.MIN_VALUE;
        return this.f106846u.mo12109b(null, this);
    }
}
