package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.List;

/* loaded from: classes2.dex */
public final class oj0 extends AbstractC4759mg implements qj0 {
    public oj0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zze(InterfaceC4271b interfaceC4271b, zzcfk zzcfkVar, nj0 nj0Var) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzcfkVar);
        AbstractC4871pg.m25460g(zza, nj0Var);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzf(zzcaa zzcaaVar) {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzcaaVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzg(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, de0Var);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzh(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, de0Var);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzi(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzj(InterfaceC4271b interfaceC4271b) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzk(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, de0Var);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzl(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, de0Var);
        zzbl(5, zza);
    }
}
