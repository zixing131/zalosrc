package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zd0 extends AbstractBinderC4833og implements ae0 {
    /* renamed from: N */
    public static ae0 m28484N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        if (queryLocalInterface instanceof ae0) {
            return (ae0) queryLocalInterface;
        }
        return new yd0(iBinder);
    }
}
