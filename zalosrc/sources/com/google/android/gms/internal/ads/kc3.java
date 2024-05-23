package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class kc3 extends mc3 {
    /* renamed from: a */
    public static jc3 m23869a(Iterable iterable) {
        return new jc3(false, c83.m20829t(iterable), null);
    }

    /* renamed from: b */
    public static jc3 m23870b(tc3... tc3VarArr) {
        return new jc3(false, c83.m20831v(tc3VarArr), null);
    }

    /* renamed from: c */
    public static jc3 m23871c(Iterable iterable) {
        return new jc3(true, c83.m20829t(iterable), null);
    }

    /* renamed from: d */
    public static jc3 m23872d(tc3... tc3VarArr) {
        return new jc3(true, c83.m20831v(tc3VarArr), null);
    }

    /* renamed from: e */
    public static tc3 m23873e(Iterable iterable) {
        return new rb3(c83.m20829t(iterable), true);
    }

    /* renamed from: f */
    public static tc3 m23874f(tc3 tc3Var, Class cls, y43 y43Var, Executor executor) {
        ka3 ka3Var = new ka3(tc3Var, cls, y43Var);
        tc3Var.zzc(ka3Var, ad3.m20089c(executor, ka3Var));
        return ka3Var;
    }

    /* renamed from: g */
    public static tc3 m23875g(tc3 tc3Var, Class cls, qb3 qb3Var, Executor executor) {
        ja3 ja3Var = new ja3(tc3Var, cls, qb3Var);
        tc3Var.zzc(ja3Var, ad3.m20089c(executor, ja3Var));
        return ja3Var;
    }

    /* renamed from: h */
    public static tc3 m23876h(Throwable th2) {
        th2.getClass();
        return new nc3(th2);
    }

    /* renamed from: i */
    public static tc3 m23877i(Object obj) {
        if (obj == null) {
            return oc3.f25596q;
        }
        return new oc3(obj);
    }

    /* renamed from: j */
    public static tc3 m23878j() {
        return oc3.f25596q;
    }

    /* renamed from: k */
    public static tc3 m23879k(Callable callable, Executor executor) {
        ld3 ld3Var = new ld3(callable);
        executor.execute(ld3Var);
        return ld3Var;
    }

    /* renamed from: l */
    public static tc3 m23880l(pb3 pb3Var, Executor executor) {
        ld3 ld3Var = new ld3(pb3Var);
        executor.execute(ld3Var);
        return ld3Var;
    }

    /* renamed from: m */
    public static tc3 m23881m(tc3 tc3Var, y43 y43Var, Executor executor) {
        int i11 = gb3.f20525y;
        y43Var.getClass();
        fb3 fb3Var = new fb3(tc3Var, y43Var);
        tc3Var.zzc(fb3Var, ad3.m20089c(executor, fb3Var));
        return fb3Var;
    }

    /* renamed from: n */
    public static tc3 m23882n(tc3 tc3Var, qb3 qb3Var, Executor executor) {
        int i11 = gb3.f20525y;
        executor.getClass();
        eb3 eb3Var = new eb3(tc3Var, qb3Var);
        tc3Var.zzc(eb3Var, ad3.m20089c(executor, eb3Var));
        return eb3Var;
    }

    /* renamed from: o */
    public static tc3 m23883o(tc3 tc3Var, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (tc3Var.isDone()) {
            return tc3Var;
        }
        return id3.m23230F(tc3Var, j11, timeUnit, scheduledExecutorService);
    }

    /* renamed from: p */
    public static Object m23884p(Future future) {
        if (future.isDone()) {
            return md3.m24550a(future);
        }
        throw new IllegalStateException(z53.m28436b("Future was expected to be done: %s", future));
    }

    /* renamed from: q */
    public static Object m23885q(Future future) {
        try {
            return md3.m24550a(future);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof Error) {
                throw new yb3((Error) cause);
            }
            throw new zzgag(cause);
        }
    }

    /* renamed from: r */
    public static void m23886r(tc3 tc3Var, gc3 gc3Var, Executor executor) {
        gc3Var.getClass();
        tc3Var.zzc(new ic3(tc3Var, gc3Var), executor);
    }
}
