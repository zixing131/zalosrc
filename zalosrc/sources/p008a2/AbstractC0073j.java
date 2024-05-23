package p008a2;

import fn0.AbstractC19074t;
import java.util.Iterator;
import p119e2.InterfaceC18186k;

/* renamed from: a2.j */
/* loaded from: classes.dex */
public abstract class AbstractC0073j extends AbstractC0066f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0073j(AbstractC0086w abstractC0086w) {
        super(abstractC0086w);
        AbstractC19074t.m100208f(abstractC0086w, "database");
    }

    /* renamed from: i */
    protected abstract void mo259i(InterfaceC18186k interfaceC18186k, Object obj);

    /* renamed from: j */
    public final int m260j(Object obj) {
        InterfaceC18186k m248b = m248b();
        try {
            mo259i(m248b, obj);
            return m248b.mo223w();
        } finally {
            m251h(m248b);
        }
    }

    /* renamed from: k */
    public final int m261k(Iterable iterable) {
        AbstractC19074t.m100208f(iterable, "entities");
        InterfaceC18186k m248b = m248b();
        try {
            Iterator it = iterable.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                mo259i(m248b, it.next());
                i11 += m248b.mo223w();
            }
            return i11;
        } finally {
            m251h(m248b);
        }
    }
}
