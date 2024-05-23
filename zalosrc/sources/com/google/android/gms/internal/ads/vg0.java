package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class vg0 extends AbstractC4759mg implements xg0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public vg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.xg0
    /* renamed from: R1 */
    public final void mo24575R1(rg0 rg0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, rg0Var);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.xg0
    /* renamed from: b2 */
    public final void mo24576b2(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.xg0
    /* renamed from: f */
    public final void mo24577f(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zze() {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zzf() {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zzg() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public final void zzj() {
        zzbl(1, zza());
    }
}
