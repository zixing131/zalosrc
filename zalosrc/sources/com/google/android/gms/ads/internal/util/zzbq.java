package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;

/* loaded from: classes2.dex */
public abstract class zzbq extends AbstractBinderC4833og implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            AbstractC4871pg.m25456c(parcel);
            zze(m19911N);
            parcel2.writeNoException();
        } else {
            InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            boolean zzf = zzf(m19911N2, readString, readString2);
            parcel2.writeNoException();
            AbstractC4871pg.m25457d(parcel2, zzf);
        }
        return true;
    }
}
