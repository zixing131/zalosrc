package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;

/* loaded from: classes2.dex */
public abstract class zzct extends AbstractBinderC4833og implements zzcu {
    public zzct() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzcu) {
            return (zzcu) queryLocalInterface;
        }
        return new zzcs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        }
        return true;
    }
}
