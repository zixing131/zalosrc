package kotlinx.coroutines.sync;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SemaphoreImpl$onCancellationRelease$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ SemaphoreImpl f107604q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemaphoreImpl$onCancellationRelease$1(SemaphoreImpl semaphoreImpl) {
        super(1);
        this.f107604q = semaphoreImpl;
    }

    /* renamed from: a */
    public final void m113928a(Throwable th2) {
        this.f107604q.release();
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113928a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
