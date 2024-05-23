package kotlinx.coroutines.flow;

import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: u */
    private static final AtomicReferenceFieldUpdater f107160u = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: t */
    private int f107161t;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* renamed from: r */
    private final boolean m113500r(Object obj, Object obj2) {
        int i11;
        AbstractSharedFlowSlot[] m113520o;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107160u;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC19074t.m100204b(obj3, obj)) {
                return false;
            }
            if (AbstractC19074t.m100204b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i12 = this.f107161t;
            if ((i12 & 1) == 0) {
                int i13 = i12 + 1;
                this.f107161t = i13;
                AbstractSharedFlowSlot[] m113520o2 = m113520o();
                C24848g0 c24848g0 = C24848g0.f119245a;
                while (true) {
                    StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) m113520o2;
                    if (stateFlowSlotArr != null) {
                        for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                            if (stateFlowSlot != null) {
                                stateFlowSlot.m113511g();
                            }
                        }
                    }
                    synchronized (this) {
                        i11 = this.f107161t;
                        if (i11 == i13) {
                            this.f107161t = i13 + 1;
                            return true;
                        }
                        m113520o = m113520o();
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    }
                    m113520o2 = m113520o;
                    i13 = i11;
                }
            } else {
                this.f107161t = i12 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bc, code lost:            if (fn0.AbstractC19074t.m100204b(r11, r12) == false) goto L103;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x00ab, B:16:0x00b3, B:18:0x00b8, B:20:0x00d9, B:22:0x00df, B:26:0x00be, B:29:0x00c5, B:38:0x0060, B:40:0x0073, B:41:0x009c), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00dd -> B:14:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ef -> B:14:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        Object m142578e;
        int i11;
        StateFlowImpl<T> stateFlowImpl;
        StateFlowSlot stateFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object obj;
        StateFlowSlot stateFlowSlot2;
        boolean m113512h;
        Object obj2;
        Object obj3;
        try {
            if (continuation instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) continuation;
                int i12 = stateFlowImpl$collect$1.f107169z;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.f107169z = i12 - Integer.MIN_VALUE;
                    Object obj4 = stateFlowImpl$collect$1.f107167x;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = stateFlowImpl$collect$1.f107169z;
                    ?? r62 = 1;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    obj = stateFlowImpl$collect$1.f107166w;
                                    job = (Job) stateFlowImpl$collect$1.f107165v;
                                    StateFlowSlot stateFlowSlot3 = (StateFlowSlot) stateFlowImpl$collect$1.f107164u;
                                    flowCollector2 = (FlowCollector) stateFlowImpl$collect$1.f107163t;
                                    stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$1.f107162s;
                                    AbstractC24862s.m129228b(obj4);
                                    r62 = stateFlowSlot3;
                                    obj2 = f107160u.get(stateFlowImpl);
                                    if (job != null) {
                                        JobKt.m112757j(job);
                                    }
                                    if (obj != null) {
                                        stateFlowSlot2 = r62;
                                    }
                                    if (obj2 == NullSurrogateKt.f107313a) {
                                        obj3 = null;
                                    } else {
                                        obj3 = obj2;
                                    }
                                    stateFlowImpl$collect$1.f107162s = stateFlowImpl;
                                    stateFlowImpl$collect$1.f107163t = flowCollector2;
                                    stateFlowImpl$collect$1.f107164u = r62;
                                    stateFlowImpl$collect$1.f107165v = job;
                                    stateFlowImpl$collect$1.f107166w = obj2;
                                    stateFlowImpl$collect$1.f107169z = 2;
                                    if (flowCollector2.mo12109b(obj3, stateFlowImpl$collect$1) == m142578e) {
                                        return m142578e;
                                    }
                                    obj = obj2;
                                    stateFlowSlot2 = r62;
                                    m113512h = stateFlowSlot2.m113512h();
                                    r62 = stateFlowSlot2;
                                    if (!m113512h) {
                                        stateFlowImpl$collect$1.f107162s = stateFlowImpl;
                                        stateFlowImpl$collect$1.f107163t = flowCollector2;
                                        stateFlowImpl$collect$1.f107164u = stateFlowSlot2;
                                        stateFlowImpl$collect$1.f107165v = job;
                                        stateFlowImpl$collect$1.f107166w = obj;
                                        stateFlowImpl$collect$1.f107169z = 3;
                                        Object m113509e = stateFlowSlot2.m113509e(stateFlowImpl$collect$1);
                                        r62 = stateFlowSlot2;
                                        if (m113509e == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                    obj2 = f107160u.get(stateFlowImpl);
                                    if (job != null) {
                                    }
                                    if (obj != null) {
                                    }
                                    if (obj2 == NullSurrogateKt.f107313a) {
                                    }
                                    stateFlowImpl$collect$1.f107162s = stateFlowImpl;
                                    stateFlowImpl$collect$1.f107163t = flowCollector2;
                                    stateFlowImpl$collect$1.f107164u = r62;
                                    stateFlowImpl$collect$1.f107165v = job;
                                    stateFlowImpl$collect$1.f107166w = obj2;
                                    stateFlowImpl$collect$1.f107169z = 2;
                                    if (flowCollector2.mo12109b(obj3, stateFlowImpl$collect$1) == m142578e) {
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj = stateFlowImpl$collect$1.f107166w;
                                job = (Job) stateFlowImpl$collect$1.f107165v;
                                StateFlowSlot stateFlowSlot4 = (StateFlowSlot) stateFlowImpl$collect$1.f107164u;
                                flowCollector2 = (FlowCollector) stateFlowImpl$collect$1.f107163t;
                                stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$1.f107162s;
                                AbstractC24862s.m129228b(obj4);
                                stateFlowSlot2 = stateFlowSlot4;
                                m113512h = stateFlowSlot2.m113512h();
                                r62 = stateFlowSlot2;
                                if (!m113512h) {
                                }
                                obj2 = f107160u.get(stateFlowImpl);
                                if (job != null) {
                                }
                                if (obj != null) {
                                }
                                if (obj2 == NullSurrogateKt.f107313a) {
                                }
                                stateFlowImpl$collect$1.f107162s = stateFlowImpl;
                                stateFlowImpl$collect$1.f107163t = flowCollector2;
                                stateFlowImpl$collect$1.f107164u = r62;
                                stateFlowImpl$collect$1.f107165v = job;
                                stateFlowImpl$collect$1.f107166w = obj2;
                                stateFlowImpl$collect$1.f107169z = 2;
                                if (flowCollector2.mo12109b(obj3, stateFlowImpl$collect$1) == m142578e) {
                                }
                            }
                        } else {
                            StateFlowSlot stateFlowSlot5 = (StateFlowSlot) stateFlowImpl$collect$1.f107164u;
                            flowCollector = (FlowCollector) stateFlowImpl$collect$1.f107163t;
                            stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$1.f107162s;
                            AbstractC24862s.m129228b(obj4);
                            stateFlowSlot = stateFlowSlot5;
                        }
                    } else {
                        AbstractC24862s.m129228b(obj4);
                        StateFlowSlot stateFlowSlot6 = (StateFlowSlot) m113516g();
                        try {
                            if (flowCollector instanceof SubscribedFlowCollector) {
                                stateFlowImpl$collect$1.f107162s = this;
                                stateFlowImpl$collect$1.f107163t = flowCollector;
                                stateFlowImpl$collect$1.f107164u = stateFlowSlot6;
                                stateFlowImpl$collect$1.f107169z = 1;
                                if (((SubscribedFlowCollector) flowCollector).m113513a(stateFlowImpl$collect$1) == m142578e) {
                                    return m142578e;
                                }
                            }
                            stateFlowImpl = this;
                            stateFlowSlot = stateFlowSlot6;
                        } catch (Throwable th2) {
                            th = th2;
                            stateFlowImpl = this;
                            r62 = stateFlowSlot6;
                            stateFlowImpl.m113518m(r62);
                            throw th;
                        }
                    }
                    flowCollector2 = flowCollector;
                    job = (Job) stateFlowImpl$collect$1.getContext().mo112624d(Job.f105897m);
                    obj = null;
                    r62 = stateFlowSlot;
                    obj2 = f107160u.get(stateFlowImpl);
                    if (job != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == NullSurrogateKt.f107313a) {
                    }
                    stateFlowImpl$collect$1.f107162s = stateFlowImpl;
                    stateFlowImpl$collect$1.f107163t = flowCollector2;
                    stateFlowImpl$collect$1.f107164u = r62;
                    stateFlowImpl$collect$1.f107165v = job;
                    stateFlowImpl$collect$1.f107166w = obj2;
                    stateFlowImpl$collect$1.f107169z = 2;
                    if (flowCollector2.mo12109b(obj3, stateFlowImpl$collect$1) == m142578e) {
                    }
                }
            }
            if (i11 == 0) {
            }
            flowCollector2 = flowCollector;
            job = (Job) stateFlowImpl$collect$1.getContext().mo112624d(Job.f105897m);
            obj = null;
            r62 = stateFlowSlot;
            obj2 = f107160u.get(stateFlowImpl);
            if (job != null) {
            }
            if (obj != null) {
            }
            if (obj2 == NullSurrogateKt.f107313a) {
            }
            stateFlowImpl$collect$1.f107162s = stateFlowImpl;
            stateFlowImpl$collect$1.f107163t = flowCollector2;
            stateFlowImpl$collect$1.f107164u = r62;
            stateFlowImpl$collect$1.f107165v = job;
            stateFlowImpl$collect$1.f107166w = obj2;
            stateFlowImpl$collect$1.f107169z = 2;
            if (flowCollector2.mo12109b(obj3, stateFlowImpl$collect$1) == m142578e) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, continuation);
        Object obj42 = stateFlowImpl$collect$1.f107167x;
        m142578e = AbstractC28298d.m142578e();
        i11 = stateFlowImpl$collect$1.f107169z;
        ?? r622 = 1;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        setValue(obj);
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /* renamed from: c */
    public Flow mo113437c(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return StateFlowKt.m113506d(this, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: d */
    public boolean mo113433d(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        Symbol symbol = NullSurrogateKt.f107313a;
        Object obj = f107160u.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    /* renamed from: i */
    public boolean mo113436i(Object obj, Object obj2) {
        if (obj == null) {
            obj = NullSurrogateKt.f107313a;
        }
        if (obj2 == null) {
            obj2 = NullSurrogateKt.f107313a;
        }
        return m113500r(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: l */
    public void mo113435l() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: p */
    public StateFlowSlot mo113475j() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: q */
    public StateFlowSlot[] mo113476k(int i11) {
        return new StateFlowSlot[i11];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f107313a;
        }
        m113500r(null, obj);
    }
}
