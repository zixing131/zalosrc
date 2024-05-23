package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.w4 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5861w4 extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC5861w4(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E */
    protected abstract boolean mo30222E(int i11, Parcel parcel, Parcel parcel2, int i12);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 > 16777215) {
            if (super.onTransact(i11, parcel, parcel2, i12)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo30222E(i11, parcel, parcel2, i12);
    }
}
