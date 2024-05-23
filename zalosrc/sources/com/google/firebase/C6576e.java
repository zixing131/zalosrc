package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.os.AbstractC1453s;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C4077a;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p005d.AbstractC0007b;
import p015a9.InterfaceC0662b;
import p052c8.C3339c;
import p052c8.C3344g;
import p052c8.C3352o;
import p052c8.C3358u;
import p095d8.EnumC17828m;
import p154f9.C18825a;
import p229i5.AbstractC20282c;
import p229i5.AbstractC20295p;
import p229i5.AbstractC20297r;
import p231i7.AbstractC20357a;
import p572v9.AbstractC27951c;
import p572v9.C27950b;
import p636x8.InterfaceC29473c;
import p665y0.C30239a;
import p673y8.C30818f;

/* renamed from: com.google.firebase.e */
/* loaded from: classes.dex */
public class C6576e {

    /* renamed from: k */
    private static final Object f36499k = new Object();

    /* renamed from: l */
    static final Map f36500l = new C30239a();

    /* renamed from: a */
    private final Context f36501a;

    /* renamed from: b */
    private final String f36502b;

    /* renamed from: c */
    private final C6591k f36503c;

    /* renamed from: d */
    private final C3352o f36504d;

    /* renamed from: g */
    private final C3358u f36507g;

    /* renamed from: h */
    private final InterfaceC0662b f36508h;

    /* renamed from: e */
    private final AtomicBoolean f36505e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f36506f = new AtomicBoolean();

    /* renamed from: i */
    private final List f36509i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List f36510j = new CopyOnWriteArrayList();

    /* renamed from: com.google.firebase.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo33592a(boolean z11);
    }

    /* renamed from: com.google.firebase.e$b */
    /* loaded from: classes.dex */
    public static class b implements ComponentCallbacks2C4077a.a {

        /* renamed from: a */
        private static AtomicReference f36511a = new AtomicReference();

        private b() {
        }

        /* renamed from: c */
        public static void m33619c(Context context) {
            if (AbstractC20295p.m105947a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f36511a.get() == null) {
                    b bVar = new b();
                    if (AbstractC20357a.m106108a(f36511a, null, bVar)) {
                        ComponentCallbacks2C4077a.m19299c(application);
                        ComponentCallbacks2C4077a.m19298b().m19301a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4077a.a
        /* renamed from: a */
        public void mo19304a(boolean z11) {
            synchronized (C6576e.f36499k) {
                try {
                    Iterator it = new ArrayList(C6576e.f36500l.values()).iterator();
                    while (it.hasNext()) {
                        C6576e c6576e = (C6576e) it.next();
                        if (c6576e.f36505e.get()) {
                            c6576e.m33609x(z11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.google.firebase.e$c */
    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference f36512b = new AtomicReference();

        /* renamed from: a */
        private final Context f36513a;

        public c(Context context) {
            this.f36513a = context;
        }

        /* renamed from: b */
        public static void m33621b(Context context) {
            if (f36512b.get() == null) {
                c cVar = new c(context);
                if (AbstractC0007b.m4a(f36512b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m33622c() {
            this.f36513a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C6576e.f36499k) {
                try {
                    Iterator it = C6576e.f36500l.values().iterator();
                    while (it.hasNext()) {
                        ((C6576e) it.next()).m33602o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m33622c();
        }
    }

    protected C6576e(Context context, String str, C6591k c6591k) {
        this.f36501a = (Context) AbstractC4205o.m19722k(context);
        this.f36502b = AbstractC4205o.m19718g(str);
        this.f36503c = (C6591k) AbstractC4205o.m19722k(c6591k);
        AbstractC6596l m34299b = FirebaseInitProvider.m34299b();
        AbstractC27951c.m140877b("Firebase");
        AbstractC27951c.m140877b("ComponentDiscovery");
        List m16866b = C3344g.m16863c(context, ComponentDiscoveryService.class).m16866b();
        AbstractC27951c.m140876a();
        AbstractC27951c.m140877b("Runtime");
        C3352o.b m16892g = C3352o.m16874m(EnumC17828m.INSTANCE).m16890d(m16866b).m16889c(new FirebaseCommonRegistrar()).m16889c(new ExecutorsRegistrar()).m16888b(C3339c.m16827s(context, Context.class, new Class[0])).m16888b(C3339c.m16827s(this, C6576e.class, new Class[0])).m16888b(C3339c.m16827s(c6591k, C6591k.class, new Class[0])).m16892g(new C27950b());
        if (AbstractC1453s.m7370a(context) && FirebaseInitProvider.m34300c()) {
            m16892g.m16888b(C3339c.m16827s(m34299b, AbstractC6596l.class, new Class[0]));
        }
        C3352o m16891e = m16892g.m16891e();
        this.f36504d = m16891e;
        AbstractC27951c.m140876a();
        this.f36507g = new C3358u(new InterfaceC0662b() { // from class: com.google.firebase.c

            /* renamed from: b */
            public final /* synthetic */ Context f36404b;

            public /* synthetic */ C6545c(Context context2) {
                r2 = context2;
            }

            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                C18825a m33606u;
                m33606u = C6576e.this.m33606u(r2);
                return m33606u;
            }
        });
        this.f36508h = m16891e.mo16850d(C30818f.class);
        m33610g(new a() { // from class: com.google.firebase.d
            public /* synthetic */ C6575d() {
            }

            @Override // com.google.firebase.C6576e.a
            /* renamed from: a */
            public final void mo33592a(boolean z11) {
                C6576e.this.m33607v(z11);
            }
        });
        AbstractC27951c.m140876a();
    }

    /* renamed from: h */
    private void m33600h() {
        AbstractC4205o.m19727p(!this.f36506f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public static C6576e m33601k() {
        C6576e c6576e;
        synchronized (f36499k) {
            try {
                c6576e = (C6576e) f36500l.get("[DEFAULT]");
                if (c6576e == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC20297r.m105960a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6576e;
    }

    /* renamed from: o */
    public void m33602o() {
        if (!AbstractC1453s.m7370a(this.f36501a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb2.append(m33613l());
            c.m33621b(this.f36501a);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Device unlocked: initializing all Firebase APIs for app ");
        sb3.append(m33613l());
        this.f36504d.m16885p(m33617t());
        ((C30818f) this.f36508h.get()).m149905l();
    }

    /* renamed from: p */
    public static C6576e m33603p(Context context) {
        synchronized (f36499k) {
            try {
                if (f36500l.containsKey("[DEFAULT]")) {
                    return m33601k();
                }
                C6591k m33678a = C6591k.m33678a(context);
                if (m33678a == null) {
                    return null;
                }
                return m33604q(context, m33678a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public static C6576e m33604q(Context context, C6591k c6591k) {
        return m33605r(context, c6591k, "[DEFAULT]");
    }

    /* renamed from: r */
    public static C6576e m33605r(Context context, C6591k c6591k, String str) {
        C6576e c6576e;
        b.m33619c(context);
        String m33608w = m33608w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f36499k) {
            Map map = f36500l;
            AbstractC4205o.m19727p(!map.containsKey(m33608w), "FirebaseApp name " + m33608w + " already exists!");
            AbstractC4205o.m19723l(context, "Application context cannot be null.");
            c6576e = new C6576e(context, m33608w, c6591k);
            map.put(m33608w, c6576e);
        }
        c6576e.m33602o();
        return c6576e;
    }

    /* renamed from: u */
    public /* synthetic */ C18825a m33606u(Context context) {
        return new C18825a(context, m33615n(), (InterfaceC29473c) this.f36504d.mo16847a(InterfaceC29473c.class));
    }

    /* renamed from: v */
    public /* synthetic */ void m33607v(boolean z11) {
        if (!z11) {
            ((C30818f) this.f36508h.get()).m149905l();
        }
    }

    /* renamed from: w */
    private static String m33608w(String str) {
        return str.trim();
    }

    /* renamed from: x */
    public void m33609x(boolean z11) {
        Iterator it = this.f36509i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo33592a(z11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6576e)) {
            return false;
        }
        return this.f36502b.equals(((C6576e) obj).m33613l());
    }

    /* renamed from: g */
    public void m33610g(a aVar) {
        m33600h();
        if (this.f36505e.get() && ComponentCallbacks2C4077a.m19298b().m19302d()) {
            aVar.mo33592a(true);
        }
        this.f36509i.add(aVar);
    }

    public int hashCode() {
        return this.f36502b.hashCode();
    }

    /* renamed from: i */
    public Object m33611i(Class cls) {
        m33600h();
        return this.f36504d.mo16847a(cls);
    }

    /* renamed from: j */
    public Context m33612j() {
        m33600h();
        return this.f36501a;
    }

    /* renamed from: l */
    public String m33613l() {
        m33600h();
        return this.f36502b;
    }

    /* renamed from: m */
    public C6591k m33614m() {
        m33600h();
        return this.f36503c;
    }

    /* renamed from: n */
    public String m33615n() {
        return AbstractC20282c.m105910c(m33613l().getBytes(Charset.defaultCharset())) + "+" + AbstractC20282c.m105910c(m33614m().m33680c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: s */
    public boolean m33616s() {
        m33600h();
        return ((C18825a) this.f36507g.get()).m98811b();
    }

    /* renamed from: t */
    public boolean m33617t() {
        return "[DEFAULT]".equals(m33613l());
    }

    public String toString() {
        return AbstractC4199m.m19703c(this).m19704a("name", this.f36502b).m19704a("options", this.f36503c).toString();
    }
}
