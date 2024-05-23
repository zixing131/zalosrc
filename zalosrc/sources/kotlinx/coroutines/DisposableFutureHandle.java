package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes7.dex */
final class DisposableFutureHandle implements DisposableHandle {

    /* renamed from: p */
    private final Future f105866p;

    public DisposableFutureHandle(Future future) {
        this.f105866p = future;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
        this.f105866p.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f105866p + ']';
    }
}
