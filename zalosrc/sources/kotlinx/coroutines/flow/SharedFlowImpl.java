package kotlinx.coroutines.flow;

import fn0.AbstractC19074t;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: A */
    private int f107109A;

    /* renamed from: t */
    private final int f107110t;

    /* renamed from: u */
    private final int f107111u;

    /* renamed from: v */
    private final BufferOverflow f107112v;

    /* renamed from: w */
    private Object[] f107113w;

    /* renamed from: x */
    private long f107114x;

    /* renamed from: y */
    private long f107115y;

    /* renamed from: z */
    private int f107116z;

    /* loaded from: classes7.dex */
    public static final class Emitter implements DisposableHandle {

        /* renamed from: p */
        public final SharedFlowImpl f107117p;

        /* renamed from: q */
        public long f107118q;

        /* renamed from: r */
        public final Object f107119r;

        /* renamed from: s */
        public final Continuation f107120s;

        public Emitter(SharedFlowImpl sharedFlowImpl, long j11, Object obj, Continuation continuation) {
            this.f107117p = sharedFlowImpl;
            this.f107118q = j11;
            this.f107119r = obj;
            this.f107120s = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.f107117p.m113438A(this);
        }
    }

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107121a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107121a = iArr;
        }
    }

    public SharedFlowImpl(int i11, int i12, BufferOverflow bufferOverflow) {
        this.f107110t = i11;
        this.f107111u = i12;
        this.f107112v = bufferOverflow;
    }

    /* renamed from: A */
    public final void m113438A(Emitter emitter) {
        Object m113482f;
        synchronized (this) {
            if (emitter.f107118q < m113448M()) {
                return;
            }
            Object[] objArr = this.f107113w;
            AbstractC19074t.m100205c(objArr);
            m113482f = SharedFlowKt.m113482f(objArr, emitter.f107118q);
            if (m113482f == emitter) {
                SharedFlowKt.m113483g(objArr, emitter.f107118q, SharedFlowKt.f107129a);
                m113439B();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: B */
    private final void m113439B() {
        Object m113482f;
        if (this.f107111u == 0 && this.f107109A <= 1) {
            return;
        }
        Object[] objArr = this.f107113w;
        AbstractC19074t.m100205c(objArr);
        while (this.f107109A > 0) {
            m113482f = SharedFlowKt.m113482f(objArr, (m113448M() + m113452R()) - 1);
            if (m113482f == SharedFlowKt.f107129a) {
                this.f107109A--;
                SharedFlowKt.m113483g(objArr, m113448M() + m113452R(), null);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:            r10 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:            r5 = r8;        r8 = r10;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m113440C(SharedFlowImpl sharedFlowImpl, FlowCollector flowCollector, Continuation continuation) {
        SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        Object m142578e;
        int i11;
        SharedFlowImpl sharedFlowImpl2;
        Throwable th2;
        SharedFlowSlot sharedFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object m113457W;
        Job job2;
        FlowCollector flowCollector3;
        if (continuation instanceof SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (SharedFlowImpl$collect$1) continuation;
            int i12 = sharedFlowImpl$collect$1.f107128y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.f107128y = i12 - Integer.MIN_VALUE;
                Object obj = sharedFlowImpl$collect$1.f107126w;
                m142578e = AbstractC28298d.m142578e();
                i11 = sharedFlowImpl$collect$1.f107128y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                job2 = (Job) sharedFlowImpl$collect$1.f107125v;
                                sharedFlowSlot = (SharedFlowSlot) sharedFlowImpl$collect$1.f107124u;
                                flowCollector3 = (FlowCollector) sharedFlowImpl$collect$1.f107123t;
                                sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.f107122s;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            job2 = (Job) sharedFlowImpl$collect$1.f107125v;
                            sharedFlowSlot = (SharedFlowSlot) sharedFlowImpl$collect$1.f107124u;
                            flowCollector3 = (FlowCollector) sharedFlowImpl$collect$1.f107123t;
                            sharedFlowImpl2 = (SharedFlowImpl) sharedFlowImpl$collect$1.f107122s;
                        }
                        try {
                            AbstractC24862s.m129228b(obj);
                            flowCollector2 = flowCollector3;
                            job = job2;
                            sharedFlowImpl = sharedFlowImpl2;
                            while (true) {
                                m113457W = sharedFlowImpl.m113457W(sharedFlowSlot);
                                if (m113457W == SharedFlowKt.f107129a) {
                                    sharedFlowImpl$collect$1.f107122s = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.f107123t = flowCollector2;
                                    sharedFlowImpl$collect$1.f107124u = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.f107125v = job;
                                    sharedFlowImpl$collect$1.f107128y = 2;
                                    if (sharedFlowImpl.m113469z(sharedFlowSlot, sharedFlowImpl$collect$1) == m142578e) {
                                        return m142578e;
                                    }
                                } else {
                                    if (job != null) {
                                        JobKt.m112757j(job);
                                    }
                                    sharedFlowImpl$collect$1.f107122s = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.f107123t = flowCollector2;
                                    sharedFlowImpl$collect$1.f107124u = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.f107125v = job;
                                    sharedFlowImpl$collect$1.f107128y = 3;
                                    if (flowCollector2.mo12109b(m113457W, sharedFlowImpl$collect$1) == m142578e) {
                                        return m142578e;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    } else {
                        sharedFlowSlot = (SharedFlowSlot) sharedFlowImpl$collect$1.f107124u;
                        FlowCollector flowCollector4 = (FlowCollector) sharedFlowImpl$collect$1.f107123t;
                        SharedFlowImpl sharedFlowImpl3 = (SharedFlowImpl) sharedFlowImpl$collect$1.f107122s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            flowCollector2 = flowCollector4;
                            sharedFlowImpl = sharedFlowImpl3;
                        } catch (Throwable th4) {
                            th2 = th4;
                            sharedFlowImpl2 = sharedFlowImpl3;
                        }
                    }
                    sharedFlowImpl2.m113518m(sharedFlowSlot);
                    throw th2;
                }
                AbstractC24862s.m129228b(obj);
                SharedFlowSlot sharedFlowSlot2 = (SharedFlowSlot) sharedFlowImpl.m113516g();
                try {
                    if (flowCollector instanceof SubscribedFlowCollector) {
                        sharedFlowImpl$collect$1.f107122s = sharedFlowImpl;
                        sharedFlowImpl$collect$1.f107123t = flowCollector;
                        sharedFlowImpl$collect$1.f107124u = sharedFlowSlot2;
                        sharedFlowImpl$collect$1.f107128y = 1;
                        if (((SubscribedFlowCollector) flowCollector).m113513a(sharedFlowImpl$collect$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    flowCollector2 = flowCollector;
                    sharedFlowSlot = sharedFlowSlot2;
                } catch (Throwable th5) {
                    sharedFlowImpl2 = sharedFlowImpl;
                    th2 = th5;
                    sharedFlowSlot = sharedFlowSlot2;
                }
                job = (Job) sharedFlowImpl$collect$1.getContext().mo112624d(Job.f105897m);
                while (true) {
                    m113457W = sharedFlowImpl.m113457W(sharedFlowSlot);
                    if (m113457W == SharedFlowKt.f107129a) {
                    }
                }
            }
        }
        sharedFlowImpl$collect$1 = new SharedFlowImpl$collect$1(sharedFlowImpl, continuation);
        Object obj2 = sharedFlowImpl$collect$1.f107126w;
        m142578e = AbstractC28298d.m142578e();
        i11 = sharedFlowImpl$collect$1.f107128y;
        if (i11 == 0) {
        }
        job = (Job) sharedFlowImpl$collect$1.getContext().mo112624d(Job.f105897m);
        while (true) {
            m113457W = sharedFlowImpl.m113457W(sharedFlowSlot);
            if (m113457W == SharedFlowKt.f107129a) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:            r0 = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) r9).f107187p;     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m113441D(long j11) {
        int i11;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        i11 = ((AbstractSharedFlow) this).f107188q;
        if (i11 != 0 && abstractSharedFlowSlotArr != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j12 = sharedFlowSlot.f107130a;
                    if (j12 >= 0 && j12 < j11) {
                        sharedFlowSlot.f107130a = j11;
                    }
                }
            }
        }
        this.f107115y = j11;
    }

    /* renamed from: G */
    private final void m113442G() {
        Object[] objArr = this.f107113w;
        AbstractC19074t.m100205c(objArr);
        SharedFlowKt.m113483g(objArr, m113448M(), null);
        this.f107116z--;
        long m113448M = m113448M() + 1;
        if (this.f107114x < m113448M) {
            this.f107114x = m113448M;
        }
        if (this.f107115y < m113448M) {
            m113441D(m113448M);
        }
    }

    /* renamed from: H */
    static /* synthetic */ Object m113443H(SharedFlowImpl sharedFlowImpl, Object obj, Continuation continuation) {
        Object m142578e;
        if (sharedFlowImpl.mo113433d(obj)) {
            return C24848g0.f119245a;
        }
        Object m113444I = sharedFlowImpl.m113444I(obj, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113444I == m142578e) {
            return m113444I;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: I */
    private final Object m113444I(Object obj, Continuation continuation) {
        Continuation m142576c;
        Continuation[] continuationArr;
        Emitter emitter;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        Continuation[] continuationArr2 = AbstractSharedFlowKt.f107191a;
        synchronized (this) {
            try {
                if (m113454T(obj)) {
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuationImpl.mo112492g(C24861r.m129218b(C24848g0.f119245a));
                    continuationArr = m113446K(continuationArr2);
                    emitter = null;
                } else {
                    Emitter emitter2 = new Emitter(this, m113452R() + m113448M(), obj, cancellableContinuationImpl);
                    m113445J(emitter2);
                    this.f107109A++;
                    if (this.f107111u == 0) {
                        continuationArr2 = m113446K(continuationArr2);
                    }
                    continuationArr = continuationArr2;
                    emitter = emitter2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.m112590a(cancellableContinuationImpl, emitter);
        }
        for (Continuation continuation2 : continuationArr) {
            if (continuation2 != null) {
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            }
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

    /* renamed from: J */
    public final void m113445J(Object obj) {
        int m113452R = m113452R();
        Object[] objArr = this.f107113w;
        if (objArr == null) {
            objArr = m113453S(null, 0, 2);
        } else if (m113452R >= objArr.length) {
            objArr = m113453S(objArr, m113452R, objArr.length * 2);
        }
        SharedFlowKt.m113483g(objArr, m113448M() + m113452R, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:            r1 = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) r11).f107187p;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Continuation[] m113446K(Continuation[] continuationArr) {
        int i11;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation continuation;
        int length = continuationArr.length;
        i11 = ((AbstractSharedFlow) this).f107188q;
        if (i11 != 0 && abstractSharedFlowSlotArr != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i12 = 0;
            continuationArr = continuationArr;
            while (i12 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i12];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).f107131b) != null && m113456V(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    sharedFlowSlot.f107131b = null;
                    length++;
                }
                i12++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    /* renamed from: L */
    private final long m113447L() {
        return m113448M() + this.f107116z;
    }

    /* renamed from: M */
    public final long m113448M() {
        return Math.min(this.f107115y, this.f107114x);
    }

    /* renamed from: O */
    private final Object m113449O(long j11) {
        Object m113482f;
        Object[] objArr = this.f107113w;
        AbstractC19074t.m100205c(objArr);
        m113482f = SharedFlowKt.m113482f(objArr, j11);
        if (m113482f instanceof Emitter) {
            return ((Emitter) m113482f).f107119r;
        }
        return m113482f;
    }

    /* renamed from: P */
    private final long m113450P() {
        return m113448M() + this.f107116z + this.f107109A;
    }

    /* renamed from: Q */
    private final int m113451Q() {
        return (int) ((m113448M() + this.f107116z) - this.f107114x);
    }

    /* renamed from: R */
    public final int m113452R() {
        return this.f107116z + this.f107109A;
    }

    /* renamed from: S */
    private final Object[] m113453S(Object[] objArr, int i11, int i12) {
        Object m113482f;
        if (i12 > 0) {
            Object[] objArr2 = new Object[i12];
            this.f107113w = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m113448M = m113448M();
            for (int i13 = 0; i13 < i11; i13++) {
                long j11 = i13 + m113448M;
                m113482f = SharedFlowKt.m113482f(objArr, j11);
                SharedFlowKt.m113483g(objArr2, j11, m113482f);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: T */
    public final boolean m113454T(Object obj) {
        if (m113519n() == 0) {
            return m113455U(obj);
        }
        if (this.f107116z >= this.f107111u && this.f107115y <= this.f107114x) {
            int i11 = WhenMappings.f107121a[this.f107112v.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m113445J(obj);
        int i12 = this.f107116z + 1;
        this.f107116z = i12;
        if (i12 > this.f107111u) {
            m113442G();
        }
        if (m113451Q() > this.f107110t) {
            m113458X(this.f107114x + 1, this.f107115y, m113447L(), m113450P());
        }
        return true;
    }

    /* renamed from: U */
    private final boolean m113455U(Object obj) {
        if (this.f107110t == 0) {
            return true;
        }
        m113445J(obj);
        int i11 = this.f107116z + 1;
        this.f107116z = i11;
        if (i11 > this.f107110t) {
            m113442G();
        }
        this.f107115y = m113448M() + this.f107116z;
        return true;
    }

    /* renamed from: V */
    public final long m113456V(SharedFlowSlot sharedFlowSlot) {
        long j11 = sharedFlowSlot.f107130a;
        if (j11 < m113447L()) {
            return j11;
        }
        if (this.f107111u > 0 || j11 > m113448M() || this.f107109A == 0) {
            return -1L;
        }
        return j11;
    }

    /* renamed from: W */
    private final Object m113457W(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation[] continuationArr = AbstractSharedFlowKt.f107191a;
        synchronized (this) {
            try {
                long m113456V = m113456V(sharedFlowSlot);
                if (m113456V < 0) {
                    obj = SharedFlowKt.f107129a;
                } else {
                    long j11 = sharedFlowSlot.f107130a;
                    Object m113449O = m113449O(m113456V);
                    sharedFlowSlot.f107130a = m113456V + 1;
                    continuationArr = m113473Y(j11);
                    obj = m113449O;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            }
        }
        return obj;
    }

    /* renamed from: X */
    private final void m113458X(long j11, long j12, long j13, long j14) {
        long min = Math.min(j12, j11);
        for (long m113448M = m113448M(); m113448M < min; m113448M++) {
            Object[] objArr = this.f107113w;
            AbstractC19074t.m100205c(objArr);
            SharedFlowKt.m113483g(objArr, m113448M, null);
        }
        this.f107114x = j11;
        this.f107115y = j12;
        this.f107116z = (int) (j13 - min);
        this.f107109A = (int) (j14 - j13);
    }

    /* renamed from: z */
    private final Object m113469z(SharedFlowSlot sharedFlowSlot, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        synchronized (this) {
            try {
                if (m113456V(sharedFlowSlot) < 0) {
                    sharedFlowSlot.f107131b = cancellableContinuationImpl;
                } else {
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuationImpl.mo112492g(C24861r.m129218b(C24848g0.f119245a));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
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

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: E */
    public SharedFlowSlot mo113475j() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: F */
    public SharedFlowSlot[] mo113476k(int i11) {
        return new SharedFlowSlot[i11];
    }

    /* renamed from: N */
    public final Object m113472N() {
        Object m113482f;
        Object[] objArr = this.f107113w;
        AbstractC19074t.m100205c(objArr);
        m113482f = SharedFlowKt.m113482f(objArr, (this.f107114x + m113451Q()) - 1);
        return m113482f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:            r4 = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) r21).f107187p;     */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Continuation[] m113473Y(long j11) {
        int i11;
        int i12;
        long j12;
        long j13;
        long j14;
        boolean z11;
        Object m113482f;
        Object m113482f2;
        long j15;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (j11 > this.f107115y) {
            return AbstractSharedFlowKt.f107191a;
        }
        long m113448M = m113448M();
        long j16 = this.f107116z + m113448M;
        if (this.f107111u == 0 && this.f107109A > 0) {
            j16++;
        }
        i11 = ((AbstractSharedFlow) this).f107188q;
        if (i11 != 0 && abstractSharedFlowSlotArr != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j17 = ((SharedFlowSlot) abstractSharedFlowSlot).f107130a;
                    if (j17 >= 0 && j17 < j16) {
                        j16 = j17;
                    }
                }
            }
        }
        if (j16 <= this.f107115y) {
            return AbstractSharedFlowKt.f107191a;
        }
        long m113447L = m113447L();
        if (m113519n() > 0) {
            i12 = Math.min(this.f107109A, this.f107111u - ((int) (m113447L - j16)));
        } else {
            i12 = this.f107109A;
        }
        Continuation[] continuationArr = AbstractSharedFlowKt.f107191a;
        long j18 = this.f107109A + m113447L;
        if (i12 > 0) {
            continuationArr = new Continuation[i12];
            Object[] objArr = this.f107113w;
            AbstractC19074t.m100205c(objArr);
            long j19 = m113447L;
            int i13 = 0;
            while (true) {
                if (m113447L < j18) {
                    m113482f2 = SharedFlowKt.m113482f(objArr, m113447L);
                    j12 = j16;
                    Symbol symbol = SharedFlowKt.f107129a;
                    if (m113482f2 != symbol) {
                        AbstractC19074t.m100206d(m113482f2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        Emitter emitter = (Emitter) m113482f2;
                        int i14 = i13 + 1;
                        j13 = j18;
                        continuationArr[i13] = emitter.f107120s;
                        SharedFlowKt.m113483g(objArr, m113447L, symbol);
                        SharedFlowKt.m113483g(objArr, j19, emitter.f107119r);
                        j15 = 1;
                        j19++;
                        if (i14 >= i12) {
                            break;
                        }
                        i13 = i14;
                    } else {
                        j13 = j18;
                        j15 = 1;
                    }
                    m113447L += j15;
                    j16 = j12;
                    j18 = j13;
                } else {
                    j12 = j16;
                    j13 = j18;
                    break;
                }
            }
            m113447L = j19;
        } else {
            j12 = j16;
            j13 = j18;
        }
        int i15 = (int) (m113447L - m113448M);
        if (m113519n() == 0) {
            j14 = m113447L;
        } else {
            j14 = j12;
        }
        long max = Math.max(this.f107114x, m113447L - Math.min(this.f107110t, i15));
        if (this.f107111u == 0 && max < j13) {
            Object[] objArr2 = this.f107113w;
            AbstractC19074t.m100205c(objArr2);
            m113482f = SharedFlowKt.m113482f(objArr2, max);
            if (AbstractC19074t.m100204b(m113482f, SharedFlowKt.f107129a)) {
                m113447L++;
                max++;
            }
        }
        m113458X(max, j14, m113447L, j13);
        m113439B();
        if (continuationArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return m113446K(continuationArr);
        }
        return continuationArr;
    }

    /* renamed from: Z */
    public final long m113474Z() {
        long j11 = this.f107114x;
        if (j11 < this.f107115y) {
            this.f107115y = j11;
        }
        return j11;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        return m113440C(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        return m113443H(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /* renamed from: c */
    public Flow mo113437c(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        return SharedFlowKt.m113481e(this, interfaceC27315f, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: d */
    public boolean mo113433d(Object obj) {
        int i11;
        boolean z11;
        Continuation[] continuationArr = AbstractSharedFlowKt.f107191a;
        synchronized (this) {
            if (m113454T(obj)) {
                continuationArr = m113446K(continuationArr);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            }
        }
        return z11;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: l */
    public void mo113435l() {
        synchronized (this) {
            m113458X(m113447L(), this.f107115y, m113447L(), m113450P());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
