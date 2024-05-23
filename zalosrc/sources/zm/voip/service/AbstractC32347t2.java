package zm.voip.service;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import bp0.AbstractC3082b0;
import p308kx.C21965i;

/* renamed from: zm.voip.service.t2 */
/* loaded from: classes7.dex */
public abstract class AbstractC32347t2 {

    /* renamed from: a */
    protected a f149270a;

    /* renamed from: b */
    protected HandlerThread f149271b;

    /* renamed from: c */
    protected C21965i f149272c;

    /* renamed from: d */
    protected final Object f149273d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm.voip.service.t2$a */
    /* loaded from: classes7.dex */
    public static class a extends Handler {

        /* renamed from: a */
        AbstractC32347t2 f149274a;

        public a(Looper looper, AbstractC32347t2 abstractC32347t2) {
            super(looper);
            AbstractC3082b0.m15421c("VoipCallback", "Create async worker !!!");
            this.f149274a = abstractC32347t2;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC32347t2 abstractC32347t2 = this.f149274a;
            if (abstractC32347t2 == null) {
                return;
            }
            abstractC32347t2.mo155742d(message);
        }
    }

    public AbstractC32347t2() {
        C21965i c21965i = new C21965i(1, "zm.voip.ongoingCallLock");
        this.f149272c = c21965i;
        c21965i.m114699Q(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m156375a() {
        C21965i c21965i = this.f149272c;
        if (c21965i != null && !c21965i.m114696B()) {
            this.f149272c.m114700x();
        }
    }

    /* renamed from: b */
    public void m156376b(Runnable runnable, int i11) {
        if (runnable != null) {
            try {
                a aVar = this.f149270a;
                if (aVar != null && this.f149271b != null) {
                    this.f149270a.sendMessageDelayed(Message.obtain(aVar, 0, runnable), i11);
                }
            } catch (Throwable th2) {
                AbstractC3082b0.m15422d("VoipCallback", "executeIfExist failed " + th2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Handler m156377c() {
        synchronized (this.f149273d) {
            try {
                if (this.f149270a == null) {
                    HandlerThread handlerThread = new HandlerThread("Z:UAStateAsyncWorker" + System.currentTimeMillis());
                    this.f149271b = handlerThread;
                    handlerThread.start();
                    this.f149270a = new a(this.f149271b.getLooper(), this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f149270a;
    }

    /* renamed from: d */
    protected abstract void mo155742d(Message message);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m156378e() {
        C21965i c21965i = this.f149272c;
        if (c21965i != null && c21965i.m114696B()) {
            this.f149272c.m114697N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m156379f() {
        try {
            synchronized (this.f149273d) {
                try {
                    if (this.f149270a != null) {
                        HandlerThread handlerThread = this.f149271b;
                        this.f149270a = null;
                        this.f149271b = null;
                        handlerThread.quit();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AbstractC3082b0.m15422d("VoipCallback", "StopHandler failed " + th3.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m156380g(int i11) {
        m156377c().sendMessage(m156377c().obtainMessage(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m156381h(int i11, Object obj) {
        m156377c().sendMessage(m156377c().obtainMessage(i11, obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m156382i(int i11, long j11) {
        m156377c().sendMessageDelayed(m156377c().obtainMessage(i11), j11);
    }
}
