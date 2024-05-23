package ag0;

import me0.C23055e5;
import mm0.AbstractC23350e;
import p609wh.C29027o0;
import p609wh.C29037t0;
import p645xh.C29630g;
import rh0.AbstractC25803k;
import th.AbstractC26685f;

/* renamed from: ag0.v0 */
/* loaded from: classes6.dex */
public class C0849v0 extends Thread {

    /* renamed from: r */
    private static C29027o0 f3046r;

    /* renamed from: s */
    private static volatile C0849v0 f3047s;

    /* renamed from: t */
    private static final Object f3048t = new Object();

    /* renamed from: p */
    private long f3049p;

    /* renamed from: q */
    private volatile boolean f3050q;

    private C0849v0() {
        super("Z:UploadWorker");
        this.f3049p = 0L;
        this.f3050q = true;
        f3046r = new C29027o0();
        start();
    }

    /* renamed from: a */
    public static void m2318a() {
        m2320c();
        if (f3047s != null) {
            Object obj = f3048t;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static void m2319b(C29037t0 c29037t0) {
        if (c29037t0.f103775r == 4 && C29630g.m147299E0().m93374B()) {
            c29037t0.mo110303Z();
            return;
        }
        m2320c();
        if (f3047s != null) {
            Object obj = f3048t;
            synchronized (obj) {
                f3046r.m145021a(c29037t0);
                obj.notifyAll();
            }
            return;
        }
        c29037t0.mo51554n();
    }

    /* renamed from: c */
    public static synchronized void m2320c() {
        synchronized (C0849v0.class) {
            if (f3047s == null) {
                synchronized (C0849v0.class) {
                    try {
                        if (f3047s == null) {
                            f3047s = new C0849v0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f3050q) {
            try {
                Object obj = f3048t;
                synchronized (obj) {
                    if (f3046r.m145026f()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("UploadBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f3050q) {
                break;
            }
            C29037t0 m145024d = f3046r.m145024d();
            if (m145024d != null && m145024d.m110287A() != null && m145024d.m110287A().m93278a() != 2 && System.currentTimeMillis() - this.f3049p > 5000) {
                this.f3049p = System.currentTimeMillis();
                C29630g.m147299E0().m147319V0();
            }
            if (!C29630g.m147299E0().m93432x() && C23055e5.m118271f()) {
                try {
                    Object obj2 = f3048t;
                    synchronized (obj2) {
                        obj2.wait(AbstractC26685f.f126422c);
                    }
                } catch (Exception e13) {
                    AbstractC23350e.m122778h(e13);
                }
            }
            if (m145024d != null) {
                m145024d.mo110303Z();
                AbstractC25803k.m132971k(2, 2, String.valueOf((int) m145024d.m110287A().m93278a()), -1, null);
            }
            try {
                Thread.sleep(10L);
            } catch (Exception e14) {
                e14.printStackTrace();
            }
        }
        f3047s = null;
    }
}
