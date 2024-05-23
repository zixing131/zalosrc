package lk0;

import ik0.AbstractC20595r;
import ik0.InterfaceC20586i;
import mm0.AbstractC23352g;

/* renamed from: lk0.e */
/* loaded from: classes.dex */
public class C22507e {

    /* renamed from: a */
    private final InterfaceC20586i f110158a;

    public C22507e(InterfaceC20586i interfaceC20586i) {
        this.f110158a = interfaceC20586i;
    }

    /* renamed from: a */
    private String m116373a() {
        return this.f110158a.mo91776d();
    }

    /* renamed from: b */
    public String m116374b(AbstractC20595r abstractC20595r) {
        return AbstractC23352g.m122788d(String.format("ns=%s&url=%s&zinstantDataId=%s&socketCmd=%s", m116373a(), abstractC20595r.mo107043a(), abstractC20595r.mo107048g(), Integer.valueOf(abstractC20595r.mo107047f())));
    }
}
