package kotlinx.coroutines.sync;

import com.google.android.gms.internal.ads.ya3;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.AbstractC21798a;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public class SemaphoreImpl implements Semaphore {

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f107596c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");

    /* renamed from: d */
    private static final AtomicLongFieldUpdater f107597d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f107598e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f107599f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f107600g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a */
    private final int f107601a;

    /* renamed from: b */
    private final InterfaceC18505l f107602b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public SemaphoreImpl(int i11, int i12) {
        this.f107601a = i11;
        if (i11 > 0) {
            if (i12 >= 0 && i12 <= i11) {
                SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
                this.head = semaphoreSegment;
                this.tail = semaphoreSegment;
                this._availablePermits = i11 - i12;
                this.f107602b = new SemaphoreImpl$onCancellationRelease$1(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i11).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i11).toString());
    }

    /* renamed from: f */
    static /* synthetic */ Object m113916f(SemaphoreImpl semaphoreImpl, Continuation continuation) {
        Object m142578e;
        if (semaphoreImpl.m113920j() > 0) {
            return C24848g0.f119245a;
        }
        Object m113917g = semaphoreImpl.m113917g(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113917g == m142578e) {
            return m113917g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: g */
    private final Object m113917g(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl m112591b = CancellableContinuationKt.m112591b(m142576c);
        try {
            if (!m113918h(m112591b)) {
                m113923e(m112591b);
            }
            Object m112571A = m112591b.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            m142578e2 = AbstractC28298d.m142578e();
            if (m112571A == m142578e2) {
                return m112571A;
            }
            return C24848g0.f119245a;
        } catch (Throwable th2) {
            m112591b.m112577O();
            throw th2;
        }
    }

    /* renamed from: h */
    public final boolean m113918h(Waiter waiter) {
        int i11;
        Object m113587c;
        int i12;
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107598e;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f107599f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.f107603y;
        i11 = SemaphoreKt.f107611f;
        long j11 = andIncrement / i11;
        loop0: while (true) {
            m113587c = ConcurrentLinkedListKt.m113587c(semaphoreSegment, j11, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m113709e(m113587c)) {
                Segment m113707c = SegmentOrClosed.m113707c(m113587c);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f107415r >= m113707c.f107415r) {
                        break loop0;
                    }
                    if (!m113707c.m113704q()) {
                        break;
                    }
                    if (ya3.m28173a(atomicReferenceFieldUpdater, this, segment, m113707c)) {
                        if (segment.m113702m()) {
                            segment.m113598k();
                        }
                    } else if (m113707c.m113702m()) {
                        m113707c.m113598k();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m113707c(m113587c);
        i12 = SemaphoreKt.f107611f;
        int i13 = (int) (andIncrement % i12);
        if (!AbstractC21798a.m113202a(semaphoreSegment2.m113941r(), i13, null, waiter)) {
            symbol = SemaphoreKt.f107607b;
            symbol2 = SemaphoreKt.f107608c;
            if (AbstractC21798a.m113202a(semaphoreSegment2.m113941r(), i13, symbol, symbol2)) {
                if (waiter instanceof CancellableContinuation) {
                    AbstractC19074t.m100206d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((CancellableContinuation) waiter).mo112551y(C24848g0.f119245a, this.f107602b);
                } else if (waiter instanceof SelectInstance) {
                    ((SelectInstance) waiter).mo113855d(C24848g0.f119245a);
                } else {
                    throw new IllegalStateException(("unexpected: " + waiter).toString());
                }
                return true;
            }
            return false;
        }
        waiter.mo112580b(semaphoreSegment2, i13);
        return true;
    }

    /* renamed from: i */
    private final void m113919i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        int i12;
        do {
            atomicIntegerFieldUpdater = f107600g;
            i11 = atomicIntegerFieldUpdater.get(this);
            i12 = this.f107601a;
            if (i11 <= i12) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i12));
    }

    /* renamed from: j */
    private final int m113920j() {
        int andDecrement;
        do {
            andDecrement = f107600g.getAndDecrement(this);
        } while (andDecrement > this.f107601a);
        return andDecrement;
    }

    /* renamed from: n */
    private final boolean m113921n(Object obj) {
        if (obj instanceof CancellableContinuation) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Object mo112544R = cancellableContinuation.mo112544R(C24848g0.f119245a, null, this.f107602b);
            if (mo112544R != null) {
                cancellableContinuation.mo112545U(mo112544R);
                return true;
            }
            return false;
        }
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).mo113857f(this, C24848g0.f119245a);
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    /* renamed from: o */
    private final boolean m113922o() {
        int i11;
        Object m113587c;
        int i12;
        Symbol symbol;
        Symbol symbol2;
        int i13;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107596c;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f107597d.getAndIncrement(this);
        i11 = SemaphoreKt.f107611f;
        long j11 = andIncrement / i11;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.f107605y;
        loop0: while (true) {
            m113587c = ConcurrentLinkedListKt.m113587c(semaphoreSegment, j11, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m113709e(m113587c)) {
                break;
            }
            Segment m113707c = SegmentOrClosed.m113707c(m113587c);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.f107415r >= m113707c.f107415r) {
                    break loop0;
                }
                if (!m113707c.m113704q()) {
                    break;
                }
                if (ya3.m28173a(atomicReferenceFieldUpdater, this, segment, m113707c)) {
                    if (segment.m113702m()) {
                        segment.m113598k();
                    }
                } else if (m113707c.m113702m()) {
                    m113707c.m113598k();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m113707c(m113587c);
        semaphoreSegment2.m113592b();
        if (semaphoreSegment2.f107415r <= j11) {
            i12 = SemaphoreKt.f107611f;
            int i14 = (int) (andIncrement % i12);
            symbol = SemaphoreKt.f107607b;
            Object andSet = semaphoreSegment2.m113941r().getAndSet(i14, symbol);
            if (andSet == null) {
                i13 = SemaphoreKt.f107606a;
                for (int i15 = 0; i15 < i13; i15++) {
                    Object obj = semaphoreSegment2.m113941r().get(i14);
                    symbol5 = SemaphoreKt.f107608c;
                    if (obj == symbol5) {
                        return true;
                    }
                }
                symbol3 = SemaphoreKt.f107607b;
                symbol4 = SemaphoreKt.f107609d;
                return !AbstractC21798a.m113202a(semaphoreSegment2.m113941r(), i14, symbol3, symbol4);
            }
            symbol2 = SemaphoreKt.f107610e;
            if (andSet == symbol2) {
                return false;
            }
            return m113921n(andSet);
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    /* renamed from: a */
    public Object mo113914a(Continuation continuation) {
        return m113916f(this, continuation);
    }

    /* renamed from: e */
    public final void m113923e(CancellableContinuation cancellableContinuation) {
        while (m113920j() <= 0) {
            AbstractC19074t.m100206d(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m113918h((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.mo112551y(C24848g0.f119245a, this.f107602b);
    }

    /* renamed from: k */
    public int m113924k() {
        return Math.max(f107600g.get(this), 0);
    }

    /* renamed from: l */
    public final void m113925l(SelectInstance selectInstance, Object obj) {
        while (m113920j() <= 0) {
            AbstractC19074t.m100206d(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m113918h((Waiter) selectInstance)) {
                return;
            }
        }
        selectInstance.mo113855d(C24848g0.f119245a);
    }

    /* renamed from: m */
    public boolean m113926m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f107600g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 > this.f107601a) {
                m113919i();
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        do {
            int andIncrement = f107600g.getAndIncrement(this);
            if (andIncrement < this.f107601a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                m113919i();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f107601a).toString());
            }
        } while (!m113922o());
    }
}
