package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
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

/* loaded from: classes2.dex */
public final class l43 {

    /* renamed from: o */
    private static final Map f23730o = new HashMap();

    /* renamed from: a */
    private final Context f23731a;

    /* renamed from: b */
    private final a43 f23732b;

    /* renamed from: g */
    private boolean f23737g;

    /* renamed from: h */
    private final Intent f23738h;

    /* renamed from: l */
    private ServiceConnection f23742l;

    /* renamed from: m */
    private IInterface f23743m;

    /* renamed from: n */
    private final i33 f23744n;

    /* renamed from: d */
    private final List f23734d = new ArrayList();

    /* renamed from: e */
    private final Set f23735e = new HashSet();

    /* renamed from: f */
    private final Object f23736f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f23740j = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.d43
        public /* synthetic */ d43() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            l43.m24118h(l43.this);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f23741k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f23733c = "OverlayDisplayService";

    /* renamed from: i */
    private final WeakReference f23739i = new WeakReference(null);

    public l43(Context context, a43 a43Var, String str, Intent intent, i33 i33Var, g43 g43Var, byte[] bArr) {
        this.f23731a = context;
        this.f23732b = a43Var;
        this.f23738h = intent;
        this.f23744n = i33Var;
    }

    /* renamed from: h */
    public static /* synthetic */ void m24118h(l43 l43Var) {
        l43Var.f23732b.m19981d("reportBinderDeath", new Object[0]);
        AbstractC30228a.m149044a(l43Var.f23739i.get());
        l43Var.f23732b.m19981d("%s : Binder has died.", l43Var.f23733c);
        Iterator it = l43Var.f23734d.iterator();
        while (it.hasNext()) {
            ((b43) it.next()).m20399c(l43Var.m24126s());
        }
        l43Var.f23734d.clear();
        l43Var.m24127t();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m24123m(l43 l43Var, b43 b43Var) {
        if (l43Var.f23743m == null && !l43Var.f23737g) {
            l43Var.f23732b.m19981d("Initiate binding to the service.", new Object[0]);
            l43Var.f23734d.add(b43Var);
            k43 k43Var = new k43(l43Var, null);
            l43Var.f23742l = k43Var;
            l43Var.f23737g = true;
            if (!l43Var.f23731a.bindService(l43Var.f23738h, k43Var, 1)) {
                l43Var.f23732b.m19981d("Failed to bind to the service.", new Object[0]);
                l43Var.f23737g = false;
                Iterator it = l43Var.f23734d.iterator();
                while (it.hasNext()) {
                    ((b43) it.next()).m20399c(new zzfrz());
                }
                l43Var.f23734d.clear();
                return;
            }
            return;
        }
        if (l43Var.f23737g) {
            l43Var.f23732b.m19981d("Waiting to bind to the service.", new Object[0]);
            l43Var.f23734d.add(b43Var);
        } else {
            b43Var.run();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m24124n(l43 l43Var) {
        l43Var.f23732b.m19981d("linkToDeath", new Object[0]);
        try {
            l43Var.f23743m.asBinder().linkToDeath(l43Var.f23740j, 0);
        } catch (RemoteException e11) {
            l43Var.f23732b.m19980c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m24125o(l43 l43Var) {
        l43Var.f23732b.m19981d("unlinkToDeath", new Object[0]);
        l43Var.f23743m.asBinder().unlinkToDeath(l43Var.f23740j, 0);
    }

    /* renamed from: s */
    private final RemoteException m24126s() {
        return new RemoteException(String.valueOf(this.f23733c).concat(" : Binder has died."));
    }

    /* renamed from: t */
    public final void m24127t() {
        synchronized (this.f23736f) {
            try {
                Iterator it = this.f23735e.iterator();
                while (it.hasNext()) {
                    ((C22890k) it.next()).m117597d(m24126s());
                }
                this.f23735e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final Handler m24128c() {
        Handler handler;
        Map map = f23730o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f23733c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f23733c, 10);
                    handlerThread.start();
                    map.put(this.f23733c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f23733c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m24129e() {
        return this.f23743m;
    }

    /* renamed from: p */
    public final void m24130p(b43 b43Var, C22890k c22890k) {
        synchronized (this.f23736f) {
            this.f23735e.add(c22890k);
            c22890k.m117594a().mo117574c(new InterfaceC22878e() { // from class: com.google.android.gms.internal.ads.c43

                /* renamed from: b */
                public final /* synthetic */ C22890k f18107b;

                public /* synthetic */ c43(C22890k c22890k2) {
                    r2 = c22890k2;
                }

                @Override // p342m6.InterfaceC22878e
                /* renamed from: a */
                public final void mo16804a(AbstractC22888j abstractC22888j) {
                    l43.this.m24131q(r2, abstractC22888j);
                }
            });
        }
        synchronized (this.f23736f) {
            try {
                if (this.f23741k.getAndIncrement() > 0) {
                    this.f23732b.m19978a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m24128c().post(new e43(this, b43Var.m20398b(), b43Var));
    }

    /* renamed from: q */
    public final /* synthetic */ void m24131q(C22890k c22890k, AbstractC22888j abstractC22888j) {
        synchronized (this.f23736f) {
            this.f23735e.remove(c22890k);
        }
    }

    /* renamed from: r */
    public final void m24132r() {
        synchronized (this.f23736f) {
            try {
                if (this.f23741k.get() > 0 && this.f23741k.decrementAndGet() > 0) {
                    this.f23732b.m19981d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                m24128c().post(new f43(this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
