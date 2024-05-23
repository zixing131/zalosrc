package ag0;

import com.zing.zalocore.connection.socket.RequestPacket;
import mm0.AbstractC23350e;
import p609wh.C29023m0;
import p609wh.C29029p0;
import p645xh.C29630g;

/* renamed from: ag0.g0 */
/* loaded from: classes6.dex */
public class C0819g0 extends Thread {

    /* renamed from: q */
    private static C29029p0 f2867q;

    /* renamed from: r */
    private static volatile C0819g0 f2868r;

    /* renamed from: s */
    private static final Object f2869s = new Object();

    /* renamed from: p */
    private volatile boolean f2870p;

    private C0819g0() {
        super("Z:ResponseUploadDownloadWorker");
        this.f2870p = true;
        f2867q = new C29029p0();
        start();
    }

    /* renamed from: a */
    public static void m2137a(RequestPacket requestPacket) {
        m2138b();
        if (f2868r != null) {
            Object obj = f2869s;
            synchronized (obj) {
                f2867q.m145027a(requestPacket);
                obj.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2138b() {
        synchronized (C0819g0.class) {
            if (f2868r == null) {
                synchronized (C0819g0.class) {
                    try {
                        if (f2868r == null) {
                            f2868r = new C0819g0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2870p) {
            try {
                Object obj = f2869s;
                synchronized (obj) {
                    if (f2867q.m145029c()) {
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
            if (!this.f2870p) {
                break;
            }
            RequestPacket m145028b = f2867q.m145028b();
            if (m145028b != null && C29630g.m147299E0() != null) {
                C29023m0.m145017a().m145018b(m145028b);
            }
        }
        f2868r = null;
    }
}
