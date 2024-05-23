package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fp */
/* loaded from: classes2.dex */
public final class RunnableC4509fp implements Runnable {

    /* renamed from: p */
    final /* synthetic */ int f20211p;

    /* renamed from: q */
    final /* synthetic */ long f20212q;

    /* renamed from: r */
    final /* synthetic */ C4656jp f20213r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4509fp(C4656jp c4656jp, int i11, long j11) {
        this.f20213r = c4656jp;
        this.f20211p = i11;
        this.f20212q = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4693kp interfaceC4693kp;
        interfaceC4693kp = this.f20213r.f22913b;
        interfaceC4693kp.mo23991z(this.f20211p, this.f20212q);
    }
}
