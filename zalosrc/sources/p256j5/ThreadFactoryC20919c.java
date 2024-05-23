package p256j5;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j5.c */
/* loaded from: classes2.dex */
public class ThreadFactoryC20919c implements ThreadFactory {

    /* renamed from: a */
    private final String f102779a;

    /* renamed from: b */
    private final AtomicInteger f102780b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f102781c = Executors.defaultThreadFactory();

    public ThreadFactoryC20919c(String str) {
        AbstractC4205o.m19723l(str, "Name must not be null");
        this.f102779a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f102781c.newThread(new RunnableC20920d(runnable, 0));
        newThread.setName(this.f102779a + "[" + this.f102780b.getAndIncrement() + "]");
        return newThread;
    }
}
