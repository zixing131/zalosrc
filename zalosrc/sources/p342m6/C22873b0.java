package p342m6;

import java.util.concurrent.Executor;

/* renamed from: m6.b0 */
/* loaded from: classes2.dex */
final class C22873b0 implements InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111491a;

    /* renamed from: b */
    private final Object f111492b = new Object();

    /* renamed from: c */
    private InterfaceC22878e f111493c;

    public C22873b0(Executor executor, InterfaceC22878e interfaceC22878e) {
        this.f111491a = executor;
        this.f111493c = interfaceC22878e;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        synchronized (this.f111492b) {
            try {
                if (this.f111493c == null) {
                    return;
                }
                this.f111491a.execute(new RunnableC22871a0(this, abstractC22888j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
