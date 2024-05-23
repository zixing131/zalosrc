package ag0;

import am.AbstractC0939u;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: ag0.j */
/* loaded from: classes.dex */
public class C0824j extends Thread {

    /* renamed from: q */
    private static final List f2893q = new ArrayList();

    /* renamed from: r */
    private static final Object f2894r = new Object();

    /* renamed from: s */
    private static volatile C0824j f2895s = null;

    /* renamed from: p */
    private volatile boolean f2896p;

    private C0824j() {
        super("Z:DatabaseWorker");
        this.f2896p = true;
        if (f2895s == null) {
            f2895s = this;
            start();
        }
    }

    /* renamed from: a */
    private void m2152a() {
        AbstractC0939u abstractC0939u;
        try {
            synchronized (f2894r) {
                abstractC0939u = (AbstractC0939u) f2893q.remove(0);
            }
            if (abstractC0939u != null) {
                abstractC0939u.mo928a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m2153b(AbstractC0939u abstractC0939u) {
        m2155d();
        if (f2895s != null) {
            Object obj = f2894r;
            synchronized (obj) {
                try {
                    if (abstractC0939u.mo4459b()) {
                        f2893q.add(0, abstractC0939u);
                    } else {
                        f2893q.add(abstractC0939u);
                    }
                    obj.notifyAll();
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public static int m2154c() {
        int size;
        if (f2895s == null) {
            return 0;
        }
        synchronized (f2894r) {
            size = f2893q.size();
        }
        return size;
    }

    /* renamed from: d */
    public static synchronized void m2155d() {
        synchronized (C0824j.class) {
            if (f2895s == null) {
                synchronized (C0824j.class) {
                    try {
                        if (f2895s == null) {
                            f2895s = new C0824j();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2896p) {
            Object obj = f2894r;
            synchronized (obj) {
                if (f2893q.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("DatabaseBackgroundWorker", e11);
                    }
                }
            }
            if (!this.f2896p) {
                break;
            } else {
                m2152a();
            }
        }
        f2895s = null;
    }
}
