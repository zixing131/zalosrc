package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {

    /* renamed from: t */
    public final long f105950t;

    public TimeoutCoroutine(long j11, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.f105950t = j11;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    /* renamed from: R0 */
    public String mo112494R0() {
        return super.mo112494R0() + "(timeMillis=" + this.f105950t + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m112830k0(TimeoutKt.m112876a(this.f105950t, DelayKt.m112667c(getContext()), this));
    }
}
