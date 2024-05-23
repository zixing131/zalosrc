package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m145345f = "Errors.kt", m145346l = {158}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106670s;

    /* renamed from: t */
    /* synthetic */ Object f106671t;

    /* renamed from: u */
    final /* synthetic */ FlowKt__ErrorsKt$catchImpl$2 f106672u;

    /* renamed from: v */
    int f106673v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$catchImpl$2$emit$1(FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2, Continuation continuation) {
        super(continuation);
        this.f106672u = flowKt__ErrorsKt$catchImpl$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106671t = obj;
        this.f106673v |= Integer.MIN_VALUE;
        return this.f106672u.mo12109b(null, this);
    }
}
