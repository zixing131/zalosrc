package p010a4;

import java.util.concurrent.Executor;
import p121e4.AbstractC18197a;

/* renamed from: a4.n */
/* loaded from: classes.dex */
class ExecutorC0121n implements Executor {

    /* renamed from: p */
    private final Executor f696p;

    /* renamed from: a4.n$a */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: p */
        private final Runnable f697p;

        a(Runnable runnable) {
            this.f697p = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f697p.run();
            } catch (Exception e11) {
                AbstractC18197a.m96966d("Executor", "Background execution failure.", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC0121n(Executor executor) {
        this.f696p = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f696p.execute(new a(runnable));
    }
}
