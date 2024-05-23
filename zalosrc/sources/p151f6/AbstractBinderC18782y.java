package p151f6;

import android.os.Parcel;
import p598w5.AbstractBinderC28760r;

/* renamed from: f6.y */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18782y extends AbstractBinderC28760r implements InterfaceC18748c0 {
    public AbstractBinderC18782y() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zzb();
        } else {
            zzc();
        }
        parcel2.writeNoException();
        return true;
    }
}
