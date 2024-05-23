package p458qr;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: qr.i */
/* loaded from: classes4.dex */
public class C25476i extends Thread {

    /* renamed from: q */
    private static final List f122061q = new LinkedList();

    /* renamed from: r */
    private static final Handler f122062r = new Handler(Looper.getMainLooper());

    /* renamed from: s */
    private static volatile C25476i f122063s = null;

    /* renamed from: t */
    private static final Object f122064t = new Object();

    /* renamed from: p */
    private volatile boolean f122065p;

    private C25476i() {
        super("Z:FeedWorker");
        this.f122065p = true;
        if (f122063s == null) {
            f122063s = this;
            start();
        }
    }

    /* renamed from: b */
    private void m131957b() {
        final AbstractC25474g abstractC25474g;
        try {
            synchronized (f122064t) {
                abstractC25474g = (AbstractC25474g) f122061q.remove(0);
            }
            if (abstractC25474g != null) {
                final Object mo15774a = abstractC25474g.mo15774a();
                f122062r.post(new Runnable() { // from class: qr.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC25474g.this.mo43518c(mo15774a);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    public static void m131959d(AbstractC25474g abstractC25474g) {
        m131960e();
        if (f122063s != null) {
            Object obj = f122064t;
            synchronized (obj) {
                try {
                    if (abstractC25474g.m131955b()) {
                        f122061q.add(0, abstractC25474g);
                    } else {
                        f122061q.add(abstractC25474g);
                    }
                    obj.notifyAll();
                } finally {
                }
            }
        }
    }

    /* renamed from: e */
    public static synchronized void m131960e() {
        synchronized (C25476i.class) {
            if (f122063s == null) {
                synchronized (C25476i.class) {
                    try {
                        if (f122063s == null) {
                            f122063s = new C25476i();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f122065p) {
            Object obj = f122064t;
            synchronized (obj) {
                if (f122061q.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!this.f122065p) {
                break;
            } else {
                m131957b();
            }
        }
        f122063s = null;
    }
}
