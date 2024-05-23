package kotlinx.coroutines.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import kotlinx.coroutines.ThreadContextElement;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
final class ThreadContextKt$updateState$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final ThreadContextKt$updateState$1 f107428q = new ThreadContextKt$updateState$1();

    ThreadContextKt$updateState$1() {
        super(2);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ThreadState mo240pC(ThreadState threadState, InterfaceC27315f.b bVar) {
        if (bVar instanceof ThreadContextElement) {
            ThreadContextElement threadContextElement = (ThreadContextElement) bVar;
            threadState.m113749a(threadContextElement, threadContextElement.mo112634Z(threadState.f107435a));
        }
        return threadState;
    }
}
