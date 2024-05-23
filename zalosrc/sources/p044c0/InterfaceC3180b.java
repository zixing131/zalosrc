package p044c0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c0.b */
/* loaded from: classes2.dex */
public interface InterfaceC3180b extends IInterface {

    /* renamed from: c0.b$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC3180b {
        public a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            Bundle bundle = null;
            if (i11 != 9) {
                if (i11 != 1598968902) {
                    switch (i11) {
                        case 2:
                            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            Bundle mo5843M1 = mo5843M1(bundle);
                            parcel2.writeNoException();
                            if (mo5843M1 != null) {
                                parcel2.writeInt(1);
                                mo5843M1.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 3:
                            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            mo5848k4(bundle);
                            parcel2.writeNoException();
                            return true;
                        case 4:
                            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                            int mo5846V3 = mo5846V3();
                            parcel2.writeNoException();
                            parcel2.writeInt(mo5846V3);
                            return true;
                        case 5:
                            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                            Bundle mo5845T2 = mo5845T2();
                            parcel2.writeNoException();
                            if (mo5845T2 != null) {
                                parcel2.writeInt(1);
                                mo5845T2.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 6:
                            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                            }
                            Bundle mo5847b4 = mo5847b4(bundle);
                            parcel2.writeNoException();
                            if (mo5847b4 != null) {
                                parcel2.writeInt(1);
                                mo5847b4.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 7:
                            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                            Bundle mo5849o1 = mo5849o1();
                            parcel2.writeNoException();
                            if (mo5849o1 != null) {
                                parcel2.writeInt(1);
                                mo5849o1.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        default:
                            return super.onTransact(i11, parcel, parcel2, i12);
                    }
                }
                parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            }
            Bundle mo5844T0 = mo5844T0(readString, bundle, parcel.readStrongBinder());
            parcel2.writeNoException();
            if (mo5844T0 != null) {
                parcel2.writeInt(1);
                mo5844T0.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    /* renamed from: M1 */
    Bundle mo5843M1(Bundle bundle);

    /* renamed from: T0 */
    Bundle mo5844T0(String str, Bundle bundle, IBinder iBinder);

    /* renamed from: T2 */
    Bundle mo5845T2();

    /* renamed from: V3 */
    int mo5846V3();

    /* renamed from: b4 */
    Bundle mo5847b4(Bundle bundle);

    /* renamed from: k4 */
    void mo5848k4(Bundle bundle);

    /* renamed from: o1 */
    Bundle mo5849o1();
}
