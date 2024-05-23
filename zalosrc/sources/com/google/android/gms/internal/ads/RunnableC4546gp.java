package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gp */
/* loaded from: classes2.dex */
public final class RunnableC4546gp implements Runnable {

    /* renamed from: p */
    final /* synthetic */ int f20780p;

    /* renamed from: q */
    final /* synthetic */ int f20781q;

    /* renamed from: r */
    final /* synthetic */ int f20782r;

    /* renamed from: s */
    final /* synthetic */ float f20783s;

    /* renamed from: t */
    final /* synthetic */ C4656jp f20784t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4546gp(C4656jp c4656jp, int i11, int i12, int i13, float f11) {
        this.f20784t = c4656jp;
        this.f20780p = i11;
        this.f20781q = i12;
        this.f20782r = i13;
        this.f20783s = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4693kp interfaceC4693kp;
        interfaceC4693kp = this.f20784t.f22913b;
        interfaceC4693kp.mo23990u(this.f20780p, this.f20781q, this.f20782r, this.f20783s);
    }
}
