package p026b0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p026b0.InterfaceC2475a;

/* renamed from: b0.c */
/* loaded from: classes2.dex */
public interface InterfaceC2477c extends IInterface {

    /* renamed from: b0.c$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC2477c {
        public a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            Bundle bundle = null;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 1598968902) {
                        return super.onTransact(i11, parcel, parcel2, i12);
                    }
                    parcel2.writeString("android.support.customtabs.IPostMessageService");
                    return true;
                }
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                InterfaceC2475a m12497E = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo5821K3(m12497E, readString, bundle);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            InterfaceC2475a m12497E2 = InterfaceC2475a.a.m12497E(parcel.readStrongBinder());
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            mo5822m4(m12497E2, bundle);
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: K3 */
    void mo5821K3(InterfaceC2475a interfaceC2475a, String str, Bundle bundle);

    /* renamed from: m4 */
    void mo5822m4(InterfaceC2475a interfaceC2475a, Bundle bundle);
}
