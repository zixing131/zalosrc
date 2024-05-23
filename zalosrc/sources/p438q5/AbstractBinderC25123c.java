package p438q5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q5.c */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC25123c extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC25123c(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E */
    protected abstract boolean mo130216E(int i11, Parcel parcel, Parcel parcel2, int i12);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 > 16777215) {
            if (super.onTransact(i11, parcel, parcel2, i12)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo130216E(i11, parcel, parcel2, i12);
    }
}
