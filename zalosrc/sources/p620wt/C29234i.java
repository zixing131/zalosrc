package p620wt;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedList;
import pm0.C24848g0;

/* renamed from: wt.i */
/* loaded from: classes.dex */
public final class C29234i {

    /* renamed from: a */
    private final LinkedList f135420a = new LinkedList();

    /* renamed from: a */
    public final void m145992a(InterfaceC29232g interfaceC29232g) {
        AbstractC19074t.m100208f(interfaceC29232g, "managed");
        synchronized (this.f135420a) {
            this.f135420a.add(interfaceC29232g);
        }
    }

    /* renamed from: b */
    public final void m145993b() {
        synchronized (this.f135420a) {
            try {
                Iterator it = this.f135420a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC29232g) it.next()).reset();
                }
                this.f135420a.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
