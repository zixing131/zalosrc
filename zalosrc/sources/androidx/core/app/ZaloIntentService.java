package androidx.core.app;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import androidx.core.app.JobIntentService;
import me0.AbstractC23138m0;
import mm0.AbstractC23350e;
import p371nv.C23952g;

/* loaded from: classes.dex */
public abstract class ZaloIntentService extends JobIntentService implements MessageQueue.IdleHandler {

    /* renamed from: C */
    static final String f5874C = "ZaloIntentService";

    /* renamed from: A */
    private final String f5875A;

    /* renamed from: B */
    private int f5876B = 0;

    /* renamed from: y */
    private volatile Looper f5877y;

    /* renamed from: z */
    private volatile HandlerC1320a f5878z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.ZaloIntentService$a */
    /* loaded from: classes.dex */
    public final class HandlerC1320a extends Handler {
        public HandlerC1320a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 458753:
                    Looper.myQueue().addIdleHandler(ZaloIntentService.this);
                    break;
                case 458754:
                    try {
                        try {
                            ZaloIntentService.this.mo6632m((Intent) message.obj);
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f(ZaloIntentService.f5874C, e11);
                        }
                        break;
                    } finally {
                        ZaloIntentService.this.mo6631l(message.arg1);
                    }
            }
            if (ZaloIntentService.this.m6630k()) {
                ZaloIntentService.this.stopSelf(message.arg1);
            }
        }
    }

    public ZaloIntentService(String str) {
        this.f5875A = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.app.JobIntentService
    /* renamed from: a */
    public JobIntentService.InterfaceC1316e mo6612a() {
        try {
            return super.mo6612a();
        } catch (SecurityException unused) {
            AbstractC23350e.m122774d(f5874C, "Error when start ZaloIntentService");
            C23952g.m125345j(f5874C, "Error when start ZaloIntentService");
            return null;
        }
    }

    @Override // androidx.core.app.JobIntentService
    /* renamed from: g */
    protected void mo6615g(Intent intent) {
        onStart(intent, this.f5876B);
    }

    /* renamed from: j */
    public boolean m6629j() {
        return AbstractC23138m0.m118770b();
    }

    /* renamed from: k */
    protected boolean m6630k() {
        return false;
    }

    /* renamed from: l */
    public void mo6631l(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onFinishCommand:");
        sb2.append(i11);
    }

    /* renamed from: m */
    protected abstract void mo6632m(Intent intent);

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("Z:IntentService[" + this.f5875A + "]");
        handlerThread.start();
        this.f5877y = handlerThread.getLooper();
        this.f5878z = new HandlerC1320a(this.f5877y);
        Message obtainMessage = this.f5878z.obtainMessage();
        obtainMessage.what = 458753;
        this.f5878z.sendMessage(obtainMessage);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onDestroy() {
        this.f5877y.quit();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        Message obtainMessage = this.f5878z.obtainMessage();
        obtainMessage.what = 458754;
        obtainMessage.arg1 = i11;
        obtainMessage.obj = intent;
        this.f5878z.sendMessage(obtainMessage);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        this.f5876B = i12;
        super.onStartCommand(intent, i11, i12);
        if (m6629j()) {
            return 3;
        }
        return 1;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        return true;
    }
}
