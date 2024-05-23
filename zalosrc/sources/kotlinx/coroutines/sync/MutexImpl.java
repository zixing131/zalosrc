package kotlinx.coroutines.sync;

import com.google.android.gms.internal.ads.ya3;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public class MutexImpl extends SemaphoreImpl implements Mutex {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f107572i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner");

    /* renamed from: h */
    private final InterfaceC18510q f107573h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public final class CancellableContinuationWithOwner implements CancellableContinuation<C24848g0>, Waiter {

        /* renamed from: p */
        public final CancellableContinuationImpl f107574p;

        /* renamed from: q */
        public final Object f107575q;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl, Object obj) {
            this.f107574p = cancellableContinuationImpl;
            this.f107575q = obj;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: I */
        public void mo112543I(InterfaceC18505l interfaceC18505l) {
            this.f107574p.mo112543I(interfaceC18505l);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: U */
        public void mo112545U(Object obj) {
            this.f107574p.mo112545U(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo112551y(C24848g0 c24848g0, InterfaceC18505l interfaceC18505l) {
            MutexImpl.f107572i.set(MutexImpl.this, this.f107575q);
            this.f107574p.mo112551y(c24848g0, new MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl.this, this));
        }

        @Override // kotlinx.coroutines.Waiter
        /* renamed from: b */
        public void mo112580b(Segment segment, int i11) {
            this.f107574p.mo112580b(segment, i11);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: c */
        public boolean mo112546c() {
            return this.f107574p.mo112546c();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo112542D(CoroutineDispatcher coroutineDispatcher, C24848g0 c24848g0) {
            this.f107574p.mo112542D(coroutineDispatcher, c24848g0);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object mo112544R(C24848g0 c24848g0, Object obj, InterfaceC18505l interfaceC18505l) {
            Object mo112544R = this.f107574p.mo112544R(c24848g0, obj, new MutexImpl$CancellableContinuationWithOwner$tryResume$token$1(MutexImpl.this, this));
            if (mo112544R != null) {
                MutexImpl.f107572i.set(MutexImpl.this, this.f107575q);
            }
            return mo112544R;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: f */
        public boolean mo112547f() {
            return this.f107574p.mo112547f();
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: g */
        public void mo112492g(Object obj) {
            this.f107574p.mo112492g(obj);
        }

        @Override // kotlin.coroutines.Continuation
        public InterfaceC27315f getContext() {
            return this.f107574p.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: j */
        public Object mo112548j(Throwable th2) {
            return this.f107574p.mo112548j(th2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: k */
        public void mo112549k(CoroutineDispatcher coroutineDispatcher, Throwable th2) {
            this.f107574p.mo112549k(coroutineDispatcher, th2);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* renamed from: n */
        public boolean mo112550n(Throwable th2) {
            return this.f107574p.mo112550n(th2);
        }
    }

    /* loaded from: classes7.dex */
    private final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {

        /* renamed from: p */
        public final SelectInstanceInternal f107581p;

        /* renamed from: q */
        public final Object f107582q;

        public SelectInstanceWithOwner(SelectInstanceInternal selectInstanceInternal, Object obj) {
            this.f107581p = selectInstanceInternal;
            this.f107582q = obj;
        }

        @Override // kotlinx.coroutines.Waiter
        /* renamed from: b */
        public void mo112580b(Segment segment, int i11) {
            this.f107581p.mo112580b(segment, i11);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        /* renamed from: d */
        public void mo113855d(Object obj) {
            MutexImpl.f107572i.set(MutexImpl.this, this.f107582q);
            this.f107581p.mo113855d(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        /* renamed from: e */
        public void mo113856e(DisposableHandle disposableHandle) {
            this.f107581p.mo113856e(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        /* renamed from: f */
        public boolean mo113857f(Object obj, Object obj2) {
            boolean mo113857f = this.f107581p.mo113857f(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (mo113857f) {
                MutexImpl.f107572i.set(mutexImpl, this.f107582q);
            }
            return mo113857f;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public InterfaceC27315f getContext() {
            return this.f107581p.getContext();
        }
    }

    public MutexImpl(boolean z11) {
        super(1, z11 ? 1 : 0);
        Symbol symbol;
        if (!z11) {
            symbol = MutexKt.f107589a;
        } else {
            symbol = null;
        }
        this.owner = symbol;
        this.f107573h = new MutexImpl$onSelectCancellationUnlockConstructor$1(this);
    }

    /* renamed from: s */
    static /* synthetic */ Object m113892s(MutexImpl mutexImpl, Object obj, Continuation continuation) {
        Object m142578e;
        if (mutexImpl.m113899w(obj)) {
            return C24848g0.f119245a;
        }
        Object m113893t = mutexImpl.m113893t(obj, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113893t == m142578e) {
            return m113893t;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: t */
    private final Object m113893t(Object obj, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl m112591b = CancellableContinuationKt.m112591b(m142576c);
        try {
            m113923e(new CancellableContinuationWithOwner(m112591b, obj));
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

    /* renamed from: x */
    private final int m113894x(Object obj) {
        while (!m113926m()) {
            if (obj != null) {
                if (m113895q(obj)) {
                    return 2;
                }
                if (m113896r()) {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        f107572i.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* renamed from: b */
    public Object mo113889b(Object obj, Continuation continuation) {
        return m113892s(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    /* renamed from: c */
    public void mo113890c(Object obj) {
        Symbol symbol;
        Symbol symbol2;
        while (m113896r()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107572i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            symbol = MutexKt.f107589a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    symbol2 = MutexKt.f107589a;
                    if (ya3.m28173a(atomicReferenceFieldUpdater, this, obj2, symbol2)) {
                        release();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    /* renamed from: q */
    public boolean m113895q(Object obj) {
        Symbol symbol;
        while (m113896r()) {
            Object obj2 = f107572i.get(this);
            symbol = MutexKt.f107589a;
            if (obj2 != symbol) {
                if (obj2 != obj) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean m113896r() {
        if (m113924k() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.m112648b(this) + "[isLocked=" + m113896r() + ",owner=" + f107572i.get(this) + ']';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public Object m113897u(Object obj, Object obj2) {
        Symbol symbol;
        symbol = MutexKt.f107590b;
        if (!AbstractC19074t.m100204b(obj2, symbol)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public void m113898v(SelectInstance selectInstance, Object obj) {
        Symbol symbol;
        if (obj != null && m113895q(obj)) {
            symbol = MutexKt.f107590b;
            selectInstance.mo113855d(symbol);
        } else {
            AbstractC19074t.m100206d(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            m113925l(new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj), obj);
        }
    }

    /* renamed from: w */
    public boolean m113899w(Object obj) {
        int m113894x = m113894x(obj);
        if (m113894x == 0) {
            return true;
        }
        if (m113894x != 1) {
            if (m113894x != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }
}
