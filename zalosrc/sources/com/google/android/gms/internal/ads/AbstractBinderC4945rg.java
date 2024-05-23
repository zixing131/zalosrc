package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.rg */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC4945rg extends AbstractBinderC4833og implements InterfaceC4982sg {
    /* renamed from: N */
    public static InterfaceC4982sg m26075N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof InterfaceC4982sg) {
            return (InterfaceC4982sg) queryLocalInterface;
        }
        return new C4908qg(iBinder);
    }
}
