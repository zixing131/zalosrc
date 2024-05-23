package p051c7;

import java.util.concurrent.atomic.AtomicInteger;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c7.x */
/* loaded from: classes3.dex */
public final class C3329x extends AbstractRunnableC3326u {

    /* renamed from: q */
    final /* synthetic */ C22890k f14147q;

    /* renamed from: r */
    final /* synthetic */ AbstractRunnableC3326u f14148r;

    /* renamed from: s */
    final /* synthetic */ C3309e0 f14149s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3329x(C3309e0 c3309e0, C22890k c22890k, C22890k c22890k2, AbstractRunnableC3326u abstractRunnableC3326u) {
        super(c22890k);
        this.f14149s = c3309e0;
        this.f14147q = c22890k2;
        this.f14148r = abstractRunnableC3326u;
    }

    @Override // p051c7.AbstractRunnableC3326u
    /* renamed from: a */
    public final void mo16750a() {
        Object obj;
        AtomicInteger atomicInteger;
        C3325t c3325t;
        obj = this.f14149s.f14121f;
        synchronized (obj) {
            try {
                C3309e0.m16766n(this.f14149s, this.f14147q);
                atomicInteger = this.f14149s.f14126k;
                if (atomicInteger.getAndIncrement() > 0) {
                    c3325t = this.f14149s.f14117b;
                    c3325t.m16800d("Already connected to the service.", new Object[0]);
                }
                C3309e0.m16768p(this.f14149s, this.f14148r);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
