package p342m6;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* renamed from: m6.w */
/* loaded from: classes.dex */
final class RunnableC22907w implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC22888j f111542p;

    /* renamed from: q */
    final /* synthetic */ C22908x f111543q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22907w(C22908x c22908x, AbstractC22888j abstractC22888j) {
        this.f111543q = c22908x;
        this.f111542p = abstractC22888j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22897n0 c22897n0;
        C22897n0 c22897n02;
        C22897n0 c22897n03;
        InterfaceC22874c interfaceC22874c;
        try {
            interfaceC22874c = this.f111543q.f111545b;
            AbstractC22888j abstractC22888j = (AbstractC22888j) interfaceC22874c.mo27439a(this.f111542p);
            if (abstractC22888j == null) {
                this.f111543q.mo839b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC22892l.f111515b;
            abstractC22888j.mo117577f(executor, this.f111543q);
            abstractC22888j.mo117575d(executor, this.f111543q);
            abstractC22888j.mo117572a(executor, this.f111543q);
        } catch (RuntimeExecutionException e11) {
            if (e11.getCause() instanceof Exception) {
                c22897n03 = this.f111543q.f111546c;
                c22897n03.m117615t((Exception) e11.getCause());
            } else {
                c22897n02 = this.f111543q.f111546c;
                c22897n02.m117615t(e11);
            }
        } catch (Exception e12) {
            c22897n0 = this.f111543q.f111546c;
            c22897n0.m117615t(e12);
        }
    }
}
