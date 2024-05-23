package p008a2;

import fn0.AbstractC19074t;
import java.io.File;
import java.util.concurrent.Callable;
import p119e2.InterfaceC18183h;

/* renamed from: a2.e0 */
/* loaded from: classes2.dex */
public final class C0064e0 implements InterfaceC18183h.c {

    /* renamed from: a */
    private final String f267a;

    /* renamed from: b */
    private final File f268b;

    /* renamed from: c */
    private final Callable f269c;

    /* renamed from: d */
    private final InterfaceC18183h.c f270d;

    public C0064e0(String str, File file, Callable callable, InterfaceC18183h.c cVar) {
        AbstractC19074t.m100208f(cVar, "mDelegate");
        this.f267a = str;
        this.f268b = file;
        this.f269c = callable;
        this.f270d = cVar;
    }

    @Override // p119e2.InterfaceC18183h.c
    /* renamed from: a */
    public InterfaceC18183h mo232a(InterfaceC18183h.b bVar) {
        AbstractC19074t.m100208f(bVar, "configuration");
        return new C0062d0(bVar.f92345a, this.f267a, this.f268b, this.f269c, bVar.f92347c.f92343a, this.f270d.mo232a(bVar));
    }
}
