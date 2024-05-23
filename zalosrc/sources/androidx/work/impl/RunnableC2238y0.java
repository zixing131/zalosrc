package androidx.work.impl;

import android.content.Context;
import androidx.work.AbstractC2246n;
import androidx.work.AbstractC2252t;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.InterfaceC2136b;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.InterfaceC2196a;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p535u2.AbstractC26979z;
import p535u2.C26967n;
import p535u2.C26976w;
import p535u2.InterfaceC26951b;
import p535u2.InterfaceC26977x;
import p565v2.AbstractC27465s;
import p565v2.C27449e0;
import p565v2.C27451f0;
import p565v2.ExecutorC27472z;
import p565v2.RunnableC27447d0;
import p595w2.InterfaceC28696c;

/* renamed from: androidx.work.impl.y0 */
/* loaded from: classes2.dex */
public class RunnableC2238y0 implements Runnable {

    /* renamed from: H */
    static final String f9403H = AbstractC2253u.m11897i("WorkerWrapper");

    /* renamed from: A */
    private InterfaceC26977x f9404A;

    /* renamed from: B */
    private InterfaceC26951b f9405B;

    /* renamed from: C */
    private List f9406C;

    /* renamed from: D */
    private String f9407D;

    /* renamed from: p */
    Context f9411p;

    /* renamed from: q */
    private final String f9412q;

    /* renamed from: r */
    private WorkerParameters.C2133a f9413r;

    /* renamed from: s */
    C26976w f9414s;

    /* renamed from: t */
    AbstractC2252t f9415t;

    /* renamed from: u */
    InterfaceC28696c f9416u;

    /* renamed from: w */
    private C2138c f9418w;

    /* renamed from: x */
    private InterfaceC2136b f9419x;

    /* renamed from: y */
    private InterfaceC2196a f9420y;

    /* renamed from: z */
    private WorkDatabase f9421z;

    /* renamed from: v */
    AbstractC2252t.a f9417v = AbstractC2252t.a.m11889a();

    /* renamed from: E */
    C2230c f9408E = C2230c.m11809t();

    /* renamed from: F */
    final C2230c f9409F = C2230c.m11809t();

    /* renamed from: G */
    private volatile int f9410G = -256;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.y0$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ InterfaceFutureC6534a f9422p;

        a(InterfaceFutureC6534a interfaceFutureC6534a) {
            this.f9422p = interfaceFutureC6534a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RunnableC2238y0.this.f9409F.isCancelled()) {
                return;
            }
            try {
                this.f9422p.get();
                AbstractC2253u.m11895e().mo11898a(RunnableC2238y0.f9403H, "Starting work for " + RunnableC2238y0.this.f9414s.f127499c);
                RunnableC2238y0 runnableC2238y0 = RunnableC2238y0.this;
                runnableC2238y0.f9409F.mo11800r(runnableC2238y0.f9415t.startWork());
            } catch (Throwable th2) {
                RunnableC2238y0.this.f9409F.mo11799q(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.y0$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f9424p;

        b(String str) {
            this.f9424p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    AbstractC2252t.a aVar = (AbstractC2252t.a) RunnableC2238y0.this.f9409F.get();
                    if (aVar == null) {
                        AbstractC2253u.m11895e().mo11900c(RunnableC2238y0.f9403H, RunnableC2238y0.this.f9414s.f127499c + " returned a null result. Treating it as a failure.");
                    } else {
                        AbstractC2253u.m11895e().mo11898a(RunnableC2238y0.f9403H, RunnableC2238y0.this.f9414s.f127499c + " returned a " + aVar + ".");
                        RunnableC2238y0.this.f9417v = aVar;
                    }
                } catch (InterruptedException e11) {
                    e = e11;
                    AbstractC2253u.m11895e().mo11901d(RunnableC2238y0.f9403H, this.f9424p + " failed because it threw an exception/error", e);
                } catch (CancellationException e12) {
                    AbstractC2253u.m11895e().mo11903g(RunnableC2238y0.f9403H, this.f9424p + " was cancelled", e12);
                } catch (ExecutionException e13) {
                    e = e13;
                    AbstractC2253u.m11895e().mo11901d(RunnableC2238y0.f9403H, this.f9424p + " failed because it threw an exception/error", e);
                }
                RunnableC2238y0.this.m11843j();
            } catch (Throwable th2) {
                RunnableC2238y0.this.m11843j();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.y0$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        Context f9426a;

        /* renamed from: b */
        AbstractC2252t f9427b;

        /* renamed from: c */
        InterfaceC2196a f9428c;

        /* renamed from: d */
        InterfaceC28696c f9429d;

        /* renamed from: e */
        C2138c f9430e;

        /* renamed from: f */
        WorkDatabase f9431f;

        /* renamed from: g */
        C26976w f9432g;

        /* renamed from: h */
        private final List f9433h;

        /* renamed from: i */
        WorkerParameters.C2133a f9434i = new WorkerParameters.C2133a();

        public c(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, InterfaceC2196a interfaceC2196a, WorkDatabase workDatabase, C26976w c26976w, List list) {
            this.f9426a = context.getApplicationContext();
            this.f9429d = interfaceC28696c;
            this.f9428c = interfaceC2196a;
            this.f9430e = c2138c;
            this.f9431f = workDatabase;
            this.f9432g = c26976w;
            this.f9433h = list;
        }

        /* renamed from: b */
        public RunnableC2238y0 m11846b() {
            return new RunnableC2238y0(this);
        }

        /* renamed from: c */
        public c m11847c(WorkerParameters.C2133a c2133a) {
            if (c2133a != null) {
                this.f9434i = c2133a;
            }
            return this;
        }
    }

    RunnableC2238y0(c cVar) {
        this.f9411p = cVar.f9426a;
        this.f9416u = cVar.f9429d;
        this.f9420y = cVar.f9428c;
        C26976w c26976w = cVar.f9432g;
        this.f9414s = c26976w;
        this.f9412q = c26976w.f127497a;
        this.f9413r = cVar.f9434i;
        this.f9415t = cVar.f9427b;
        C2138c c2138c = cVar.f9430e;
        this.f9418w = c2138c;
        this.f9419x = c2138c.m11470a();
        WorkDatabase workDatabase = cVar.f9431f;
        this.f9421z = workDatabase;
        this.f9404A = workDatabase.mo11565L();
        this.f9405B = this.f9421z.mo11560G();
        this.f9406C = cVar.f9433h;
    }

    /* renamed from: b */
    private String m11827b(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f9412q);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    /* renamed from: f */
    private void m11828f(AbstractC2252t.a aVar) {
        if (aVar instanceof AbstractC2252t.a.c) {
            AbstractC2253u.m11895e().mo11902f(f9403H, "Worker result SUCCESS for " + this.f9407D);
            if (this.f9414s.m138982m()) {
                m11832l();
                return;
            } else {
                m11836q();
                return;
            }
        }
        if (aVar instanceof AbstractC2252t.a.b) {
            AbstractC2253u.m11895e().mo11902f(f9403H, "Worker result RETRY for " + this.f9407D);
            m11831k();
            return;
        }
        AbstractC2253u.m11895e().mo11902f(f9403H, "Worker result FAILURE for " + this.f9407D);
        if (this.f9414s.m138982m()) {
            m11832l();
        } else {
            m11844p();
        }
    }

    /* renamed from: h */
    private void m11829h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f9404A.mo139007i(str2) != C2149h0.c.CANCELLED) {
                this.f9404A.mo139018t(C2149h0.c.FAILED, str2);
            }
            linkedList.addAll(this.f9405B.mo138905a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m11830i(InterfaceFutureC6534a interfaceFutureC6534a) {
        if (this.f9409F.isCancelled()) {
            interfaceFutureC6534a.cancel(true);
        }
    }

    /* renamed from: k */
    private void m11831k() {
        this.f9421z.m342e();
        try {
            this.f9404A.mo139018t(C2149h0.c.ENQUEUED, this.f9412q);
            this.f9404A.mo139021w(this.f9412q, this.f9419x.mo11468a());
            this.f9404A.mo138998E(this.f9412q, this.f9414s.m138977h());
            this.f9404A.mo139015q(this.f9412q, -1L);
            this.f9421z.m339E();
        } finally {
            this.f9421z.m347j();
            m11833m(true);
        }
    }

    /* renamed from: l */
    private void m11832l() {
        this.f9421z.m342e();
        try {
            this.f9404A.mo139021w(this.f9412q, this.f9419x.mo11468a());
            this.f9404A.mo139018t(C2149h0.c.ENQUEUED, this.f9412q);
            this.f9404A.mo138995B(this.f9412q);
            this.f9404A.mo138998E(this.f9412q, this.f9414s.m138977h());
            this.f9404A.mo138999a(this.f9412q);
            this.f9404A.mo139015q(this.f9412q, -1L);
            this.f9421z.m339E();
        } finally {
            this.f9421z.m347j();
            m11833m(false);
        }
    }

    /* renamed from: m */
    private void m11833m(boolean z11) {
        this.f9421z.m342e();
        try {
            if (!this.f9421z.mo11565L().mo139024z()) {
                AbstractC27465s.m140515c(this.f9411p, RescheduleReceiver.class, false);
            }
            if (z11) {
                this.f9404A.mo139018t(C2149h0.c.ENQUEUED, this.f9412q);
                this.f9404A.mo139002d(this.f9412q, this.f9410G);
                this.f9404A.mo139015q(this.f9412q, -1L);
            }
            this.f9421z.m339E();
            this.f9421z.m347j();
            this.f9408E.mo11798p(Boolean.valueOf(z11));
        } catch (Throwable th2) {
            this.f9421z.m347j();
            throw th2;
        }
    }

    /* renamed from: n */
    private void m11834n() {
        C2149h0.c mo139007i = this.f9404A.mo139007i(this.f9412q);
        if (mo139007i == C2149h0.c.RUNNING) {
            AbstractC2253u.m11895e().mo11898a(f9403H, "Status for " + this.f9412q + " is RUNNING; not doing any work and rescheduling for later execution");
            m11833m(true);
            return;
        }
        AbstractC2253u.m11895e().mo11898a(f9403H, "Status for " + this.f9412q + " is " + mo139007i + " ; not doing any work");
        m11833m(false);
    }

    /* renamed from: o */
    private void m11835o() {
        C2148h mo11439a;
        if (m11837r()) {
            return;
        }
        this.f9421z.m342e();
        try {
            C26976w c26976w = this.f9414s;
            if (c26976w.f127498b != C2149h0.c.ENQUEUED) {
                m11834n();
                this.f9421z.m339E();
                AbstractC2253u.m11895e().mo11898a(f9403H, this.f9414s.f127499c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((c26976w.m138982m() || this.f9414s.m138981l()) && this.f9419x.mo11468a() < this.f9414s.m138973c()) {
                AbstractC2253u.m11895e().mo11898a(f9403H, String.format("Delaying execution for %s because it is being executed before schedule.", this.f9414s.f127499c));
                m11833m(true);
                this.f9421z.m339E();
                return;
            }
            this.f9421z.m339E();
            this.f9421z.m347j();
            if (this.f9414s.m138982m()) {
                mo11439a = this.f9414s.f127501e;
            } else {
                AbstractC2246n m11883b = this.f9418w.m11475f().m11883b(this.f9414s.f127500d);
                if (m11883b == null) {
                    AbstractC2253u.m11895e().mo11900c(f9403H, "Could not create Input Merger " + this.f9414s.f127500d);
                    m11844p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f9414s.f127501e);
                arrayList.addAll(this.f9404A.mo139011m(this.f9412q));
                mo11439a = m11883b.mo11439a(arrayList);
            }
            C2148h c2148h = mo11439a;
            UUID fromString = UUID.fromString(this.f9412q);
            List list = this.f9406C;
            WorkerParameters.C2133a c2133a = this.f9413r;
            C26976w c26976w2 = this.f9414s;
            WorkerParameters workerParameters = new WorkerParameters(fromString, c2148h, list, c2133a, c26976w2.f127507k, c26976w2.m138975f(), this.f9418w.m11473d(), this.f9416u, this.f9418w.m11483n(), new C27451f0(this.f9421z, this.f9416u), new C27449e0(this.f9421z, this.f9420y, this.f9416u));
            if (this.f9415t == null) {
                this.f9415t = this.f9418w.m11483n().m11877b(this.f9411p, this.f9414s.f127499c, workerParameters);
            }
            AbstractC2252t abstractC2252t = this.f9415t;
            if (abstractC2252t == null) {
                AbstractC2253u.m11895e().mo11900c(f9403H, "Could not create Worker " + this.f9414s.f127499c);
                m11844p();
                return;
            }
            if (abstractC2252t.isUsed()) {
                AbstractC2253u.m11895e().mo11900c(f9403H, "Received an already-used Worker " + this.f9414s.f127499c + "; Worker Factory should return new instances");
                m11844p();
                return;
            }
            this.f9415t.setUsed();
            if (m11838s()) {
                if (m11837r()) {
                    return;
                }
                RunnableC27447d0 runnableC27447d0 = new RunnableC27447d0(this.f9411p, this.f9414s, this.f9415t, workerParameters.m11452b(), this.f9416u);
                this.f9416u.mo143749a().execute(runnableC27447d0);
                final InterfaceFutureC6534a m140487b = runnableC27447d0.m140487b();
                this.f9409F.mo5907b(new Runnable() { // from class: androidx.work.impl.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC2238y0.this.m11830i(m140487b);
                    }
                }, new ExecutorC27472z());
                m140487b.mo5907b(new a(m140487b), this.f9416u.mo143749a());
                this.f9409F.mo5907b(new b(this.f9407D), this.f9416u.mo143751c());
                return;
            }
            m11834n();
        } finally {
            this.f9421z.m347j();
        }
    }

    /* renamed from: q */
    private void m11836q() {
        this.f9421z.m342e();
        try {
            this.f9404A.mo139018t(C2149h0.c.SUCCEEDED, this.f9412q);
            this.f9404A.mo139019u(this.f9412q, ((AbstractC2252t.a.c) this.f9417v).m11894e());
            long mo11468a = this.f9419x.mo11468a();
            for (String str : this.f9405B.mo138905a(this.f9412q)) {
                if (this.f9404A.mo139007i(str) == C2149h0.c.BLOCKED && this.f9405B.mo138906b(str)) {
                    AbstractC2253u.m11895e().mo11902f(f9403H, "Setting status to enqueued for " + str);
                    this.f9404A.mo139018t(C2149h0.c.ENQUEUED, str);
                    this.f9404A.mo139021w(str, mo11468a);
                }
            }
            this.f9421z.m339E();
            this.f9421z.m347j();
            m11833m(false);
        } catch (Throwable th2) {
            this.f9421z.m347j();
            m11833m(false);
            throw th2;
        }
    }

    /* renamed from: r */
    private boolean m11837r() {
        if (this.f9410G == -256) {
            return false;
        }
        AbstractC2253u.m11895e().mo11898a(f9403H, "Work interrupted for " + this.f9407D);
        if (this.f9404A.mo139007i(this.f9412q) == null) {
            m11833m(false);
        } else {
            m11833m(!r0.m11545c());
        }
        return true;
    }

    /* renamed from: s */
    private boolean m11838s() {
        boolean z11;
        this.f9421z.m342e();
        try {
            if (this.f9404A.mo139007i(this.f9412q) == C2149h0.c.ENQUEUED) {
                this.f9404A.mo139018t(C2149h0.c.RUNNING, this.f9412q);
                this.f9404A.mo138996C(this.f9412q);
                this.f9404A.mo139002d(this.f9412q, -256);
                z11 = true;
            } else {
                z11 = false;
            }
            this.f9421z.m339E();
            this.f9421z.m347j();
            return z11;
        } catch (Throwable th2) {
            this.f9421z.m347j();
            throw th2;
        }
    }

    /* renamed from: c */
    public InterfaceFutureC6534a m11839c() {
        return this.f9408E;
    }

    /* renamed from: d */
    public C26967n m11840d() {
        return AbstractC26979z.m139035a(this.f9414s);
    }

    /* renamed from: e */
    public C26976w m11841e() {
        return this.f9414s;
    }

    /* renamed from: g */
    public void m11842g(int i11) {
        this.f9410G = i11;
        m11837r();
        this.f9409F.cancel(true);
        if (this.f9415t != null && this.f9409F.isCancelled()) {
            this.f9415t.stop(i11);
            return;
        }
        AbstractC2253u.m11895e().mo11898a(f9403H, "WorkSpec " + this.f9414s + " is already done. Not interrupting.");
    }

    /* renamed from: j */
    void m11843j() {
        if (!m11837r()) {
            this.f9421z.m342e();
            try {
                C2149h0.c mo139007i = this.f9404A.mo139007i(this.f9412q);
                this.f9421z.mo11564K().mo138965b(this.f9412q);
                if (mo139007i == null) {
                    m11833m(false);
                } else if (mo139007i == C2149h0.c.RUNNING) {
                    m11828f(this.f9417v);
                } else if (!mo139007i.m11545c()) {
                    this.f9410G = -512;
                    m11831k();
                }
                this.f9421z.m339E();
                this.f9421z.m347j();
            } catch (Throwable th2) {
                this.f9421z.m347j();
                throw th2;
            }
        }
    }

    /* renamed from: p */
    void m11844p() {
        this.f9421z.m342e();
        try {
            m11829h(this.f9412q);
            C2148h m11893e = ((AbstractC2252t.a.C32643a) this.f9417v).m11893e();
            this.f9404A.mo138998E(this.f9412q, this.f9414s.m138977h());
            this.f9404A.mo139019u(this.f9412q, m11893e);
            this.f9421z.m339E();
        } finally {
            this.f9421z.m347j();
            m11833m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9407D = m11827b(this.f9406C);
        m11835o();
    }
}
