package kotlinx.coroutines;

import fn0.AbstractC19074t;
import java.util.concurrent.locks.LockSupport;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class BlockingCoroutine<T> extends AbstractCoroutine<T> {

    /* renamed from: s */
    private final Thread f105808s;

    /* renamed from: t */
    private final EventLoop f105809t;

    public BlockingCoroutine(InterfaceC27315f interfaceC27315f, Thread thread, EventLoop eventLoop) {
        super(interfaceC27315f, true, true);
        this.f105808s = thread;
        this.f105809t = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: K0 */
    protected boolean mo112524K0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: h0 */
    public void mo112525h0(Object obj) {
        C24848g0 c24848g0;
        if (!AbstractC19074t.m100204b(Thread.currentThread(), this.f105808s)) {
            Thread thread = this.f105808s;
            AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
            if (m112510a != null) {
                m112510a.m112507f(thread);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                LockSupport.unpark(thread);
            }
        }
    }

    /* renamed from: t1 */
    public final Object m112526t1() {
        long j11;
        C24848g0 c24848g0;
        AbstractTimeSource m112510a = AbstractTimeSourceKt.m112510a();
        if (m112510a != null) {
            m112510a.m112504c();
        }
        try {
            EventLoop eventLoop = this.f105809t;
            CompletedExceptionally completedExceptionally = null;
            if (eventLoop != null) {
                EventLoop.m112686M0(eventLoop, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    EventLoop eventLoop2 = this.f105809t;
                    if (eventLoop2 != null) {
                        j11 = eventLoop2.mo112693P0();
                    } else {
                        j11 = Long.MAX_VALUE;
                    }
                    if (!mo112737f()) {
                        AbstractTimeSource m112510a2 = AbstractTimeSourceKt.m112510a();
                        if (m112510a2 != null) {
                            m112510a2.m112503b(this, j11);
                            c24848g0 = C24848g0.f119245a;
                        } else {
                            c24848g0 = null;
                        }
                        if (c24848g0 == null) {
                            LockSupport.parkNanos(this, j11);
                        }
                    } else {
                        EventLoop eventLoop3 = this.f105809t;
                        if (eventLoop3 != null) {
                            EventLoop.m112684H0(eventLoop3, false, 1, null);
                        }
                        Object m112860h = JobSupportKt.m112860h(m112815G0());
                        if (m112860h instanceof CompletedExceptionally) {
                            completedExceptionally = (CompletedExceptionally) m112860h;
                        }
                        if (completedExceptionally == null) {
                            return m112860h;
                        }
                        throw completedExceptionally.f105828a;
                    }
                } catch (Throwable th2) {
                    EventLoop eventLoop4 = this.f105809t;
                    if (eventLoop4 != null) {
                        EventLoop.m112684H0(eventLoop4, false, 1, null);
                    }
                    throw th2;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m112830k0(interruptedException);
            throw interruptedException;
        } finally {
            AbstractTimeSource m112510a3 = AbstractTimeSourceKt.m112510a();
            if (m112510a3 != null) {
                m112510a3.m112508g();
            }
        }
    }
}
