package kotlinx.coroutines.tasks;

import kotlinx.coroutines.CancellableContinuation;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22878e;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes7.dex */
final class TasksKt$awaitImpl$2$1<TResult> implements InterfaceC22878e {

    /* renamed from: a */
    final /* synthetic */ CancellableContinuation f107623a;

    @Override // p342m6.InterfaceC22878e
    /* renamed from: a */
    public final void mo16804a(AbstractC22888j abstractC22888j) {
        Exception mo117583l = abstractC22888j.mo117583l();
        if (mo117583l == null) {
            if (abstractC22888j.mo117586o()) {
                CancellableContinuation.DefaultImpls.m112552a(this.f107623a, null, 1, null);
                return;
            }
            CancellableContinuation cancellableContinuation = this.f107623a;
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuation.mo112492g(C24861r.m129218b(abstractC22888j.mo117584m()));
            return;
        }
        CancellableContinuation cancellableContinuation2 = this.f107623a;
        C24861r.a aVar2 = C24861r.f119264q;
        cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(mo117583l)));
    }
}
