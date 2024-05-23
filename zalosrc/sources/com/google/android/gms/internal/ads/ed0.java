package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class ed0 extends AbstractC4759mg implements gd0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ed0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.gd0
    /* renamed from: Q2 */
    public final void mo21693Q2(InterfaceC4271b interfaceC4271b, String str, String str2) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    /* renamed from: S */
    public final void mo21694S(Intent intent) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, intent);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void zzf() {
        zzbl(3, zza());
    }
}
