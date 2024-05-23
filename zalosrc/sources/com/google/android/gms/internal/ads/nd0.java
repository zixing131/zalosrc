package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class nd0 extends AbstractBinderC4833og implements od0 {
    public nd0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static od0 zzF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof od0) {
            return (od0) queryLocalInterface;
        }
        return new md0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        switch (i11) {
            case 1:
                Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzk(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzr();
                parcel2.writeNoException();
                return true;
            case 4:
                zzp();
                parcel2.writeNoException();
                return true;
            case 5:
                zzn();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzq(bundle2);
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, bundle2);
                return true;
            case 7:
                zzs();
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzv();
                parcel2.writeNoException();
                return true;
            case 10:
                zzh();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzE = zzE();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzE);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzj(m19911N);
                parcel2.writeNoException();
                return true;
            case 14:
                zzt();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
