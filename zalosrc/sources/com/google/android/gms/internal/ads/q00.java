package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class q00 extends AbstractBinderC4833og implements r00 {
    /* renamed from: N */
    public static r00 m25625N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof r00) {
            return (r00) queryLocalInterface;
        }
        return new p00(iBinder);
    }
}
