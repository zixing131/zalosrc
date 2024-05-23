package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m145345f = "Limit.kt", m145346l = {73}, m145347m = "emitAbort$FlowKt__LimitKt")
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f106731s;

    /* renamed from: t */
    /* synthetic */ Object f106732t;

    /* renamed from: u */
    int f106733u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$emitAbort$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m113367d;
        this.f106732t = obj;
        this.f106733u |= Integer.MIN_VALUE;
        m113367d = FlowKt__LimitKt.m113367d(null, null, this);
        return m113367d;
    }
}
