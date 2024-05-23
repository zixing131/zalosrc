package p537u4;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: u4.o */
/* loaded from: classes2.dex */
public final class C27022o {

    /* renamed from: d */
    private static C27022o f127668d;

    /* renamed from: a */
    private C27009b f127669a;

    /* renamed from: b */
    private GoogleSignInAccount f127670b;

    /* renamed from: c */
    private GoogleSignInOptions f127671c;

    private C27022o(Context context) {
        C27009b m139143b = C27009b.m139143b(context);
        this.f127669a = m139143b;
        this.f127670b = m139143b.m139146c();
        this.f127671c = this.f127669a.m139147d();
    }

    /* renamed from: c */
    public static synchronized C27022o m139165c(Context context) {
        C27022o m139166d;
        synchronized (C27022o.class) {
            m139166d = m139166d(context.getApplicationContext());
        }
        return m139166d;
    }

    /* renamed from: d */
    private static synchronized C27022o m139166d(Context context) {
        synchronized (C27022o.class) {
            C27022o c27022o = f127668d;
            if (c27022o != null) {
                return c27022o;
            }
            C27022o c27022o2 = new C27022o(context);
            f127668d = c27022o2;
            return c27022o2;
        }
    }

    /* renamed from: a */
    public final synchronized void m139167a() {
        this.f127669a.m139145a();
        this.f127670b = null;
        this.f127671c = null;
    }

    /* renamed from: b */
    public final synchronized void m139168b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f127669a.m139149f(googleSignInAccount, googleSignInOptions);
        this.f127670b = googleSignInAccount;
        this.f127671c = googleSignInOptions;
    }
}
