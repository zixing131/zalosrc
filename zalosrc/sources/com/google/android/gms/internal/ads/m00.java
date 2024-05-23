package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class m00 extends AbstractC4759mg implements o00 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m00(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final InterfaceC4271b zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbk = zzbk(2, zza);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m19911N;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzbA(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzbw(String str, InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzbx(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzby(h00 h00Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, h00Var);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzbz(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzc() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzd(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zze(InterfaceC4271b interfaceC4271b, int i11) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeInt(i11);
        zzbl(5, zza);
    }
}
