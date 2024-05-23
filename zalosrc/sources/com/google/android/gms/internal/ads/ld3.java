package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
public final class ld3 extends zb3 implements RunnableFuture {

    /* renamed from: w */
    private volatile sc3 f23863w;

    public ld3(pb3 pb3Var) {
        this.f23863w = new jd3(this, pb3Var);
    }

    /* renamed from: E */
    public static ld3 m24230E(Runnable runnable, Object obj) {
        return new ld3(Executors.callable(runnable, obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: e */
    public final String mo22403e() {
        sc3 sc3Var = this.f23863w;
        if (sc3Var != null) {
            return "task=[" + sc3Var + "]";
        }
        return super.mo22403e();
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: f */
    protected final void mo22404f() {
        sc3 sc3Var;
        if (m24528x() && (sc3Var = this.f23863w) != null) {
            sc3Var.m26271g();
        }
        this.f23863w = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        sc3 sc3Var = this.f23863w;
        if (sc3Var != null) {
            sc3Var.run();
        }
        this.f23863w = null;
    }

    public ld3(Callable callable) {
        this.f23863w = new kd3(this, callable);
    }
}
