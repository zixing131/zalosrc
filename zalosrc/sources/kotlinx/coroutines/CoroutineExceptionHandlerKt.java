package kotlinx.coroutines;

import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import pm0.AbstractC24845f;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class CoroutineExceptionHandlerKt {
    /* renamed from: a */
    public static final void m112629a(InterfaceC27315f interfaceC27315f, Throwable th2) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC27315f.mo112624d(CoroutineExceptionHandler.f105837l);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.mo35525G(interfaceC27315f, th2);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.m113602a(interfaceC27315f, th2);
            }
        } catch (Throwable th3) {
            CoroutineExceptionHandlerImpl_commonKt.m113602a(interfaceC27315f, m112630b(th2, th3));
        }
    }

    /* renamed from: b */
    public static final Throwable m112630b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        AbstractC24845f.m129182a(runtimeException, th2);
        return runtimeException;
    }
}
