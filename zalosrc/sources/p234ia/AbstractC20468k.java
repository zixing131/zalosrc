package p234ia;

import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p342m6.AbstractC22870a;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22872b;
import p342m6.C22890k;
import p633x5.AbstractC29339d0;

/* renamed from: ia.k */
/* loaded from: classes3.dex */
public abstract class AbstractC20468k {

    /* renamed from: a */
    protected final C20471n f100673a;

    /* renamed from: b */
    private final AtomicInteger f100674b;

    /* renamed from: c */
    private final AtomicBoolean f100675c;

    public AbstractC20468k() {
        this.f100674b = new AtomicInteger(0);
        this.f100675c = new AtomicBoolean(false);
        this.f100673a = new C20471n();
    }

    /* renamed from: a */
    public AbstractC22888j m106503a(final Executor executor, final Callable callable, final AbstractC22870a abstractC22870a) {
        boolean z11;
        if (this.f100674b.get() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19726o(z11);
        if (abstractC22870a.mo117559a()) {
            return AbstractC22894m.m117602d();
        }
        final C22872b c22872b = new C22872b();
        final C22890k c22890k = new C22890k(c22872b.m117562b());
        this.f100673a.m106521a(new Executor() { // from class: ia.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                AbstractC22870a abstractC22870a2 = abstractC22870a;
                C22872b c22872b2 = c22872b;
                C22890k c22890k2 = c22890k;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e11) {
                    if (abstractC22870a2.mo117559a()) {
                        c22872b2.m117561a();
                    } else {
                        c22890k2.m117595b(e11);
                    }
                    throw e11;
                }
            }
        }, new Runnable() { // from class: ia.z
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20468k.this.m106507g(abstractC22870a, c22872b, callable, c22890k);
            }
        });
        return c22890k.m117594a();
    }

    /* renamed from: b */
    public abstract void mo34579b();

    /* renamed from: c */
    public void m106504c() {
        this.f100674b.incrementAndGet();
    }

    /* renamed from: d */
    protected abstract void mo34580d();

    /* renamed from: e */
    public void m106505e(Executor executor) {
        m106506f(executor);
    }

    /* renamed from: f */
    public AbstractC22888j m106506f(Executor executor) {
        boolean z11;
        if (this.f100674b.get() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19726o(z11);
        final C22890k c22890k = new C22890k();
        this.f100673a.m106521a(executor, new Runnable() { // from class: ia.x
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20468k.this.m106508h(c22890k);
            }
        });
        return c22890k.m117594a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m106507g(AbstractC22870a abstractC22870a, C22872b c22872b, Callable callable, C22890k c22890k) {
        try {
            if (abstractC22870a.mo117559a()) {
                c22872b.m117561a();
                return;
            }
            try {
                if (!this.f100675c.get()) {
                    mo34579b();
                    this.f100675c.set(true);
                }
                if (abstractC22870a.mo117559a()) {
                    c22872b.m117561a();
                    return;
                }
                Object call = callable.call();
                if (abstractC22870a.mo117559a()) {
                    c22872b.m117561a();
                } else {
                    c22890k.m117596c(call);
                }
            } catch (RuntimeException e11) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11);
            }
        } catch (Exception e12) {
            if (abstractC22870a.mo117559a()) {
                c22872b.m117561a();
            } else {
                c22890k.m117595b(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m106508h(C22890k c22890k) {
        boolean z11;
        int decrementAndGet = this.f100674b.decrementAndGet();
        if (decrementAndGet >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19726o(z11);
        if (decrementAndGet == 0) {
            mo34580d();
            this.f100675c.set(false);
        }
        AbstractC29339d0.m146477a();
        c22890k.m117596c(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC20468k(C20471n c20471n) {
        this.f100674b = new AtomicInteger(0);
        this.f100675c = new AtomicBoolean(false);
        this.f100673a = c20471n;
    }
}
