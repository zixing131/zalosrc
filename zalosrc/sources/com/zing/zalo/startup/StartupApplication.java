package com.zing.zalo.startup;

import ag0.AbstractC0837p0;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes.dex */
public abstract class StartupApplication extends Application {
    public static final C10901a Companion = new C10901a(null);

    /* renamed from: y */
    private static StartupApplication f55023y;

    /* renamed from: p */
    private EnumC10903c f55024p = EnumC10903c.NONE;

    /* renamed from: q */
    private final InterfaceC24854k f55025q;

    /* renamed from: r */
    private final Handler f55026r;

    /* renamed from: s */
    private boolean f55027s;

    /* renamed from: t */
    private final ArrayList f55028t;

    /* renamed from: u */
    private final ArrayList f55029u;

    /* renamed from: v */
    private boolean f55030v;

    /* renamed from: w */
    private boolean f55031w;

    /* renamed from: x */
    private final ArrayList f55032x;

    /* renamed from: com.zing.zalo.startup.StartupApplication$a */
    /* loaded from: classes.dex */
    public static final class C10901a {
        private C10901a() {
        }

        public /* synthetic */ C10901a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final StartupApplication m56558a() {
            if (StartupApplication.f55023y != null) {
                StartupApplication startupApplication = StartupApplication.f55023y;
                AbstractC19074t.m100205c(startupApplication);
                return startupApplication;
            }
            throw new IllegalStateException("Application haven't initialized");
        }
    }

    /* renamed from: com.zing.zalo.startup.StartupApplication$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10902b {
        /* renamed from: a */
        void mo12585a();
    }

    /* renamed from: com.zing.zalo.startup.StartupApplication$c */
    /* loaded from: classes.dex */
    public enum EnumC10903c {
        NONE(0),
        STARTED(1),
        PROCESS_INIT(2),
        PROCESS_INITIALIZED(3),
        OPEN_UI_INITIALIZED(4);


        /* renamed from: p */
        private final int f55039p;

        EnumC10903c(int i11) {
            this.f55039p = i11;
        }
    }

    /* renamed from: com.zing.zalo.startup.StartupApplication$d */
    /* loaded from: classes5.dex */
    public static final class C10904d implements InterfaceC10902b {

        /* renamed from: q */
        final /* synthetic */ InterfaceC10902b f55041q;

        /* renamed from: com.zing.zalo.startup.StartupApplication$d$a */
        /* loaded from: classes5.dex */
        static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C10904d c10904d = C10904d.this;
                StartupApplication.this.m56553l(c10904d.f55041q);
            }
        }

        C10904d(InterfaceC10902b interfaceC10902b) {
            this.f55041q = interfaceC10902b;
        }

        @Override // com.zing.zalo.startup.StartupApplication.InterfaceC10902b
        /* renamed from: a */
        public final void mo12585a() {
            StartupApplication.this.f55026r.post(new a());
        }
    }

    /* renamed from: com.zing.zalo.startup.StartupApplication$e */
    /* loaded from: classes.dex */
    public static final class RunnableC10905e implements Runnable {

        /* renamed from: com.zing.zalo.startup.StartupApplication$e$a */
        /* loaded from: classes.dex */
        static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StartupApplication.this.f55030v = true;
                StartupApplication.this.f55031w = false;
                StartupApplication.this.m56552n().getLooper().quitSafely();
                Iterator it = StartupApplication.this.f55032x.iterator();
                while (it.hasNext()) {
                    ((InterfaceC10902b) it.next()).mo12585a();
                }
                StartupApplication.this.f55032x.clear();
            }
        }

        RunnableC10905e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StartupApplication.this.mo35493r();
            StartupApplication.this.f55026r.post(new a());
        }
    }

    /* renamed from: com.zing.zalo.startup.StartupApplication$f */
    /* loaded from: classes.dex */
    public static final class RunnableC10906f implements Runnable {
        RunnableC10906f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StartupApplication.this.mo35495u();
        }
    }

    /* renamed from: com.zing.zalo.startup.StartupApplication$g */
    /* loaded from: classes.dex */
    public static final class RunnableC10907g implements Runnable {
        RunnableC10907g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StartupApplication.this.mo35497x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.startup.StartupApplication$h */
    /* loaded from: classes.dex */
    public static final class C10908h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10908h f55047q = new C10908h();

        C10908h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Handler mo12V4() {
            HandlerThread handlerThread = new HandlerThread("startup-initializer");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    public StartupApplication() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C10908h.f55047q);
        this.f55025q = m129210a;
        this.f55026r = new Handler(Looper.getMainLooper());
        this.f55028t = new ArrayList(0);
        this.f55029u = new ArrayList(0);
        this.f55032x = new ArrayList(0);
    }

    /* renamed from: n */
    public final Handler m56552n() {
        return (Handler) this.f55025q.getValue();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f55023y = this;
        this.f55024p = EnumC10903c.STARTED;
    }

    /* renamed from: l */
    public final void m56553l(InterfaceC10902b interfaceC10902b) {
        if (this.f55024p.compareTo(EnumC10903c.OPEN_UI_INITIALIZED) < 0) {
            m56554m(new C10904d(interfaceC10902b));
            return;
        }
        if (this.f55030v) {
            if (interfaceC10902b != null) {
                interfaceC10902b.mo12585a();
            }
        } else {
            if (interfaceC10902b != null) {
                this.f55032x.add(interfaceC10902b);
            }
            if (this.f55031w) {
                return;
            }
            this.f55031w = true;
            m56552n().post(new RunnableC10905e());
        }
    }

    /* renamed from: m */
    public final void m56554m(InterfaceC10902b interfaceC10902b) {
        EnumC10903c enumC10903c = this.f55024p;
        EnumC10903c enumC10903c2 = EnumC10903c.OPEN_UI_INITIALIZED;
        if (enumC10903c.compareTo(enumC10903c2) >= 0) {
            if (interfaceC10902b != null) {
                interfaceC10902b.mo12585a();
                return;
            }
            return;
        }
        if (interfaceC10902b != null) {
            this.f55028t.add(interfaceC10902b);
        }
        if (this.f55027s) {
            return;
        }
        this.f55027s = true;
        mo35494s();
        if (this.f55024p.compareTo(enumC10903c2) < 0) {
            this.f55024p = enumC10903c2;
        }
        this.f55027s = false;
        AbstractC0837p0.Companion.m2236a().mo2040a(new RunnableC10906f());
        Iterator it = this.f55028t.iterator();
        while (it.hasNext()) {
            ((InterfaceC10902b) it.next()).mo12585a();
        }
        this.f55028t.clear();
    }

    /* renamed from: o */
    public final boolean m56555o() {
        if (this.f55024p.compareTo(EnumC10903c.OPEN_UI_INITIALIZED) >= 0) {
            return true;
        }
        return false;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        AbstractC20110a.m104535d("onCreate", new Object[0]);
        this.f55024p = EnumC10903c.PROCESS_INIT;
        mo35496w();
        EnumC10903c enumC10903c = this.f55024p;
        EnumC10903c enumC10903c2 = EnumC10903c.PROCESS_INITIALIZED;
        if (enumC10903c.compareTo(enumC10903c2) < 0) {
            this.f55024p = enumC10903c2;
        }
        Iterator it = this.f55029u.iterator();
        while (it.hasNext()) {
            ((InterfaceC10902b) it.next()).mo12585a();
        }
        this.f55029u.clear();
        AbstractC0837p0.Companion.m2236a().mo2040a(new RunnableC10907g());
    }

    /* renamed from: p */
    public final boolean m56556p() {
        if (this.f55024p.compareTo(EnumC10903c.PROCESS_INITIALIZED) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public abstract void mo35493r();

    /* renamed from: s */
    public abstract void mo35494s();

    /* renamed from: u */
    public abstract void mo35495u();

    /* renamed from: w */
    public abstract void mo35496w();

    /* renamed from: x */
    public abstract void mo35497x();

    /* renamed from: y */
    public final void m56557y(InterfaceC10902b interfaceC10902b) {
        AbstractC19074t.m100208f(interfaceC10902b, "callbacks");
        if (this.f55024p.compareTo(EnumC10903c.OPEN_UI_INITIALIZED) >= 0) {
            interfaceC10902b.mo12585a();
        } else {
            this.f55029u.add(interfaceC10902b);
        }
    }
}
