package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import on0.AbstractC24340u;
import qm0.AbstractC25368s;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;

/* renamed from: tn0.k0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26804k0 implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f127014a;

    /* renamed from: b */
    private final int f127015b;

    public /* synthetic */ AbstractC26804k0(SerialDescriptor serialDescriptor, AbstractC19060k abstractC19060k) {
        this(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo113946b() {
        return SerialDescriptor.C21879a.m113959c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo113947c(String str) {
        Integer m127107m;
        AbstractC19074t.m100208f(str, "name");
        m127107m = AbstractC24340u.m127107m(str);
        if (m127107m != null) {
            return m127107m.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return AbstractC26342i.b.f125057a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return this.f127015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC26804k0)) {
            return false;
        }
        AbstractC26804k0 abstractC26804k0 = (AbstractC26804k0) obj;
        if (AbstractC19074t.m100204b(this.f127014a, abstractC26804k0.f127014a) && AbstractC19074t.m100204b(mo113953i(), abstractC26804k0.mo113953i())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public String mo113950f(int i11) {
        return String.valueOf(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        List m131502j;
        if (i11 >= 0) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + mo113953i() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        if (i11 >= 0) {
            return this.f127014a;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + mo113953i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f127014a.hashCode() * 31) + mo113953i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public List mo113954j() {
        return SerialDescriptor.C21879a.m113957a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return SerialDescriptor.C21879a.m113958b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: l */
    public boolean mo113956l(int i11) {
        if (i11 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + mo113953i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return mo113953i() + '(' + this.f127014a + ')';
    }

    private AbstractC26804k0(SerialDescriptor serialDescriptor) {
        this.f127014a = serialDescriptor;
        this.f127015b = 1;
    }
}
