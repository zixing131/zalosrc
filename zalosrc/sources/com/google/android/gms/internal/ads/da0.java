package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class da0 extends AbstractBinderC4833og implements ea0 {
    public da0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* renamed from: N */
    public static ea0 m21316N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        if (queryLocalInterface instanceof ea0) {
            return (ea0) queryLocalInterface;
        }
        return new ca0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            AbstractC4871pg.m25457d(parcel2, zzf);
        } else {
            InterfaceC4271b zze = zze();
            parcel2.writeNoException();
            AbstractC4871pg.m25460g(parcel2, zze);
        }
        return true;
    }
}
