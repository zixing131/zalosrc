package p342m6;

import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: m6.c0 */
/* loaded from: classes2.dex */
final class RunnableC22875c0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC22888j f111494p;

    /* renamed from: q */
    final /* synthetic */ C22877d0 f111495q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22875c0(C22877d0 c22877d0, AbstractC22888j abstractC22888j) {
        this.f111495q = c22877d0;
        this.f111494p = abstractC22888j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC22880f interfaceC22880f;
        InterfaceC22880f interfaceC22880f2;
        obj = this.f111495q.f111497b;
        synchronized (obj) {
            try {
                C22877d0 c22877d0 = this.f111495q;
                interfaceC22880f = c22877d0.f111498c;
                if (interfaceC22880f != null) {
                    interfaceC22880f2 = c22877d0.f111498c;
                    interfaceC22880f2.mo839b((Exception) AbstractC4205o.m19722k(this.f111494p.mo117583l()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
