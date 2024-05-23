package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class vb3 extends sc3 {

    /* renamed from: r */
    private final Executor f29254r;

    /* renamed from: s */
    final /* synthetic */ wb3 f29255s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vb3(wb3 wb3Var, Executor executor) {
        this.f29255s = wb3Var;
        executor.getClass();
        this.f29254r = executor;
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: d */
    final void mo23604d(Throwable th2) {
        wb3.m27587V(this.f29255s, null);
        if (th2 instanceof ExecutionException) {
            this.f29255s.mo20864h(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.f29255s.cancel(false);
        } else {
            this.f29255s.mo20864h(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: e */
    final void mo23605e(Object obj) {
        wb3.m27587V(this.f29255s, null);
        mo26912h(obj);
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: f */
    final boolean mo23606f() {
        return this.f29255s.isDone();
    }

    /* renamed from: h */
    abstract void mo26912h(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m27200i() {
        try {
            this.f29254r.execute(this);
        } catch (RejectedExecutionException e11) {
            this.f29255s.mo20864h(e11);
        }
    }
}
