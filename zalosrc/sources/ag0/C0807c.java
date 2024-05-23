package ag0;

import am.AbstractC0939u;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: ag0.c */
/* loaded from: classes6.dex */
public class C0807c extends Thread {

    /* renamed from: q */
    private static final String f2785q = "c";

    /* renamed from: r */
    private static final List f2786r = new ArrayList();

    /* renamed from: s */
    private static C0807c f2787s = null;

    /* renamed from: t */
    private static final Object f2788t = new Object();

    /* renamed from: p */
    private volatile boolean f2789p;

    private C0807c() {
        super("Z:BindChatRowWorker");
        this.f2789p = true;
        if (f2787s == null) {
            f2787s = this;
            start();
        }
    }

    /* renamed from: a */
    private void m2041a() {
        AbstractC0939u abstractC0939u;
        try {
            synchronized (f2788t) {
                abstractC0939u = (AbstractC0939u) f2786r.remove(0);
            }
            if (abstractC0939u != null) {
                abstractC0939u.mo928a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m2042b(AbstractC0939u abstractC0939u) {
        m2044d();
        if (f2787s != null) {
            Object obj = f2788t;
            synchronized (obj) {
                try {
                    if (abstractC0939u.mo4459b()) {
                        f2786r.add(0, abstractC0939u);
                    } else {
                        f2786r.add(abstractC0939u);
                    }
                    obj.notifyAll();
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public static void m2043c(AbstractC0939u abstractC0939u) {
        m2044d();
        if (f2787s != null) {
            Object obj = f2788t;
            synchronized (obj) {
                try {
                    List list = f2786r;
                    if (!list.contains(abstractC0939u)) {
                        if (abstractC0939u.mo4459b()) {
                            list.add(0, abstractC0939u);
                        } else {
                            list.add(abstractC0939u);
                        }
                        obj.notifyAll();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: d */
    public static synchronized void m2044d() {
        synchronized (C0807c.class) {
            if (f2787s == null) {
                synchronized (C0807c.class) {
                    try {
                        if (f2787s == null) {
                            f2787s = new C0807c();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2789p) {
            Object obj = f2788t;
            synchronized (obj) {
                if (f2786r.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f2785q, e11);
                    }
                }
            }
            if (!this.f2789p) {
                break;
            } else {
                m2041a();
            }
        }
        f2787s = null;
    }
}
