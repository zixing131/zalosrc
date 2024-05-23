package com.zing.zalo.service;

import android.os.SystemClock;
import rw.C25982c;
import rw.C25983d;

/* loaded from: classes.dex */
public class TaskNonStickyExecutor {

    /* renamed from: c */
    public static final Object f49559c = new Object();

    /* renamed from: d */
    public static final Object f49560d = new Object();

    /* renamed from: e */
    public static final Object f49561e = new Object();

    /* renamed from: f */
    public static final Object f49562f = new Object();

    /* renamed from: g */
    public static final Object f49563g = new Object();

    /* renamed from: h */
    private static final String f49564h = "TaskNonStickyExecutor";

    /* renamed from: i */
    private static TaskNonStickyExecutor f49565i;

    /* renamed from: a */
    private final C25983d f49566a;

    /* renamed from: b */
    private final C25982c f49567b;

    private TaskNonStickyExecutor() {
        C25983d c25983d = new C25983d(f49564h);
        this.f49566a = c25983d;
        c25983d.start();
        this.f49567b = new C25982c(c25983d.m133836a());
    }

    /* renamed from: b */
    public static TaskNonStickyExecutor m50450b() {
        TaskNonStickyExecutor taskNonStickyExecutor;
        synchronized (TaskNonStickyExecutor.class) {
            try {
                if (f49565i == null) {
                    f49565i = new TaskNonStickyExecutor();
                }
                taskNonStickyExecutor = f49565i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taskNonStickyExecutor;
    }

    /* renamed from: a */
    public void m50451a(Object obj) {
        if (obj != null) {
            this.f49567b.m133831o(obj);
        }
    }

    /* renamed from: c */
    public void m50452c(Runnable runnable) {
        if (runnable != null) {
            this.f49567b.m133830n(runnable);
        }
    }

    /* renamed from: d */
    public void m50453d(Runnable runnable) {
        this.f49567b.m133828l(runnable, null, SystemClock.elapsedRealtime());
    }

    /* renamed from: e */
    public void m50454e(Runnable runnable, long j11) {
        this.f49567b.m133828l(runnable, null, SystemClock.elapsedRealtime() + j11);
    }

    /* renamed from: f */
    public void m50455f(Runnable runnable, Object obj) {
        if (obj != null) {
            this.f49567b.m133831o(obj);
        }
        this.f49567b.m133828l(runnable, obj, SystemClock.elapsedRealtime());
    }

    /* renamed from: g */
    public void m50456g(Runnable runnable, Object obj, long j11) {
        if (obj != null) {
            this.f49567b.m133831o(obj);
        }
        this.f49567b.m133828l(runnable, obj, SystemClock.elapsedRealtime() + j11);
    }

    /* renamed from: h */
    public void m50457h(Runnable runnable, Object obj, long j11) {
        this.f49567b.m133828l(runnable, obj, SystemClock.elapsedRealtime() + j11);
    }
}
