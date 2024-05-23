package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ul0 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ wl0 f28972a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ul0(wl0 wl0Var) {
        this.f28972a = wl0Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f28972a.f29986b;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zzb(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f28972a.f29986b;
        atomicInteger.set(1);
    }
}
