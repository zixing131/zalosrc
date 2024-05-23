package p151f6;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;

/* renamed from: f6.p */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18773p extends AbstractBinderC28760r implements InterfaceC18774q {
    public AbstractBinderC18773p() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            AbstractC28768z.m143903b(parcel);
            zzb(m19911N);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
