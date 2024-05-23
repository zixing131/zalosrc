package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m145345f = "Limit.kt", m145346l = {37, 38, 40}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106726s;

    /* renamed from: t */
    Object f106727t;

    /* renamed from: u */
    /* synthetic */ Object f106728u;

    /* renamed from: v */
    final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1 f106729v;

    /* renamed from: w */
    int f106730w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1, Continuation continuation) {
        super(continuation);
        this.f106729v = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106728u = obj;
        this.f106730w |= Integer.MIN_VALUE;
        return this.f106729v.mo12109b(null, this);
    }
}
