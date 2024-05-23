package pm0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: pm0.u */
/* loaded from: classes.dex */
final class C24864u implements InterfaceC24854k, Serializable {

    /* renamed from: p */
    private InterfaceC18494a f119272p;

    /* renamed from: q */
    private volatile Object f119273q;

    /* renamed from: r */
    private final Object f119274r;

    public C24864u(InterfaceC18494a interfaceC18494a, Object obj) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        this.f119272p = interfaceC18494a;
        this.f119273q = C24842d0.f119239a;
        this.f119274r = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C24849h(getValue());
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        if (this.f119273q != C24842d0.f119239a) {
            return true;
        }
        return false;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f119273q;
        C24842d0 c24842d0 = C24842d0.f119239a;
        if (obj2 != c24842d0) {
            return obj2;
        }
        synchronized (this.f119274r) {
            obj = this.f119273q;
            if (obj == c24842d0) {
                InterfaceC18494a interfaceC18494a = this.f119272p;
                AbstractC19074t.m100205c(interfaceC18494a);
                obj = interfaceC18494a.mo12V4();
                this.f119273q = obj;
                this.f119272p = null;
            }
        }
        return obj;
    }

    public String toString() {
        if (mo9375b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C24864u(InterfaceC18494a interfaceC18494a, Object obj, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18494a, (i11 & 2) != 0 ? null : obj);
    }
}
