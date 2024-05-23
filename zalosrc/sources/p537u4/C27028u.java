package p537u4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p438q5.AbstractC25124d;
import p438q5.AbstractC25125e;

/* renamed from: u4.u */
/* loaded from: classes2.dex */
public final class C27028u extends AbstractC25124d implements InterfaceC27025r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C27028u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // p537u4.InterfaceC27025r
    /* renamed from: l2 */
    public final void mo139169l2(InterfaceC27023p interfaceC27023p, GoogleSignInOptions googleSignInOptions) {
        Parcel m130217E = m130217E();
        AbstractC25125e.m130220b(m130217E, interfaceC27023p);
        AbstractC25125e.m130221c(m130217E, googleSignInOptions);
        m130218N(102, m130217E);
    }

    @Override // p537u4.InterfaceC27025r
    /* renamed from: z2 */
    public final void mo139170z2(InterfaceC27023p interfaceC27023p, GoogleSignInOptions googleSignInOptions) {
        Parcel m130217E = m130217E();
        AbstractC25125e.m130220b(m130217E, interfaceC27023p);
        AbstractC25125e.m130221c(m130217E, googleSignInOptions);
        m130218N(103, m130217E);
    }
}
