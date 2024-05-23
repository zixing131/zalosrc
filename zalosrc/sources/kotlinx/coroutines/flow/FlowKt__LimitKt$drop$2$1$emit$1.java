package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m145345f = "Limit.kt", m145346l = {25}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$drop$2$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106720s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__LimitKt$drop$2$1 f106721t;

    /* renamed from: u */
    int f106722u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$drop$2$1$emit$1(FlowKt__LimitKt$drop$2$1 flowKt__LimitKt$drop$2$1, Continuation continuation) {
        super(continuation);
        this.f106721t = flowKt__LimitKt$drop$2$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106720s = obj;
        this.f106722u |= Integer.MIN_VALUE;
        return this.f106721t.mo12109b(null, this);
    }
}
