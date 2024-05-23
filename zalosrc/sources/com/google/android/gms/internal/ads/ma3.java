package com.google.android.gms.internal.ads;

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

/* loaded from: classes2.dex */
public abstract class ma3 extends nd3 implements tc3 {

    /* renamed from: s */
    static final boolean f24451s;

    /* renamed from: t */
    private static final Logger f24452t;

    /* renamed from: u */
    private static final na3 f24453u;

    /* renamed from: v */
    private static final Object f24454v;

    /* renamed from: p */
    private volatile Object f24455p;

    /* renamed from: q */
    private volatile qa3 f24456q;

    /* renamed from: r */
    private volatile xa3 f24457r;

    static {
        boolean z11;
        Throwable th2;
        Throwable th3;
        na3 ta3Var;
        try {
            z11 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z11 = false;
        }
        f24451s = z11;
        f24452t = Logger.getLogger(ma3.class.getName());
        try {
            ta3Var = new wa3(null);
            th3 = null;
            th2 = null;
        } catch (Error | RuntimeException e11) {
            try {
                th2 = null;
                th3 = e11;
                ta3Var = new ra3(AtomicReferenceFieldUpdater.newUpdater(xa3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(xa3.class, xa3.class, C18710b.f94009e), AtomicReferenceFieldUpdater.newUpdater(ma3.class, xa3.class, "r"), AtomicReferenceFieldUpdater.newUpdater(ma3.class, qa3.class, "q"), AtomicReferenceFieldUpdater.newUpdater(ma3.class, Object.class, "p"));
            } catch (Error | RuntimeException e12) {
                th2 = e12;
                th3 = e11;
                ta3Var = new ta3(null);
            }
        }
        f24453u = ta3Var;
        if (th2 != null) {
            Logger logger = f24452t;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f24454v = new Object();
    }

    /* renamed from: A */
    private final void m24506A(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException e11) {
            e = e11;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        } catch (StackOverflowError e12) {
            e = e12;
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    /* renamed from: B */
    public static void m24507B(ma3 ma3Var) {
        qa3 qa3Var = null;
        while (true) {
            for (xa3 mo24876b = f24453u.mo24876b(ma3Var, xa3.f30401c); mo24876b != null; mo24876b = mo24876b.f30403b) {
                Thread thread = mo24876b.f30402a;
                if (thread != null) {
                    mo24876b.f30402a = null;
                    LockSupport.unpark(thread);
                }
            }
            ma3Var.mo22404f();
            qa3 qa3Var2 = qa3Var;
            qa3 mo24875a = f24453u.mo24875a(ma3Var, qa3.f26703d);
            qa3 qa3Var3 = qa3Var2;
            while (mo24875a != null) {
                qa3 qa3Var4 = mo24875a.f26706c;
                mo24875a.f26706c = qa3Var3;
                qa3Var3 = mo24875a;
                mo24875a = qa3Var4;
            }
            while (qa3Var3 != null) {
                qa3Var = qa3Var3.f26706c;
                Runnable runnable = qa3Var3.f26704a;
                runnable.getClass();
                if (runnable instanceof sa3) {
                    sa3 sa3Var = (sa3) runnable;
                    ma3Var = sa3Var.f27605p;
                    if (ma3Var.f24455p == sa3Var) {
                        if (f24453u.mo24880f(ma3Var, sa3Var, m24511i(sa3Var.f27606q))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = qa3Var3.f26705b;
                    executor.getClass();
                    m24508C(runnable, executor);
                }
                qa3Var3 = qa3Var;
            }
            return;
        }
    }

    /* renamed from: C */
    private static void m24508C(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f24452t.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    /* renamed from: c */
    private final void m24509c(xa3 xa3Var) {
        xa3Var.f30402a = null;
        while (true) {
            xa3 xa3Var2 = this.f24457r;
            if (xa3Var2 != xa3.f30401c) {
                xa3 xa3Var3 = null;
                while (xa3Var2 != null) {
                    xa3 xa3Var4 = xa3Var2.f30403b;
                    if (xa3Var2.f30402a != null) {
                        xa3Var3 = xa3Var2;
                    } else if (xa3Var3 != null) {
                        xa3Var3.f30403b = xa3Var4;
                        if (xa3Var3.f30402a == null) {
                            break;
                        }
                    } else if (!f24453u.mo24881g(this, xa3Var2, xa3Var4)) {
                        break;
                    }
                    xa3Var2 = xa3Var4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: d */
    private static final Object m24510d(Object obj) {
        if (!(obj instanceof oa3)) {
            if (!(obj instanceof pa3)) {
                if (obj == f24454v) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((pa3) obj).f26148a);
        }
        Throwable th2 = ((oa3) obj).f25524b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static Object m24511i(tc3 tc3Var) {
        Throwable mo24524a;
        if (tc3Var instanceof ua3) {
            Object obj = ((ma3) tc3Var).f24455p;
            if (obj instanceof oa3) {
                oa3 oa3Var = (oa3) obj;
                if (oa3Var.f25523a) {
                    Throwable th2 = oa3Var.f25524b;
                    obj = th2 != null ? new oa3(false, th2) : oa3.f25522d;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((tc3Var instanceof nd3) && (mo24524a = ((nd3) tc3Var).mo24524a()) != null) {
            return new pa3(mo24524a);
        }
        boolean isCancelled = tc3Var.isCancelled();
        if ((!f24451s) & isCancelled) {
            oa3 oa3Var2 = oa3.f25522d;
            oa3Var2.getClass();
            return oa3Var2;
        }
        try {
            Object m24512j = m24512j(tc3Var);
            if (isCancelled) {
                return new oa3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + tc3Var));
            }
            if (m24512j == null) {
                return f24454v;
            }
            return m24512j;
        } catch (Error e11) {
            e = e11;
            return new pa3(e);
        } catch (CancellationException e12) {
            if (!isCancelled) {
                tc3Var.toString();
                return new pa3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(tc3Var)), e12));
            }
            return new oa3(false, e12);
        } catch (RuntimeException e13) {
            e = e13;
            return new pa3(e);
        } catch (ExecutionException e14) {
            if (isCancelled) {
                tc3Var.toString();
                return new oa3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(tc3Var)), e14));
            }
            return new pa3(e14.getCause());
        }
    }

    /* renamed from: j */
    private static Object m24512j(Future future) {
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

    /* renamed from: y */
    private final void m24522y(StringBuilder sb2) {
        try {
            Object m24512j = m24512j(this);
            sb2.append("SUCCESS, result=[");
            if (m24512j == null) {
                sb2.append("null");
            } else if (m24512j == this) {
                sb2.append("this future");
            } else {
                sb2.append(m24512j.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(m24512j)));
            }
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

    /* renamed from: z */
    private final void m24523z(StringBuilder sb2) {
        String concat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f24455p;
        if (obj instanceof sa3) {
            sb2.append(", setFuture=[");
            m24506A(sb2, ((sa3) obj).f27606q);
            sb2.append("]");
        } else {
            try {
                concat = z53.m28435a(mo22403e());
            } catch (RuntimeException | StackOverflowError e11) {
                Class<?> cls = e11.getClass();
                cls.toString();
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m24522y(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.nd3
    /* renamed from: a */
    public final Throwable mo24524a() {
        if (this instanceof ua3) {
            Object obj = this.f24455p;
            if (obj instanceof pa3) {
                return ((pa3) obj).f26148a;
            }
            return null;
        }
        return null;
    }

    public boolean cancel(boolean z11) {
        boolean z12;
        oa3 oa3Var;
        boolean z13;
        Object obj = this.f24455p;
        if (obj == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!(z12 | (obj instanceof sa3))) {
            return false;
        }
        if (f24451s) {
            oa3Var = new oa3(z11, new CancellationException("Future.cancel() was called."));
        } else {
            if (z11) {
                oa3Var = oa3.f25521c;
            } else {
                oa3Var = oa3.f25522d;
            }
            oa3Var.getClass();
        }
        boolean z14 = false;
        ma3 ma3Var = this;
        while (true) {
            if (f24453u.mo24880f(ma3Var, obj, oa3Var)) {
                if (z11) {
                    ma3Var.mo24525t();
                }
                m24507B(ma3Var);
                if (!(obj instanceof sa3)) {
                    break;
                }
                tc3 tc3Var = ((sa3) obj).f27606q;
                if (tc3Var instanceof ua3) {
                    ma3Var = (ma3) tc3Var;
                    obj = ma3Var.f24455p;
                    if (obj == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13 && !(obj instanceof sa3)) {
                        break;
                    }
                    z14 = true;
                } else {
                    tc3Var.cancel(z11);
                    break;
                }
            } else {
                obj = ma3Var.f24455p;
                if (!(obj instanceof sa3)) {
                    return z14;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public String mo22403e() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* renamed from: f */
    protected void mo22404f() {
    }

    /* renamed from: g */
    public boolean mo20863g(Object obj) {
        if (obj == null) {
            obj = f24454v;
        }
        if (f24453u.mo24880f(this, null, obj)) {
            m24507B(this);
            return true;
        }
        return false;
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24455p;
            if ((obj2 != null) & (!(obj2 instanceof sa3))) {
                return m24510d(obj2);
            }
            xa3 xa3Var = this.f24457r;
            if (xa3Var != xa3.f30401c) {
                xa3 xa3Var2 = new xa3();
                do {
                    na3 na3Var = f24453u;
                    na3Var.mo24877c(xa3Var2, xa3Var);
                    if (na3Var.mo24881g(this, xa3Var, xa3Var2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                m24509c(xa3Var2);
                                throw new InterruptedException();
                            }
                            obj = this.f24455p;
                        } while (!((obj != null) & (!(obj instanceof sa3))));
                        return m24510d(obj);
                    }
                    xa3Var = this.f24457r;
                } while (xa3Var != xa3.f30401c);
            }
            Object obj3 = this.f24455p;
            obj3.getClass();
            return m24510d(obj3);
        }
        throw new InterruptedException();
    }

    /* renamed from: h */
    public boolean mo20864h(Throwable th2) {
        th2.getClass();
        if (f24453u.mo24880f(this, null, new pa3(th2))) {
            m24507B(this);
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        return this.f24455p instanceof oa3;
    }

    public boolean isDone() {
        boolean z11;
        if (this.f24455p != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return (!(r0 instanceof sa3)) & z11;
    }

    /* renamed from: t */
    protected void mo24525t() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m24522y(sb2);
        } else {
            m24523z(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u */
    public final void m24526u(Future future) {
        boolean z11;
        if (future != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 & isCancelled()) {
            future.cancel(m24528x());
        }
    }

    /* renamed from: w */
    public final boolean m24527w(tc3 tc3Var) {
        pa3 pa3Var;
        tc3Var.getClass();
        Object obj = this.f24455p;
        if (obj == null) {
            if (tc3Var.isDone()) {
                if (!f24453u.mo24880f(this, null, m24511i(tc3Var))) {
                    return false;
                }
                m24507B(this);
                return true;
            }
            sa3 sa3Var = new sa3(this, tc3Var);
            if (f24453u.mo24880f(this, null, sa3Var)) {
                try {
                    tc3Var.zzc(sa3Var, xb3.INSTANCE);
                } catch (Error | RuntimeException e11) {
                    try {
                        pa3Var = new pa3(e11);
                    } catch (Error | RuntimeException unused) {
                        pa3Var = pa3.f26147b;
                    }
                    f24453u.mo24880f(this, sa3Var, pa3Var);
                }
                return true;
            }
            obj = this.f24455p;
        }
        if (obj instanceof oa3) {
            tc3Var.cancel(((oa3) obj).f25523a);
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m24528x() {
        Object obj = this.f24455p;
        if ((obj instanceof oa3) && ((oa3) obj).f25523a) {
            return true;
        }
        return false;
    }

    public void zzc(Runnable runnable, Executor executor) {
        qa3 qa3Var;
        j53.m23533c(runnable, "Runnable was null.");
        j53.m23533c(executor, "Executor was null.");
        if (!isDone() && (qa3Var = this.f24456q) != qa3.f26703d) {
            qa3 qa3Var2 = new qa3(runnable, executor);
            do {
                qa3Var2.f26706c = qa3Var;
                if (f24453u.mo24879e(this, qa3Var, qa3Var2)) {
                    return;
                } else {
                    qa3Var = this.f24456q;
                }
            } while (qa3Var != qa3.f26703d);
        }
        m24508C(runnable, executor);
    }

    public Object get(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f24455p;
            boolean z11 = true;
            if ((obj != null) & (!(obj instanceof sa3))) {
                return m24510d(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                xa3 xa3Var = this.f24457r;
                if (xa3Var != xa3.f30401c) {
                    xa3 xa3Var2 = new xa3();
                    do {
                        na3 na3Var = f24453u;
                        na3Var.mo24877c(xa3Var2, xa3Var);
                        if (na3Var.mo24881g(this, xa3Var, xa3Var2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f24455p;
                                    if ((obj2 != null) & (!(obj2 instanceof sa3))) {
                                        return m24510d(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m24509c(xa3Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m24509c(xa3Var2);
                        } else {
                            xa3Var = this.f24457r;
                        }
                    } while (xa3Var != xa3.f30401c);
                }
                Object obj3 = this.f24455p;
                obj3.getClass();
                return m24510d(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f24455p;
                if ((obj4 != null) & (!(obj4 instanceof sa3))) {
                    return m24510d(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String ma3Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j12 = -nanos;
                long convert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z11 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z11) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z11) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + ma3Var);
        }
        throw new InterruptedException();
    }
}
