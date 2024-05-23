package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzbh extends AbstractBinderC4833og implements zzbi {
    public zzbh() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            zzb(zzeVar);
        } else {
            zzc();
        }
        parcel2.writeNoException();
        return true;
    }
}
