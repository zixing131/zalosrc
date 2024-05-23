package p534u1;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;

/* renamed from: u1.d */
/* loaded from: classes.dex */
public final class C26944d extends AbstractC26941a {
    public C26944d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p534u1.AbstractC26941a
    /* renamed from: a */
    public Object mo138786a(AbstractC26941a.b bVar) {
        AbstractC19074t.m100208f(bVar, "key");
        return m138787b().get(bVar);
    }

    /* renamed from: c */
    public final void m138790c(AbstractC26941a.b bVar, Object obj) {
        AbstractC19074t.m100208f(bVar, "key");
        m138787b().put(bVar, obj);
    }

    public C26944d(AbstractC26941a abstractC26941a) {
        AbstractC19074t.m100208f(abstractC26941a, "initialExtras");
        m138787b().putAll(abstractC26941a.m138787b());
    }

    public /* synthetic */ C26944d(AbstractC26941a abstractC26941a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? AbstractC26941a.a.f127383b : abstractC26941a);
    }
}
