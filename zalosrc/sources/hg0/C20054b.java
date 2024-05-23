package hg0;

import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19074t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: hg0.b */
/* loaded from: classes.dex */
public final class C20054b extends AbstractC20056d {

    /* renamed from: a */
    private final ExecutorService f98623a;

    public C20054b() {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactoryC18928a("IOWorker"));
        AbstractC19074t.m100207e(newCachedThreadPool, "Executors.newCachedThreadPool(threadFactory)");
        this.f98623a = newCachedThreadPool;
    }

    @Override // hg0.AbstractC20056d
    /* renamed from: b */
    protected ExecutorService mo104177b() {
        return this.f98623a;
    }
}
