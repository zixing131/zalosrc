package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public final class ThrowingCollector implements FlowCollector<Object> {

    /* renamed from: p */
    public final Throwable f107185p;

    public ThrowingCollector(Throwable th2) {
        this.f107185p = th2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        throw this.f107185p;
    }
}
