package p342m6;

import java.util.concurrent.Executor;

/* renamed from: m6.z */
/* loaded from: classes.dex */
final class C22910z implements InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111548a;

    /* renamed from: b */
    private final Object f111549b = new Object();

    /* renamed from: c */
    private InterfaceC22876d f111550c;

    public C22910z(Executor executor, InterfaceC22876d interfaceC22876d) {
        this.f111548a = executor;
        this.f111550c = interfaceC22876d;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117586o()) {
            synchronized (this.f111549b) {
                try {
                    if (this.f111550c == null) {
                        return;
                    }
                    this.f111548a.execute(new RunnableC22909y(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
