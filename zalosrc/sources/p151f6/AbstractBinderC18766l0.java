package p151f6;

import android.os.Parcel;
import p598w5.AbstractBinderC28760r;

/* renamed from: f6.l0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18766l0 extends AbstractBinderC28760r implements InterfaceC18768m0 {
    public AbstractBinderC18766l0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
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
