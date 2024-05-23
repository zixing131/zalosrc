package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC1246b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import nn0.AbstractC23902k;
import nn0.InterfaceC23898g;
import pm0.AbstractC24845f;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes.dex */
public class JobSupport implements Job, ChildJob, ParentJob {

    /* renamed from: p */
    private static final AtomicReferenceFieldUpdater f105902p = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");

    /* renamed from: q */
    private static final AtomicReferenceFieldUpdater f105903q = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* loaded from: classes7.dex */
    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {

        /* renamed from: x */
        private final JobSupport f105906x;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.f105906x = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        /* renamed from: M */
        protected String mo112575M() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        /* renamed from: x */
        public Throwable mo112589x(Job job) {
            Throwable m112842f;
            Object m112815G0 = this.f105906x.m112815G0();
            if ((m112815G0 instanceof Finishing) && (m112842f = ((Finishing) m112815G0).m112842f()) != null) {
                return m112842f;
            }
            if (m112815G0 instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) m112815G0).f105828a;
            }
            return job.mo112732A();
        }
    }

    /* loaded from: classes7.dex */
    public static final class ChildCompletion extends JobNode {

        /* renamed from: t */
        private final JobSupport f105907t;

        /* renamed from: u */
        private final Finishing f105908u;

        /* renamed from: v */
        private final ChildHandleNode f105909v;

        /* renamed from: w */
        private final Object f105910w;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.f105907t = jobSupport;
            this.f105908u = finishing;
            this.f105909v = childHandleNode;
            this.f105910w = obj;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            mo112514r((Throwable) obj);
            return C24848g0.f119245a;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: r */
        public void mo112514r(Throwable th2) {
            this.f105907t.m112810t0(this.f105908u, this.f105909v, this.f105910w);
        }
    }

    /* loaded from: classes.dex */
    public static final class Finishing implements Incomplete {

        /* renamed from: q */
        private static final AtomicIntegerFieldUpdater f105911q = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting");

        /* renamed from: r */
        private static final AtomicReferenceFieldUpdater f105912r = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause");

        /* renamed from: s */
        private static final AtomicReferenceFieldUpdater f105913s = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: p */
        private final NodeList f105914p;

        public Finishing(NodeList nodeList, boolean z11, Throwable th2) {
            this.f105914p = nodeList;
            this._isCompleting = z11 ? 1 : 0;
            this._rootCause = th2;
        }

        /* renamed from: d */
        private final ArrayList m112838d() {
            return new ArrayList(4);
        }

        /* renamed from: e */
        private final Object m112839e() {
            return f105913s.get(this);
        }

        /* renamed from: l */
        private final void m112840l(Object obj) {
            f105913s.set(this, obj);
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: a */
        public NodeList mo112682a() {
            return this.f105914p;
        }

        /* renamed from: b */
        public final void m112841b(Throwable th2) {
            Throwable m112842f = m112842f();
            if (m112842f == null) {
                m112848m(th2);
                return;
            }
            if (th2 == m112842f) {
                return;
            }
            Object m112839e = m112839e();
            if (m112839e == null) {
                m112840l(th2);
                return;
            }
            if (m112839e instanceof Throwable) {
                if (th2 == m112839e) {
                    return;
                }
                ArrayList m112838d = m112838d();
                m112838d.add(m112839e);
                m112838d.add(th2);
                m112840l(m112838d);
                return;
            }
            if (m112839e instanceof ArrayList) {
                ((ArrayList) m112839e).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + m112839e).toString());
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: c */
        public boolean mo112683c() {
            if (m112842f() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final Throwable m112842f() {
            return (Throwable) f105912r.get(this);
        }

        /* renamed from: g */
        public final boolean m112843g() {
            if (m112842f() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final boolean m112844h() {
            if (f105911q.get(this) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public final boolean m112845i() {
            Symbol symbol;
            Object m112839e = m112839e();
            symbol = JobSupportKt.f105931e;
            if (m112839e == symbol) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final List m112846j(Throwable th2) {
            ArrayList arrayList;
            Symbol symbol;
            Object m112839e = m112839e();
            if (m112839e == null) {
                arrayList = m112838d();
            } else if (m112839e instanceof Throwable) {
                ArrayList m112838d = m112838d();
                m112838d.add(m112839e);
                arrayList = m112838d;
            } else if (m112839e instanceof ArrayList) {
                arrayList = (ArrayList) m112839e;
            } else {
                throw new IllegalStateException(("State is " + m112839e).toString());
            }
            Throwable m112842f = m112842f();
            if (m112842f != null) {
                arrayList.add(0, m112842f);
            }
            if (th2 != null && !AbstractC19074t.m100204b(th2, m112842f)) {
                arrayList.add(th2);
            }
            symbol = JobSupportKt.f105931e;
            m112840l(symbol);
            return arrayList;
        }

        /* renamed from: k */
        public final void m112847k(boolean z11) {
            f105911q.set(this, z11 ? 1 : 0);
        }

        /* renamed from: m */
        public final void m112848m(Throwable th2) {
            f105912r.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + m112843g() + ", completing=" + m112844h() + ", rootCause=" + m112842f() + ", exceptions=" + m112839e() + ", list=" + mo112682a() + ']';
        }
    }

    /* loaded from: classes7.dex */
    public final class SelectOnAwaitCompletionHandler extends JobNode {

        /* renamed from: t */
        private final SelectInstance f105915t;

        public SelectOnAwaitCompletionHandler(SelectInstance selectInstance) {
            this.f105915t = selectInstance;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            mo112514r((Throwable) obj);
            return C24848g0.f119245a;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: r */
        public void mo112514r(Throwable th2) {
            Object m112815G0 = JobSupport.this.m112815G0();
            if (!(m112815G0 instanceof CompletedExceptionally)) {
                m112815G0 = JobSupportKt.m112860h(m112815G0);
            }
            this.f105915t.mo113857f(JobSupport.this, m112815G0);
        }
    }

    /* loaded from: classes7.dex */
    public final class SelectOnJoinCompletionHandler extends JobNode {

        /* renamed from: t */
        private final SelectInstance f105917t;

        public SelectOnJoinCompletionHandler(SelectInstance selectInstance) {
            this.f105917t = selectInstance;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            mo112514r((Throwable) obj);
            return C24848g0.f119245a;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: r */
        public void mo112514r(Throwable th2) {
            this.f105917t.mo113857f(JobSupport.this, C24848g0.f119245a);
        }
    }

    public JobSupport(boolean z11) {
        this._state = z11 ? JobSupportKt.f105933g : JobSupportKt.f105932f;
    }

    /* renamed from: A0 */
    private final Throwable m112776A0(Object obj) {
        CompletedExceptionally completedExceptionally;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally == null) {
            return null;
        }
        return completedExceptionally.f105828a;
    }

    /* renamed from: B0 */
    private final Throwable m112777B0(Finishing finishing, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!finishing.m112843g()) {
                return null;
            }
            return new JobCancellationException(mo112497p0(), null, this);
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    /* renamed from: E0 */
    private final NodeList m112778E0(Incomplete incomplete) {
        NodeList mo112682a = incomplete.mo112682a();
        if (mo112682a == null) {
            if (incomplete instanceof Empty) {
                return new NodeList();
            }
            if (incomplete instanceof JobNode) {
                m112795b1((JobNode) incomplete);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + incomplete).toString());
        }
        return mo112682a;
    }

    /* renamed from: L0 */
    private final boolean m112779L0() {
        Object m112815G0;
        do {
            m112815G0 = m112815G0();
            if (!(m112815G0 instanceof Incomplete)) {
                return false;
            }
        } while (m112798f1(m112815G0) < 0);
        return true;
    }

    /* renamed from: M0 */
    private final Object m112780M0(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        CancellableContinuationKt.m112590a(cancellableContinuationImpl, mo112733M(new ResumeOnCompletion(cancellableContinuationImpl)));
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

    /* renamed from: N0 */
    private final Object m112781N0(Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Throwable th2 = null;
        Throwable th3 = null;
        while (true) {
            Object m112815G0 = m112815G0();
            if (m112815G0 instanceof Finishing) {
                synchronized (m112815G0) {
                    if (((Finishing) m112815G0).m112845i()) {
                        symbol2 = JobSupportKt.f105930d;
                        return symbol2;
                    }
                    boolean m112843g = ((Finishing) m112815G0).m112843g();
                    if (obj != null || !m112843g) {
                        if (th3 == null) {
                            th3 = m112811u0(obj);
                        }
                        ((Finishing) m112815G0).m112841b(th3);
                    }
                    Throwable m112842f = ((Finishing) m112815G0).m112842f();
                    if (!m112843g) {
                        th2 = m112842f;
                    }
                    if (th2 != null) {
                        m112784T0(((Finishing) m112815G0).mo112682a(), th2);
                    }
                    symbol = JobSupportKt.f105927a;
                    return symbol;
                }
            }
            if (!(m112815G0 instanceof Incomplete)) {
                symbol3 = JobSupportKt.f105930d;
                return symbol3;
            }
            if (th3 == null) {
                th3 = m112811u0(obj);
            }
            Incomplete incomplete = (Incomplete) m112815G0;
            if (incomplete.mo112683c()) {
                if (m112803l1(incomplete, th3)) {
                    symbol4 = JobSupportKt.f105927a;
                    return symbol4;
                }
            } else {
                Object m112804m1 = m112804m1(m112815G0, new CompletedExceptionally(th3, false, 2, null));
                symbol5 = JobSupportKt.f105927a;
                if (m112804m1 != symbol5) {
                    symbol6 = JobSupportKt.f105929c;
                    if (m112804m1 != symbol6) {
                        return m112804m1;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + m112815G0).toString());
                }
            }
        }
    }

    /* renamed from: Q0 */
    private final JobNode m112782Q0(InterfaceC18505l interfaceC18505l, boolean z11) {
        JobNode jobNode = null;
        if (z11) {
            if (interfaceC18505l instanceof JobCancellingNode) {
                jobNode = (JobCancellingNode) interfaceC18505l;
            }
            if (jobNode == null) {
                jobNode = new InvokeOnCancelling(interfaceC18505l);
            }
        } else {
            if (interfaceC18505l instanceof JobNode) {
                jobNode = (JobNode) interfaceC18505l;
            }
            if (jobNode == null) {
                jobNode = new InvokeOnCompletion(interfaceC18505l);
            }
        }
        jobNode.m112775t(this);
        return jobNode;
    }

    /* renamed from: S0 */
    private final ChildHandleNode m112783S0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo113646m()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m113658l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m113657k();
            if (!lockFreeLinkedListNode.mo113646m()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    /* renamed from: T0 */
    private final void m112784T0(NodeList nodeList, Throwable th2) {
        mo112821X0(th2);
        Object m113656j = nodeList.m113656j();
        AbstractC19074t.m100206d(m113656j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m113656j; !AbstractC19074t.m100204b(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.m113657k()) {
            if (lockFreeLinkedListNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNode;
                try {
                    jobNode.mo112514r(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        AbstractC24845f.m129182a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo112493I0(completionHandlerException);
        }
        m112807o0(th2);
    }

    /* renamed from: U0 */
    private final void m112785U0(NodeList nodeList, Throwable th2) {
        Object m113656j = nodeList.m113656j();
        AbstractC19074t.m100206d(m113656j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m113656j; !AbstractC19074t.m100204b(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.m113657k()) {
            if (lockFreeLinkedListNode instanceof JobNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNode;
                try {
                    jobNode.mo112514r(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        AbstractC24845f.m129182a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo112493I0(completionHandlerException);
        }
    }

    /* renamed from: V0 */
    public final Object m112787V0(Object obj, Object obj2) {
        if (!(obj2 instanceof CompletedExceptionally)) {
            return obj2;
        }
        throw ((CompletedExceptionally) obj2).f105828a;
    }

    /* renamed from: W0 */
    public final void m112789W0(SelectInstance selectInstance, Object obj) {
        Object m112815G0;
        do {
            m112815G0 = m112815G0();
            if (!(m112815G0 instanceof Incomplete)) {
                if (!(m112815G0 instanceof CompletedExceptionally)) {
                    m112815G0 = JobSupportKt.m112860h(m112815G0);
                }
                selectInstance.mo113855d(m112815G0);
                return;
            }
        } while (m112798f1(m112815G0) < 0);
        selectInstance.mo113856e(mo112733M(new SelectOnAwaitCompletionHandler(selectInstance)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.InactiveNodeList] */
    /* renamed from: a1 */
    private final void m112793a1(Empty empty) {
        NodeList nodeList = new NodeList();
        if (!empty.mo112683c()) {
            nodeList = new InactiveNodeList(nodeList);
        }
        AbstractC1246b.m5921a(f105902p, this, empty, nodeList);
    }

    /* renamed from: b0 */
    private final boolean m112794b0(Object obj, NodeList nodeList, JobNode jobNode) {
        int m113661q;
        JobSupport$addLastAtomic$$inlined$addLastIf$1 jobSupport$addLastAtomic$$inlined$addLastIf$1 = new LockFreeLinkedListNode.CondAddOp(jobNode) { // from class: kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1

            /* renamed from: d */
            final /* synthetic */ JobSupport f105904d;

            /* renamed from: e */
            final /* synthetic */ Object f105905e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JobSupport$addLastAtomic$$inlined$addLastIf$1(LockFreeLinkedListNode jobNode2, JobSupport this, Object obj2) {
                super(jobNode2);
                r2 = this;
                r3 = obj2;
            }

            @Override // kotlinx.coroutines.internal.AtomicOp
            /* renamed from: f */
            public Object mo112836d(LockFreeLinkedListNode lockFreeLinkedListNode) {
                if (r2.m112815G0() == r3) {
                    return null;
                }
                return LockFreeLinkedListKt.m113647a();
            }
        };
        do {
            m113661q = nodeList.m113658l().m113661q(jobNode2, nodeList, jobSupport$addLastAtomic$$inlined$addLastIf$1);
            if (m113661q == 1) {
                return true;
            }
        } while (m113661q != 2);
        return false;
    }

    /* renamed from: b1 */
    private final void m112795b1(JobNode jobNode) {
        jobNode.m113655f(new NodeList());
        AbstractC1246b.m5921a(f105902p, this, jobNode, jobNode.m113657k());
    }

    /* renamed from: c1 */
    public final void m112796c1(SelectInstance selectInstance, Object obj) {
        if (!m112779L0()) {
            selectInstance.mo113855d(C24848g0.f119245a);
        } else {
            selectInstance.mo113856e(mo112733M(new SelectOnJoinCompletionHandler(selectInstance)));
        }
    }

    /* renamed from: e0 */
    private final void m112797e0(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                AbstractC24845f.m129182a(th2, th3);
            }
        }
    }

    /* renamed from: f1 */
    private final int m112798f1(Object obj) {
        Empty empty;
        if (obj instanceof Empty) {
            if (((Empty) obj).mo112683c()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105902p;
            empty = JobSupportKt.f105933g;
            if (!AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, obj, empty)) {
                return -1;
            }
            mo112822Z0();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        if (!AbstractC1246b.m5921a(f105902p, this, obj, ((InactiveNodeList) obj).mo112682a())) {
            return -1;
        }
        mo112822Z0();
        return 1;
    }

    /* renamed from: g1 */
    private final String m112799g1(Object obj) {
        if (obj instanceof Finishing) {
            Finishing finishing = (Finishing) obj;
            if (finishing.m112843g()) {
                return "Cancelling";
            }
            if (!finishing.m112844h()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof Incomplete) {
            if (((Incomplete) obj).mo112683c()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof CompletedExceptionally) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: i1 */
    public static /* synthetic */ CancellationException m112800i1(JobSupport jobSupport, Throwable th2, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return jobSupport.m112827h1(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: j0 */
    private final Object m112801j0(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        AwaitContinuation awaitContinuation = new AwaitContinuation(m142576c, this);
        awaitContinuation.m112574F();
        CancellableContinuationKt.m112590a(awaitContinuation, mo112733M(new ResumeAwaitOnCompletion(awaitContinuation)));
        Object m112571A = awaitContinuation.m112571A();
        m142578e = AbstractC28298d.m142578e();
        if (m112571A == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m112571A;
    }

    /* renamed from: k1 */
    private final boolean m112802k1(Incomplete incomplete, Object obj) {
        if (!AbstractC1246b.m5921a(f105902p, this, incomplete, JobSupportKt.m112859g(obj))) {
            return false;
        }
        mo112821X0(null);
        mo112495Y0(obj);
        m112809r0(incomplete, obj);
        return true;
    }

    /* renamed from: l1 */
    private final boolean m112803l1(Incomplete incomplete, Throwable th2) {
        NodeList m112778E0 = m112778E0(incomplete);
        if (m112778E0 == null) {
            return false;
        }
        if (!AbstractC1246b.m5921a(f105902p, this, incomplete, new Finishing(m112778E0, false, th2))) {
            return false;
        }
        m112784T0(m112778E0, th2);
        return true;
    }

    /* renamed from: m1 */
    private final Object m112804m1(Object obj, Object obj2) {
        Symbol symbol;
        Symbol symbol2;
        if (!(obj instanceof Incomplete)) {
            symbol2 = JobSupportKt.f105927a;
            return symbol2;
        }
        if (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            if (!m112802k1((Incomplete) obj, obj2)) {
                symbol = JobSupportKt.f105929c;
                return symbol;
            }
            return obj2;
        }
        return m112806n1((Incomplete) obj, obj2);
    }

    /* renamed from: n0 */
    private final Object m112805n0(Object obj) {
        Symbol symbol;
        Object m112804m1;
        Symbol symbol2;
        do {
            Object m112815G0 = m112815G0();
            if (!(m112815G0 instanceof Incomplete) || ((m112815G0 instanceof Finishing) && ((Finishing) m112815G0).m112844h())) {
                symbol = JobSupportKt.f105927a;
                return symbol;
            }
            m112804m1 = m112804m1(m112815G0, new CompletedExceptionally(m112811u0(obj), false, 2, null));
            symbol2 = JobSupportKt.f105929c;
        } while (m112804m1 == symbol2);
        return m112804m1;
    }

    /* renamed from: n1 */
    private final Object m112806n1(Incomplete incomplete, Object obj) {
        Finishing finishing;
        CompletedExceptionally completedExceptionally;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        NodeList m112778E0 = m112778E0(incomplete);
        if (m112778E0 == null) {
            symbol3 = JobSupportKt.f105929c;
            return symbol3;
        }
        Throwable th2 = null;
        if (incomplete instanceof Finishing) {
            finishing = (Finishing) incomplete;
        } else {
            finishing = null;
        }
        if (finishing == null) {
            finishing = new Finishing(m112778E0, false, null);
        }
        C19059j0 c19059j0 = new C19059j0();
        synchronized (finishing) {
            if (finishing.m112844h()) {
                symbol2 = JobSupportKt.f105927a;
                return symbol2;
            }
            finishing.m112847k(true);
            if (finishing != incomplete && !AbstractC1246b.m5921a(f105902p, this, incomplete, finishing)) {
                symbol = JobSupportKt.f105929c;
                return symbol;
            }
            boolean m112843g = finishing.m112843g();
            if (obj instanceof CompletedExceptionally) {
                completedExceptionally = (CompletedExceptionally) obj;
            } else {
                completedExceptionally = null;
            }
            if (completedExceptionally != null) {
                finishing.m112841b(completedExceptionally.f105828a);
            }
            Throwable m112842f = finishing.m112842f();
            if (Boolean.valueOf(true ^ m112843g).booleanValue()) {
                th2 = m112842f;
            }
            c19059j0.f94941p = th2;
            C24848g0 c24848g0 = C24848g0.f119245a;
            if (th2 != null) {
                m112784T0(m112778E0, th2);
            }
            ChildHandleNode m112813x0 = m112813x0(incomplete);
            if (m112813x0 != null && m112808o1(finishing, m112813x0, obj)) {
                return JobSupportKt.f105928b;
            }
            return m112812v0(finishing, obj);
        }
    }

    /* renamed from: o0 */
    private final boolean m112807o0(Throwable th2) {
        if (mo112524K0()) {
            return true;
        }
        boolean z11 = th2 instanceof CancellationException;
        ChildHandle m112814F0 = m112814F0();
        if (m112814F0 != null && m112814F0 != NonDisposableHandle.f105937p) {
            if (m112814F0.mo112593d(th2) || z11) {
                return true;
            }
            return false;
        }
        return z11;
    }

    /* renamed from: o1 */
    private final boolean m112808o1(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (Job.DefaultImpls.m112743d(childHandleNode.f105821t, false, false, new ChildCompletion(this, finishing, childHandleNode, obj), 1, null) == NonDisposableHandle.f105937p) {
            childHandleNode = m112783S0(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r0 */
    private final void m112809r0(Incomplete incomplete, Object obj) {
        CompletedExceptionally completedExceptionally;
        ChildHandle m112814F0 = m112814F0();
        if (m112814F0 != null) {
            m112814F0.dispose();
            m112825e1(NonDisposableHandle.f105937p);
        }
        Throwable th2 = null;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally != null) {
            th2 = completedExceptionally.f105828a;
        }
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).mo112514r(th2);
                return;
            } catch (Throwable th3) {
                mo112493I0(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th3));
                return;
            }
        }
        NodeList mo112682a = incomplete.mo112682a();
        if (mo112682a != null) {
            m112785U0(mo112682a, th2);
        }
    }

    /* renamed from: t0 */
    public final void m112810t0(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        ChildHandleNode m112783S0 = m112783S0(childHandleNode);
        if (m112783S0 != null && m112808o1(finishing, m112783S0, obj)) {
            return;
        }
        mo112525h0(m112812v0(finishing, obj));
    }

    /* renamed from: u0 */
    private final Throwable m112811u0(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new JobCancellationException(mo112497p0(), null, this);
            }
            return th2;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).mo112819P();
    }

    /* renamed from: v0 */
    private final Object m112812v0(Finishing finishing, Object obj) {
        CompletedExceptionally completedExceptionally;
        Throwable th2;
        boolean m112843g;
        Throwable m112777B0;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally != null) {
            th2 = completedExceptionally.f105828a;
        } else {
            th2 = null;
        }
        synchronized (finishing) {
            m112843g = finishing.m112843g();
            List m112846j = finishing.m112846j(th2);
            m112777B0 = m112777B0(finishing, m112846j);
            if (m112777B0 != null) {
                m112797e0(m112777B0, m112846j);
            }
        }
        if (m112777B0 != null && m112777B0 != th2) {
            obj = new CompletedExceptionally(m112777B0, false, 2, null);
        }
        if (m112777B0 != null && (m112807o0(m112777B0) || mo112816H0(m112777B0))) {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally) obj).m112605b();
        }
        if (!m112843g) {
            mo112821X0(m112777B0);
        }
        mo112495Y0(obj);
        AbstractC1246b.m5921a(f105902p, this, finishing, JobSupportKt.m112859g(obj));
        m112809r0(finishing, obj);
        return obj;
    }

    /* renamed from: x0 */
    private final ChildHandleNode m112813x0(Incomplete incomplete) {
        ChildHandleNode childHandleNode;
        if (incomplete instanceof ChildHandleNode) {
            childHandleNode = (ChildHandleNode) incomplete;
        } else {
            childHandleNode = null;
        }
        if (childHandleNode == null) {
            NodeList mo112682a = incomplete.mo112682a();
            if (mo112682a == null) {
                return null;
            }
            return m112783S0(mo112682a);
        }
        return childHandleNode;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: A */
    public final CancellationException mo112732A() {
        Object m112815G0 = m112815G0();
        if (m112815G0 instanceof Finishing) {
            Throwable m112842f = ((Finishing) m112815G0).m112842f();
            if (m112842f != null) {
                CancellationException m112827h1 = m112827h1(m112842f, DebugStringsKt.m112647a(this) + " is cancelling");
                if (m112827h1 != null) {
                    return m112827h1;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(m112815G0 instanceof Incomplete)) {
            if (m112815G0 instanceof CompletedExceptionally) {
                return m112800i1(this, ((CompletedExceptionally) m112815G0).f105828a, null, 1, null);
            }
            return new JobCancellationException(DebugStringsKt.m112647a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: C0 */
    public boolean mo112747C0() {
        return true;
    }

    /* renamed from: D0 */
    public boolean mo112597D0() {
        return false;
    }

    @Override // kotlinx.coroutines.ChildJob
    /* renamed from: F */
    public final void mo112594F(ParentJob parentJob) {
        m112831l0(parentJob);
    }

    /* renamed from: F0 */
    public final ChildHandle m112814F0() {
        return (ChildHandle) f105903q.get(this);
    }

    /* renamed from: G0 */
    public final Object m112815G0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105902p;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo113581a(this);
        }
    }

    /* renamed from: H0 */
    protected boolean mo112816H0(Throwable th2) {
        return false;
    }

    /* renamed from: J0 */
    public final void m112817J0(Job job) {
        if (job == null) {
            m112825e1(NonDisposableHandle.f105937p);
            return;
        }
        job.start();
        ChildHandle mo112739y0 = job.mo112739y0(this);
        m112825e1(mo112739y0);
        if (mo112737f()) {
            mo112739y0.dispose();
            m112825e1(NonDisposableHandle.f105937p);
        }
    }

    /* renamed from: K0 */
    protected boolean mo112524K0() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: M */
    public final DisposableHandle mo112733M(InterfaceC18505l interfaceC18505l) {
        return mo112738w0(false, true, interfaceC18505l);
    }

    /* renamed from: O0 */
    public final boolean m112818O0(Object obj) {
        Object m112804m1;
        Symbol symbol;
        Symbol symbol2;
        do {
            m112804m1 = m112804m1(m112815G0(), obj);
            symbol = JobSupportKt.f105927a;
            if (m112804m1 == symbol) {
                return false;
            }
            if (m112804m1 != JobSupportKt.f105928b) {
                symbol2 = JobSupportKt.f105929c;
            } else {
                return true;
            }
        } while (m112804m1 == symbol2);
        mo112525h0(m112804m1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.ParentJob
    /* renamed from: P */
    public CancellationException mo112819P() {
        CancellationException cancellationException;
        Object m112815G0 = m112815G0();
        CancellationException cancellationException2 = null;
        if (m112815G0 instanceof Finishing) {
            cancellationException = ((Finishing) m112815G0).m112842f();
        } else if (m112815G0 instanceof CompletedExceptionally) {
            cancellationException = ((CompletedExceptionally) m112815G0).f105828a;
        } else if (!(m112815G0 instanceof Incomplete)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m112815G0).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new JobCancellationException("Parent job is " + m112799g1(m112815G0), cancellationException, this);
        }
        return cancellationException2;
    }

    /* renamed from: P0 */
    public final Object m112820P0(Object obj) {
        Object m112804m1;
        Symbol symbol;
        Symbol symbol2;
        do {
            m112804m1 = m112804m1(m112815G0(), obj);
            symbol = JobSupportKt.f105927a;
            if (m112804m1 != symbol) {
                symbol2 = JobSupportKt.f105929c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m112776A0(obj));
            }
        } while (m112804m1 == symbol2);
        return m112804m1;
    }

    /* renamed from: R0 */
    public String mo112494R0() {
        return DebugStringsKt.m112647a(this);
    }

    /* renamed from: X0 */
    protected void mo112821X0(Throwable th2) {
    }

    /* renamed from: Y0 */
    protected void mo112495Y0(Object obj) {
    }

    /* renamed from: Z0 */
    protected void mo112822Z0() {
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public void mo112734a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo112497p0(), null, this);
        }
        mo112832m0(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public final InterfaceC23898g mo112735b() {
        InterfaceC23898g m125013b;
        m125013b = AbstractC23902k.m125013b(new JobSupport$children$1(this, null));
        return m125013b;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: c */
    public boolean mo112496c() {
        Object m112815G0 = m112815G0();
        if ((m112815G0 instanceof Incomplete) && ((Incomplete) m112815G0).mo112683c()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: c0 */
    public final Object mo112736c0(Continuation continuation) {
        Object m142578e;
        if (!m112779L0()) {
            JobKt.m112758k(continuation.getContext());
            return C24848g0.f119245a;
        }
        Object m112780M0 = m112780M0(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112780M0 == m142578e) {
            return m112780M0;
        }
        return C24848g0.f119245a;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        return Job.DefaultImpls.m112742c(this, cVar);
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        return Job.DefaultImpls.m112745f(this, interfaceC27315f);
    }

    /* renamed from: d1 */
    public final void m112824d1(JobNode jobNode) {
        Object m112815G0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Empty empty;
        do {
            m112815G0 = m112815G0();
            if (m112815G0 instanceof JobNode) {
                if (m112815G0 != jobNode) {
                    return;
                }
                atomicReferenceFieldUpdater = f105902p;
                empty = JobSupportKt.f105933g;
            } else {
                if ((m112815G0 instanceof Incomplete) && ((Incomplete) m112815G0).mo112682a() != null) {
                    jobNode.m113659n();
                    return;
                }
                return;
            }
        } while (!AbstractC1246b.m5921a(atomicReferenceFieldUpdater, this, m112815G0, empty));
    }

    /* renamed from: e1 */
    public final void m112825e1(ChildHandle childHandle) {
        f105903q.set(this, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: f */
    public final boolean mo112737f() {
        return !(m112815G0() instanceof Incomplete);
    }

    @Override // um0.InterfaceC27315f.b
    public final InterfaceC27315f.c getKey() {
        return Job.f105897m;
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        ChildHandle m112814F0 = m112814F0();
        if (m112814F0 != null) {
            return m112814F0.getParent();
        }
        return null;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        return Job.DefaultImpls.m112741b(this, obj, interfaceC18509p);
    }

    /* renamed from: h0 */
    public void mo112525h0(Object obj) {
    }

    /* renamed from: h1 */
    protected final CancellationException m112827h1(Throwable th2, String str) {
        CancellationException cancellationException;
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo112497p0();
            }
            cancellationException = new JobCancellationException(str, th2, this);
        }
        return cancellationException;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        return Job.DefaultImpls.m112744e(this, cVar);
    }

    /* renamed from: i0 */
    public final Object m112828i0(Continuation continuation) {
        Object m112815G0;
        do {
            m112815G0 = m112815G0();
            if (!(m112815G0 instanceof Incomplete)) {
                if (!(m112815G0 instanceof CompletedExceptionally)) {
                    return JobSupportKt.m112860h(m112815G0);
                }
                throw ((CompletedExceptionally) m112815G0).f105828a;
            }
        } while (m112798f1(m112815G0) < 0);
        return m112801j0(continuation);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object m112815G0 = m112815G0();
        if (!(m112815G0 instanceof CompletedExceptionally) && (!(m112815G0 instanceof Finishing) || !((Finishing) m112815G0).m112843g())) {
            return false;
        }
        return true;
    }

    /* renamed from: j1 */
    public final String m112829j1() {
        return mo112494R0() + '{' + m112799g1(m112815G0()) + '}';
    }

    /* renamed from: k0 */
    public final boolean m112830k0(Throwable th2) {
        return m112831l0(th2);
    }

    /* renamed from: l0 */
    public final boolean m112831l0(Object obj) {
        Object obj2;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        obj2 = JobSupportKt.f105927a;
        if (!mo112597D0() || (obj2 = m112805n0(obj)) != JobSupportKt.f105928b) {
            symbol = JobSupportKt.f105927a;
            if (obj2 == symbol) {
                obj2 = m112781N0(obj);
            }
            symbol2 = JobSupportKt.f105927a;
            if (obj2 != symbol2 && obj2 != JobSupportKt.f105928b) {
                symbol3 = JobSupportKt.f105930d;
                if (obj2 == symbol3) {
                    return false;
                }
                mo112525h0(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: m0 */
    public void mo112832m0(Throwable th2) {
        m112831l0(th2);
    }

    /* renamed from: p0 */
    public String mo112497p0() {
        return "Job was cancelled";
    }

    /* renamed from: q0 */
    public boolean mo112833q0(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (m112831l0(th2) && mo112747C0()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int m112798f1;
        do {
            m112798f1 = m112798f1(m112815G0());
            if (m112798f1 == 0) {
                return false;
            }
        } while (m112798f1 != 1);
        return true;
    }

    /* renamed from: t */
    public final Throwable m112834t() {
        Object m112815G0 = m112815G0();
        if (!(m112815G0 instanceof Incomplete)) {
            return m112776A0(m112815G0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public String toString() {
        return m112829j1() + '@' + DebugStringsKt.m112648b(this);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: w0 */
    public final DisposableHandle mo112738w0(boolean z11, boolean z12, InterfaceC18505l interfaceC18505l) {
        CompletedExceptionally completedExceptionally;
        JobNode m112782Q0 = m112782Q0(interfaceC18505l, z11);
        while (true) {
            Object m112815G0 = m112815G0();
            if (m112815G0 instanceof Empty) {
                Empty empty = (Empty) m112815G0;
                if (empty.mo112683c()) {
                    if (AbstractC1246b.m5921a(f105902p, this, m112815G0, m112782Q0)) {
                        return m112782Q0;
                    }
                } else {
                    m112793a1(empty);
                }
            } else {
                Throwable th2 = null;
                if (m112815G0 instanceof Incomplete) {
                    NodeList mo112682a = ((Incomplete) m112815G0).mo112682a();
                    if (mo112682a == null) {
                        AbstractC19074t.m100206d(m112815G0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m112795b1((JobNode) m112815G0);
                    } else {
                        DisposableHandle disposableHandle = NonDisposableHandle.f105937p;
                        if (z11 && (m112815G0 instanceof Finishing)) {
                            synchronized (m112815G0) {
                                try {
                                    th2 = ((Finishing) m112815G0).m112842f();
                                    if (th2 != null) {
                                        if ((interfaceC18505l instanceof ChildHandleNode) && !((Finishing) m112815G0).m112844h()) {
                                        }
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                    }
                                    if (m112794b0(m112815G0, mo112682a, m112782Q0)) {
                                        if (th2 == null) {
                                            return m112782Q0;
                                        }
                                        disposableHandle = m112782Q0;
                                        C24848g0 c24848g02 = C24848g0.f119245a;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        if (th2 != null) {
                            if (z12) {
                                interfaceC18505l.mo205i9(th2);
                            }
                            return disposableHandle;
                        }
                        if (m112794b0(m112815G0, mo112682a, m112782Q0)) {
                            return m112782Q0;
                        }
                    }
                } else {
                    if (z12) {
                        if (m112815G0 instanceof CompletedExceptionally) {
                            completedExceptionally = (CompletedExceptionally) m112815G0;
                        } else {
                            completedExceptionally = null;
                        }
                        if (completedExceptionally != null) {
                            th2 = completedExceptionally.f105828a;
                        }
                        interfaceC18505l.mo205i9(th2);
                    }
                    return NonDisposableHandle.f105937p;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: y0 */
    public final ChildHandle mo112739y0(ChildJob childJob) {
        DisposableHandle m112743d = Job.DefaultImpls.m112743d(this, true, false, new ChildHandleNode(childJob), 2, null);
        AbstractC19074t.m100206d(m112743d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle) m112743d;
    }

    /* renamed from: z0 */
    public final Object m112835z0() {
        Object m112815G0 = m112815G0();
        if (!(m112815G0 instanceof Incomplete)) {
            if (!(m112815G0 instanceof CompletedExceptionally)) {
                return JobSupportKt.m112860h(m112815G0);
            }
            throw ((CompletedExceptionally) m112815G0).f105828a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    /* renamed from: I0 */
    public void mo112493I0(Throwable th2) {
        throw th2;
    }
}
