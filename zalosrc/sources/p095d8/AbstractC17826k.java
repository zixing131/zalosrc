package p095d8;

import java.util.concurrent.Executor;

/* renamed from: d8.k */
/* loaded from: classes.dex */
public abstract class AbstractC17826k {

    /* renamed from: d8.k$a */
    /* loaded from: classes3.dex */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m94062a() {
        return a.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m94063b(Executor executor) {
        return new ExecutorC17827l(executor);
    }
}
