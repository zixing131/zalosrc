package kotlinx.coroutines.flow;

import com.google.android.gms.internal.ads.ya3;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Symbol;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f107172a = AtomicReferenceFieldUpdater.newUpdater(StateFlowSlot.class, Object.class, "_state");
    private volatile Object _state;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo113484a(StateFlowImpl stateFlowImpl) {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107172a;
        if (atomicReferenceFieldUpdater.get(this) == null) {
            symbol = StateFlowKt.f107170a;
            atomicReferenceFieldUpdater.set(this, symbol);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final Object m113509e(Continuation continuation) {
        Continuation m142576c;
        Symbol symbol;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107172a;
        symbol = StateFlowKt.f107170a;
        if (!ya3.m28173a(atomicReferenceFieldUpdater, this, symbol, cancellableContinuationImpl)) {
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuationImpl.mo112492g(C24861r.m129218b(C24848g0.f119245a));
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

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation[] mo113485b(StateFlowImpl stateFlowImpl) {
        f107172a.set(this, null);
        return AbstractSharedFlowKt.f107191a;
    }

    /* renamed from: g */
    public final void m113511g() {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107172a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                symbol = StateFlowKt.f107171b;
                if (obj != symbol) {
                    symbol2 = StateFlowKt.f107170a;
                    if (obj == symbol2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f107172a;
                        symbol3 = StateFlowKt.f107171b;
                        if (ya3.m28173a(atomicReferenceFieldUpdater2, this, obj, symbol3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f107172a;
                        symbol4 = StateFlowKt.f107170a;
                        if (ya3.m28173a(atomicReferenceFieldUpdater3, this, obj, symbol4)) {
                            C24861r.a aVar = C24861r.f119264q;
                            ((CancellableContinuationImpl) obj).mo112492g(C24861r.m129218b(C24848g0.f119245a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean m113512h() {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f107172a;
        symbol = StateFlowKt.f107170a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, symbol);
        AbstractC19074t.m100205c(andSet);
        symbol2 = StateFlowKt.f107171b;
        if (andSet == symbol2) {
            return true;
        }
        return false;
    }
}
