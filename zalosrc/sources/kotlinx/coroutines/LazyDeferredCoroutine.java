package kotlinx.coroutines;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.CancellableKt;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class LazyDeferredCoroutine<T> extends DeferredCoroutine<T> {

    /* renamed from: s */
    private final Continuation f105934s;

    public LazyDeferredCoroutine(InterfaceC27315f interfaceC27315f, InterfaceC18509p interfaceC18509p) {
        super(interfaceC27315f, false);
        Continuation m142574a;
        m142574a = AbstractC28297c.m142574a(interfaceC18509p, this, this);
        this.f105934s = m142574a;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: Z0 */
    protected void mo112822Z0() {
        CancellableKt.m113753c(this.f105934s, this);
    }
}
