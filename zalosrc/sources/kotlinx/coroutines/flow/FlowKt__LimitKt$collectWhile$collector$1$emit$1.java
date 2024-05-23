package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", m145345f = "Limit.kt", m145346l = {130}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106713s;

    /* renamed from: t */
    /* synthetic */ Object f106714t;

    /* renamed from: u */
    final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 f106715u;

    /* renamed from: v */
    int f106716v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, Continuation continuation) {
        super(continuation);
        this.f106715u = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106714t = obj;
        this.f106716v |= Integer.MIN_VALUE;
        return this.f106715u.mo12109b(null, this);
    }
}
