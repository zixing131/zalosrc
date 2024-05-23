package nn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.Iterator;
import qm0.AbstractC25334b;

/* renamed from: nn0.b */
/* loaded from: classes7.dex */
final class C23893b extends AbstractC25334b {

    /* renamed from: r */
    private final Iterator f115495r;

    /* renamed from: s */
    private final InterfaceC18505l f115496s;

    /* renamed from: t */
    private final HashSet f115497t;

    public C23893b(Iterator it, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(it, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "keySelector");
        this.f115495r = it;
        this.f115496s = interfaceC18505l;
        this.f115497t = new HashSet();
    }

    @Override // qm0.AbstractC25334b
    /* renamed from: a */
    protected void mo13902a() {
        while (this.f115495r.hasNext()) {
            Object next = this.f115495r.next();
            if (this.f115497t.add(this.f115496s.mo205i9(next))) {
                m131232d(next);
                return;
            }
        }
        m131231c();
    }
}
