package um0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import um0.InterfaceC27315f;

/* renamed from: um0.b */
/* loaded from: classes.dex */
public abstract class AbstractC27311b implements InterfaceC27315f.c {

    /* renamed from: p */
    private final InterfaceC18505l f128547p;

    /* renamed from: q */
    private final InterfaceC27315f.c f128548q;

    public AbstractC27311b(InterfaceC27315f.c cVar, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(cVar, "baseKey");
        AbstractC19074t.m100208f(interfaceC18505l, "safeCast");
        this.f128547p = interfaceC18505l;
        this.f128548q = cVar instanceof AbstractC27311b ? ((AbstractC27311b) cVar).f128548q : cVar;
    }

    /* renamed from: a */
    public final boolean m139840a(InterfaceC27315f.c cVar) {
        AbstractC19074t.m100208f(cVar, "key");
        return cVar == this || this.f128548q == cVar;
    }

    /* renamed from: b */
    public final InterfaceC27315f.b m139841b(InterfaceC27315f.b bVar) {
        AbstractC19074t.m100208f(bVar, "element");
        return (InterfaceC27315f.b) this.f128547p.mo205i9(bVar);
    }
}
