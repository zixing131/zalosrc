package p342m6;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.h0 */
/* loaded from: classes.dex */
public final class C22885h0 implements InterfaceC22882g, InterfaceC22880f, InterfaceC22876d, InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111506a;

    /* renamed from: b */
    private final InterfaceC22886i f111507b;

    /* renamed from: c */
    private final C22897n0 f111508c;

    public C22885h0(Executor executor, InterfaceC22886i interfaceC22886i, C22897n0 c22897n0) {
        this.f111506a = executor;
        this.f111507b = interfaceC22886i;
        this.f111508c = c22897n0;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        this.f111506a.execute(new RunnableC22883g0(this, abstractC22888j));
    }

    @Override // p342m6.InterfaceC22880f
    /* renamed from: b */
    public final void mo839b(Exception exc) {
        this.f111508c.m117615t(exc);
    }

    @Override // p342m6.InterfaceC22876d
    /* renamed from: l */
    public final void mo34377l() {
        this.f111508c.m117617v();
    }

    @Override // p342m6.InterfaceC22882g
    public final void onSuccess(Object obj) {
        this.f111508c.m117616u(obj);
    }
}
