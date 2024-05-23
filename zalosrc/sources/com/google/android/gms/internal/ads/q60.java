package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class q60 extends AbstractC4759mg implements s60 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void zze(int i11) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void zzf() {
        zzbl(1, zza());
    }
}
