package androidx.work;

import fn0.AbstractC19074t;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.i */
/* loaded from: classes2.dex */
public enum EnumC2150i implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
