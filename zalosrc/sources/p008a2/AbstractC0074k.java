package p008a2;

import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p119e2.InterfaceC18186k;
import qm0.AbstractC25366r;

/* renamed from: a2.k */
/* loaded from: classes.dex */
public abstract class AbstractC0074k extends AbstractC0066f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0074k(AbstractC0086w abstractC0086w) {
        super(abstractC0086w);
        AbstractC19074t.m100208f(abstractC0086w, "database");
    }

    /* renamed from: i */
    protected abstract void mo262i(InterfaceC18186k interfaceC18186k, Object obj);

    /* renamed from: j */
    public final void m263j(Object obj) {
        InterfaceC18186k m248b = m248b();
        try {
            mo262i(m248b, obj);
            m248b.mo218W();
        } finally {
            m251h(m248b);
        }
    }

    /* renamed from: k */
    public final long m264k(Object obj) {
        InterfaceC18186k m248b = m248b();
        try {
            mo262i(m248b, obj);
            return m248b.mo218W();
        } finally {
            m251h(m248b);
        }
    }

    /* renamed from: l */
    public final List m265l(Collection collection) {
        List m131494c;
        List m131492a;
        AbstractC19074t.m100208f(collection, "entities");
        InterfaceC18186k m248b = m248b();
        try {
            m131494c = AbstractC25366r.m131494c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                mo262i(m248b, it.next());
                m131494c.add(Long.valueOf(m248b.mo218W()));
            }
            m131492a = AbstractC25366r.m131492a(m131494c);
            m251h(m248b);
            return m131492a;
        } catch (Throwable th2) {
            m251h(m248b);
            throw th2;
        }
    }
}
