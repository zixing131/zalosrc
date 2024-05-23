package p342m6;

/* renamed from: m6.y */
/* loaded from: classes2.dex */
final class RunnableC22909y implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C22910z f111547p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22909y(C22910z c22910z) {
        this.f111547p = c22910z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC22876d interfaceC22876d;
        InterfaceC22876d interfaceC22876d2;
        obj = this.f111547p.f111549b;
        synchronized (obj) {
            try {
                C22910z c22910z = this.f111547p;
                interfaceC22876d = c22910z.f111550c;
                if (interfaceC22876d != null) {
                    interfaceC22876d2 = c22910z.f111550c;
                    interfaceC22876d2.mo34377l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
