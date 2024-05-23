package p342m6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: m6.q */
/* loaded from: classes.dex */
final class C22901q implements InterfaceC22902r {

    /* renamed from: a */
    private final CountDownLatch f111527a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C22901q(AbstractC22900p abstractC22900p) {
    }

    /* renamed from: a */
    public final void m117620a() {
        this.f111527a.await();
    }

    @Override // p342m6.InterfaceC22880f
    /* renamed from: b */
    public final void mo839b(Exception exc) {
        this.f111527a.countDown();
    }

    /* renamed from: c */
    public final boolean m117621c(long j11, TimeUnit timeUnit) {
        return this.f111527a.await(j11, timeUnit);
    }

    @Override // p342m6.InterfaceC22876d
    /* renamed from: l */
    public final void mo34377l() {
        this.f111527a.countDown();
    }

    @Override // p342m6.InterfaceC22882g
    public final void onSuccess(Object obj) {
        this.f111527a.countDown();
    }
}
