package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class qb0 extends AbstractC4759mg implements sb0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public qb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.sb0
    /* renamed from: W */
    public final void mo24500W(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.sb0
    /* renamed from: c */
    public final void mo24501c(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.sb0
    /* renamed from: j */
    public final void mo24502j(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }
}
