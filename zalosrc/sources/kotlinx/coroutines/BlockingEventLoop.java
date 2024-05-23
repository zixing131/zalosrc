package kotlinx.coroutines;

/* loaded from: classes7.dex */
public final class BlockingEventLoop extends EventLoopImplBase {

    /* renamed from: x */
    private final Thread f105810x;

    public BlockingEventLoop(Thread thread) {
        this.f105810x = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: S0 */
    protected Thread mo112527S0() {
        return this.f105810x;
    }
}
