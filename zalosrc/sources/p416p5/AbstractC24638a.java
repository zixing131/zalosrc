package p416p5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC24638a implements IInterface {

    /* renamed from: p */
    private final IBinder f118513p;

    /* renamed from: q */
    private final String f118514q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC24638a(IBinder iBinder, String str) {
        this.f118513p = iBinder;
        this.f118514q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m128180E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f118514q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m128181N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f118513p.transact(i11, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f118513p;
    }
}
