package ag0;

import be.C2774c;
import fg0.ThreadFactoryC18928a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mm0.AbstractC23350e;
import p609wh.C29031q0;
import p645xh.C29630g;

/* renamed from: ag0.f */
/* loaded from: classes6.dex */
public class C0816f extends Thread {

    /* renamed from: r */
    private static C29031q0 f2856r;

    /* renamed from: s */
    private static volatile C0816f f2857s;

    /* renamed from: t */
    private static ThreadPoolExecutor f2858t;

    /* renamed from: u */
    private static final Object f2859u = new Object();

    /* renamed from: p */
    private long f2860p;

    /* renamed from: q */
    private volatile boolean f2861q;

    private C0816f() {
        super("Z:ChunkUploadWorker");
        this.f2860p = 0L;
        this.f2861q = true;
        f2856r = new C29031q0();
        if (f2858t == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("ChunkUpload"));
            f2858t = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        start();
    }

    /* renamed from: a */
    public static boolean m2131a() {
        boolean z11 = true;
        if (f2857s == null) {
            return true;
        }
        synchronized (f2859u) {
            try {
                C29031q0 c29031q0 = f2856r;
                if (c29031q0 != null && !c29031q0.m145032c()) {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: b */
    public static void m2132b(C2774c c2774c) {
        m2133c();
        if (f2857s != null) {
            Object obj = f2859u;
            synchronized (obj) {
                f2856r.m145030a(c2774c);
                obj.notifyAll();
            }
            return;
        }
        if (c2774c != null) {
            c2774c.m13355f();
        }
    }

    /* renamed from: c */
    public static synchronized void m2133c() {
        synchronized (C0816f.class) {
            if (f2857s == null) {
                synchronized (C0816f.class) {
                    try {
                        if (f2857s == null) {
                            f2857s = new C0816f();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2861q) {
            try {
                Object obj = f2859u;
                synchronized (obj) {
                    if (f2856r.m145032c()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("ChunkUploadBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f2861q) {
                break;
            }
            if (System.currentTimeMillis() - this.f2860p > 5000) {
                this.f2860p = System.currentTimeMillis();
                C29630g.m147299E0().m147319V0();
            }
            final C2774c m145031b = f2856r.m145031b();
            if (m145031b != null) {
                f2858t.execute(new Runnable() { // from class: ag0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2774c.this.m13356g();
                    }
                });
            }
            try {
                Thread.sleep(100L);
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        f2857s = null;
    }
}
