package p232i8;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;

/* renamed from: i8.i */
/* loaded from: classes.dex */
public class C20397i {

    /* renamed from: a */
    private final Executor f100451a;

    /* renamed from: b */
    private AbstractC22888j f100452b = AbstractC22894m.m117604f(null);

    /* renamed from: c */
    private final Object f100453c = new Object();

    /* renamed from: d */
    private final ThreadLocal f100454d = new ThreadLocal();

    /* renamed from: i8.i$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C20397i.this.f100454d.set(Boolean.TRUE);
        }
    }

    /* renamed from: i8.i$b */
    /* loaded from: classes.dex */
    class b implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f100456a;

        b(Runnable runnable) {
            this.f100456a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f100456a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.i$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC22874c {

        /* renamed from: a */
        final /* synthetic */ Callable f100458a;

        c(Callable callable) {
            this.f100458a = callable;
        }

        @Override // p342m6.InterfaceC22874c
        /* renamed from: a */
        public Object mo27439a(AbstractC22888j abstractC22888j) {
            return this.f100458a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.i$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC22874c {
        d() {
        }

        @Override // p342m6.InterfaceC22874c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo27439a(AbstractC22888j abstractC22888j) {
            return null;
        }
    }

    public C20397i(Executor executor) {
        this.f100451a = executor;
        executor.execute(new a());
    }

    /* renamed from: d */
    private AbstractC22888j m106234d(AbstractC22888j abstractC22888j) {
        return abstractC22888j.mo117579h(this.f100451a, new d());
    }

    /* renamed from: e */
    private boolean m106235e() {
        return Boolean.TRUE.equals(this.f100454d.get());
    }

    /* renamed from: f */
    private InterfaceC22874c m106236f(Callable callable) {
        return new c(callable);
    }

    /* renamed from: b */
    public void m106237b() {
        if (m106235e()) {
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m106238c() {
        return this.f100451a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC22888j m106239g(Runnable runnable) {
        return m106240h(new b(runnable));
    }

    /* renamed from: h */
    public AbstractC22888j m106240h(Callable callable) {
        AbstractC22888j mo117579h;
        synchronized (this.f100453c) {
            mo117579h = this.f100452b.mo117579h(this.f100451a, m106236f(callable));
            this.f100452b = m106234d(mo117579h);
        }
        return mo117579h;
    }

    /* renamed from: i */
    public AbstractC22888j m106241i(Callable callable) {
        AbstractC22888j mo117581j;
        synchronized (this.f100453c) {
            mo117581j = this.f100452b.mo117581j(this.f100451a, m106236f(callable));
            this.f100452b = m106234d(mo117581j);
        }
        return mo117581j;
    }
}
