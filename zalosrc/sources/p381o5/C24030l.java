package p381o5;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p229i5.C20288i;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p355n4.C23538c;
import p355n4.InterfaceC23537b;

/* renamed from: o5.l */
/* loaded from: classes2.dex */
public final class C24030l implements InterfaceC23537b {

    /* renamed from: e */
    private static InterfaceC23537b f116337e;

    /* renamed from: a */
    private final Context f116338a;

    /* renamed from: b */
    private boolean f116339b;

    /* renamed from: c */
    private final ScheduledExecutorService f116340c;

    /* renamed from: d */
    private final ExecutorService f116341d;

    C24030l(Context context) {
        this.f116339b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f116340c = newSingleThreadScheduledExecutor;
        this.f116341d = Executors.newSingleThreadExecutor();
        this.f116338a = context;
        if (!this.f116339b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC24028j(this, null), 0L, 86400L, TimeUnit.SECONDS);
            this.f116339b = true;
        }
    }

    /* renamed from: c */
    public static synchronized InterfaceC23537b m125903c(Context context) {
        InterfaceC23537b interfaceC23537b;
        synchronized (C24030l.class) {
            try {
                AbstractC4205o.m19723l(context, "Context must not be null");
                if (f116337e == null) {
                    f116337e = new C24030l(context.getApplicationContext());
                }
                interfaceC23537b = f116337e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC23537b;
    }

    /* renamed from: f */
    public static final void m125904f(Context context) {
        if (!m125905g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to clear app set ID generated for App ".concat(valueOf);
            }
        }
        if (!m125905g(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            if (valueOf2.length() != 0) {
                "Failed to clear app set ID last used time for App ".concat(valueOf2);
            }
        }
    }

    /* renamed from: g */
    private static final SharedPreferences m125905g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: h */
    private static final void m125906h(Context context) {
        SharedPreferences m125905g = m125905g(context);
        if (!m125905g.edit().putLong("app_set_id_last_used_time", C20288i.m105926d().mo105913a()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                "Failed to store app set ID last used time for App ".concat(valueOf);
            }
            throw new C24029k("Failed to store the app set ID last used time.");
        }
    }

    /* renamed from: a */
    public final long m125907a() {
        long j11 = m125905g(this.f116338a).getLong("app_set_id_last_used_time", -1L);
        if (j11 == -1) {
            return -1L;
        }
        return j11 + 33696000000L;
    }

    @Override // p355n4.InterfaceC23537b
    /* renamed from: d */
    public final AbstractC22888j mo123622d() {
        C22890k c22890k = new C22890k();
        this.f116341d.execute(new Runnable() { // from class: o5.h

            /* renamed from: q */
            public final /* synthetic */ C22890k f116335q;

            public /* synthetic */ RunnableC24026h(C22890k c22890k2) {
                r2 = c22890k2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24030l.this.m125908e(r2);
            }
        });
        return c22890k2.m117594a();
    }

    /* renamed from: e */
    public final /* synthetic */ void m125908e(C22890k c22890k) {
        String string = m125905g(this.f116338a).getString("app_set_id", null);
        long m125907a = m125907a();
        if (string != null && C20288i.m105926d().mo105913a() <= m125907a) {
            try {
                m125906h(this.f116338a);
            } catch (C24029k e11) {
                c22890k.m117595b(e11);
                return;
            }
        } else {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f116338a;
                if (!m125905g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        "Failed to store app set ID generated for App ".concat(valueOf);
                    }
                    throw new C24029k("Failed to store the app set ID.");
                }
                m125906h(context);
                Context context2 = this.f116338a;
                SharedPreferences m125905g = m125905g(context2);
                if (!m125905g.edit().putLong("app_set_id_creation_time", C20288i.m105926d().mo105913a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        "Failed to store app set ID creation time for App ".concat(valueOf2);
                    }
                    throw new C24029k("Failed to store the app set ID creation time.");
                }
            } catch (C24029k e12) {
                c22890k.m117595b(e12);
                return;
            }
        }
        c22890k.m117596c(new C23538c(string, 1));
    }
}
