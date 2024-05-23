package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class w00 extends AbstractBinderC4833og implements x00 {
    /* renamed from: N */
    public static x00 m27441N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof x00) {
            return (x00) queryLocalInterface;
        }
        return new v00(iBinder);
    }
}
