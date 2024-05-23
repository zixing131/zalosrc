package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5518o0 implements IInterface {

    /* renamed from: p */
    private final IBinder f32692p;

    /* renamed from: q */
    private final String f32693q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5518o0(IBinder iBinder, String str) {
        this.f32692p = iBinder;
        this.f32693q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m29469E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32693q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m29470N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f32692p.transact(i11, parcel, obtain, 0);
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
    public final void m29471Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f32692p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32692p;
    }
}
