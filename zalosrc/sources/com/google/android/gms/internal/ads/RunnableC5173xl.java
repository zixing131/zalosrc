package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xl */
/* loaded from: classes2.dex */
final class RunnableC5173xl implements Runnable {

    /* renamed from: p */
    final /* synthetic */ IOException f30524p;

    /* renamed from: q */
    final /* synthetic */ C4359bm f30525q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5173xl(C4359bm c4359bm, IOException iOException) {
        this.f30525q = c4359bm;
        this.f30524p = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4395cm interfaceC4395cm;
        interfaceC4395cm = this.f30525q.f17890t;
        interfaceC4395cm.mo20955b(this.f30524p);
    }
}
