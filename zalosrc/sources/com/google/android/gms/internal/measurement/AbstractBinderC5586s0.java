package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5586s0 extends AbstractBinderC5535p0 implements InterfaceC5603t0 {
    /* renamed from: N */
    public static InterfaceC5603t0 m29587N(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof InterfaceC5603t0) {
            return (InterfaceC5603t0) queryLocalInterface;
        }
        return new C5569r0(iBinder);
    }
}
