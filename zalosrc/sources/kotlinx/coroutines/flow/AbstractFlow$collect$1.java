package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.AbstractFlow", m145345f = "Flow.kt", m145346l = {230}, m145347m = "collect")
/* loaded from: classes7.dex */
public final class AbstractFlow$collect$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106402s;

    /* renamed from: t */
    /* synthetic */ Object f106403t;

    /* renamed from: u */
    final /* synthetic */ AbstractFlow f106404u;

    /* renamed from: v */
    int f106405v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow abstractFlow, Continuation continuation) {
        super(continuation);
        this.f106404u = abstractFlow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106403t = obj;
        this.f106405v |= Integer.MIN_VALUE;
        return this.f106404u.mo97893a(null, this);
    }
}
