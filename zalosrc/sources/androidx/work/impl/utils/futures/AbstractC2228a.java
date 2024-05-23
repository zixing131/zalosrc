package androidx.work.impl.utils.futures;

import androidx.concurrent.futures.AbstractC1246b;
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

/* renamed from: androidx.work.impl.utils.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC2228a implements InterfaceFutureC6534a {

    /* renamed from: s */
    static final boolean f9346s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: t */
    private static final Logger f9347t = Logger.getLogger(AbstractC2228a.class.getName());

    /* renamed from: u */
    static final b f9348u;

    /* renamed from: v */
    private static final Object f9349v;

    /* renamed from: p */
    volatile Object f9350p;

    /* renamed from: q */
    volatile e f9351q;

    /* renamed from: r */
    volatile i f9352r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo11801a(AbstractC2228a abstractC2228a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo11802b(AbstractC2228a abstractC2228a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo11803c(AbstractC2228a abstractC2228a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo11804d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo11805e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: c */
        static final c f9353c;

        /* renamed from: d */
        static final c f9354d;

        /* renamed from: a */
        final boolean f9355a;

        /* renamed from: b */
        final Throwable f9356b;

        static {
            if (AbstractC2228a.f9346s) {
                f9354d = null;
                f9353c = null;
            } else {
                f9354d = new c(false, null);
                f9353c = new c(true, null);
            }
        }

        c(boolean z11, Throwable th2) {
            this.f9355a = z11;
            this.f9356b = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b */
        static final d f9357b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f9358a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
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
            this.f9358a = (Throwable) AbstractC2228a.m11785e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        static final e f9359d = new e(null, null);

        /* renamed from: a */
        final Runnable f9360a;

        /* renamed from: b */
        final Executor f9361b;

        /* renamed from: c */
        e f9362c;

        e(Runnable runnable, Executor executor) {
            this.f9360a = runnable;
            this.f9361b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f9363a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater f9364b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater f9365c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater f9366d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater f9367e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f9363a = atomicReferenceFieldUpdater;
            this.f9364b = atomicReferenceFieldUpdater2;
            this.f9365c = atomicReferenceFieldUpdater3;
            this.f9366d = atomicReferenceFieldUpdater4;
            this.f9367e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: a */
        boolean mo11801a(AbstractC2228a abstractC2228a, e eVar, e eVar2) {
            return AbstractC1246b.m5921a(this.f9366d, abstractC2228a, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: b */
        boolean mo11802b(AbstractC2228a abstractC2228a, Object obj, Object obj2) {
            return AbstractC1246b.m5921a(this.f9367e, abstractC2228a, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: c */
        boolean mo11803c(AbstractC2228a abstractC2228a, i iVar, i iVar2) {
            return AbstractC1246b.m5921a(this.f9365c, abstractC2228a, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: d */
        void mo11804d(i iVar, i iVar2) {
            this.f9364b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: e */
        void mo11805e(i iVar, Thread thread) {
            this.f9363a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$g */
    /* loaded from: classes2.dex */
    public static final class g implements Runnable {

        /* renamed from: p */
        final AbstractC2228a f9368p;

        /* renamed from: q */
        final InterfaceFutureC6534a f9369q;

        g(AbstractC2228a abstractC2228a, InterfaceFutureC6534a interfaceFutureC6534a) {
            this.f9368p = abstractC2228a;
            this.f9369q = interfaceFutureC6534a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9368p.f9350p != this) {
                return;
            }
            if (AbstractC2228a.f9348u.mo11802b(this.f9368p, this, AbstractC2228a.m11790j(this.f9369q))) {
                AbstractC2228a.m11787g(this.f9368p);
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    /* loaded from: classes2.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: a */
        boolean mo11801a(AbstractC2228a abstractC2228a, e eVar, e eVar2) {
            synchronized (abstractC2228a) {
                try {
                    if (abstractC2228a.f9351q == eVar) {
                        abstractC2228a.f9351q = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: b */
        boolean mo11802b(AbstractC2228a abstractC2228a, Object obj, Object obj2) {
            synchronized (abstractC2228a) {
                try {
                    if (abstractC2228a.f9350p == obj) {
                        abstractC2228a.f9350p = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: c */
        boolean mo11803c(AbstractC2228a abstractC2228a, i iVar, i iVar2) {
            synchronized (abstractC2228a) {
                try {
                    if (abstractC2228a.f9352r == iVar) {
                        abstractC2228a.f9352r = iVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: d */
        void mo11804d(i iVar, i iVar2) {
            iVar.f9372b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2228a.b
        /* renamed from: e */
        void mo11805e(i iVar, Thread thread) {
            iVar.f9371a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.work.impl.utils.futures.a$i */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        static final i f9370c = new i(false);

        /* renamed from: a */
        volatile Thread f9371a;

        /* renamed from: b */
        volatile i f9372b;

        i(boolean z11) {
        }

        /* renamed from: a */
        void m11806a(i iVar) {
            AbstractC2228a.f9348u.mo11804d(this, iVar);
        }

        /* renamed from: b */
        void m11807b() {
            Thread thread = this.f9371a;
            if (thread != null) {
                this.f9371a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractC2228a.f9348u.mo11805e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, C18710b.f94009e), AtomicReferenceFieldUpdater.newUpdater(AbstractC2228a.class, i.class, "r"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2228a.class, e.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2228a.class, Object.class, "p"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f9348u = hVar;
        if (th != null) {
            f9347t.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9349v = new Object();
    }

    /* renamed from: a */
    private void m11783a(StringBuilder sb2) {
        try {
            Object m11791k = m11791k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m11794s(m11791k));
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

    /* renamed from: d */
    private static CancellationException m11784d(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    /* renamed from: e */
    static Object m11785e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: f */
    private e m11786f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f9351q;
        } while (!f9348u.mo11801a(this, eVar2, e.f9359d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f9362c;
            eVar4.f9362c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: g */
    static void m11787g(AbstractC2228a abstractC2228a) {
        e eVar = null;
        while (true) {
            abstractC2228a.m11792n();
            abstractC2228a.m11795c();
            e m11786f = abstractC2228a.m11786f(eVar);
            while (m11786f != null) {
                eVar = m11786f.f9362c;
                Runnable runnable = m11786f.f9360a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC2228a = gVar.f9368p;
                    if (abstractC2228a.f9350p == gVar) {
                        if (f9348u.mo11802b(abstractC2228a, gVar, m11790j(gVar.f9369q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m11788h(runnable, m11786f.f9361b);
                }
                m11786f = eVar;
            }
            return;
        }
    }

    /* renamed from: h */
    private static void m11788h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f9347t.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* renamed from: i */
    private Object m11789i(Object obj) {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f9349v) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f9358a);
        }
        throw m11784d("Task was cancelled.", ((c) obj).f9356b);
    }

    /* renamed from: j */
    static Object m11790j(InterfaceFutureC6534a interfaceFutureC6534a) {
        if (interfaceFutureC6534a instanceof AbstractC2228a) {
            Object obj = ((AbstractC2228a) interfaceFutureC6534a).f9350p;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f9355a) {
                    if (cVar.f9356b != null) {
                        return new c(false, cVar.f9356b);
                    }
                    return c.f9354d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = interfaceFutureC6534a.isCancelled();
        if ((!f9346s) & isCancelled) {
            return c.f9354d;
        }
        try {
            Object m11791k = m11791k(interfaceFutureC6534a);
            if (m11791k == null) {
                return f9349v;
            }
            return m11791k;
        } catch (CancellationException e11) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC6534a, e11));
            }
            return new c(false, e11);
        } catch (ExecutionException e12) {
            return new d(e12.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    /* renamed from: k */
    private static Object m11791k(Future future) {
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

    /* renamed from: n */
    private void m11792n() {
        i iVar;
        do {
            iVar = this.f9352r;
        } while (!f9348u.mo11803c(this, iVar, i.f9370c));
        while (iVar != null) {
            iVar.m11807b();
            iVar = iVar.f9372b;
        }
    }

    /* renamed from: o */
    private void m11793o(i iVar) {
        iVar.f9371a = null;
        while (true) {
            i iVar2 = this.f9352r;
            if (iVar2 == i.f9370c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f9372b;
                if (iVar2.f9371a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f9372b = iVar4;
                    if (iVar3.f9371a == null) {
                        break;
                    }
                } else if (!f9348u.mo11803c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: s */
    private String m11794s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC6534a
    /* renamed from: b */
    public final void mo5907b(Runnable runnable, Executor executor) {
        m11785e(runnable);
        m11785e(executor);
        e eVar = this.f9351q;
        if (eVar != e.f9359d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f9362c = eVar;
                if (f9348u.mo11801a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f9351q;
                }
            } while (eVar != e.f9359d);
        }
        m11788h(runnable, executor);
    }

    /* renamed from: c */
    protected void m11795c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean z12;
        c cVar;
        boolean z13;
        Object obj = this.f9350p;
        if (obj == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 | (obj instanceof g)) {
            if (f9346s) {
                cVar = new c(z11, new CancellationException("Future.cancel() was called."));
            } else if (z11) {
                cVar = c.f9353c;
            } else {
                cVar = c.f9354d;
            }
            boolean z14 = false;
            AbstractC2228a abstractC2228a = this;
            while (true) {
                if (f9348u.mo11802b(abstractC2228a, obj, cVar)) {
                    if (z11) {
                        abstractC2228a.m11796l();
                    }
                    m11787g(abstractC2228a);
                    if (!(obj instanceof g)) {
                        return true;
                    }
                    InterfaceFutureC6534a interfaceFutureC6534a = ((g) obj).f9369q;
                    if (interfaceFutureC6534a instanceof AbstractC2228a) {
                        abstractC2228a = (AbstractC2228a) interfaceFutureC6534a;
                        obj = abstractC2228a.f9350p;
                        if (obj == null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!(z13 | (obj instanceof g))) {
                            return true;
                        }
                        z14 = true;
                    } else {
                        interfaceFutureC6534a.cancel(z11);
                        return true;
                    }
                } else {
                    obj = abstractC2228a.f9350p;
                    if (!(obj instanceof g)) {
                        return z14;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f9350p;
            if ((obj != null) & (!(obj instanceof g))) {
                return m11789i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f9352r;
                if (iVar != i.f9370c) {
                    i iVar2 = new i();
                    do {
                        iVar2.m11806a(iVar);
                        if (f9348u.mo11803c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f9350p;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return m11789i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m11793o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m11793o(iVar2);
                        } else {
                            iVar = this.f9352r;
                        }
                    } while (iVar != i.f9370c);
                }
                return m11789i(this.f9350p);
            }
            while (nanos > 0) {
                Object obj3 = this.f9350p;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return m11789i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC2228a = toString();
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
            throw new TimeoutException(str + " for " + abstractC2228a);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9350p instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z11;
        if (this.f9350p != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return (!(r0 instanceof g)) & z11;
    }

    /* renamed from: l */
    protected void m11796l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    protected String m11797m() {
        Object obj = this.f9350p;
        if (obj instanceof g) {
            return "setFuture=[" + m11794s(((g) obj).f9369q) + "]";
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo11798p(Object obj) {
        if (obj == null) {
            obj = f9349v;
        }
        if (f9348u.mo11802b(this, null, obj)) {
            m11787g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo11799q(Throwable th2) {
        if (f9348u.mo11802b(this, null, new d((Throwable) m11785e(th2)))) {
            m11787g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo11800r(InterfaceFutureC6534a interfaceFutureC6534a) {
        d dVar;
        m11785e(interfaceFutureC6534a);
        Object obj = this.f9350p;
        if (obj == null) {
            if (interfaceFutureC6534a.isDone()) {
                if (!f9348u.mo11802b(this, null, m11790j(interfaceFutureC6534a))) {
                    return false;
                }
                m11787g(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC6534a);
            if (f9348u.mo11802b(this, null, gVar)) {
                try {
                    interfaceFutureC6534a.mo5907b(gVar, EnumC2229b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f9357b;
                    }
                    f9348u.mo11802b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f9350p;
        }
        if (obj instanceof c) {
            interfaceFutureC6534a.cancel(((c) obj).f9355a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m11783a(sb2);
        } else {
            try {
                str = m11797m();
            } catch (RuntimeException e11) {
                str = "Exception thrown from implementation: " + e11.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                m11783a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9350p;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m11789i(obj2);
            }
            i iVar = this.f9352r;
            if (iVar != i.f9370c) {
                i iVar2 = new i();
                do {
                    iVar2.m11806a(iVar);
                    if (f9348u.mo11803c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                m11793o(iVar2);
                                throw new InterruptedException();
                            }
                            obj = this.f9350p;
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m11789i(obj);
                    }
                    iVar = this.f9352r;
                } while (iVar != i.f9370c);
            }
            return m11789i(this.f9350p);
        }
        throw new InterruptedException();
    }
}
