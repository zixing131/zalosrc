package kotlinx.coroutines.internal;

import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: p */
    private final transient InterfaceC27315f f107355p;

    public DiagnosticCoroutineContextException(InterfaceC27315f interfaceC27315f) {
        this.f107355p = interfaceC27315f;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f107355p.toString();
    }
}
