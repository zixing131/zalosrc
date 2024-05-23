package tn0;

import fn0.AbstractC19074t;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sn0.AbstractC26341h;

/* renamed from: tn0.j1 */
/* loaded from: classes7.dex */
public final class C26802j1 implements SerialDescriptor, InterfaceC26803k {

    /* renamed from: a */
    private final SerialDescriptor f127011a;

    /* renamed from: b */
    private final String f127012b;

    /* renamed from: c */
    private final Set f127013c;

    public C26802j1(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "original");
        this.f127011a = serialDescriptor;
        this.f127012b = serialDescriptor.mo113953i() + '?';
        this.f127013c = AbstractC26849z0.m138014a(serialDescriptor);
    }

    @Override // tn0.InterfaceC26803k
    /* renamed from: a */
    public Set mo113962a() {
        return this.f127013c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo113946b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo113947c(String str) {
        AbstractC19074t.m100208f(str, "name");
        return this.f127011a.mo113947c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return this.f127011a.mo113948d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return this.f127011a.mo113949e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C26802j1) && AbstractC19074t.m100204b(this.f127011a, ((C26802j1) obj).f127011a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public String mo113950f(int i11) {
        return this.f127011a.mo113950f(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        return this.f127011a.mo113951g(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        return this.f127011a.mo113952h(i11);
    }

    public int hashCode() {
        return this.f127011a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f127012b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public List mo113954j() {
        return this.f127011a.mo113954j();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return this.f127011a.mo113955k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: l */
    public boolean mo113956l(int i11) {
        return this.f127011a.mo113956l(i11);
    }

    /* renamed from: m */
    public final SerialDescriptor m137870m() {
        return this.f127011a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f127011a);
        sb2.append('?');
        return sb2.toString();
    }
}
