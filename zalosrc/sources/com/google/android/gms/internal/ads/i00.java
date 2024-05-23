package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class i00 extends AbstractC4759mg implements k00 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final double zzb() {
        Parcel zzbk = zzbk(3, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final int zzc() {
        Parcel zzbk = zzbk(5, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final int zzd() {
        Parcel zzbk = zzbk(4, zza());
        int readInt = zzbk.readInt();
        zzbk.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final Uri zze() {
        Parcel zzbk = zzbk(2, zza());
        Uri uri = (Uri) AbstractC4871pg.m25454a(zzbk, Uri.CREATOR);
        zzbk.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.k00
    public final InterfaceC4271b zzf() {
        Parcel zzbk = zzbk(1, zza());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }
}
