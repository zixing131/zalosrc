package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class qd0 extends AbstractBinderC4833og implements rd0 {
    /* renamed from: N */
    public static rd0 m25693N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof rd0) {
            return (rd0) queryLocalInterface;
        }
        return new pd0(iBinder);
    }
}
