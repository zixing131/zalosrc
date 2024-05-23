package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: classes2.dex */
public final class RunnableC4114m0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ int f16397p;

    /* renamed from: q */
    final /* synthetic */ C4123p0 f16398q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4114m0(C4123p0 c4123p0, int i11) {
        this.f16398q = c4123p0;
        this.f16397p = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16398q.m19515h(this.f16397p);
    }
}
