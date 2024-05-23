package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ja0 extends AbstractBinderC4833og implements ka0 {
    public ja0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: N */
    public static ka0 m23578N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        if (queryLocalInterface instanceof ka0) {
            return (ka0) queryLocalInterface;
        }
        return new ia0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 2:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                k00 zzl = zzl();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzl);
                return true;
            case 6:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 7:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String mo23149a = mo23149a();
                parcel2.writeNoException();
                parcel2.writeString(mo23149a);
                return true;
            case 10:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdk zzj = zzj();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 13:
                InterfaceC4271b zzm = zzm();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzm);
                return true;
            case 14:
                InterfaceC4271b zzn = zzn();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzn);
                return true;
            case 15:
                InterfaceC4271b zzo = zzo();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzo);
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, zzi);
                return true;
            case 17:
                boolean zzB = zzB();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzB);
                return true;
            case 18:
                boolean zzA = zzA();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzA);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo23147E2(m19911N);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo23150s4(m19911N2, m19911N3, m19911N4);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo23148K(m19911N5);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 25:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            default:
                return false;
        }
    }
}
