package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class o60 extends AbstractBinderC4833og implements p60 {
    public o60() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        s60 q60Var;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 != 7) {
                            return false;
                        }
                        h00 zzc = zzc();
                        parcel2.writeNoException();
                        AbstractC4871pg.m25460g(parcel2, zzc);
                        return true;
                    }
                    InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                    AbstractC4871pg.m25456c(parcel);
                    zze(m19911N);
                    parcel2.writeNoException();
                    return true;
                }
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    q60Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof s60) {
                        q60Var = (s60) queryLocalInterface;
                    } else {
                        q60Var = new q60(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo25403f4(m19911N2, q60Var);
                parcel2.writeNoException();
                return true;
            }
            zzd();
            parcel2.writeNoException();
            return true;
        }
        com.google.android.gms.ads.internal.client.zzdk zzb = zzb();
        parcel2.writeNoException();
        AbstractC4871pg.m25460g(parcel2, zzb);
        return true;
    }
}
