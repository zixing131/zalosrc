package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.f2 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5757f2 extends AbstractBinderC5861w4 implements InterfaceC5853v2 {
    public AbstractBinderC5757f2() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC5861w4
    /* renamed from: E */
    protected final boolean mo30222E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            Bundle bundle = (Bundle) AbstractC5867x4.m30562a(parcel, Bundle.CREATOR);
            AbstractC5867x4.m30563b(parcel);
            mo18647w4(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
