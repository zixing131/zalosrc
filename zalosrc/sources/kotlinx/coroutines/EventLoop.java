package kotlinx.coroutines;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import qm0.C25348i;

/* loaded from: classes.dex */
public abstract class EventLoop extends CoroutineDispatcher {

    /* renamed from: r */
    private long f105870r;

    /* renamed from: s */
    private boolean f105871s;

    /* renamed from: t */
    private C25348i f105872t;

    /* renamed from: H0 */
    public static /* synthetic */ void m112684H0(EventLoop eventLoop, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            eventLoop.m112687G0(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    /* renamed from: I0 */
    private final long m112685I0(boolean z11) {
        return z11 ? 4294967296L : 1L;
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m112686M0(EventLoop eventLoop, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            eventLoop.m112690L0(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public final CoroutineDispatcher mo112623F0(int i11) {
        LimitedDispatcherKt.m113645a(i11);
        return this;
    }

    /* renamed from: G0 */
    public final void m112687G0(boolean z11) {
        long m112685I0 = this.f105870r - m112685I0(z11);
        this.f105870r = m112685I0;
        if (m112685I0 <= 0 && this.f105871s) {
            shutdown();
        }
    }

    /* renamed from: J0 */
    public final void m112688J0(DispatchedTask dispatchedTask) {
        C25348i c25348i = this.f105872t;
        if (c25348i == null) {
            c25348i = new C25348i();
            this.f105872t = c25348i;
        }
        c25348i.addLast(dispatchedTask);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K0 */
    public long mo112689K0() {
        C25348i c25348i = this.f105872t;
        if (c25348i == null || c25348i.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: L0 */
    public final void m112690L0(boolean z11) {
        this.f105870r += m112685I0(z11);
        if (!z11) {
            this.f105871s = true;
        }
    }

    /* renamed from: N0 */
    public final boolean m112691N0() {
        if (this.f105870r >= m112685I0(true)) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public final boolean m112692O0() {
        C25348i c25348i = this.f105872t;
        if (c25348i != null) {
            return c25348i.isEmpty();
        }
        return true;
    }

    /* renamed from: P0 */
    public long mo112693P0() {
        if (!m112694Q0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* renamed from: Q0 */
    public final boolean m112694Q0() {
        DispatchedTask dispatchedTask;
        C25348i c25348i = this.f105872t;
        if (c25348i == null || (dispatchedTask = (DispatchedTask) c25348i.m131273r()) == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    /* renamed from: R0 */
    public boolean m112695R0() {
        return false;
    }

    public void shutdown() {
    }
}
