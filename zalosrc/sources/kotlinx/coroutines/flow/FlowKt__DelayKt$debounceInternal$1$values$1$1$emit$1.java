package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m145345f = "Delay.kt", m145346l = {210}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106555s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__DelayKt$debounceInternal$1$values$1.C218111 f106556t;

    /* renamed from: u */
    int f106557u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(FlowKt__DelayKt$debounceInternal$1$values$1.C218111 c218111, Continuation continuation) {
        super(continuation);
        this.f106556t = c218111;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106555s = obj;
        this.f106557u |= Integer.MIN_VALUE;
        return this.f106556t.mo12109b(null, this);
    }
}
