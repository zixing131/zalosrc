package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.coroutines.Continuation;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class JobKt {
    /* renamed from: a */
    public static final CompletableJob m112748a(Job job) {
        return JobKt__JobKt.m112762a(job);
    }

    /* renamed from: c */
    public static final void m112750c(InterfaceC27315f interfaceC27315f, CancellationException cancellationException) {
        JobKt__JobKt.m112764c(interfaceC27315f, cancellationException);
    }

    /* renamed from: e */
    public static final Object m112752e(Job job, Continuation continuation) {
        return JobKt__JobKt.m112766e(job, continuation);
    }

    /* renamed from: f */
    public static final void m112753f(InterfaceC27315f interfaceC27315f, CancellationException cancellationException) {
        JobKt__JobKt.m112767f(interfaceC27315f, cancellationException);
    }

    /* renamed from: h */
    public static final void m112755h(CancellableContinuation cancellableContinuation, Future future) {
        JobKt__FutureKt.m112761a(cancellableContinuation, future);
    }

    /* renamed from: i */
    public static final DisposableHandle m112756i(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.m112769h(job, disposableHandle);
    }

    /* renamed from: j */
    public static final void m112757j(Job job) {
        JobKt__JobKt.m112770i(job);
    }

    /* renamed from: k */
    public static final void m112758k(InterfaceC27315f interfaceC27315f) {
        JobKt__JobKt.m112771j(interfaceC27315f);
    }

    /* renamed from: l */
    public static final Job m112759l(InterfaceC27315f interfaceC27315f) {
        return JobKt__JobKt.m112772k(interfaceC27315f);
    }

    /* renamed from: m */
    public static final boolean m112760m(InterfaceC27315f interfaceC27315f) {
        return JobKt__JobKt.m112773l(interfaceC27315f);
    }
}
