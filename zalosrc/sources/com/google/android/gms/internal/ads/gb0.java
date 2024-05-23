package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class gb0 extends AbstractC4759mg implements ib0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.ib0
    /* renamed from: c */
    public final void mo20809c(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.ib0
    /* renamed from: g2 */
    public final void mo20810g2(ka0 ka0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, ka0Var);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }
}
