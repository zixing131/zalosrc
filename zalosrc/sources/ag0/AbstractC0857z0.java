package ag0;

import android.os.Binder;
import android.os.Process;
import bg0.C2797c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ag0.z0 */
/* loaded from: classes6.dex */
public abstract class AbstractC0857z0 {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private final e f3129a;

    /* renamed from: b */
    private final FutureTask f3130b;

    /* renamed from: c */
    private final AtomicBoolean f3131c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f3132d = new AtomicBoolean();

    /* renamed from: e */
    private volatile d f3133e = d.PENDING;

    /* renamed from: ag0.z0$a */
    /* loaded from: classes6.dex */
    public static final class a extends e {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC0857z0.this.f3132d.set(true);
            Object obj = null;
            try {
                try {
                    Process.setThreadPriority(10);
                    AbstractC0857z0 abstractC0857z0 = AbstractC0857z0.this;
                    Object[] m2442a = m2442a();
                    obj = abstractC0857z0.mo2432g(Arrays.copyOf(m2442a, m2442a.length));
                    Binder.flushPendingCommands();
                } catch (Exception unused) {
                    AbstractC0857z0.this.f3131c.set(true);
                }
                return obj;
            } finally {
                AbstractC0857z0.this.m2429q(obj);
            }
        }
    }

    /* renamed from: ag0.z0$b */
    /* loaded from: classes6.dex */
    public static final class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC0857z0.this.m2430r(get());
            } catch (InterruptedException | CancellationException unused) {
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            }
        }
    }

    /* renamed from: ag0.z0$c */
    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ag0.z0$d */
    /* loaded from: classes6.dex */
    public enum d {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: ag0.z0$e */
    /* loaded from: classes6.dex */
    public static abstract class e implements Callable {

        /* renamed from: a */
        public Object[] f3140a;

        /* renamed from: a */
        public final Object[] m2442a() {
            Object[] objArr = this.f3140a;
            if (objArr == null) {
                AbstractC19074t.m100223u("params");
            }
            return objArr;
        }

        /* renamed from: b */
        public final void m2443b(Object[] objArr) {
            AbstractC19074t.m100208f(objArr, "<set-?>");
            this.f3140a = objArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.z0$f */
    /* loaded from: classes6.dex */
    public static final class f implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Object f3142q;

        f(Object obj) {
            this.f3142q = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0857z0.this.m2428j(this.f3142q);
        }
    }

    /* renamed from: ag0.z0$g */
    /* loaded from: classes6.dex */
    static final class g implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Object[] f3144q;

        g(Object[] objArr) {
            this.f3144q = objArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0857z0 abstractC0857z0 = AbstractC0857z0.this;
            Object[] objArr = this.f3144q;
            abstractC0857z0.mo2440p(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public AbstractC0857z0() {
        a aVar = new a();
        this.f3129a = aVar;
        this.f3130b = new b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m2428j(Object obj) {
        if (m2435k()) {
            m2437m(obj);
        } else {
            mo2438n(obj);
        }
        this.f3133e = d.FINISHED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final Object m2429q(Object obj) {
        AbstractC19444a.m101697e(new f(obj));
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m2430r(Object obj) {
        if (!this.f3132d.get()) {
            m2429q(obj);
        }
    }

    /* renamed from: f */
    public final boolean m2431f(boolean z11) {
        this.f3131c.set(true);
        return this.f3130b.cancel(z11);
    }

    /* renamed from: g */
    protected abstract Object mo2432g(Object... objArr);

    /* renamed from: h */
    public final AbstractC0857z0 m2433h(C2797c c2797c, Object... objArr) {
        AbstractC19074t.m100208f(c2797c, "dispatcher");
        AbstractC19074t.m100208f(objArr, "params");
        if (this.f3133e != d.PENDING) {
            int i11 = AbstractC0803a1.f2774b[this.f3133e.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("Cannot execute task: with illegal state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f3133e = d.RUNNING;
        mo2439o();
        this.f3129a.m2443b(objArr);
        c2797c.mo13474a(this.f3130b);
        return this;
    }

    /* renamed from: i */
    public final AbstractC0857z0 m2434i(InterfaceC0806b1 interfaceC0806b1, Object... objArr) {
        AbstractC19074t.m100208f(interfaceC0806b1, "executor");
        AbstractC19074t.m100208f(objArr, "params");
        if (this.f3133e != d.PENDING) {
            int i11 = AbstractC0803a1.f2773a[this.f3133e.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("Cannot execute task: with illegal state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.f3133e = d.RUNNING;
        mo2439o();
        this.f3129a.m2443b(objArr);
        interfaceC0806b1.mo2040a(this.f3130b);
        return this;
    }

    /* renamed from: k */
    public final boolean m2435k() {
        return this.f3131c.get();
    }

    /* renamed from: l */
    protected void m2436l() {
    }

    /* renamed from: m */
    protected void m2437m(Object obj) {
        m2436l();
    }

    /* renamed from: n */
    protected void mo2438n(Object obj) {
    }

    /* renamed from: o */
    protected void mo2439o() {
    }

    /* renamed from: p */
    protected void mo2440p(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "values");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m2441s(Object... objArr) {
        AbstractC19074t.m100208f(objArr, "values");
        if (!m2435k()) {
            AbstractC19444a.m101697e(new g(objArr));
        }
    }
}
