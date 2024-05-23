package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p148f3.C18710b;

/* renamed from: androidx.concurrent.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC1245a implements InterfaceFutureC6534a {

    /* renamed from: s */
    static final boolean f4842s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: t */
    private static final Logger f4843t = Logger.getLogger(AbstractC1245a.class.getName());

    /* renamed from: u */
    static final b f4844u;

    /* renamed from: v */
    private static final Object f4845v;

    /* renamed from: p */
    volatile Object f4846p;

    /* renamed from: q */
    volatile e f4847q;

    /* renamed from: r */
    volatile h f4848r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo5914a(AbstractC1245a abstractC1245a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo5915b(AbstractC1245a abstractC1245a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo5916c(AbstractC1245a abstractC1245a, h hVar, h hVar2);

        /* renamed from: d */
        abstract void mo5917d(h hVar, h hVar2);

        /* renamed from: e */
        abstract void mo5918e(h hVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: c */
        static final c f4849c;

        /* renamed from: d */
        static final c f4850d;

        /* renamed from: a */
        final boolean f4851a;

        /* renamed from: b */
        final Throwable f4852b;

        static {
            if (AbstractC1245a.f4842s) {
                f4850d = null;
                f4849c = null;
            } else {
                f4850d = new c(false, null);
                f4849c = new c(true, null);
            }
        }

        c(boolean z11, Throwable th2) {
            this.f4851a = z11;
            this.f4852b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b */
        static final d f4853b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f4854a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* loaded from: classes2.dex */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f4854a = (Throwable) AbstractC1245a.m5898g(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f4855d = new e(null, null);

        /* renamed from: a */
        final Runnable f4856a;

        /* renamed from: b */
        final Executor f4857b;

        /* renamed from: c */
        e f4858c;

        e(Runnable runnable, Executor executor) {
            this.f4856a = runnable;
            this.f4857b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f4859a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater f4860b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater f4861c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater f4862d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater f4863e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f4859a = atomicReferenceFieldUpdater;
            this.f4860b = atomicReferenceFieldUpdater2;
            this.f4861c = atomicReferenceFieldUpdater3;
            this.f4862d = atomicReferenceFieldUpdater4;
            this.f4863e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: a */
        boolean mo5914a(AbstractC1245a abstractC1245a, e eVar, e eVar2) {
            return AbstractC1246b.m5921a(this.f4862d, abstractC1245a, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: b */
        boolean mo5915b(AbstractC1245a abstractC1245a, Object obj, Object obj2) {
            return AbstractC1246b.m5921a(this.f4863e, abstractC1245a, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: c */
        boolean mo5916c(AbstractC1245a abstractC1245a, h hVar, h hVar2) {
            return AbstractC1246b.m5921a(this.f4861c, abstractC1245a, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: d */
        void mo5917d(h hVar, h hVar2) {
            this.f4860b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: e */
        void mo5918e(h hVar, Thread thread) {
            this.f4859a.lazySet(hVar, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$g */
    /* loaded from: classes2.dex */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: a */
        boolean mo5914a(AbstractC1245a abstractC1245a, e eVar, e eVar2) {
            synchronized (abstractC1245a) {
                try {
                    if (abstractC1245a.f4847q == eVar) {
                        abstractC1245a.f4847q = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: b */
        boolean mo5915b(AbstractC1245a abstractC1245a, Object obj, Object obj2) {
            synchronized (abstractC1245a) {
                try {
                    if (abstractC1245a.f4846p == obj) {
                        abstractC1245a.f4846p = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: c */
        boolean mo5916c(AbstractC1245a abstractC1245a, h hVar, h hVar2) {
            synchronized (abstractC1245a) {
                try {
                    if (abstractC1245a.f4848r == hVar) {
                        abstractC1245a.f4848r = hVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: d */
        void mo5917d(h hVar, h hVar2) {
            hVar.f4866b = hVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC1245a.b
        /* renamed from: e */
        void mo5918e(h hVar, Thread thread) {
            hVar.f4865a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.concurrent.futures.a$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c */
        static final h f4864c = new h(false);

        /* renamed from: a */
        volatile Thread f4865a;

        /* renamed from: b */
        volatile h f4866b;

        h(boolean z11) {
        }

        /* renamed from: a */
        void m5919a(h hVar) {
            AbstractC1245a.f4844u.mo5917d(this, hVar);
        }

        /* renamed from: b */
        void m5920b() {
            Thread thread = this.f4865a;
            if (thread != null) {
                this.f4865a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            AbstractC1245a.f4844u.mo5918e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, C18710b.f94009e), AtomicReferenceFieldUpdater.newUpdater(AbstractC1245a.class, h.class, "r"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1245a.class, e.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1245a.class, Object.class, "p"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f4844u = gVar;
        if (th != null) {
            f4843t.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4845v = new Object();
    }

    /* renamed from: c */
    private void m5896c(StringBuilder sb2) {
        try {
            Object m5903q = m5903q(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m5906x(m5903q));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    /* renamed from: e */
    private static CancellationException m5897e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: g */
    static Object m5898g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    private e m5899h(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4847q;
        } while (!f4844u.mo5914a(this, eVar2, e.f4855d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f4858c;
            eVar4.f4858c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: i */
    static void m5900i(AbstractC1245a abstractC1245a) {
        abstractC1245a.m5904t();
        abstractC1245a.mo5908d();
        e m5899h = abstractC1245a.m5899h(null);
        while (m5899h != null) {
            e eVar = m5899h.f4858c;
            m5901j(m5899h.f4856a, m5899h.f4857b);
            m5899h = eVar;
        }
    }

    /* renamed from: j */
    private static void m5901j(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f4843t.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* renamed from: m */
    private Object m5902m(Object obj) {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f4845v) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f4854a);
        }
        throw m5897e("Task was cancelled.", ((c) obj).f4852b);
    }

    /* renamed from: q */
    static Object m5903q(Future future) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: t */
    private void m5904t() {
        h hVar;
        do {
            hVar = this.f4848r;
        } while (!f4844u.mo5916c(this, hVar, h.f4864c));
        while (hVar != null) {
            hVar.m5920b();
            hVar = hVar.f4866b;
        }
    }

    /* renamed from: u */
    private void m5905u(h hVar) {
        hVar.f4865a = null;
        while (true) {
            h hVar2 = this.f4848r;
            if (hVar2 == h.f4864c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f4866b;
                if (hVar2.f4865a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f4866b = hVar4;
                    if (hVar3.f4865a == null) {
                        break;
                    }
                } else if (!f4844u.mo5916c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* renamed from: x */
    private String m5906x(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC6534a
    /* renamed from: b */
    public final void mo5907b(Runnable runnable, Executor executor) {
        m5898g(runnable);
        m5898g(executor);
        e eVar = this.f4847q;
        if (eVar != e.f4855d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4858c = eVar;
                if (f4844u.mo5914a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f4847q;
                }
            } while (eVar != e.f4855d);
        }
        m5901j(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean z12;
        c cVar;
        Object obj = this.f4846p;
        if (obj == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (f4842s) {
                cVar = new c(z11, new CancellationException("Future.cancel() was called."));
            } else if (z11) {
                cVar = c.f4849c;
            } else {
                cVar = c.f4850d;
            }
            if (f4844u.mo5915b(this, obj, cVar)) {
                if (z11) {
                    m5909r();
                }
                m5900i(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    protected void mo5908d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4846p;
        if ((obj != null) & true) {
            return m5902m(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f4848r;
            if (hVar != h.f4864c) {
                h hVar2 = new h();
                do {
                    hVar2.m5919a(hVar);
                    if (f4844u.mo5916c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m5905u(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4846p;
                            if ((obj2 != null) & true) {
                                return m5902m(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m5905u(hVar2);
                    } else {
                        hVar = this.f4848r;
                    }
                } while (hVar != h.f4864c);
            }
            return m5902m(this.f4846p);
        }
        while (nanos > 0) {
            Object obj3 = this.f4846p;
            if ((obj3 != null) & true) {
                return m5902m(obj3);
            }
            if (!Thread.interrupted()) {
                nanos = nanoTime - System.nanoTime();
            } else {
                throw new InterruptedException();
            }
        }
        String abstractC1245a = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j12 = -nanos;
            long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(convert);
            boolean z11 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z11) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z11) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractC1245a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4846p instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f4846p != null) & true;
    }

    /* renamed from: r */
    protected void m5909r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    protected String m5910s() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m5896c(sb2);
        } else {
            try {
                str = m5910s();
            } catch (RuntimeException e11) {
                str = "Exception thrown from implementation: " + e11.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m5896c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo5911v(Object obj) {
        if (obj == null) {
            obj = f4845v;
        }
        if (f4844u.mo5915b(this, null, obj)) {
            m5900i(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public boolean m5912w(Throwable th2) {
        if (f4844u.mo5915b(this, null, new d((Throwable) m5898g(th2)))) {
            m5900i(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean m5913y() {
        Object obj = this.f4846p;
        if ((obj instanceof c) && ((c) obj).f4851a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f4846p;
        if ((obj2 != null) & true) {
            return m5902m(obj2);
        }
        h hVar = this.f4848r;
        if (hVar != h.f4864c) {
            h hVar2 = new h();
            do {
                hVar2.m5919a(hVar);
                if (f4844u.mo5916c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m5905u(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f4846p;
                    } while (!((obj != null) & true));
                    return m5902m(obj);
                }
                hVar = this.f4848r;
            } while (hVar != h.f4864c);
        }
        return m5902m(this.f4846p);
    }
}
