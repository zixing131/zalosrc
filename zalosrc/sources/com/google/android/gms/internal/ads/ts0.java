package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class ts0 extends AbstractBinderC4833og implements us0 {
    /* renamed from: N */
    public static us0 m26733N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof us0) {
            return (us0) queryLocalInterface;
        }
        return new ss0(iBinder);
    }
}
