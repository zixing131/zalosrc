package p342m6;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.o0 */
/* loaded from: classes.dex */
public final class RunnableC22899o0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C22897n0 f111525p;

    /* renamed from: q */
    final /* synthetic */ Callable f111526q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22899o0(C22897n0 c22897n0, Callable callable) {
        this.f111525p = c22897n0;
        this.f111526q = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f111525p.m117616u(this.f111526q.call());
        } catch (Exception e11) {
            this.f111525p.m117615t(e11);
        } catch (Throwable th2) {
            this.f111525p.m117615t(new RuntimeException(th2));
        }
    }
}
