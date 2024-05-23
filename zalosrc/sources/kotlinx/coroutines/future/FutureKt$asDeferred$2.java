package kotlinx.coroutines.future;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import java.util.concurrent.CompletionException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import pm0.C24848g0;
import um0.C27316g;

/* loaded from: classes7.dex */
final class FutureKt$asDeferred$2 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    final /* synthetic */ CompletableDeferred f107342q;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:            r0 = r0.getCause();     */
    @Override // en0.InterfaceC18509p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo240pC(Object obj, Throwable th2) {
        CompletionException completionException;
        boolean mo112595L;
        Throwable cause;
        try {
            if (th2 == null) {
                mo112595L = this.f107342q.mo112596N(obj);
            } else {
                CompletableDeferred completableDeferred = this.f107342q;
                if (AbstractC21870c.m113576a(th2)) {
                    completionException = AbstractC21871d.m113577a(th2);
                } else {
                    completionException = null;
                }
                if (completionException != null && cause != null) {
                    th2 = cause;
                }
                mo112595L = completableDeferred.mo112595L(th2);
            }
            return Boolean.valueOf(mo112595L);
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.m112629a(C27316g.f128559p, th3);
            return C24848g0.f119245a;
        }
    }
}
