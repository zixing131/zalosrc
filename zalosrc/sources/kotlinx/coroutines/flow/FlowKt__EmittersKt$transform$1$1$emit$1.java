package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m145345f = "Emitters.kt", m145346l = {42}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$transform$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106640s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__EmittersKt$transform$1.C218171 f106641t;

    /* renamed from: u */
    int f106642u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1$1$emit$1(FlowKt__EmittersKt$transform$1.C218171 c218171, Continuation continuation) {
        super(continuation);
        this.f106641t = c218171;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106640s = obj;
        this.f106642u |= Integer.MIN_VALUE;
        return this.f106641t.mo12109b(null, this);
    }
}