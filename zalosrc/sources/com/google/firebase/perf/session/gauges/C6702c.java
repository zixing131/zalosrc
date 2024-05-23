package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p319l9.C22152a;
import p507s9.C26188e;

/* renamed from: com.google.firebase.perf.session.gauges.c */
/* loaded from: classes3.dex */
public class C6702c {

    /* renamed from: g */
    private static final C22152a f36881g = C22152a.m115524e();

    /* renamed from: h */
    private static final long f36882h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e */
    private ScheduledFuture f36887e = null;

    /* renamed from: f */
    private long f36888f = -1;

    /* renamed from: a */
    public final ConcurrentLinkedQueue f36883a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final ScheduledExecutorService f36884b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final String f36885c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d */
    private final long f36886d = m34263e();

    /* renamed from: d */
    private long m34262d(long j11) {
        return Math.round((j11 / this.f36886d) * f36882h);
    }

    /* renamed from: e */
    private long m34263e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: f */
    public static boolean m34264f(long j11) {
        return j11 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m34265g(Timer timer) {
        C26188e m34269m = m34269m(timer);
        if (m34269m != null) {
            this.f36883a.add(m34269m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m34266h(Timer timer) {
        C26188e m34269m = m34269m(timer);
        if (m34269m != null) {
            this.f36883a.add(m34269m);
        }
    }

    /* renamed from: i */
    private synchronized void m34267i(final Timer timer) {
        try {
            this.f36884b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6702c.this.m34265g(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f36881g.m115533j("Unable to collect Cpu Metric: " + e11.getMessage());
        }
    }

    /* renamed from: j */
    private synchronized void m34268j(long j11, final Timer timer) {
        this.f36888f = j11;
        try {
            this.f36887e = this.f36884b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6702c.this.m34266h(timer);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f36881g.m115533j("Unable to start collecting Cpu Metrics: " + e11.getMessage());
        }
    }

    /* renamed from: m */
    private C26188e m34269m(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f36885c));
            try {
                long m34291b = timer.m34291b();
                String[] split = bufferedReader.readLine().split(" ");
                C26188e c26188e = (C26188e) C26188e.m134568P().m134572A(m34291b).m134573B(m34262d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).m134574C(m34262d(Long.parseLong(split[13]) + Long.parseLong(split[15]))).m35109q();
                bufferedReader.close();
                return c26188e;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            f36881g.m115533j("Unable to read 'proc/[pid]/stat' file: " + e11.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e12) {
            e = e12;
            f36881g.m115533j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            f36881g.m115533j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e14) {
            e = e14;
            f36881g.m115533j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public void m34270c(Timer timer) {
        m34267i(timer);
    }

    /* renamed from: k */
    public void m34271k(long j11, Timer timer) {
        long j12 = this.f36886d;
        if (j12 == -1 || j12 == 0 || m34264f(j11)) {
            return;
        }
        if (this.f36887e != null) {
            if (this.f36888f != j11) {
                m34272l();
                m34268j(j11, timer);
                return;
            }
            return;
        }
        m34268j(j11, timer);
    }

    /* renamed from: l */
    public void m34272l() {
        ScheduledFuture scheduledFuture = this.f36887e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f36887e = null;
        this.f36888f = -1L;
    }
}
