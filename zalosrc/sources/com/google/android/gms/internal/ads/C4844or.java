package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.or */
/* loaded from: classes2.dex */
public final class C4844or extends AbstractC4759mg implements InterfaceC4919qr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4844or(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzb() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzc() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzd(zze zzeVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zze() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4919qr
    public final void zzf() {
        zzbl(1, zza());
    }
}
