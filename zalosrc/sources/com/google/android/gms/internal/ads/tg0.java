package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class tg0 extends AbstractBinderC4833og implements ug0 {
    public tg0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static ug0 zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof ug0) {
            return (ug0) queryLocalInterface;
        }
        return new sg0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        bh0 bh0Var = null;
        bh0 bh0Var2 = null;
        ch0 ch0Var = null;
        xg0 xg0Var = null;
        switch (i11) {
            case 1:
                zzl zzlVar = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof bh0) {
                        bh0Var = (bh0) queryLocalInterface;
                    } else {
                        bh0Var = new zg0(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzf(zzlVar, bh0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof xg0) {
                        xg0Var = (xg0) queryLocalInterface2;
                    } else {
                        xg0Var = new vg0(readStrongBinder2);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzk(xg0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzo);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzm(m19911N);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof ch0) {
                        ch0Var = (ch0) queryLocalInterface3;
                    } else {
                        ch0Var = new ch0(readStrongBinder3);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzp(ch0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                zzccz zzcczVar = (zzccz) AbstractC4871pg.m25454a(parcel, zzccz.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzl(zzcczVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzdb zzb = zzda.zzb(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzb2);
                return true;
            case 10:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                zzn(m19911N2, m25461h);
                parcel2.writeNoException();
                return true;
            case 11:
                rg0 zzd = zzd();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzd);
                return true;
            case 12:
                zzdh zzc = zzc();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzc);
                return true;
            case 13:
                zzde zzb3 = zzdd.zzb(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof bh0) {
                        bh0Var2 = (bh0) queryLocalInterface4;
                    } else {
                        bh0Var2 = new zg0(readStrongBinder4);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzg(zzlVar2, bh0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean m25461h2 = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                zzh(m25461h2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
