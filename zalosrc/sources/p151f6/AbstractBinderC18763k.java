package p151f6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;

/* renamed from: f6.k */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18763k extends AbstractBinderC28760r implements InterfaceC18765l {
    public AbstractBinderC18763k() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        InterfaceC18745b c18754f0;
        if (i11 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c18754f0 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof InterfaceC18745b) {
                    c18754f0 = (InterfaceC18745b) queryLocalInterface;
                } else {
                    c18754f0 = new C18754f0(readStrongBinder);
                }
            }
            AbstractC28768z.m143903b(parcel);
            mo30672V2(c18754f0);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
