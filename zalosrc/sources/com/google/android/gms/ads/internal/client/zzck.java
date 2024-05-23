package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.zzbrq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzck extends AbstractC4759mg implements zzcm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        ArrayList createTypedArrayList = zzbk.createTypedArrayList(zzbrq.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() throws RemoteException {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, InterfaceC4271b interfaceC4271b) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzcyVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(InterfaceC4271b interfaceC4271b, String str) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(v90 v90Var) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, v90Var);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z11) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25457d(zza, z11);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f11) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f11);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(i60 i60Var) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, i60Var);
        zzbl(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzezVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean m25461h = AbstractC4871pg.m25461h(zzbk);
        zzbk.recycle();
        return m25461h;
    }
}
