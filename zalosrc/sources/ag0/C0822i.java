package ag0;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.LinkedList;
import java.util.List;
import pm0.C24848g0;
import qm0.AbstractC25378x;

/* renamed from: ag0.i */
/* loaded from: classes6.dex */
public final class C0822i extends Thread {

    /* renamed from: p */
    public static final C0822i f2887p = new C0822i();

    /* renamed from: q */
    private static final List f2888q = new LinkedList();

    /* renamed from: r */
    private static final Object f2889r = new Object();

    /* renamed from: s */
    private static boolean f2890s;

    private C0822i() {
        super("Z:DBSearchWorker");
    }

    /* renamed from: a */
    private final void m2147a() {
        try {
            Runnable m2148c = m2148c();
            if (m2148c != null) {
                m2148c.run();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    private final Runnable m2148c() {
        Object m131544F;
        Runnable runnable;
        synchronized (f2889r) {
            m131544F = AbstractC25378x.m131544F(f2888q);
            runnable = (Runnable) m131544F;
        }
        return runnable;
    }

    /* renamed from: d */
    private final void m2149d() {
        if (!f2890s) {
            synchronized (f2889r) {
                try {
                    if (!f2890s) {
                        f2890s = true;
                        f2887p.start();
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m2150b(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "task");
        m2149d();
        Object obj = f2889r;
        synchronized (obj) {
            try {
                List list = f2888q;
                if (!list.contains(runnable)) {
                    list.add(runnable);
                    obj.notifyAll();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            Object obj = f2889r;
            synchronized (obj) {
                if (f2888q.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m2147a();
        }
    }
}
