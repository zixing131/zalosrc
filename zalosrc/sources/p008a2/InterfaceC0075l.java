package p008a2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a2.l */
/* loaded from: classes2.dex */
public interface InterfaceC0075l extends IInterface {

    /* renamed from: a2.l$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC0075l {

        /* renamed from: a2.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32613a implements InterfaceC0075l {

            /* renamed from: p */
            private IBinder f309p;

            C32613a(IBinder iBinder) {
                this.f309p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f309p;
            }

            @Override // p008a2.InterfaceC0075l
            /* renamed from: p0 */
            public void mo266p0(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f309p.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: E */
        public static InterfaceC0075l m267E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0075l)) {
                return (InterfaceC0075l) queryLocalInterface;
            }
            return new C32613a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i11 != 1598968902) {
                if (i11 != 1) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                mo266p0(parcel.createStringArray());
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    /* renamed from: p0 */
    void mo266p0(String[] strArr);
}
