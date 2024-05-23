package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.lq */
/* loaded from: classes2.dex */
final class RunnableC4731lq implements Runnable {

    /* renamed from: p */
    final /* synthetic */ View f24009p;

    /* renamed from: q */
    final /* synthetic */ C4881pq f24010q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4731lq(C4881pq c4881pq, View view) {
        this.f24010q = c4881pq;
        this.f24009p = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24010q.m25515c(this.f24009p);
    }
}
