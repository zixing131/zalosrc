package p406ow;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ow.d */
/* loaded from: classes.dex */
public class C24568d {

    /* renamed from: a */
    final C24570f f118271a;

    /* renamed from: b */
    private AtomicInteger f118272b;

    /* renamed from: c */
    private Handler f118273c;

    /* renamed from: d */
    private HandlerThread f118274d;

    /* renamed from: e */
    long f118275e;

    /* renamed from: ow.d$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        public static final C24568d f118276a = new C24568d(C24570f.m127979c());
    }

    /* renamed from: ow.d$b */
    /* loaded from: classes.dex */
    private class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private void m127977a() {
            m127978b();
            C24575k.m128002c();
        }

        /* renamed from: b */
        private void m127978b() {
            long m128003b = C24575k.m128001a().m128003b(Process.myUid());
            synchronized (this) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (m128003b != -1) {
                        C24568d c24568d = C24568d.this;
                        c24568d.f118271a.m127982a(m128003b, elapsedRealtime - c24568d.f118275e);
                    }
                    C24568d.this.f118275e = elapsedRealtime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    m127977a();
                    removeMessages(1);
                    return;
                } else {
                    throw new IllegalArgumentException("Unknown what=" + message.what);
                }
            }
            m127978b();
            removeMessages(1);
            sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* renamed from: a */
    public static C24568d m127974a() {
        return a.f118276a;
    }

    /* renamed from: b */
    public void m127975b() {
        if (this.f118272b.getAndIncrement() == 0) {
            this.f118273c.sendEmptyMessage(1);
            this.f118275e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public void m127976c() {
        if (this.f118272b.decrementAndGet() == 0) {
            this.f118273c.sendEmptyMessage(2);
        }
    }

    private C24568d(C24570f c24570f) {
        this.f118271a = c24570f;
        this.f118272b = new AtomicInteger();
        HandlerThread handlerThread = new HandlerThread("Z:DeviceBandwidthSampler");
        this.f118274d = handlerThread;
        handlerThread.start();
        this.f118273c = new b(this.f118274d.getLooper());
    }
}
