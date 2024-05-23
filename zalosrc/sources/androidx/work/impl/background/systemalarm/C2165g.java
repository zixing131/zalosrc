package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.AbstractC2253u;
import androidx.work.impl.C2157b0;
import androidx.work.impl.C2217p0;
import androidx.work.impl.C2221r0;
import androidx.work.impl.C2226u;
import androidx.work.impl.InterfaceC2189f;
import androidx.work.impl.InterfaceC2215o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p535u2.C26967n;
import p565v2.AbstractC27441a0;
import p565v2.C27453g0;
import p595w2.InterfaceC28696c;
import p595w2.InterfaceExecutorC28694a;

/* renamed from: androidx.work.impl.background.systemalarm.g */
/* loaded from: classes2.dex */
public class C2165g implements InterfaceC2189f {

    /* renamed from: A */
    static final String f9199A = AbstractC2253u.m11897i("SystemAlarmDispatcher");

    /* renamed from: p */
    final Context f9200p;

    /* renamed from: q */
    final InterfaceC28696c f9201q;

    /* renamed from: r */
    private final C27453g0 f9202r;

    /* renamed from: s */
    private final C2226u f9203s;

    /* renamed from: t */
    private final C2221r0 f9204t;

    /* renamed from: u */
    final C2160b f9205u;

    /* renamed from: v */
    final List f9206v;

    /* renamed from: w */
    Intent f9207w;

    /* renamed from: x */
    private c f9208x;

    /* renamed from: y */
    private C2157b0 f9209y;

    /* renamed from: z */
    private final InterfaceC2215o0 f9210z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor mo143749a;
            d dVar;
            synchronized (C2165g.this.f9206v) {
                C2165g c2165g = C2165g.this;
                c2165g.f9207w = (Intent) c2165g.f9206v.get(0);
            }
            Intent intent = C2165g.this.f9207w;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C2165g.this.f9207w.getIntExtra("KEY_START_ID", 0);
                AbstractC2253u m11895e = AbstractC2253u.m11895e();
                String str = C2165g.f9199A;
                m11895e.mo11898a(str, "Processing command " + C2165g.this.f9207w + ", " + intExtra);
                PowerManager.WakeLock m140465b = AbstractC27441a0.m140465b(C2165g.this.f9200p, action + " (" + intExtra + ")");
                try {
                    AbstractC2253u.m11895e().mo11898a(str, "Acquiring operation wake lock (" + action + ") " + m140465b);
                    m140465b.acquire();
                    C2165g c2165g2 = C2165g.this;
                    c2165g2.f9205u.m11616q(c2165g2.f9207w, intExtra, c2165g2);
                    AbstractC2253u.m11895e().mo11898a(str, "Releasing operation wake lock (" + action + ") " + m140465b);
                    m140465b.release();
                    mo143749a = C2165g.this.f9201q.mo143749a();
                    dVar = new d(C2165g.this);
                } catch (Throwable th2) {
                    try {
                        AbstractC2253u m11895e2 = AbstractC2253u.m11895e();
                        String str2 = C2165g.f9199A;
                        m11895e2.mo11901d(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC2253u.m11895e().mo11898a(str2, "Releasing operation wake lock (" + action + ") " + m140465b);
                        m140465b.release();
                        mo143749a = C2165g.this.f9201q.mo143749a();
                        dVar = new d(C2165g.this);
                    } catch (Throwable th3) {
                        AbstractC2253u.m11895e().mo11898a(C2165g.f9199A, "Releasing operation wake lock (" + action + ") " + m140465b);
                        m140465b.release();
                        C2165g.this.f9201q.mo143749a().execute(new d(C2165g.this));
                        throw th3;
                    }
                }
                mo143749a.execute(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: p */
        private final C2165g f9212p;

        /* renamed from: q */
        private final Intent f9213q;

        /* renamed from: r */
        private final int f9214r;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C2165g c2165g, Intent intent, int i11) {
            this.f9212p = c2165g;
            this.f9213q = intent;
            this.f9214r = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9212p.m11630a(this.f9213q, this.f9214r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: b */
        void mo11592b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$d */
    /* loaded from: classes2.dex */
    static class d implements Runnable {

        /* renamed from: p */
        private final C2165g f9215p;

        d(C2165g c2165g) {
            this.f9215p = c2165g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9215p.m11631c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2165g(Context context) {
        this(context, null, null, null);
    }

    /* renamed from: b */
    private void m11627b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: j */
    private boolean m11628j(String str) {
        m11627b();
        synchronized (this.f9206v) {
            try {
                Iterator it = this.f9206v.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    private void m11629l() {
        m11627b();
        PowerManager.WakeLock m140465b = AbstractC27441a0.m140465b(this.f9200p, "ProcessCommand");
        try {
            m140465b.acquire();
            this.f9204t.m11741x().mo143752d(new a());
        } finally {
            m140465b.release();
        }
    }

    /* renamed from: a */
    public boolean m11630a(Intent intent, int i11) {
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        String str = f9199A;
        m11895e.mo11898a(str, "Adding command " + intent + " (" + i11 + ")");
        m11627b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC2253u.m11895e().mo11905k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m11628j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i11);
        synchronized (this.f9206v) {
            try {
                boolean z11 = !this.f9206v.isEmpty();
                this.f9206v.add(intent);
                if (!z11) {
                    m11629l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    /* renamed from: c */
    void m11631c() {
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        String str = f9199A;
        m11895e.mo11898a(str, "Checking if commands are complete.");
        m11627b();
        synchronized (this.f9206v) {
            try {
                if (this.f9207w != null) {
                    AbstractC2253u.m11895e().mo11898a(str, "Removing command " + this.f9207w);
                    if (((Intent) this.f9206v.remove(0)).equals(this.f9207w)) {
                        this.f9207w = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                InterfaceExecutorC28694a mo143751c = this.f9201q.mo143751c();
                if (!this.f9205u.m11615p() && this.f9206v.isEmpty() && !mo143751c.mo140524o0()) {
                    AbstractC2253u.m11895e().mo11898a(str, "No more commands & intents.");
                    c cVar = this.f9208x;
                    if (cVar != null) {
                        cVar.mo11592b();
                    }
                } else if (!this.f9206v.isEmpty()) {
                    m11629l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C2226u m11632d() {
        return this.f9203s;
    }

    @Override // androidx.work.impl.InterfaceC2189f
    /* renamed from: e */
    public void mo11614e(C26967n c26967n, boolean z11) {
        this.f9201q.mo143749a().execute(new b(this, C2160b.m11600c(this.f9200p, c26967n, z11), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public InterfaceC28696c m11633f() {
        return this.f9201q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C2221r0 m11634g() {
        return this.f9204t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C27453g0 m11635h() {
        return this.f9202r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public InterfaceC2215o0 m11636i() {
        return this.f9210z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m11637k() {
        AbstractC2253u.m11895e().mo11898a(f9199A, "Destroying SystemAlarmDispatcher");
        this.f9203s.m11768p(this);
        this.f9208x = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m11638m(c cVar) {
        if (this.f9208x != null) {
            AbstractC2253u.m11895e().mo11900c(f9199A, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f9208x = cVar;
        }
    }

    C2165g(Context context, C2226u c2226u, C2221r0 c2221r0, InterfaceC2215o0 interfaceC2215o0) {
        Context applicationContext = context.getApplicationContext();
        this.f9200p = applicationContext;
        this.f9209y = new C2157b0();
        c2221r0 = c2221r0 == null ? C2221r0.m11729r(context) : c2221r0;
        this.f9204t = c2221r0;
        this.f9205u = new C2160b(applicationContext, c2221r0.m11735p().m11470a(), this.f9209y);
        this.f9202r = new C27453g0(c2221r0.m11735p().m11480k());
        c2226u = c2226u == null ? c2221r0.m11737t() : c2226u;
        this.f9203s = c2226u;
        InterfaceC28696c m11741x = c2221r0.m11741x();
        this.f9201q = m11741x;
        this.f9210z = interfaceC2215o0 == null ? new C2217p0(c2226u, m11741x) : interfaceC2215o0;
        c2226u.m11764e(this);
        this.f9206v = new ArrayList();
        this.f9207w = null;
    }
}
