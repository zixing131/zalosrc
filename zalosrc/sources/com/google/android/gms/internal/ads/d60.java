package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class d60 extends AbstractC4759mg implements f60 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.f60
    /* renamed from: c */
    public final void mo21271c(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.f60
    public final void zzf() {
        zzbl(2, zza());
    }
}
