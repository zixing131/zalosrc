package fg0;

import fn0.AbstractC19074t;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fg0.a */
/* loaded from: classes.dex */
public class ThreadFactoryC18928a implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f94435a;

    /* renamed from: b */
    private final String f94436b;

    /* renamed from: c */
    private final String f94437c;

    public ThreadFactoryC18928a(String str) {
        AbstractC19074t.m100208f(str, "poolName");
        this.f94437c = str;
        this.f94435a = new AtomicInteger(1);
        this.f94436b = "Z:" + str + '-';
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "r");
        return new Thread(runnable, this.f94436b + this.f94435a.getAndIncrement());
    }

    public String toString() {
        return "DefaultThreadFactory[Z:" + this.f94437c + ']';
    }
}
