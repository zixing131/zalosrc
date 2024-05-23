package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class id0 extends AbstractBinderC4833og implements jd0 {
    /* renamed from: N */
    public static jd0 m23228N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        if (queryLocalInterface instanceof jd0) {
            return (jd0) queryLocalInterface;
        }
        return new hd0(iBinder);
    }
}
