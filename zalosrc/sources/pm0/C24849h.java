package pm0;

import java.io.Serializable;

/* renamed from: pm0.h */
/* loaded from: classes7.dex */
public final class C24849h implements InterfaceC24854k, Serializable {

    /* renamed from: p */
    private final Object f119246p;

    public C24849h(Object obj) {
        this.f119246p = obj;
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        return true;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        return this.f119246p;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
