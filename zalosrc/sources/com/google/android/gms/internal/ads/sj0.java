package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class sj0 extends AbstractBinderC4833og implements tj0 {
    /* renamed from: N */
    public static tj0 m26337N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        if (queryLocalInterface instanceof tj0) {
            return (tj0) queryLocalInterface;
        }
        return new rj0(iBinder);
    }
}
