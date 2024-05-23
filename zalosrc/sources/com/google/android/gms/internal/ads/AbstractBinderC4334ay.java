package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ay */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4334ay extends AbstractBinderC4833og implements InterfaceC4407cy {
    /* renamed from: N */
    public static InterfaceC4407cy m20346N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (queryLocalInterface instanceof InterfaceC4407cy) {
            return (InterfaceC4407cy) queryLocalInterface;
        }
        return new C5259zx(iBinder);
    }
}
