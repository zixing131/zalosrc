package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class hg0 extends AbstractBinderC4833og implements ig0 {
    /* renamed from: N */
    public static ig0 m22820N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (queryLocalInterface instanceof ig0) {
            return (ig0) queryLocalInterface;
        }
        return new gg0(iBinder);
    }
}
