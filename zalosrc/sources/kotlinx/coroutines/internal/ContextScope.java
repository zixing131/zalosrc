package kotlinx.coroutines.internal;

import kotlinx.coroutines.CoroutineScope;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class ContextScope implements CoroutineScope {

    /* renamed from: p */
    private final InterfaceC27315f f107353p;

    public ContextScope(InterfaceC27315f interfaceC27315f) {
        this.f107353p = interfaceC27315f;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: O */
    public InterfaceC27315f mo9207O() {
        return this.f107353p;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo9207O() + ')';
    }
}
