package p438q5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC25124d implements IInterface {

    /* renamed from: p */
    private final IBinder f120651p;

    /* renamed from: q */
    private final String f120652q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC25124d(IBinder iBinder, String str) {
        this.f120651p = iBinder;
        this.f120652q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m130217E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f120652q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m130218N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f120651p.transact(i11, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f120651p;
    }
}
