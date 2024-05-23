package b30;

import android.app.Service;
import android.os.Handler;
import android.os.HandlerThread;
import com.zing.zalo.startup.StartupApplication;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: b30.a */
/* loaded from: classes5.dex */
public abstract class AbstractC2505a {

    /* renamed from: a */
    private static final InterfaceC24854k f10201a;

    /* renamed from: b30.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f10202q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            AbstractC20110a.m104535d("create shared service thread for Service.handler", new Object[0]);
            HandlerThread handlerThread = new HandlerThread("Service-ktx-thread");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    /* renamed from: b30.a$b */
    /* loaded from: classes5.dex */
    static final class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Runnable f10203p;

        b(Runnable runnable) {
            this.f10203p = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f10203p.run();
        }
    }

    /* renamed from: b30.a$c */
    /* loaded from: classes5.dex */
    static final class c implements StartupApplication.InterfaceC10902b {

        /* renamed from: p */
        final /* synthetic */ Service f10204p;

        /* renamed from: q */
        final /* synthetic */ Runnable f10205q;

        /* renamed from: b30.a$c$a */
        /* loaded from: classes5.dex */
        static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.f10205q.run();
            }
        }

        c(Service service, Runnable runnable) {
            this.f10204p = service;
            this.f10205q = runnable;
        }

        @Override // com.zing.zalo.startup.StartupApplication.InterfaceC10902b
        /* renamed from: a */
        public final void mo12585a() {
            AbstractC2505a.m12582a(this.f10204p).post(new a());
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f10202q);
        f10201a = m129210a;
    }

    /* renamed from: a */
    public static final Handler m12582a(Service service) {
        AbstractC19074t.m100208f(service, "$this$handler");
        return (Handler) f10201a.getValue();
    }

    /* renamed from: b */
    public static final void m12583b(Service service, Runnable runnable) {
        AbstractC19074t.m100208f(service, "$this$runNonBlockingTask");
        AbstractC19074t.m100208f(runnable, "runnable");
        StartupApplication.C10901a c10901a = StartupApplication.Companion;
        if (c10901a.m56558a().m56556p()) {
            m12582a(service).post(new b(runnable));
        } else {
            c10901a.m56558a().m56557y(new c(service, runnable));
        }
    }
}
