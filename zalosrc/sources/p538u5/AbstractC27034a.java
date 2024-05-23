package p538u5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC27034a implements IInterface {

    /* renamed from: p */
    private final IBinder f127678p;

    /* renamed from: q */
    private final String f127679q;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC27034a(IBinder iBinder, String str) {
        this.f127678p = iBinder;
        this.f127679q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final Parcel m139176E(int i11, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f127678p.transact(i11, parcel, obtain, 0);
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
    /* renamed from: N */
    public final Parcel m139177N() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f127679q);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f127678p;
    }
}
