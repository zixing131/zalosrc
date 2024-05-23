package p342m6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p050c6.HandlerC3298a;

/* renamed from: m6.m0 */
/* loaded from: classes.dex */
final class ExecutorC22895m0 implements Executor {

    /* renamed from: p */
    private final Handler f111516p = new HandlerC3298a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f111516p.post(runnable);
    }
}
