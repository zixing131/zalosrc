package p537u4;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.AbstractC4039a;
import com.google.android.gms.auth.api.signin.C4040b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p229i5.AbstractC20300u;

/* renamed from: u4.t */
/* loaded from: classes2.dex */
public final class BinderC27027t extends AbstractBinderC27024q {

    /* renamed from: p */
    private final Context f127672p;

    public BinderC27027t(Context context) {
        this.f127672p = context;
    }

    private final void zzt() {
        if (AbstractC20300u.m105963a(this.f127672p, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // p537u4.InterfaceC27021n
    public final void zzp() {
        zzt();
        C27009b m139143b = C27009b.m139143b(this.f127672p);
        GoogleSignInAccount m139146c = m139143b.m139146c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f16048A;
        if (m139146c != null) {
            googleSignInOptions = m139143b.m139147d();
        }
        C4040b m19131a = AbstractC4039a.m19131a(this.f127672p, googleSignInOptions);
        if (m139146c != null) {
            m19131a.m19133w();
        } else {
            m19131a.m19134x();
        }
    }

    @Override // p537u4.InterfaceC27021n
    public final void zzq() {
        zzt();
        C27022o.m139165c(this.f127672p).m139167a();
    }
}
