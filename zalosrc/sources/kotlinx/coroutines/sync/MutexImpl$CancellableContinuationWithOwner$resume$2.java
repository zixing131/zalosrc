package kotlinx.coroutines.sync;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import kotlinx.coroutines.sync.MutexImpl;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class MutexImpl$CancellableContinuationWithOwner$resume$2 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ MutexImpl f107577q;

    /* renamed from: r */
    final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f107578r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        super(1);
        this.f107577q = mutexImpl;
        this.f107578r = cancellableContinuationWithOwner;
    }

    /* renamed from: a */
    public final void m113903a(Throwable th2) {
        this.f107577q.mo113890c(this.f107578r.f107575q);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113903a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
