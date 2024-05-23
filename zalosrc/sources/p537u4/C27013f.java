package p537u4;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import java.util.Iterator;
import p438q5.AbstractC25122b;

/* renamed from: u4.f */
/* loaded from: classes2.dex */
public final class C27013f extends AbstractC4178f {

    /* renamed from: s */
    private final GoogleSignInOptions f127664s;

    public C27013f(Context context, Looper looper, C4175e c4175e, GoogleSignInOptions googleSignInOptions, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        super(context, looper, 91, c4175e, bVar, cVar);
        GoogleSignInOptions.C4038a c4038a;
        if (googleSignInOptions != null) {
            c4038a = new GoogleSignInOptions.C4038a(googleSignInOptions);
        } else {
            c4038a = new GoogleSignInOptions.C4038a();
        }
        c4038a.m19129e(AbstractC25122b.m130215a());
        if (!c4175e.m19650d().isEmpty()) {
            Iterator it = c4175e.m19650d().iterator();
            while (it.hasNext()) {
                c4038a.m19128d((Scope) it.next(), new Scope[0]);
            }
        }
        this.f127664s = c4038a.m19125a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof InterfaceC27025r) {
            return (InterfaceC27025r) queryLocalInterface;
        }
        return new C27028u(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return AbstractC4150d.f16480a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final Intent getSignInIntent() {
        return AbstractC27015h.m139161a(getContext(), this.f127664s);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: j */
    public final GoogleSignInOptions m139160j() {
        return this.f127664s;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final boolean providesSignIn() {
        return true;
    }
}
