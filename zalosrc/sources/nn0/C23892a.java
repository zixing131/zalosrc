package nn0;

import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nn0.a */
/* loaded from: classes7.dex */
public final class C23892a implements InterfaceC23898g {

    /* renamed from: a */
    private final AtomicReference f115494a;

    public C23892a(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "sequence");
        this.f115494a = new AtomicReference(interfaceC23898g);
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        InterfaceC23898g interfaceC23898g = (InterfaceC23898g) this.f115494a.getAndSet(null);
        if (interfaceC23898g != null) {
            return interfaceC23898g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
