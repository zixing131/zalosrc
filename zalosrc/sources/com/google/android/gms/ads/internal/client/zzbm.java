package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.s10;
import com.google.android.gms.internal.ads.v60;
import com.google.android.gms.internal.ads.w10;
import com.google.android.gms.internal.ads.z10;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbsc;

/* loaded from: classes2.dex */
public final class zzbm extends AbstractC4759mg implements zzbo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() throws RemoteException {
        zzbl zzbjVar;
        Parcel zzbk = zzbk(1, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof zzbl) {
                zzbjVar = (zzbl) queryLocalInterface;
            } else {
                zzbjVar = new zzbj(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(j10 j10Var) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(m10 m10Var) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, s10 s10Var, p10 p10Var) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, s10Var);
        AbstractC4871pg.m25460g(zza, p10Var);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(v60 v60Var) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(w10 w10Var, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, w10Var);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(z10 z10Var) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, z10Var);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbfVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, zzbfVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, adManagerAdViewOptions);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbsc zzbscVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbls zzblsVar) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25458e(zza, zzblsVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcdVar) throws RemoteException {
        throw null;
    }
}
