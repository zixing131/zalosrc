package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC1246b;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import wm0.InterfaceC29097e;

/* loaded from: classes.dex */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements InterfaceC29097e, Continuation<T> {

    /* renamed from: w */
    private static final AtomicReferenceFieldUpdater f107356w = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: s */
    public final CoroutineDispatcher f107357s;

    /* renamed from: t */
    public final Continuation f107358t;

    /* renamed from: u */
    public Object f107359u;

    /* renamed from: v */
    public final Object f107360v;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        super(-1);
        Symbol symbol;
        this.f107357s = coroutineDispatcher;
        this.f107358t = continuation;
        symbol = DispatchedContinuationKt.f107361a;
        this.f107359u = symbol;
        this.f107360v = ThreadContextKt.m113730b(getContext());
    }

    /* renamed from: r */
    private final CancellableContinuationImpl m113603r() {
        Object obj = f107356w.get(this);
        if (obj instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) obj;
        }
        return null;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: C */
    public StackTraceElement mo112573C() {
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: a */
    public void mo112579a(Object obj, Throwable th2) {
        if (obj instanceof CompletedWithCancellation) {
            ((CompletedWithCancellation) obj).f105830b.mo205i9(th2);
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: d */
    public Continuation mo112581d() {
        return this;
    }

    @Override // wm0.InterfaceC29097e
    /* renamed from: e */
    public InterfaceC29097e mo112582e() {
        Continuation continuation = this.f107358t;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: g */
    public void mo112492g(Object obj) {
        InterfaceC27315f context = this.f107358t.getContext();
        Object m112609d = CompletionStateKt.m112609d(obj, null, 1, null);
        if (this.f107357s.mo9278E0(context)) {
            this.f107359u = m112609d;
            this.f105860r = 0;
            this.f107357s.mo9279z0(context, this);
            return;
        }
        EventLoop m112869b = ThreadLocalEventLoop.f105943a.m112869b();
        if (m112869b.m112691N0()) {
            this.f107359u = m112609d;
            this.f105860r = 0;
            m112869b.m112688J0(this);
            return;
        }
        m112869b.m112690L0(true);
        try {
            InterfaceC27315f context2 = getContext();
            Object m113731c = ThreadContextKt.m113731c(context2, this.f107360v);
            try {
                this.f107358t.mo112492g(obj);
                C24848g0 c24848g0 = C24848g0.f119245a;
                do {
                } while (m112869b.m112694Q0());
            } finally {
                ThreadContextKt.m113729a(context2, m113731c);
            }
        } catch (Throwable th2) {
            try {
                m112673l(th2, null);
            } finally {
                m112869b.m112687G0(true);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        return this.f107358t.getContext();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: m */
    public Object mo112585m() {
        Symbol symbol;
        Object obj = this.f107359u;
        symbol = DispatchedContinuationKt.f107361a;
        this.f107359u = symbol;
        return obj;
    }

    /* renamed from: o */
    public final void m113604o() {
        do {
        } while (f107356w.get(this) == DispatchedContinuationKt.f107362b);
    }

    /* renamed from: p */
    public final CancellableContinuationImpl m113605p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107356w;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f107356w.set(this, DispatchedContinuationKt.f107362b);
                return null;
            }
            if (obj instanceof CancellableContinuationImpl) {
                if (AbstractC1246b.m5921a(f107356w, this, obj, DispatchedContinuationKt.f107362b)) {
                    return (CancellableContinuationImpl) obj;
                }
            } else if (obj != DispatchedContinuationKt.f107362b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: q */
    public final void m113606q(InterfaceC27315f interfaceC27315f, Object obj) {
        this.f107359u = obj;
        this.f105860r = 1;
        this.f107357s.mo112622D0(interfaceC27315f, this);
    }

    /* renamed from: s */
    public final boolean m113607s() {
        if (f107356w.get(this) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m113608t(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107356w;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.f107362b;
            if (AbstractC19074t.m100204b(obj, symbol)) {
                if (AbstractC1246b.m5921a(f107356w, this, symbol, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC1246b.m5921a(f107356w, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f107357s + ", " + DebugStringsKt.m112649c(this.f107358t) + ']';
    }

    /* renamed from: u */
    public final void m113609u() {
        m113604o();
        CancellableContinuationImpl m113603r = m113603r();
        if (m113603r != null) {
            m113603r.m112588t();
        }
    }

    /* renamed from: w */
    public final Throwable m113610w(CancellableContinuation cancellableContinuation) {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107356w;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = DispatchedContinuationKt.f107362b;
            if (obj != symbol) {
                if (obj instanceof Throwable) {
                    if (AbstractC1246b.m5921a(f107356w, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC1246b.m5921a(f107356w, this, symbol, cancellableContinuation));
        return null;
    }
}
