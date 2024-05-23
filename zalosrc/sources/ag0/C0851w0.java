package ag0;

import me0.C23055e5;
import mm0.AbstractC23350e;
import p609wh.C29027o0;
import p609wh.C29037t0;
import p645xh.C29632i;
import th.AbstractC26685f;

/* renamed from: ag0.w0 */
/* loaded from: classes6.dex */
public class C0851w0 extends Thread {

    /* renamed from: r */
    private static C29027o0 f3051r;

    /* renamed from: s */
    private static volatile C0851w0 f3052s;

    /* renamed from: t */
    private static final Object f3053t = new Object();

    /* renamed from: p */
    private long f3054p;

    /* renamed from: q */
    private volatile boolean f3055q;

    private C0851w0() {
        super("Z:UploadVideoWorker");
        this.f3054p = 0L;
        this.f3055q = true;
        f3051r = new C29027o0();
        start();
    }

    /* renamed from: a */
    public static void m2321a() {
        m2323c();
        if (f3052s != null) {
            Object obj = f3053t;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static void m2322b(C29037t0 c29037t0) {
        if (c29037t0.f103775r == 8 && C29632i.m147326E0().m93374B()) {
            c29037t0.mo110303Z();
            return;
        }
        m2323c();
        if (f3052s != null) {
            Object obj = f3053t;
            synchronized (obj) {
                f3051r.m145021a(c29037t0);
                obj.notifyAll();
            }
            return;
        }
        c29037t0.mo51554n();
    }

    /* renamed from: c */
    public static synchronized void m2323c() {
        synchronized (C0851w0.class) {
            if (f3052s == null) {
                synchronized (C0851w0.class) {
                    try {
                        if (f3052s == null) {
                            f3052s = new C0851w0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f3055q) {
            try {
                Object obj = f3053t;
                synchronized (obj) {
                    if (f3051r.m145026f()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("UploadVideoBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f3055q) {
                break;
            }
            C29037t0 m145024d = f3051r.m145024d();
            if (m145024d != null && m145024d.m110287A() != null && m145024d.m110287A().m93278a() != 2 && System.currentTimeMillis() - this.f3054p > 5000) {
                this.f3054p = System.currentTimeMillis();
                C29632i.m147326E0().m147346V0();
            }
            if (!C29632i.m147326E0().m93432x() && C23055e5.m118271f()) {
                try {
                    Object obj2 = f3053t;
                    synchronized (obj2) {
                        obj2.wait(AbstractC26685f.f126423d);
                    }
                } catch (Exception e13) {
                    AbstractC23350e.m122778h(e13);
                }
            }
            if (m145024d != null) {
                m145024d.mo110303Z();
            }
            try {
                Thread.sleep(10L);
            } catch (Exception e14) {
                e14.printStackTrace();
            }
        }
        f3052s = null;
    }
}
