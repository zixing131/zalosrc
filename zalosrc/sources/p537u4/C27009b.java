package p537u4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: u4.b */
/* loaded from: classes2.dex */
public class C27009b {

    /* renamed from: c */
    private static final Lock f127655c = new ReentrantLock();

    /* renamed from: d */
    private static C27009b f127656d;

    /* renamed from: a */
    private final Lock f127657a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f127658b;

    C27009b(Context context) {
        this.f127658b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C27009b m139143b(Context context) {
        AbstractC4205o.m19722k(context);
        Lock lock = f127655c;
        lock.lock();
        try {
            if (f127656d == null) {
                f127656d = new C27009b(context.getApplicationContext());
            }
            C27009b c27009b = f127656d;
            lock.unlock();
            return c27009b;
        } catch (Throwable th2) {
            f127655c.unlock();
            throw th2;
        }
    }

    /* renamed from: i */
    private static final String m139144i(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public void m139145a() {
        this.f127657a.lock();
        try {
            this.f127658b.edit().clear().apply();
        } finally {
            this.f127657a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m139146c() {
        String m139150g;
        String m139150g2 = m139150g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m139150g2) || (m139150g = m139150g(m139144i("googleSignInAccount", m139150g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m19092E0(m139150g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m139147d() {
        String m139150g;
        String m139150g2 = m139150g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m139150g2) || (m139150g = m139150g(m139144i("googleSignInOptions", m139150g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m19104D0(m139150g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m139148e() {
        return m139150g("refreshToken");
    }

    /* renamed from: f */
    public void m139149f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC4205o.m19722k(googleSignInAccount);
        AbstractC4205o.m19722k(googleSignInOptions);
        m139151h("defaultGoogleSignInAccount", googleSignInAccount.m19094F0());
        AbstractC4205o.m19722k(googleSignInAccount);
        AbstractC4205o.m19722k(googleSignInOptions);
        String m19094F0 = googleSignInAccount.m19094F0();
        m139151h(m139144i("googleSignInAccount", m19094F0), googleSignInAccount.m19095G0());
        m139151h(m139144i("googleSignInOptions", m19094F0), googleSignInOptions.m19117H0());
    }

    /* renamed from: g */
    protected final String m139150g(String str) {
        this.f127657a.lock();
        try {
            return this.f127658b.getString(str, null);
        } finally {
            this.f127657a.unlock();
        }
    }

    /* renamed from: h */
    protected final void m139151h(String str, String str2) {
        this.f127657a.lock();
        try {
            this.f127658b.edit().putString(str, str2).apply();
        } finally {
            this.f127657a.unlock();
        }
    }
}
