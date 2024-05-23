package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class jb0 extends AbstractC4759mg implements mb0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public jb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.mb0
    /* renamed from: c */
    public final void mo23581c(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void zzg() {
        zzbl(2, zza());
    }
}
