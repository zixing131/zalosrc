package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m145345f = "Reduce.kt", m145346l = {57}, m145347m = "single")
/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$single$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f106848s;

    /* renamed from: t */
    /* synthetic */ Object f106849t;

    /* renamed from: u */
    int f106850u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ReduceKt$single$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106849t = obj;
        this.f106850u |= Integer.MIN_VALUE;
        return FlowKt.m113278N(null, this);
    }
}
