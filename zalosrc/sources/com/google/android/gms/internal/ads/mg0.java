package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class mg0 extends AbstractBinderC4833og implements ng0 {
    public mg0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: N */
    public static ng0 m24562N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof ng0) {
            return (ng0) queryLocalInterface;
        }
        return new lg0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzl(m19911N);
                break;
            case 2:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                mo24910H(m19911N2, readInt);
                break;
            case 3:
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzi(m19911N3);
                break;
            case 4:
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzj(m19911N4);
                break;
            case 5:
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo24288j0(m19911N5);
                break;
            case 6:
                InterfaceC4271b m19911N6 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo24285F(m19911N6);
                break;
            case 7:
                InterfaceC4271b m19911N7 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzcce zzcceVar = (zzcce) AbstractC4871pg.m25454a(parcel, zzcce.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo24287F1(m19911N7, zzcceVar);
                break;
            case 8:
                InterfaceC4271b m19911N8 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zze(m19911N8);
                break;
            case 9:
                InterfaceC4271b m19911N9 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzg(m19911N9, readInt2);
                break;
            case 10:
                InterfaceC4271b m19911N10 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo24911l3(m19911N10);
                break;
            case 11:
                InterfaceC4271b m19911N11 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo24286F0(m19911N11);
                break;
            case 12:
                AbstractC4871pg.m25456c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
