package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.v4 */
/* loaded from: classes2.dex */
public abstract class AbstractC5855v4 implements IInterface {

    /* renamed from: p */
    private final IBinder f33440p;

    /* renamed from: q */
    private final String f33441q = "com.android.vending.billing.IInAppBillingService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5855v4(IBinder iBinder, String str) {
        this.f33440p = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m30529E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f33441q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m30530N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f33440p.transact(i11, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e11) {
                obtain.recycle();
                throw e11;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public final void m30531Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f33440p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f33440p;
    }
}
