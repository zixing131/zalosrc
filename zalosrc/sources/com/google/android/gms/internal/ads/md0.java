package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class md0 extends AbstractC4759mg implements od0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public md0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final boolean zzE() {
        Parcel zzbk = zzbk(11, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzg(int i11, int i12, Intent intent) {
        Parcel zza = zza();
        zza.writeInt(i11);
        zza.writeInt(i12);
        AbstractC4871pg.m25458e(zza, intent);
        zzbl(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzh() {
        zzbl(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzj(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzk(Bundle bundle) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzl() {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzn() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzo() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzp() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzq(Bundle bundle) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, bundle);
        Parcel zzbk = zzbk(6, zza);
        if (zzbk.readInt() != 0) {
            bundle.readFromParcel(zzbk);
        }
        zzbk.recycle();
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzr() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzs() {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzt() {
        zzbl(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzv() {
        zzbl(9, zza());
    }
}
