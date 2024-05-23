package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class y00 extends AbstractBinderC4833og implements z00 {
    public y00() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 2:
                InterfaceC4271b zzh = zzh();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzh);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                k00 zzf = zzf();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzf);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 10:
                String zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdk zzd = zzd();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                boolean mo28271O = mo28271O(bundle2);
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo28271O);
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                Bundle bundle3 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo28272P(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                b00 zze = zze();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zze);
                return true;
            case 18:
                InterfaceC4271b zzg = zzg();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzg);
                return true;
            case 19:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
