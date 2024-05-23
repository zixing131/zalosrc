package hg0;

import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19074t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: hg0.c */
/* loaded from: classes6.dex */
public final class C20055c extends AbstractC20056d {

    /* renamed from: a */
    private final ExecutorService f98624a;

    public C20055c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("SingleWorker"));
        AbstractC19074t.m100207e(newSingleThreadExecutor, "Executors.newSingleThreadExecutor(threadFactory)");
        this.f98624a = newSingleThreadExecutor;
    }

    @Override // hg0.AbstractC20056d
    /* renamed from: b */
    protected ExecutorService mo104177b() {
        return this.f98624a;
    }
}
