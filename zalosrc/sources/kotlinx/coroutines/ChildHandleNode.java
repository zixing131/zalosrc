package kotlinx.coroutines;

import pm0.C24848g0;

/* loaded from: classes.dex */
public final class ChildHandleNode extends JobCancellingNode implements ChildHandle {

    /* renamed from: t */
    public final ChildJob f105821t;

    public ChildHandleNode(ChildJob childJob) {
        this.f105821t = childJob;
    }

    @Override // kotlinx.coroutines.ChildHandle
    /* renamed from: d */
    public boolean mo112593d(Throwable th2) {
        return m112774s().mo112833q0(th2);
    }

    @Override // kotlinx.coroutines.ChildHandle
    public Job getParent() {
        return m112774s();
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        mo112514r((Throwable) obj);
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: r */
    public void mo112514r(Throwable th2) {
        this.f105821t.mo112594F(m112774s());
    }
}
