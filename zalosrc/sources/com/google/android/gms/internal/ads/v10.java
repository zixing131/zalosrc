package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public abstract class v10 extends AbstractBinderC4833og implements w10 {
    public v10() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* renamed from: N */
    public static w10 m27120N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof w10) {
            return (w10) queryLocalInterface;
        }
        return new u10(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4833og
    protected final boolean zzbI(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzbs zzac = zzbr.zzac(parcel.readStrongBinder());
            InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            AbstractC4871pg.m25456c(parcel);
            mo26560N0(zzac, m19911N);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
