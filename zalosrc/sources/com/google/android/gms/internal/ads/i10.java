package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class i10 extends AbstractBinderC4833og implements j10 {
    /* renamed from: N */
    public static j10 m23107N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (queryLocalInterface instanceof j10) {
            return (j10) queryLocalInterface;
        }
        return new h10(iBinder);
    }
}
