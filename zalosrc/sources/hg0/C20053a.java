package hg0;

import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import gg0.AbstractC19445b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ln0.AbstractC22543l;
import pm0.C24848g0;

/* renamed from: hg0.a */
/* loaded from: classes.dex */
public final class C20053a extends AbstractC20056d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ExecutorService f98622a;

    /* renamed from: hg0.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C20053a() {
        int m116588k;
        m116588k = AbstractC22543l.m116588k(AbstractC19445b.m101698a(), 0, 32);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m116588k, m116588k, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("ComputationWorker"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        this.f98622a = threadPoolExecutor;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ComputationWorker: Initializing with ");
        sb2.append(m116588k);
        sb2.append(" core(s)...");
    }

    @Override // hg0.AbstractC20056d
    /* renamed from: b */
    protected ExecutorService mo104177b() {
        return this.f98622a;
    }
}
