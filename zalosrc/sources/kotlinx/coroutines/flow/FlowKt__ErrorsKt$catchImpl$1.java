package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m145345f = "Errors.kt", m145346l = {156}, m145347m = "catchImpl")
/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f106665s;

    /* renamed from: t */
    /* synthetic */ Object f106666t;

    /* renamed from: u */
    int f106667u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ErrorsKt$catchImpl$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106666t = obj;
        this.f106667u |= Integer.MIN_VALUE;
        return FlowKt.m113289g(null, null, this);
    }
}
