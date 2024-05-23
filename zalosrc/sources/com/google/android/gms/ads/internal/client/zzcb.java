package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.f50;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gd0;
import com.google.android.gms.internal.ads.i50;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.qj0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.u90;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.v90;
import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public abstract class zzcb extends AbstractBinderC4833og implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        switch (i11) {
            case 1:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                v90 m26875N = u90.m26875N(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzbs zzd = zzd(m19911N, zzqVar, readString, m26875N, readInt);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzd);
                return true;
            case 2:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                v90 m26875N2 = u90.m26875N(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzbs zze = zze(m19911N2, zzqVar2, readString2, m26875N2, readInt2);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zze);
                return true;
            case 3:
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                v90 m26875N3 = u90.m26875N(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzbo zzb = zzb(m19911N3, readString3, m26875N3, readInt3);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzb);
                return true;
            case 4:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 5:
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                o00 zzh = zzh(m19911N4, m19911N5);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzh);
                return true;
            case 6:
                InterfaceC4271b m19911N6 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                v90 m26875N4 = u90.m26875N(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                fg0 zzm = zzm(m19911N6, m26875N4, readInt4);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzm);
                return true;
            case 7:
                InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 8:
                InterfaceC4271b m19911N7 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                od0 zzl = zzl(m19911N7);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzl);
                return true;
            case 9:
                InterfaceC4271b m19911N8 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzcm zzg = zzg(m19911N8, readInt5);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzg);
                return true;
            case 10:
                InterfaceC4271b m19911N9 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzbs zzf = zzf(m19911N9, zzqVar3, readString4, readInt6);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzf);
                return true;
            case 11:
                InterfaceC4271b m19911N10 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N11 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N12 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                u00 zzi = zzi(m19911N10, m19911N11, m19911N12);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzi);
                return true;
            case 12:
                InterfaceC4271b m19911N13 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                v90 m26875N5 = u90.m26875N(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                ug0 zzn = zzn(m19911N13, readString5, m26875N5, readInt7);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzn);
                return true;
            case 13:
                InterfaceC4271b m19911N14 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                v90 m26875N6 = u90.m26875N(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                zzbs zzc = zzc(m19911N14, zzqVar4, readString6, m26875N6, readInt8);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzc);
                return true;
            case 14:
                InterfaceC4271b m19911N15 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                v90 m26875N7 = u90.m26875N(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                qj0 zzo = zzo(m19911N15, m26875N7, readInt9);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzo);
                return true;
            case 15:
                InterfaceC4271b m19911N16 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                v90 m26875N8 = u90.m26875N(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
                gd0 zzk = zzk(m19911N16, m26875N8, readInt10);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzk);
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                InterfaceC4271b m19911N17 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                v90 m26875N9 = u90.m26875N(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                f50 m21615N = e50.m21615N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                i50 zzj = zzj(m19911N17, m26875N9, readInt11, m21615N);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzj);
                return true;
            default:
                return false;
        }
    }
}
