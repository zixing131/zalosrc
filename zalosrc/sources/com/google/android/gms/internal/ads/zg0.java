package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class zg0 extends AbstractC4759mg implements bh0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zze(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.bh0
    public final void zzg() {
        zzbl(1, zza());
    }
}
