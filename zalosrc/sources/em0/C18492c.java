package em0;

import fn0.AbstractC19074t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p342m6.InterfaceC22876d;
import p342m6.InterfaceC22880f;
import p342m6.InterfaceC22882g;

/* renamed from: em0.c */
/* loaded from: classes7.dex */
public final class C18492c implements InterfaceC22882g, InterfaceC22880f, InterfaceC22876d {

    /* renamed from: a */
    private final CountDownLatch f93092a = new CountDownLatch(1);

    /* renamed from: a */
    public final void m97870a(long j11, TimeUnit timeUnit) {
        AbstractC19074t.m100208f(timeUnit, "timeUnit");
        this.f93092a.await(j11, timeUnit);
    }

    @Override // p342m6.InterfaceC22880f
    /* renamed from: b */
    public void mo839b(Exception exc) {
        AbstractC19074t.m100208f(exc, "p0");
        this.f93092a.countDown();
    }

    @Override // p342m6.InterfaceC22876d
    /* renamed from: l */
    public void mo34377l() {
        this.f93092a.countDown();
    }

    @Override // p342m6.InterfaceC22882g
    public void onSuccess(Object obj) {
        this.f93092a.countDown();
    }
}
