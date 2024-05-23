package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class fd0 extends AbstractBinderC4833og implements gd0 {
    public fd0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* renamed from: N */
    public static gd0 m21986N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof gd0) {
            return (gd0) queryLocalInterface;
        }
        return new ed0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return false;
                }
                zzf();
            } else {
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo21693Q2(m19911N, readString, readString2);
            }
        } else {
            Intent intent = (Intent) AbstractC4871pg.m25454a(parcel, Intent.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo21694S(intent);
        }
        parcel2.writeNoException();
        return true;
    }
}
