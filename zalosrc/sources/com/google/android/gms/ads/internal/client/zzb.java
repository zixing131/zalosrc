package com.google.android.gms.ads.internal.client;

/* loaded from: classes2.dex */
public final class zzb extends zzbb {
    private final zza zza;

    public zzb(zza zzaVar) {
        this.zza = zzaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbc
    public final void zzb() {
        this.zza.onAdClicked();
    }
}
