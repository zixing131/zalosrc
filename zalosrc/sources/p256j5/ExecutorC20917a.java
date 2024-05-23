package p256j5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p538u5.HandlerC27038e;

/* renamed from: j5.a */
/* loaded from: classes2.dex */
public class ExecutorC20917a implements Executor {

    /* renamed from: p */
    private final Handler f102776p;

    public ExecutorC20917a(Looper looper) {
        this.f102776p = new HandlerC27038e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f102776p.post(runnable);
    }
}
