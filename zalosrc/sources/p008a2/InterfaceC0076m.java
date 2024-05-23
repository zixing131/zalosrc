package p008a2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p008a2.InterfaceC0075l;

/* renamed from: a2.m */
/* loaded from: classes2.dex */
public interface InterfaceC0076m extends IInterface {

    /* renamed from: a2.m$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC0076m {

        /* renamed from: a2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32614a implements InterfaceC0076m {

            /* renamed from: p */
            private IBinder f310p;

            C32614a(IBinder iBinder) {
                this.f310p = iBinder;
            }

            @Override // p008a2.InterfaceC0076m
            /* renamed from: A2 */
            public int mo268A2(InterfaceC0075l interfaceC0075l, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(interfaceC0075l);
                    obtain.writeString(str);
                    this.f310p.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f310p;
            }

            @Override // p008a2.InterfaceC0076m
            /* renamed from: r2 */
            public void mo270r2(int i11, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i11);
                    obtain.writeStringArray(strArr);
                    this.f310p.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: E */
        public static InterfaceC0076m m271E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0076m)) {
                return (InterfaceC0076m) queryLocalInterface;
            }
            return new C32614a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i11 != 1598968902) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return super.onTransact(i11, parcel, parcel2, i12);
                        }
                        mo270r2(parcel.readInt(), parcel.createStringArray());
                    } else {
                        mo269V1(InterfaceC0075l.a.m267E(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                    }
                } else {
                    int mo268A2 = mo268A2(InterfaceC0075l.a.m267E(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo268A2);
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: A2 */
    int mo268A2(InterfaceC0075l interfaceC0075l, String str);

    /* renamed from: V1 */
    void mo269V1(InterfaceC0075l interfaceC0075l, int i11);

    /* renamed from: r2 */
    void mo270r2(int i11, String[] strArr);
}
