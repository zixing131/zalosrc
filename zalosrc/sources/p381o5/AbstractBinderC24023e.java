package p381o5;

import android.os.Parcel;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;

/* renamed from: o5.e */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC24023e extends AbstractBinderC24020b implements InterfaceC24024f {
    public AbstractBinderC24023e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // p381o5.AbstractBinderC24020b
    /* renamed from: E */
    protected final boolean mo125896E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            mo125900n1((Status) AbstractC24021c.m125897a(parcel, Status.CREATOR), (zzc) AbstractC24021c.m125897a(parcel, zzc.CREATOR));
            return true;
        }
        return false;
    }
}
