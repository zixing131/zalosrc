package kotlinx.coroutines.channels;

import com.google.android.gms.internal.ads.ya3;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import on0.AbstractC24344y;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25368s;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public class BufferedChannel<E> implements Channel<E> {
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: p */
    private final int f106011p;

    /* renamed from: q */
    public final InterfaceC18505l f106012q;

    /* renamed from: r */
    private final InterfaceC18510q f106013r;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: s */
    private static final AtomicLongFieldUpdater f106003s = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");

    /* renamed from: t */
    private static final AtomicLongFieldUpdater f106004t = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");

    /* renamed from: u */
    private static final AtomicLongFieldUpdater f106005u = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");

    /* renamed from: v */
    private static final AtomicLongFieldUpdater f106006v = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: w */
    private static final AtomicReferenceFieldUpdater f106007w = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");

    /* renamed from: x */
    private static final AtomicReferenceFieldUpdater f106008x = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");

    /* renamed from: y */
    private static final AtomicReferenceFieldUpdater f106009y = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");

    /* renamed from: z */
    private static final AtomicReferenceFieldUpdater f106010z = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");

    /* renamed from: A */
    private static final AtomicReferenceFieldUpdater f106002A = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");

    /* loaded from: classes7.dex */
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {

        /* renamed from: p */
        private Object f106014p;

        /* renamed from: q */
        private CancellableContinuationImpl f106015q;

        public BufferedChannelIterator() {
            Symbol symbol;
            symbol = BufferedChannelKt.f106058p;
            this.f106014p = symbol;
        }

        /* renamed from: f */
        private final Object m113025f(ChannelSegment channelSegment, int i11, long j11, Continuation continuation) {
            Continuation m142576c;
            Symbol symbol;
            Symbol symbol2;
            Boolean m145339a;
            Symbol symbol3;
            Symbol symbol4;
            Symbol symbol5;
            Object m142578e;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl m112591b = CancellableContinuationKt.m112591b(m142576c);
            try {
                this.f106015q = m112591b;
                Object m112958W0 = bufferedChannel.m112958W0(channelSegment, i11, j11, this);
                symbol = BufferedChannelKt.f106055m;
                if (m112958W0 == symbol) {
                    bufferedChannel.m112999y0(this, channelSegment, i11);
                } else {
                    symbol2 = BufferedChannelKt.f106057o;
                    InterfaceC18505l interfaceC18505l = null;
                    if (m112958W0 == symbol2) {
                        if (j11 < bufferedChannel.m113008Z()) {
                            channelSegment.m113592b();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.f106008x.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.m113012g0()) {
                                m113027h();
                                break;
                            }
                            long andIncrement = BufferedChannel.f106004t.getAndIncrement(bufferedChannel);
                            int i12 = BufferedChannelKt.f106044b;
                            long j12 = andIncrement / i12;
                            int i13 = (int) (andIncrement % i12);
                            if (channelSegment2.f107415r != j12) {
                                ChannelSegment m112949Q = bufferedChannel.m112949Q(j12, channelSegment2);
                                if (m112949Q != null) {
                                    channelSegment2 = m112949Q;
                                }
                            }
                            Object m112958W02 = bufferedChannel.m112958W0(channelSegment2, i13, andIncrement, this);
                            symbol3 = BufferedChannelKt.f106055m;
                            if (m112958W02 == symbol3) {
                                bufferedChannel.m112999y0(this, channelSegment2, i13);
                                break;
                            }
                            symbol4 = BufferedChannelKt.f106057o;
                            if (m112958W02 != symbol4) {
                                symbol5 = BufferedChannelKt.f106056n;
                                if (m112958W02 != symbol5) {
                                    channelSegment2.m113592b();
                                    this.f106014p = m112958W02;
                                    this.f106015q = null;
                                    m145339a = AbstractC29094b.m145339a(true);
                                    InterfaceC18505l interfaceC18505l2 = bufferedChannel.f106012q;
                                    if (interfaceC18505l2 != null) {
                                        interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l2, m112958W02, m112591b.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < bufferedChannel.m113008Z()) {
                                channelSegment2.m113592b();
                            }
                        }
                    } else {
                        channelSegment.m113592b();
                        this.f106014p = m112958W0;
                        this.f106015q = null;
                        m145339a = AbstractC29094b.m145339a(true);
                        InterfaceC18505l interfaceC18505l3 = bufferedChannel.f106012q;
                        if (interfaceC18505l3 != null) {
                            interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l3, m112958W0, m112591b.getContext());
                        }
                    }
                    m112591b.mo112551y(m145339a, interfaceC18505l);
                }
                Object m112571A = m112591b.m112571A();
                m142578e = AbstractC28298d.m142578e();
                if (m112571A == m142578e) {
                    AbstractC29100h.m145355c(continuation);
                }
                return m112571A;
            } catch (Throwable th2) {
                m112591b.m112577O();
                throw th2;
            }
        }

        /* renamed from: g */
        private final boolean m113026g() {
            this.f106014p = BufferedChannelKt.m113072z();
            Throwable m113005V = BufferedChannel.this.m113005V();
            if (m113005V == null) {
                return false;
            }
            throw StackTraceRecoveryKt.m113712a(m113005V);
        }

        /* renamed from: h */
        public final void m113027h() {
            CancellableContinuationImpl cancellableContinuationImpl = this.f106015q;
            AbstractC19074t.m100205c(cancellableContinuationImpl);
            this.f106015q = null;
            this.f106014p = BufferedChannelKt.m113072z();
            Throwable m113005V = BufferedChannel.this.m113005V();
            if (m113005V == null) {
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(Boolean.FALSE));
            } else {
                C24861r.a aVar2 = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m113005V)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        /* renamed from: a */
        public Object mo113028a(Continuation continuation) {
            ChannelSegment channelSegment;
            Symbol symbol;
            Symbol symbol2;
            Symbol symbol3;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.f106008x.get(bufferedChannel);
            while (!bufferedChannel.m113012g0()) {
                long andIncrement = BufferedChannel.f106004t.getAndIncrement(bufferedChannel);
                int i11 = BufferedChannelKt.f106044b;
                long j11 = andIncrement / i11;
                int i12 = (int) (andIncrement % i11);
                if (channelSegment2.f107415r != j11) {
                    ChannelSegment m112949Q = bufferedChannel.m112949Q(j11, channelSegment2);
                    if (m112949Q == null) {
                        continue;
                    } else {
                        channelSegment = m112949Q;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object m112958W0 = bufferedChannel.m112958W0(channelSegment, i12, andIncrement, null);
                symbol = BufferedChannelKt.f106055m;
                if (m112958W0 != symbol) {
                    symbol2 = BufferedChannelKt.f106057o;
                    if (m112958W0 != symbol2) {
                        symbol3 = BufferedChannelKt.f106056n;
                        if (m112958W0 == symbol3) {
                            return m113025f(channelSegment, i12, andIncrement, continuation);
                        }
                        channelSegment.m113592b();
                        this.f106014p = m112958W0;
                        return AbstractC29094b.m145339a(true);
                    }
                    if (andIncrement < bufferedChannel.m113008Z()) {
                        channelSegment.m113592b();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return AbstractC29094b.m145339a(m113026g());
        }

        @Override // kotlinx.coroutines.Waiter
        /* renamed from: b */
        public void mo112580b(Segment segment, int i11) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f106015q;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.mo112580b(segment, i11);
            }
        }

        /* renamed from: i */
        public final boolean m113029i(Object obj) {
            boolean m113045B;
            CancellableContinuationImpl cancellableContinuationImpl = this.f106015q;
            AbstractC19074t.m100205c(cancellableContinuationImpl);
            InterfaceC18505l interfaceC18505l = null;
            this.f106015q = null;
            this.f106014p = obj;
            Boolean bool = Boolean.TRUE;
            InterfaceC18505l interfaceC18505l2 = BufferedChannel.this.f106012q;
            if (interfaceC18505l2 != null) {
                interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l2, obj, cancellableContinuationImpl.getContext());
            }
            m113045B = BufferedChannelKt.m113045B(cancellableContinuationImpl, bool, interfaceC18505l);
            return m113045B;
        }

        /* renamed from: j */
        public final void m113030j() {
            CancellableContinuationImpl cancellableContinuationImpl = this.f106015q;
            AbstractC19074t.m100205c(cancellableContinuationImpl);
            this.f106015q = null;
            this.f106014p = BufferedChannelKt.m113072z();
            Throwable m113005V = BufferedChannel.this.m113005V();
            if (m113005V == null) {
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(Boolean.FALSE));
            } else {
                C24861r.a aVar2 = C24861r.f119264q;
                cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m113005V)));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object next() {
            Symbol symbol;
            Symbol symbol2;
            Object obj = this.f106014p;
            symbol = BufferedChannelKt.f106058p;
            if (obj != symbol) {
                symbol2 = BufferedChannelKt.f106058p;
                this.f106014p = symbol2;
                if (obj != BufferedChannelKt.m113072z()) {
                    return obj;
                }
                throw StackTraceRecoveryKt.m113712a(BufferedChannel.this.m112957W());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* loaded from: classes7.dex */
    public static final class SendBroadcast implements Waiter {

        /* renamed from: p */
        private final CancellableContinuation f106017p;

        /* renamed from: q */
        private final /* synthetic */ CancellableContinuationImpl f106018q;

        public SendBroadcast(CancellableContinuation cancellableContinuation) {
            this.f106017p = cancellableContinuation;
            AbstractC19074t.m100206d(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f106018q = (CancellableContinuationImpl) cancellableContinuation;
        }

        /* renamed from: a */
        public final CancellableContinuation m113031a() {
            return this.f106017p;
        }

        @Override // kotlinx.coroutines.Waiter
        /* renamed from: b */
        public void mo112580b(Segment segment, int i11) {
            this.f106018q.mo112580b(segment, i11);
        }
    }

    public BufferedChannel(int i11, InterfaceC18505l interfaceC18505l) {
        long m113044A;
        Symbol symbol;
        this.f106011p = i11;
        this.f106012q = interfaceC18505l;
        if (i11 >= 0) {
            m113044A = BufferedChannelKt.m113044A(i11);
            this.bufferEnd = m113044A;
            this.completedExpandBuffersAndPauseFlag = m112954U();
            ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
            this.sendSegment = channelSegment;
            this.receiveSegment = channelSegment;
            if (m112981k0()) {
                channelSegment = BufferedChannelKt.f106043a;
                AbstractC19074t.m100206d(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = channelSegment;
            this.f106013r = interfaceC18505l != null ? new C21797xffb418de(this) : null;
            symbol = BufferedChannelKt.f106061s;
            this._closeCause = symbol;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i11 + ", should be >=0").toString());
    }

    /* renamed from: A0 */
    public final Object m112925A0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.m113072z()) {
            return obj2;
        }
        throw m112957W();
    }

    /* renamed from: B0 */
    public final Object m112926B0(Object obj, Object obj2) {
        Object m113093c;
        if (obj2 == BufferedChannelKt.m113072z()) {
            m113093c = ChannelResult.f106070b.m113091a(m113005V());
        } else {
            m113093c = ChannelResult.f106070b.m113093c(obj2);
        }
        return ChannelResult.m113081b(m113093c);
    }

    /* renamed from: C0 */
    public final Object m112928C0(Object obj, Object obj2) {
        if (obj2 == BufferedChannelKt.m113072z()) {
            if (m113005V() == null) {
                return null;
            }
            throw m112957W();
        }
        return obj2;
    }

    /* renamed from: D0 */
    public final Object m112930D0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.m113072z()) {
            return this;
        }
        throw m113007Y();
    }

    /* renamed from: E */
    private final boolean m112931E(long j11) {
        if (j11 >= m112954U() && j11 >= m113006X() + this.f106011p) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m112932E0(BufferedChannel bufferedChannel, Continuation continuation) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        Object m142578e;
        int i11;
        ChannelSegment channelSegment;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            int i12 = bufferedChannel$receiveCatching$1.f106033u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.f106033u = i12 - Integer.MIN_VALUE;
                BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                Object obj = bufferedChannel$receiveCatching$12.f106031s;
                m142578e = AbstractC28298d.m142578e();
                i11 = bufferedChannel$receiveCatching$12.f106033u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                        return ((ChannelResult) obj).m113090k();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                ChannelSegment channelSegment2 = (ChannelSegment) f106008x.get(bufferedChannel);
                while (!bufferedChannel.m113012g0()) {
                    long andIncrement = f106004t.getAndIncrement(bufferedChannel);
                    int i13 = BufferedChannelKt.f106044b;
                    long j11 = andIncrement / i13;
                    int i14 = (int) (andIncrement % i13);
                    if (channelSegment2.f107415r != j11) {
                        ChannelSegment m112949Q = bufferedChannel.m112949Q(j11, channelSegment2);
                        if (m112949Q == null) {
                            continue;
                        } else {
                            channelSegment = m112949Q;
                        }
                    } else {
                        channelSegment = channelSegment2;
                    }
                    Object m112958W0 = bufferedChannel.m112958W0(channelSegment, i14, andIncrement, null);
                    symbol = BufferedChannelKt.f106055m;
                    if (m112958W0 != symbol) {
                        symbol2 = BufferedChannelKt.f106057o;
                        if (m112958W0 != symbol2) {
                            symbol3 = BufferedChannelKt.f106056n;
                            if (m112958W0 == symbol3) {
                                bufferedChannel$receiveCatching$12.f106033u = 1;
                                Object m112933F0 = bufferedChannel.m112933F0(channelSegment, i14, andIncrement, bufferedChannel$receiveCatching$12);
                                if (m112933F0 == m142578e) {
                                    return m142578e;
                                }
                                return m112933F0;
                            }
                            channelSegment.m113592b();
                            return ChannelResult.f106070b.m113093c(m112958W0);
                        }
                        if (andIncrement < bufferedChannel.m113008Z()) {
                            channelSegment.m113592b();
                        }
                        channelSegment2 = channelSegment;
                    } else {
                        throw new IllegalStateException("unexpected".toString());
                    }
                }
                return ChannelResult.f106070b.m113091a(bufferedChannel.m113005V());
            }
        }
        bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        Object obj2 = bufferedChannel$receiveCatching$122.f106031s;
        m142578e = AbstractC28298d.m142578e();
        i11 = bufferedChannel$receiveCatching$122.f106033u;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m112933F0(ChannelSegment channelSegment, int i11, long j11, Continuation continuation) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        Object m142578e;
        int i12;
        Continuation m142576c;
        Symbol symbol;
        Symbol symbol2;
        ChannelResult m113081b;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Object m142578e2;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            int i13 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106040y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106040y = i13 - Integer.MIN_VALUE;
                Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106038w;
                m142578e = AbstractC28298d.m142578e();
                i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106040y;
                if (i12 == 0) {
                    if (i12 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106034s = this;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106035t = channelSegment;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106036u = i11;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106037v = j11;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106040y = 1;
                    m142576c = AbstractC28297c.m142576c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                    CancellableContinuationImpl m112591b = CancellableContinuationKt.m112591b(m142576c);
                    try {
                        AbstractC19074t.m100206d(m112591b, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>");
                        ReceiveCatching receiveCatching = new ReceiveCatching(m112591b);
                        Object m112958W0 = m112958W0(channelSegment, i11, j11, receiveCatching);
                        symbol = BufferedChannelKt.f106055m;
                        if (m112958W0 == symbol) {
                            m112999y0(receiveCatching, channelSegment, i11);
                        } else {
                            symbol2 = BufferedChannelKt.f106057o;
                            InterfaceC18505l interfaceC18505l = null;
                            if (m112958W0 == symbol2) {
                                if (j11 < m113008Z()) {
                                    channelSegment.m113592b();
                                }
                                ChannelSegment channelSegment2 = (ChannelSegment) f106008x.get(this);
                                while (true) {
                                    if (m113012g0()) {
                                        m112990r0(m112591b);
                                        break;
                                    }
                                    long andIncrement = f106004t.getAndIncrement(this);
                                    int i14 = BufferedChannelKt.f106044b;
                                    long j12 = andIncrement / i14;
                                    int i15 = (int) (andIncrement % i14);
                                    if (channelSegment2.f107415r != j12) {
                                        ChannelSegment m112949Q = m112949Q(j12, channelSegment2);
                                        if (m112949Q != null) {
                                            channelSegment2 = m112949Q;
                                        }
                                    }
                                    Object m112958W02 = m112958W0(channelSegment2, i15, andIncrement, receiveCatching);
                                    symbol3 = BufferedChannelKt.f106055m;
                                    if (m112958W02 == symbol3) {
                                        m112999y0(receiveCatching, channelSegment2, i15);
                                        break;
                                    }
                                    symbol4 = BufferedChannelKt.f106057o;
                                    if (m112958W02 != symbol4) {
                                        symbol5 = BufferedChannelKt.f106056n;
                                        if (m112958W02 != symbol5) {
                                            channelSegment2.m113592b();
                                            m113081b = ChannelResult.m113081b(ChannelResult.f106070b.m113093c(m112958W02));
                                            InterfaceC18505l interfaceC18505l2 = this.f106012q;
                                            if (interfaceC18505l2 != null) {
                                                interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l2, m112958W02, m112591b.getContext());
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                    } else if (andIncrement < m113008Z()) {
                                        channelSegment2.m113592b();
                                    }
                                }
                            } else {
                                channelSegment.m113592b();
                                m113081b = ChannelResult.m113081b(ChannelResult.f106070b.m113093c(m112958W0));
                                InterfaceC18505l interfaceC18505l3 = this.f106012q;
                                if (interfaceC18505l3 != null) {
                                    interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l3, m112958W0, m112591b.getContext());
                                }
                            }
                            m112591b.mo112551y(m113081b, interfaceC18505l);
                        }
                        obj = m112591b.m112571A();
                        m142578e2 = AbstractC28298d.m142578e();
                        if (obj == m142578e2) {
                            AbstractC29100h.m145355c(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                        }
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    } catch (Throwable th2) {
                        m112591b.m112577O();
                        throw th2;
                    }
                }
                return ((ChannelResult) obj).m113090k();
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        Object obj2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106038w;
        m142578e = AbstractC28298d.m142578e();
        i12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.f106040y;
        if (i12 == 0) {
        }
        return ((ChannelResult) obj2).m113090k();
    }

    /* renamed from: G */
    private final void m112934G(ChannelSegment channelSegment, long j11) {
        Symbol symbol;
        Object m113635b = InlineList.m113635b(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i11 = BufferedChannelKt.f106044b - 1; -1 < i11; i11--) {
                if ((channelSegment.f107415r * BufferedChannelKt.f106044b) + i11 < j11) {
                    break loop0;
                }
                while (true) {
                    Object m113104w = channelSegment.m113104w(i11);
                    if (m113104w != null) {
                        symbol = BufferedChannelKt.f106047e;
                        if (m113104w != symbol) {
                            if (m113104w instanceof WaiterEB) {
                                if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                                    m113635b = InlineList.m113638e(m113635b, ((WaiterEB) m113104w).f106323a);
                                    channelSegment.m113105x(i11, true);
                                    break;
                                }
                            } else {
                                if (!(m113104w instanceof Waiter)) {
                                    break;
                                }
                                if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                                    m113635b = InlineList.m113638e(m113635b, m113104w);
                                    channelSegment.m113105x(i11, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                        channelSegment.m113703p();
                        break;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.m113594g();
        }
        if (m113635b != null) {
            if (!(m113635b instanceof ArrayList)) {
                m112938J0((Waiter) m113635b);
                return;
            }
            AbstractC19074t.m100206d(m113635b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) m113635b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m112938J0((Waiter) arrayList.get(size));
            }
        }
    }

    /* renamed from: G0 */
    public final void m112935G0(SelectInstance selectInstance, Object obj) {
        Symbol symbol;
        Waiter waiter;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment = (ChannelSegment) f106008x.get(this);
        while (!m113012g0()) {
            long andIncrement = f106004t.getAndIncrement(this);
            int i11 = BufferedChannelKt.f106044b;
            long j11 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (channelSegment.f107415r != j11) {
                ChannelSegment m112949Q = m112949Q(j11, channelSegment);
                if (m112949Q == null) {
                    continue;
                } else {
                    channelSegment = m112949Q;
                }
            }
            Object m112958W0 = m112958W0(channelSegment, i12, andIncrement, selectInstance);
            symbol = BufferedChannelKt.f106055m;
            if (m112958W0 != symbol) {
                symbol2 = BufferedChannelKt.f106057o;
                if (m112958W0 != symbol2) {
                    symbol3 = BufferedChannelKt.f106056n;
                    if (m112958W0 != symbol3) {
                        channelSegment.m113592b();
                        selectInstance.mo113855d(m112958W0);
                        return;
                    }
                    throw new IllegalStateException("unexpected".toString());
                }
                if (andIncrement < m113008Z()) {
                    channelSegment.m113592b();
                }
            } else {
                if (selectInstance instanceof Waiter) {
                    waiter = (Waiter) selectInstance;
                } else {
                    waiter = null;
                }
                if (waiter != null) {
                    m112999y0(waiter, channelSegment, i12);
                    return;
                }
                return;
            }
        }
        m112992s0(selectInstance);
    }

    /* renamed from: I */
    private final ChannelSegment m112936I() {
        Object obj = f106009y.get(this);
        ChannelSegment channelSegment = (ChannelSegment) f106007w.get(this);
        if (channelSegment.f107415r > ((ChannelSegment) obj).f107415r) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) f106008x.get(this);
        if (channelSegment2.f107415r > ((ChannelSegment) obj).f107415r) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.m113586b((ConcurrentLinkedListNode) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:            r13 = (kotlinx.coroutines.channels.ChannelSegment) r13.m113594g();     */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m112937I0(ChannelSegment channelSegment) {
        Symbol symbol;
        Symbol symbol2;
        Waiter waiter;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        InterfaceC18505l interfaceC18505l = this.f106012q;
        UndeliveredElementException undeliveredElementException = null;
        Object m113635b = InlineList.m113635b(null, 1, null);
        loop0: do {
            int i11 = BufferedChannelKt.f106044b - 1;
            while (true) {
                if (-1 >= i11) {
                    break;
                }
                long j11 = (channelSegment.f107415r * BufferedChannelKt.f106044b) + i11;
                while (true) {
                    Object m113104w = channelSegment.m113104w(i11);
                    symbol = BufferedChannelKt.f106051i;
                    if (m113104w == symbol) {
                        break loop0;
                    }
                    if (m113104w != BufferedChannelKt.f106046d) {
                        symbol2 = BufferedChannelKt.f106047e;
                        if (m113104w != symbol2 && m113104w != null) {
                            if (!(m113104w instanceof Waiter) && !(m113104w instanceof WaiterEB)) {
                                symbol3 = BufferedChannelKt.f106049g;
                                if (m113104w == symbol3) {
                                    break loop0;
                                }
                                symbol4 = BufferedChannelKt.f106048f;
                                if (m113104w == symbol4) {
                                    break loop0;
                                }
                                symbol5 = BufferedChannelKt.f106049g;
                                if (m113104w != symbol5) {
                                    break;
                                }
                            } else {
                                if (j11 < m113006X()) {
                                    break loop0;
                                }
                                if (m113104w instanceof WaiterEB) {
                                    waiter = ((WaiterEB) m113104w).f106323a;
                                } else {
                                    waiter = (Waiter) m113104w;
                                }
                                if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                                    if (interfaceC18505l != null) {
                                        undeliveredElementException = OnUndeliveredElementKt.m113696c(interfaceC18505l, channelSegment.m113103v(i11), undeliveredElementException);
                                    }
                                    m113635b = InlineList.m113638e(m113635b, waiter);
                                    channelSegment.m113100s(i11);
                                    channelSegment.m113703p();
                                }
                            }
                        } else if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                            channelSegment.m113703p();
                            break;
                        }
                    } else {
                        if (j11 < m113006X()) {
                            break loop0;
                        }
                        if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                            if (interfaceC18505l != null) {
                                undeliveredElementException = OnUndeliveredElementKt.m113696c(interfaceC18505l, channelSegment.m113103v(i11), undeliveredElementException);
                            }
                            channelSegment.m113100s(i11);
                            channelSegment.m113703p();
                        }
                    }
                }
                i11--;
            }
        } while (channelSegment != null);
        if (m113635b != null) {
            if (!(m113635b instanceof ArrayList)) {
                m112940K0((Waiter) m113635b);
            } else {
                AbstractC19074t.m100206d(m113635b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) m113635b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m112940K0((Waiter) arrayList.get(size));
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* renamed from: J0 */
    private final void m112938J0(Waiter waiter) {
        m112942L0(waiter, true);
    }

    /* renamed from: K */
    private final void m112939K(long j11) {
        m112937I0(m112941L(j11));
    }

    /* renamed from: K0 */
    private final void m112940K0(Waiter waiter) {
        m112942L0(waiter, false);
    }

    /* renamed from: L */
    private final ChannelSegment m112941L(long j11) {
        ChannelSegment m112936I = m112936I();
        if (mo113013j0()) {
            long m112982l0 = m112982l0(m112936I);
            if (m112982l0 != -1) {
                m113002N(m112982l0);
            }
        }
        m112934G(m112936I, j11);
        return m112936I;
    }

    /* renamed from: L0 */
    private final void m112942L0(Waiter waiter, boolean z11) {
        Throwable m113007Y;
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation m113031a = ((SendBroadcast) waiter).m113031a();
            C24861r.a aVar = C24861r.f119264q;
            m113031a.mo112492g(C24861r.m129218b(Boolean.FALSE));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            C24861r.a aVar2 = C24861r.f119264q;
            if (z11) {
                m113007Y = m112957W();
            } else {
                m113007Y = m113007Y();
            }
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m113007Y)));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl cancellableContinuationImpl = ((ReceiveCatching) waiter).f106302p;
            C24861r.a aVar3 = C24861r.f119264q;
            cancellableContinuationImpl.mo112492g(C24861r.m129218b(ChannelResult.m113081b(ChannelResult.f106070b.m113091a(m113005V()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).m113030j();
        } else {
            if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).mo113857f(this, BufferedChannelKt.m113072z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    /* renamed from: M */
    private final void m112943M() {
        mo112909T();
    }

    /* renamed from: M0 */
    static /* synthetic */ Object m112944M0(BufferedChannel bufferedChannel, Object obj, Continuation continuation) {
        ChannelSegment channelSegment;
        Object m142578e;
        Object m142578e2;
        Object m142578e3;
        Object m142578e4;
        ChannelSegment channelSegment2 = (ChannelSegment) f106007w.get(bufferedChannel);
        while (true) {
            long andIncrement = f106003s.getAndIncrement(bufferedChannel);
            long j11 = andIncrement & 1152921504606846975L;
            boolean m112978i0 = bufferedChannel.m112978i0(andIncrement);
            int i11 = BufferedChannelKt.f106044b;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            if (channelSegment2.f107415r != j12) {
                ChannelSegment m112951R = bufferedChannel.m112951R(j12, channelSegment2);
                if (m112951R == null) {
                    if (m112978i0) {
                        Object m112995u0 = bufferedChannel.m112995u0(obj, continuation);
                        m142578e4 = AbstractC28298d.m142578e();
                        if (m112995u0 == m142578e4) {
                            return m112995u0;
                        }
                    }
                } else {
                    channelSegment = m112951R;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int m112960Y0 = bufferedChannel.m112960Y0(channelSegment, i12, obj, j11, null, m112978i0);
            if (m112960Y0 != 0) {
                if (m112960Y0 == 1) {
                    break;
                }
                if (m112960Y0 != 2) {
                    if (m112960Y0 != 3) {
                        if (m112960Y0 != 4) {
                            if (m112960Y0 == 5) {
                                channelSegment.m113592b();
                            }
                            channelSegment2 = channelSegment;
                        } else {
                            if (j11 < bufferedChannel.m113006X()) {
                                channelSegment.m113592b();
                            }
                            Object m112995u02 = bufferedChannel.m112995u0(obj, continuation);
                            m142578e3 = AbstractC28298d.m142578e();
                            if (m112995u02 == m142578e3) {
                                return m112995u02;
                            }
                        }
                    } else {
                        Object m112948P0 = bufferedChannel.m112948P0(channelSegment, i12, obj, j11, continuation);
                        m142578e2 = AbstractC28298d.m142578e();
                        if (m112948P0 == m142578e2) {
                            return m112948P0;
                        }
                    }
                } else if (m112978i0) {
                    channelSegment.m113703p();
                    Object m112995u03 = bufferedChannel.m112995u0(obj, continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (m112995u03 == m142578e) {
                        return m112995u03;
                    }
                }
            } else {
                channelSegment.m113592b();
                break;
            }
        }
        return C24848g0.f119245a;
    }

    /* renamed from: O */
    private final void m112945O() {
        if (m112981k0()) {
            return;
        }
        ChannelSegment channelSegment = (ChannelSegment) f106009y.get(this);
        while (true) {
            long andIncrement = f106005u.getAndIncrement(this);
            int i11 = BufferedChannelKt.f106044b;
            long j11 = andIncrement / i11;
            if (m113008Z() <= andIncrement) {
                if (channelSegment.f107415r < j11 && channelSegment.m113593e() != null) {
                    m112988p0(j11, channelSegment);
                }
                m112967c0(this, 0L, 1, null);
                return;
            }
            if (channelSegment.f107415r != j11) {
                ChannelSegment m112947P = m112947P(j11, channelSegment, andIncrement);
                if (m112947P == null) {
                    continue;
                } else {
                    channelSegment = m112947P;
                }
            }
            if (m112955U0(channelSegment, (int) (andIncrement % i11), andIncrement)) {
                m112967c0(this, 0L, 1, null);
                return;
            }
            m112967c0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:            r0 = pm0.C24861r.f119264q;        r9.mo112492g(pm0.C24861r.m129218b(wm0.AbstractC29094b.m145339a(true)));     */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object m112946O0(BufferedChannel bufferedChannel, Object obj, Continuation continuation) {
        Continuation m142576c;
        ChannelSegment channelSegment;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        if (bufferedChannel.f106012q == null) {
            SendBroadcast sendBroadcast = new SendBroadcast(cancellableContinuationImpl);
            ChannelSegment channelSegment2 = (ChannelSegment) f106007w.get(bufferedChannel);
            while (true) {
                long andIncrement = f106003s.getAndIncrement(bufferedChannel);
                long j11 = andIncrement & 1152921504606846975L;
                boolean m112978i0 = bufferedChannel.m112978i0(andIncrement);
                int i11 = BufferedChannelKt.f106044b;
                long j12 = j11 / i11;
                int i12 = (int) (j11 % i11);
                if (channelSegment2.f107415r != j12) {
                    ChannelSegment m112951R = bufferedChannel.m112951R(j12, channelSegment2);
                    if (m112951R == null) {
                        if (m112978i0) {
                            break;
                        }
                    } else {
                        channelSegment = m112951R;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                ChannelSegment channelSegment3 = channelSegment;
                int m112960Y0 = bufferedChannel.m112960Y0(channelSegment, i12, obj, j11, sendBroadcast, m112978i0);
                if (m112960Y0 != 0) {
                    if (m112960Y0 == 1) {
                        break;
                    }
                    if (m112960Y0 != 2) {
                        if (m112960Y0 != 3) {
                            if (m112960Y0 != 4) {
                                if (m112960Y0 == 5) {
                                    channelSegment3.m113592b();
                                }
                                channelSegment2 = channelSegment3;
                            } else if (j11 < bufferedChannel.m113006X()) {
                                channelSegment3.m113592b();
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else if (!m112978i0) {
                        bufferedChannel.m113000z0(sendBroadcast, channelSegment3, i12);
                    } else {
                        channelSegment3.m113703p();
                    }
                } else {
                    channelSegment3.m113592b();
                    break;
                }
            }
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC29094b.m145339a(false)));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112571A;
        }
        throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
    }

    /* renamed from: P */
    private final ChannelSegment m112947P(long j11, ChannelSegment channelSegment, long j12) {
        Object m113587c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106009y;
        InterfaceC18509p interfaceC18509p = (InterfaceC18509p) BufferedChannelKt.m113071y();
        loop0: while (true) {
            m113587c = ConcurrentLinkedListKt.m113587c(channelSegment, j11, interfaceC18509p);
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
        if (SegmentOrClosed.m113709e(m113587c)) {
            m112943M();
            m112988p0(j11, channelSegment);
            m112967c0(this, 0L, 1, null);
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m113707c(m113587c);
        long j13 = channelSegment2.f107415r;
        if (j13 > j11) {
            int i11 = BufferedChannelKt.f106044b;
            if (f106005u.compareAndSet(this, j12 + 1, i11 * j13)) {
                m112964b0((channelSegment2.f107415r * i11) - j12);
                return null;
            }
            m112967c0(this, 0L, 1, null);
            return null;
        }
        return channelSegment2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m112948P0(ChannelSegment channelSegment, int i11, Object obj, long j11, Continuation continuation) {
        Continuation m142576c;
        Object m129218b;
        Object m112571A;
        Object m142578e;
        Object m142578e2;
        ChannelSegment channelSegment2;
        CancellableContinuationImpl cancellableContinuationImpl;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl m112591b = CancellableContinuationKt.m112591b(m142576c);
        try {
            int m112960Y0 = m112960Y0(channelSegment, i11, obj, j11, m112591b, false);
            if (m112960Y0 != 0) {
                if (m112960Y0 != 1) {
                    if (m112960Y0 == 2) {
                        m113000z0(m112591b, channelSegment, i11);
                    } else {
                        if (m112960Y0 != 4) {
                            if (m112960Y0 == 5) {
                                channelSegment.m113592b();
                                ChannelSegment channelSegment3 = (ChannelSegment) f106007w.get(this);
                                while (true) {
                                    long andIncrement = f106003s.getAndIncrement(this);
                                    long j12 = andIncrement & 1152921504606846975L;
                                    boolean m112978i0 = m112978i0(andIncrement);
                                    int i12 = BufferedChannelKt.f106044b;
                                    long j13 = j12 / i12;
                                    int i13 = (int) (j12 % i12);
                                    if (channelSegment3.f107415r != j13) {
                                        ChannelSegment m112951R = m112951R(j13, channelSegment3);
                                        if (m112951R == null) {
                                            if (m112978i0) {
                                                break;
                                            }
                                        } else {
                                            channelSegment2 = m112951R;
                                        }
                                    } else {
                                        channelSegment2 = channelSegment3;
                                    }
                                    ChannelSegment channelSegment4 = channelSegment2;
                                    int m112960Y02 = m112960Y0(channelSegment2, i13, obj, j12, m112591b, m112978i0);
                                    if (m112960Y02 != 0) {
                                        if (m112960Y02 != 1) {
                                            if (m112960Y02 != 2) {
                                                if (m112960Y02 != 3) {
                                                    if (m112960Y02 != 4) {
                                                        if (m112960Y02 == 5) {
                                                            channelSegment4.m113592b();
                                                        }
                                                        channelSegment3 = channelSegment4;
                                                    } else if (j12 < m113006X()) {
                                                        channelSegment4.m113592b();
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                            } else if (m112978i0) {
                                                channelSegment4.m113703p();
                                            } else {
                                                if (m112591b instanceof Waiter) {
                                                    cancellableContinuationImpl = m112591b;
                                                } else {
                                                    cancellableContinuationImpl = null;
                                                }
                                                if (cancellableContinuationImpl != null) {
                                                    m113000z0(cancellableContinuationImpl, channelSegment4, i13);
                                                }
                                            }
                                        } else {
                                            C24861r.a aVar = C24861r.f119264q;
                                            m129218b = C24861r.m129218b(C24848g0.f119245a);
                                            break;
                                        }
                                    } else {
                                        channelSegment4.m113592b();
                                        C24861r.a aVar2 = C24861r.f119264q;
                                        m129218b = C24861r.m129218b(C24848g0.f119245a);
                                        break;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        } else if (j11 < m113006X()) {
                            channelSegment.m113592b();
                        }
                        m112997v0(obj, m112591b);
                    }
                    m112571A = m112591b.m112571A();
                    m142578e = AbstractC28298d.m142578e();
                    if (m112571A == m142578e) {
                        AbstractC29100h.m145355c(continuation);
                    }
                    m142578e2 = AbstractC28298d.m142578e();
                    if (m112571A != m142578e2) {
                        return m112571A;
                    }
                    return C24848g0.f119245a;
                }
                C24861r.a aVar3 = C24861r.f119264q;
                m129218b = C24861r.m129218b(C24848g0.f119245a);
            } else {
                channelSegment.m113592b();
                C24861r.a aVar4 = C24861r.f119264q;
                m129218b = C24861r.m129218b(C24848g0.f119245a);
            }
            m112591b.mo112492g(m129218b);
            m112571A = m112591b.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
            }
            m142578e2 = AbstractC28298d.m142578e();
            if (m112571A != m142578e2) {
            }
        } catch (Throwable th2) {
            m112591b.m112577O();
            throw th2;
        }
    }

    /* renamed from: Q */
    public final ChannelSegment m112949Q(long j11, ChannelSegment channelSegment) {
        Object m113587c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106008x;
        InterfaceC18509p interfaceC18509p = (InterfaceC18509p) BufferedChannelKt.m113071y();
        loop0: while (true) {
            m113587c = ConcurrentLinkedListKt.m113587c(channelSegment, j11, interfaceC18509p);
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
        if (SegmentOrClosed.m113709e(m113587c)) {
            m112943M();
            if (channelSegment.f107415r * BufferedChannelKt.f106044b >= m113008Z()) {
                return null;
            }
            channelSegment.m113592b();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m113707c(m113587c);
        if (!m112981k0() && j11 <= m112954U() / BufferedChannelKt.f106044b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f106009y;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.f107415r >= channelSegment2.f107415r || !channelSegment2.m113704q()) {
                    break;
                }
                if (ya3.m28173a(atomicReferenceFieldUpdater2, this, segment2, channelSegment2)) {
                    if (segment2.m113702m()) {
                        segment2.m113598k();
                    }
                } else if (channelSegment2.m113702m()) {
                    channelSegment2.m113598k();
                }
            }
        }
        long j12 = channelSegment2.f107415r;
        if (j12 > j11) {
            int i11 = BufferedChannelKt.f106044b;
            m112962a1(j12 * i11);
            if (channelSegment2.f107415r * i11 >= m113008Z()) {
                return null;
            }
            channelSegment2.m113592b();
            return null;
        }
        return channelSegment2;
    }

    /* renamed from: Q0 */
    private final boolean m112950Q0(long j11) {
        if (m112978i0(j11)) {
            return false;
        }
        return !m112931E(j11 & 1152921504606846975L);
    }

    /* renamed from: R */
    public final ChannelSegment m112951R(long j11, ChannelSegment channelSegment) {
        Object m113587c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106007w;
        InterfaceC18509p interfaceC18509p = (InterfaceC18509p) BufferedChannelKt.m113071y();
        loop0: while (true) {
            m113587c = ConcurrentLinkedListKt.m113587c(channelSegment, j11, interfaceC18509p);
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
        if (SegmentOrClosed.m113709e(m113587c)) {
            m112943M();
            if (channelSegment.f107415r * BufferedChannelKt.f106044b >= m113006X()) {
                return null;
            }
            channelSegment.m113592b();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m113707c(m113587c);
        long j12 = channelSegment2.f107415r;
        if (j12 > j11) {
            int i11 = BufferedChannelKt.f106044b;
            m112965b1(j12 * i11);
            if (channelSegment2.f107415r * i11 >= m113006X()) {
                return null;
            }
            channelSegment2.m113592b();
            return null;
        }
        return channelSegment2;
    }

    /* renamed from: S0 */
    private final boolean m112952S0(Object obj, Object obj2) {
        boolean m113045B;
        boolean m113045B2;
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).mo113857f(this, obj2);
        }
        InterfaceC18505l interfaceC18505l = null;
        if (obj instanceof ReceiveCatching) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            ReceiveCatching receiveCatching = (ReceiveCatching) obj;
            CancellableContinuationImpl cancellableContinuationImpl = receiveCatching.f106302p;
            ChannelResult m113081b = ChannelResult.m113081b(ChannelResult.f106070b.m113093c(obj2));
            InterfaceC18505l interfaceC18505l2 = this.f106012q;
            if (interfaceC18505l2 != null) {
                interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l2, obj2, receiveCatching.f106302p.getContext());
            }
            m113045B2 = BufferedChannelKt.m113045B(cancellableContinuationImpl, m113081b, interfaceC18505l);
            return m113045B2;
        }
        if (obj instanceof BufferedChannelIterator) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).m113029i(obj2);
        }
        if (obj instanceof CancellableContinuation) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            InterfaceC18505l interfaceC18505l3 = this.f106012q;
            if (interfaceC18505l3 != null) {
                interfaceC18505l = OnUndeliveredElementKt.m113694a(interfaceC18505l3, obj2, cancellableContinuation.getContext());
            }
            m113045B = BufferedChannelKt.m113045B(cancellableContinuation, obj2, interfaceC18505l);
            return m113045B;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* renamed from: T0 */
    private final boolean m112953T0(Object obj, ChannelSegment channelSegment, int i11) {
        if (obj instanceof CancellableContinuation) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.m113046C((CancellableContinuation) obj, C24848g0.f119245a, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult m113860y = ((SelectImplementation) obj).m113860y(this, C24848g0.f119245a);
            if (m113860y == TrySelectDetailedResult.REREGISTER) {
                channelSegment.m113100s(i11);
            }
            if (m113860y == TrySelectDetailedResult.SUCCESSFUL) {
                return true;
            }
            return false;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.m113046C(((SendBroadcast) obj).m113031a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: U */
    private final long m112954U() {
        return f106005u.get(this);
    }

    /* renamed from: U0 */
    private final boolean m112955U0(ChannelSegment channelSegment, int i11, long j11) {
        Symbol symbol;
        Symbol symbol2;
        Object m113104w = channelSegment.m113104w(i11);
        if ((m113104w instanceof Waiter) && j11 >= f106004t.get(this)) {
            symbol = BufferedChannelKt.f106049g;
            if (channelSegment.m113099r(i11, m113104w, symbol)) {
                if (!m112953T0(m113104w, channelSegment, i11)) {
                    symbol2 = BufferedChannelKt.f106052j;
                    channelSegment.m113095A(i11, symbol2);
                    channelSegment.m113105x(i11, false);
                    return false;
                }
                channelSegment.m113095A(i11, BufferedChannelKt.f106046d);
                return true;
            }
        }
        return m112956V0(channelSegment, i11, j11);
    }

    /* renamed from: V0 */
    private final boolean m112956V0(ChannelSegment channelSegment, int i11, long j11) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        while (true) {
            Object m113104w = channelSegment.m113104w(i11);
            if (!(m113104w instanceof Waiter)) {
                symbol3 = BufferedChannelKt.f106052j;
                if (m113104w == symbol3) {
                    return false;
                }
                if (m113104w == null) {
                    symbol4 = BufferedChannelKt.f106047e;
                    if (channelSegment.m113099r(i11, m113104w, symbol4)) {
                        return true;
                    }
                } else if (m113104w != BufferedChannelKt.f106046d) {
                    symbol5 = BufferedChannelKt.f106050h;
                    if (m113104w == symbol5) {
                        break;
                    }
                    symbol6 = BufferedChannelKt.f106051i;
                    if (m113104w == symbol6) {
                        break;
                    }
                    symbol7 = BufferedChannelKt.f106053k;
                    if (m113104w != symbol7 && m113104w != BufferedChannelKt.m113072z()) {
                        symbol8 = BufferedChannelKt.f106048f;
                        if (m113104w != symbol8) {
                            throw new IllegalStateException(("Unexpected cell state: " + m113104w).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (j11 >= f106004t.get(this)) {
                symbol = BufferedChannelKt.f106049g;
                if (channelSegment.m113099r(i11, m113104w, symbol)) {
                    if (!m112953T0(m113104w, channelSegment, i11)) {
                        symbol2 = BufferedChannelKt.f106052j;
                        channelSegment.m113095A(i11, symbol2);
                        channelSegment.m113105x(i11, false);
                        return false;
                    }
                    channelSegment.m113095A(i11, BufferedChannelKt.f106046d);
                    return true;
                }
            } else if (channelSegment.m113099r(i11, m113104w, new WaiterEB((Waiter) m113104w))) {
                return true;
            }
        }
    }

    /* renamed from: W */
    public final Throwable m112957W() {
        Throwable m113005V = m113005V();
        if (m113005V == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return m113005V;
    }

    /* renamed from: W0 */
    public final Object m112958W0(ChannelSegment channelSegment, int i11, long j11, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Object m113104w = channelSegment.m113104w(i11);
        if (m113104w == null) {
            if (j11 >= (f106003s.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    symbol3 = BufferedChannelKt.f106056n;
                    return symbol3;
                }
                if (channelSegment.m113099r(i11, m113104w, obj)) {
                    m112945O();
                    symbol2 = BufferedChannelKt.f106055m;
                    return symbol2;
                }
            }
        } else if (m113104w == BufferedChannelKt.f106046d) {
            symbol = BufferedChannelKt.f106051i;
            if (channelSegment.m113099r(i11, m113104w, symbol)) {
                m112945O();
                return channelSegment.m113106y(i11);
            }
        }
        return m112959X0(channelSegment, i11, j11, obj);
    }

    /* renamed from: X0 */
    private final Object m112959X0(ChannelSegment channelSegment, int i11, long j11, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        Symbol symbol9;
        Symbol symbol10;
        Symbol symbol11;
        Symbol symbol12;
        Symbol symbol13;
        Symbol symbol14;
        Symbol symbol15;
        Symbol symbol16;
        while (true) {
            Object m113104w = channelSegment.m113104w(i11);
            if (m113104w != null) {
                symbol5 = BufferedChannelKt.f106047e;
                if (m113104w != symbol5) {
                    if (m113104w == BufferedChannelKt.f106046d) {
                        symbol6 = BufferedChannelKt.f106051i;
                        if (channelSegment.m113099r(i11, m113104w, symbol6)) {
                            m112945O();
                            return channelSegment.m113106y(i11);
                        }
                    } else {
                        symbol7 = BufferedChannelKt.f106052j;
                        if (m113104w == symbol7) {
                            symbol8 = BufferedChannelKt.f106057o;
                            return symbol8;
                        }
                        symbol9 = BufferedChannelKt.f106050h;
                        if (m113104w == symbol9) {
                            symbol10 = BufferedChannelKt.f106057o;
                            return symbol10;
                        }
                        if (m113104w != BufferedChannelKt.m113072z()) {
                            symbol12 = BufferedChannelKt.f106049g;
                            if (m113104w != symbol12) {
                                symbol13 = BufferedChannelKt.f106048f;
                                if (channelSegment.m113099r(i11, m113104w, symbol13)) {
                                    boolean z11 = m113104w instanceof WaiterEB;
                                    if (z11) {
                                        m113104w = ((WaiterEB) m113104w).f106323a;
                                    }
                                    if (m112953T0(m113104w, channelSegment, i11)) {
                                        symbol16 = BufferedChannelKt.f106051i;
                                        channelSegment.m113095A(i11, symbol16);
                                        m112945O();
                                        return channelSegment.m113106y(i11);
                                    }
                                    symbol14 = BufferedChannelKt.f106052j;
                                    channelSegment.m113095A(i11, symbol14);
                                    channelSegment.m113105x(i11, false);
                                    if (z11) {
                                        m112945O();
                                    }
                                    symbol15 = BufferedChannelKt.f106057o;
                                    return symbol15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            m112945O();
                            symbol11 = BufferedChannelKt.f106057o;
                            return symbol11;
                        }
                    }
                }
            }
            if (j11 < (f106003s.get(this) & 1152921504606846975L)) {
                symbol = BufferedChannelKt.f106050h;
                if (channelSegment.m113099r(i11, m113104w, symbol)) {
                    m112945O();
                    symbol2 = BufferedChannelKt.f106057o;
                    return symbol2;
                }
            } else {
                if (obj == null) {
                    symbol3 = BufferedChannelKt.f106056n;
                    return symbol3;
                }
                if (channelSegment.m113099r(i11, m113104w, obj)) {
                    m112945O();
                    symbol4 = BufferedChannelKt.f106055m;
                    return symbol4;
                }
            }
        }
    }

    /* renamed from: Y0 */
    public final int m112960Y0(ChannelSegment channelSegment, int i11, Object obj, long j11, Object obj2, boolean z11) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        channelSegment.m113096B(i11, obj);
        if (z11) {
            return m112961Z0(channelSegment, i11, obj, j11, obj2, z11);
        }
        Object m113104w = channelSegment.m113104w(i11);
        if (m113104w == null) {
            if (m112931E(j11)) {
                if (channelSegment.m113099r(i11, null, BufferedChannelKt.f106046d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (channelSegment.m113099r(i11, null, obj2)) {
                    return 2;
                }
            }
        } else if (m113104w instanceof Waiter) {
            channelSegment.m113100s(i11);
            if (m112952S0(m113104w, obj)) {
                symbol3 = BufferedChannelKt.f106051i;
                channelSegment.m113095A(i11, symbol3);
                m113018w0();
                return 0;
            }
            symbol = BufferedChannelKt.f106053k;
            Object m113101t = channelSegment.m113101t(i11, symbol);
            symbol2 = BufferedChannelKt.f106053k;
            if (m113101t != symbol2) {
                channelSegment.m113105x(i11, true);
            }
            return 5;
        }
        return m112961Z0(channelSegment, i11, obj, j11, obj2, z11);
    }

    /* renamed from: Z0 */
    private final int m112961Z0(ChannelSegment channelSegment, int i11, Object obj, long j11, Object obj2, boolean z11) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        while (true) {
            Object m113104w = channelSegment.m113104w(i11);
            if (m113104w != null) {
                symbol2 = BufferedChannelKt.f106047e;
                if (m113104w != symbol2) {
                    symbol3 = BufferedChannelKt.f106053k;
                    if (m113104w != symbol3) {
                        symbol4 = BufferedChannelKt.f106050h;
                        if (m113104w == symbol4) {
                            channelSegment.m113100s(i11);
                            return 5;
                        }
                        if (m113104w == BufferedChannelKt.m113072z()) {
                            channelSegment.m113100s(i11);
                            m112943M();
                            return 4;
                        }
                        channelSegment.m113100s(i11);
                        if (m113104w instanceof WaiterEB) {
                            m113104w = ((WaiterEB) m113104w).f106323a;
                        }
                        if (m112952S0(m113104w, obj)) {
                            symbol7 = BufferedChannelKt.f106051i;
                            channelSegment.m113095A(i11, symbol7);
                            m113018w0();
                            return 0;
                        }
                        symbol5 = BufferedChannelKt.f106053k;
                        Object m113101t = channelSegment.m113101t(i11, symbol5);
                        symbol6 = BufferedChannelKt.f106053k;
                        if (m113101t != symbol6) {
                            channelSegment.m113105x(i11, true);
                        }
                        return 5;
                    }
                    channelSegment.m113100s(i11);
                    return 5;
                }
                if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.f106046d)) {
                    return 1;
                }
            } else if (m112931E(j11) && !z11) {
                if (channelSegment.m113099r(i11, null, BufferedChannelKt.f106046d)) {
                    return 1;
                }
            } else if (z11) {
                symbol = BufferedChannelKt.f106052j;
                if (channelSegment.m113099r(i11, null, symbol)) {
                    channelSegment.m113105x(i11, false);
                    return 4;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (channelSegment.m113099r(i11, null, obj2)) {
                    return 2;
                }
            }
        }
    }

    /* renamed from: a1 */
    private final void m112962a1(long j11) {
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f106004t;
        do {
            j12 = atomicLongFieldUpdater.get(this);
            if (j12 >= j11) {
                return;
            }
        } while (!f106004t.compareAndSet(this, j12, j11));
    }

    /* renamed from: b0 */
    private final void m112964b0(long j11) {
        if ((f106006v.addAndGet(this, j11) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((f106006v.get(this) & 4611686018427387904L) != 0);
    }

    /* renamed from: b1 */
    private final void m112965b1(long j11) {
        long j12;
        long m113069w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f106003s;
        do {
            j12 = atomicLongFieldUpdater.get(this);
            long j13 = 1152921504606846975L & j12;
            if (j13 < j11) {
                m113069w = BufferedChannelKt.m113069w(j13, (int) (j12 >> 60));
            } else {
                return;
            }
        } while (!f106003s.compareAndSet(this, j12, m113069w));
    }

    /* renamed from: c0 */
    static /* synthetic */ void m112967c0(BufferedChannel bufferedChannel, long j11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                j11 = 1;
            }
            bufferedChannel.m112964b0(j11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    /* renamed from: d0 */
    private final void m112969d0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106002A;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!ya3.m28173a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f106059q : BufferedChannelKt.f106060r));
        if (obj == null) {
            return;
        }
        ((InterfaceC18505l) obj).mo205i9(m113005V());
    }

    /* renamed from: e0 */
    private final boolean m112971e0(ChannelSegment channelSegment, int i11, long j11) {
        Object m113104w;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        do {
            m113104w = channelSegment.m113104w(i11);
            if (m113104w != null) {
                symbol2 = BufferedChannelKt.f106047e;
                if (m113104w != symbol2) {
                    if (m113104w != BufferedChannelKt.f106046d) {
                        symbol3 = BufferedChannelKt.f106052j;
                        if (m113104w != symbol3 && m113104w != BufferedChannelKt.m113072z()) {
                            symbol4 = BufferedChannelKt.f106051i;
                            if (m113104w != symbol4) {
                                symbol5 = BufferedChannelKt.f106050h;
                                if (m113104w != symbol5) {
                                    symbol6 = BufferedChannelKt.f106049g;
                                    if (m113104w != symbol6) {
                                        symbol7 = BufferedChannelKt.f106048f;
                                        if (m113104w == symbol7 || j11 != m113006X()) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            symbol = BufferedChannelKt.f106050h;
        } while (!channelSegment.m113099r(i11, m113104w, symbol));
        m112945O();
        return false;
    }

    /* renamed from: f0 */
    private final boolean m112973f0(long j11, boolean z11) {
        int i11 = (int) (j11 >> 60);
        if (i11 == 0 || i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                m112939K(j11 & 1152921504606846975L);
            } else {
                throw new IllegalStateException(("unexpected close status: " + i11).toString());
            }
        } else {
            m112941L(j11 & 1152921504606846975L);
            if (z11 && m113010a0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h0 */
    private final boolean m112976h0(long j11) {
        return m112973f0(j11, true);
    }

    /* renamed from: i0 */
    public final boolean m112978i0(long j11) {
        return m112973f0(j11, false);
    }

    /* renamed from: k0 */
    private final boolean m112981k0() {
        long m112954U = m112954U();
        if (m112954U != 0 && m112954U != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:            r9 = (kotlinx.coroutines.channels.ChannelSegment) r9.m113594g();     */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m112982l0(ChannelSegment channelSegment) {
        Symbol symbol;
        do {
            int i11 = BufferedChannelKt.f106044b;
            while (true) {
                i11--;
                if (-1 >= i11) {
                    break;
                }
                long j11 = (channelSegment.f107415r * BufferedChannelKt.f106044b) + i11;
                if (j11 < m113006X()) {
                    return -1L;
                }
                while (true) {
                    Object m113104w = channelSegment.m113104w(i11);
                    if (m113104w != null) {
                        symbol = BufferedChannelKt.f106047e;
                        if (m113104w != symbol) {
                            if (m113104w == BufferedChannelKt.f106046d) {
                                return j11;
                            }
                        }
                    }
                    if (channelSegment.m113099r(i11, m113104w, BufferedChannelKt.m113072z())) {
                        channelSegment.m113703p();
                        break;
                    }
                }
            }
        } while (channelSegment != null);
        return -1L;
    }

    /* renamed from: m0 */
    private final void m112983m0() {
        long j11;
        long m113069w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f106003s;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) == 0) {
                m113069w = BufferedChannelKt.m113069w(1152921504606846975L & j11, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, m113069w));
    }

    /* renamed from: n0 */
    private final void m112985n0() {
        long j11;
        long m113069w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f106003s;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            m113069w = BufferedChannelKt.m113069w(1152921504606846975L & j11, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, m113069w));
    }

    /* renamed from: o0 */
    private final void m112987o0() {
        long j11;
        long m113069w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f106003s;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j11 >> 60);
            if (i11 == 0) {
                m113069w = BufferedChannelKt.m113069w(j11 & 1152921504606846975L, 2);
            } else if (i11 == 1) {
                m113069w = BufferedChannelKt.m113069w(j11 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, m113069w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:            continue;     */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m112988p0(long j11, ChannelSegment channelSegment) {
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        while (channelSegment.f107415r < j11 && (channelSegment3 = (ChannelSegment) channelSegment.m113593e()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (channelSegment.mo113595h() && (channelSegment2 = (ChannelSegment) channelSegment.m113593e()) != null) {
                channelSegment = channelSegment2;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106009y;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f107415r < channelSegment.f107415r) {
                        if (!channelSegment.m113704q()) {
                            break;
                        }
                        if (ya3.m28173a(atomicReferenceFieldUpdater, this, segment, channelSegment)) {
                            if (segment.m113702m()) {
                                segment.m113598k();
                                return;
                            }
                            return;
                        } else if (channelSegment.m113702m()) {
                            channelSegment.m113598k();
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: r0 */
    public final void m112990r0(CancellableContinuation cancellableContinuation) {
        C24861r.a aVar = C24861r.f119264q;
        cancellableContinuation.mo112492g(C24861r.m129218b(ChannelResult.m113081b(ChannelResult.f106070b.m113091a(m113005V()))));
    }

    /* renamed from: s0 */
    private final void m112992s0(SelectInstance selectInstance) {
        selectInstance.mo113855d(BufferedChannelKt.m113072z());
    }

    /* renamed from: t0 */
    private final void m112994t0(Object obj, SelectInstance selectInstance) {
        InterfaceC18505l interfaceC18505l = this.f106012q;
        if (interfaceC18505l != null) {
            OnUndeliveredElementKt.m113695b(interfaceC18505l, obj, selectInstance.getContext());
        }
        selectInstance.mo113855d(BufferedChannelKt.m113072z());
    }

    /* renamed from: u0 */
    private final Object m112995u0(Object obj, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        UndeliveredElementException m113697d;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        InterfaceC18505l interfaceC18505l = this.f106012q;
        if (interfaceC18505l != null && (m113697d = OnUndeliveredElementKt.m113697d(interfaceC18505l, obj, null, 2, null)) != null) {
            AbstractC24845f.m129182a(m113697d, m113007Y());
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m113697d)));
        } else {
            Throwable m113007Y = m113007Y();
            C24861r.a aVar2 = C24861r.f119264q;
            cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m113007Y)));
        }
        Object m112571A = cancellableContinuationImpl.m112571A();
        m142578e = AbstractC28298d.m142578e();
        if (m112571A == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m112571A == m142578e2) {
            return m112571A;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: v0 */
    public final void m112997v0(Object obj, CancellableContinuation cancellableContinuation) {
        InterfaceC18505l interfaceC18505l = this.f106012q;
        if (interfaceC18505l != null) {
            OnUndeliveredElementKt.m113695b(interfaceC18505l, obj, cancellableContinuation.getContext());
        }
        Throwable m113007Y = m113007Y();
        C24861r.a aVar = C24861r.f119264q;
        cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(m113007Y)));
    }

    /* renamed from: y0 */
    public final void m112999y0(Waiter waiter, ChannelSegment channelSegment, int i11) {
        m113020x0();
        waiter.mo112580b(channelSegment, i11);
    }

    /* renamed from: z0 */
    public final void m113000z0(Waiter waiter, ChannelSegment channelSegment, int i11) {
        waiter.mo112580b(channelSegment, i11 + BufferedChannelKt.f106044b);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: B */
    public void mo112917B(InterfaceC18505l interfaceC18505l) {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f106002A;
        if (ya3.m28173a(atomicReferenceFieldUpdater2, this, null, interfaceC18505l)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            symbol = BufferedChannelKt.f106059q;
            if (obj != symbol) {
                symbol2 = BufferedChannelKt.f106060r;
                if (obj == symbol2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f106002A;
            symbol3 = BufferedChannelKt.f106059q;
            symbol4 = BufferedChannelKt.f106060r;
        } while (!ya3.m28173a(atomicReferenceFieldUpdater, this, symbol3, symbol4));
        interfaceC18505l.mo205i9(m113005V());
    }

    /* renamed from: F */
    public boolean mo112905F(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return m113001J(th2, true);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: H */
    public boolean mo112906H(Throwable th2) {
        return m113001J(th2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:            r14.mo113855d(pm0.C24848g0.f119245a);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:            return;     */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo112907H0(SelectInstance selectInstance, Object obj) {
        Waiter waiter;
        ChannelSegment channelSegment = (ChannelSegment) f106007w.get(this);
        while (true) {
            long andIncrement = f106003s.getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean m112978i0 = m112978i0(andIncrement);
            int i11 = BufferedChannelKt.f106044b;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            if (channelSegment.f107415r != j12) {
                ChannelSegment m112951R = m112951R(j12, channelSegment);
                if (m112951R == null) {
                    if (m112978i0) {
                        break;
                    }
                } else {
                    channelSegment = m112951R;
                }
            }
            int m112960Y0 = m112960Y0(channelSegment, i12, obj, j11, selectInstance, m112978i0);
            if (m112960Y0 != 0) {
                if (m112960Y0 == 1) {
                    break;
                }
                if (m112960Y0 != 2) {
                    if (m112960Y0 != 3) {
                        if (m112960Y0 != 4) {
                            if (m112960Y0 == 5) {
                                channelSegment.m113592b();
                            }
                        } else if (j11 < m113006X()) {
                            channelSegment.m113592b();
                        }
                    } else {
                        throw new IllegalStateException("unexpected".toString());
                    }
                } else if (m112978i0) {
                    channelSegment.m113703p();
                } else {
                    if (selectInstance instanceof Waiter) {
                        waiter = (Waiter) selectInstance;
                    } else {
                        waiter = null;
                    }
                    if (waiter != null) {
                        m113000z0(waiter, channelSegment, i12);
                        return;
                    }
                    return;
                }
            } else {
                channelSegment.m113592b();
                break;
            }
        }
        m112994t0(obj, selectInstance);
    }

    /* renamed from: J */
    protected boolean m113001J(Throwable th2, boolean z11) {
        Symbol symbol;
        if (z11) {
            m112983m0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106010z;
        symbol = BufferedChannelKt.f106061s;
        boolean m28173a = ya3.m28173a(atomicReferenceFieldUpdater, this, symbol, th2);
        if (z11) {
            m112985n0();
        } else {
            m112987o0();
        }
        m112943M();
        m113015q0();
        if (m28173a) {
            m112969d0();
        }
        return m28173a;
    }

    /* renamed from: N */
    public final void m113002N(long j11) {
        Symbol symbol;
        UndeliveredElementException m113697d;
        ChannelSegment channelSegment = (ChannelSegment) f106008x.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f106004t;
            long j12 = atomicLongFieldUpdater.get(this);
            if (j11 < Math.max(this.f106011p + j12, m112954U())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j12, j12 + 1)) {
                int i11 = BufferedChannelKt.f106044b;
                long j13 = j12 / i11;
                int i12 = (int) (j12 % i11);
                if (channelSegment.f107415r != j13) {
                    ChannelSegment m112949Q = m112949Q(j13, channelSegment);
                    if (m112949Q == null) {
                        continue;
                    } else {
                        channelSegment = m112949Q;
                    }
                }
                Object m112958W0 = m112958W0(channelSegment, i12, j12, null);
                symbol = BufferedChannelKt.f106057o;
                if (m112958W0 == symbol) {
                    if (j12 < m113008Z()) {
                        channelSegment.m113592b();
                    }
                } else {
                    channelSegment.m113592b();
                    InterfaceC18505l interfaceC18505l = this.f106012q;
                    if (interfaceC18505l != null && (m113697d = OnUndeliveredElementKt.m113697d(interfaceC18505l, m112958W0, null, 2, null)) != null) {
                        throw m113697d;
                    }
                }
            }
        }
    }

    /* renamed from: N0 */
    public Object mo113003N0(Object obj, Continuation continuation) {
        return m112946O0(this, obj, continuation);
    }

    /* renamed from: R0 */
    public boolean mo113004R0() {
        return m112950Q0(f106003s.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    public Object mo112908S(Object obj, Continuation continuation) {
        return m112944M0(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: T */
    public boolean mo112909T() {
        return m112978i0(f106003s.get(this));
    }

    /* renamed from: V */
    public final Throwable m113005V() {
        return (Throwable) f106010z.get(this);
    }

    /* renamed from: X */
    public final long m113006X() {
        return f106004t.get(this);
    }

    /* renamed from: Y */
    public final Throwable m113007Y() {
        Throwable m113005V = m113005V();
        if (m113005V == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return m113005V;
    }

    /* renamed from: Z */
    public final long m113008Z() {
        return f106003s.get(this) & 1152921504606846975L;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: a */
    public final void mo113009a(CancellationException cancellationException) {
        mo112905F(cancellationException);
    }

    /* renamed from: a0 */
    public final boolean m113010a0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106008x;
            ChannelSegment channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
            long m113006X = m113006X();
            if (m113008Z() <= m113006X) {
                return false;
            }
            int i11 = BufferedChannelKt.f106044b;
            long j11 = m113006X / i11;
            if (channelSegment.f107415r != j11 && (channelSegment = m112949Q(j11, channelSegment)) == null) {
                if (((ChannelSegment) atomicReferenceFieldUpdater.get(this)).f107415r < j11) {
                    return false;
                }
            } else {
                channelSegment.m113592b();
                if (m112971e0(channelSegment, (int) (m113006X % i11), m113006X)) {
                    return true;
                }
                f106004t.compareAndSet(this, m113006X, m113006X + 1);
            }
        }
    }

    /* renamed from: c1 */
    public final void m113011c1(long j11) {
        int i11;
        long j12;
        long m113068v;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z11;
        long m113068v2;
        long j13;
        long m113068v3;
        if (m112981k0()) {
            return;
        }
        do {
        } while (m112954U() <= j11);
        i11 = BufferedChannelKt.f106045c;
        for (int i12 = 0; i12 < i11; i12++) {
            long m112954U = m112954U();
            if (m112954U == (f106006v.get(this) & 4611686018427387903L) && m112954U == m112954U()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f106006v;
        do {
            j12 = atomicLongFieldUpdater2.get(this);
            m113068v = BufferedChannelKt.m113068v(j12 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, m113068v));
        while (true) {
            long m112954U2 = m112954U();
            atomicLongFieldUpdater = f106006v;
            long j14 = atomicLongFieldUpdater.get(this);
            long j15 = j14 & 4611686018427387903L;
            if ((4611686018427387904L & j14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m112954U2 == j15 && m112954U2 == m112954U()) {
                break;
            } else if (!z11) {
                m113068v2 = BufferedChannelKt.m113068v(j15, true);
                atomicLongFieldUpdater.compareAndSet(this, j14, m113068v2);
            }
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            m113068v3 = BufferedChannelKt.m113068v(j13 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, m113068v3));
    }

    /* renamed from: g0 */
    public boolean m113012g0() {
        return m112976h0(f106003s.get(this));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator iterator() {
        return new BufferedChannelIterator();
    }

    /* renamed from: j0 */
    protected boolean mo113013j0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: l */
    public SelectClause2 mo113014l() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.f106025y;
        AbstractC19074t.m100206d(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC18510q interfaceC18510q = (InterfaceC18510q) AbstractC19069o0.m100188e(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.f106026y;
        AbstractC19074t.m100206d(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, interfaceC18510q, (InterfaceC18510q) AbstractC19069o0.m100188e(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:            return kotlinx.coroutines.channels.ChannelResult.f106070b.m113093c(pm0.C24848g0.f119245a);     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo112912p(Object obj) {
        Object obj2;
        ChannelSegment channelSegment;
        Waiter waiter;
        if (!m112950Q0(f106003s.get(this))) {
            obj2 = BufferedChannelKt.f106052j;
            ChannelSegment channelSegment2 = (ChannelSegment) f106007w.get(this);
            while (true) {
                long andIncrement = f106003s.getAndIncrement(this);
                long j11 = andIncrement & 1152921504606846975L;
                boolean m112978i0 = m112978i0(andIncrement);
                int i11 = BufferedChannelKt.f106044b;
                long j12 = j11 / i11;
                int i12 = (int) (j11 % i11);
                if (channelSegment2.f107415r != j12) {
                    ChannelSegment m112951R = m112951R(j12, channelSegment2);
                    if (m112951R == null) {
                        if (m112978i0) {
                            break;
                        }
                    } else {
                        channelSegment = m112951R;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                int m112960Y0 = m112960Y0(channelSegment, i12, obj, j11, obj2, m112978i0);
                if (m112960Y0 != 0) {
                    if (m112960Y0 == 1) {
                        break;
                    }
                    if (m112960Y0 != 2) {
                        if (m112960Y0 != 3) {
                            if (m112960Y0 != 4) {
                                if (m112960Y0 == 5) {
                                    channelSegment.m113592b();
                                }
                                channelSegment2 = channelSegment;
                            } else if (j11 < m113006X()) {
                                channelSegment.m113592b();
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else if (m112978i0) {
                        channelSegment.m113703p();
                    } else {
                        if (obj2 instanceof Waiter) {
                            waiter = (Waiter) obj2;
                        } else {
                            waiter = null;
                        }
                        if (waiter != null) {
                            m113000z0(waiter, channelSegment, i12);
                        }
                        channelSegment.m113703p();
                        return ChannelResult.f106070b.m113092b();
                    }
                } else {
                    channelSegment.m113592b();
                    break;
                }
            }
            return ChannelResult.f106070b.m113091a(m113007Y());
        }
        return ChannelResult.f106070b.m113092b();
    }

    /* renamed from: q0 */
    protected void m113015q0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:            r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.m113593e();     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        List m131505m;
        char m127208g1;
        Symbol symbol;
        String str;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        ChannelSegment channelSegment;
        StringBuilder sb2 = new StringBuilder();
        int i11 = (int) (f106003s.get(this) >> 60);
        if (i11 != 2) {
            if (i11 == 3) {
                sb2.append("cancelled,");
            }
        } else {
            sb2.append("closed,");
        }
        sb2.append("capacity=" + this.f106011p + ',');
        sb2.append("data=[");
        m131505m = AbstractC25368s.m131505m(f106008x.get(this), f106007w.get(this), f106009y.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m131505m) {
            ChannelSegment channelSegment2 = (ChannelSegment) obj;
            channelSegment = BufferedChannelKt.f106043a;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j11 = ((ChannelSegment) next).f107415r;
                do {
                    Object next2 = it.next();
                    long j12 = ((ChannelSegment) next2).f107415r;
                    if (j11 > j12) {
                        next = next2;
                        j11 = j12;
                    }
                } while (it.hasNext());
            }
            ChannelSegment channelSegment3 = (ChannelSegment) next;
            long m113006X = m113006X();
            long m113008Z = m113008Z();
            loop2: do {
                int i12 = BufferedChannelKt.f106044b;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        break;
                    }
                    long j13 = (channelSegment3.f107415r * BufferedChannelKt.f106044b) + i13;
                    if (j13 >= m113008Z && j13 >= m113006X) {
                        break loop2;
                    }
                    Object m113104w = channelSegment3.m113104w(i13);
                    Object m113103v = channelSegment3.m113103v(i13);
                    if (m113104w instanceof CancellableContinuation) {
                        if (j13 < m113006X && j13 >= m113008Z) {
                            str = "receive";
                        } else if (j13 < m113008Z && j13 >= m113006X) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (m113104w instanceof SelectInstance) {
                        if (j13 < m113006X && j13 >= m113008Z) {
                            str = "onReceive";
                        } else if (j13 < m113008Z && j13 >= m113006X) {
                            str = "onSend";
                        } else {
                            str = "select";
                        }
                    } else if (m113104w instanceof ReceiveCatching) {
                        str = "receiveCatching";
                    } else if (m113104w instanceof SendBroadcast) {
                        str = "sendBroadcast";
                    } else if (!(m113104w instanceof WaiterEB)) {
                        symbol = BufferedChannelKt.f106048f;
                        if (!AbstractC19074t.m100204b(m113104w, symbol)) {
                            symbol2 = BufferedChannelKt.f106049g;
                            if (!AbstractC19074t.m100204b(m113104w, symbol2)) {
                                if (m113104w != null) {
                                    symbol3 = BufferedChannelKt.f106047e;
                                    if (!AbstractC19074t.m100204b(m113104w, symbol3)) {
                                        symbol4 = BufferedChannelKt.f106051i;
                                        if (!AbstractC19074t.m100204b(m113104w, symbol4)) {
                                            symbol5 = BufferedChannelKt.f106050h;
                                            if (!AbstractC19074t.m100204b(m113104w, symbol5)) {
                                                symbol6 = BufferedChannelKt.f106053k;
                                                if (!AbstractC19074t.m100204b(m113104w, symbol6)) {
                                                    symbol7 = BufferedChannelKt.f106052j;
                                                    if (!AbstractC19074t.m100204b(m113104w, symbol7) && !AbstractC19074t.m100204b(m113104w, BufferedChannelKt.m113072z())) {
                                                        str = m113104w.toString();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i13++;
                            }
                        }
                        str = "resuming_sender";
                    } else {
                        str = "EB(" + m113104w + ')';
                    }
                    if (m113103v != null) {
                        sb2.append('(' + str + ',' + m113103v + "),");
                    } else {
                        sb2.append(str + ',');
                    }
                    i13++;
                }
            } while (channelSegment3 != null);
            m127208g1 = AbstractC24344y.m127208g1(sb2);
            if (m127208g1 == ',') {
                AbstractC19074t.m100207e(sb2.deleteCharAt(sb2.length() - 1), "this.deleteCharAt(index)");
            }
            sb2.append("]");
            return sb2.toString();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: u */
    public SelectClause1 mo113016u() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.f106019y;
        AbstractC19074t.m100206d(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC18510q interfaceC18510q = (InterfaceC18510q) AbstractC19069o0.m100188e(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.f106020y;
        AbstractC19074t.m100206d(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, interfaceC18510q, (InterfaceC18510q) AbstractC19069o0.m100188e(bufferedChannel$onReceive$2, 3), this.f106013r);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: w */
    public SelectClause1 mo113017w() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f106021y;
        AbstractC19074t.m100206d(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC18510q interfaceC18510q = (InterfaceC18510q) AbstractC19069o0.m100188e(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f106022y;
        AbstractC19074t.m100206d(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, interfaceC18510q, (InterfaceC18510q) AbstractC19069o0.m100188e(bufferedChannel$onReceiveCatching$2, 3), this.f106013r);
    }

    /* renamed from: w0 */
    protected void m113018w0() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: x */
    public Object mo113019x() {
        Object obj;
        ChannelSegment channelSegment;
        Symbol symbol;
        Waiter waiter;
        Symbol symbol2;
        Symbol symbol3;
        long j11 = f106004t.get(this);
        long j12 = f106003s.get(this);
        if (m112976h0(j12)) {
            return ChannelResult.f106070b.m113091a(m113005V());
        }
        if (j11 < (j12 & 1152921504606846975L)) {
            obj = BufferedChannelKt.f106053k;
            ChannelSegment channelSegment2 = (ChannelSegment) f106008x.get(this);
            while (!m113012g0()) {
                long andIncrement = f106004t.getAndIncrement(this);
                int i11 = BufferedChannelKt.f106044b;
                long j13 = andIncrement / i11;
                int i12 = (int) (andIncrement % i11);
                if (channelSegment2.f107415r != j13) {
                    ChannelSegment m112949Q = m112949Q(j13, channelSegment2);
                    if (m112949Q == null) {
                        continue;
                    } else {
                        channelSegment = m112949Q;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object m112958W0 = m112958W0(channelSegment, i12, andIncrement, obj);
                symbol = BufferedChannelKt.f106055m;
                if (m112958W0 != symbol) {
                    symbol2 = BufferedChannelKt.f106057o;
                    if (m112958W0 != symbol2) {
                        symbol3 = BufferedChannelKt.f106056n;
                        if (m112958W0 != symbol3) {
                            channelSegment.m113592b();
                            return ChannelResult.f106070b.m113093c(m112958W0);
                        }
                        throw new IllegalStateException("unexpected".toString());
                    }
                    if (andIncrement < m113008Z()) {
                        channelSegment.m113592b();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    if (obj instanceof Waiter) {
                        waiter = (Waiter) obj;
                    } else {
                        waiter = null;
                    }
                    if (waiter != null) {
                        m112999y0(waiter, channelSegment, i12);
                    }
                    m113011c1(andIncrement);
                    channelSegment.m113703p();
                    return ChannelResult.f106070b.m113092b();
                }
            }
            return ChannelResult.f106070b.m113091a(m113005V());
        }
        return ChannelResult.f106070b.m113092b();
    }

    /* renamed from: x0 */
    protected void m113020x0() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: z */
    public Object mo113021z(Continuation continuation) {
        return m112932E0(this, continuation);
    }

    public /* synthetic */ BufferedChannel(int i11, InterfaceC18505l interfaceC18505l, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? null : interfaceC18505l);
    }
}
