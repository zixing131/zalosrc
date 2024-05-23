package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.ReportFragment;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: androidx.lifecycle.i0 */
/* loaded from: classes.dex */
public final class C1774i0 implements InterfaceC1801w {

    /* renamed from: x */
    public static final b f7319x = new b(null);

    /* renamed from: y */
    private static final C1774i0 f7320y = new C1774i0();

    /* renamed from: p */
    private int f7321p;

    /* renamed from: q */
    private int f7322q;

    /* renamed from: t */
    private Handler f7325t;

    /* renamed from: r */
    private boolean f7323r = true;

    /* renamed from: s */
    private boolean f7324s = true;

    /* renamed from: u */
    private final C1805y f7326u = new C1805y(this);

    /* renamed from: v */
    private final Runnable f7327v = new Runnable() { // from class: androidx.lifecycle.h0
        @Override // java.lang.Runnable
        public final void run() {
            C1774i0.m9295i(C1774i0.this);
        }
    };

    /* renamed from: w */
    private final ReportFragment.InterfaceC1750a f7328w = new d();

    /* renamed from: androidx.lifecycle.i0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f7329a = new a();

        private a() {
        }

        /* renamed from: a */
        public static final void m9304a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: androidx.lifecycle.i0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC1801w m9305a() {
            return C1774i0.f7320y;
        }

        /* renamed from: b */
        public final void m9306b(Context context) {
            AbstractC19074t.m100208f(context, "context");
            C1774i0.f7320y.m9301h(context);
        }
    }

    /* renamed from: androidx.lifecycle.i0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC1773i {

        /* renamed from: androidx.lifecycle.i0$c$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC1773i {
            final /* synthetic */ C1774i0 this$0;

            a(C1774i0 c1774i0) {
                this.this$0 = c1774i0;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                AbstractC19074t.m100208f(activity, "activity");
                this.this$0.m9298e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                AbstractC19074t.m100208f(activity, "activity");
                this.this$0.m9299f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1773i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.f7278q.m9247b(activity).m9244f(C1774i0.this.f7328w);
            }
        }

        @Override // androidx.lifecycle.AbstractC1773i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            C1774i0.this.m9297d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            a.m9304a(activity, new a(C1774i0.this));
        }

        @Override // androidx.lifecycle.AbstractC1773i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            C1774i0.this.m9300g();
        }
    }

    /* renamed from: androidx.lifecycle.i0$d */
    /* loaded from: classes.dex */
    public static final class d implements ReportFragment.InterfaceC1750a {
        d() {
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC1750a
        /* renamed from: a */
        public void mo9245a() {
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC1750a
        public void onResume() {
            C1774i0.this.m9298e();
        }

        @Override // androidx.lifecycle.ReportFragment.InterfaceC1750a
        public void onStart() {
            C1774i0.this.m9299f();
        }
    }

    private C1774i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m9295i(C1774i0 c1774i0) {
        AbstractC19074t.m100208f(c1774i0, "this$0");
        c1774i0.m9302j();
        c1774i0.m9303k();
    }

    /* renamed from: l */
    public static final InterfaceC1801w m9296l() {
        return f7319x.m9305a();
    }

    /* renamed from: d */
    public final void m9297d() {
        int i11 = this.f7322q - 1;
        this.f7322q = i11;
        if (i11 == 0) {
            Handler handler = this.f7325t;
            AbstractC19074t.m100205c(handler);
            handler.postDelayed(this.f7327v, 700L);
        }
    }

    /* renamed from: e */
    public final void m9298e() {
        int i11 = this.f7322q + 1;
        this.f7322q = i11;
        if (i11 == 1) {
            if (this.f7323r) {
                this.f7326u.m9400i(AbstractC1785o.a.ON_RESUME);
                this.f7323r = false;
            } else {
                Handler handler = this.f7325t;
                AbstractC19074t.m100205c(handler);
                handler.removeCallbacks(this.f7327v);
            }
        }
    }

    /* renamed from: f */
    public final void m9299f() {
        int i11 = this.f7321p + 1;
        this.f7321p = i11;
        if (i11 == 1 && this.f7324s) {
            this.f7326u.m9400i(AbstractC1785o.a.ON_START);
            this.f7324s = false;
        }
    }

    /* renamed from: g */
    public final void m9300g() {
        this.f7321p--;
        m9303k();
    }

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        return this.f7326u;
    }

    /* renamed from: h */
    public final void m9301h(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f7325t = new Handler();
        this.f7326u.m9400i(AbstractC1785o.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        AbstractC19074t.m100206d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: j */
    public final void m9302j() {
        if (this.f7322q == 0) {
            this.f7323r = true;
            this.f7326u.m9400i(AbstractC1785o.a.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void m9303k() {
        if (this.f7321p == 0 && this.f7323r) {
            this.f7326u.m9400i(AbstractC1785o.a.ON_STOP);
            this.f7324s = true;
        }
    }
}
