package p598w5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: w5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC28740a implements IInterface {

    /* renamed from: p */
    private final IBinder f133276p;

    /* renamed from: q */
    private final String f133277q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC28740a(IBinder iBinder, String str) {
        this.f133276p = iBinder;
        this.f133277q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m143867E(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f133276p.transact(i11, parcel, obtain, 0);
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
    /* renamed from: N */
    public final Parcel m143868N() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f133277q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q */
    public final void m143869Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f133276p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f133276p;
    }
}
