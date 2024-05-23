package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExceptionsKt;

/* loaded from: classes7.dex */
class ActorCoroutine<E> extends ChannelCoroutine<E> implements ActorScope<E> {
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: H0 */
    protected boolean mo112816H0(Throwable th2) {
        CoroutineExceptionHandlerKt.m112629a(getContext(), th2);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: X0 */
    protected void mo112821X0(Throwable th2) {
        Channel m113076u1 = m113076u1();
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = ExceptionsKt.m112722a(DebugStringsKt.m112647a(this) + " was cancelled", th2);
            }
        }
        m113076u1.mo113009a(cancellationException);
    }
}
