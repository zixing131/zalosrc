package p256j5;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: j5.b */
/* loaded from: classes.dex */
public class ThreadFactoryC20918b implements ThreadFactory {

    /* renamed from: a */
    private final String f102777a;

    /* renamed from: b */
    private final ThreadFactory f102778b = Executors.defaultThreadFactory();

    public ThreadFactoryC20918b(String str) {
        AbstractC4205o.m19723l(str, "Name must not be null");
        this.f102777a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f102778b.newThread(new RunnableC20920d(runnable, 0));
        newThread.setName(this.f102777a);
        return newThread;
    }
}
