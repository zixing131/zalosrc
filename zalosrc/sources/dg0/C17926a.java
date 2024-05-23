package dg0;

import android.os.Handler;
import fn0.AbstractC19074t;
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

/* renamed from: dg0.a */
/* loaded from: classes.dex */
public final class C17926a implements InterfaceC17929d {

    /* renamed from: a */
    private final ScheduledExecutorService f90479a;

    /* renamed from: b */
    private final ConcurrentHashMap f90480b;

    /* renamed from: c */
    private final Set f90481c;

    /* renamed from: d */
    private final Map f90482d;

    /* renamed from: e */
    private final Handler f90483e;

    /* renamed from: dg0.a$a */
    /* loaded from: classes6.dex */
    static final class a implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Runnable f90485q;

        /* renamed from: r */
        final /* synthetic */ String f90486r;

        a(Runnable runnable, String str) {
            this.f90485q = runnable;
            this.f90486r = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C17926a.this.f90483e.post(this.f90485q);
            } finally {
                C17926a.this.f90480b.remove(this.f90486r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dg0.a$b */
    /* loaded from: classes.dex */
    public static final class b implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Runnable f90488q;

        b(Runnable runnable) {
            this.f90488q = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C17926a.this.f90483e.post(this.f90488q);
        }
    }

    /* renamed from: dg0.a$c */
    /* loaded from: classes6.dex */
    static final class c implements Runnable {

        /* renamed from: q */
        final /* synthetic */ String f90490q;

        /* renamed from: r */
        final /* synthetic */ long f90491r;

        c(String str, long j11) {
            this.f90490q = str;
            this.f90491r = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C17926a.this.f90481c.remove(this.f90490q);
        }
    }

    /* renamed from: dg0.a$d */
    /* loaded from: classes6.dex */
    static final class d implements Runnable {

        /* renamed from: q */
        final /* synthetic */ String f90493q;

        /* renamed from: r */
        final /* synthetic */ Runnable f90494r;

        /* renamed from: s */
        final /* synthetic */ long f90495s;

        d(String str, Runnable runnable, long j11) {
            this.f90493q = str;
            this.f90494r = runnable;
            this.f90495s = j11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = (Runnable) C17926a.this.f90482d.remove(this.f90493q);
            if (runnable != null) {
                C17926a.this.f90483e.post(runnable);
            }
        }
    }

    public C17926a(Handler handler) {
        AbstractC19074t.m100208f(handler, "handler");
        this.f90483e = handler;
        this.f90479a = Executors.newSingleThreadScheduledExecutor();
        this.f90480b = new ConcurrentHashMap();
        this.f90481c = Collections.synchronizedSet(new HashSet());
        this.f90482d = Collections.synchronizedMap(new HashMap());
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: a */
    public void mo94527a(String str, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(runnable, "runnable");
        Set set = this.f90481c;
        AbstractC19074t.m100207e(set, "throttleFirstEvents");
        synchronized (set) {
            if (this.f90481c.contains(str)) {
                return;
            }
            this.f90481c.add(str);
            this.f90479a.schedule(new c(str, j11), j11, TimeUnit.MILLISECONDS);
            this.f90483e.post(runnable);
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
        Map map = this.f90482d;
        AbstractC19074t.m100207e(map, "throttleLastEvents");
        synchronized (map) {
            try {
                if (this.f90482d.containsKey(str)) {
                    Map map2 = this.f90482d;
                    AbstractC19074t.m100207e(map2, "throttleLastEvents");
                    map2.put(str, runnable);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } else {
                    Map map3 = this.f90482d;
                    AbstractC19074t.m100207e(map3, "throttleLastEvents");
                    map3.put(str, runnable);
                    this.f90479a.schedule(new d(str, runnable, j11), j11, TimeUnit.MILLISECONDS);
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
        Future future = (Future) this.f90480b.put(str, this.f90479a.schedule(new a(runnable, str), j11, TimeUnit.MILLISECONDS));
        if (future != null) {
            future.cancel(true);
        }
    }

    @Override // dg0.InterfaceC17929d
    /* renamed from: e */
    public ScheduledFuture mo94531e(Runnable runnable, long j11) {
        AbstractC19074t.m100208f(runnable, "command");
        ScheduledFuture<?> schedule = this.f90479a.schedule(new b(runnable), j11, TimeUnit.MILLISECONDS);
        AbstractC19074t.m100207e(schedule, "scheduler.schedule({\n   …y, TimeUnit.MILLISECONDS)");
        return schedule;
    }
}
