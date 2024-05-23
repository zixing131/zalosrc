package p538u5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: u5.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC27035b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC27035b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E */
    protected boolean mo19751E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        return false;
    }

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
        return mo19751E(i11, parcel, parcel2, i12);
    }
}
