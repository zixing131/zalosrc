package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;

/* loaded from: classes7.dex */
final class ContinuationHandler<T> implements BiFunction<T, Throwable, C24848g0> {
    public volatile Continuation<? super T> cont;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            r2 = r2.getCause();     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m113569a(Object obj, Throwable th2) {
        CompletionException completionException;
        Throwable cause;
        Continuation<? super T> continuation = this.cont;
        if (continuation == null) {
            return;
        }
        if (th2 == null) {
            continuation.mo112492g(C24861r.m129218b(obj));
            return;
        }
        if (AbstractC21870c.m113576a(th2)) {
            completionException = AbstractC21871d.m113577a(th2);
        } else {
            completionException = null;
        }
        if (completionException != null && cause != null) {
            th2 = cause;
        }
        C24861r.a aVar = C24861r.f119264q;
        continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(th2)));
    }

    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ C24848g0 apply(Object obj, Throwable th2) {
        m113569a(obj, th2);
        return C24848g0.f119245a;
    }
}
