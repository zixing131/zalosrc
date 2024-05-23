package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC1246b;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.InterfaceC29097e;

/* loaded from: classes.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, InterfaceC29097e, Waiter {

    /* renamed from: u */
    private static final AtomicIntegerFieldUpdater f105813u = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex");

    /* renamed from: v */
    private static final AtomicReferenceFieldUpdater f105814v = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");

    /* renamed from: w */
    private static final AtomicReferenceFieldUpdater f105815w = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: s */
    private final Continuation f105816s;

    /* renamed from: t */
    private final InterfaceC27315f f105817t;

    public CancellableContinuationImpl(Continuation continuation, int i11) {
        super(i11);
        this.f105816s = continuation;
        this.f105817t = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = Active.f105791p;
    }

    /* renamed from: E */
    private final String m112553E() {
        Object m112572B = m112572B();
        if (m112572B instanceof NotCompleted) {
            return "Active";
        }
        if (m112572B instanceof CancelledContinuation) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: G */
    private final DisposableHandle m112554G() {
        Job job = (Job) getContext().mo112624d(Job.f105897m);
        if (job == null) {
            return null;
        }
        DisposableHandle m112743d = Job.DefaultImpls.m112743d(job, true, false, new ChildContinuation(this), 2, null);
        AbstractC1246b.m5921a(f105815w, this, null, m112743d);
        return m112743d;
    }

    /* renamed from: H */
    private final void m112555H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105814v;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Active) {
                if (AbstractC1246b.m5921a(f105814v, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof CancelHandler) || (obj2 instanceof Segment)) {
                m112558L(obj, obj2);
            } else {
                boolean z11 = obj2 instanceof CompletedExceptionally;
                if (z11) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                    if (!completedExceptionally.m112605b()) {
                        m112558L(obj, obj2);
                    }
                    if (obj2 instanceof CancelledContinuation) {
                        Throwable th2 = null;
                        if (!z11) {
                            completedExceptionally = null;
                        }
                        if (completedExceptionally != null) {
                            th2 = completedExceptionally.f105828a;
                        }
                        if (obj instanceof CancelHandler) {
                            m112586p((CancelHandler) obj, th2);
                            return;
                        } else {
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m112566r((Segment) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                    if (completedContinuation.f105823b != null) {
                        m112558L(obj, obj2);
                    }
                    if (obj instanceof Segment) {
                        return;
                    }
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CancelHandler cancelHandler = (CancelHandler) obj;
                    if (completedContinuation.m112602c()) {
                        m112586p(cancelHandler, completedContinuation.f105826e);
                        return;
                    } else {
                        if (AbstractC1246b.m5921a(f105814v, this, obj2, CompletedContinuation.m112600b(completedContinuation, null, cancelHandler, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof Segment) {
                        return;
                    }
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractC1246b.m5921a(f105814v, this, obj2, new CompletedContinuation(obj2, (CancelHandler) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: J */
    private final boolean m112556J() {
        if (DispatchedTaskKt.m112676c(this.f105860r)) {
            Continuation continuation = this.f105816s;
            AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((DispatchedContinuation) continuation).m113607s()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    private final CancelHandler m112557K(InterfaceC18505l interfaceC18505l) {
        if (interfaceC18505l instanceof CancelHandler) {
            return (CancelHandler) interfaceC18505l;
        }
        return new InvokeOnCancel(interfaceC18505l);
    }

    /* renamed from: L */
    private final void m112558L(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: Q */
    private final void m112559Q(Object obj, int i11, InterfaceC18505l interfaceC18505l) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105814v;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
            } else {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    if (cancelledContinuation.m112592c()) {
                        if (interfaceC18505l != null) {
                            m112587q(interfaceC18505l, cancelledContinuation.f105828a);
                            return;
                        }
                        return;
                    }
                }
                m112565o(obj);
                throw new KotlinNothingValueException();
            }
        } while (!AbstractC1246b.m5921a(f105814v, this, obj2, m112561T((NotCompleted) obj2, obj, i11, interfaceC18505l, null)));
        m112568u();
        m112569w(i11);
    }

    /* renamed from: S */
    static /* synthetic */ void m112560S(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i11, InterfaceC18505l interfaceC18505l, int i12, Object obj2) {
        if (obj2 == null) {
            if ((i12 & 4) != 0) {
                interfaceC18505l = null;
            }
            cancellableContinuationImpl.m112559Q(obj, i11, interfaceC18505l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: T */
    private final Object m112561T(NotCompleted notCompleted, Object obj, int i11, InterfaceC18505l interfaceC18505l, Object obj2) {
        CancelHandler cancelHandler;
        if (!(obj instanceof CompletedExceptionally)) {
            if (DispatchedTaskKt.m112675b(i11) || obj2 != null) {
                if (interfaceC18505l != null || (notCompleted instanceof CancelHandler) || obj2 != null) {
                    if (notCompleted instanceof CancelHandler) {
                        cancelHandler = (CancelHandler) notCompleted;
                    } else {
                        cancelHandler = null;
                    }
                    return new CompletedContinuation(obj, cancelHandler, interfaceC18505l, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: V */
    private final boolean m112562V() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105813u;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f105813u.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
        return true;
    }

    /* renamed from: W */
    private final Symbol m112563W(Object obj, Object obj2, InterfaceC18505l interfaceC18505l) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105814v;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof NotCompleted) {
            } else {
                if (!(obj3 instanceof CompletedContinuation) || obj2 == null || ((CompletedContinuation) obj3).f105825d != obj2) {
                    return null;
                }
                return CancellableContinuationImplKt.f105818a;
            }
        } while (!AbstractC1246b.m5921a(f105814v, this, obj3, m112561T((NotCompleted) obj3, obj, this.f105860r, interfaceC18505l, obj2)));
        m112568u();
        return CancellableContinuationImplKt.f105818a;
    }

    /* renamed from: X */
    private final boolean m112564X() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105813u;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f105813u.compareAndSet(this, i11, 536870912 + (536870911 & i11)));
        return true;
    }

    /* renamed from: o */
    private final Void m112565o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: r */
    private final void m112566r(Segment segment, Throwable th2) {
        int i11 = f105813u.get(this) & 536870911;
        if (i11 != 536870911) {
            try {
                segment.mo113098o(i11, th2, getContext());
                return;
            } catch (Throwable th3) {
                CoroutineExceptionHandlerKt.m112629a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    /* renamed from: s */
    private final boolean m112567s(Throwable th2) {
        if (!m112556J()) {
            return false;
        }
        Continuation continuation = this.f105816s;
        AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).m113608t(th2);
    }

    /* renamed from: u */
    private final void m112568u() {
        if (!m112556J()) {
            m112588t();
        }
    }

    /* renamed from: w */
    private final void m112569w(int i11) {
        if (m112562V()) {
            return;
        }
        DispatchedTaskKt.m112674a(this, i11);
    }

    /* renamed from: z */
    private final DisposableHandle m112570z() {
        return (DisposableHandle) f105815w.get(this);
    }

    /* renamed from: A */
    public final Object m112571A() {
        Job job;
        Object m142578e;
        boolean m112556J = m112556J();
        if (m112564X()) {
            if (m112570z() == null) {
                m112554G();
            }
            if (m112556J) {
                m112577O();
            }
            m142578e = AbstractC28298d.m142578e();
            return m142578e;
        }
        if (m112556J) {
            m112577O();
        }
        Object m112572B = m112572B();
        if (!(m112572B instanceof CompletedExceptionally)) {
            if (DispatchedTaskKt.m112675b(this.f105860r) && (job = (Job) getContext().mo112624d(Job.f105897m)) != null && !job.mo112496c()) {
                CancellationException mo112732A = job.mo112732A();
                mo112579a(m112572B, mo112732A);
                throw mo112732A;
            }
            return mo112584i(m112572B);
        }
        throw ((CompletedExceptionally) m112572B).f105828a;
    }

    /* renamed from: B */
    public final Object m112572B() {
        return f105814v.get(this);
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: C */
    public StackTraceElement mo112573C() {
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: D */
    public void mo112542D(CoroutineDispatcher coroutineDispatcher, Object obj) {
        DispatchedContinuation dispatchedContinuation;
        int i11;
        Continuation continuation = this.f105816s;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (continuation instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) continuation;
        } else {
            dispatchedContinuation = null;
        }
        if (dispatchedContinuation != null) {
            coroutineDispatcher2 = dispatchedContinuation.f107357s;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i11 = 4;
        } else {
            i11 = this.f105860r;
        }
        m112560S(this, obj, i11, null, 4, null);
    }

    /* renamed from: F */
    public void m112574F() {
        DisposableHandle m112554G = m112554G();
        if (m112554G != null && mo112547f()) {
            m112554G.dispose();
            f105815w.set(this, NonDisposableHandle.f105937p);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: I */
    public void mo112543I(InterfaceC18505l interfaceC18505l) {
        m112555H(m112557K(interfaceC18505l));
    }

    /* renamed from: M */
    protected String mo112575M() {
        return "CancellableContinuation";
    }

    /* renamed from: N */
    public final void m112576N(Throwable th2) {
        if (m112567s(th2)) {
            return;
        }
        mo112550n(th2);
        m112568u();
    }

    /* renamed from: O */
    public final void m112577O() {
        DispatchedContinuation dispatchedContinuation;
        Throwable m113610w;
        Continuation continuation = this.f105816s;
        if (continuation instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) continuation;
        } else {
            dispatchedContinuation = null;
        }
        if (dispatchedContinuation != null && (m113610w = dispatchedContinuation.m113610w(this)) != null) {
            m112588t();
            mo112550n(m113610w);
        }
    }

    /* renamed from: P */
    public final boolean m112578P() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105814v;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).f105825d != null) {
            m112588t();
            return false;
        }
        f105813u.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, Active.f105791p);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: R */
    public Object mo112544R(Object obj, Object obj2, InterfaceC18505l interfaceC18505l) {
        return m112563W(obj, obj2, interfaceC18505l);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: U */
    public void mo112545U(Object obj) {
        m112569w(this.f105860r);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: a */
    public void mo112579a(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105814v;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CompletedExceptionally) {
                    return;
                }
                if (obj2 instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                    if (!completedContinuation.m112602c()) {
                        if (AbstractC1246b.m5921a(f105814v, this, obj2, CompletedContinuation.m112600b(completedContinuation, null, null, null, null, th2, 15, null))) {
                            completedContinuation.m112603d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (AbstractC1246b.m5921a(f105814v, this, obj2, new CompletedContinuation(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.Waiter
    /* renamed from: b */
    public void mo112580b(Segment segment, int i11) {
        int i12;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105813u;
        do {
            i12 = atomicIntegerFieldUpdater.get(this);
            if ((i12 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, ((i12 >> 29) << 29) + i11));
        m112555H(segment);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: c */
    public boolean mo112546c() {
        return m112572B() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: d */
    public final Continuation mo112581d() {
        return this.f105816s;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: e */
    public InterfaceC29097e mo112582e() {
        Continuation continuation = this.f105816s;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: f */
    public boolean mo112547f() {
        return !(m112572B() instanceof NotCompleted);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        m112560S(this, CompletionStateKt.m112608c(obj, this), this.f105860r, null, 4, null);
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return this.f105817t;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: h */
    public Throwable mo112583h(Object obj) {
        Throwable mo112583h = super.mo112583h(obj);
        if (mo112583h == null) {
            return null;
        }
        return mo112583h;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: i */
    public Object mo112584i(Object obj) {
        if (obj instanceof CompletedContinuation) {
            return ((CompletedContinuation) obj).f105822a;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: j */
    public Object mo112548j(Throwable th2) {
        return m112563W(new CompletedExceptionally(th2, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: k */
    public void mo112549k(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
        DispatchedContinuation dispatchedContinuation;
        int i11;
        Continuation continuation = this.f105816s;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (continuation instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) continuation;
        } else {
            dispatchedContinuation = null;
        }
        CompletedExceptionally completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        if (dispatchedContinuation != null) {
            coroutineDispatcher2 = dispatchedContinuation.f107357s;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i11 = 4;
        } else {
            i11 = this.f105860r;
        }
        m112560S(this, completedExceptionally, i11, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: m */
    public Object mo112585m() {
        return m112572B();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: n */
    public boolean mo112550n(Throwable th2) {
        Object obj;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105814v;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z11 = false;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            if ((obj instanceof CancelHandler) || (obj instanceof Segment)) {
                z11 = true;
            }
        } while (!AbstractC1246b.m5921a(f105814v, this, obj, new CancelledContinuation(this, th2, z11)));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            m112586p((CancelHandler) obj, th2);
        } else if (notCompleted instanceof Segment) {
            m112566r((Segment) obj, th2);
        }
        m112568u();
        m112569w(this.f105860r);
        return true;
    }

    /* renamed from: p */
    public final void m112586p(CancelHandler cancelHandler, Throwable th2) {
        try {
            cancelHandler.mo112519g(th2);
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.m112629a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* renamed from: q */
    public final void m112587q(InterfaceC18505l interfaceC18505l, Throwable th2) {
        try {
            interfaceC18505l.mo205i9(th2);
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.m112629a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    /* renamed from: t */
    public final void m112588t() {
        DisposableHandle m112570z = m112570z();
        if (m112570z == null) {
            return;
        }
        m112570z.dispose();
        f105815w.set(this, NonDisposableHandle.f105937p);
    }

    public String toString() {
        return mo112575M() + '(' + DebugStringsKt.m112649c(this.f105816s) + "){" + m112553E() + "}@" + DebugStringsKt.m112648b(this);
    }

    /* renamed from: x */
    public Throwable mo112589x(Job job) {
        return job.mo112732A();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: y */
    public void mo112551y(Object obj, InterfaceC18505l interfaceC18505l) {
        m112559Q(obj, this.f105860r, interfaceC18505l);
    }
}
