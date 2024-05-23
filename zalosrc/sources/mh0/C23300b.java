package mh0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import hh0.AbstractC20066d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: mh0.b */
/* loaded from: classes7.dex */
public class C23300b {

    /* renamed from: f */
    private static C23300b f113237f;

    /* renamed from: g */
    private static c f113238g;

    /* renamed from: a */
    private boolean f113239a = false;

    /* renamed from: b */
    private boolean f113240b = true;

    /* renamed from: c */
    private Handler f113241c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private List f113242d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private Runnable f113243e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh0.b$a */
    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ WeakReference f113244p;

        a(WeakReference weakReference) {
            this.f113244p = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C23300b.this.f113239a && C23300b.this.f113240b) {
                C23300b.this.f113239a = false;
                Iterator it = C23300b.this.f113242d.iterator();
                while (it.hasNext()) {
                    try {
                        ((b) it.next()).mo120497b(this.f113244p);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: mh0.b$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        void mo120496a(WeakReference weakReference);

        /* renamed from: b */
        void mo120497b(WeakReference weakReference);

        /* renamed from: c */
        void mo120498c(WeakReference weakReference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh0.b$c */
    /* loaded from: classes7.dex */
    public class c implements Application.ActivityLifecycleCallbacks {
        public c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C23300b.f113237f.m120507i(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C23300b.f113237f.m120508j(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    protected C23300b() {
        if (!AbstractC20066d.m104283b()) {
            f113238g = new c();
        }
    }

    /* renamed from: g */
    public static C23300b m120504g(Application application) {
        if (f113237f == null) {
            m120505h(application);
        }
        return f113237f;
    }

    /* renamed from: h */
    public static C23300b m120505h(Application application) {
        if (f113237f == null) {
            f113237f = new C23300b();
            if (!AbstractC20066d.m104283b()) {
                application.registerActivityLifecycleCallbacks(f113238g);
            }
        }
        return f113237f;
    }

    /* renamed from: f */
    public void m120506f(b bVar) {
        if (this.f113242d.contains(bVar)) {
            return;
        }
        this.f113242d.add(bVar);
    }

    /* renamed from: i */
    public void m120507i(Activity activity) {
        this.f113240b = true;
        Runnable runnable = this.f113243e;
        if (runnable != null) {
            this.f113241c.removeCallbacks(runnable);
        }
        WeakReference weakReference = new WeakReference(activity);
        Handler handler = this.f113241c;
        a aVar = new a(weakReference);
        this.f113243e = aVar;
        handler.postDelayed(aVar, 500L);
    }

    /* renamed from: j */
    public void m120508j(Activity activity) {
        this.f113240b = false;
        boolean z11 = !this.f113239a;
        this.f113239a = true;
        Runnable runnable = this.f113243e;
        if (runnable != null) {
            this.f113241c.removeCallbacks(runnable);
        }
        WeakReference weakReference = new WeakReference(activity);
        if (z11) {
            Iterator it = this.f113242d.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).mo120496a(weakReference);
                } catch (Exception unused) {
                }
            }
        }
        Iterator it2 = this.f113242d.iterator();
        while (it2.hasNext()) {
            try {
                ((b) it2.next()).mo120498c(weakReference);
            } catch (Exception unused2) {
            }
        }
    }
}
