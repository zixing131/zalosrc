package p537u4;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p438q5.AbstractBinderC25123c;
import p438q5.AbstractC25125e;

/* renamed from: u4.s */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC27026s extends AbstractBinderC25123c implements InterfaceC27023p {
    public AbstractBinderC27026s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p438q5.AbstractBinderC25123c
    /* renamed from: E */
    protected final boolean mo130216E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        switch (i11) {
            case 101:
                mo139154t3((GoogleSignInAccount) AbstractC25125e.m130219a(parcel, GoogleSignInAccount.CREATOR), (Status) AbstractC25125e.m130219a(parcel, Status.CREATOR));
                break;
            case 102:
                mo139152G2((Status) AbstractC25125e.m130219a(parcel, Status.CREATOR));
                break;
            case 103:
                mo139153Z2((Status) AbstractC25125e.m130219a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
