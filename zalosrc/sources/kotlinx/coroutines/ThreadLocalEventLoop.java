package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* loaded from: classes7.dex */
public final class ThreadLocalEventLoop {

    /* renamed from: a */
    public static final ThreadLocalEventLoop f105943a = new ThreadLocalEventLoop();

    /* renamed from: b */
    private static final ThreadLocal f105944b = ThreadLocalKt.m113735a(new Symbol("ThreadLocalEventLoop"));

    private ThreadLocalEventLoop() {
    }

    /* renamed from: a */
    public final EventLoop m112868a() {
        return (EventLoop) f105944b.get();
    }

    /* renamed from: b */
    public final EventLoop m112869b() {
        ThreadLocal threadLocal = f105944b;
        EventLoop eventLoop = (EventLoop) threadLocal.get();
        if (eventLoop == null) {
            EventLoop m112717a = EventLoopKt.m112717a();
            threadLocal.set(m112717a);
            return m112717a;
        }
        return eventLoop;
    }

    /* renamed from: c */
    public final void m112870c() {
        f105944b.set(null);
    }

    /* renamed from: d */
    public final void m112871d(EventLoop eventLoop) {
        f105944b.set(eventLoop);
    }
}
