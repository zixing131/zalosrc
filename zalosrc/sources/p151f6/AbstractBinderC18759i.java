package p151f6;

import android.os.Parcel;
import p598w5.AbstractBinderC28760r;

/* renamed from: f6.i */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18759i extends AbstractBinderC28760r implements InterfaceC18761j {
    public AbstractBinderC18759i() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
