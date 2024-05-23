package p051c7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC3300a implements IInterface {

    /* renamed from: p */
    private final IBinder f14105p;

    /* renamed from: q */
    private final String f14106q = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3300a(IBinder iBinder, String str) {
        this.f14105p = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m16748E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14106q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m16749N(int i11, Parcel parcel) {
        try {
            this.f14105p.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14105p;
    }
}
