package p383o8;

import android.database.SQLException;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p010a4.AbstractC0119l;
import p153f8.C18821f;
import p232i8.AbstractC20411p;
import p232i8.AbstractC20418s0;
import p232i8.C20384b0;
import p342m6.C22890k;
import p418p8.C24668d;
import p668y3.AbstractC30277c;
import p668y3.EnumC30278d;
import p668y3.InterfaceC30280f;
import p668y3.InterfaceC30282h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o8.e */
/* loaded from: classes.dex */
public final class C24116e {

    /* renamed from: a */
    private final double f116509a;

    /* renamed from: b */
    private final double f116510b;

    /* renamed from: c */
    private final long f116511c;

    /* renamed from: d */
    private final long f116512d;

    /* renamed from: e */
    private final int f116513e;

    /* renamed from: f */
    private final BlockingQueue f116514f;

    /* renamed from: g */
    private final ThreadPoolExecutor f116515g;

    /* renamed from: h */
    private final InterfaceC30280f f116516h;

    /* renamed from: i */
    private final C20384b0 f116517i;

    /* renamed from: j */
    private int f116518j;

    /* renamed from: k */
    private long f116519k;

    /* renamed from: o8.e$b */
    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: p */
        private final AbstractC20411p f116520p;

        /* renamed from: q */
        private final C22890k f116521q;

        @Override // java.lang.Runnable
        public void run() {
            C24116e.this.m126010p(this.f116520p, this.f116521q);
            C24116e.this.f116517i.m106176c();
            double m126003g = C24116e.this.m126003g();
            C18821f.m98795f().m98796b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m126003g / 1000.0d)) + " s for report: " + this.f116520p.mo106173d());
            C24116e.m126011q(m126003g);
        }

        private b(AbstractC20411p abstractC20411p, C22890k c22890k) {
            this.f116520p = abstractC20411p;
            this.f116521q = c22890k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24116e(InterfaceC30280f interfaceC30280f, C24668d c24668d, C20384b0 c20384b0) {
        this(c24668d.f118590f, c24668d.f118591g, c24668d.f118592h * 1000, interfaceC30280f, c20384b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public double m126003g() {
        return Math.min(3600000.0d, (60000.0d / this.f116509a) * Math.pow(this.f116510b, m126004h()));
    }

    /* renamed from: h */
    private int m126004h() {
        int max;
        if (this.f116519k == 0) {
            this.f116519k = m126009o();
        }
        int m126009o = (int) ((m126009o() - this.f116519k) / this.f116511c);
        if (m126006l()) {
            max = Math.min(100, this.f116518j + m126009o);
        } else {
            max = Math.max(0, this.f116518j - m126009o);
        }
        if (this.f116518j != max) {
            this.f116518j = max;
            this.f116519k = m126009o();
        }
        return max;
    }

    /* renamed from: k */
    private boolean m126005k() {
        if (this.f116514f.size() < this.f116513e) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m126006l() {
        if (this.f116514f.size() == this.f116513e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m126007m(CountDownLatch countDownLatch) {
        try {
            AbstractC0119l.m545a(this.f116516h, EnumC30278d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m126008n(C22890k c22890k, boolean z11, AbstractC20411p abstractC20411p, Exception exc) {
        if (exc != null) {
            c22890k.m117597d(exc);
            return;
        }
        if (z11) {
            m126013j();
        }
        c22890k.m117598e(abstractC20411p);
    }

    /* renamed from: o */
    private long m126009o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m126010p(final AbstractC20411p abstractC20411p, final C22890k c22890k) {
        final boolean z11;
        C18821f.m98795f().m98796b("Sending report through Google DataTransport: " + abstractC20411p.mo106173d());
        if (SystemClock.elapsedRealtime() - this.f116512d < 2000) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f116516h.mo556a(AbstractC30277c.m149418f(abstractC20411p.mo106171b()), new InterfaceC30282h() { // from class: o8.c
            @Override // p668y3.InterfaceC30282h
            /* renamed from: a */
            public final void mo553a(Exception exc) {
                C24116e.this.m126008n(c22890k, z11, abstractC20411p, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m126011q(double d11) {
        try {
            Thread.sleep((long) d11);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C22890k m126012i(AbstractC20411p abstractC20411p, boolean z11) {
        synchronized (this.f116514f) {
            try {
                C22890k c22890k = new C22890k();
                if (z11) {
                    this.f116517i.m106175b();
                    if (m126005k()) {
                        C18821f.m98795f().m98796b("Enqueueing report: " + abstractC20411p.mo106173d());
                        C18821f.m98795f().m98796b("Queue size: " + this.f116514f.size());
                        this.f116515g.execute(new b(abstractC20411p, c22890k));
                        C18821f.m98795f().m98796b("Closing task for report: " + abstractC20411p.mo106173d());
                        c22890k.m117598e(abstractC20411p);
                        return c22890k;
                    }
                    m126004h();
                    C18821f.m98795f().m98796b("Dropping report due to queue being full: " + abstractC20411p.mo106173d());
                    this.f116517i.m106174a();
                    c22890k.m117598e(abstractC20411p);
                    return c22890k;
                }
                m126010p(abstractC20411p, c22890k);
                return c22890k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m126013j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: o8.d
            @Override // java.lang.Runnable
            public final void run() {
                C24116e.this.m126007m(countDownLatch);
            }
        }).start();
        AbstractC20418s0.m106403g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    C24116e(double d11, double d12, long j11, InterfaceC30280f interfaceC30280f, C20384b0 c20384b0) {
        this.f116509a = d11;
        this.f116510b = d12;
        this.f116511c = j11;
        this.f116516h = interfaceC30280f;
        this.f116517i = c20384b0;
        this.f116512d = SystemClock.elapsedRealtime();
        int i11 = (int) d11;
        this.f116513e = i11;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i11);
        this.f116514f = arrayBlockingQueue;
        this.f116515g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f116518j = 0;
        this.f116519k = 0L;
    }
}
