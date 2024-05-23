package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class bb0 extends AbstractBinderC4833og implements cb0 {
    public bb0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return false;
                    }
                    ea0 m21316N = da0.m21316N(parcel.readStrongBinder());
                    AbstractC4871pg.m25456c(parcel);
                    mo20047p3(m21316N);
                } else {
                    zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                    AbstractC4871pg.m25456c(parcel);
                    zzf(zzeVar);
                }
            } else {
                String readString = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo20046c(readString);
            }
        } else {
            InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            AbstractC4871pg.m25456c(parcel);
            mo20045E3(m19911N);
        }
        parcel2.writeNoException();
        return true;
    }
}
