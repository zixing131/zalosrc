package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.firebase.AbstractC6544b;
import com.google.firebase.C6576e;
import com.google.firebase.messaging.C6637p0;
import com.google.firebase.messaging.C6645t0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;
import p256j5.ThreadFactoryC20918b;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p342m6.InterfaceC22882g;
import p342m6.InterfaceC22886i;
import p636x8.AbstractC29471a;
import p636x8.InterfaceC29472b;
import p636x8.InterfaceC29474d;
import p668y3.InterfaceC30281g;
import p708z8.InterfaceC31707a;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    private static final long f36568n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    private static C6645t0 f36569o;

    /* renamed from: p */
    static InterfaceC30281g f36570p;

    /* renamed from: q */
    static ScheduledExecutorService f36571q;

    /* renamed from: a */
    private final C6576e f36572a;

    /* renamed from: b */
    private final InterfaceC2661e f36573b;

    /* renamed from: c */
    private final Context f36574c;

    /* renamed from: d */
    private final C6600a0 f36575d;

    /* renamed from: e */
    private final C6637p0 f36576e;

    /* renamed from: f */
    private final C6598a f36577f;

    /* renamed from: g */
    private final Executor f36578g;

    /* renamed from: h */
    private final Executor f36579h;

    /* renamed from: i */
    private final Executor f36580i;

    /* renamed from: j */
    private final AbstractC22888j f36581j;

    /* renamed from: k */
    private final C6615f0 f36582k;

    /* renamed from: l */
    private boolean f36583l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f36584m;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes.dex */
    public class C6598a {

        /* renamed from: a */
        private final InterfaceC29474d f36585a;

        /* renamed from: b */
        private boolean f36586b;

        /* renamed from: c */
        private InterfaceC29472b f36587c;

        /* renamed from: d */
        private Boolean f36588d;

        C6598a(InterfaceC29474d interfaceC29474d) {
            this.f36585a = interfaceC29474d;
        }

        /* renamed from: d */
        public /* synthetic */ void m33736d(AbstractC29471a abstractC29471a) {
            if (m33739c()) {
                FirebaseMessaging.this.m33705F();
            }
        }

        /* renamed from: e */
        private Boolean m33737e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m33612j = FirebaseMessaging.this.f36572a.m33612j();
            SharedPreferences sharedPreferences = m33612j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m33612j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m33612j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: b */
        synchronized void m33738b() {
            try {
                if (this.f36586b) {
                    return;
                }
                Boolean m33737e = m33737e();
                this.f36588d = m33737e;
                if (m33737e == null) {
                    C6652x c6652x = new InterfaceC29472b() { // from class: com.google.firebase.messaging.x
                        public /* synthetic */ C6652x() {
                        }

                        @Override // p636x8.InterfaceC29472b
                        /* renamed from: a */
                        public final void mo941a(AbstractC29471a abstractC29471a) {
                            FirebaseMessaging.C6598a.this.m33736d(abstractC29471a);
                        }
                    };
                    this.f36587c = c6652x;
                    this.f36585a.mo16921b(AbstractC6544b.class, c6652x);
                }
                this.f36586b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: c */
        synchronized boolean m33739c() {
            boolean m33616s;
            try {
                m33738b();
                Boolean bool = this.f36588d;
                if (bool != null) {
                    m33616s = bool.booleanValue();
                } else {
                    m33616s = FirebaseMessaging.this.f36572a.m33616s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return m33616s;
        }
    }

    public FirebaseMessaging(C6576e c6576e, InterfaceC31707a interfaceC31707a, InterfaceC0662b interfaceC0662b, InterfaceC0662b interfaceC0662b2, InterfaceC2661e interfaceC2661e, InterfaceC30281g interfaceC30281g, InterfaceC29474d interfaceC29474d) {
        this(c6576e, interfaceC31707a, interfaceC0662b, interfaceC0662b2, interfaceC2661e, interfaceC30281g, interfaceC29474d, new C6615f0(c6576e.m33612j()));
    }

    /* renamed from: A */
    public /* synthetic */ void m33701A() {
        if (m33733u()) {
            m33705F();
        }
    }

    /* renamed from: B */
    public /* synthetic */ void m33702B(C6655y0 c6655y0) {
        if (m33733u()) {
            c6655y0.m33987o();
        }
    }

    /* renamed from: C */
    public /* synthetic */ void m33703C() {
        AbstractC6629l0.m33908c(this.f36574c);
    }

    /* renamed from: E */
    private synchronized void m33704E() {
        if (!this.f36583l) {
            m33725G(0L);
        }
    }

    /* renamed from: F */
    public void m33705F() {
        if (m33726H(m33732r())) {
            m33704E();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C6576e c6576e) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c6576e.m33611i(FirebaseMessaging.class);
            AbstractC4205o.m19723l(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: n */
    public static synchronized FirebaseMessaging m33715n() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C6576e.m33601k());
        }
        return firebaseMessaging;
    }

    /* renamed from: o */
    private static synchronized C6645t0 m33716o(Context context) {
        C6645t0 c6645t0;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36569o == null) {
                    f36569o = new C6645t0(context);
                }
                c6645t0 = f36569o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6645t0;
    }

    /* renamed from: p */
    private String m33717p() {
        if ("[DEFAULT]".equals(this.f36572a.m33613l())) {
            return "";
        }
        return this.f36572a.m33615n();
    }

    /* renamed from: s */
    public static InterfaceC30281g m33718s() {
        return f36570p;
    }

    /* renamed from: t */
    private void m33719t(String str) {
        if ("[DEFAULT]".equals(this.f36572a.m33613l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invoking onNewToken for app: ");
                sb2.append(this.f36572a.m33613l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C6628l(this.f36574c).m33904i(intent);
        }
    }

    /* renamed from: w */
    public /* synthetic */ AbstractC22888j m33720w(String str, C6645t0.a aVar) {
        return this.f36575d.m33770f().mo117589r(this.f36580i, new InterfaceC22886i() { // from class: com.google.firebase.messaging.w

            /* renamed from: b */
            public final /* synthetic */ String f36720b;

            /* renamed from: c */
            public final /* synthetic */ C6645t0.a f36721c;

            public /* synthetic */ C6650w(String str2, C6645t0.a aVar2) {
                r2 = str2;
                r3 = aVar2;
            }

            @Override // p342m6.InterfaceC22886i
            /* renamed from: a */
            public final AbstractC22888j mo33968a(Object obj) {
                AbstractC22888j m33721x;
                m33721x = FirebaseMessaging.this.m33721x(r2, r3, (String) obj);
                return m33721x;
            }
        });
    }

    /* renamed from: x */
    public /* synthetic */ AbstractC22888j m33721x(String str, C6645t0.a aVar, String str2) {
        m33716o(this.f36574c).m33953g(m33717p(), str, str2, this.f36582k.m33851a());
        if (aVar == null || !str2.equals(aVar.f36702a)) {
            m33719t(str2);
        }
        return AbstractC22894m.m117604f(str2);
    }

    /* renamed from: y */
    public /* synthetic */ void m33722y(C22890k c22890k) {
        try {
            AbstractC22894m.m117599a(this.f36575d.m33769c());
            m33716o(this.f36574c).m33950d(m33717p(), C6615f0.m33848c(this.f36572a));
            c22890k.m117596c(null);
        } catch (Exception e11) {
            c22890k.m117595b(e11);
        }
    }

    /* renamed from: z */
    public /* synthetic */ void m33723z(C22890k c22890k) {
        try {
            c22890k.m117596c(m33727j());
        } catch (Exception e11) {
            c22890k.m117595b(e11);
        }
    }

    /* renamed from: D */
    public synchronized void m33724D(boolean z11) {
        this.f36583l = z11;
    }

    /* renamed from: G */
    public synchronized void m33725G(long j11) {
        m33729l(new RunnableC6647u0(this, Math.min(Math.max(30L, 2 * j11), f36568n)), j11);
        this.f36583l = true;
    }

    /* renamed from: H */
    boolean m33726H(C6645t0.a aVar) {
        if (aVar != null && !aVar.m33956b(this.f36582k.m33851a())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public String m33727j() {
        C6645t0.a m33732r = m33732r();
        if (!m33726H(m33732r)) {
            return m33732r.f36702a;
        }
        String m33848c = C6615f0.m33848c(this.f36572a);
        try {
            return (String) AbstractC22894m.m117599a(this.f36576e.m33930b(m33848c, new C6637p0.a() { // from class: com.google.firebase.messaging.u

                /* renamed from: b */
                public final /* synthetic */ String f36706b;

                /* renamed from: c */
                public final /* synthetic */ C6645t0.a f36707c;

                public /* synthetic */ C6646u(String m33848c2, C6645t0.a m33732r2) {
                    r2 = m33848c2;
                    r3 = m33732r2;
                }

                @Override // com.google.firebase.messaging.C6637p0.a
                public final AbstractC22888j start() {
                    AbstractC22888j m33720w;
                    m33720w = FirebaseMessaging.this.m33720w(r2, r3);
                    return m33720w;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    /* renamed from: k */
    public AbstractC22888j m33728k() {
        if (m33732r() == null) {
            return AbstractC22894m.m117604f(null);
        }
        C22890k c22890k = new C22890k();
        AbstractC6630m.m33916e().execute(new Runnable() { // from class: com.google.firebase.messaging.v

            /* renamed from: q */
            public final /* synthetic */ C22890k f36714q;

            public /* synthetic */ RunnableC6648v(C22890k c22890k2) {
                r2 = c22890k2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m33722y(r2);
            }
        });
        return c22890k2.m117594a();
    }

    /* renamed from: l */
    public void m33729l(Runnable runnable, long j11) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36571q == null) {
                    f36571q = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC20918b("TAG"));
                }
                f36571q.schedule(runnable, j11, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public Context m33730m() {
        return this.f36574c;
    }

    /* renamed from: q */
    public AbstractC22888j m33731q() {
        C22890k c22890k = new C22890k();
        this.f36578g.execute(new Runnable() { // from class: com.google.firebase.messaging.t

            /* renamed from: q */
            public final /* synthetic */ C22890k f36699q;

            public /* synthetic */ RunnableC6644t(C22890k c22890k2) {
                r2 = c22890k2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m33723z(r2);
            }
        });
        return c22890k2.m117594a();
    }

    /* renamed from: r */
    C6645t0.a m33732r() {
        return m33716o(this.f36574c).m33951e(m33717p(), C6615f0.m33848c(this.f36572a));
    }

    /* renamed from: u */
    public boolean m33733u() {
        return this.f36577f.m33739c();
    }

    /* renamed from: v */
    public boolean m33734v() {
        return this.f36582k.m33855g();
    }

    FirebaseMessaging(C6576e c6576e, InterfaceC31707a interfaceC31707a, InterfaceC0662b interfaceC0662b, InterfaceC0662b interfaceC0662b2, InterfaceC2661e interfaceC2661e, InterfaceC30281g interfaceC30281g, InterfaceC29474d interfaceC29474d, C6615f0 c6615f0) {
        this(c6576e, interfaceC31707a, interfaceC2661e, interfaceC30281g, interfaceC29474d, c6615f0, new C6600a0(c6576e, c6615f0, interfaceC0662b, interfaceC0662b2, interfaceC2661e), AbstractC6630m.m33917f(), AbstractC6630m.m33914c(), AbstractC6630m.m33913b());
    }

    FirebaseMessaging(C6576e c6576e, InterfaceC31707a interfaceC31707a, InterfaceC2661e interfaceC2661e, InterfaceC30281g interfaceC30281g, InterfaceC29474d interfaceC29474d, C6615f0 c6615f0, C6600a0 c6600a0, Executor executor, Executor executor2, Executor executor3) {
        this.f36583l = false;
        f36570p = interfaceC30281g;
        this.f36572a = c6576e;
        this.f36573b = interfaceC2661e;
        this.f36577f = new C6598a(interfaceC29474d);
        Context m33612j = c6576e.m33612j();
        this.f36574c = m33612j;
        C6634o c6634o = new C6634o();
        this.f36584m = c6634o;
        this.f36582k = c6615f0;
        this.f36579h = executor;
        this.f36575d = c6600a0;
        this.f36576e = new C6637p0(executor);
        this.f36578g = executor2;
        this.f36580i = executor3;
        Context m33612j2 = c6576e.m33612j();
        if (m33612j2 instanceof Application) {
            ((Application) m33612j2).registerActivityLifecycleCallbacks(c6634o);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Context ");
            sb2.append(m33612j2);
            sb2.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC31707a != null) {
            interfaceC31707a.m152595a(new InterfaceC31707a.a() { // from class: com.google.firebase.messaging.p
                public /* synthetic */ C6636p() {
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            public /* synthetic */ RunnableC6638q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m33701A();
            }
        });
        AbstractC22888j m33977e = C6655y0.m33977e(this, c6615f0, c6600a0, m33612j, AbstractC6630m.m33918g());
        this.f36581j = m33977e;
        m33977e.mo117577f(executor2, new InterfaceC22882g() { // from class: com.google.firebase.messaging.r
            public /* synthetic */ C6640r() {
            }

            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.m33702B((C6655y0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            public /* synthetic */ RunnableC6642s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m33703C();
            }
        });
    }
}
