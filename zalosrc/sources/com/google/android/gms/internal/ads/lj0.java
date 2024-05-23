package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class lj0 extends AbstractC4759mg implements nj0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public lj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.nj0
    /* renamed from: x0 */
    public final void mo21700x0(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        AbstractC4871pg.m25458e(zza, bundle);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.nj0
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(2, zza);
    }
}
