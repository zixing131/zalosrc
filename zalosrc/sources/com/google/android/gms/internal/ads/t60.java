package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class t60 extends AbstractC4759mg implements v60 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.v60
    /* renamed from: X */
    public final void mo26573X(p60 p60Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, p60Var);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void zze(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }
}
