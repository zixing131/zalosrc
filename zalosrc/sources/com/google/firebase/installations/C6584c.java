package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.appcompat.widget.AbstractC1158c0;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.firebase.C6576e;
import com.google.firebase.installations.C6584c;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p015a9.InterfaceC0662b;
import p035b9.C2663g;
import p035b9.InterfaceC2661e;
import p052c8.C3358u;
import p053c9.AbstractC3372d;
import p053c9.C3370b;
import p053c9.C3371c;
import p096d9.AbstractC17837d;
import p096d9.AbstractC17839f;
import p096d9.C17836c;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: classes.dex */
public class C6584c implements InterfaceC2661e {

    /* renamed from: m */
    private static final Object f36527m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f36528n = new a();

    /* renamed from: a */
    private final C6576e f36529a;

    /* renamed from: b */
    private final C17836c f36530b;

    /* renamed from: c */
    private final C3371c f36531c;

    /* renamed from: d */
    private final C6589h f36532d;

    /* renamed from: e */
    private final C3358u f36533e;

    /* renamed from: f */
    private final C2663g f36534f;

    /* renamed from: g */
    private final Object f36535g;

    /* renamed from: h */
    private final ExecutorService f36536h;

    /* renamed from: i */
    private final Executor f36537i;

    /* renamed from: j */
    private String f36538j;

    /* renamed from: k */
    private Set f36539k;

    /* renamed from: l */
    private final List f36540l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f36541a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f36541a.getAndIncrement())));
        }
    }

    /* renamed from: com.google.firebase.installations.c$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f36542a;

        /* renamed from: b */
        static final /* synthetic */ int[] f36543b;

        static {
            int[] iArr = new int[AbstractC17839f.b.values().length];
            f36543b = iArr;
            try {
                iArr[AbstractC17839f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36543b[AbstractC17839f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36543b[AbstractC17839f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC17837d.b.values().length];
            f36542a = iArr2;
            try {
                iArr2[AbstractC17837d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36542a[AbstractC17837d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C6584c(C6576e c6576e, InterfaceC0662b interfaceC0662b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c6576e, new C17836c(c6576e.m33612j(), interfaceC0662b), new C3371c(c6576e), C6589h.m33670c(), new C3358u(new InterfaceC0662b() { // from class: b9.b
            public /* synthetic */ C2658b() {
            }

            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                C3370b m33663z;
                m33663z = C6584c.m33663z(C6576e.this);
                return m33663z;
            }
        }), new C2663g());
    }

    /* renamed from: A */
    private void m33636A() {
        AbstractC4205o.m19719h(m33665n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC4205o.m19719h(m33666u(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC4205o.m19719h(m33664m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC4205o.m19713b(C6589h.m33673h(m33665n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC4205o.m19713b(C6589h.m33672g(m33664m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: B */
    private String m33637B(AbstractC3372d abstractC3372d) {
        if ((!this.f36529a.m33613l().equals("CHIME_ANDROID_SDK") && !this.f36529a.m33617t()) || !abstractC3372d.m16972m()) {
            return this.f36534f.m13081a();
        }
        String m16961f = m33654p().m16961f();
        if (TextUtils.isEmpty(m16961f)) {
            return this.f36534f.m13081a();
        }
        return m16961f;
    }

    /* renamed from: C */
    private AbstractC3372d m33638C(AbstractC3372d abstractC3372d) {
        String str;
        if (abstractC3372d.mo16940d() != null && abstractC3372d.mo16940d().length() == 11) {
            str = m33654p().m16962i();
        } else {
            str = null;
        }
        AbstractC17837d m94105d = this.f36530b.m94105d(m33664m(), abstractC3372d.mo16940d(), m33666u(), m33665n(), str);
        int i11 = b.f36542a[m94105d.mo94073e().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return abstractC3372d.m16975q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
        }
        return abstractC3372d.m16977s(m94105d.mo94071c(), m94105d.mo94072d(), this.f36532d.m33675b(), m94105d.mo94070b().mo94082c(), m94105d.mo94070b().mo94083d());
    }

    /* renamed from: D */
    private void m33639D(Exception exc) {
        synchronized (this.f36535g) {
            try {
                Iterator it = this.f36540l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC6588g) it.next()).mo33667a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: E */
    private void m33640E(AbstractC3372d abstractC3372d) {
        synchronized (this.f36535g) {
            try {
                Iterator it = this.f36540l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC6588g) it.next()).mo33668b(abstractC3372d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: F */
    private synchronized void m33641F(String str) {
        this.f36538j = str;
    }

    /* renamed from: G */
    private synchronized void m33642G(AbstractC3372d abstractC3372d, AbstractC3372d abstractC3372d2) {
        if (this.f36539k.size() != 0 && !TextUtils.equals(abstractC3372d.mo16940d(), abstractC3372d2.mo16940d())) {
            Iterator it = this.f36539k.iterator();
            if (it.hasNext()) {
                AbstractC1158c0.m5500a(it.next());
                abstractC3372d2.mo16940d();
                throw null;
            }
        }
    }

    /* renamed from: g */
    private AbstractC22888j m33647g() {
        C22890k c22890k = new C22890k();
        m33649i(new C6585d(this.f36532d, c22890k));
        return c22890k.m117594a();
    }

    /* renamed from: h */
    private AbstractC22888j m33648h() {
        C22890k c22890k = new C22890k();
        m33649i(new C6586e(c22890k));
        return c22890k.m117594a();
    }

    /* renamed from: i */
    private void m33649i(InterfaceC6588g interfaceC6588g) {
        synchronized (this.f36535g) {
            this.f36540l.add(interfaceC6588g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m33660w(boolean z11) {
        AbstractC3372d m33638C;
        AbstractC3372d m33657s = m33657s();
        try {
            if (!m33657s.m16968i() && !m33657s.m16971l()) {
                if (!z11 && !this.f36532d.m33677f(m33657s)) {
                    return;
                }
                m33638C = m33652l(m33657s);
                m33659v(m33638C);
                m33642G(m33657s, m33638C);
                if (m33638C.m16970k()) {
                    m33641F(m33638C.mo16940d());
                }
                if (!m33638C.m16968i()) {
                    m33639D(new FirebaseInstallationsException(FirebaseInstallationsException.EnumC6581a.BAD_CONFIG));
                    return;
                } else if (m33638C.m16969j()) {
                    m33639D(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    return;
                } else {
                    m33640E(m33638C);
                    return;
                }
            }
            m33638C = m33638C(m33657s);
            m33659v(m33638C);
            m33642G(m33657s, m33638C);
            if (m33638C.m16970k()) {
            }
            if (!m33638C.m16968i()) {
            }
        } catch (FirebaseInstallationsException e11) {
            m33639D(e11);
        }
    }

    /* renamed from: k */
    public final void m33662y(boolean z11) {
        AbstractC3372d m33658t = m33658t();
        if (z11) {
            m33658t = m33658t.m16974p();
        }
        m33640E(m33658t);
        this.f36537i.execute(new Runnable() { // from class: b9.c

            /* renamed from: q */
            public final /* synthetic */ boolean f10657q;

            public /* synthetic */ RunnableC2659c(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6584c.this.m33660w(r2);
            }
        });
    }

    /* renamed from: l */
    private AbstractC3372d m33652l(AbstractC3372d abstractC3372d) {
        AbstractC17839f m94106e = this.f36530b.m94106e(m33664m(), abstractC3372d.mo16940d(), m33666u(), abstractC3372d.mo16942f());
        int i11 = b.f36543b[m94106e.mo94081b().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m33641F(null);
                    return abstractC3372d.m16976r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6581a.UNAVAILABLE);
            }
            return abstractC3372d.m16975q("BAD CONFIG");
        }
        return abstractC3372d.m16973o(m94106e.mo94082c(), m94106e.mo94083d(), this.f36532d.m33675b());
    }

    /* renamed from: o */
    private synchronized String m33653o() {
        return this.f36538j;
    }

    /* renamed from: p */
    private C3370b m33654p() {
        return (C3370b) this.f36533e.get();
    }

    /* renamed from: q */
    public static C6584c m33655q() {
        return m33656r(C6576e.m33601k());
    }

    /* renamed from: r */
    public static C6584c m33656r(C6576e c6576e) {
        boolean z11;
        if (c6576e != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "Null is not a valid value of FirebaseApp.");
        return (C6584c) c6576e.m33611i(InterfaceC2661e.class);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: s */
    private AbstractC3372d m33657s() {
        AbstractC3372d m16966d;
        synchronized (f36527m) {
            try {
                C6583b m33634a = C6583b.m33634a(this.f36529a.m33612j(), "generatefid.lock");
                try {
                    m16966d = this.f36531c.m16966d();
                    if (m33634a != null) {
                        m33634a.m33635b();
                    }
                } catch (Throwable th2) {
                    if (m33634a != null) {
                        m33634a.m33635b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return m16966d;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: t */
    private AbstractC3372d m33658t() {
        AbstractC3372d m16966d;
        synchronized (f36527m) {
            try {
                C6583b m33634a = C6583b.m33634a(this.f36529a.m33612j(), "generatefid.lock");
                try {
                    m16966d = this.f36531c.m16966d();
                    if (m16966d.m16969j()) {
                        m16966d = this.f36531c.m16965b(m16966d.m16978t(m33637B(m16966d)));
                    }
                    if (m33634a != null) {
                        m33634a.m33635b();
                    }
                } catch (Throwable th2) {
                    if (m33634a != null) {
                        m33634a.m33635b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return m16966d;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: v */
    private void m33659v(AbstractC3372d abstractC3372d) {
        synchronized (f36527m) {
            try {
                C6583b m33634a = C6583b.m33634a(this.f36529a.m33612j(), "generatefid.lock");
                try {
                    this.f36531c.m16965b(abstractC3372d);
                    if (m33634a != null) {
                        m33634a.m33635b();
                    }
                } catch (Throwable th2) {
                    if (m33634a != null) {
                        m33634a.m33635b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: x */
    public /* synthetic */ void m33661x() {
        m33662y(false);
    }

    /* renamed from: z */
    public static /* synthetic */ C3370b m33663z(C6576e c6576e) {
        return new C3370b(c6576e);
    }

    @Override // p035b9.InterfaceC2661e
    /* renamed from: a */
    public AbstractC22888j mo13076a(boolean z11) {
        m33636A();
        AbstractC22888j m33647g = m33647g();
        this.f36536h.execute(new Runnable() { // from class: b9.d

            /* renamed from: q */
            public final /* synthetic */ boolean f10659q;

            public /* synthetic */ RunnableC2660d(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6584c.this.m33662y(r2);
            }
        });
        return m33647g;
    }

    @Override // p035b9.InterfaceC2661e
    /* renamed from: f */
    public AbstractC22888j mo13077f() {
        m33636A();
        String m33653o = m33653o();
        if (m33653o != null) {
            return AbstractC22894m.m117604f(m33653o);
        }
        AbstractC22888j m33648h = m33648h();
        this.f36536h.execute(new Runnable() { // from class: b9.a
            public /* synthetic */ RunnableC2657a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6584c.this.m33661x();
            }
        });
        return m33648h;
    }

    /* renamed from: m */
    String m33664m() {
        return this.f36529a.m33614m().m33679b();
    }

    /* renamed from: n */
    String m33665n() {
        return this.f36529a.m33614m().m33680c();
    }

    /* renamed from: u */
    String m33666u() {
        return this.f36529a.m33614m().m33682e();
    }

    C6584c(ExecutorService executorService, Executor executor, C6576e c6576e, C17836c c17836c, C3371c c3371c, C6589h c6589h, C3358u c3358u, C2663g c2663g) {
        this.f36535g = new Object();
        this.f36539k = new HashSet();
        this.f36540l = new ArrayList();
        this.f36529a = c6576e;
        this.f36530b = c17836c;
        this.f36531c = c3371c;
        this.f36532d = c6589h;
        this.f36533e = c3358u;
        this.f36534f = c2663g;
        this.f36536h = executorService;
        this.f36537i = executor;
    }
}
