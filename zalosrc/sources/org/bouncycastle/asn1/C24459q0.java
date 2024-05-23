package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.q0 */
/* loaded from: classes7.dex */
public class C24459q0 extends AbstractC24448l {

    /* renamed from: c */
    private int f117996c;

    public C24459q0() {
        this.f117996c = -1;
    }

    /* renamed from: t */
    private int m127804t() {
        if (this.f117996c < 0) {
            Enumeration m127790p = m127790p();
            int i11 = 0;
            while (m127790p.hasMoreElements()) {
                i11 += ((InterfaceC32514a) m127790p.nextElement()).mo11996c().mo127744k().mo127715h();
            }
            this.f117996c = i11;
        }
        return this.f117996c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        C24442i mo127770a = c24442i.mo127770a();
        int m127804t = m127804t();
        c24442i.mo127772c(49);
        c24442i.m127778i(m127804t);
        Enumeration m127790p = m127790p();
        while (m127790p.hasMoreElements()) {
            mo127770a.mo127779j((InterfaceC32514a) m127790p.nextElement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int m127804t = m127804t();
        return AbstractC24439g1.m127763a(m127804t) + 1 + m127804t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24459q0(C32515b c32515b, boolean z11) {
        super(c32515b, z11);
        this.f117996c = -1;
    }
}
