package kotlinx.coroutines;

import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class Unconfined extends CoroutineDispatcher {

    /* renamed from: r */
    public static final Unconfined f105956r = new Unconfined();

    private Unconfined() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: E0 */
    public boolean mo9278E0(InterfaceC27315f interfaceC27315f) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: F0 */
    public CoroutineDispatcher mo112623F0(int i11) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        YieldContext yieldContext = (YieldContext) interfaceC27315f.mo112624d(YieldContext.f105959r);
        if (yieldContext != null) {
            yieldContext.f105960q = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
