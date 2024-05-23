package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.d8 */
/* loaded from: classes2.dex */
public final class ExecutorC4418d8 implements Executor {

    /* renamed from: p */
    final /* synthetic */ Handler f19125p;

    public ExecutorC4418d8(C4492f8 c4492f8, Handler handler) {
        this.f19125p = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19125p.post(runnable);
    }
}
