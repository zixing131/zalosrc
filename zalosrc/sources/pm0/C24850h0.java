package pm0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: pm0.h0 */
/* loaded from: classes7.dex */
public final class C24850h0 implements InterfaceC24854k, Serializable {

    /* renamed from: p */
    private InterfaceC18494a f119247p;

    /* renamed from: q */
    private Object f119248q;

    public C24850h0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        this.f119247p = interfaceC18494a;
        this.f119248q = C24842d0.f119239a;
    }

    private final Object writeReplace() {
        return new C24849h(getValue());
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        if (this.f119248q != C24842d0.f119239a) {
            return true;
        }
        return false;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        if (this.f119248q == C24842d0.f119239a) {
            InterfaceC18494a interfaceC18494a = this.f119247p;
            AbstractC19074t.m100205c(interfaceC18494a);
            this.f119248q = interfaceC18494a.mo12V4();
            this.f119247p = null;
        }
        return this.f119248q;
    }

    public String toString() {
        if (mo9375b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
