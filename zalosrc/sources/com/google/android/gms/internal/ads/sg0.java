package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class sg0 extends AbstractC4759mg implements ug0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public sg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final Bundle zzb() {
        Parcel zzbk = zzbk(9, zza());
        Bundle bundle = (Bundle) AbstractC4871pg.m25454a(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final zzdh zzc() {
        Parcel zzbk = zzbk(12, zza());
        zzdh zzb = zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final rg0 zzd() {
        rg0 pg0Var;
        Parcel zzbk = zzbk(11, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            pg0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof rg0) {
                pg0Var = (rg0) queryLocalInterface;
            } else {
                pg0Var = new pg0(readStrongBinder);
            }
        }
        zzbk.recycle();
        return pg0Var;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzf(zzl zzlVar, bh0 bh0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, bh0Var);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzg(zzl zzlVar, bh0 bh0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzlVar);
        AbstractC4871pg.m25460g(zza, bh0Var);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzh(boolean z11) {
        Parcel zza = zza();
        AbstractC4871pg.m25457d(zza, z11);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzi(zzdb zzdbVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzdbVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzj(zzde zzdeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzdeVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzk(xg0 xg0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, xg0Var);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzl(zzccz zzcczVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzcczVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final void zzm(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(5, zza);
    }
}
