package p012a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0144a implements IInterface {

    /* renamed from: p */
    private final IBinder f738p;

    /* renamed from: q */
    private final String f739q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0144a(IBinder iBinder, String str) {
        this.f738p = iBinder;
        this.f739q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m606E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f739q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m607N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f738p.transact(i11, parcel, obtain, 0);
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
    public final void m608Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f738p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f738p;
    }
}
