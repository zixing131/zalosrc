package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import kotlinx.coroutines.CancellableContinuation;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* loaded from: classes2.dex */
public final class C1753xfdb59cc4 implements InterfaceC1795t {

    /* renamed from: p */
    final /* synthetic */ AbstractC1785o.b f7284p;

    /* renamed from: q */
    final /* synthetic */ AbstractC1785o f7285q;

    /* renamed from: r */
    final /* synthetic */ CancellableContinuation f7286r;

    /* renamed from: s */
    final /* synthetic */ InterfaceC18494a f7287s;

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        Object m129218b;
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        if (aVar == AbstractC1785o.a.Companion.m9343c(this.f7284p)) {
            this.f7285q.mo9338d(this);
            CancellableContinuation cancellableContinuation = this.f7286r;
            InterfaceC18494a interfaceC18494a = this.f7287s;
            try {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(interfaceC18494a.mo12V4());
            } catch (Throwable th2) {
                C24861r.a aVar3 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            cancellableContinuation.mo112492g(m129218b);
            return;
        }
        if (aVar == AbstractC1785o.a.ON_DESTROY) {
            this.f7285q.mo9338d(this);
            CancellableContinuation cancellableContinuation2 = this.f7286r;
            C24861r.a aVar4 = C24861r.f119264q;
            cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new LifecycleDestroyedException())));
        }
    }
}
