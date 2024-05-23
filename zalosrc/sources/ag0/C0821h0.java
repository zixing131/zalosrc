package ag0;

import com.zing.zalocore.connection.socket.RequestPacket;
import mm0.AbstractC23350e;
import p609wh.C29025n0;
import p609wh.C29029p0;
import p645xh.C29632i;

/* renamed from: ag0.h0 */
/* loaded from: classes6.dex */
public class C0821h0 extends Thread {

    /* renamed from: q */
    private static C29029p0 f2883q;

    /* renamed from: r */
    private static volatile C0821h0 f2884r;

    /* renamed from: s */
    private static final Object f2885s = new Object();

    /* renamed from: p */
    private volatile boolean f2886p;

    private C0821h0() {
        super("Z:VideoResponseUploadDownloadWorker");
        this.f2886p = true;
        f2883q = new C29029p0();
        start();
    }

    /* renamed from: a */
    public static void m2145a(RequestPacket requestPacket) {
        m2146b();
        if (f2884r != null) {
            Object obj = f2885s;
            synchronized (obj) {
                f2883q.m145027a(requestPacket);
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2146b() {
        synchronized (C0821h0.class) {
            if (f2884r == null) {
                synchronized (C0821h0.class) {
                    try {
                        if (f2884r == null) {
                            f2884r = new C0821h0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2886p) {
            try {
                Object obj = f2885s;
                synchronized (obj) {
                    if (f2883q.m145029c()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("ResponseUploadDownloadBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f2886p) {
                break;
            }
            RequestPacket m145028b = f2883q.m145028b();
            if (m145028b != null && C29632i.m147326E0() != null) {
                C29025n0.m145019a().m145020b(m145028b);
            }
        }
        f2884r = null;
    }
}
