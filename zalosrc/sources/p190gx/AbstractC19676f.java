package p190gx;

import android.os.Debug;
import fg0.ThreadFactoryC18928a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import mx.AbstractC23466c;
import mx.C23476m;
import p308kx.C21965i;

/* renamed from: gx.f */
/* loaded from: classes4.dex */
public abstract class AbstractC19676f {

    /* renamed from: a */
    private static StringBuilder f97631a = new StringBuilder();

    /* renamed from: b */
    private static StringBuilder f97632b = new StringBuilder();

    /* renamed from: c */
    private static final ScheduledExecutorService f97633c = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18928a("BatteryService"));

    /* renamed from: d */
    private static ScheduledFuture f97634d;

    /* renamed from: e */
    private static ScheduledFuture f97635e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m103243f() {
        Iterator it = C21965i.m114673A().iterator();
        while (it.hasNext()) {
            C21965i c21965i = (C21965i) ((WeakReference) it.next()).get();
            if (c21965i != null) {
                c21965i.m114701z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m103244g() {
        m103252o(f97631a, "battery/wakeup/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m103245h(String str) {
        StringBuilder sb2 = f97631a;
        sb2.append(str);
        sb2.append("\n");
        ScheduledFuture scheduledFuture = f97634d;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            f97634d = f97633c.schedule(new Runnable() { // from class: gx.e
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19676f.m103244g();
                }
            }, 5L, TimeUnit.MINUTES);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m103246i() {
        m103252o(f97632b, "battery/gps/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m103247j(String str) {
        StringBuilder sb2 = f97632b;
        sb2.append(str);
        sb2.append("\n");
        ScheduledFuture scheduledFuture = f97635e;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            f97635e = f97633c.schedule(new Runnable() { // from class: gx.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19676f.m103246i();
                }
            }, 1L, TimeUnit.MINUTES);
        }
    }

    /* renamed from: k */
    public static void m103248k() {
        f97633c.scheduleAtFixedRate(new Runnable() { // from class: gx.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19676f.m103243f();
            }
        }, 30L, 30L, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static void m103249l(final String str) {
        f97633c.execute(new Runnable() { // from class: gx.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19676f.m103245h(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static void m103250m(final String str) {
        f97633c.execute(new Runnable() { // from class: gx.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19676f.m103247j(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static void m103251n(Runnable runnable) {
        if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            f97633c.execute(runnable);
        }
    }

    /* renamed from: o */
    private static void m103252o(StringBuilder sb2, String str) {
        String sb3 = sb2.toString();
        if (!sb3.isEmpty()) {
            AbstractC23466c.m123219v(sb3, AbstractC23466c.m123212o(str));
            sb2.setLength(0);
        }
    }
}
