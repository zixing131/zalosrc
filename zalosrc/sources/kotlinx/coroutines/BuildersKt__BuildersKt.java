package kotlinx.coroutines;

import en0.InterfaceC18509p;
import um0.C27316g;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class BuildersKt__BuildersKt {
    /* renamed from: a */
    public static final Object m112535a(InterfaceC27315f interfaceC27315f, InterfaceC18509p interfaceC18509p) {
        EventLoop eventLoop;
        EventLoop m112868a;
        InterfaceC27315f m112615d;
        Thread currentThread = Thread.currentThread();
        InterfaceC27313d interfaceC27313d = (InterfaceC27313d) interfaceC27315f.mo112624d(InterfaceC27313d.f128556o);
        if (interfaceC27313d == null) {
            m112868a = ThreadLocalEventLoop.f105943a.m112869b();
            m112615d = CoroutineContextKt.m112615d(GlobalScope.f105887p, interfaceC27315f.mo112823d0(m112868a));
        } else {
            EventLoop eventLoop2 = null;
            if (interfaceC27313d instanceof EventLoop) {
                eventLoop = (EventLoop) interfaceC27313d;
            } else {
                eventLoop = null;
            }
            if (eventLoop != null) {
                if (eventLoop.m112695R0()) {
                    eventLoop2 = eventLoop;
                }
                if (eventLoop2 != null) {
                    m112868a = eventLoop2;
                    m112615d = CoroutineContextKt.m112615d(GlobalScope.f105887p, interfaceC27315f);
                }
            }
            m112868a = ThreadLocalEventLoop.f105943a.m112868a();
            m112615d = CoroutineContextKt.m112615d(GlobalScope.f105887p, interfaceC27315f);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(m112615d, currentThread, m112868a);
        blockingCoroutine.m112501s1(CoroutineStart.DEFAULT, blockingCoroutine, interfaceC18509p);
        return blockingCoroutine.m112526t1();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m112536b(InterfaceC27315f interfaceC27315f, InterfaceC18509p interfaceC18509p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC27315f = C27316g.f128559p;
        }
        return BuildersKt.m112532e(interfaceC27315f, interfaceC18509p);
    }
}
