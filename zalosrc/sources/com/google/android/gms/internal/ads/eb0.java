package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public abstract class eb0 extends AbstractBinderC4833og implements fb0 {
    public eb0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return false;
                }
                zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzf(zzeVar);
            } else {
                String readString = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo21337c(readString);
            }
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
