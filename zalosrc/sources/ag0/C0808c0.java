package ag0;

import me0.C23055e5;
import mm0.AbstractC23350e;
import p609wh.C29027o0;
import p609wh.C29037t0;
import rh0.AbstractC25803k;

/* renamed from: ag0.c0 */
/* loaded from: classes.dex */
public class C0808c0 extends Thread {

    /* renamed from: q */
    private static C29027o0 f2790q;

    /* renamed from: r */
    private static volatile C0808c0 f2791r;

    /* renamed from: s */
    private static final Object f2792s = new Object();

    /* renamed from: p */
    private volatile boolean f2793p;

    private C0808c0() {
        super("Z:RequestWorker");
        this.f2793p = true;
        f2790q = new C29027o0();
        start();
    }

    /* renamed from: a */
    public static void m2045a() {
        if (f2791r != null) {
            Object obj = f2792s;
            synchronized (obj) {
                f2790q.m145023c();
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static void m2046b(C29037t0 c29037t0) {
        m2048d();
        if (f2791r != null) {
            Object obj = f2792s;
            synchronized (obj) {
                f2790q.m145021a(c29037t0);
                obj.notifyAll();
            }
            return;
        }
        if (c29037t0 != null) {
            c29037t0.mo51554n();
        }
    }

    /* renamed from: c */
    public static void m2047c(C29037t0 c29037t0) {
        m2048d();
        if (f2791r != null) {
            Object obj = f2792s;
            synchronized (obj) {
                f2790q.m145022b(c29037t0);
                obj.notifyAll();
            }
            return;
        }
        if (c29037t0 != null) {
            c29037t0.mo51554n();
        }
    }

    /* renamed from: d */
    public static synchronized void m2048d() {
        synchronized (C0808c0.class) {
            if (f2791r == null) {
                synchronized (C0808c0.class) {
                    try {
                        if (f2791r == null) {
                            f2791r = new C0808c0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2793p) {
            try {
                Object obj = f2792s;
                synchronized (obj) {
                    if (f2790q.m145026f()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("RequestBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f2793p) {
                break;
            }
            C29037t0 m145024d = f2790q.m145024d();
            if (m145024d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Process request ");
                sb2.append(m145024d.f103772o);
                Thread.sleep(m145024d.m110289C() * 2000);
                if (C23055e5.m118271f()) {
                    m145024d.mo110303Z();
                    AbstractC25803k.m132971k(1, 0, m145024d.f103772o, -1, null);
                } else {
                    m145024d.mo51554n();
                }
            }
            try {
                Thread.sleep(100L);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        f2791r = null;
    }
}
