package p473r5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: r5.g */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC25658g extends AbstractBinderC25653b implements InterfaceC25657f {
    public AbstractBinderC25658g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p473r5.AbstractBinderC25653b
    /* renamed from: E */
    protected final boolean mo132542E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        mo132546J1((Status) AbstractC25654c.m132543a(parcel, Status.CREATOR));
        return true;
    }
}
