package p008a2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;
import pm0.C24848g0;

/* renamed from: a2.c */
/* loaded from: classes2.dex */
public final class C0059c {

    /* renamed from: m */
    public static final a f207m = new a(null);

    /* renamed from: a */
    public InterfaceC18183h f208a;

    /* renamed from: b */
    private final Handler f209b;

    /* renamed from: c */
    private Runnable f210c;

    /* renamed from: d */
    private final Object f211d;

    /* renamed from: e */
    private long f212e;

    /* renamed from: f */
    private final Executor f213f;

    /* renamed from: g */
    private int f214g;

    /* renamed from: h */
    private long f215h;

    /* renamed from: i */
    private InterfaceC18182g f216i;

    /* renamed from: j */
    private boolean f217j;

    /* renamed from: k */
    private final Runnable f218k;

    /* renamed from: l */
    private final Runnable f219l;

    /* renamed from: a2.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C0059c(long j11, TimeUnit timeUnit, Executor executor) {
        AbstractC19074t.m100208f(timeUnit, "autoCloseTimeUnit");
        AbstractC19074t.m100208f(executor, "autoCloseExecutor");
        this.f209b = new Handler(Looper.getMainLooper());
        this.f211d = new Object();
        this.f212e = timeUnit.toMillis(j11);
        this.f213f = executor;
        this.f215h = SystemClock.uptimeMillis();
        this.f218k = new Runnable() { // from class: a2.a
            @Override // java.lang.Runnable
            public final void run() {
                C0059c.m166f(C0059c.this);
            }
        };
        this.f219l = new Runnable() { // from class: a2.b
            @Override // java.lang.Runnable
            public final void run() {
                C0059c.m165c(C0059c.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m165c(C0059c c0059c) {
        C24848g0 c24848g0;
        AbstractC19074t.m100208f(c0059c, "this$0");
        synchronized (c0059c.f211d) {
            try {
                if (SystemClock.uptimeMillis() - c0059c.f215h < c0059c.f212e) {
                    return;
                }
                if (c0059c.f214g != 0) {
                    return;
                }
                Runnable runnable = c0059c.f210c;
                if (runnable != null) {
                    runnable.run();
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 != null) {
                    InterfaceC18182g interfaceC18182g = c0059c.f216i;
                    if (interfaceC18182g != null && interfaceC18182g.isOpen()) {
                        interfaceC18182g.close();
                    }
                    c0059c.f216i = null;
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    return;
                }
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m166f(C0059c c0059c) {
        AbstractC19074t.m100208f(c0059c, "this$0");
        c0059c.f213f.execute(c0059c.f219l);
    }

    /* renamed from: d */
    public final void m167d() {
        synchronized (this.f211d) {
            try {
                this.f217j = true;
                InterfaceC18182g interfaceC18182g = this.f216i;
                if (interfaceC18182g != null) {
                    interfaceC18182g.close();
                }
                this.f216i = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m168e() {
        synchronized (this.f211d) {
            try {
                int i11 = this.f214g;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.f214g = i12;
                    if (i12 == 0) {
                        if (this.f216i == null) {
                            return;
                        } else {
                            this.f209b.postDelayed(this.f218k, this.f212e);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final Object m169g(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "block");
        try {
            return interfaceC18505l.mo205i9(m172j());
        } finally {
            m168e();
        }
    }

    /* renamed from: h */
    public final InterfaceC18182g m170h() {
        return this.f216i;
    }

    /* renamed from: i */
    public final InterfaceC18183h m171i() {
        InterfaceC18183h interfaceC18183h = this.f208a;
        if (interfaceC18183h != null) {
            return interfaceC18183h;
        }
        AbstractC19074t.m100223u("delegateOpenHelper");
        return null;
    }

    /* renamed from: j */
    public final InterfaceC18182g m172j() {
        synchronized (this.f211d) {
            this.f209b.removeCallbacks(this.f218k);
            this.f214g++;
            if (!this.f217j) {
                InterfaceC18182g interfaceC18182g = this.f216i;
                if (interfaceC18182g != null && interfaceC18182g.isOpen()) {
                    return interfaceC18182g;
                }
                InterfaceC18182g mo187p0 = m171i().mo187p0();
                this.f216i = mo187p0;
                return mo187p0;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    /* renamed from: k */
    public final void m173k(InterfaceC18183h interfaceC18183h) {
        AbstractC19074t.m100208f(interfaceC18183h, "delegateOpenHelper");
        m176n(interfaceC18183h);
    }

    /* renamed from: l */
    public final boolean m174l() {
        return !this.f217j;
    }

    /* renamed from: m */
    public final void m175m(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "onAutoClose");
        this.f210c = runnable;
    }

    /* renamed from: n */
    public final void m176n(InterfaceC18183h interfaceC18183h) {
        AbstractC19074t.m100208f(interfaceC18183h, "<set-?>");
        this.f208a = interfaceC18183h;
    }
}
