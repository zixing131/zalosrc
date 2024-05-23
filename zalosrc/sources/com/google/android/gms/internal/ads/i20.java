package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class i20 extends AbstractBinderC4833og implements j20 {
    public i20() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        f20 d20Var;
        switch (i11) {
            case 2:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                List mo22109a = mo22109a();
                parcel2.writeNoException();
                parcel2.writeList(mo22109a);
                return true;
            case 4:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 5:
                k00 zzk = zzk();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzk);
                return true;
            case 6:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 7:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 10:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdk zzh = zzh();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzh);
                return true;
            case 12:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                b00 zzi = zzi();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo22114v2(bundle);
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                Bundle bundle2 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                boolean mo22106T1 = mo22106T1(bundle2);
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo22106T1);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo22116z3(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC4271b zzm = zzm();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzm);
                return true;
            case 19:
                InterfaceC4271b zzl = zzl();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    d20Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof f20) {
                        d20Var = (f20) queryLocalInterface;
                    } else {
                        d20Var = new d20(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo22115x4(d20Var);
                parcel2.writeNoException();
                return true;
            case 22:
                mo22112g();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 24:
                boolean mo22113i = mo22113i();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo22113i);
                return true;
            case 25:
                zzcu zzb = zzct.zzb(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo22108Y0(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                zzcq zzb2 = zzcp.zzb(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo22111e2(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                h00 zzj = zzj();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzj);
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                boolean mo22110e = mo22110e();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo22110e);
                return true;
            case 31:
                zzdh zzg = zzg();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzg);
                return true;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                zzde zzb3 = zzdd.zzb(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo22107W1(zzb3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
