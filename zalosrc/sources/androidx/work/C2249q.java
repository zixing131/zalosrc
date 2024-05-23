package androidx.work;

import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.Job;
import pm0.C24848g0;

/* renamed from: androidx.work.q */
/* loaded from: classes2.dex */
public final class C2249q implements InterfaceFutureC6534a {

    /* renamed from: p */
    private final Job f9460p;

    /* renamed from: q */
    private final C2230c f9461q;

    /* renamed from: androidx.work.q$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m11887a(Throwable th2) {
            if (th2 == null) {
                if (!C2249q.this.f9461q.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (!(th2 instanceof CancellationException)) {
                    C2230c c2230c = C2249q.this.f9461q;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    c2230c.mo11799q(th2);
                    return;
                }
                C2249q.this.f9461q.cancel(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m11887a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    public C2249q(Job job, C2230c c2230c) {
        AbstractC19074t.m100208f(job, "job");
        AbstractC19074t.m100208f(c2230c, "underlying");
        this.f9460p = job;
        this.f9461q = c2230c;
        job.mo112733M(new a());
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC6534a
    /* renamed from: b */
    public void mo5907b(Runnable runnable, Executor executor) {
        this.f9461q.mo5907b(runnable, executor);
    }

    /* renamed from: c */
    public final void m11886c(Object obj) {
        this.f9461q.mo11798p(obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f9461q.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f9461q.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f9461q.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f9461q.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j11, TimeUnit timeUnit) {
        return this.f9461q.get(j11, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2249q(Job job, C2230c c2230c, int i11, AbstractC19060k abstractC19060k) {
        this(job, c2230c);
        if ((i11 & 2) != 0) {
            c2230c = C2230c.m11809t();
            AbstractC19074t.m100207e(c2230c, "create()");
        }
    }
}
