package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1795t {

    /* renamed from: p */
    private final C1784n0 f7280p;

    public SavedStateHandleAttacher(C1784n0 c1784n0) {
        AbstractC19074t.m100208f(c1784n0, "provider");
        this.f7280p = c1784n0;
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        if (aVar == AbstractC1785o.a.ON_CREATE) {
            interfaceC1801w.getLifecycle().mo9338d(this);
            this.f7280p.m9333d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
