package kotlinx.coroutines.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import kotlinx.coroutines.ThreadContextElement;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
final class ThreadContextKt$findOne$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final ThreadContextKt$findOne$1 f107427q = new ThreadContextKt$findOne$1();

    ThreadContextKt$findOne$1() {
        super(2);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ThreadContextElement mo240pC(ThreadContextElement threadContextElement, InterfaceC27315f.b bVar) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (bVar instanceof ThreadContextElement) {
            return (ThreadContextElement) bVar;
        }
        return null;
    }
}
