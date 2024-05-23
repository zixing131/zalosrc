package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class qs0 extends AbstractBinderC4833og implements rs0 {
    public qs0() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 1:
                Bundle bundle = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo24177p(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                Bundle mo24178v = mo24178v(bundle2);
                parcel2.writeNoException();
                AbstractC4871pg.m25459f(parcel2, mo24178v);
                return true;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle3 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo24176l4(readString, readString2, bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo24175U(readString3, readString4, m19911N);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                Map mo24172D4 = mo24172D4(readString5, readString6, m25461h);
                parcel2.writeNoException();
                parcel2.writeMap(mo24172D4);
                return true;
            case 6:
                String readString7 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                int zzb = zzb(readString7);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                Bundle bundle4 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                zzq(bundle4);
                parcel2.writeNoException();
                return true;
            case 8:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Bundle bundle5 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo24173K4(readString8, readString9, bundle5);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                List mo24179v1 = mo24179v1(readString10, readString11);
                parcel2.writeNoException();
                parcel2.writeList(mo24179v1);
                return true;
            case 10:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString12 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo24180x(readString12);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString13 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                zzn(readString13);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC4871pg.m25456c(parcel);
                mo24181x1(m19911N2, readString14, readString15);
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 17:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 18:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 19:
                Bundle bundle6 = (Bundle) AbstractC4871pg.m25454a(parcel, Bundle.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo24174P(bundle6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
