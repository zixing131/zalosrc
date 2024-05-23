package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.ads.ir */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4622ir extends AbstractBinderC4833og implements InterfaceC4658jr {
    public AbstractBinderC4622ir() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        C4807nr c4807nr = null;
        InterfaceC4919qr interfaceC4919qr = null;
        switch (i11) {
            case 2:
                zzbs zze = zze();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof C4807nr) {
                        c4807nr = (C4807nr) queryLocalInterface;
                    } else {
                        c4807nr = new C4807nr(readStrongBinder);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo23725v3(c4807nr);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof InterfaceC4919qr) {
                        interfaceC4919qr = (InterfaceC4919qr) queryLocalInterface2;
                    } else {
                        interfaceC4919qr = new C4844or(readStrongBinder2);
                    }
                }
                AbstractC4871pg.m25456c(parcel);
                mo23003x3(m19911N, interfaceC4919qr);
                parcel2.writeNoException();
                return true;
            case 5:
                zzdh zzf = zzf();
                parcel2.writeNoException();
                AbstractC4871pg.m25460g(parcel2, zzf);
                return true;
            case 6:
                boolean m25461h = AbstractC4871pg.m25461h(parcel);
                AbstractC4871pg.m25456c(parcel);
                mo23002u2(m25461h);
                parcel2.writeNoException();
                return true;
            case 7:
                zzde zzb = zzdd.zzb(parcel.readStrongBinder());
                AbstractC4871pg.m25456c(parcel);
                mo23001E1(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
