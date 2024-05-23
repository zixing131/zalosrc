package qe0;

import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qe0.h */
/* loaded from: classes4.dex */
final class C25252h implements InterfaceC20094a {

    /* renamed from: a */
    private final List f121114a = new ArrayList();

    @Override // hm0.InterfaceC20094a
    /* renamed from: a */
    public void mo926a(C20096c c20096c) {
        Iterator it = this.f121114a.iterator();
        while (it.hasNext()) {
            ((InterfaceC20094a) it.next()).mo926a(c20096c);
        }
    }

    @Override // hm0.InterfaceC20094a
    /* renamed from: b */
    public void mo927b(Object obj) {
        Iterator it = this.f121114a.iterator();
        while (it.hasNext()) {
            ((InterfaceC20094a) it.next()).mo927b(obj);
        }
    }

    /* renamed from: c */
    public final void m130684c(InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC20094a, "listener");
        if (!this.f121114a.contains(interfaceC20094a)) {
            this.f121114a.add(interfaceC20094a);
        }
    }
}
