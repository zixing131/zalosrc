package p291k7;

import java.util.concurrent.atomic.AtomicInteger;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.u1 */
/* loaded from: classes3.dex */
public final class C21548u1 extends AbstractRunnableC21539r1 {

    /* renamed from: q */
    final /* synthetic */ C22890k f104580q;

    /* renamed from: r */
    final /* synthetic */ AbstractRunnableC21539r1 f104581r;

    /* renamed from: s */
    final /* synthetic */ C21504g f104582s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21548u1(C21504g c21504g, C22890k c22890k, C22890k c22890k2, AbstractRunnableC21539r1 abstractRunnableC21539r1) {
        super(c22890k);
        this.f104582s = c21504g;
        this.f104580q = c22890k2;
        this.f104581r = abstractRunnableC21539r1;
    }

    @Override // p291k7.AbstractRunnableC21539r1
    /* renamed from: c */
    public final void mo109504c() {
        Object obj;
        AtomicInteger atomicInteger;
        C21536q1 c21536q1;
        obj = this.f104582s.f104535f;
        synchronized (obj) {
            try {
                C21504g.m111141n(this.f104582s, this.f104580q);
                atomicInteger = this.f104582s.f104540k;
                if (atomicInteger.getAndIncrement() > 0) {
                    c21536q1 = this.f104582s.f104531b;
                    c21536q1.m111197d("Already connected to the service.", new Object[0]);
                }
                C21504g.m111143p(this.f104582s, this.f104581r);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
