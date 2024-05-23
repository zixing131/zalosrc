package androidx.work;

import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* renamed from: androidx.work.r */
/* loaded from: classes2.dex */
public final class RunnableC2250r implements Runnable {

    /* renamed from: p */
    final /* synthetic */ CancellableContinuation f9463p;

    /* renamed from: q */
    final /* synthetic */ InterfaceFutureC6534a f9464q;

    public RunnableC2250r(CancellableContinuation cancellableContinuation, InterfaceFutureC6534a interfaceFutureC6534a) {
        this.f9463p = cancellableContinuation;
        this.f9464q = interfaceFutureC6534a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CancellableContinuation cancellableContinuation = this.f9463p;
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuation.mo112492g(C24861r.m129218b(this.f9464q.get()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.f9463p.mo112550n(cause);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f9463p;
            C24861r.a aVar2 = C24861r.f119264q;
            cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(cause)));
        }
    }
}
