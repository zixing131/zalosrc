package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(InterfaceC27315f interfaceC27315f, boolean z11) {
        super(interfaceC27315f, true, z11);
    }

    /* renamed from: t1 */
    static /* synthetic */ Object m112662t1(DeferredCoroutine deferredCoroutine, Continuation continuation) {
        Object m112828i0 = deferredCoroutine.m112828i0(continuation);
        AbstractC28298d.m142578e();
        return m112828i0;
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: E */
    public Object mo112598E(Continuation continuation) {
        return m112662t1(this, continuation);
    }

    @Override // kotlinx.coroutines.Deferred
    /* renamed from: r */
    public Object mo112599r() {
        return m112835z0();
    }
}
