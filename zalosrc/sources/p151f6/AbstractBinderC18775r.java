package p151f6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;

/* renamed from: f6.r */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18775r extends AbstractBinderC28760r implements InterfaceC18776s {
    public AbstractBinderC18775r() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        InterfaceC18751e c18780w;
        if (i11 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c18780w = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (queryLocalInterface instanceof InterfaceC18751e) {
                    c18780w = (InterfaceC18751e) queryLocalInterface;
                } else {
                    c18780w = new C18780w(readStrongBinder);
                }
            }
            AbstractC28768z.m143903b(parcel);
            mo30676w3(c18780w);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
