package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import um0.InterfaceC27315f;
import wm0.InterfaceC29097e;

/* loaded from: classes7.dex */
final class StackFrameContinuation<T> implements Continuation<T>, InterfaceC29097e {

    /* renamed from: p */
    private final Continuation f107330p;

    /* renamed from: q */
    private final InterfaceC27315f f107331q;

    public StackFrameContinuation(Continuation continuation, InterfaceC27315f interfaceC27315f) {
        this.f107330p = continuation;
        this.f107331q = interfaceC27315f;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: C */
    public StackTraceElement mo112573C() {
        return null;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: e */
    public InterfaceC29097e mo112582e() {
        Continuation continuation = this.f107330p;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        this.f107330p.mo112492g(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return this.f107331q;
    }
}
