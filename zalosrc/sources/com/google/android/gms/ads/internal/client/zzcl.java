package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;
import com.google.android.gms.internal.ads.AbstractC4871pg;
import com.google.android.gms.internal.ads.h60;
import com.google.android.gms.internal.ads.i60;
import com.google.android.gms.internal.ads.u90;
import com.google.android.gms.internal.ads.v90;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzcl extends AbstractBinderC4833og implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        zzcy zzcwVar;
        switch (i11) {
            case 1:
                zzj();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                AbstractC4871pg.m25456c(parcel);
                zzp(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzq(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                zzo(m25461h);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzm(m19911N, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzk(readString3, m19911N2);
                parcel2.writeNoException();
                return true;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzt = zzt();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzt);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzh(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                v90 m26875N = u90.m26875N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzn(m26875N);
                parcel2.writeNoException();
                return true;
            case 12:
                i60 zzc = h60.zzc(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzr(zzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 14:
                zzez zzezVar = (zzez) AbstractC4871pg.m25454a(parcel, zzez.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzs(zzezVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface instanceof zzcy) {
                        zzcwVar = (zzcy) queryLocalInterface;
                    } else {
                        zzcwVar = new zzcw(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                zzl(zzcwVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
