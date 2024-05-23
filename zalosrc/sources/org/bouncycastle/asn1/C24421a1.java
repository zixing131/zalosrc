package org.bouncycastle.asn1;

import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.a1 */
/* loaded from: classes7.dex */
public class C24421a1 extends AbstractC24452n {

    /* renamed from: e */
    private static final byte[] f117932e = new byte[0];

    public C24421a1(boolean z11, int i11, InterfaceC32514a interfaceC32514a) {
        super(z11, i11, interfaceC32514a);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        if (this.f117985b) {
            c24442i.m127775f(160, this.f117984a, f117932e);
            return;
        }
        AbstractC24444j mo127745l = this.f117987d.mo11996c().mo127745l();
        if (!this.f117986c) {
            c24442i.m127780k(mo127745l.mo127716j() ? 160 : 128, this.f117984a);
            c24442i.m127777h(mo127745l);
        } else {
            c24442i.m127780k(160, this.f117984a);
            c24442i.m127778i(mo127745l.mo127715h());
            c24442i.mo127779j(mo127745l);
        }
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int m127764b;
        if (this.f117985b) {
            return AbstractC24439g1.m127764b(this.f117984a) + 1;
        }
        int mo127715h = this.f117987d.mo11996c().mo127745l().mo127715h();
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
        return this.f117987d.mo11996c().mo127745l().mo127716j();
    }
}
