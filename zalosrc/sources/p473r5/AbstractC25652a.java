package p473r5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC25652a implements IInterface {

    /* renamed from: p */
    private final IBinder f122626p;

    /* renamed from: q */
    private final String f122627q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC25652a(IBinder iBinder, String str) {
        this.f122626p = iBinder;
        this.f122627q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m132540E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f122627q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m132541N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f122626p.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f122626p;
    }
}
