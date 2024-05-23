package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class u90 extends AbstractBinderC4833og implements v90 {
    public u90() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: N */
    public static v90 m26875N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof v90) {
            return (v90) queryLocalInterface;
        }
        return new t90(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return false;
                    }
                    String readString = parcel.readString();
                    AbstractC4871pg.m25456c(parcel);
                    boolean mo26264o = mo26264o(readString);
                    parcel2.writeNoException();
                    AbstractC4871pg.m25457d(parcel2, mo26264o);
                } else {
                    String readString2 = parcel.readString();
                    AbstractC4871pg.m25456c(parcel);
                    pb0 mo26265t = mo26265t(readString2);
                    parcel2.writeNoException();
                    AbstractC4871pg.m25460g(parcel2, mo26265t);
                }
            } else {
                String readString3 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                boolean mo26263c = mo26263c(readString3);
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo26263c);
            }
        } else {
            String readString4 = parcel.readString();
            AbstractC4871pg.m25456c(parcel);
            y90 zzb = zzb(readString4);
            parcel2.writeNoException();
            AbstractC4871pg.m25460g(parcel2, zzb);
        }
        return true;
    }
}
