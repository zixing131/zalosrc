package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import pm0.AbstractC24845f;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class CoroutineExceptionHandlerImpl_commonKt {
    /* renamed from: a */
    public static final void m113602a(InterfaceC27315f interfaceC27315f, Throwable th2) {
        Iterator it = CoroutineExceptionHandlerImplKt.m113600a().iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).mo35525G(interfaceC27315f, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                CoroutineExceptionHandlerImplKt.m113601b(CoroutineExceptionHandlerKt.m112630b(th2, th3));
            }
        }
        try {
            AbstractC24845f.m129182a(th2, new DiagnosticCoroutineContextException(interfaceC27315f));
        } catch (Throwable unused2) {
        }
        CoroutineExceptionHandlerImplKt.m113601b(th2);
    }
}
