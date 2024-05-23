package p342m6;

/* renamed from: m6.e0 */
/* loaded from: classes.dex */
final class RunnableC22879e0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC22888j f111499p;

    /* renamed from: q */
    final /* synthetic */ C22881f0 f111500q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22879e0(C22881f0 c22881f0, AbstractC22888j abstractC22888j) {
        this.f111500q = c22881f0;
        this.f111499p = abstractC22888j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC22882g interfaceC22882g;
        InterfaceC22882g interfaceC22882g2;
        obj = this.f111500q.f111502b;
        synchronized (obj) {
            try {
                C22881f0 c22881f0 = this.f111500q;
                interfaceC22882g = c22881f0.f111503c;
                if (interfaceC22882g != null) {
                    interfaceC22882g2 = c22881f0.f111503c;
                    interfaceC22882g2.onSuccess(this.f111499p.mo117584m());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
