package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class d50 extends AbstractC4759mg implements f50 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(1, zza);
    }
}
