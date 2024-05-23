package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.b13;
import com.google.android.gms.internal.ads.xz2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzh implements b13 {
    final /* synthetic */ zzi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.b13
    public final void zza(int i11, long j11) {
        xz2 xz2Var;
        xz2Var = this.zza.zzi;
        xz2Var.m28095d(i11, System.currentTimeMillis() - j11);
    }

    @Override // com.google.android.gms.internal.ads.b13
    public final void zzb(int i11, long j11, String str) {
        xz2 xz2Var;
        xz2Var = this.zza.zzi;
        xz2Var.m28096e(i11, System.currentTimeMillis() - j11, str);
    }
}
