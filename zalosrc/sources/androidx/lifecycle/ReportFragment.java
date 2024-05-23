package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1785o;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public class ReportFragment extends Fragment {

    /* renamed from: q */
    public static final C1751b f7278q = new C1751b(null);

    /* renamed from: p */
    private InterfaceC1750a f7279p;

    /* renamed from: androidx.lifecycle.ReportFragment$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1750a {
        /* renamed from: a */
        void mo9245a();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.ReportFragment$b */
    /* loaded from: classes.dex */
    public static final class C1751b {
        private C1751b() {
        }

        public /* synthetic */ C1751b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m9246a(Activity activity, AbstractC1785o.a aVar) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(aVar, "event");
            if (activity instanceof InterfaceC1801w) {
                AbstractC1785o lifecycle = ((InterfaceC1801w) activity).getLifecycle();
                if (lifecycle instanceof C1805y) {
                    ((C1805y) lifecycle).m9400i(aVar);
                }
            }
        }

        /* renamed from: b */
        public final ReportFragment m9247b(Activity activity) {
            AbstractC19074t.m100208f(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC19074t.m100206d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) findFragmentByTag;
        }

        /* renamed from: c */
        public final void m9248c(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                C1752c.Companion.m9249a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.ReportFragment$c */
    /* loaded from: classes.dex */
    public static final class C1752c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* renamed from: androidx.lifecycle.ReportFragment$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final void m9249a(Activity activity) {
                AbstractC19074t.m100208f(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new C1752c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m9249a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9246a(activity, AbstractC1785o.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9246a(activity, AbstractC1785o.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9246a(activity, AbstractC1785o.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9246a(activity, AbstractC1785o.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9246a(activity, AbstractC1785o.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            ReportFragment.f7278q.m9246a(activity, AbstractC1785o.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
        }
    }

    /* renamed from: a */
    private final void m9239a(AbstractC1785o.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            C1751b c1751b = f7278q;
            Activity activity = getActivity();
            AbstractC19074t.m100207e(activity, "activity");
            c1751b.m9246a(activity, aVar);
        }
    }

    /* renamed from: b */
    private final void m9240b(InterfaceC1750a interfaceC1750a) {
        if (interfaceC1750a != null) {
            interfaceC1750a.mo9245a();
        }
    }

    /* renamed from: c */
    private final void m9241c(InterfaceC1750a interfaceC1750a) {
        if (interfaceC1750a != null) {
            interfaceC1750a.onResume();
        }
    }

    /* renamed from: d */
    private final void m9242d(InterfaceC1750a interfaceC1750a) {
        if (interfaceC1750a != null) {
            interfaceC1750a.onStart();
        }
    }

    /* renamed from: e */
    public static final void m9243e(Activity activity) {
        f7278q.m9248c(activity);
    }

    /* renamed from: f */
    public final void m9244f(InterfaceC1750a interfaceC1750a) {
        this.f7279p = interfaceC1750a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m9240b(this.f7279p);
        m9239a(AbstractC1785o.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m9239a(AbstractC1785o.a.ON_DESTROY);
        this.f7279p = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m9239a(AbstractC1785o.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m9241c(this.f7279p);
        m9239a(AbstractC1785o.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m9242d(this.f7279p);
        m9239a(AbstractC1785o.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m9239a(AbstractC1785o.a.ON_STOP);
    }
}
