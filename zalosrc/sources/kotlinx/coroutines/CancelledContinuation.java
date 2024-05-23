package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public final class CancelledContinuation extends CompletedExceptionally {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f105819c = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CancelledContinuation(Continuation continuation, Throwable th2, boolean z11) {
        super(th2, z11);
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        this._resumed = 0;
    }

    /* renamed from: c */
    public final boolean m112592c() {
        return f105819c.compareAndSet(this, 0, 1);
    }
}
