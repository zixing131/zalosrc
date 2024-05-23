package p509sp;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* renamed from: sp.m */
/* loaded from: classes.dex */
public final class C26364m {

    /* renamed from: a */
    public static final C26364m f125218a = new C26364m();

    /* renamed from: b */
    private static final ExecutorService f125219b;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC19074t.m100207e(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f125219b = newSingleThreadExecutor;
    }

    private C26364m() {
    }

    /* renamed from: a */
    public final void m135711a(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "task");
        try {
            f125219b.execute(runnable);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final CoroutineDispatcher m135712b() {
        return ExecutorsKt.m112728b(f125219b);
    }
}
