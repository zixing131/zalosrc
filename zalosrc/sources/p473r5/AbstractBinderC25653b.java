package p473r5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r5.b */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC25653b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC25653b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E */
    protected abstract boolean mo132542E(int i11, Parcel parcel, Parcel parcel2, int i12);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i11, parcel, parcel2, i12)) {
            return true;
        }
        return mo132542E(i11, parcel, parcel2, i12);
    }
}
