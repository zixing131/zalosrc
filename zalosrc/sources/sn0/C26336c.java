package sn0;

import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;

/* renamed from: sn0.c */
/* loaded from: classes7.dex */
final class C26336c implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f125032a;

    /* renamed from: b */
    public final InterfaceC23364b f125033b;

    /* renamed from: c */
    private final String f125034c;

    public C26336c(SerialDescriptor serialDescriptor, InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(serialDescriptor, "original");
        AbstractC19074t.m100208f(interfaceC23364b, "kClass");
        this.f125032a = serialDescriptor;
        this.f125033b = interfaceC23364b;
        this.f125034c = serialDescriptor.mo113953i() + '<' + interfaceC23364b.mo100163c() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo113946b() {
        return this.f125032a.mo113946b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo113947c(String str) {
        AbstractC19074t.m100208f(str, "name");
        return this.f125032a.mo113947c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public AbstractC26341h mo113948d() {
        return this.f125032a.mo113948d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo113949e() {
        return this.f125032a.mo113949e();
    }

    public boolean equals(Object obj) {
        C26336c c26336c;
        if (obj instanceof C26336c) {
            c26336c = (C26336c) obj;
        } else {
            c26336c = null;
        }
        if (c26336c == null || !AbstractC19074t.m100204b(this.f125032a, c26336c.f125032a) || !AbstractC19074t.m100204b(c26336c.f125033b, this.f125033b)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public String mo113950f(int i11) {
        return this.f125032a.mo113950f(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public List mo113951g(int i11) {
        return this.f125032a.mo113951g(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo113952h(int i11) {
        return this.f125032a.mo113952h(i11);
    }

    public int hashCode() {
        return (this.f125033b.hashCode() * 31) + mo113953i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo113953i() {
        return this.f125034c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public List mo113954j() {
        return this.f125032a.mo113954j();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: k */
    public boolean mo113955k() {
        return this.f125032a.mo113955k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: l */
    public boolean mo113956l(int i11) {
        return this.f125032a.mo113956l(i11);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f125033b + ", original: " + this.f125032a + ')';
    }
}
