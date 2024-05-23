package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class vc3 implements Executor {

    /* renamed from: p */
    final /* synthetic */ Executor f29275p;

    /* renamed from: q */
    final /* synthetic */ ma3 f29276q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vc3(Executor executor, ma3 ma3Var) {
        this.f29275p = executor;
        this.f29276q = ma3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f29275p.execute(runnable);
        } catch (RejectedExecutionException e11) {
            this.f29276q.mo20864h(e11);
        }
    }
}
