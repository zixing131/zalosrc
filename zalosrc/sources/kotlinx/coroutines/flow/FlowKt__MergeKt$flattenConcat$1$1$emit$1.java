package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m145345f = "Merge.kt", m145346l = {83}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106767s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1 f106768t;

    /* renamed from: u */
    int f106769u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1 flowKt__MergeKt$flattenConcat$1$1, Continuation continuation) {
        super(continuation);
        this.f106768t = flowKt__MergeKt$flattenConcat$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106767s = obj;
        this.f106769u |= Integer.MIN_VALUE;
        return this.f106768t.mo12109b(null, this);
    }
}
