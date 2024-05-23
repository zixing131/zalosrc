package ag0;

import am.AbstractC0939u;
import com.zing.zalo.MainApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p348mi.AbstractC23304d;
import p420pb.C24709a;

/* renamed from: ag0.c1 */
/* loaded from: classes6.dex */
public class C0809c1 extends Thread {

    /* renamed from: q */
    private static final List f2794q = new ArrayList();

    /* renamed from: r */
    private static final Object f2795r = new Object();

    /* renamed from: s */
    private static volatile C0809c1 f2796s = null;

    /* renamed from: p */
    private volatile boolean f2797p;

    /* renamed from: ag0.c1$a */
    /* loaded from: classes6.dex */
    public class a extends AbstractC0939u {
        a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128315s(0, 0);
        }
    }

    private C0809c1() {
        super("Z:ZaloTrackingBGWorker");
        this.f2797p = true;
        if (f2796s == null) {
            f2796s = this;
            start();
        }
    }

    /* renamed from: a */
    private void m2049a() {
        AbstractC0939u abstractC0939u;
        try {
            synchronized (f2795r) {
                abstractC0939u = (AbstractC0939u) f2794q.remove(0);
            }
            if (abstractC0939u != null) {
                abstractC0939u.mo928a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m2050b(AbstractC0939u abstractC0939u) {
        m2051c();
        if (f2796s != null) {
            Object obj = f2795r;
            synchronized (obj) {
                try {
                    AtomicBoolean atomicBoolean = AbstractC23304d.f113256A2;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        f2794q.add(new a());
                    }
                    if (abstractC0939u.mo4459b()) {
                        f2794q.add(0, abstractC0939u);
                    } else {
                        f2794q.add(abstractC0939u);
                    }
                    obj.notifyAll();
                } finally {
                }
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m2051c() {
        synchronized (C0809c1.class) {
            if (f2796s == null) {
                synchronized (C0809c1.class) {
                    try {
                        if (f2796s == null) {
                            f2796s = new C0809c1();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2797p) {
            Object obj = f2795r;
            synchronized (obj) {
                if (f2794q.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
            if (!this.f2797p) {
                break;
            } else {
                m2049a();
            }
        }
        f2796s = null;
    }
}
