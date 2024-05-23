package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class l10 extends AbstractBinderC4833og implements m10 {
    /* renamed from: N */
    public static m10 m24103N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (queryLocalInterface instanceof m10) {
            return (m10) queryLocalInterface;
        }
        return new k10(iBinder);
    }
}
