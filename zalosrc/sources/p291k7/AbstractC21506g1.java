package p291k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k7.g1 */
/* loaded from: classes3.dex */
public abstract class AbstractC21506g1 implements IInterface {

    /* renamed from: p */
    private final IBinder f104544p;

    /* renamed from: q */
    private final String f104545q = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC21506g1(IBinder iBinder, String str) {
        this.f104544p = iBinder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m111155E() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f104545q);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m111156N(int i11, Parcel parcel) {
        try {
            this.f104544p.transact(i11, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f104544p;
    }
}
