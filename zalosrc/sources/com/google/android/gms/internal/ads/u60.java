package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class u60 extends AbstractBinderC4833og implements v60 {
    /* renamed from: N */
    public static v60 m26861N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof v60) {
            return (v60) queryLocalInterface;
        }
        return new t60(iBinder);
    }
}
