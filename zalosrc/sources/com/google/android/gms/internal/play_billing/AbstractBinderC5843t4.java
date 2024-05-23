package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.play_billing.t4 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5843t4 extends AbstractBinderC5861w4 implements InterfaceC5849u4 {
    /* renamed from: N */
    public static InterfaceC5849u4 m30481N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof InterfaceC5849u4) {
            return (InterfaceC5849u4) queryLocalInterface;
        }
        return new C5837s4(iBinder);
    }
}
