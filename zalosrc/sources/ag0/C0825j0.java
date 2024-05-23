package ag0;

import mm0.AbstractC23350e;
import p716zh.InterfaceC31872c9;

/* renamed from: ag0.j0 */
/* loaded from: classes6.dex */
public class C0825j0 extends Thread {

    /* renamed from: q */
    public static final String f2897q = "j0";

    /* renamed from: r */
    private static C0805b0 f2898r;

    /* renamed from: s */
    private static volatile C0825j0 f2899s;

    /* renamed from: t */
    private static final Object f2900t = new Object();

    /* renamed from: p */
    private volatile boolean f2901p;

    private C0825j0() {
        super("Z:SaveItemWorker");
        this.f2901p = true;
        f2898r = new C0805b0();
        start();
    }

    /* renamed from: a */
    public static void m2156a(InterfaceC31872c9 interfaceC31872c9) {
        m2157b();
        if (f2899s != null) {
            Object obj = f2900t;
            synchronized (obj) {
                f2898r.m2037a(interfaceC31872c9);
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2157b() {
        synchronized (C0825j0.class) {
            if (f2899s == null) {
                synchronized (C0825j0.class) {
                    try {
                        if (f2899s == null) {
                            f2899s = new C0825j0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2901p) {
            try {
                synchronized (this) {
                    if (f2898r.m2039c()) {
                        try {
                            wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f(f2897q, e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f2901p) {
                break;
            }
            InterfaceC31872c9 m2038b = f2898r.m2038b();
            if (m2038b != null) {
                m2038b.mo153143a();
            }
            try {
                Thread.sleep(100L);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        f2899s = null;
    }
}
