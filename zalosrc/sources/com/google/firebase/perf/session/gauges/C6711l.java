package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p319l9.C22152a;
import p476r9.AbstractC25706n;
import p476r9.EnumC25703k;
import p507s9.C26185b;

/* renamed from: com.google.firebase.perf.session.gauges.l */
/* loaded from: classes3.dex */
public class C6711l {

    /* renamed from: f */
    private static final C22152a f36904f = C22152a.m115524e();

    /* renamed from: a */
    private final ScheduledExecutorService f36905a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f36906b;

    /* renamed from: c */
    private final Runtime f36907c;

    /* renamed from: d */
    private ScheduledFuture f36908d;

    /* renamed from: e */
    private long f36909e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6711l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: d */
    private int m34278d() {
        return AbstractC25706n.m132622c(EnumC25703k.f122724u.m132617b(this.f36907c.totalMemory() - this.f36907c.freeMemory()));
    }

    /* renamed from: e */
    public static boolean m34279e(long j11) {
        return j11 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m34280f(Timer timer) {
        C26185b m34284l = m34284l(timer);
        if (m34284l != null) {
            this.f36906b.add(m34284l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m34281g(Timer timer) {
        C26185b m34284l = m34284l(timer);
        if (m34284l != null) {
            this.f36906b.add(m34284l);
        }
    }

    /* renamed from: h */
    private synchronized void m34282h(final Timer timer) {
        try {
            this.f36905a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    C6711l.this.m34280f(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f36904f.m115533j("Unable to collect Memory Metric: " + e11.getMessage());
        }
    }

    /* renamed from: i */
    private synchronized void m34283i(long j11, final Timer timer) {
        this.f36909e = j11;
        try {
            this.f36908d = this.f36905a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    C6711l.this.m34281g(timer);
                }
            }, 0L, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            f36904f.m115533j("Unable to start collecting Memory Metrics: " + e11.getMessage());
        }
    }

    /* renamed from: l */
    private C26185b m34284l(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (C26185b) C26185b.m134533O().m134536A(timer.m34291b()).m134537B(m34278d()).m35109q();
    }

    /* renamed from: c */
    public void m34285c(Timer timer) {
        m34282h(timer);
    }

    /* renamed from: j */
    public void m34286j(long j11, Timer timer) {
        if (m34279e(j11)) {
            return;
        }
        if (this.f36908d != null) {
            if (this.f36909e != j11) {
                m34287k();
                m34283i(j11, timer);
                return;
            }
            return;
        }
        m34283i(j11, timer);
    }

    /* renamed from: k */
    public void m34287k() {
        ScheduledFuture scheduledFuture = this.f36908d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f36908d = null;
        this.f36909e = -1L;
    }

    C6711l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f36908d = null;
        this.f36909e = -1L;
        this.f36905a = scheduledExecutorService;
        this.f36906b = new ConcurrentLinkedQueue();
        this.f36907c = runtime;
    }
}
