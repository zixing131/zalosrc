package ag0;

import am.AbstractC0939u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ag0.x0 */
/* loaded from: classes6.dex */
public class C0853x0 extends Thread {

    /* renamed from: q */
    private static final List f3101q = new ArrayList();

    /* renamed from: r */
    private static C0853x0 f3102r = null;

    /* renamed from: s */
    private static final Object f3103s = new Object();

    /* renamed from: p */
    private volatile boolean f3104p;

    private C0853x0() {
        super("Z:ViewFullPreparingBGWorker");
        this.f3104p = true;
        if (f3102r == null) {
            f3102r = this;
            start();
        }
    }

    /* renamed from: a */
    private void m2380a() {
        AbstractC0939u abstractC0939u;
        try {
            synchronized (f3103s) {
                try {
                    List list = f3101q;
                    if (!list.isEmpty()) {
                        abstractC0939u = (AbstractC0939u) list.remove(0);
                    } else {
                        abstractC0939u = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (abstractC0939u != null) {
                abstractC0939u.mo928a();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public static void m2381b(AbstractC0939u abstractC0939u) {
        m2382c();
        if (f3102r != null) {
            Object obj = f3103s;
            synchronized (obj) {
                try {
                    if (abstractC0939u.mo4459b()) {
                        f3101q.add(0, abstractC0939u);
                    } else {
                        f3101q.add(abstractC0939u);
                    }
                    obj.notifyAll();
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m2382c() {
        synchronized (C0853x0.class) {
            if (f3102r == null) {
                synchronized (C0853x0.class) {
                    try {
                        if (f3102r == null) {
                            f3102r = new C0853x0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f3104p) {
            Object obj = f3103s;
            synchronized (obj) {
                if (f3101q.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
            if (!this.f3104p) {
                break;
            } else {
                m2380a();
            }
        }
        f3102r = null;
    }
}
