package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes7.dex */
public final class CancellableContinuationKt {
    /* renamed from: a */
    public static final void m112590a(CancellableContinuation cancellableContinuation, DisposableHandle disposableHandle) {
        cancellableContinuation.mo112543I(new DisposeOnCancel(disposableHandle));
    }

    /* renamed from: b */
    public static final CancellableContinuationImpl m112591b(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(continuation, 1);
        }
        CancellableContinuationImpl m113605p = ((DispatchedContinuation) continuation).m113605p();
        if (m113605p != null) {
            if (!m113605p.m112578P()) {
                m113605p = null;
            }
            if (m113605p != null) {
                return m113605p;
            }
        }
        return new CancellableContinuationImpl(continuation, 2);
    }
}
