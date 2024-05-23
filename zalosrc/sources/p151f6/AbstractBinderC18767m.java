package p151f6;

import android.os.Parcel;
import p598w5.AbstractBinderC28744c;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;
import p598w5.InterfaceC28746d;

/* renamed from: f6.m */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18767m extends AbstractBinderC28760r implements InterfaceC18769n {
    public AbstractBinderC18767m() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            InterfaceC28746d m143879N = AbstractBinderC28744c.m143879N(parcel.readStrongBinder());
            AbstractC28768z.m143903b(parcel);
            boolean mo97050Z1 = mo97050Z1(m143879N);
            parcel2.writeNoException();
            parcel2.writeInt(mo97050Z1 ? 1 : 0);
            return true;
        }
        return false;
    }
}
