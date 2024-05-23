package p356n5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: n5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC23558a implements IInterface {

    /* renamed from: p */
    private final IBinder f114362p;

    /* renamed from: q */
    private final String f114363q = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC23558a(IBinder iBinder, String str) {
        this.f114362p = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m123625E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f114363q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final Parcel m123626N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f114362p.transact(i11, parcel, obtain, 0);
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
    public final IBinder asBinder() {
        return this.f114362p;
    }
}
