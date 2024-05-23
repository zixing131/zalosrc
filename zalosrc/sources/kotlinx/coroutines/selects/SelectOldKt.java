package kotlinx.coroutines.selects;

import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes7.dex */
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m113879c(CancellableContinuation cancellableContinuation, Object obj) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().mo112624d(CoroutineDispatcher.f105835q);
        if (coroutineDispatcher != null) {
            cancellableContinuation.mo112542D(coroutineDispatcher, obj);
        } else {
            cancellableContinuation.mo112492g(C24861r.m129218b(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m113880d(CancellableContinuation cancellableContinuation, Throwable th2) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().mo112624d(CoroutineDispatcher.f105835q);
        if (coroutineDispatcher != null) {
            cancellableContinuation.mo112549k(coroutineDispatcher, th2);
        } else {
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
        }
    }
}
