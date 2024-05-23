package p565v2;

import androidx.work.AbstractC2253u;
import androidx.work.InterfaceC2141d0;
import java.util.HashMap;
import java.util.Map;
import p535u2.C26967n;

/* renamed from: v2.g0 */
/* loaded from: classes2.dex */
public class C27453g0 {

    /* renamed from: e */
    private static final String f129179e = AbstractC2253u.m11897i("WorkTimer");

    /* renamed from: a */
    final InterfaceC2141d0 f129180a;

    /* renamed from: b */
    final Map f129181b = new HashMap();

    /* renamed from: c */
    final Map f129182c = new HashMap();

    /* renamed from: d */
    final Object f129183d = new Object();

    /* renamed from: v2.g0$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo11623a(C26967n c26967n);
    }

    /* renamed from: v2.g0$b */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: p */
        private final C27453g0 f129184p;

        /* renamed from: q */
        private final C26967n f129185q;

        b(C27453g0 c27453g0, C26967n c26967n) {
            this.f129184p = c27453g0;
            this.f129185q = c26967n;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f129184p.f129183d) {
                try {
                    if (((b) this.f129184p.f129181b.remove(this.f129185q)) != null) {
                        a aVar = (a) this.f129184p.f129182c.remove(this.f129185q);
                        if (aVar != null) {
                            aVar.mo11623a(this.f129185q);
                        }
                    } else {
                        AbstractC2253u.m11895e().mo11898a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f129185q));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C27453g0(InterfaceC2141d0 interfaceC2141d0) {
        this.f129180a = interfaceC2141d0;
    }

    /* renamed from: a */
    public void m140491a(C26967n c26967n, long j11, a aVar) {
        synchronized (this.f129183d) {
            AbstractC2253u.m11895e().mo11898a(f129179e, "Starting timer for " + c26967n);
            m140492b(c26967n);
            b bVar = new b(this, c26967n);
            this.f129181b.put(c26967n, bVar);
            this.f129182c.put(c26967n, aVar);
            this.f129180a.mo11503b(j11, bVar);
        }
    }

    /* renamed from: b */
    public void m140492b(C26967n c26967n) {
        synchronized (this.f129183d) {
            try {
                if (((b) this.f129181b.remove(c26967n)) != null) {
                    AbstractC2253u.m11895e().mo11898a(f129179e, "Stopping timer for " + c26967n);
                    this.f129182c.remove(c26967n);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
