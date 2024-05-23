package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.x */
/* loaded from: classes7.dex */
public class C24472x extends AbstractC24452n {
    public C24472x(boolean z11, int i11, InterfaceC32514a interfaceC32514a) {
        super(z11, i11, interfaceC32514a);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        Enumeration m127790p;
        c24442i.m127780k(160, this.f117984a);
        c24442i.mo127772c(128);
        if (!this.f117985b) {
            if (this.f117986c) {
                c24442i.mo127779j(this.f117987d);
            } else {
                InterfaceC32514a interfaceC32514a = this.f117987d;
                if (interfaceC32514a instanceof AbstractC24440h) {
                    m127790p = interfaceC32514a instanceof C24460r ? ((C24460r) interfaceC32514a).m127808q() : new C24460r(((AbstractC24440h) interfaceC32514a).mo127768n()).m127808q();
                } else if (interfaceC32514a instanceof AbstractC24446k) {
                    m127790p = ((AbstractC24446k) interfaceC32514a).mo127747p();
                } else {
                    if (!(interfaceC32514a instanceof AbstractC24448l)) {
                        throw new RuntimeException("not implemented: " + this.f117987d.getClass().getName());
                    }
                    m127790p = ((AbstractC24448l) interfaceC32514a).m127790p();
                }
                while (m127790p.hasMoreElements()) {
                    c24442i.mo127779j((InterfaceC32514a) m127790p.nextElement());
                }
            }
        }
        c24442i.mo127772c(0);
        c24442i.mo127772c(0);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int m127764b;
        if (this.f117985b) {
            return AbstractC24439g1.m127764b(this.f117984a) + 1;
        }
        int mo127715h = this.f117987d.mo11996c().mo127715h();
        if (this.f117986c) {
            m127764b = AbstractC24439g1.m127764b(this.f117984a) + AbstractC24439g1.m127763a(mo127715h);
        } else {
            mo127715h--;
            m127764b = AbstractC24439g1.m127764b(this.f117984a);
        }
        return m127764b + mo127715h;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        if (this.f117985b || this.f117986c) {
            return true;
        }
        return this.f117987d.mo11996c().mo127744k().mo127716j();
    }
}
