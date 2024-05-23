package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class w33 extends AbstractBinderC4833og implements x33 {
    /* renamed from: N */
    public static x33 m27524N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        if (queryLocalInterface instanceof x33) {
            return (x33) queryLocalInterface;
        }
        return new v33(iBinder);
    }
}
