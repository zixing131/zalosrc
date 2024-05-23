package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import on0.AbstractC24340u;
import qm0.AbstractC25368s;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;

/* renamed from: tn0.o0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26816o0 implements SerialDescriptor {

    /* renamed from: a */
    private final String f127036a;

    /* renamed from: b */
    private final SerialDescriptor f127037b;

    /* renamed from: c */
    private final SerialDescriptor f127038c;

    /* renamed from: d */
    private final int f127039d;

    public /* synthetic */ AbstractC26816o0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, AbstractC19060k abstractC19060k) {
        this(str, serialDescriptor, serialDescriptor2);
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
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return AbstractC26342i.c.f125058a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return this.f127039d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC26816o0)) {
            return false;
        }
        AbstractC26816o0 abstractC26816o0 = (AbstractC26816o0) obj;
        if (AbstractC19074t.m100204b(mo113953i(), abstractC26816o0.mo113953i()) && AbstractC19074t.m100204b(this.f127037b, abstractC26816o0.f127037b) && AbstractC19074t.m100204b(this.f127038c, abstractC26816o0.f127038c)) {
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
            int i12 = i11 % 2;
            if (i12 != 0) {
                if (i12 == 1) {
                    return this.f127038c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f127037b;
        }
        throw new IllegalArgumentException(("Illegal index " + i11 + ", " + mo113953i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((mo113953i().hashCode() * 31) + this.f127037b.hashCode()) * 31) + this.f127038c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f127036a;
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
        return mo113953i() + '(' + this.f127037b + ", " + this.f127038c + ')';
    }

    private AbstractC26816o0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f127036a = str;
        this.f127037b = serialDescriptor;
        this.f127038c = serialDescriptor2;
        this.f127039d = 2;
    }
}
