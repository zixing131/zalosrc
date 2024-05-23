package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.concurrent.b */
/* loaded from: classes.dex */
public class ThreadFactoryC6547b implements ThreadFactory {

    /* renamed from: e */
    private static final ThreadFactory f36412e = Executors.defaultThreadFactory();

    /* renamed from: a */
    private final AtomicLong f36413a = new AtomicLong();

    /* renamed from: b */
    private final String f36414b;

    /* renamed from: c */
    private final int f36415c;

    /* renamed from: d */
    private final StrictMode.ThreadPolicy f36416d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC6547b(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        this.f36414b = str;
        this.f36415c = i11;
        this.f36416d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m33493b(Runnable runnable) {
        Process.setThreadPriority(this.f36415c);
        StrictMode.ThreadPolicy threadPolicy = this.f36416d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f36412e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC6547b.this.m33493b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f36414b, Long.valueOf(this.f36413a.getAndIncrement())));
        return newThread;
    }
}
