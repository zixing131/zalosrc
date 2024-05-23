package zm.voip.service;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import bp0.AbstractC3082b0;

/* renamed from: zm.voip.service.p */
/* loaded from: classes7.dex */
public class HandlerC32324p extends Handler {

    /* renamed from: a */
    private static volatile HandlerThread f149243a;

    /* renamed from: b */
    private static volatile HandlerC32324p f149244b;

    private HandlerC32324p() {
        super(m156350c());
    }

    /* renamed from: a */
    public static void m156348a(Runnable runnable) {
        try {
            m156355h().m156349b(runnable);
        } catch (Throwable th2) {
            AbstractC3082b0.m15423e("NativeExecutor", "execute with delay: " + runnable, th2);
        }
    }

    /* renamed from: b */
    private void m156349b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        AbstractC3082b0.m15421c("NativeExecutor", "cancel task");
        removeCallbacksAndMessages(runnable);
    }

    /* renamed from: c */
    private static Looper m156350c() {
        AbstractC3082b0.m15421c("NativeExecutor", "Creating new handler thread");
        f149243a = new HandlerThread("Z:VoipController");
        f149243a.start();
        return f149243a.getLooper();
    }

    /* renamed from: d */
    public static void m156351d(Runnable runnable) {
        try {
            m156355h().m156353f(runnable, 0);
        } catch (Throwable th2) {
            AbstractC3082b0.m15423e("NativeExecutor", "execute with delay: " + runnable, th2);
        }
    }

    /* renamed from: e */
    public static void m156352e(Runnable runnable, int i11) {
        try {
            m156355h().m156353f(runnable, i11);
        } catch (Throwable th2) {
            AbstractC3082b0.m15423e("NativeExecutor", "execute with delay: " + runnable, th2);
        }
    }

    /* renamed from: f */
    private void m156353f(Runnable runnable, int i11) {
        if (runnable == null) {
            return;
        }
        AbstractC3082b0.m15421c("NativeExecutor", "execute task with delay = " + i11);
        Message obtain = Message.obtain(this, 0, runnable);
        if (i11 <= 0) {
            sendMessage(obtain);
        } else {
            sendMessageDelayed(obtain, i11);
        }
    }

    /* renamed from: g */
    private void m156354g(Runnable runnable) {
        try {
            AbstractC3082b0.m15421c("NativeExecutor", "executeMessage");
            runnable.run();
        } catch (Throwable th2) {
            AbstractC3082b0.m15423e("NativeExecutor", "run task: " + runnable, th2);
        }
    }

    /* renamed from: h */
    private static HandlerC32324p m156355h() {
        if (f149244b == null) {
            synchronized (HandlerC32324p.class) {
                try {
                    if (f149244b == null) {
                        f149244b = new HandlerC32324p();
                    }
                } finally {
                }
            }
        }
        return f149244b;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof Runnable) {
            m156354g((Runnable) obj);
            return;
        }
        AbstractC3082b0.m15422d("NativeExecutor", "can't handle msg: " + message);
    }
}
