package in0;

import fn0.AbstractC19074t;
import mn0.InterfaceC23370h;

/* renamed from: in0.b */
/* loaded from: classes7.dex */
final class C20635b implements InterfaceC20636c {

    /* renamed from: a */
    private Object f101536a;

    @Override // in0.InterfaceC20636c
    /* renamed from: a */
    public void mo107535a(Object obj, InterfaceC23370h interfaceC23370h, Object obj2) {
        AbstractC19074t.m100208f(interfaceC23370h, "property");
        AbstractC19074t.m100208f(obj2, "value");
        this.f101536a = obj2;
    }

    @Override // in0.InterfaceC20636c
    /* renamed from: b */
    public Object mo107536b(Object obj, InterfaceC23370h interfaceC23370h) {
        AbstractC19074t.m100208f(interfaceC23370h, "property");
        Object obj2 = this.f101536a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + interfaceC23370h.mo100153a() + " should be initialized before get.");
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotNullProperty(");
        if (this.f101536a != null) {
            str = "value=" + this.f101536a;
        } else {
            str = "value not initialized yet";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}
