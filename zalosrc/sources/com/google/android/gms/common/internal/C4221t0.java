package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.t0 */
/* loaded from: classes2.dex */
final class C4221t0 implements InterfaceC4193k {

    /* renamed from: p */
    private final IBinder f16663p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4221t0(IBinder iBinder) {
        this.f16663p = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16663p;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4193k
    /* renamed from: b3 */
    public final void mo19697b3(InterfaceC4190j interfaceC4190j, GetServiceRequest getServiceRequest) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC4190j != null) {
                iBinder = interfaceC4190j.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C4198l1.m19700a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f16663p.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }
}
