package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m145345f = "Limit.kt", m145346l = {136}, m145347m = "collectWhile")
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$collectWhile$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f106709s;

    /* renamed from: t */
    /* synthetic */ Object f106710t;

    /* renamed from: u */
    int f106711u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$collectWhile$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106710t = obj;
        this.f106711u |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.m113365b(null, null, this);
    }
}
