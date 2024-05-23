package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4759mg;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.fd0;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gd0;
import com.google.android.gms.internal.ads.h50;
import com.google.android.gms.internal.ads.i50;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.nd0;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.pj0;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.t00;
import com.google.android.gms.internal.ads.tg0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.v90;

/* loaded from: classes2.dex */
public final class zzca extends AbstractC4759mg implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(InterfaceC4271b interfaceC4271b, String str, v90 v90Var, int i11) throws RemoteException {
        zzbo zzbmVar;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(3, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbo) {
                zzbmVar = (zzbo) queryLocalInterface;
            } else {
                zzbmVar = new zzbm(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzbmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(InterfaceC4271b interfaceC4271b, zzq zzqVar, String str, v90 v90Var, int i11) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(13, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbs) {
                zzbqVar = (zzbs) queryLocalInterface;
            } else {
                zzbqVar = new zzbq(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(InterfaceC4271b interfaceC4271b, zzq zzqVar, String str, v90 v90Var, int i11) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbs) {
                zzbqVar = (zzbs) queryLocalInterface;
            } else {
                zzbqVar = new zzbq(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(InterfaceC4271b interfaceC4271b, zzq zzqVar, String str, v90 v90Var, int i11) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbs) {
                zzbqVar = (zzbs) queryLocalInterface;
            } else {
                zzbqVar = new zzbq(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(InterfaceC4271b interfaceC4271b, zzq zzqVar, String str, int i11) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25458e(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(10, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbs) {
                zzbqVar = (zzbs) queryLocalInterface;
            } else {
                zzbqVar = new zzbq(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(InterfaceC4271b interfaceC4271b, int i11) throws RemoteException {
        zzcm zzckVar;
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(9, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzckVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcm) {
                zzckVar = (zzcm) queryLocalInterface;
            } else {
                zzckVar = new zzck(readStrongBinder);
            }
        }
        zzbk.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final o00 zzh(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, interfaceC4271b2);
        Parcel zzbk = zzbk(5, zza);
        o00 zzbB = n00.zzbB(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzbB;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final u00 zzi(InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, interfaceC4271b2);
        AbstractC4871pg.m25460g(zza, interfaceC4271b3);
        Parcel zzbk = zzbk(11, zza);
        u00 zze = t00.zze(zzbk.readStrongBinder());
        zzbk.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final i50 zzj(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11, f50 f50Var) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        AbstractC4871pg.m25460g(zza, f50Var);
        Parcel zzbk = zzbk(16, zza);
        i50 m22708N = h50.m22708N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m22708N;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final gd0 zzk(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(15, zza);
        gd0 m21986N = fd0.m21986N(zzbk.readStrongBinder());
        zzbk.recycle();
        return m21986N;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final od0 zzl(InterfaceC4271b interfaceC4271b) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        Parcel zzbk = zzbk(8, zza);
        od0 zzF = nd0.zzF(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final fg0 zzm(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final ug0 zzn(InterfaceC4271b interfaceC4271b, String str, v90 v90Var, int i11) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        zza.writeString(str);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(12, zza);
        ug0 zzq = tg0.zzq(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final qj0 zzo(InterfaceC4271b interfaceC4271b, v90 v90Var, int i11) throws RemoteException {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, interfaceC4271b);
        AbstractC4871pg.m25460g(zza, v90Var);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(14, zza);
        qj0 zzb = pj0.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }
}
