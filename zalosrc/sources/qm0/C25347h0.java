package qm0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;

/* renamed from: qm0.h0 */
/* loaded from: classes7.dex */
public final class C25347h0 implements Iterable, InterfaceC19517a {

    /* renamed from: p */
    private final InterfaceC18494a f121537p;

    public C25347h0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "iteratorFactory");
        this.f121537p = interfaceC18494a;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C25349i0((Iterator) this.f121537p.mo12V4());
    }
}
