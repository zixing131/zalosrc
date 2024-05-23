package ag0;

import me0.C23055e5;
import mm0.AbstractC23350e;
import p609wh.C29027o0;
import p609wh.C29037t0;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import rh0.AbstractC25803k;
import th.AbstractC26685f;

/* renamed from: ag0.l0 */
/* loaded from: classes6.dex */
public class C0829l0 extends Thread {

    /* renamed from: q */
    private static C29027o0 f2914q;

    /* renamed from: r */
    private static volatile C0829l0 f2915r;

    /* renamed from: s */
    private static final Object f2916s = new Object();

    /* renamed from: p */
    private volatile boolean f2917p;

    private C0829l0() {
        super("Z:SocketSendWorker");
        this.f2917p = true;
        f2914q = new C29027o0();
        start();
    }

    /* renamed from: a */
    public static void m2172a() {
        if (f2915r != null) {
            Object obj = f2916s;
            synchronized (obj) {
                f2914q.m145023c();
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static void m2173b() {
        m2175d();
        if (f2915r != null) {
            Object obj = f2916s;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    /* renamed from: c */
    public static void m2174c(C29037t0 c29037t0) {
        if (c29037t0.f103775r == 2 && C29628e.m147249E0().m147267S0(c29037t0.m110287A().m93278a())) {
            c29037t0.mo110303Z();
            return;
        }
        m2175d();
        if (f2915r != null) {
            Object obj = f2916s;
            synchronized (obj) {
                f2914q.m145021a(c29037t0);
                obj.notifyAll();
            }
            return;
        }
        c29037t0.mo51554n();
    }

    /* renamed from: d */
    public static synchronized void m2175d() {
        synchronized (C0829l0.class) {
            if (f2915r == null) {
                synchronized (C0829l0.class) {
                    try {
                        if (f2915r == null) {
                            f2915r = new C0829l0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C29037t0 m145024d;
        while (this.f2917p) {
            try {
                Object obj = f2916s;
                synchronized (obj) {
                    if (f2914q.m145026f()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("SocketSendBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f2917p) {
                break;
            }
            C29037t0 m145025e = f2914q.m145025e(0);
            if (m145025e != null && !m145025e.m110298O()) {
                C29037t0 m145024d2 = f2914q.m145024d();
                if (m145024d2 != null) {
                    m145024d2.mo110303Z();
                    AbstractC25803k.m132971k(2, 2, String.valueOf((int) m145024d2.m110287A().m93278a()), -1, null);
                }
            } else if (m145025e == null) {
                f2914q.m145024d();
            } else {
                long j11 = 0;
                if (C23055e5.m118271f() && !C29628e.m147249E0().m93432x()) {
                    if (!C29628e.m147249E0().m93433y()) {
                        AbstractC29633j.m147365n();
                        j11 = AbstractC26685f.f126421b;
                    }
                    long j12 = j11 + AbstractC26685f.f126420a;
                    try {
                        Object obj2 = f2916s;
                        synchronized (obj2) {
                            obj2.wait(j12);
                        }
                    } catch (Exception e13) {
                        AbstractC23350e.m122778h(e13);
                    }
                } else if (C23055e5.m118271f() && C29628e.m147249E0().m93432x() && (m145024d = f2914q.m145024d()) != null) {
                    if (m145024d.m110291F() > 0) {
                        Thread.sleep(m145024d.m110291F());
                    }
                    m145024d.mo110303Z();
                }
            }
            try {
                Thread.sleep(100L);
            } catch (Exception e14) {
                e14.printStackTrace();
            }
        }
        f2915r = null;
    }
}
