package kotlinx.coroutines;

import um0.InterfaceC27315f;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public interface Delay {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static DisposableHandle m112664a(Delay delay, long j11, Runnable runnable, InterfaceC27315f interfaceC27315f) {
            return DefaultExecutorKt.m112659a().mo112658y(j11, runnable, interfaceC27315f);
        }
    }

    /* renamed from: q */
    void mo112663q(long j11, CancellableContinuation cancellableContinuation);

    /* renamed from: y */
    DisposableHandle mo112658y(long j11, Runnable runnable, InterfaceC27315f interfaceC27315f);
}
