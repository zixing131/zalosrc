package p342m6;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.f0 */
/* loaded from: classes.dex */
public final class C22881f0 implements InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111501a;

    /* renamed from: b */
    private final Object f111502b = new Object();

    /* renamed from: c */
    private InterfaceC22882g f111503c;

    public C22881f0(Executor executor, InterfaceC22882g interfaceC22882g) {
        this.f111501a = executor;
        this.f111503c = interfaceC22882g;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            synchronized (this.f111502b) {
                try {
                    if (this.f111503c == null) {
                        return;
                    }
                    this.f111501a.execute(new RunnableC22879e0(this, abstractC22888j));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
