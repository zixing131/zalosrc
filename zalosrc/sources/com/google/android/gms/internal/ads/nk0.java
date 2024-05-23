package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class nk0 {

    /* renamed from: a */
    public static final ThreadPoolExecutor f25221a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new mk0("ClientDefault"));

    /* renamed from: b */
    public static final ExecutorService f25222b = Executors.newSingleThreadExecutor(new mk0("ClientSingle"));
}
