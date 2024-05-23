package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public abstract class wg0 extends AbstractBinderC4833og implements xg0 {
    public wg0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        rg0 pg0Var;
        switch (i11) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    pg0Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface instanceof rg0) {
                        pg0Var = (rg0) queryLocalInterface;
                    } else {
                        pg0Var = new pg0(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo24575R1(pg0Var);
                break;
            case 4:
                int readInt = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                mo24577f(readInt);
                break;
            case 5:
                zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo24576b2(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
