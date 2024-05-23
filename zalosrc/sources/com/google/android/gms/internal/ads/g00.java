package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class g00 extends AbstractBinderC4833og implements h00 {
    public g00() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        t10 t10Var;
        switch (i11) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                zzj(m19911N);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC4271b zzi = zzi();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzi);
                return true;
            case 5:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 6:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zzh = zzh();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzh);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                AbstractC4871pg.m25457d(parcel2, zzk);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    t10Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof t10) {
                        t10Var = (t10) queryLocalInterface;
                    } else {
                        t10Var = new t10(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo22655k2(t10Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
