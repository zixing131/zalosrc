package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzbe extends AbstractBinderC4833og implements zzbf {
    public zzbe() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        switch (i11) {
            case 1:
                zzd();
                break;
            case 2:
                int readInt = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zze(readInt);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzf(zzeVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
