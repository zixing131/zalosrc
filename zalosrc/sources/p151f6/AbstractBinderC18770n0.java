package p151f6;

import android.os.Parcel;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;

/* renamed from: f6.n0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18770n0 extends AbstractBinderC28760r implements InterfaceC18772o0 {
    public AbstractBinderC18770n0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            int readInt = parcel.readInt();
            AbstractC28768z.m143903b(parcel);
            zzb(readInt);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
