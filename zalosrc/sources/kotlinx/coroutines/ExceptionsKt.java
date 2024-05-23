package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes7.dex */
public final class ExceptionsKt {
    /* renamed from: a */
    public static final CancellationException m112722a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}
