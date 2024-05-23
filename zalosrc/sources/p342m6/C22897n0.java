package p342m6;

import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.n0 */
/* loaded from: classes.dex */
public final class C22897n0 extends AbstractC22888j {

    /* renamed from: a */
    private final Object f111518a = new Object();

    /* renamed from: b */
    private final C22889j0 f111519b = new C22889j0();

    /* renamed from: c */
    private boolean f111520c;

    /* renamed from: d */
    private volatile boolean f111521d;

    /* renamed from: e */
    private Object f111522e;

    /* renamed from: f */
    private Exception f111523f;

    /* renamed from: A */
    private final void m117611A() {
        if (!this.f111520c) {
        } else {
            throw DuplicateTaskCompletionException.m31525a(this);
        }
    }

    /* renamed from: B */
    private final void m117612B() {
        synchronized (this.f111518a) {
            try {
                if (!this.f111520c) {
                    return;
                }
                this.f111519b.m117592b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    private final void m117613y() {
        AbstractC4205o.m19727p(this.f111520c, "Task is not yet complete");
    }

    /* renamed from: z */
    private final void m117614z() {
        if (!this.f111521d) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: a */
    public final AbstractC22888j mo117572a(Executor executor, InterfaceC22876d interfaceC22876d) {
        this.f111519b.m117591a(new C22910z(executor, interfaceC22876d));
        m117612B();
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: b */
    public final AbstractC22888j mo117573b(Executor executor, InterfaceC22878e interfaceC22878e) {
        this.f111519b.m117591a(new C22873b0(executor, interfaceC22878e));
        m117612B();
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: c */
    public final AbstractC22888j mo117574c(InterfaceC22878e interfaceC22878e) {
        this.f111519b.m117591a(new C22873b0(AbstractC22892l.f111514a, interfaceC22878e));
        m117612B();
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: d */
    public final AbstractC22888j mo117575d(Executor executor, InterfaceC22880f interfaceC22880f) {
        this.f111519b.m117591a(new C22877d0(executor, interfaceC22880f));
        m117612B();
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: e */
    public final AbstractC22888j mo117576e(InterfaceC22880f interfaceC22880f) {
        mo117575d(AbstractC22892l.f111514a, interfaceC22880f);
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: f */
    public final AbstractC22888j mo117577f(Executor executor, InterfaceC22882g interfaceC22882g) {
        this.f111519b.m117591a(new C22881f0(executor, interfaceC22882g));
        m117612B();
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: g */
    public final AbstractC22888j mo117578g(InterfaceC22882g interfaceC22882g) {
        mo117577f(AbstractC22892l.f111514a, interfaceC22882g);
        return this;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: h */
    public final AbstractC22888j mo117579h(Executor executor, InterfaceC22874c interfaceC22874c) {
        C22897n0 c22897n0 = new C22897n0();
        this.f111519b.m117591a(new C22906v(executor, interfaceC22874c, c22897n0));
        m117612B();
        return c22897n0;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: i */
    public final AbstractC22888j mo117580i(InterfaceC22874c interfaceC22874c) {
        return mo117579h(AbstractC22892l.f111514a, interfaceC22874c);
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: j */
    public final AbstractC22888j mo117581j(Executor executor, InterfaceC22874c interfaceC22874c) {
        C22897n0 c22897n0 = new C22897n0();
        this.f111519b.m117591a(new C22908x(executor, interfaceC22874c, c22897n0));
        m117612B();
        return c22897n0;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: k */
    public final AbstractC22888j mo117582k(InterfaceC22874c interfaceC22874c) {
        return mo117581j(AbstractC22892l.f111514a, interfaceC22874c);
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: l */
    public final Exception mo117583l() {
        Exception exc;
        synchronized (this.f111518a) {
            exc = this.f111523f;
        }
        return exc;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: m */
    public final Object mo117584m() {
        Object obj;
        synchronized (this.f111518a) {
            try {
                m117613y();
                m117614z();
                Exception exc = this.f111523f;
                if (exc == null) {
                    obj = this.f111522e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: n */
    public final Object mo117585n(Class cls) {
        Object obj;
        synchronized (this.f111518a) {
            try {
                m117613y();
                m117614z();
                if (!cls.isInstance(this.f111523f)) {
                    Exception exc = this.f111523f;
                    if (exc == null) {
                        obj = this.f111522e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f111523f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: o */
    public final boolean mo117586o() {
        return this.f111521d;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: p */
    public final boolean mo117587p() {
        boolean z11;
        synchronized (this.f111518a) {
            z11 = this.f111520c;
        }
        return z11;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: q */
    public final boolean mo117588q() {
        boolean z11;
        synchronized (this.f111518a) {
            try {
                z11 = false;
                if (this.f111520c && !this.f111521d && this.f111523f == null) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: r */
    public final AbstractC22888j mo117589r(Executor executor, InterfaceC22886i interfaceC22886i) {
        C22897n0 c22897n0 = new C22897n0();
        this.f111519b.m117591a(new C22885h0(executor, interfaceC22886i, c22897n0));
        m117612B();
        return c22897n0;
    }

    @Override // p342m6.AbstractC22888j
    /* renamed from: s */
    public final AbstractC22888j mo117590s(InterfaceC22886i interfaceC22886i) {
        Executor executor = AbstractC22892l.f111514a;
        C22897n0 c22897n0 = new C22897n0();
        this.f111519b.m117591a(new C22885h0(executor, interfaceC22886i, c22897n0));
        m117612B();
        return c22897n0;
    }

    /* renamed from: t */
    public final void m117615t(Exception exc) {
        AbstractC4205o.m19723l(exc, "Exception must not be null");
        synchronized (this.f111518a) {
            m117611A();
            this.f111520c = true;
            this.f111523f = exc;
        }
        this.f111519b.m117592b(this);
    }

    /* renamed from: u */
    public final void m117616u(Object obj) {
        synchronized (this.f111518a) {
            m117611A();
            this.f111520c = true;
            this.f111522e = obj;
        }
        this.f111519b.m117592b(this);
    }

    /* renamed from: v */
    public final boolean m117617v() {
        synchronized (this.f111518a) {
            try {
                if (this.f111520c) {
                    return false;
                }
                this.f111520c = true;
                this.f111521d = true;
                this.f111519b.m117592b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w */
    public final boolean m117618w(Exception exc) {
        AbstractC4205o.m19723l(exc, "Exception must not be null");
        synchronized (this.f111518a) {
            try {
                if (this.f111520c) {
                    return false;
                }
                this.f111520c = true;
                this.f111523f = exc;
                this.f111519b.m117592b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public final boolean m117619x(Object obj) {
        synchronized (this.f111518a) {
            try {
                if (this.f111520c) {
                    return false;
                }
                this.f111520c = true;
                this.f111522e = obj;
                this.f111519b.m117592b(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
