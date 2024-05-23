package p291k7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.zzag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p258j7.C20970q;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p342m6.InterfaceC22878e;
import p664y.AbstractC30228a;

/* renamed from: k7.g */
/* loaded from: classes3.dex */
public final class C21504g {

    /* renamed from: o */
    private static final Map f104529o = new HashMap();

    /* renamed from: a */
    private final Context f104530a;

    /* renamed from: b */
    private final C21536q1 f104531b;

    /* renamed from: g */
    private boolean f104536g;

    /* renamed from: h */
    private final Intent f104537h;

    /* renamed from: l */
    private ServiceConnection f104541l;

    /* renamed from: m */
    private IInterface f104542m;

    /* renamed from: n */
    private final C20970q f104543n;

    /* renamed from: d */
    private final List f104533d = new ArrayList();

    /* renamed from: e */
    private final Set f104534e = new HashSet();

    /* renamed from: f */
    private final Object f104535f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f104539j = new IBinder.DeathRecipient() { // from class: k7.t1
        public /* synthetic */ C21545t1() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C21504g.m111137j(C21504g.this);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f104540k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f104532c = "SplitInstallService";

    /* renamed from: i */
    private final WeakReference f104538i = new WeakReference(null);

    public C21504g(Context context, C21536q1 c21536q1, String str, Intent intent, C20970q c20970q, InterfaceC21489b interfaceC21489b) {
        this.f104530a = context;
        this.f104531b = c21536q1;
        this.f104537h = intent;
        this.f104543n = c20970q;
    }

    /* renamed from: j */
    public static /* synthetic */ void m111137j(C21504g c21504g) {
        c21504g.f104531b.m111197d("reportBinderDeath", new Object[0]);
        AbstractC30228a.m149044a(c21504g.f104538i.get());
        c21504g.f104531b.m111197d("%s : Binder has died.", c21504g.f104532c);
        Iterator it = c21504g.f104533d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC21539r1) it.next()).m111202b(c21504g.m111146v());
        }
        c21504g.f104533d.clear();
        synchronized (c21504g.f104535f) {
            c21504g.m111147w();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m111141n(C21504g c21504g, C22890k c22890k) {
        c21504g.f104534e.add(c22890k);
        c22890k.m117594a().mo117574c(new InterfaceC22878e() { // from class: k7.s1

            /* renamed from: b */
            public final /* synthetic */ C22890k f104578b;

            public /* synthetic */ C21542s1(C22890k c22890k2) {
                r2 = c22890k2;
            }

            @Override // p342m6.InterfaceC22878e
            /* renamed from: a */
            public final void mo16804a(AbstractC22888j abstractC22888j) {
                C21504g.this.m111151t(r2, abstractC22888j);
            }
        });
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m111143p(C21504g c21504g, AbstractRunnableC21539r1 abstractRunnableC21539r1) {
        if (c21504g.f104542m == null && !c21504g.f104536g) {
            c21504g.f104531b.m111197d("Initiate binding to the service.", new Object[0]);
            c21504g.f104533d.add(abstractRunnableC21539r1);
            ServiceConnectionC21501f serviceConnectionC21501f = new ServiceConnectionC21501f(c21504g, null);
            c21504g.f104541l = serviceConnectionC21501f;
            c21504g.f104536g = true;
            if (!c21504g.f104530a.bindService(c21504g.f104537h, serviceConnectionC21501f, 1)) {
                c21504g.f104531b.m111197d("Failed to bind to the service.", new Object[0]);
                c21504g.f104536g = false;
                Iterator it = c21504g.f104533d.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC21539r1) it.next()).m111202b(new zzag());
                }
                c21504g.f104533d.clear();
                return;
            }
            return;
        }
        if (c21504g.f104536g) {
            c21504g.f104531b.m111197d("Waiting to bind to the service.", new Object[0]);
            c21504g.f104533d.add(abstractRunnableC21539r1);
        } else {
            abstractRunnableC21539r1.run();
        }
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m111144q(C21504g c21504g) {
        c21504g.f104531b.m111197d("linkToDeath", new Object[0]);
        try {
            c21504g.f104542m.asBinder().linkToDeath(c21504g.f104539j, 0);
        } catch (RemoteException e11) {
            c21504g.f104531b.m111196c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m111145r(C21504g c21504g) {
        c21504g.f104531b.m111197d("unlinkToDeath", new Object[0]);
        c21504g.f104542m.asBinder().unlinkToDeath(c21504g.f104539j, 0);
    }

    /* renamed from: v */
    private final RemoteException m111146v() {
        return new RemoteException(String.valueOf(this.f104532c).concat(" : Binder has died."));
    }

    /* renamed from: w */
    public final void m111147w() {
        Iterator it = this.f104534e.iterator();
        while (it.hasNext()) {
            ((C22890k) it.next()).m117597d(m111146v());
        }
        this.f104534e.clear();
    }

    /* renamed from: c */
    public final Handler m111148c() {
        Handler handler;
        Map map = f104529o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f104532c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f104532c, 10);
                    handlerThread.start();
                    map.put(this.f104532c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f104532c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m111149e() {
        return this.f104542m;
    }

    /* renamed from: s */
    public final void m111150s(AbstractRunnableC21539r1 abstractRunnableC21539r1, C22890k c22890k) {
        m111148c().post(new C21548u1(this, abstractRunnableC21539r1.m111201a(), c22890k, abstractRunnableC21539r1));
    }

    /* renamed from: t */
    public final /* synthetic */ void m111151t(C22890k c22890k, AbstractC22888j abstractC22888j) {
        synchronized (this.f104535f) {
            this.f104534e.remove(c22890k);
        }
    }

    /* renamed from: u */
    public final void m111152u(C22890k c22890k) {
        synchronized (this.f104535f) {
            this.f104534e.remove(c22890k);
        }
        m111148c().post(new C21551v1(this));
    }
}
