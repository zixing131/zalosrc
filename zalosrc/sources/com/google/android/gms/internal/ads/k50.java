package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class k50 extends AbstractBinderC4833og implements l50 {
    /* renamed from: N */
    public static l50 m23840N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        if (queryLocalInterface instanceof l50) {
            return (l50) queryLocalInterface;
        }
        return new j50(iBinder);
    }
}
