package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p229i5.AbstractC20284e;

/* loaded from: classes2.dex */
public abstract class kl0 {

    /* renamed from: a */
    public static final uc3 f23363a;

    /* renamed from: b */
    public static final uc3 f23364b;

    /* renamed from: c */
    public static final uc3 f23365c;

    /* renamed from: d */
    public static final ScheduledExecutorService f23366d;

    /* renamed from: e */
    public static final uc3 f23367e;

    /* renamed from: f */
    public static final uc3 f23368f;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (AbstractC20284e.m105912a()) {
            l23.m24108a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new fl0("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new fl0("Default"));
        }
        f23363a = new jl0(threadPoolExecutor, null);
        if (AbstractC20284e.m105912a()) {
            executor = l23.m24108a().mo23117c(5, new fl0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new fl0("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor2;
        }
        f23364b = new jl0(executor, null);
        if (AbstractC20284e.m105912a()) {
            executor2 = l23.m24108a().mo23116b(new fl0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new fl0("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor3;
        }
        f23365c = new jl0(executor2, null);
        f23366d = new el0(3, new fl0("Schedule"));
        f23367e = new jl0(new gl0(), null);
        f23368f = new jl0(ad3.m20088b(), null);
    }
}
