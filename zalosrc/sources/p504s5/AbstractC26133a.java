package p504s5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: s5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC26133a implements IInterface {

    /* renamed from: p */
    private final IBinder f124365p;

    /* renamed from: q */
    private final String f124366q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC26133a(IBinder iBinder, String str) {
        this.f124365p = iBinder;
        this.f124366q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m134497E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f124366q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I3 */
    public final void m134498I3(int i11, Parcel parcel) {
        try {
            this.f124365p.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m134499N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f124365p.transact(2, parcel, obtain, 0);
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
    public final void m134500Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f124365p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f124365p;
    }
}
