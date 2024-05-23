package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m145345f = "Emitters.kt", m145346l = {53}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106645s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__EmittersKt$unsafeTransform$1$1 f106646t;

    /* renamed from: u */
    int f106647u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$unsafeTransform$1$1$emit$1(FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1, Continuation continuation) {
        super(continuation);
        this.f106646t = flowKt__EmittersKt$unsafeTransform$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106645s = obj;
        this.f106647u |= Integer.MIN_VALUE;
        return this.f106646t.mo12109b(null, this);
    }
}
