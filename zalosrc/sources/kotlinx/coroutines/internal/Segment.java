package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f107414s = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: r */
    public final long f107415r;

    public Segment(long j11, Segment segment, int i11) {
        super(segment);
        this.f107415r = j11;
        this.cleanedAndPointers = i11 << 16;
    }

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    /* renamed from: h */
    public boolean mo113595h() {
        if (f107414s.get(this) == mo113097n() && !m113596i()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m113702m() {
        if (f107414s.addAndGet(this, -65536) == mo113097n() && !m113596i()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract int mo113097n();

    /* renamed from: o */
    public abstract void mo113098o(int i11, Throwable th2, InterfaceC27315f interfaceC27315f);

    /* renamed from: p */
    public final void m113703p() {
        if (f107414s.incrementAndGet(this) == mo113097n()) {
            m113598k();
        }
    }

    /* renamed from: q */
    public final boolean m113704q() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f107414s;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 == mo113097n() && !m113596i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 65536 + i11));
        return true;
    }
}
