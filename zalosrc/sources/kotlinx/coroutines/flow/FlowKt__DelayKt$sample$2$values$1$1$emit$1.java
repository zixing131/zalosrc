package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m145345f = "Delay.kt", m145346l = {279}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__DelayKt$sample$2$values$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106580s;

    /* renamed from: t */
    final /* synthetic */ FlowKt__DelayKt$sample$2$values$1.C218121 f106581t;

    /* renamed from: u */
    int f106582u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$values$1$1$emit$1(FlowKt__DelayKt$sample$2$values$1.C218121 c218121, Continuation continuation) {
        super(continuation);
        this.f106581t = c218121;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106580s = obj;
        this.f106582u |= Integer.MIN_VALUE;
        return this.f106581t.mo12109b(null, this);
    }
}
