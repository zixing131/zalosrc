package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1774i0;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import com.google.firebase.AbstractC6596l;
import com.google.firebase.C6576e;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p319l9.C22152a;
import p441q9.C25197k;
import p476r9.C25693a;
import p476r9.EnumC25695c;
import p476r9.ViewTreeObserverOnDrawListenerC25697e;
import p476r9.ViewTreeObserverOnPreDrawListenerC25700h;
import p507s9.C26196m;
import p507s9.EnumC26187d;

/* loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC1799v {

    /* renamed from: N */
    private static final Timer f36816N = new C25693a().m132598a();

    /* renamed from: O */
    private static final long f36817O = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: P */
    private static volatile AppStartTrace f36818P;

    /* renamed from: Q */
    private static ExecutorService f36819Q;

    /* renamed from: I */
    private PerfSession f36828I;

    /* renamed from: q */
    private final C25197k f36834q;

    /* renamed from: r */
    private final C25693a f36835r;

    /* renamed from: s */
    private final C6662a f36836s;

    /* renamed from: t */
    private final C26196m.b f36837t;

    /* renamed from: u */
    private Context f36838u;

    /* renamed from: v */
    private WeakReference f36839v;

    /* renamed from: w */
    private WeakReference f36840w;

    /* renamed from: y */
    private final Timer f36842y;

    /* renamed from: z */
    private final Timer f36843z;

    /* renamed from: p */
    private boolean f36833p = false;

    /* renamed from: x */
    private boolean f36841x = false;

    /* renamed from: A */
    private Timer f36820A = null;

    /* renamed from: B */
    private Timer f36821B = null;

    /* renamed from: C */
    private Timer f36822C = null;

    /* renamed from: D */
    private Timer f36823D = null;

    /* renamed from: E */
    private Timer f36824E = null;

    /* renamed from: F */
    private Timer f36825F = null;

    /* renamed from: G */
    private Timer f36826G = null;

    /* renamed from: H */
    private Timer f36827H = null;

    /* renamed from: J */
    private boolean f36829J = false;

    /* renamed from: K */
    private int f36830K = 0;

    /* renamed from: L */
    private final ViewTreeObserverOnDrawListenerC6689b f36831L = new ViewTreeObserverOnDrawListenerC6689b();

    /* renamed from: M */
    private boolean f36832M = false;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$b */
    /* loaded from: classes3.dex */
    private final class ViewTreeObserverOnDrawListenerC6689b implements ViewTreeObserver.OnDrawListener {
        private ViewTreeObserverOnDrawListenerC6689b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.m34139l(AppStartTrace.this);
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$c */
    /* loaded from: classes3.dex */
    public static class RunnableC6690c implements Runnable {

        /* renamed from: p */
        private final AppStartTrace f36845p;

        public RunnableC6690c(AppStartTrace appStartTrace) {
            this.f36845p = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36845p.f36820A == null) {
                this.f36845p.f36829J = true;
            }
        }
    }

    AppStartTrace(C25197k c25197k, C25693a c25693a, C6662a c6662a, ExecutorService executorService) {
        Timer timer;
        long startElapsedRealtime;
        this.f36834q = c25197k;
        this.f36835r = c25693a;
        this.f36836s = c6662a;
        f36819Q = executorService;
        this.f36837t = C26196m.m134738r0().m134761O("_experiment_app_start_ttid");
        if (Build.VERSION.SDK_INT >= 24) {
            startElapsedRealtime = Process.getStartElapsedRealtime();
            timer = Timer.m34289f(startElapsedRealtime);
        } else {
            timer = null;
        }
        this.f36842y = timer;
        AbstractC6596l abstractC6596l = (AbstractC6596l) C6576e.m33601k().m33611i(AbstractC6596l.class);
        this.f36843z = abstractC6596l != null ? Timer.m34289f(abstractC6596l.mo33458b()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m34131B() {
        if (this.f36826G != null) {
            return;
        }
        this.f36826G = this.f36835r.m132598a();
        this.f36837t.m134754D((C26196m) C26196m.m134738r0().m134761O("_experiment_preDrawFoQ").m134759L(m34143p().m34294e()).m134760N(m34143p().m34293d(this.f36826G)).m35109q());
        m34148x(this.f36837t);
    }

    /* renamed from: l */
    static /* synthetic */ int m34139l(AppStartTrace appStartTrace) {
        int i11 = appStartTrace.f36830K;
        appStartTrace.f36830K = i11 + 1;
        return i11;
    }

    /* renamed from: m */
    private Timer m34140m() {
        Timer timer = this.f36843z;
        return timer != null ? timer : f36816N;
    }

    /* renamed from: n */
    public static AppStartTrace m34141n() {
        if (f36818P != null) {
            return f36818P;
        }
        return m34142o(C25197k.m130415k(), new C25693a());
    }

    /* renamed from: o */
    static AppStartTrace m34142o(C25197k c25197k, C25693a c25693a) {
        if (f36818P == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f36818P == null) {
                        f36818P = new AppStartTrace(c25197k, c25693a, C6662a.m34042g(), new ThreadPoolExecutor(0, 1, f36817O + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f36818P;
    }

    /* renamed from: p */
    private Timer m34143p() {
        Timer timer = this.f36842y;
        if (timer != null) {
            return timer;
        }
        return m34140m();
    }

    /* renamed from: r */
    public static boolean m34144r(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    if (Build.VERSION.SDK_INT >= 23 || m34145s(context)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m34145s(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m34146u(C26196m.b bVar) {
        this.f36834q.m130431C((C26196m) bVar.m35109q(), EnumC26187d.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m34147w() {
        C26196m.b m134760N = C26196m.m134738r0().m134761O(EnumC25695c.APP_START_TRACE_NAME.toString()).m134759L(m34140m().m34294e()).m134760N(m34140m().m34293d(this.f36822C));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((C26196m) C26196m.m134738r0().m134761O(EnumC25695c.ON_CREATE_TRACE_NAME.toString()).m134759L(m34140m().m34294e()).m134760N(m34140m().m34293d(this.f36820A)).m35109q());
        C26196m.b m134738r0 = C26196m.m134738r0();
        m134738r0.m134761O(EnumC25695c.ON_START_TRACE_NAME.toString()).m134759L(this.f36820A.m34294e()).m134760N(this.f36820A.m34293d(this.f36821B));
        arrayList.add((C26196m) m134738r0.m35109q());
        C26196m.b m134738r02 = C26196m.m134738r0();
        m134738r02.m134761O(EnumC25695c.ON_RESUME_TRACE_NAME.toString()).m134759L(this.f36821B.m34294e()).m134760N(this.f36821B.m34293d(this.f36822C));
        arrayList.add((C26196m) m134738r02.m35109q());
        m134760N.m134752B(arrayList).m134753C(this.f36828I.m34246a());
        this.f36834q.m130431C((C26196m) m134760N.m35109q(), EnumC26187d.FOREGROUND_BACKGROUND);
    }

    /* renamed from: x */
    private void m34148x(final C26196m.b bVar) {
        if (this.f36825F != null && this.f36826G != null && this.f36827H != null) {
            f36819Q.execute(new Runnable() { // from class: m9.f
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.m34146u(bVar);
                }
            });
            m34152D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m34149y() {
        String str;
        if (this.f36827H != null) {
            return;
        }
        this.f36827H = this.f36835r.m132598a();
        this.f36837t.m134754D((C26196m) C26196m.m134738r0().m134761O("_experiment_onDrawFoQ").m134759L(m34143p().m34294e()).m134760N(m34143p().m34293d(this.f36827H)).m35109q());
        if (this.f36842y != null) {
            this.f36837t.m134754D((C26196m) C26196m.m134738r0().m134761O("_experiment_procStart_to_classLoad").m134759L(m34143p().m34294e()).m134760N(m34143p().m34293d(m34140m())).m35109q());
        }
        C26196m.b bVar = this.f36837t;
        if (this.f36832M) {
            str = "true";
        } else {
            str = "false";
        }
        bVar.m134758I("systemDeterminedForeground", str);
        this.f36837t.m134757H("onDrawCount", this.f36830K);
        this.f36837t.m134753C(this.f36828I.m34246a());
        m34148x(this.f36837t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m34150z() {
        if (this.f36825F != null) {
            return;
        }
        this.f36825F = this.f36835r.m132598a();
        this.f36837t.m134759L(m34143p().m34294e()).m134760N(m34143p().m34293d(this.f36825F));
        m34148x(this.f36837t);
    }

    /* renamed from: C */
    public synchronized void m34151C(Context context) {
        boolean z11;
        try {
            if (this.f36833p) {
                return;
            }
            C1774i0.m9296l().getLifecycle().mo9335a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                if (!this.f36832M && !m34144r(applicationContext)) {
                    z11 = false;
                    this.f36832M = z11;
                    this.f36833p = true;
                    this.f36838u = applicationContext;
                }
                z11 = true;
                this.f36832M = z11;
                this.f36833p = true;
                this.f36838u = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: D */
    public synchronized void m34152D() {
        if (!this.f36833p) {
            return;
        }
        C1774i0.m9296l().getLifecycle().mo9338d(this);
        ((Application) this.f36838u).unregisterActivityLifecycleCallbacks(this);
        this.f36833p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001d, B:16:0x003e), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z11;
        try {
            if (!this.f36829J && this.f36820A == null) {
                if (!this.f36832M && !m34144r(this.f36838u)) {
                    z11 = false;
                    this.f36832M = z11;
                    this.f36839v = new WeakReference(activity);
                    this.f36820A = this.f36835r.m132598a();
                    if (m34143p().m34293d(this.f36820A) > f36817O) {
                        this.f36841x = true;
                    }
                }
                z11 = true;
                this.f36832M = z11;
                this.f36839v = new WeakReference(activity);
                this.f36820A = this.f36835r.m132598a();
                if (m34143p().m34293d(this.f36820A) > f36817O) {
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.f36829J && !this.f36841x && this.f36836s.m34064h()) {
            activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.f36831L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (!this.f36829J && !this.f36841x) {
                boolean m34064h = this.f36836s.m34064h();
                if (m34064h) {
                    View findViewById = activity.findViewById(R.id.content);
                    findViewById.getViewTreeObserver().addOnDrawListener(this.f36831L);
                    ViewTreeObserverOnDrawListenerC25697e.m132603e(findViewById, new Runnable() { // from class: m9.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.m34149y();
                        }
                    });
                    ViewTreeObserverOnPreDrawListenerC25700h.m132614a(findViewById, new Runnable() { // from class: m9.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.m34150z();
                        }
                    }, new Runnable() { // from class: m9.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace.this.m34131B();
                        }
                    });
                }
                if (this.f36822C != null) {
                    return;
                }
                this.f36840w = new WeakReference(activity);
                this.f36822C = this.f36835r.m132598a();
                this.f36828I = SessionManager.getInstance().perfSession();
                C22152a.m115524e().m115525a("onResume(): " + activity.getClass().getName() + ": " + m34140m().m34293d(this.f36822C) + " microseconds");
                f36819Q.execute(new Runnable() { // from class: m9.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.m34147w();
                    }
                });
                if (!m34064h) {
                    m34152D();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f36829J && this.f36821B == null && !this.f36841x) {
            this.f36821B = this.f36835r.m132598a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @InterfaceC1766e0(AbstractC1785o.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.f36829J && !this.f36841x && this.f36824E == null) {
            this.f36824E = this.f36835r.m132598a();
            this.f36837t.m134754D((C26196m) C26196m.m134738r0().m134761O("_experiment_firstBackgrounding").m134759L(m34143p().m34294e()).m134760N(m34143p().m34293d(this.f36824E)).m35109q());
        }
    }

    @Keep
    @InterfaceC1766e0(AbstractC1785o.a.ON_START)
    public void onAppEnteredForeground() {
        if (!this.f36829J && !this.f36841x && this.f36823D == null) {
            this.f36823D = this.f36835r.m132598a();
            this.f36837t.m134754D((C26196m) C26196m.m134738r0().m134761O("_experiment_firstForegrounding").m134759L(m34143p().m34294e()).m134760N(m34143p().m34293d(this.f36823D)).m35109q());
        }
    }
}
