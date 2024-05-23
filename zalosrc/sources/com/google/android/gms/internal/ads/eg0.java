package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbv;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public abstract class eg0 extends AbstractBinderC4833og implements fg0 {
    public eg0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x000e. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                ig0 ig0Var = null;
                dg0 dg0Var = null;
                if (i11 != 3) {
                    if (i11 != 34) {
                        switch (i11) {
                            case 5:
                                boolean zzs = zzs();
                                parcel2.writeNoException();
                                AbstractC4871pg.m25457d(parcel2, zzs);
                                break;
                            case 6:
                                zzh();
                                parcel2.writeNoException();
                                break;
                            case 7:
                                zzj();
                                parcel2.writeNoException();
                                break;
                            case 8:
                                zze();
                                parcel2.writeNoException();
                                break;
                            case 9:
                                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                AbstractC4871pg.m25456c(parcel);
                                zzi(m19911N);
                                parcel2.writeNoException();
                                break;
                            case 10:
                                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                AbstractC4871pg.m25456c(parcel);
                                mo22014e4(m19911N2);
                                parcel2.writeNoException();
                                break;
                            case 11:
                                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                AbstractC4871pg.m25456c(parcel);
                                mo22011F(m19911N3);
                                parcel2.writeNoException();
                                break;
                            case 12:
                                String zzd = zzd();
                                parcel2.writeNoException();
                                parcel2.writeString(zzd);
                                break;
                            case 13:
                                String readString = parcel.readString();
                                AbstractC4871pg.m25456c(parcel);
                                mo22018l(readString);
                                parcel2.writeNoException();
                                break;
                            case 14:
                                com.google.android.gms.ads.internal.client.zzbw zzb = zzbv.zzb(parcel.readStrongBinder());
                                AbstractC4871pg.m25456c(parcel);
                                mo22012H2(zzb);
                                parcel2.writeNoException();
                                break;
                            case 15:
                                Bundle zzb2 = zzb();
                                parcel2.writeNoException();
                                AbstractC4871pg.m25459f(parcel2, zzb2);
                                break;
                            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                if (readStrongBinder != null) {
                                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                                    if (queryLocalInterface instanceof dg0) {
                                        dg0Var = (dg0) queryLocalInterface;
                                    } else {
                                        dg0Var = new dg0(readStrongBinder);
                                    }
                                }
                                AbstractC4871pg.m25456c(parcel);
                                mo22020t4(dg0Var);
                                parcel2.writeNoException();
                                break;
                            case 17:
                                parcel.readString();
                                AbstractC4871pg.m25456c(parcel);
                                parcel2.writeNoException();
                                break;
                            case 18:
                                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                                AbstractC4871pg.m25456c(parcel);
                                mo22019r(m19911N4);
                                parcel2.writeNoException();
                                break;
                            case 19:
                                String readString2 = parcel.readString();
                                AbstractC4871pg.m25456c(parcel);
                                mo22016h1(readString2);
                                parcel2.writeNoException();
                                break;
                            case 20:
                                boolean zzt = zzt();
                                parcel2.writeNoException();
                                AbstractC4871pg.m25457d(parcel2, zzt);
                                break;
                            case 21:
                                zzdh zzc = zzc();
                                parcel2.writeNoException();
                                AbstractC4871pg.m25460g(parcel2, zzc);
                                break;
                            default:
                                return false;
                        }
                    } else {
                        boolean m25461h = AbstractC4871pg.m25461h(parcel);
                        AbstractC4871pg.m25456c(parcel);
                        mo22015f3(m25461h);
                        parcel2.writeNoException();
                    }
                } else {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                        if (queryLocalInterface2 instanceof ig0) {
                            ig0Var = (ig0) queryLocalInterface2;
                        } else {
                            ig0Var = new gg0(readStrongBinder2);
                        }
                    }
                    AbstractC4871pg.m25456c(parcel);
                    mo22013H4(ig0Var);
                    parcel2.writeNoException();
                }
            } else {
                zzq();
                parcel2.writeNoException();
            }
        } else {
            zzcbz zzcbzVar = (zzcbz) AbstractC4871pg.m25454a(parcel, zzcbz.CREATOR);
            AbstractC4871pg.m25456c(parcel);
            mo22017h2(zzcbzVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
