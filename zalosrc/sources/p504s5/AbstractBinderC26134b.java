package p504s5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: s5.b */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC26134b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC26134b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: W4 */
    protected abstract boolean mo98724W4(int i11, Parcel parcel, Parcel parcel2, int i12);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 > 16777215) {
            if (super.onTransact(i11, parcel, parcel2, i12)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo98724W4(i11, parcel, parcel2, i12);
    }
}
