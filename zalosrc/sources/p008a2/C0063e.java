package p008a2;

import fn0.AbstractC19074t;
import p119e2.InterfaceC18183h;

/* renamed from: a2.e */
/* loaded from: classes2.dex */
public final class C0063e implements InterfaceC18183h.c {

    /* renamed from: a */
    private final InterfaceC18183h.c f265a;

    /* renamed from: b */
    private final C0059c f266b;

    public C0063e(InterfaceC18183h.c cVar, C0059c c0059c) {
        AbstractC19074t.m100208f(cVar, "delegate");
        AbstractC19074t.m100208f(c0059c, "autoCloser");
        this.f265a = cVar;
        this.f266b = c0059c;
    }

    @Override // p119e2.InterfaceC18183h.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0061d mo232a(InterfaceC18183h.b bVar) {
        AbstractC19074t.m100208f(bVar, "configuration");
        return new C0061d(this.f265a.mo232a(bVar), this.f266b);
    }
}
