package p194h1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p194h1.InterfaceC19698a;

/* renamed from: h1.b */
/* loaded from: classes2.dex */
public interface InterfaceC19699b extends IInterface {

    /* renamed from: h1.b$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements InterfaceC19699b {
        public a() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            }
            if (i11 != 1598968902) {
                if (i11 != 1) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                mo6958P1(InterfaceC19698a.a.m103373E(parcel.readStrongBinder()));
                return true;
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
    }

    /* renamed from: P1 */
    void mo6958P1(InterfaceC19698a interfaceC19698a);
}
