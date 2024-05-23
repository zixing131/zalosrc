package p151f6;

import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;

/* renamed from: f6.h0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18758h0 extends AbstractBinderC28760r implements InterfaceC18760i0 {
    public AbstractBinderC18758h0() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            CameraPosition cameraPosition = (CameraPosition) AbstractC28768z.m143902a(parcel, CameraPosition.CREATOR);
            AbstractC28768z.m143903b(parcel);
            mo97052K1(cameraPosition);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
