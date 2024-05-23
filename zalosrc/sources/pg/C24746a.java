package pg;

import fg0.C18929b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hg0.AbstractC20056d;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ln0.AbstractC22543l;
import p323lg.AbstractC22476b;
import p323lg.C22475a;

/* renamed from: pg.a */
/* loaded from: classes3.dex */
public final class C24746a extends AbstractC20056d {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final ExecutorService f118823a;

    /* renamed from: pg.a$a */
    /* loaded from: classes3.dex */
    private static final class a extends AbstractC22476b {
        @Override // p323lg.AbstractC22476b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo116222b(C22475a c22475a, C22475a c22475a2) {
            AbstractC19074t.m100208f(c22475a, "t1");
            AbstractC19074t.m100208f(c22475a2, "t2");
            int m100209g = AbstractC19074t.m100209g(c22475a2.m116218b(), c22475a.m116218b());
            if (m100209g != 0) {
                return m100209g;
            }
            return AbstractC19074t.m100210h(c22475a.m116217a(), c22475a2.m116217a());
        }
    }

    /* renamed from: pg.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24746a() {
        int m116588k;
        m116588k = AbstractC22543l.m116588k(C20128b.m104770q(), 1, 32);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m116588k, m116588k, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue(100, new a()), new C18929b("ChatWorker"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f118823a = threadPoolExecutor;
        AbstractC20110a.f98889a.mo104554k("Worker", "ChatWorker: Initializing...");
    }

    @Override // hg0.AbstractC20056d
    /* renamed from: b */
    protected ExecutorService mo104177b() {
        return this.f118823a;
    }
}
