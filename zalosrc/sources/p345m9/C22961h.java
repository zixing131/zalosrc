package p345m9;

import com.google.firebase.perf.application.AbstractC6659b;
import com.google.firebase.perf.application.C6658a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p319l9.C22152a;
import p384o9.AbstractC24137g;
import p419p9.InterfaceC24679a;
import p441q9.C25197k;
import p476r9.AbstractC25706n;
import p507s9.C26191h;
import p507s9.C26194k;

/* renamed from: m9.h */
/* loaded from: classes3.dex */
public final class C22961h extends AbstractC6659b implements InterfaceC24679a {

    /* renamed from: x */
    private static final C22152a f111684x = C22152a.m115524e();

    /* renamed from: p */
    private final List f111685p;

    /* renamed from: q */
    private final GaugeManager f111686q;

    /* renamed from: r */
    private final C25197k f111687r;

    /* renamed from: s */
    private final C26191h.b f111688s;

    /* renamed from: t */
    private final WeakReference f111689t;

    /* renamed from: u */
    private String f111690u;

    /* renamed from: v */
    private boolean f111691v;

    /* renamed from: w */
    private boolean f111692w;

    private C22961h(C25197k c25197k) {
        this(c25197k, C6658a.m34003b(), GaugeManager.getInstance());
    }

    /* renamed from: c */
    public static C22961h m117692c(C25197k c25197k) {
        return new C22961h(c25197k);
    }

    /* renamed from: g */
    private boolean m117693g() {
        return this.f111688s.m134662D();
    }

    /* renamed from: h */
    private boolean m117694h() {
        return this.f111688s.m134664G();
    }

    /* renamed from: i */
    private static boolean m117695i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // p419p9.InterfaceC24679a
    /* renamed from: a */
    public void mo34162a(PerfSession perfSession) {
        if (perfSession == null) {
            f111684x.m115533j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (m117693g() && !m117694h()) {
            this.f111685p.add(perfSession);
        }
    }

    /* renamed from: b */
    public C26191h m117696b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f111689t);
        unregisterForAppState();
        C26194k[] m34243b = PerfSession.m34243b(m117697d());
        if (m34243b != null) {
            this.f111688s.m134659A(Arrays.asList(m34243b));
        }
        C26191h c26191h = (C26191h) this.f111688s.m35109q();
        if (!AbstractC24137g.m126109c(this.f111690u)) {
            f111684x.m115525a("Dropping network request from a 'User-Agent' that is not allowed");
            return c26191h;
        }
        if (!this.f111691v) {
            this.f111687r.m130430B(c26191h, getAppState());
            this.f111691v = true;
            return c26191h;
        }
        if (this.f111692w) {
            f111684x.m115525a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return c26191h;
    }

    /* renamed from: d */
    List m117697d() {
        List unmodifiableList;
        synchronized (this.f111685p) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f111685p) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public long m117698e() {
        return this.f111688s.m134661C();
    }

    /* renamed from: f */
    public boolean m117699f() {
        return this.f111688s.m134663E();
    }

    /* renamed from: j */
    public C22961h m117700j(String str) {
        C26191h.d dVar;
        if (str != null) {
            C26191h.d dVar2 = C26191h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c11 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    dVar = C26191h.d.OPTIONS;
                    break;
                case 1:
                    dVar = C26191h.d.GET;
                    break;
                case 2:
                    dVar = C26191h.d.PUT;
                    break;
                case 3:
                    dVar = C26191h.d.HEAD;
                    break;
                case 4:
                    dVar = C26191h.d.POST;
                    break;
                case 5:
                    dVar = C26191h.d.PATCH;
                    break;
                case 6:
                    dVar = C26191h.d.TRACE;
                    break;
                case 7:
                    dVar = C26191h.d.CONNECT;
                    break;
                case '\b':
                    dVar = C26191h.d.DELETE;
                    break;
                default:
                    dVar = C26191h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f111688s.m134666I(dVar);
        }
        return this;
    }

    /* renamed from: k */
    public C22961h m117701k(int i11) {
        this.f111688s.m134667L(i11);
        return this;
    }

    /* renamed from: l */
    public C22961h m117702l() {
        this.f111688s.m134668N(C26191h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    /* renamed from: m */
    public C22961h m117703m(long j11) {
        this.f111688s.m134669O(j11);
        return this;
    }

    /* renamed from: n */
    public C22961h m117704n(long j11) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f111689t);
        this.f111688s.m134665H(j11);
        mo34162a(perfSession);
        if (perfSession.m34249f()) {
            this.f111686q.collectGaugeMetricOnce(perfSession.m34247d());
        }
        return this;
    }

    /* renamed from: o */
    public C22961h m117705o(String str) {
        if (str == null) {
            this.f111688s.m134660B();
            return this;
        }
        if (m117695i(str)) {
            this.f111688s.m134670P(str);
        } else {
            f111684x.m115533j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: p */
    public C22961h m117706p(long j11) {
        this.f111688s.m134671R(j11);
        return this;
    }

    /* renamed from: q */
    public C22961h m117707q(long j11) {
        this.f111688s.m134672S(j11);
        return this;
    }

    /* renamed from: t */
    public C22961h m117708t(long j11) {
        this.f111688s.m134673T(j11);
        if (SessionManager.getInstance().perfSession().m34249f()) {
            this.f111686q.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m34247d());
        }
        return this;
    }

    /* renamed from: u */
    public C22961h m117709u(long j11) {
        this.f111688s.m134674U(j11);
        return this;
    }

    /* renamed from: w */
    public C22961h m117710w(String str) {
        if (str != null) {
            this.f111688s.m134675V(AbstractC25706n.m132624e(AbstractC25706n.m132623d(str), ZAbstractBase.ZVU_PROCESS_FLUSH));
        }
        return this;
    }

    /* renamed from: x */
    public C22961h m117711x(String str) {
        this.f111690u = str;
        return this;
    }

    public C22961h(C25197k c25197k, C6658a c6658a, GaugeManager gaugeManager) {
        super(c6658a);
        this.f111688s = C26191h.m134636w0();
        this.f111689t = new WeakReference(this);
        this.f111687r = c25197k;
        this.f111686q = gaugeManager;
        this.f111685p = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
