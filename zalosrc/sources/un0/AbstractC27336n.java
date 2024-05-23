package un0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;

/* renamed from: un0.n */
/* loaded from: classes7.dex */
public abstract class AbstractC27336n {
    /* renamed from: a */
    public static final AbstractC27323a m139940a(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(abstractC27323a, "from");
        AbstractC19074t.m100208f(interfaceC18505l, "builderAction");
        C27326d c27326d = new C27326d(abstractC27323a);
        interfaceC18505l.mo205i9(c27326d);
        return new C27335m(c27326d.m139876a(), c27326d.m139877b());
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC27323a m139941b(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC27323a = AbstractC27323a.f128573d;
        }
        return m139940a(abstractC27323a, interfaceC18505l);
    }
}
