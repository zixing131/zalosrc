package ol0;

import ag0.InterfaceC0806b1;
import ho0.AbstractC20110a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ol0.b */
/* loaded from: classes7.dex */
public final class C24304b implements InterfaceC24305c {

    /* renamed from: a */
    private final int f117377a;

    /* renamed from: b */
    private final InterfaceC0806b1 f117378b;

    /* renamed from: c */
    private final BlockingQueue f117379c = new LinkedBlockingQueue();

    /* renamed from: d */
    private final AtomicInteger f117380d = new AtomicInteger(0);

    public C24304b(int i11, InterfaceC0806b1 interfaceC0806b1) {
        this.f117377a = i11;
        this.f117378b = interfaceC0806b1;
    }

    /* renamed from: d */
    private void m126930d() {
        final Runnable runnable = (Runnable) this.f117379c.poll();
        if (runnable == null) {
            return;
        }
        this.f117380d.incrementAndGet();
        this.f117378b.mo2040a(new Runnable() { // from class: ol0.a
            @Override // java.lang.Runnable
            public final void run() {
                C24304b.this.m126931e(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m126931e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e11) {
            AbstractC20110a.m104546o(e11);
        }
        if (this.f117380d.decrementAndGet() < this.f117377a) {
            m126930d();
        }
    }

    @Override // ol0.InterfaceC24305c
    /* renamed from: a */
    public boolean mo126932a(Runnable runnable) {
        return this.f117379c.remove(runnable);
    }

    @Override // ol0.InterfaceC24305c
    /* renamed from: b */
    public void mo126933b(Runnable runnable) {
        if (runnable != null && this.f117379c.offer(runnable) && this.f117380d.get() < this.f117377a) {
            m126930d();
        }
    }
}
