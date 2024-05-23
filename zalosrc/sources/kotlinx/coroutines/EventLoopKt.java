package kotlinx.coroutines;

/* loaded from: classes7.dex */
public final class EventLoopKt {
    /* renamed from: a */
    public static final EventLoop m112717a() {
        return new BlockingEventLoop(Thread.currentThread());
    }
}
