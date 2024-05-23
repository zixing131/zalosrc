package p342m6;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.x */
/* loaded from: classes.dex */
public final class C22908x implements InterfaceC22882g, InterfaceC22880f, InterfaceC22876d, InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111544a;

    /* renamed from: b */
    private final InterfaceC22874c f111545b;

    /* renamed from: c */
    private final C22897n0 f111546c;

    public C22908x(Executor executor, InterfaceC22874c interfaceC22874c, C22897n0 c22897n0) {
        this.f111544a = executor;
        this.f111545b = interfaceC22874c;
        this.f111546c = c22897n0;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        this.f111544a.execute(new RunnableC22907w(this, abstractC22888j));
    }

    @Override // p342m6.InterfaceC22880f
    /* renamed from: b */
    public final void mo839b(Exception exc) {
        this.f111546c.m117615t(exc);
    }

    @Override // p342m6.InterfaceC22876d
    /* renamed from: l */
    public final void mo34377l() {
        this.f111546c.m117617v();
    }

    @Override // p342m6.InterfaceC22882g
    public final void onSuccess(Object obj) {
        this.f111546c.m117616u(obj);
    }
}
