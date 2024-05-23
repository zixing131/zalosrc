package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* loaded from: classes2.dex */
public final class zzh extends zzbh {
    private final AdLoadCallback zza;
    private final Object zzb;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.zza = adLoadCallback;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null && (obj = this.zzb) != null) {
            adLoadCallback.onAdLoaded(obj);
        }
    }
}
