package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.os.a */
/* loaded from: classes2.dex */
public interface InterfaceC0998a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC0998a {

        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C32622a implements InterfaceC0998a {

            /* renamed from: p */
            private IBinder f3550p;

            C32622a(IBinder iBinder) {
                this.f3550p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3550p;
            }

            @Override // android.support.v4.os.InterfaceC0998a
            /* renamed from: x2 */
            public void mo4627x2(int i11, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i11);
                    b.m4632d(obtain, bundle, 0);
                    this.f3550p.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: E */
        public static InterfaceC0998a m4628E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0998a)) {
                return (InterfaceC0998a) queryLocalInterface;
            }
            return new C32622a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i11 != 1598968902) {
                if (i11 != 1) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                mo4627x2(parcel.readInt(), (Bundle) b.m4631c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static Object m4631c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static void m4632d(Parcel parcel, Parcelable parcelable, int i11) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i11);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    /* renamed from: x2 */
    void mo4627x2(int i11, Bundle bundle);
}
