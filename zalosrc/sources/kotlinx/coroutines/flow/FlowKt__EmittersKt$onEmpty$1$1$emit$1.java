package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", m145345f = "Emitters.kt", m145346l = {185}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onEmpty$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106631s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__EmittersKt$onEmpty$1$1 f106632t;

    /* renamed from: u */
    int f106633u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onEmpty$1$1$emit$1(FlowKt__EmittersKt$onEmpty$1$1 flowKt__EmittersKt$onEmpty$1$1, Continuation continuation) {
        super(continuation);
        this.f106632t = flowKt__EmittersKt$onEmpty$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106631s = obj;
        this.f106633u |= Integer.MIN_VALUE;
        return this.f106632t.mo12109b(null, this);
    }
}
