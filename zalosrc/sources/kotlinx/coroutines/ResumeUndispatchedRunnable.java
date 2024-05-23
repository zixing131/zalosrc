package kotlinx.coroutines;

import pm0.C24848g0;

/* loaded from: classes7.dex */
final class ResumeUndispatchedRunnable implements Runnable {

    /* renamed from: p */
    private final CoroutineDispatcher f105940p;

    /* renamed from: q */
    private final CancellableContinuation f105941q;

    public ResumeUndispatchedRunnable(CoroutineDispatcher coroutineDispatcher, CancellableContinuation cancellableContinuation) {
        this.f105940p = coroutineDispatcher;
        this.f105941q = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f105941q.mo112542D(this.f105940p, C24848g0.f119245a);
    }
}
