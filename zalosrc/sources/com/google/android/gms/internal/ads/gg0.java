package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class gg0 extends AbstractC4759mg implements ig0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ig0
    /* renamed from: b */
    public final void mo22435b(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.ig0
    /* renamed from: v4 */
    public final void mo22436v4(cg0 cg0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, cg0Var);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.ig0
    public final void zzf() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.ig0
    public final void zzh() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.ig0
    public final void zzi() {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.ig0
    public final void zzj() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.ig0
    public final void zzk() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.ig0
    public final void zzl() {
        zzbl(3, zza());
    }
}
