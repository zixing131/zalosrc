package androidx.core.os;

import android.os.Handler;
import androidx.core.util.AbstractC1487i;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1441g {

    /* renamed from: androidx.core.os.g$a */
    /* loaded from: classes2.dex */
    private static class a implements Executor {

        /* renamed from: p */
        private final Handler f6271p;

        a(Handler handler) {
            this.f6271p = (Handler) AbstractC1487i.m7492g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f6271p.post((Runnable) AbstractC1487i.m7492g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f6271p + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m7348a(Handler handler) {
        return new a(handler);
    }
}
