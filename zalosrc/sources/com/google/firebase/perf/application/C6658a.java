package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractC1733g;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p319l9.C22152a;
import p345m9.AbstractC22960g;
import p441q9.C25197k;
import p476r9.AbstractC25702j;
import p476r9.C25693a;
import p476r9.C25699g;
import p476r9.EnumC25694b;
import p476r9.EnumC25695c;
import p507s9.C26196m;
import p507s9.EnumC26187d;

/* renamed from: com.google.firebase.perf.application.a */
/* loaded from: classes3.dex */
public class C6658a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: G */
    private static final C22152a f36752G = C22152a.m115524e();

    /* renamed from: H */
    private static volatile C6658a f36753H;

    /* renamed from: A */
    private final boolean f36754A;

    /* renamed from: B */
    private Timer f36755B;

    /* renamed from: C */
    private Timer f36756C;

    /* renamed from: D */
    private EnumC26187d f36757D;

    /* renamed from: E */
    private boolean f36758E;

    /* renamed from: F */
    private boolean f36759F;

    /* renamed from: p */
    private final WeakHashMap f36760p;

    /* renamed from: q */
    private final WeakHashMap f36761q;

    /* renamed from: r */
    private final WeakHashMap f36762r;

    /* renamed from: s */
    private final WeakHashMap f36763s;

    /* renamed from: t */
    private final Map f36764t;

    /* renamed from: u */
    private final Set f36765u;

    /* renamed from: v */
    private Set f36766v;

    /* renamed from: w */
    private final AtomicInteger f36767w;

    /* renamed from: x */
    private final C25197k f36768x;

    /* renamed from: y */
    private final C6662a f36769y;

    /* renamed from: z */
    private final C25693a f36770z;

    /* renamed from: com.google.firebase.perf.application.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo34020a();
    }

    /* renamed from: com.google.firebase.perf.application.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        void onUpdateAppState(EnumC26187d enumC26187d);
    }

    C6658a(C25197k c25197k, C25693a c25693a) {
        this(c25197k, c25693a, C6662a.m34042g(), m34005g());
    }

    /* renamed from: b */
    public static C6658a m34003b() {
        if (f36753H == null) {
            synchronized (C6658a.class) {
                try {
                    if (f36753H == null) {
                        f36753H = new C6658a(C25197k.m130415k(), new C25693a());
                    }
                } finally {
                }
            }
        }
        return f36753H;
    }

    /* renamed from: c */
    public static String m34004c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    /* renamed from: g */
    private static boolean m34005g() {
        return C6661d.m34022a();
    }

    /* renamed from: l */
    private void m34006l() {
        synchronized (this.f36766v) {
            try {
                for (a aVar : this.f36766v) {
                    if (aVar != null) {
                        aVar.mo34020a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    private void m34007m(Activity activity) {
        Trace trace = (Trace) this.f36763s.get(activity);
        if (trace == null) {
            return;
        }
        this.f36763s.remove(activity);
        C25699g m34026e = ((C6661d) this.f36761q.get(activity)).m34026e();
        if (!m34026e.m132613d()) {
            f36752G.m115534k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            AbstractC25702j.m132616a(trace, (AbstractC22960g.a) m34026e.m132612c());
            trace.stop();
        }
    }

    /* renamed from: n */
    private void m34008n(String str, Timer timer, Timer timer2) {
        if (!this.f36769y.m34059K()) {
            return;
        }
        C26196m.b m134753C = C26196m.m134738r0().m134761O(str).m134759L(timer.m34294e()).m134760N(timer.m34293d(timer2)).m134753C(SessionManager.getInstance().perfSession().m34246a());
        int andSet = this.f36767w.getAndSet(0);
        synchronized (this.f36764t) {
            try {
                m134753C.m134755E(this.f36764t);
                if (andSet != 0) {
                    m134753C.m134757H(EnumC25694b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.f36764t.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f36768x.m130431C((C26196m) m134753C.m35109q(), EnumC26187d.FOREGROUND_BACKGROUND);
    }

    /* renamed from: o */
    private void m34009o(Activity activity) {
        if (m34015h() && this.f36769y.m34059K()) {
            C6661d c6661d = new C6661d(activity);
            this.f36761q.put(activity, c6661d);
            if (activity instanceof FragmentActivity) {
                C6660c c6660c = new C6660c(this.f36770z, this.f36768x, this, c6661d);
                this.f36762r.put(activity, c6660c);
                ((FragmentActivity) activity).m8906Z1().mo8998i(c6660c, true);
            }
        }
    }

    /* renamed from: q */
    private void m34010q(EnumC26187d enumC26187d) {
        this.f36757D = enumC26187d;
        synchronized (this.f36765u) {
            try {
                Iterator it = this.f36765u.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f36757D);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public EnumC26187d m34011a() {
        return this.f36757D;
    }

    /* renamed from: d */
    public void m34012d(String str, long j11) {
        synchronized (this.f36764t) {
            try {
                Long l11 = (Long) this.f36764t.get(str);
                if (l11 == null) {
                    this.f36764t.put(str, Long.valueOf(j11));
                } else {
                    this.f36764t.put(str, Long.valueOf(l11.longValue() + j11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m34013e(int i11) {
        this.f36767w.addAndGet(i11);
    }

    /* renamed from: f */
    public boolean m34014f() {
        return this.f36759F;
    }

    /* renamed from: h */
    protected boolean m34015h() {
        return this.f36754A;
    }

    /* renamed from: i */
    public synchronized void m34016i(Context context) {
        if (this.f36758E) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f36758E = true;
        }
    }

    /* renamed from: j */
    public void m34017j(a aVar) {
        synchronized (this.f36766v) {
            this.f36766v.add(aVar);
        }
    }

    /* renamed from: k */
    public void m34018k(WeakReference weakReference) {
        synchronized (this.f36765u) {
            this.f36765u.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m34009o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f36761q.remove(activity);
        if (this.f36762r.containsKey(activity)) {
            ((FragmentActivity) activity).m8906Z1().mo9000k((AbstractC1733g.a) this.f36762r.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f36760p.isEmpty()) {
                this.f36755B = this.f36770z.m132598a();
                this.f36760p.put(activity, Boolean.TRUE);
                if (this.f36759F) {
                    m34010q(EnumC26187d.FOREGROUND);
                    m34006l();
                    this.f36759F = false;
                } else {
                    m34008n(EnumC25695c.BACKGROUND_TRACE_NAME.toString(), this.f36756C, this.f36755B);
                    m34010q(EnumC26187d.FOREGROUND);
                }
            } else {
                this.f36760p.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (m34015h() && this.f36769y.m34059K()) {
                if (!this.f36761q.containsKey(activity)) {
                    m34009o(activity);
                }
                ((C6661d) this.f36761q.get(activity)).m34024c();
                Trace trace = new Trace(m34004c(activity), this.f36768x, this.f36770z, this);
                trace.start();
                this.f36763s.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (m34015h()) {
                m34007m(activity);
            }
            if (this.f36760p.containsKey(activity)) {
                this.f36760p.remove(activity);
                if (this.f36760p.isEmpty()) {
                    this.f36756C = this.f36770z.m132598a();
                    m34008n(EnumC25695c.FOREGROUND_TRACE_NAME.toString(), this.f36755B, this.f36756C);
                    m34010q(EnumC26187d.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: p */
    public void m34019p(WeakReference weakReference) {
        synchronized (this.f36765u) {
            this.f36765u.remove(weakReference);
        }
    }

    C6658a(C25197k c25197k, C25693a c25693a, C6662a c6662a, boolean z11) {
        this.f36760p = new WeakHashMap();
        this.f36761q = new WeakHashMap();
        this.f36762r = new WeakHashMap();
        this.f36763s = new WeakHashMap();
        this.f36764t = new HashMap();
        this.f36765u = new HashSet();
        this.f36766v = new HashSet();
        this.f36767w = new AtomicInteger(0);
        this.f36757D = EnumC26187d.BACKGROUND;
        this.f36758E = false;
        this.f36759F = true;
        this.f36768x = c25197k;
        this.f36770z = c25693a;
        this.f36769y = c6662a;
        this.f36754A = z11;
    }
}
