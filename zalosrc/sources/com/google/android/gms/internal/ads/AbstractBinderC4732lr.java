package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.lr */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4732lr extends AbstractBinderC4833og implements InterfaceC4770mr {
    public AbstractBinderC4732lr() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* renamed from: N */
    public static InterfaceC4770mr m24351N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof InterfaceC4770mr) {
            return (InterfaceC4770mr) queryLocalInterface;
        }
        return new C4695kr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        InterfaceC4658jr c4585hr;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return false;
                }
                zze zzeVar = (zze) AbstractC4871pg.m25454a(parcel, zze.CREATOR);
                AbstractC4871pg.m25456c(parcel);
                mo21783p4(zzeVar);
            } else {
                parcel.readInt();
                AbstractC4871pg.m25456c(parcel);
            }
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c4585hr = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof InterfaceC4658jr) {
                    c4585hr = (InterfaceC4658jr) queryLocalInterface;
                } else {
                    c4585hr = new C4585hr(readStrongBinder);
                }
            }
            AbstractC4871pg.m25456c(parcel);
            mo21782a1(c4585hr);
        }
        parcel2.writeNoException();
        return true;
    }
}
