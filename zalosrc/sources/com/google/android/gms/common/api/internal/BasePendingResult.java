package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p504s5.HandlerC26145m;
import p664y.AbstractC30228a;
import p669y4.AbstractC30286c;
import p669y4.InterfaceC30288e;
import p669y4.InterfaceC30289f;

@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends InterfaceC30289f> extends AbstractC30286c {

    /* renamed from: m */
    static final ThreadLocal f16216m = new C4118n1();

    /* renamed from: b */
    protected final HandlerC4076a f16218b;

    /* renamed from: c */
    protected final WeakReference f16219c;

    /* renamed from: g */
    private InterfaceC30289f f16223g;

    /* renamed from: h */
    private Status f16224h;

    /* renamed from: i */
    private volatile boolean f16225i;

    /* renamed from: j */
    private boolean f16226j;

    /* renamed from: k */
    private boolean f16227k;

    @KeepName
    private C4121o1 mResultGuardian;

    /* renamed from: a */
    private final Object f16217a = new Object();

    /* renamed from: d */
    private final CountDownLatch f16220d = new CountDownLatch(1);

    /* renamed from: e */
    private final ArrayList f16221e = new ArrayList();

    /* renamed from: f */
    private final AtomicReference f16222f = new AtomicReference();

    /* renamed from: l */
    private boolean f16228l = false;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes2.dex */
    public static class HandlerC4076a extends HandlerC26145m {
        public HandlerC4076a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    Log.wtf("BasePendingResult", "Don't know how to handle message: " + i11, new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).m19280e(Status.f16170y);
                return;
            }
            Pair pair = (Pair) message.obj;
            AbstractC30228a.m149044a(pair.first);
            InterfaceC30289f interfaceC30289f = (InterfaceC30289f) pair.second;
            try {
                throw null;
            } catch (RuntimeException e11) {
                BasePendingResult.m19275m(interfaceC30289f);
                throw e11;
            }
        }
    }

    public BasePendingResult(AbstractC4073c abstractC4073c) {
        Looper mainLooper;
        if (abstractC4073c != null) {
            mainLooper = abstractC4073c.mo19262k();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f16218b = new HandlerC4076a(mainLooper);
        this.f16219c = new WeakReference(abstractC4073c);
    }

    /* renamed from: i */
    private final InterfaceC30289f m19272i() {
        InterfaceC30289f interfaceC30289f;
        synchronized (this.f16217a) {
            AbstractC4205o.m19727p(!this.f16225i, "Result has already been consumed.");
            AbstractC4205o.m19727p(m19282g(), "Result is not ready.");
            interfaceC30289f = this.f16223g;
            this.f16223g = null;
            this.f16225i = true;
        }
        C4079a1 c4079a1 = (C4079a1) this.f16222f.getAndSet(null);
        if (c4079a1 != null) {
            c4079a1.f16236a.f16261a.remove(this);
        }
        return (InterfaceC30289f) AbstractC4205o.m19722k(interfaceC30289f);
    }

    /* renamed from: j */
    private final void m19273j(InterfaceC30289f interfaceC30289f) {
        this.f16223g = interfaceC30289f;
        this.f16224h = interfaceC30289f.getStatus();
        this.f16220d.countDown();
        if (!this.f16226j && (this.f16223g instanceof InterfaceC30288e)) {
            this.mResultGuardian = new C4121o1(this, null);
        }
        ArrayList arrayList = this.f16221e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((AbstractC30286c.a) arrayList.get(i11)).mo19490a(this.f16224h);
        }
        this.f16221e.clear();
    }

    /* renamed from: m */
    public static void m19275m(InterfaceC30289f interfaceC30289f) {
        if (interfaceC30289f instanceof InterfaceC30288e) {
            try {
                ((InterfaceC30288e) interfaceC30289f).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(interfaceC30289f));
            }
        }
    }

    @Override // p669y4.AbstractC30286c
    /* renamed from: a */
    public final void mo19276a(AbstractC30286c.a aVar) {
        boolean z11;
        if (aVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "Callback cannot be null.");
        synchronized (this.f16217a) {
            try {
                if (m19282g()) {
                    aVar.mo19490a(this.f16224h);
                } else {
                    this.f16221e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p669y4.AbstractC30286c
    /* renamed from: b */
    public final InterfaceC30289f mo19277b(long j11, TimeUnit timeUnit) {
        if (j11 > 0) {
            AbstractC4205o.m19721j("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC4205o.m19727p(!this.f16225i, "Result has already been consumed.");
        AbstractC4205o.m19727p(true, "Cannot await if then() has been called.");
        try {
            if (!this.f16220d.await(j11, timeUnit)) {
                m19280e(Status.f16170y);
            }
        } catch (InterruptedException unused) {
            m19280e(Status.f16168w);
        }
        AbstractC4205o.m19727p(m19282g(), "Result is not ready.");
        return m19272i();
    }

    /* renamed from: c */
    public void m19278c() {
        synchronized (this.f16217a) {
            try {
                if (!this.f16226j && !this.f16225i) {
                    m19275m(this.f16223g);
                    this.f16226j = true;
                    m19273j(mo19279d(Status.f16171z));
                }
            } finally {
            }
        }
    }

    /* renamed from: d */
    public abstract InterfaceC30289f mo19279d(Status status);

    /* renamed from: e */
    public final void m19280e(Status status) {
        synchronized (this.f16217a) {
            try {
                if (!m19282g()) {
                    m19283h(mo19279d(status));
                    this.f16227k = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final boolean m19281f() {
        boolean z11;
        synchronized (this.f16217a) {
            z11 = this.f16226j;
        }
        return z11;
    }

    /* renamed from: g */
    public final boolean m19282g() {
        if (this.f16220d.getCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m19283h(InterfaceC30289f interfaceC30289f) {
        synchronized (this.f16217a) {
            try {
                if (!this.f16227k && !this.f16226j) {
                    m19282g();
                    AbstractC4205o.m19727p(!m19282g(), "Results have already been set");
                    AbstractC4205o.m19727p(!this.f16225i, "Result has already been consumed");
                    m19273j(interfaceC30289f);
                    return;
                }
                m19275m(interfaceC30289f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final void m19284l() {
        boolean z11 = true;
        if (!this.f16228l && !((Boolean) f16216m.get()).booleanValue()) {
            z11 = false;
        }
        this.f16228l = z11;
    }

    /* renamed from: n */
    public final boolean m19285n() {
        boolean m19281f;
        synchronized (this.f16217a) {
            try {
                if (((AbstractC4073c) this.f16219c.get()) != null) {
                    if (!this.f16228l) {
                    }
                    m19281f = m19281f();
                }
                m19278c();
                m19281f = m19281f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m19281f;
    }

    /* renamed from: o */
    public final void m19286o(C4079a1 c4079a1) {
        this.f16222f.set(c4079a1);
    }
}
