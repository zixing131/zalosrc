package p381o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC24019a implements IInterface {

    /* renamed from: p */
    private final IBinder f116331p;

    /* renamed from: q */
    private final String f116332q = "com.google.android.gms.appset.internal.IAppSetService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC24019a(IBinder iBinder, String str) {
        this.f116331p = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m125894E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f116332q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m125895N(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f116331p.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f116331p;
    }
}
