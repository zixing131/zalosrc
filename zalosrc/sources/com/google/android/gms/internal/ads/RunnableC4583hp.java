package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hp */
/* loaded from: classes2.dex */
public final class RunnableC4583hp implements Runnable {

    /* renamed from: p */
    final /* synthetic */ Surface f21865p;

    /* renamed from: q */
    final /* synthetic */ C4656jp f21866q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4583hp(C4656jp c4656jp, Surface surface) {
        this.f21866q = c4656jp;
        this.f21865p = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4693kp interfaceC4693kp;
        interfaceC4693kp = this.f21866q.f22913b;
        interfaceC4693kp.mo23989C(this.f21865p);
    }
}
