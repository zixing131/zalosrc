package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes7.dex */
final /* synthetic */ class JobKt__FutureKt {
    /* renamed from: a */
    public static final void m112761a(CancellableContinuation cancellableContinuation, Future future) {
        cancellableContinuation.mo112543I(new CancelFutureOnCancel(future));
    }
}
