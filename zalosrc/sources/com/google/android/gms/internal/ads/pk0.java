package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class pk0 extends Thread {

    /* renamed from: p */
    final /* synthetic */ String f26240p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pk0(rk0 rk0Var, String str) {
        this.f26240p = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new cl0(null).zza(this.f26240p);
    }
}
