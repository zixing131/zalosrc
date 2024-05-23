package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class tm0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ boolean f28428p;

    /* renamed from: q */
    final /* synthetic */ zzcim f28429q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tm0(zzcim zzcimVar, boolean z11) {
        this.f28429q = zzcimVar;
        this.f28428p = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28429q.m28754m("windowVisibilityChanged", "isVisible", String.valueOf(this.f28428p));
    }
}
