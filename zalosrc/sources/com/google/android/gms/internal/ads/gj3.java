package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class gj3 {

    /* renamed from: b */
    private static final gj3 f20618b = new gj3();

    /* renamed from: a */
    private final AtomicReference f20619a = new AtomicReference(new xj3(new rj3(), null));

    /* renamed from: a */
    public static gj3 m22452a() {
        return f20618b;
    }

    /* renamed from: b */
    public final synchronized void m22453b(ti3 ti3Var) {
        rj3 rj3Var = new rj3((xj3) this.f20619a.get());
        rj3Var.m26088a(ti3Var);
        this.f20619a.set(new xj3(rj3Var, null));
    }

    /* renamed from: c */
    public final synchronized void m22454c(wi3 wi3Var) {
        rj3 rj3Var = new rj3((xj3) this.f20619a.get());
        rj3Var.m26089b(wi3Var);
        this.f20619a.set(new xj3(rj3Var, null));
    }

    /* renamed from: d */
    public final synchronized void m22455d(jj3 jj3Var) {
        rj3 rj3Var = new rj3((xj3) this.f20619a.get());
        rj3Var.m26090c(jj3Var);
        this.f20619a.set(new xj3(rj3Var, null));
    }

    /* renamed from: e */
    public final synchronized void m22456e(mj3 mj3Var) {
        rj3 rj3Var = new rj3((xj3) this.f20619a.get());
        rj3Var.m26091d(mj3Var);
        this.f20619a.set(new xj3(rj3Var, null));
    }
}
