package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m145345f = "Limit.kt", m145346l = {61, 63}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106737s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__LimitKt$take$2$1 f106738t;

    /* renamed from: u */
    int f106739u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1, Continuation continuation) {
        super(continuation);
        this.f106738t = flowKt__LimitKt$take$2$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106737s = obj;
        this.f106739u |= Integer.MIN_VALUE;
        return this.f106738t.mo12109b(null, this);
    }
}
