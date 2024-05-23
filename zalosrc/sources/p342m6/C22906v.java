package p342m6;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.v */
/* loaded from: classes.dex */
public final class C22906v implements InterfaceC22887i0 {

    /* renamed from: a */
    private final Executor f111539a;

    /* renamed from: b */
    private final InterfaceC22874c f111540b;

    /* renamed from: c */
    private final C22897n0 f111541c;

    public C22906v(Executor executor, InterfaceC22874c interfaceC22874c, C22897n0 c22897n0) {
        this.f111539a = executor;
        this.f111540b = interfaceC22874c;
        this.f111541c = c22897n0;
    }

    @Override // p342m6.InterfaceC22887i0
    /* renamed from: a */
    public final void mo117565a(AbstractC22888j abstractC22888j) {
        this.f111539a.execute(new RunnableC22905u(this, abstractC22888j));
    }
}
