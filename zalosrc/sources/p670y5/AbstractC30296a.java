package p670y5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: y5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC30296a implements IInterface {

    /* renamed from: p */
    private final IBinder f140672p;

    /* renamed from: q */
    private final String f140673q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30296a(IBinder iBinder, String str) {
        this.f140672p = iBinder;
        this.f140673q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m149436E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f140673q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m149437N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f140672p.transact(i11, parcel, obtain, 0);
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
    public final void m149438Q(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f140672p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f140672p;
    }
}
