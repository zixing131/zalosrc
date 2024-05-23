package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzbk extends AbstractBinderC4833og implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return false;
                        }
                        zzl zzlVar = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                        int readInt = parcel.readInt();
                        AbstractC4871pg.m25456c(parcel);
                        zzh(zzlVar, readInt);
                        parcel2.writeNoException();
                    } else {
                        String zzf = zzf();
                        parcel2.writeNoException();
                        parcel2.writeString(zzf);
                    }
                } else {
                    boolean zzi = zzi();
                    parcel2.writeNoException();
                    AbstractC4871pg.m25457d(parcel2, zzi);
                }
            } else {
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
            }
        } else {
            zzl zzlVar2 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            zzg(zzlVar2);
            parcel2.writeNoException();
        }
        return true;
    }
}
