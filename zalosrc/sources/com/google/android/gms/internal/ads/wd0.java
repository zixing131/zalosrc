package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class wd0 extends AbstractBinderC4833og implements xd0 {
    /* renamed from: N */
    public static xd0 m27600N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof xd0) {
            return (xd0) queryLocalInterface;
        }
        return new vd0(iBinder);
    }
}
