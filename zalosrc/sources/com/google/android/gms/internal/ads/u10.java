package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class u10 extends AbstractC4759mg implements w10 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.w10
    /* renamed from: N0 */
    public final void mo26560N0(zzbs zzbsVar, InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzbsVar);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(1, zza);
    }
}
