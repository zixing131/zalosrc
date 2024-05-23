package p151f6;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p598w5.AbstractBinderC28760r;
import p598w5.AbstractC28768z;

/* renamed from: f6.u */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC18778u extends AbstractBinderC28760r implements InterfaceC18779v {
    public AbstractBinderC18778u() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // p598w5.AbstractBinderC28760r
    /* renamed from: E */
    protected final boolean mo98772E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
            AbstractC28768z.m143903b(parcel);
            zzc(m19911N);
        } else {
            Bitmap bitmap = (Bitmap) AbstractC28768z.m143902a(parcel, Bitmap.CREATOR);
            AbstractC28768z.m143903b(parcel);
            mo97051o3(bitmap);
        }
        parcel2.writeNoException();
        return true;
    }
}
