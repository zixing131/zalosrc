package p182g7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.C6508e;
import com.google.android.play.core.review.internal.zzu;
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

/* renamed from: g7.t */
/* loaded from: classes3.dex */
public final class C19278t {

    /* renamed from: o */
    private static final Map f95773o = new HashMap();

    /* renamed from: a */
    private final Context f95774a;

    /* renamed from: b */
    private final C19267i f95775b;

    /* renamed from: g */
    private boolean f95780g;

    /* renamed from: h */
    private final Intent f95781h;

    /* renamed from: l */
    private ServiceConnection f95785l;

    /* renamed from: m */
    private IInterface f95786m;

    /* renamed from: n */
    private final C6508e f95787n;

    /* renamed from: d */
    private final List f95777d = new ArrayList();

    /* renamed from: e */
    private final Set f95778e = new HashSet();

    /* renamed from: f */
    private final Object f95779f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f95783j = new IBinder.DeathRecipient() { // from class: g7.l
        public /* synthetic */ C19270l() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C19278t.m100990h(C19278t.this);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f95784k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f95776c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i */
    private final WeakReference f95782i = new WeakReference(null);

    public C19278t(Context context, C19267i c19267i, String str, Intent intent, C6508e c6508e, InterfaceC19273o interfaceC19273o, byte[] bArr) {
        this.f95774a = context;
        this.f95775b = c19267i;
        this.f95781h = intent;
        this.f95787n = c6508e;
    }

    /* renamed from: h */
    public static /* synthetic */ void m100990h(C19278t c19278t) {
        c19278t.f95775b.m100981d("reportBinderDeath", new Object[0]);
        AbstractC30228a.m149044a(c19278t.f95782i.get());
        c19278t.f95775b.m100981d("%s : Binder has died.", c19278t.f95776c);
        Iterator it = c19278t.f95777d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC19268j) it.next()).m100984c(c19278t.m100998s());
        }
        c19278t.f95777d.clear();
        c19278t.m100999t();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m100995m(C19278t c19278t, AbstractRunnableC19268j abstractRunnableC19268j) {
        if (c19278t.f95786m == null && !c19278t.f95780g) {
            c19278t.f95775b.m100981d("Initiate binding to the service.", new Object[0]);
            c19278t.f95777d.add(abstractRunnableC19268j);
            ServiceConnectionC19277s serviceConnectionC19277s = new ServiceConnectionC19277s(c19278t, null);
            c19278t.f95785l = serviceConnectionC19277s;
            c19278t.f95780g = true;
            if (!c19278t.f95774a.bindService(c19278t.f95781h, serviceConnectionC19277s, 1)) {
                c19278t.f95775b.m100981d("Failed to bind to the service.", new Object[0]);
                c19278t.f95780g = false;
                Iterator it = c19278t.f95777d.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC19268j) it.next()).m100984c(new zzu());
                }
                c19278t.f95777d.clear();
                return;
            }
            return;
        }
        if (c19278t.f95780g) {
            c19278t.f95775b.m100981d("Waiting to bind to the service.", new Object[0]);
            c19278t.f95777d.add(abstractRunnableC19268j);
        } else {
            abstractRunnableC19268j.run();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m100996n(C19278t c19278t) {
        c19278t.f95775b.m100981d("linkToDeath", new Object[0]);
        try {
            c19278t.f95786m.asBinder().linkToDeath(c19278t.f95783j, 0);
        } catch (RemoteException e11) {
            c19278t.f95775b.m100980c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m100997o(C19278t c19278t) {
        c19278t.f95775b.m100981d("unlinkToDeath", new Object[0]);
        c19278t.f95786m.asBinder().unlinkToDeath(c19278t.f95783j, 0);
    }

    /* renamed from: s */
    private final RemoteException m100998s() {
        return new RemoteException(String.valueOf(this.f95776c).concat(" : Binder has died."));
    }

    /* renamed from: t */
    public final void m100999t() {
        synchronized (this.f95779f) {
            try {
                Iterator it = this.f95778e.iterator();
                while (it.hasNext()) {
                    ((C22890k) it.next()).m117597d(m100998s());
                }
                this.f95778e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final Handler m101000c() {
        Handler handler;
        Map map = f95773o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f95776c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f95776c, 10);
                    handlerThread.start();
                    map.put(this.f95776c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f95776c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m101001e() {
        return this.f95786m;
    }

    /* renamed from: p */
    public final void m101002p(AbstractRunnableC19268j abstractRunnableC19268j, C22890k c22890k) {
        synchronized (this.f95779f) {
            this.f95778e.add(c22890k);
            c22890k.m117594a().mo117574c(new InterfaceC22878e() { // from class: g7.k

                /* renamed from: b */
                public final /* synthetic */ C22890k f95764b;

                public /* synthetic */ C19269k(C22890k c22890k2) {
                    r2 = c22890k2;
                }

                @Override // p342m6.InterfaceC22878e
                /* renamed from: a */
                public final void mo16804a(AbstractC22888j abstractC22888j) {
                    C19278t.this.m101003q(r2, abstractC22888j);
                }
            });
        }
        synchronized (this.f95779f) {
            try {
                if (this.f95784k.getAndIncrement() > 0) {
                    this.f95775b.m100978a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m101000c().post(new C19271m(this, abstractRunnableC19268j.m100983b(), abstractRunnableC19268j));
    }

    /* renamed from: q */
    public final /* synthetic */ void m101003q(C22890k c22890k, AbstractC22888j abstractC22888j) {
        synchronized (this.f95779f) {
            this.f95778e.remove(c22890k);
        }
    }

    /* renamed from: r */
    public final void m101004r(C22890k c22890k) {
        synchronized (this.f95779f) {
            this.f95778e.remove(c22890k);
        }
        synchronized (this.f95779f) {
            try {
                if (this.f95784k.get() > 0 && this.f95784k.decrementAndGet() > 0) {
                    this.f95775b.m100981d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    m101000c().post(new C19272n(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
