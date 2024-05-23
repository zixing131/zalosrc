package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import um0.C27316g;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class NoOpContinuation implements Continuation<Object> {

    /* renamed from: p */
    public static final NoOpContinuation f107310p = new NoOpContinuation();

    /* renamed from: q */
    private static final InterfaceC27315f f107311q = C27316g.f128559p;

    private NoOpContinuation() {
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return f107311q;
    }
}
