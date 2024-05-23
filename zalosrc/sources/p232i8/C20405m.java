package p232i8;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.C6576e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p153f8.C18821f;
import p153f8.InterfaceC18816a;
import p183g8.InterfaceC19291a;
import p201h8.InterfaceC19922a;
import p201h8.InterfaceC19923b;
import p259j8.C21089c;
import p259j8.C21095i;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p359n8.C23620g;
import p418p8.InterfaceC24673i;
import p440q8.C25157a;
import p440q8.C25159c;

/* renamed from: i8.m */
/* loaded from: classes.dex */
public class C20405m {

    /* renamed from: a */
    private final Context f100515a;

    /* renamed from: b */
    private final C6576e f100516b;

    /* renamed from: c */
    private final C20417s f100517c;

    /* renamed from: f */
    private C20407n f100520f;

    /* renamed from: g */
    private C20407n f100521g;

    /* renamed from: h */
    private boolean f100522h;

    /* renamed from: i */
    private C20401k f100523i;

    /* renamed from: j */
    private final C20422w f100524j;

    /* renamed from: k */
    private final C23620g f100525k;

    /* renamed from: l */
    public final InterfaceC19923b f100526l;

    /* renamed from: m */
    private final InterfaceC19291a f100527m;

    /* renamed from: n */
    private final ExecutorService f100528n;

    /* renamed from: o */
    private final C20397i f100529o;

    /* renamed from: p */
    private final InterfaceC18816a f100530p;

    /* renamed from: e */
    private final long f100519e = System.currentTimeMillis();

    /* renamed from: d */
    private final C20384b0 f100518d = new C20384b0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.m$a */
    /* loaded from: classes.dex */
    public class a implements Callable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24673i f100531a;

        a(InterfaceC24673i interfaceC24673i) {
            this.f100531a = interfaceC24673i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC22888j call() {
            return C20405m.this.m106333i(this.f100531a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.m$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ InterfaceC24673i f100533p;

        b(InterfaceC24673i interfaceC24673i) {
            this.f100533p = interfaceC24673i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20405m.this.m106333i(this.f100533p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.m$c */
    /* loaded from: classes.dex */
    public class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean m106358d = C20405m.this.f100520f.m106358d();
                if (!m106358d) {
                    C18821f.m98795f().m98804k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m106358d);
            } catch (Exception e11) {
                C18821f.m98795f().m98799e("Problem encountered deleting Crashlytics initialization marker.", e11);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.m$d */
    /* loaded from: classes.dex */
    public class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C20405m.this.f100523i.m106293u());
        }
    }

    public C20405m(C6576e c6576e, C20422w c20422w, InterfaceC18816a interfaceC18816a, C20417s c20417s, InterfaceC19923b interfaceC19923b, InterfaceC19291a interfaceC19291a, C23620g c23620g, ExecutorService executorService) {
        this.f100516b = c6576e;
        this.f100517c = c20417s;
        this.f100515a = c6576e.m33612j();
        this.f100524j = c20422w;
        this.f100530p = interfaceC18816a;
        this.f100526l = interfaceC19923b;
        this.f100527m = interfaceC19291a;
        this.f100528n = executorService;
        this.f100525k = c23620g;
        this.f100529o = new C20397i(executorService);
    }

    /* renamed from: d */
    private void m106332d() {
        try {
            this.f100522h = Boolean.TRUE.equals((Boolean) AbstractC20418s0.m106402f(this.f100529o.m106240h(new d())));
        } catch (Exception unused) {
            this.f100522h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public AbstractC22888j m106333i(InterfaceC24673i interfaceC24673i) {
        m106345q();
        try {
            this.f100526l.mo97166a(new InterfaceC19922a() { // from class: i8.l
                @Override // p201h8.InterfaceC19922a
                /* renamed from: a */
                public final void mo103697a(String str) {
                    C20405m.this.m106342n(str);
                }
            });
            if (!interfaceC24673i.mo128225b().f118586b.f118593a) {
                C18821f.m98795f().m98796b("Collection of crash reports disabled in Crashlytics settings.");
                return AbstractC22894m.m117603e(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f100523i.m106279B(interfaceC24673i)) {
                C18821f.m98795f().m98804k("Previous sessions could not be finalized.");
            }
            return this.f100523i.m106288U(interfaceC24673i.mo128224a());
        } catch (Exception e11) {
            C18821f.m98795f().m98799e("Crashlytics encountered a problem during asynchronous initialization.", e11);
            return AbstractC22894m.m117603e(e11);
        } finally {
            m106344p();
        }
    }

    /* renamed from: k */
    private void m106334k(InterfaceC24673i interfaceC24673i) {
        Future<?> submit = this.f100528n.submit(new b(interfaceC24673i));
        C18821f.m98795f().m98796b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            C18821f.m98795f().m98799e("Crashlytics was interrupted during initialization.", e11);
        } catch (ExecutionException e12) {
            C18821f.m98795f().m98799e("Crashlytics encountered a problem during initialization.", e12);
        } catch (TimeoutException e13) {
            C18821f.m98795f().m98799e("Crashlytics timed out during initialization.", e13);
        }
    }

    /* renamed from: l */
    public static String m106335l() {
        return "18.3.6";
    }

    /* renamed from: m */
    static boolean m106336m(String str, boolean z11) {
        if (!z11) {
            C18821f.m98795f().m98802i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public AbstractC22888j m106337e() {
        return this.f100523i.m106291o();
    }

    /* renamed from: f */
    public AbstractC22888j m106338f() {
        return this.f100523i.m106292t();
    }

    /* renamed from: g */
    public boolean m106339g() {
        return this.f100522h;
    }

    /* renamed from: h */
    boolean m106340h() {
        return this.f100520f.m106357c();
    }

    /* renamed from: j */
    public AbstractC22888j m106341j(InterfaceC24673i interfaceC24673i) {
        return AbstractC20418s0.m106404h(this.f100528n, new a(interfaceC24673i));
    }

    /* renamed from: n */
    public void m106342n(String str) {
        this.f100523i.m106290Y(System.currentTimeMillis() - this.f100519e, str);
    }

    /* renamed from: o */
    public void m106343o(Throwable th2) {
        this.f100523i.m106289X(Thread.currentThread(), th2);
    }

    /* renamed from: p */
    void m106344p() {
        this.f100529o.m106240h(new c());
    }

    /* renamed from: q */
    void m106345q() {
        this.f100529o.m106237b();
        this.f100520f.m106356a();
        C18821f.m98795f().m98802i("Initialization marker file was created.");
    }

    /* renamed from: r */
    public boolean m106346r(C20381a c20381a, InterfaceC24673i interfaceC24673i) {
        if (m106336m(c20381a.f100415b, AbstractC20395h.m106215k(this.f100515a, "com.crashlytics.RequireBuildId", true))) {
            String c20393g = new C20393g(this.f100524j).toString();
            try {
                this.f100521g = new C20407n("crash_marker", this.f100525k);
                this.f100520f = new C20407n("initialization_marker", this.f100525k);
                C21095i c21095i = new C21095i(c20393g, this.f100525k, this.f100529o);
                C21089c c21089c = new C21089c(this.f100525k);
                this.f100523i = new C20401k(this.f100515a, this.f100529o, this.f100524j, this.f100517c, this.f100525k, this.f100521g, c20381a, c21095i, c21089c, C20404l0.m106312g(this.f100515a, this.f100524j, this.f100525k, c20381a, c21089c, c21095i, new C25157a(1024, new C25159c(10)), interfaceC24673i, this.f100518d), this.f100530p, this.f100527m);
                boolean m106340h = m106340h();
                m106332d();
                this.f100523i.m106295z(c20393g, Thread.getDefaultUncaughtExceptionHandler(), interfaceC24673i);
                if (m106340h && AbstractC20395h.m106207c(this.f100515a)) {
                    C18821f.m98795f().m98796b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    m106334k(interfaceC24673i);
                    return false;
                }
                C18821f.m98795f().m98796b("Successfully configured exception handler.");
                return true;
            } catch (Exception e11) {
                C18821f.m98795f().m98799e("Crashlytics was not started due to an exception during initialization", e11);
                this.f100523i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    /* renamed from: s */
    public AbstractC22888j m106347s() {
        return this.f100523i.m106285R();
    }

    /* renamed from: t */
    public void m106348t(Boolean bool) {
        this.f100517c.m106394g(bool);
    }

    /* renamed from: u */
    public void m106349u(String str, String str2) {
        this.f100523i.m106286S(str, str2);
    }

    /* renamed from: v */
    public void m106350v(String str) {
        this.f100523i.m106287T(str);
    }
}
