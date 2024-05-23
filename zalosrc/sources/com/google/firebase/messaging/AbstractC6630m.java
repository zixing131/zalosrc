package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p202h9.AbstractC19938b;
import p202h9.EnumC19939c;
import p256j5.ThreadFactoryC20918b;

/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes.dex */
abstract class AbstractC6630m {
    /* renamed from: a */
    private static Executor m33912a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20918b(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m33913b() {
        return m33912a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ScheduledExecutorService m33914c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC20918b("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static ExecutorService m33915d() {
        return AbstractC19938b.m103699a().mo103698a(new ThreadFactoryC20918b("Firebase-Messaging-Intent-Handle"), EnumC19939c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ExecutorService m33916e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC20918b("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static ExecutorService m33917f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC20918b("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static ScheduledExecutorService m33918g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC20918b("Firebase-Messaging-Topics-Io"));
    }
}
