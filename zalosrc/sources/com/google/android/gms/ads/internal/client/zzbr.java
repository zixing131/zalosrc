package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractBinderC4334ay;
import com.google.android.gms.internal.ads.AbstractBinderC4732lr;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.InterfaceC4407cy;
import com.google.android.gms.internal.ads.InterfaceC4770mr;
import com.google.android.gms.internal.ads.ae0;
import com.google.android.gms.internal.ads.hg0;
import com.google.android.gms.internal.ads.ig0;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.xd0;
import com.google.android.gms.internal.ads.zd0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* loaded from: classes2.dex */
public abstract class zzbr extends AbstractBinderC4833og implements zzbs {
    public zzbr() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbs zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzbs) {
            return (zzbs) queryLocalInterface;
        }
        return new zzbq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        zzbf zzbfVar = null;
        zzcg zzcgVar = null;
        zzbi zzbiVar = null;
        zzde zzdeVar = null;
        zzbw zzbwVar = null;
        zzcd zzcdVar = null;
        zzbc zzbcVar = null;
        zzbz zzbzVar = null;
        switch (i11) {
            case 1:
                InterfaceC4271b zzn = zzn();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzZ);
                return true;
            case 4:
                zzl zzlVar = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                boolean zzaa = zzaa(zzlVar);
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzaa);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzbf) {
                        zzbfVar = (zzbf) queryLocalInterface;
                    } else {
                        zzbfVar = new zzbd(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzD(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzbz) {
                        zzbzVar = (zzbz) queryLocalInterface2;
                    } else {
                        zzbzVar = new zzbx(readStrongBinder2);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzG(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) AbstractC4871pg.m25454a(parcel, zzq.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                xd0 m27600N = wd0.m27600N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzM(m27600N);
                parcel2.writeNoException();
                return true;
            case 15:
                ae0 m28484N = zd0.m28484N(parcel.readStrongBinder());
                String readString = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzQ(m28484N, readString);
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                InterfaceC4407cy m20346N = AbstractBinderC4334ay.m20346N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzO(m20346N);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzbc) {
                        zzbcVar = (zzbc) queryLocalInterface3;
                    } else {
                        zzbcVar = new zzba(readStrongBinder3);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzC(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzcd) {
                        zzcdVar = (zzcd) queryLocalInterface4;
                    } else {
                        zzcdVar = new zzcd(readStrongBinder4);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzab(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                zzN(m25461h);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzY = zzY();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzY);
                return true;
            case 24:
                ig0 m22820N = hg0.m22820N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzS(m22820N);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdk zzl = zzl();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzl);
                return true;
            case 29:
                zzff zzffVar = (zzff) AbstractC4871pg.m25454a(parcel, zzff.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzU(zzffVar);
                parcel2.writeNoException();
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                zzdo zzdoVar = (zzdo) AbstractC4871pg.m25454a(parcel, zzdo.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzK(zzdoVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                zzbz zzj = zzj();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzj);
                return true;
            case 33:
                zzbf zzi = zzi();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzi);
                return true;
            case 34:
                boolean m25461h2 = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                zzL(m25461h2);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzbw) {
                        zzbwVar = (zzbw) queryLocalInterface5;
                    } else {
                        zzbwVar = new zzbu(readStrongBinder5);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzE(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) AbstractC4871pg.m25454a(parcel, zzw.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                InterfaceC4770mr m24351N = AbstractBinderC4732lr.m24351N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzH(m24351N);
                parcel2.writeNoException();
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                zzdh zzk = zzk();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzde) {
                        zzdeVar = (zzde) queryLocalInterface6;
                    } else {
                        zzdeVar = new zzdc(readStrongBinder6);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzP(zzdeVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) AbstractC4871pg.m25454a(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzbi) {
                        zzbiVar = (zzbi) queryLocalInterface7;
                    } else {
                        zzbiVar = new zzbg(readStrongBinder7);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzy(zzlVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzW(m19911N);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzcg) {
                        zzcgVar = (zzcg) queryLocalInterface8;
                    } else {
                        zzcgVar = new zzce(readStrongBinder8);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzJ(zzcgVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
