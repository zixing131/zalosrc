package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.z0 */
/* loaded from: classes7.dex */
public class C24477z0 extends AbstractC24448l {

    /* renamed from: c */
    private int f118017c;

    public C24477z0() {
        this.f118017c = -1;
    }

    /* renamed from: t */
    private int m127815t() {
        if (this.f118017c < 0) {
            Enumeration m127790p = m127790p();
            int i11 = 0;
            while (m127790p.hasMoreElements()) {
                i11 += ((InterfaceC32514a) m127790p.nextElement()).mo11996c().mo127745l().mo127715h();
            }
            this.f118017c = i11;
        }
        return this.f118017c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        C24442i mo127771b = c24442i.mo127771b();
        int m127815t = m127815t();
        c24442i.mo127772c(49);
        c24442i.m127778i(m127815t);
        Enumeration m127790p = m127790p();
        while (m127790p.hasMoreElements()) {
            mo127771b.mo127779j((InterfaceC32514a) m127790p.nextElement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int m127815t = m127815t();
        return AbstractC24439g1.m127763a(m127815t) + 1 + m127815t;
    }

    public C24477z0(InterfaceC32514a interfaceC32514a) {
        super(interfaceC32514a);
        this.f118017c = -1;
    }

    public C24477z0(C32515b c32515b) {
        super(c32515b, false);
        this.f118017c = -1;
    }

    public C24477z0(InterfaceC32514a[] interfaceC32514aArr) {
        super(interfaceC32514aArr, false);
        this.f118017c = -1;
    }
}
