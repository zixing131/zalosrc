package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzdj extends AbstractBinderC4833og implements zzdk {
    public zzdj() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof zzdk) {
            return (zzdk) queryLocalInterface;
        }
        return new zzdi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        zzdn zzdlVar;
        switch (i11) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                zzj(m25461h);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzq = zzq();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzq);
                return true;
            case 5:
                int zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(zzh);
                return true;
            case 6:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 7:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdlVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof zzdn) {
                        zzdlVar = (zzdn) queryLocalInterface;
                    } else {
                        zzdlVar = new zzdl(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzm(zzdlVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 10:
                boolean zzp = zzp();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzp);
                return true;
            case 11:
                zzdn zzi = zzi();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzi);
                return true;
            case 12:
                boolean zzo = zzo();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzo);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
