package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class s00 extends AbstractC4759mg implements u00 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void zzb(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void zzc(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.u00
    public final void zzd() {
        zzbl(2, zza());
    }
}
