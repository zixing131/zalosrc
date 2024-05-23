package p342m6;

/* renamed from: m6.a0 */
/* loaded from: classes2.dex */
final class RunnableC22871a0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC22888j f111488p;

    /* renamed from: q */
    final /* synthetic */ C22873b0 f111489q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22871a0(C22873b0 c22873b0, AbstractC22888j abstractC22888j) {
        this.f111489q = c22873b0;
        this.f111488p = abstractC22888j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC22878e interfaceC22878e;
        InterfaceC22878e interfaceC22878e2;
        obj = this.f111489q.f111492b;
        synchronized (obj) {
            try {
                C22873b0 c22873b0 = this.f111489q;
                interfaceC22878e = c22873b0.f111493c;
                if (interfaceC22878e != null) {
                    interfaceC22878e2 = c22873b0.f111493c;
                    interfaceC22878e2.mo16804a(this.f111488p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
