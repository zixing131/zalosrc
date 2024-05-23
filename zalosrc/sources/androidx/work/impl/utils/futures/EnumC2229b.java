package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.futures.b */
/* loaded from: classes2.dex */
enum EnumC2229b implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
