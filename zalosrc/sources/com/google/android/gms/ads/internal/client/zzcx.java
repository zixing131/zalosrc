package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzcx extends AbstractBinderC4833og implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            zze(zzeVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
