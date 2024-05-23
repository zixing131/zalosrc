package p051c7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.C6491q;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p342m6.InterfaceC22878e;
import p664y.AbstractC30228a;

/* renamed from: c7.e0 */
/* loaded from: classes3.dex */
public final class C3309e0 {

    /* renamed from: o */
    private static final Map f14115o = new HashMap();

    /* renamed from: a */
    private final Context f14116a;

    /* renamed from: b */
    private final C3325t f14117b;

    /* renamed from: g */
    private boolean f14122g;

    /* renamed from: h */
    private final Intent f14123h;

    /* renamed from: l */
    private ServiceConnection f14127l;

    /* renamed from: m */
    private IInterface f14128m;

    /* renamed from: n */
    private final C6491q f14129n;

    /* renamed from: d */
    private final List f14119d = new ArrayList();

    /* renamed from: e */
    private final Set f14120e = new HashSet();

    /* renamed from: f */
    private final Object f14121f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f14125j = new IBinder.DeathRecipient() { // from class: c7.w
        public /* synthetic */ C3328w() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C3309e0.m16762j(C3309e0.this);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f14126k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f14118c = "AppUpdateService";

    /* renamed from: i */
    private final WeakReference f14124i = new WeakReference(null);

    public C3309e0(Context context, C3325t c3325t, String str, Intent intent, C6491q c6491q, InterfaceC3331z interfaceC3331z) {
        this.f14116a = context;
        this.f14117b = c3325t;
        this.f14123h = intent;
        this.f14129n = c6491q;
    }

    /* renamed from: j */
    public static /* synthetic */ void m16762j(C3309e0 c3309e0) {
        c3309e0.f14117b.m16800d("reportBinderDeath", new Object[0]);
        AbstractC30228a.m149044a(c3309e0.f14124i.get());
        c3309e0.f14117b.m16800d("%s : Binder has died.", c3309e0.f14118c);
        Iterator it = c3309e0.f14119d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC3326u) it.next()).m16803c(c3309e0.m16771v());
        }
        c3309e0.f14119d.clear();
        synchronized (c3309e0.f14121f) {
            c3309e0.m16772w();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m16766n(C3309e0 c3309e0, C22890k c22890k) {
        c3309e0.f14120e.add(c22890k);
        c22890k.m117594a().mo117574c(new InterfaceC22878e() { // from class: c7.v

            /* renamed from: b */
            public final /* synthetic */ C22890k f14145b;

            public /* synthetic */ C3327v(C22890k c22890k2) {
                r2 = c22890k2;
            }

            @Override // p342m6.InterfaceC22878e
            /* renamed from: a */
            public final void mo16804a(AbstractC22888j abstractC22888j) {
                C3309e0.this.m16776t(r2, abstractC22888j);
            }
        });
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m16768p(C3309e0 c3309e0, AbstractRunnableC3326u abstractRunnableC3326u) {
        if (c3309e0.f14128m == null && !c3309e0.f14122g) {
            c3309e0.f14117b.m16800d("Initiate binding to the service.", new Object[0]);
            c3309e0.f14119d.add(abstractRunnableC3326u);
            ServiceConnectionC3307d0 serviceConnectionC3307d0 = new ServiceConnectionC3307d0(c3309e0, null);
            c3309e0.f14127l = serviceConnectionC3307d0;
            c3309e0.f14122g = true;
            if (!c3309e0.f14116a.bindService(c3309e0.f14123h, serviceConnectionC3307d0, 1)) {
                c3309e0.f14117b.m16800d("Failed to bind to the service.", new Object[0]);
                c3309e0.f14122g = false;
                Iterator it = c3309e0.f14119d.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC3326u) it.next()).m16803c(new zzy());
                }
                c3309e0.f14119d.clear();
                return;
            }
            return;
        }
        if (c3309e0.f14122g) {
            c3309e0.f14117b.m16800d("Waiting to bind to the service.", new Object[0]);
            c3309e0.f14119d.add(abstractRunnableC3326u);
        } else {
            abstractRunnableC3326u.run();
        }
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m16769q(C3309e0 c3309e0) {
        c3309e0.f14117b.m16800d("linkToDeath", new Object[0]);
        try {
            c3309e0.f14128m.asBinder().linkToDeath(c3309e0.f14125j, 0);
        } catch (RemoteException e11) {
            c3309e0.f14117b.m16799c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m16770r(C3309e0 c3309e0) {
        c3309e0.f14117b.m16800d("unlinkToDeath", new Object[0]);
        c3309e0.f14128m.asBinder().unlinkToDeath(c3309e0.f14125j, 0);
    }

    /* renamed from: v */
    private final RemoteException m16771v() {
        return new RemoteException(String.valueOf(this.f14118c).concat(" : Binder has died."));
    }

    /* renamed from: w */
    public final void m16772w() {
        Iterator it = this.f14120e.iterator();
        while (it.hasNext()) {
            ((C22890k) it.next()).m117597d(m16771v());
        }
        this.f14120e.clear();
    }

    /* renamed from: c */
    public final Handler m16773c() {
        Handler handler;
        Map map = f14115o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f14118c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f14118c, 10);
                    handlerThread.start();
                    map.put(this.f14118c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f14118c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m16774e() {
        return this.f14128m;
    }

    /* renamed from: s */
    public final void m16775s(AbstractRunnableC3326u abstractRunnableC3326u, C22890k c22890k) {
        m16773c().post(new C3329x(this, abstractRunnableC3326u.m16802b(), c22890k, abstractRunnableC3326u));
    }

    /* renamed from: t */
    public final /* synthetic */ void m16776t(C22890k c22890k, AbstractC22888j abstractC22888j) {
        synchronized (this.f14121f) {
            this.f14120e.remove(c22890k);
        }
    }

    /* renamed from: u */
    public final void m16777u(C22890k c22890k) {
        synchronized (this.f14121f) {
            this.f14120e.remove(c22890k);
        }
        m16773c().post(new C3330y(this));
    }
}
