package dg0;

import fn0.AbstractC19074t;
import hg0.AbstractC20056d;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import pm0.C24848g0;

/* renamed from: dg0.c */
/* loaded from: classes6.dex */
public final class C17928c implements InterfaceC17929d {

    /* renamed from: a */
    private final ScheduledExecutorService f90500a;

    /* renamed from: b */
    private final ConcurrentHashMap f90501b;

    /* renamed from: c */
    private final Set f90502c;

    /* renamed from: d */
    private final Map f90503d;

    /* renamed from: e */
    private final AbstractC20056d f90504e;

    /* renamed from: dg0.c$a */
    /* loaded from: classes6.dex */
    static final class a implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Runnable f90506q;

        /* renamed from: r */
        final /* synthetic */ String f90507r;

        a(Runnable runnable, String str) {
            this.f90506q = runnable;
            this.f90507r = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C17928c.this.f90504e.m104178a(this.f90506q);
            } finally {
                C17928c.this.f90501b.remove(this.f90507r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dg0.c$b */
    /* loaded from: classes6.dex */
    public static final class b implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Runnable f90509q;

        b(Runnable runnable) {
            this.f90509q = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C17928c.this.f90504e.m104178a(this.f90509q);
        }
    }

    /* renamed from: dg0.c$c */
    /* loaded from: classes6.dex */
    static final class c implements Runnable {

        /* renamed from: q */
        final /* synthetic */ String f90511q;

        /* renamed from: r */
        final /* synthetic */ long f90512r;

        c(String str, long j11) {
            this.f90511q = str;
            this.f90512r = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C17928c.this.f90502c.remove(this.f90511q);
        }
    }

    /* renamed from: dg0.c$d */
    /* loaded from: classes6.dex */
    static final class d implements Runnable {

        /* renamed from: q */
        final /* synthetic */ String f90514q;

        /* renamed from: r */
        final /* synthetic */ Runnable f90515r;

        /* renamed from: s */
        final /* synthetic */ long f90516s;

        d(String str, Runnable runnable, long j11) {
            this.f90514q = str;
            this.f90515r = runnable;
            this.f90516s = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = (Runnable) C17928c.this.f90503d.remove(this.f90514q);
            if (runnable != null) {
                C17928c.this.f90504e.m104178a(runnable);
            }
        }
    }

    public C17928c(AbstractC20056d abstractC20056d) {
        AbstractC19074t.m100208f(abstractC20056d, "worker");
        this.f90504e = abstractC20056d;
        this.f90500a = Executors.newSingleThreadScheduledExecutor();
        this.f90501b = new ConcurrentHashMap();
        this.f90502c = Collections.synchronizedSet(new HashSet());
        this.f90503d = Collections.synchronizedMap(new HashMap());
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: a */
    public void mo94527a(String str, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(runnable, "runnable");
        Set set = this.f90502c;
        AbstractC19074t.m100207e(set, "throttleFirstEvents");
        synchronized (set) {
            if (this.f90502c.contains(str)) {
                return;
            }
            this.f90502c.add(str);
            this.f90500a.schedule(new c(str, j11), j11, TimeUnit.MILLISECONDS);
            this.f90504e.m104178a(runnable);
        }
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: b */
    public ScheduledFuture mo94528b(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "command");
        return mo94531e(runnable, 0L);
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: c */
    public void mo94529c(String str, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(runnable, "runnable");
        Map map = this.f90503d;
        AbstractC19074t.m100207e(map, "throttleLastEvents");
        synchronized (map) {
            try {
                if (this.f90503d.containsKey(str)) {
                    Map map2 = this.f90503d;
                    AbstractC19074t.m100207e(map2, "throttleLastEvents");
                    map2.put(str, runnable);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } else {
                    Map map3 = this.f90503d;
                    AbstractC19074t.m100207e(map3, "throttleLastEvents");
                    map3.put(str, runnable);
                    this.f90500a.schedule(new d(str, runnable, j11), j11, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: d */
    public void mo94530d(String str, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(runnable, "runnable");
        Future future = (Future) this.f90501b.put(str, this.f90500a.schedule(new a(runnable, str), j11, TimeUnit.MILLISECONDS));
        if (future != null) {
            future.cancel(true);
        }
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: e */
    public ScheduledFuture mo94531e(Runnable runnable, long j11) {
        AbstractC19074t.m100208f(runnable, "command");
        ScheduledFuture<?> schedule = this.f90500a.schedule(new b(runnable), j11, TimeUnit.MILLISECONDS);
        AbstractC19074t.m100207e(schedule, "scheduler.schedule({\n   …y, TimeUnit.MILLISECONDS)");
        return schedule;
    }
}
