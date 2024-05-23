package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C4077a;
import com.google.firebase.C6576e;
import com.google.firebase.remoteconfig.C6716c;
import com.google.firebase.remoteconfig.internal.C6722f;
import com.google.firebase.remoteconfig.internal.C6723g;
import com.google.firebase.remoteconfig.internal.C6729m;
import com.google.firebase.remoteconfig.internal.C6731o;
import com.google.firebase.remoteconfig.internal.C6732p;
import com.google.firebase.remoteconfig.internal.C6733q;
import com.google.firebase.remoteconfig.internal.C6736t;
import com.google.firebase.remoteconfig.internal.C6739w;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p005d.AbstractC0007b;
import p014a8.InterfaceC0650a;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;
import p229i5.C20288i;
import p229i5.InterfaceC20283d;
import p229i5.InterfaceC20285f;
import p342m6.AbstractC22894m;
import p672y7.C30805b;

/* renamed from: com.google.firebase.remoteconfig.c */
/* loaded from: classes3.dex */
public class C6716c {

    /* renamed from: j */
    private static final InterfaceC20285f f36938j = C20288i.m105926d();

    /* renamed from: k */
    private static final Random f36939k = new Random();

    /* renamed from: l */
    private static final Map f36940l = new HashMap();

    /* renamed from: a */
    private final Map f36941a;

    /* renamed from: b */
    private final Context f36942b;

    /* renamed from: c */
    private final ScheduledExecutorService f36943c;

    /* renamed from: d */
    private final C6576e f36944d;

    /* renamed from: e */
    private final InterfaceC2661e f36945e;

    /* renamed from: f */
    private final C30805b f36946f;

    /* renamed from: g */
    private final InterfaceC0662b f36947g;

    /* renamed from: h */
    private final String f36948h;

    /* renamed from: i */
    private Map f36949i;

    /* renamed from: com.google.firebase.remoteconfig.c$a */
    /* loaded from: classes3.dex */
    private static class a implements ComponentCallbacks2C4077a.a {

        /* renamed from: a */
        private static final AtomicReference f36950a = new AtomicReference();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m34338c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f36950a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (AbstractC0007b.m4a(atomicReference, null, aVar)) {
                    ComponentCallbacks2C4077a.m19299c(application);
                    ComponentCallbacks2C4077a.m19298b().m19301a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4077a.a
        /* renamed from: a */
        public void mo19304a(boolean z11) {
            C6716c.m34330p(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6716c(Context context, ScheduledExecutorService scheduledExecutorService, C6576e c6576e, InterfaceC2661e interfaceC2661e, C30805b c30805b, InterfaceC0662b interfaceC0662b) {
        this(context, scheduledExecutorService, c6576e, interfaceC2661e, c30805b, interfaceC0662b, true);
    }

    /* renamed from: e */
    private C6722f m34323e(String str, String str2) {
        return C6722f.m34366h(this.f36943c, C6736t.m34494c(this.f36942b, String.format("%s_%s_%s_%s.json", "frc", this.f36948h, str, str2)));
    }

    /* renamed from: i */
    private C6731o m34324i(C6722f c6722f, C6722f c6722f2) {
        return new C6731o(this.f36943c, c6722f, c6722f2);
    }

    /* renamed from: j */
    static C6732p m34325j(Context context, String str, String str2) {
        return new C6732p(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    /* renamed from: k */
    private static C6739w m34326k(C6576e c6576e, String str, InterfaceC0662b interfaceC0662b) {
        if (m34328n(c6576e) && str.equals("firebase")) {
            return new C6739w(interfaceC0662b);
        }
        return null;
    }

    /* renamed from: m */
    private static boolean m34327m(C6576e c6576e, String str) {
        if (str.equals("firebase") && m34328n(c6576e)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m34328n(C6576e c6576e) {
        return c6576e.m33613l().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ InterfaceC0650a m34329o() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static synchronized void m34330p(boolean z11) {
        synchronized (C6716c.class) {
            Iterator it = f36940l.values().iterator();
            while (it.hasNext()) {
                ((C6714a) it.next()).m34318o(z11);
            }
        }
    }

    /* renamed from: c */
    synchronized C6714a m34331c(C6576e c6576e, String str, InterfaceC2661e interfaceC2661e, C30805b c30805b, Executor executor, C6722f c6722f, C6722f c6722f2, C6722f c6722f3, C6729m c6729m, C6731o c6731o, C6732p c6732p) {
        C30805b c30805b2;
        try {
            if (!this.f36941a.containsKey(str)) {
                Context context = this.f36942b;
                if (m34327m(c6576e, str)) {
                    c30805b2 = c30805b;
                } else {
                    c30805b2 = null;
                }
                C6714a c6714a = new C6714a(context, c6576e, interfaceC2661e, c30805b2, executor, c6722f, c6722f2, c6722f3, c6729m, c6731o, c6732p, m34336l(c6576e, interfaceC2661e, c6729m, c6722f2, this.f36942b, str, c6732p));
                c6714a.m34319p();
                this.f36941a.put(str, c6714a);
                f36940l.put(str, c6714a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C6714a) this.f36941a.get(str);
    }

    /* renamed from: d */
    public synchronized C6714a m34332d(String str) {
        C6722f m34323e;
        C6722f m34323e2;
        C6722f m34323e3;
        C6732p m34325j;
        C6731o m34324i;
        try {
            m34323e = m34323e(str, "fetch");
            m34323e2 = m34323e(str, "activate");
            m34323e3 = m34323e(str, "defaults");
            m34325j = m34325j(this.f36942b, this.f36948h, str);
            m34324i = m34324i(m34323e2, m34323e3);
            final C6739w m34326k = m34326k(this.f36944d, str, this.f36947g);
            if (m34326k != null) {
                m34324i.m34437b(new InterfaceC20283d() { // from class: u9.k
                    @Override // p229i5.InterfaceC20283d
                    /* renamed from: a */
                    public final void mo105911a(Object obj, Object obj2) {
                        C6739w.this.m34512a((String) obj, (C6723g) obj2);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m34331c(this.f36944d, str, this.f36945e, this.f36946f, this.f36943c, m34323e, m34323e2, m34323e3, m34334g(str, m34323e, m34325j), m34324i, m34325j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C6714a m34333f() {
        return m34332d("firebase");
    }

    /* renamed from: g */
    synchronized C6729m m34334g(String str, C6722f c6722f, C6732p c6732p) {
        InterfaceC2661e interfaceC2661e;
        InterfaceC0662b interfaceC0662b;
        try {
            interfaceC2661e = this.f36945e;
            if (m34328n(this.f36944d)) {
                interfaceC0662b = this.f36947g;
            } else {
                interfaceC0662b = new InterfaceC0662b() { // from class: u9.l
                    @Override // p015a9.InterfaceC0662b
                    public final Object get() {
                        InterfaceC0650a m34329o;
                        m34329o = C6716c.m34329o();
                        return m34329o;
                    }
                };
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new C6729m(interfaceC2661e, interfaceC0662b, this.f36943c, f36938j, f36939k, c6722f, m34335h(this.f36944d.m33614m().m33679b(), str, c6732p), c6732p, this.f36949i);
    }

    /* renamed from: h */
    ConfigFetchHttpClient m34335h(String str, String str2, C6732p c6732p) {
        return new ConfigFetchHttpClient(this.f36942b, this.f36944d.m33614m().m33680c(), str, str2, c6732p.m34441b(), c6732p.m34441b());
    }

    /* renamed from: l */
    synchronized C6733q m34336l(C6576e c6576e, InterfaceC2661e interfaceC2661e, C6729m c6729m, C6722f c6722f, Context context, String str, C6732p c6732p) {
        return new C6733q(c6576e, interfaceC2661e, c6729m, c6722f, context, str, c6732p, this.f36943c);
    }

    protected C6716c(Context context, ScheduledExecutorService scheduledExecutorService, C6576e c6576e, InterfaceC2661e interfaceC2661e, C30805b c30805b, InterfaceC0662b interfaceC0662b, boolean z11) {
        this.f36941a = new HashMap();
        this.f36949i = new HashMap();
        this.f36942b = context;
        this.f36943c = scheduledExecutorService;
        this.f36944d = c6576e;
        this.f36945e = interfaceC2661e;
        this.f36946f = c30805b;
        this.f36947g = interfaceC0662b;
        this.f36948h = c6576e.m33614m().m33680c();
        a.m34338c(context);
        if (z11) {
            AbstractC22894m.m117601c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6716c.this.m34333f();
                }
            });
        }
    }
}
