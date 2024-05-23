package ag0;

import com.zing.zalocore.connection.socket.RequestPacket;
import mm0.AbstractC23350e;
import p609wh.C29021l0;
import p609wh.C29029p0;
import p645xh.C29628e;

/* renamed from: ag0.f0 */
/* loaded from: classes6.dex */
public class C0817f0 extends Thread {

    /* renamed from: q */
    private static C29029p0 f2862q;

    /* renamed from: r */
    private static volatile C0817f0 f2863r;

    /* renamed from: s */
    private static final Object f2864s = new Object();

    /* renamed from: p */
    private volatile boolean f2865p;

    private C0817f0() {
        super("Z:ResponseWorker");
        this.f2865p = true;
        f2862q = new C29029p0();
        start();
    }

    /* renamed from: a */
    public static void m2134a(RequestPacket requestPacket) {
        m2135b();
        if (f2863r != null) {
            Object obj = f2864s;
            synchronized (obj) {
                if (requestPacket != null) {
                    try {
                        f2862q.m145027a(requestPacket);
                        obj.notifyAll();
                    } finally {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2135b() {
        synchronized (C0817f0.class) {
            if (f2863r == null) {
                synchronized (C0817f0.class) {
                    try {
                        if (f2863r == null) {
                            f2863r = new C0817f0();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f2865p) {
            try {
                Object obj = f2864s;
                synchronized (obj) {
                    if (f2862q.m145029c()) {
                        try {
                            obj.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("ResponseBackgroundWorker", e11);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            if (!this.f2865p) {
                break;
            }
            RequestPacket m145028b = f2862q.m145028b();
            if (m145028b != null && C29628e.m147249E0() != null) {
                C29021l0.m144916J().m145001R0(m145028b, false);
            }
        }
        f2863r = null;
    }
}
