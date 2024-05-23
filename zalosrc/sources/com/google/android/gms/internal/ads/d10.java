package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d10 extends AbstractBinderC4833og implements e10 {
    public d10() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: N */
    public static e10 m21246N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof e10) {
            return (e10) queryLocalInterface;
        }
        return new c10(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                String readString = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                String mo20780B4 = mo20780B4(readString);
                parcel2.writeNoException();
                parcel2.writeString(mo20780B4);
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                k00 mo20781Z = mo20781Z(readString2);
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, mo20781Z);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                String readString3 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zze = zze();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC4271b zzh = zzh();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzh);
                return true;
            case 10:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                boolean mo20783r = mo20783r(m19911N);
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, mo20783r);
                return true;
            case 11:
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, null);
                return true;
            case 12:
                boolean zzq = zzq();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzq);
                return true;
            case 13:
                boolean zzs = zzs();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzs);
                return true;
            case 14:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo20782e1(m19911N2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                h00 zzf = zzf();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzf);
                return true;
            default:
                return false;
        }
    }
}
