package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class pj0 extends AbstractBinderC4833og implements qj0 {
    public pj0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static qj0 zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof qj0) {
            return (qj0) queryLocalInterface;
        }
        return new oj0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        nj0 nj0Var = null;
        switch (i11) {
            case 1:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzcfk zzcfkVar = (zzcfk) AbstractC4871pg.m25454a(parcel, zzcfk.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof nj0) {
                        nj0Var = (nj0) queryLocalInterface;
                    } else {
                        nj0Var = new lj0(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zze(m19911N, zzcfkVar, nj0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzj(m19911N2);
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 4:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                de0 m20866N = ce0.m20866N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzl(createTypedArrayList, m19911N3, m20866N);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                de0 m20866N2 = ce0.m20866N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzk(createTypedArrayList2, m19911N4, m20866N2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcaa zzcaaVar = (zzcaa) AbstractC4871pg.m25454a(parcel, zzcaa.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzf(zzcaaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzi(m19911N5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC4271b m19911N6 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                de0 m20866N3 = ce0.m20866N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzh(createTypedArrayList3, m19911N6, m20866N3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC4271b m19911N7 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                de0 m20866N4 = ce0.m20866N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzg(createTypedArrayList4, m19911N7, m20866N4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
