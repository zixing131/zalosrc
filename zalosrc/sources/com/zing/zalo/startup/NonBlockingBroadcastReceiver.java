package com.zing.zalo.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.zing.zalo.startup.StartupApplication;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes.dex */
public abstract class NonBlockingBroadcastReceiver extends BroadcastReceiver {
    public static final C10895b Companion = new C10895b(null);

    /* renamed from: p */
    private static final InterfaceC24854k f55005p;

    /* renamed from: com.zing.zalo.startup.NonBlockingBroadcastReceiver$a */
    /* loaded from: classes.dex */
    static final class C10894a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10894a f55006q = new C10894a();

        C10894a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            AbstractC20110a.m104535d("create handler for NonBlockingBroadcastReceiver: " + NonBlockingBroadcastReceiver.Companion, new Object[0]);
            HandlerThread handlerThread = new HandlerThread("NonBlockingBroadcastReceiver-thread");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    /* renamed from: com.zing.zalo.startup.NonBlockingBroadcastReceiver$b */
    /* loaded from: classes.dex */
    public static final class C10895b {
        private C10895b() {
        }

        public /* synthetic */ C10895b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Handler m56537a() {
            return (Handler) NonBlockingBroadcastReceiver.f55005p.getValue();
        }
    }

    /* renamed from: com.zing.zalo.startup.NonBlockingBroadcastReceiver$c */
    /* loaded from: classes5.dex */
    static final class RunnableC10896c implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Intent f55008q;

        /* renamed from: r */
        final /* synthetic */ Context f55009r;

        RunnableC10896c(Intent intent, Context context) {
            this.f55008q = intent;
            this.f55009r = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NonBlockingBroadcastReceiver.this.mo39547b(this.f55009r, this.f55008q);
        }
    }

    /* renamed from: com.zing.zalo.startup.NonBlockingBroadcastReceiver$d */
    /* loaded from: classes5.dex */
    static final class C10897d implements StartupApplication.InterfaceC10902b {

        /* renamed from: q */
        final /* synthetic */ Intent f55011q;

        /* renamed from: r */
        final /* synthetic */ Context f55012r;

        /* renamed from: com.zing.zalo.startup.NonBlockingBroadcastReceiver$d$a */
        /* loaded from: classes5.dex */
        static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C10897d c10897d = C10897d.this;
                NonBlockingBroadcastReceiver.this.mo39547b(c10897d.f55012r, c10897d.f55011q);
            }
        }

        C10897d(Intent intent, Context context) {
            this.f55011q = intent;
            this.f55012r = context;
        }

        @Override // com.zing.zalo.startup.StartupApplication.InterfaceC10902b
        /* renamed from: a */
        public final void mo12585a() {
            NonBlockingBroadcastReceiver.Companion.m56537a().post(new a());
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C10894a.f55006q);
        f55005p = m129210a;
    }

    /* renamed from: b */
    public abstract void mo39547b(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onReceive: ");
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        sb2.append(str);
        AbstractC20110a.m104535d(sb2.toString(), new Object[0]);
        if (context != null && intent != null) {
            StartupApplication.C10901a c10901a = StartupApplication.Companion;
            if (c10901a.m56558a().m56556p()) {
                Companion.m56537a().post(new RunnableC10896c(intent, context));
            } else {
                c10901a.m56558a().m56557y(new C10897d(intent, context));
            }
        }
    }
}
