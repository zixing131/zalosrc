package p537u4;

import android.os.Parcel;
import p438q5.AbstractBinderC25123c;

/* renamed from: u4.q */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC27024q extends AbstractBinderC25123c implements InterfaceC27021n {
    public AbstractBinderC27024q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p438q5.AbstractBinderC25123c
    /* renamed from: E */
    protected final boolean mo130216E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            zzq();
        } else {
            zzp();
        }
        return true;
    }
}
