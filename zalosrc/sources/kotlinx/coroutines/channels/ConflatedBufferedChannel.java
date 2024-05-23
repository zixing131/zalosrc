package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.AbstractC24845f;
import pm0.C24848g0;
import wm0.AbstractC29094b;

/* loaded from: classes7.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {

    /* renamed from: B */
    private final int f106291B;

    /* renamed from: C */
    private final BufferOverflow f106292C;

    public /* synthetic */ ConflatedBufferedChannel(int i11, BufferOverflow bufferOverflow, InterfaceC18505l interfaceC18505l, int i12, AbstractC19060k abstractC19060k) {
        this(i11, bufferOverflow, (i12 & 4) != 0 ? null : interfaceC18505l);
    }

    /* renamed from: d1 */
    static /* synthetic */ Object m113176d1(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        UndeliveredElementException m113697d;
        Object m113180h1 = conflatedBufferedChannel.m113180h1(obj, true);
        if (m113180h1 instanceof ChannelResult.Closed) {
            ChannelResult.m113084e(m113180h1);
            InterfaceC18505l interfaceC18505l = conflatedBufferedChannel.f106012q;
            if (interfaceC18505l != null && (m113697d = OnUndeliveredElementKt.m113697d(interfaceC18505l, obj, null, 2, null)) != null) {
                AbstractC24845f.m129182a(m113697d, conflatedBufferedChannel.m113007Y());
                throw m113697d;
            }
            throw conflatedBufferedChannel.m113007Y();
        }
        return C24848g0.f119245a;
    }

    /* renamed from: e1 */
    static /* synthetic */ Object m113177e1(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        Object m113180h1 = conflatedBufferedChannel.m113180h1(obj, true);
        if (!(m113180h1 instanceof ChannelResult.Failed)) {
            return AbstractC29094b.m145339a(true);
        }
        return AbstractC29094b.m145339a(false);
    }

    /* renamed from: f1 */
    private final Object m113178f1(Object obj, boolean z11) {
        InterfaceC18505l interfaceC18505l;
        UndeliveredElementException m113697d;
        Object mo112912p = super.mo112912p(obj);
        if (!ChannelResult.m113088i(mo112912p) && !ChannelResult.m113087h(mo112912p)) {
            if (z11 && (interfaceC18505l = this.f106012q) != null && (m113697d = OnUndeliveredElementKt.m113697d(interfaceC18505l, obj, null, 2, null)) != null) {
                throw m113697d;
            }
            return ChannelResult.f106070b.m113093c(C24848g0.f119245a);
        }
        return mo112912p;
    }

    /* renamed from: g1 */
    private final Object m113179g1(Object obj) {
        ChannelSegment channelSegment;
        Waiter waiter;
        Object obj2 = BufferedChannelKt.f106046d;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.f106007w.get(this);
        while (true) {
            long andIncrement = BufferedChannel.f106003s.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean m112978i0 = m112978i0(andIncrement);
            int i11 = BufferedChannelKt.f106044b;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            if (channelSegment2.f107415r != j12) {
                ChannelSegment m112951R = m112951R(j12, channelSegment2);
                if (m112951R == null) {
                    if (m112978i0) {
                        return ChannelResult.f106070b.m113091a(m113007Y());
                    }
                } else {
                    channelSegment = m112951R;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int m112960Y0 = m112960Y0(channelSegment, i12, obj, j11, obj2, m112978i0);
            if (m112960Y0 != 0) {
                if (m112960Y0 != 1) {
                    if (m112960Y0 != 2) {
                        if (m112960Y0 != 3) {
                            if (m112960Y0 != 4) {
                                if (m112960Y0 == 5) {
                                    channelSegment.m113592b();
                                }
                                channelSegment2 = channelSegment;
                            } else {
                                if (j11 < m113006X()) {
                                    channelSegment.m113592b();
                                }
                                return ChannelResult.f106070b.m113091a(m113007Y());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (m112978i0) {
                            channelSegment.m113703p();
                            return ChannelResult.f106070b.m113091a(m113007Y());
                        }
                        if (obj2 instanceof Waiter) {
                            waiter = (Waiter) obj2;
                        } else {
                            waiter = null;
                        }
                        if (waiter != null) {
                            m113000z0(waiter, channelSegment, i12);
                        }
                        m113002N((channelSegment.f107415r * i11) + i12);
                        return ChannelResult.f106070b.m113093c(C24848g0.f119245a);
                    }
                } else {
                    return ChannelResult.f106070b.m113093c(C24848g0.f119245a);
                }
            } else {
                channelSegment.m113592b();
                return ChannelResult.f106070b.m113093c(C24848g0.f119245a);
            }
        }
    }

    /* renamed from: h1 */
    private final Object m113180h1(Object obj, boolean z11) {
        if (this.f106292C == BufferOverflow.DROP_LATEST) {
            return m113178f1(obj, z11);
        }
        return m113179g1(obj);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: H0 */
    public void mo112907H0(SelectInstance selectInstance, Object obj) {
        Object mo112912p = mo112912p(obj);
        if (!(mo112912p instanceof ChannelResult.Failed)) {
            selectInstance.mo113855d(C24848g0.f119245a);
        } else {
            if (mo112912p instanceof ChannelResult.Closed) {
                ChannelResult.m113084e(mo112912p);
                selectInstance.mo113855d(BufferedChannelKt.m113072z());
                return;
            }
            throw new IllegalStateException("unreachable".toString());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: N0 */
    public Object mo113003N0(Object obj, Continuation continuation) {
        return m113177e1(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: R0 */
    public boolean mo113004R0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    public Object mo112908S(Object obj, Continuation continuation) {
        return m113176d1(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: j0 */
    protected boolean mo113013j0() {
        if (this.f106292C == BufferOverflow.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    public Object mo112912p(Object obj) {
        return m113180h1(obj, false);
    }

    public ConflatedBufferedChannel(int i11, BufferOverflow bufferOverflow, InterfaceC18505l interfaceC18505l) {
        super(i11, interfaceC18505l);
        this.f106291B = i11;
        this.f106292C = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC19061k0.m100169b(BufferedChannel.class).mo100163c() + " instead").toString());
        }
        if (i11 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i11 + " was specified").toString());
    }
}
