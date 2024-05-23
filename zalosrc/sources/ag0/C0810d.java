package ag0;

import am.AbstractC0939u;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: ag0.d */
/* loaded from: classes6.dex */
public class C0810d extends Thread {

    /* renamed from: q */
    private static final String f2798q = "d";

    /* renamed from: r */
    private static final List f2799r = new ArrayList();

    /* renamed from: s */
    private static C0810d f2800s = null;

    /* renamed from: t */
    private static final Object f2801t = new Object();

    /* renamed from: p */
    private volatile boolean f2802p;

    private C0810d() {
        super("Z:ChatSupportWorker");
        this.f2802p = true;
        if (f2800s == null) {
            f2800s = this;
            start();
        }
    }

    /* renamed from: a */
    private void m2052a() {
        AbstractC0939u abstractC0939u;
        try {
            synchronized (f2801t) {
                try {
                    List list = f2799r;
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
            AbstractC23350e.m122776f(f2798q, e11);
        }
    }

    /* renamed from: b */
    public static void m2053b(AbstractC0939u abstractC0939u) {
        m2054c();
        if (f2800s != null) {
            Object obj = f2801t;
            synchronized (obj) {
                try {
                    if (abstractC0939u.mo4459b()) {
                        f2799r.add(0, abstractC0939u);
                    } else {
                        f2799r.add(abstractC0939u);
                    }
                    obj.notifyAll();
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m2054c() {
        synchronized (C0810d.class) {
            if (f2800s == null) {
                synchronized (C0810d.class) {
                    try {
                        if (f2800s == null) {
                            f2800s = new C0810d();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2802p) {
            Object obj = f2801t;
            synchronized (obj) {
                if (f2799r.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f2798q, e11);
                    }
                }
            }
            if (!this.f2802p) {
                break;
            } else {
                m2052a();
            }
        }
        f2800s = null;
    }
}
