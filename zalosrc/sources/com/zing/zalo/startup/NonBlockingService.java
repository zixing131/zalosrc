package com.zing.zalo.startup;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.zing.zalo.startup.StartupApplication;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes5.dex */
public abstract class NonBlockingService extends Service {

    /* renamed from: p */
    private final InterfaceC24854k f55014p;

    /* renamed from: q */
    private String f55015q;

    /* renamed from: com.zing.zalo.startup.NonBlockingService$a */
    /* loaded from: classes5.dex */
    static final class C10898a extends AbstractC19075u implements InterfaceC18494a {
        C10898a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            HandlerThread handlerThread = new HandlerThread("NonBlockingService[" + NonBlockingService.this.f55015q + ']');
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.startup.NonBlockingService$b */
    /* loaded from: classes5.dex */
    public static final class C10899b implements StartupApplication.InterfaceC10902b {

        /* renamed from: q */
        final /* synthetic */ Intent f55018q;

        /* renamed from: r */
        final /* synthetic */ int f55019r;

        C10899b(Intent intent, int i11) {
            this.f55018q = intent;
            this.f55019r = i11;
        }

        @Override // com.zing.zalo.startup.StartupApplication.InterfaceC10902b
        /* renamed from: a */
        public final void mo12585a() {
            NonBlockingService.this.m56541h(this.f55018q, this.f55019r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.startup.NonBlockingService$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC10900c implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Intent f55021q;

        /* renamed from: r */
        final /* synthetic */ int f55022r;

        RunnableC10900c(Intent intent, int i11) {
            this.f55021q = intent;
            this.f55022r = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f55021q;
            try {
                if (intent != null) {
                    try {
                        NonBlockingService.this.mo50459g(intent);
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
                if (NonBlockingService.this.m56543e()) {
                    NonBlockingService.this.stopSelf(this.f55022r);
                }
            } finally {
                NonBlockingService.this.m56544f(this.f55022r);
            }
        }
    }

    public NonBlockingService(String str) {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C10898a());
        this.f55014p = m129210a;
        this.f55015q = str;
    }

    /* renamed from: c */
    private final Handler m56540c() {
        return (Handler) this.f55014p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m56541h(Intent intent, int i11) {
        m56540c().post(new RunnableC10900c(intent, i11));
    }

    /* renamed from: d */
    public final boolean m56542d() {
        return true;
    }

    /* renamed from: e */
    protected final boolean m56543e() {
        return false;
    }

    /* renamed from: f */
    public final void m56544f(int i11) {
        AbstractC20110a.m104535d("onFinishCommand: " + i11, new Object[0]);
    }

    /* renamed from: g */
    protected abstract void mo50459g(Intent intent);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC20110a.m104535d("onCreate: " + this.f55015q, new Object[0]);
    }

    @Override // android.app.Service
    public void onDestroy() {
        m56540c().getLooper().quitSafely();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        if (intent != null) {
            StartupApplication.C10901a c10901a = StartupApplication.Companion;
            if (c10901a.m56558a().m56556p()) {
                m56541h(intent, i11);
            } else {
                c10901a.m56558a().m56557y(new C10899b(intent, i11));
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        onStart(intent, i12);
        if (m56542d()) {
            return 3;
        }
        return 1;
    }
}
