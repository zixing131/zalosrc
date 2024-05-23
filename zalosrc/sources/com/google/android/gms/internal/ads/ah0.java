package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public abstract class ah0 extends AbstractBinderC4833og implements bh0 {
    public ah0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return false;
                }
                zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzf(zzeVar);
            } else {
                int readInt = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zze(readInt);
            }
        } else {
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
