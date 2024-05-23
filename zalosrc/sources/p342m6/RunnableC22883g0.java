package p342m6;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: m6.g0 */
/* loaded from: classes.dex */
final class RunnableC22883g0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC22888j f111504p;

    /* renamed from: q */
    final /* synthetic */ C22885h0 f111505q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22883g0(C22885h0 c22885h0, AbstractC22888j abstractC22888j) {
        this.f111505q = c22885h0;
        this.f111504p = abstractC22888j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC22886i interfaceC22886i;
        try {
            interfaceC22886i = this.f111505q.f111507b;
            AbstractC22888j mo33968a = interfaceC22886i.mo33968a(this.f111504p.mo117584m());
            if (mo33968a == null) {
                this.f111505q.mo839b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC22892l.f111515b;
            mo33968a.mo117577f(executor, this.f111505q);
            mo33968a.mo117575d(executor, this.f111505q);
            mo33968a.mo117572a(executor, this.f111505q);
        } catch (RuntimeExecutionException e11) {
            if (e11.getCause() instanceof Exception) {
                this.f111505q.mo839b((Exception) e11.getCause());
            } else {
                this.f111505q.mo839b(e11);
            }
        } catch (CancellationException unused) {
            this.f111505q.mo34377l();
        } catch (Exception e12) {
            this.f111505q.mo839b(e12);
        }
    }
}
