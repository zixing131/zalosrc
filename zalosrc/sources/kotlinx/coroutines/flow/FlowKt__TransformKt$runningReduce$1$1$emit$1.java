package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", m145345f = "Transform.kt", m145346l = {131, 133}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningReduce$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106974s;

    /* renamed from: t */
    Object f106975t;

    /* renamed from: u */
    /* synthetic */ Object f106976u;

    /* renamed from: v */
    final /* synthetic */ FlowKt__TransformKt$runningReduce$1$1 f106977v;

    /* renamed from: w */
    int f106978w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningReduce$1$1$emit$1(FlowKt__TransformKt$runningReduce$1$1 flowKt__TransformKt$runningReduce$1$1, Continuation continuation) {
        super(continuation);
        this.f106977v = flowKt__TransformKt$runningReduce$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106976u = obj;
        this.f106978w |= Integer.MIN_VALUE;
        return this.f106977v.mo12109b(null, this);
    }
}
