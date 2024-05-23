package mx;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mm0.AbstractC23350e;
import mx.C23470g;

/* renamed from: mx.g */
/* loaded from: classes4.dex */
public class C23470g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u */
    public static final String f113983u = "mx.g";

    /* renamed from: x */
    private static C23470g f113986x;

    /* renamed from: p */
    private boolean f113988p;

    /* renamed from: q */
    private WeakReference f113989q;

    /* renamed from: r */
    private d f113990r = new d();

    /* renamed from: s */
    private final Handler f113991s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    private Runnable f113992t;

    /* renamed from: v */
    private static b f113984v = new b() { // from class: mx.d
        @Override // mx.C23470g.b
        /* renamed from: a */
        public final void mo123223a(C23470g.c cVar) {
            cVar.mo123233b();
        }
    };

    /* renamed from: w */
    private static b f113985w = new b() { // from class: mx.e
        @Override // mx.C23470g.b
        /* renamed from: a */
        public final void mo123223a(C23470g.c cVar) {
            cVar.mo123232a();
        }
    };

    /* renamed from: y */
    private static boolean f113987y = false;

    /* renamed from: mx.g$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mx.g$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo123223a(c cVar);
    }

    /* renamed from: mx.g$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo123232a();

        /* renamed from: b */
        void mo123233b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mx.g$d */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a */
        private final List f113993a;

        /* renamed from: a */
        public a m123234a(c cVar) {
            final WeakReference weakReference = new WeakReference(cVar);
            this.f113993a.add(weakReference);
            return new a() { // from class: mx.h
            };
        }

        /* renamed from: b */
        public void m123235b(b bVar) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : this.f113993a) {
                try {
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        bVar.mo123223a(cVar);
                    } else {
                        arrayList.add(weakReference);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122775e(C23470g.f113983u, "Listener threw exception!", e11);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f113993a.removeAll(arrayList);
            }
        }

        private d() {
            this.f113993a = new CopyOnWriteArrayList();
        }
    }

    /* renamed from: c */
    public static C23470g m123225c() {
        C23470g c23470g = f113986x;
        if (c23470g != null) {
            return c23470g;
        }
        throw new IllegalStateException("Foreground is not initialised - first invocation must use parameterised init/get");
    }

    /* renamed from: d */
    public static C23470g m123226d(Application application) {
        if (f113986x == null) {
            C23470g c23470g = new C23470g();
            f113986x = c23470g;
            application.registerActivityLifecycleCallbacks(c23470g);
        }
        f113987y = true;
        return f113986x;
    }

    /* renamed from: f */
    public static boolean m123227f() {
        return f113987y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m123228g(WeakReference weakReference) {
        m123229h((Activity) weakReference.get());
    }

    /* renamed from: h */
    private void m123229h(Activity activity) {
        if (this.f113988p && activity == this.f113989q.get() && activity != null && !activity.isChangingConfigurations()) {
            this.f113988p = false;
            this.f113990r.m123235b(f113985w);
        }
    }

    /* renamed from: b */
    public a m123230b(c cVar) {
        return this.f113990r.m123234a(cVar);
    }

    /* renamed from: e */
    public boolean m123231e() {
        return this.f113988p;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!activity.isChangingConfigurations()) {
            final WeakReference weakReference = new WeakReference(activity);
            Handler handler = this.f113991s;
            Runnable runnable = new Runnable() { // from class: mx.f
                @Override // java.lang.Runnable
                public final void run() {
                    C23470g.this.m123228g(weakReference);
                }
            };
            this.f113992t = runnable;
            handler.postDelayed(runnable, 2000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f113989q = new WeakReference(activity);
        Runnable runnable = this.f113992t;
        if (runnable != null) {
            this.f113991s.removeCallbacks(runnable);
        }
        if (!this.f113988p && activity != null && !activity.isChangingConfigurations()) {
            this.f113988p = true;
            this.f113990r.m123235b(f113984v);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Runnable runnable = this.f113992t;
        if (runnable != null) {
            this.f113991s.removeCallbacks(runnable);
        }
        m123229h(activity);
    }
}
