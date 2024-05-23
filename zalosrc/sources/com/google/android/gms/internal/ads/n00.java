package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class n00 extends AbstractBinderC4833og implements o00 {
    public n00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static o00 zzbB(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof o00) {
            return (o00) queryLocalInterface;
        }
        return new m00(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        h00 e00Var;
        switch (i11) {
            case 1:
                String readString = parcel.readString();
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzbw(readString, m19911N);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                InterfaceC4271b zzb = zzb(readString2);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzb);
                return true;
            case 3:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzbA(m19911N2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzbx(m19911N3);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzd(m19911N4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    e00Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof h00) {
                        e00Var = (h00) queryLocalInterface;
                    } else {
                        e00Var = new e00(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzby(e00Var);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzbz(m19911N5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
