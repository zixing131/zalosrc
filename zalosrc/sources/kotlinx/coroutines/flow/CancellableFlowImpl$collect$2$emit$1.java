package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m145345f = "Context.kt", m145346l = {275}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class CancellableFlowImpl$collect$2$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106413s;

    /* renamed from: t */
    final /* synthetic */ CancellableFlowImpl$collect$2 f106414t;

    /* renamed from: u */
    int f106415u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl$collect$2 cancellableFlowImpl$collect$2, Continuation continuation) {
        super(continuation);
        this.f106414t = cancellableFlowImpl$collect$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106413s = obj;
        this.f106415u |= Integer.MIN_VALUE;
        return this.f106414t.mo12109b(null, this);
    }
}
