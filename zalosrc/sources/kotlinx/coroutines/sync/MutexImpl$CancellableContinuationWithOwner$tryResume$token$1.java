package kotlinx.coroutines.sync;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import kotlinx.coroutines.sync.MutexImpl;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class MutexImpl$CancellableContinuationWithOwner$tryResume$token$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ MutexImpl f107579q;

    /* renamed from: r */
    final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f107580r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$CancellableContinuationWithOwner$tryResume$token$1(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        super(1);
        this.f107579q = mutexImpl;
        this.f107580r = cancellableContinuationWithOwner;
    }

    /* renamed from: a */
    public final void m113904a(Throwable th2) {
        MutexImpl.f107572i.set(this.f107579q, this.f107580r.f107575q);
        this.f107579q.mo113890c(this.f107580r.f107575q);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113904a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
