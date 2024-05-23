package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.f8 */
/* loaded from: classes2.dex */
public final class C4492f8 {

    /* renamed from: a */
    private final Executor f20056a;

    public C4492f8(Handler handler) {
        this.f20056a = new ExecutorC4418d8(this, handler);
    }

    /* renamed from: a */
    public final void m21964a(AbstractC4788n8 abstractC4788n8, zzakm zzakmVar) {
        abstractC4788n8.zzm("post-error");
        C4937r8 m25990a = C4937r8.m25990a(zzakmVar);
        Executor executor = this.f20056a;
        ((ExecutorC4418d8) executor).f19125p.post(new RunnableC4455e8(abstractC4788n8, m25990a, null));
    }

    /* renamed from: b */
    public final void m21965b(AbstractC4788n8 abstractC4788n8, C4937r8 c4937r8, Runnable runnable) {
        abstractC4788n8.zzq();
        abstractC4788n8.zzm("post-response");
        Executor executor = this.f20056a;
        ((ExecutorC4418d8) executor).f19125p.post(new RunnableC4455e8(abstractC4788n8, c4937r8, runnable));
    }
}
