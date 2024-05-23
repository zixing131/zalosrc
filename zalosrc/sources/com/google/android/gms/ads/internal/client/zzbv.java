package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC4833og;

/* loaded from: classes2.dex */
public abstract class zzbv extends AbstractBinderC4833og implements zzbw {
    public static zzbw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (queryLocalInterface instanceof zzbw) {
            return (zzbw) queryLocalInterface;
        }
        return new zzbu(iBinder);
    }
}
