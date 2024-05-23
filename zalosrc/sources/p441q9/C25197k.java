package p441q9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.firebase.C6576e;
import com.google.firebase.perf.application.C6658a;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;
import p233i9.AbstractC20428a;
import p233i9.C20432e;
import p319l9.AbstractC22153b;
import p319l9.C22152a;
import p342m6.AbstractC22894m;
import p360n9.AbstractC23631e;
import p476r9.C25701i;
import p476r9.EnumC25694b;
import p507s9.C26184a;
import p507s9.C26186c;
import p507s9.C26190g;
import p507s9.C26191h;
import p507s9.C26192i;
import p507s9.C26196m;
import p507s9.EnumC26187d;
import p507s9.InterfaceC26193j;

/* renamed from: q9.k */
/* loaded from: classes3.dex */
public class C25197k implements C6658a.b {

    /* renamed from: G */
    private static final C22152a f120907G = C22152a.m115524e();

    /* renamed from: H */
    private static final C25197k f120908H = new C25197k();

    /* renamed from: A */
    private C25190d f120909A;

    /* renamed from: B */
    private C6658a f120910B;

    /* renamed from: C */
    private C26186c.b f120911C;

    /* renamed from: D */
    private String f120912D;

    /* renamed from: E */
    private String f120913E;

    /* renamed from: p */
    private final Map f120915p;

    /* renamed from: s */
    private C6576e f120918s;

    /* renamed from: t */
    private C20432e f120919t;

    /* renamed from: u */
    private InterfaceC2661e f120920u;

    /* renamed from: v */
    private InterfaceC0662b f120921v;

    /* renamed from: w */
    private C25188b f120922w;

    /* renamed from: y */
    private Context f120924y;

    /* renamed from: z */
    private C6662a f120925z;

    /* renamed from: q */
    private final ConcurrentLinkedQueue f120916q = new ConcurrentLinkedQueue();

    /* renamed from: r */
    private final AtomicBoolean f120917r = new AtomicBoolean(false);

    /* renamed from: F */
    private boolean f120914F = false;

    /* renamed from: x */
    private ExecutorService f120923x = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private C25197k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f120915p = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: D */
    private C26192i m130400D(C26192i.b bVar, EnumC26187d enumC26187d) {
        m130403G();
        C26186c.b m134561E = this.f120911C.m134561E(enumC26187d);
        if (bVar.mo134694i() || bVar.mo134692c()) {
            m134561E = ((C26186c.b) m134561E.clone()).m134558B(m130414j());
        }
        return (C26192i) bVar.m134697A(m134561E).m35109q();
    }

    /* renamed from: E */
    public void m130401E() {
        Context m33612j = this.f120918s.m33612j();
        this.f120924y = m33612j;
        this.f120912D = m33612j.getPackageName();
        this.f120925z = C6662a.m34042g();
        this.f120909A = new C25190d(this.f120924y, new C25701i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f120910B = C6658a.m34003b();
        this.f120922w = new C25188b(this.f120921v, this.f120925z.m34062a());
        m130412h();
    }

    /* renamed from: F */
    private void m130402F(C26192i.b bVar, EnumC26187d enumC26187d) {
        if (!m130433u()) {
            if (m130422s(bVar)) {
                f120907G.m115526b("Transport is not initialized yet, %s will be queued for to be dispatched later", m130418n(bVar));
                this.f120916q.add(new C25189c(bVar, enumC26187d));
                return;
            }
            return;
        }
        C26192i m130400D = m130400D(bVar, enumC26187d);
        if (m130423t(m130400D)) {
            m130411g(m130400D);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m130403G() {
        String str;
        if (this.f120925z.m34059K()) {
            if (this.f120911C.m134557A() && !this.f120914F) {
                return;
            }
            try {
                str = (String) AbstractC22894m.m117600b(this.f120920u.mo13077f(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                f120907G.m115528d("Task to retrieve Installation Id is interrupted: %s", e11.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
            } catch (ExecutionException e12) {
                f120907G.m115528d("Unable to retrieve Installation Id: %s", e12.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
            } catch (TimeoutException e13) {
                f120907G.m115528d("Task to retrieve Installation Id is timed out: %s", e13.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.f120911C.m134560D(str);
            } else {
                f120907G.m115533j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
        }
    }

    /* renamed from: H */
    private void m130404H() {
        if (this.f120919t == null && m130433u()) {
            this.f120919t = C20432e.m106436c();
        }
    }

    /* renamed from: g */
    private void m130411g(C26192i c26192i) {
        if (c26192i.mo134694i()) {
            f120907G.m115530g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m130418n(c26192i), m130413i(c26192i.mo134695j()));
        } else {
            f120907G.m115530g("Logging %s", m130418n(c26192i));
        }
        this.f120922w.m130382b(c26192i);
    }

    /* renamed from: h */
    private void m130412h() {
        this.f120910B.m34018k(new WeakReference(f120908H));
        C26186c.b m134547Z = C26186c.m134547Z();
        this.f120911C = m134547Z;
        m134547Z.m134562G(this.f120918s.m33614m().m33680c()).m134559C(C26184a.m134521S().m134527A(this.f120912D).m134528B(AbstractC20428a.f100597b).m134529C(m130420p(this.f120924y)));
        this.f120917r.set(true);
        while (!this.f120916q.isEmpty()) {
            C25189c c25189c = (C25189c) this.f120916q.poll();
            if (c25189c != null) {
                this.f120923x.execute(new Runnable() { // from class: q9.j

                    /* renamed from: q */
                    public final /* synthetic */ C25189c f120906q;

                    public /* synthetic */ RunnableC25196j(C25189c c25189c2) {
                        r2 = c25189c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C25197k.this.m130424v(r2);
                    }
                });
            }
        }
    }

    /* renamed from: i */
    private String m130413i(C26196m c26196m) {
        String m134747j0 = c26196m.m134747j0();
        if (m134747j0.startsWith("_st_")) {
            return AbstractC22153b.m115537c(this.f120913E, this.f120912D, m134747j0);
        }
        return AbstractC22153b.m115535a(this.f120913E, this.f120912D, m134747j0);
    }

    /* renamed from: j */
    private Map m130414j() {
        m130404H();
        C20432e c20432e = this.f120919t;
        if (c20432e != null) {
            return c20432e.m106437b();
        }
        return Collections.emptyMap();
    }

    /* renamed from: k */
    public static C25197k m130415k() {
        return f120908H;
    }

    /* renamed from: l */
    private static String m130416l(C26190g c26190g) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(c26190g.m134604Y()), Integer.valueOf(c26190g.m134602V()), Integer.valueOf(c26190g.m134601U()));
    }

    /* renamed from: m */
    private static String m130417m(C26191h c26191h) {
        long j11;
        String str;
        if (c26191h.m134657u0()) {
            j11 = c26191h.m134648l0();
        } else {
            j11 = 0;
        }
        if (c26191h.m134653q0()) {
            str = String.valueOf(c26191h.m134642f0());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", c26191h.m134650n0(), str, new DecimalFormat("#.####").format(j11 / 1000.0d));
    }

    /* renamed from: n */
    private static String m130418n(InterfaceC26193j interfaceC26193j) {
        if (interfaceC26193j.mo134694i()) {
            return m130419o(interfaceC26193j.mo134695j());
        }
        if (interfaceC26193j.mo134692c()) {
            return m130417m(interfaceC26193j.mo134693e());
        }
        if (interfaceC26193j.mo134691a()) {
            return m130416l(interfaceC26193j.mo134696k());
        }
        return "log";
    }

    /* renamed from: o */
    private static String m130419o(C26196m c26196m) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", c26196m.m134747j0(), new DecimalFormat("#.####").format(c26196m.m134746g0() / 1000.0d));
    }

    /* renamed from: p */
    private static String m130420p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: q */
    private void m130421q(C26192i c26192i) {
        if (c26192i.mo134694i()) {
            this.f120910B.m34012d(EnumC25694b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (c26192i.mo134692c()) {
            this.f120910B.m34012d(EnumC25694b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    /* renamed from: s */
    private boolean m130422s(InterfaceC26193j interfaceC26193j) {
        int intValue = ((Integer) this.f120915p.get("KEY_AVAILABLE_TRACES_FOR_CACHING")).intValue();
        int intValue2 = ((Integer) this.f120915p.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING")).intValue();
        int intValue3 = ((Integer) this.f120915p.get("KEY_AVAILABLE_GAUGES_FOR_CACHING")).intValue();
        if (interfaceC26193j.mo134694i() && intValue > 0) {
            this.f120915p.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        }
        if (interfaceC26193j.mo134692c() && intValue2 > 0) {
            this.f120915p.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        }
        if (interfaceC26193j.mo134691a() && intValue3 > 0) {
            this.f120915p.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
        f120907G.m115526b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m130418n(interfaceC26193j), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
        return false;
    }

    /* renamed from: t */
    private boolean m130423t(C26192i c26192i) {
        if (!this.f120925z.m34059K()) {
            f120907G.m115530g("Performance collection is not enabled, dropping %s", m130418n(c26192i));
            return false;
        }
        if (!c26192i.m134689Q().m134554V()) {
            f120907G.m115534k("App Instance ID is null or empty, dropping %s", m130418n(c26192i));
            return false;
        }
        if (!AbstractC23631e.m123876b(c26192i, this.f120924y)) {
            f120907G.m115534k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m130418n(c26192i));
            return false;
        }
        if (!this.f120909A.m130390h(c26192i)) {
            m130421q(c26192i);
            f120907G.m115530g("Event dropped due to device sampling - %s", m130418n(c26192i));
            return false;
        }
        if (!this.f120909A.m130389g(c26192i)) {
            return true;
        }
        m130421q(c26192i);
        f120907G.m115530g("Rate limited (per device) - %s", m130418n(c26192i));
        return false;
    }

    /* renamed from: v */
    public /* synthetic */ void m130424v(C25189c c25189c) {
        m130402F(c25189c.f120874a, c25189c.f120875b);
    }

    /* renamed from: w */
    public /* synthetic */ void m130425w(C26196m c26196m, EnumC26187d enumC26187d) {
        m130402F(C26192i.m134684S().m134700D(c26196m), enumC26187d);
    }

    /* renamed from: x */
    public /* synthetic */ void m130426x(C26191h c26191h, EnumC26187d enumC26187d) {
        m130402F(C26192i.m134684S().m134699C(c26191h), enumC26187d);
    }

    /* renamed from: y */
    public /* synthetic */ void m130427y(C26190g c26190g, EnumC26187d enumC26187d) {
        m130402F(C26192i.m134684S().m134698B(c26190g), enumC26187d);
    }

    /* renamed from: z */
    public /* synthetic */ void m130428z() {
        this.f120909A.m130388a(this.f120914F);
    }

    /* renamed from: A */
    public void m130429A(C26190g c26190g, EnumC26187d enumC26187d) {
        this.f120923x.execute(new Runnable() { // from class: q9.i

            /* renamed from: q */
            public final /* synthetic */ C26190g f120903q;

            /* renamed from: r */
            public final /* synthetic */ EnumC26187d f120904r;

            public /* synthetic */ RunnableC25195i(C26190g c26190g2, EnumC26187d enumC26187d2) {
                r2 = c26190g2;
                r3 = enumC26187d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25197k.this.m130427y(r2, r3);
            }
        });
    }

    /* renamed from: B */
    public void m130430B(C26191h c26191h, EnumC26187d enumC26187d) {
        this.f120923x.execute(new Runnable() { // from class: q9.g

            /* renamed from: q */
            public final /* synthetic */ C26191h f120899q;

            /* renamed from: r */
            public final /* synthetic */ EnumC26187d f120900r;

            public /* synthetic */ RunnableC25193g(C26191h c26191h2, EnumC26187d enumC26187d2) {
                r2 = c26191h2;
                r3 = enumC26187d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25197k.this.m130426x(r2, r3);
            }
        });
    }

    /* renamed from: C */
    public void m130431C(C26196m c26196m, EnumC26187d enumC26187d) {
        this.f120923x.execute(new Runnable() { // from class: q9.e

            /* renamed from: q */
            public final /* synthetic */ C26196m f120895q;

            /* renamed from: r */
            public final /* synthetic */ EnumC26187d f120896r;

            public /* synthetic */ RunnableC25191e(C26196m c26196m2, EnumC26187d enumC26187d2) {
                r2 = c26196m2;
                r3 = enumC26187d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25197k.this.m130425w(r2, r3);
            }
        });
    }

    @Override // com.google.firebase.perf.application.C6658a.b
    public void onUpdateAppState(EnumC26187d enumC26187d) {
        boolean z11;
        if (enumC26187d == EnumC26187d.FOREGROUND) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f120914F = z11;
        if (m130433u()) {
            this.f120923x.execute(new Runnable() { // from class: q9.h
                public /* synthetic */ RunnableC25194h() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25197k.this.m130428z();
                }
            });
        }
    }

    /* renamed from: r */
    public void m130432r(C6576e c6576e, InterfaceC2661e interfaceC2661e, InterfaceC0662b interfaceC0662b) {
        this.f120918s = c6576e;
        this.f120913E = c6576e.m33614m().m33682e();
        this.f120920u = interfaceC2661e;
        this.f120921v = interfaceC0662b;
        this.f120923x.execute(new Runnable() { // from class: q9.f
            public /* synthetic */ RunnableC25192f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25197k.this.m130401E();
            }
        });
    }

    /* renamed from: u */
    public boolean m130433u() {
        return this.f120917r.get();
    }
}
