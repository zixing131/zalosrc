package androidx.lifecycle;

import fn0.AbstractC19074t;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import um0.InterfaceC27315f;

/* renamed from: androidx.lifecycle.f0 */
/* loaded from: classes2.dex */
public final class C1768f0 extends CoroutineDispatcher {

    /* renamed from: r */
    public final C1771h f7306r = new C1771h();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: E0 */
    public boolean mo9278E0(InterfaceC27315f interfaceC27315f) {
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        if (Dispatchers.m112681c().mo112861G0().mo9278E0(interfaceC27315f)) {
            return true;
        }
        return !this.f7306r.m9286b();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: z0 */
    public void mo9279z0(InterfaceC27315f interfaceC27315f, Runnable runnable) {
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        AbstractC19074t.m100208f(runnable, "block");
        this.f7306r.m9287c(interfaceC27315f, runnable);
    }
}
