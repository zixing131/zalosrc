package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {

    /* renamed from: t */
    private final BufferedChannel f106074t;

    /* renamed from: u */
    private final AtomicReferenceArray f106075u;

    public ChannelSegment(long j11, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i11) {
        super(j11, channelSegment, i11);
        this.f106074t = bufferedChannel;
        this.f106075u = new AtomicReferenceArray(BufferedChannelKt.f106044b * 2);
    }

    /* renamed from: z */
    private final void m113094z(int i11, Object obj) {
        this.f106075u.lazySet(i11 * 2, obj);
    }

    /* renamed from: A */
    public final void m113095A(int i11, Object obj) {
        this.f106075u.set((i11 * 2) + 1, obj);
    }

    /* renamed from: B */
    public final void m113096B(int i11, Object obj) {
        m113094z(i11, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* renamed from: n */
    public int mo113097n() {
        return BufferedChannelKt.f106044b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:            m113100s(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:            if (r0 == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:            r4 = m113102u().f106012q;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:            if (r4 == null) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:            kotlinx.coroutines.internal.OnUndeliveredElementKt.m113695b(r4, r5, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:            return;     */
    @Override // kotlinx.coroutines.internal.Segment
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo113098o(int i11, Throwable th2, InterfaceC27315f interfaceC27315f) {
        boolean z11;
        InterfaceC18505l interfaceC18505l;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        int i12 = BufferedChannelKt.f106044b;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 -= i12;
        }
        Object m113103v = m113103v(i11);
        while (true) {
            Object m113104w = m113104w(i11);
            if (!(m113104w instanceof Waiter) && !(m113104w instanceof WaiterEB)) {
                symbol = BufferedChannelKt.f106052j;
                if (m113104w == symbol) {
                    break;
                }
                symbol2 = BufferedChannelKt.f106053k;
                if (m113104w == symbol2) {
                    break;
                }
                symbol3 = BufferedChannelKt.f106049g;
                if (m113104w != symbol3) {
                    symbol4 = BufferedChannelKt.f106048f;
                    if (m113104w != symbol4) {
                        symbol5 = BufferedChannelKt.f106051i;
                        if (m113104w == symbol5 || m113104w == BufferedChannelKt.f106046d || m113104w == BufferedChannelKt.m113072z()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + m113104w).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (m113099r(i11, m113104w, z11 ? BufferedChannelKt.f106052j : BufferedChannelKt.f106053k)) {
                    m113100s(i11);
                    m113105x(i11, !z11);
                    if (z11 && (interfaceC18505l = m113102u().f106012q) != null) {
                        OnUndeliveredElementKt.m113695b(interfaceC18505l, m113103v, interfaceC27315f);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public final boolean m113099r(int i11, Object obj, Object obj2) {
        return AbstractC21798a.m113202a(this.f106075u, (i11 * 2) + 1, obj, obj2);
    }

    /* renamed from: s */
    public final void m113100s(int i11) {
        m113094z(i11, null);
    }

    /* renamed from: t */
    public final Object m113101t(int i11, Object obj) {
        return this.f106075u.getAndSet((i11 * 2) + 1, obj);
    }

    /* renamed from: u */
    public final BufferedChannel m113102u() {
        BufferedChannel bufferedChannel = this.f106074t;
        AbstractC19074t.m100205c(bufferedChannel);
        return bufferedChannel;
    }

    /* renamed from: v */
    public final Object m113103v(int i11) {
        return this.f106075u.get(i11 * 2);
    }

    /* renamed from: w */
    public final Object m113104w(int i11) {
        return this.f106075u.get((i11 * 2) + 1);
    }

    /* renamed from: x */
    public final void m113105x(int i11, boolean z11) {
        if (z11) {
            m113102u().m113011c1((this.f107415r * BufferedChannelKt.f106044b) + i11);
        }
        m113703p();
    }

    /* renamed from: y */
    public final Object m113106y(int i11) {
        Object m113103v = m113103v(i11);
        m113100s(i11);
        return m113103v;
    }
}
