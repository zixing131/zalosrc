package p231i7;

import java.util.concurrent.ThreadFactory;

/* renamed from: i7.e */
/* loaded from: classes.dex */
final class ThreadFactoryC20361e implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
