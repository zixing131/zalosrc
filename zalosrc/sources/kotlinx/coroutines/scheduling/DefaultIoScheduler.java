package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import ln0.AbstractC22543l;
import um0.C27316g;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class DefaultIoScheduler extends ExecutorCoroutineDispatcher implements Executor {

    /* renamed from: s */
    public static final DefaultIoScheduler f107470s = new DefaultIoScheduler();

    /* renamed from: t */
    private static final CoroutineDispatcher f107471t;

    static {
        int m116580c;
        int m113727e;
        UnlimitedIoScheduler unlimitedIoScheduler = UnlimitedIoScheduler.f107498r;
        m116580c = AbstractC22543l.m116580c(64, SystemPropsKt.m113713a());
        m113727e = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.io.parallelism", m116580c, 0, 0, 12, null);
        f107471t = unlimitedIoScheduler.mo112623F0(m113727e);
    }

    private DefaultIoScheduler() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: D0 */
    public void mo112622D0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        f107471t.mo112622D0(interfaceC27315f, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        return UnlimitedIoScheduler.f107498r.mo112623F0(i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo9279z0(C27316g.f128559p, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        f107471t.mo9279z0(interfaceC27315f, runnable);
    }
}
