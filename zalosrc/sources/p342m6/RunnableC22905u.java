package p342m6;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: m6.u */
/* loaded from: classes.dex */
final class RunnableC22905u implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AbstractC22888j f111537p;

    /* renamed from: q */
    final /* synthetic */ C22906v f111538q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC22905u(C22906v c22906v, AbstractC22888j abstractC22888j) {
        this.f111538q = c22906v;
        this.f111537p = abstractC22888j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22897n0 c22897n0;
        C22897n0 c22897n02;
        C22897n0 c22897n03;
        InterfaceC22874c interfaceC22874c;
        C22897n0 c22897n04;
        C22897n0 c22897n05;
        if (this.f111537p.mo117586o()) {
            c22897n05 = this.f111538q.f111541c;
            c22897n05.m117617v();
            return;
        }
        try {
            interfaceC22874c = this.f111538q.f111540b;
            Object mo27439a = interfaceC22874c.mo27439a(this.f111537p);
            c22897n04 = this.f111538q.f111541c;
            c22897n04.m117616u(mo27439a);
        } catch (RuntimeExecutionException e11) {
            if (e11.getCause() instanceof Exception) {
                c22897n03 = this.f111538q.f111541c;
                c22897n03.m117615t((Exception) e11.getCause());
            } else {
                c22897n02 = this.f111538q.f111541c;
                c22897n02.m117615t(e11);
            }
        } catch (Exception e12) {
            c22897n0 = this.f111538q.f111541c;
            c22897n0.m117615t(e12);
        }
    }
}
