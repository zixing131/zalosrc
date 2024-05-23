package p342m6;

import java.util.concurrent.Executor;

/* renamed from: m6.d0 */
/* loaded from: classes.dex */
final class C22877d0 implements InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111496a;

    /* renamed from: b */
    private final Object f111497b = new Object();

    /* renamed from: c */
    private InterfaceC22880f f111498c;

    public C22877d0(Executor executor, InterfaceC22880f interfaceC22880f) {
        this.f111496a = executor;
        this.f111498c = interfaceC22880f;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        if (!abstractC22888j.mo117588q() && !abstractC22888j.mo117586o()) {
            synchronized (this.f111497b) {
                try {
                    if (this.f111498c == null) {
                        return;
                    }
                    this.f111496a.execute(new RunnableC22875c0(this, abstractC22888j));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
