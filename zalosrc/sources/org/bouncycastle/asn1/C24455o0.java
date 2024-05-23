package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.o0 */
/* loaded from: classes7.dex */
public class C24455o0 extends AbstractC24446k {

    /* renamed from: b */
    private int f117990b;

    public C24455o0() {
        this.f117990b = -1;
    }

    /* renamed from: s */
    private int m127802s() {
        if (this.f117990b < 0) {
            Enumeration mo127747p = mo127747p();
            int i11 = 0;
            while (mo127747p.hasMoreElements()) {
                i11 += ((InterfaceC32514a) mo127747p.nextElement()).mo11996c().mo127744k().mo127715h();
            }
            this.f117990b = i11;
        }
        return this.f117990b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        C24442i mo127770a = c24442i.mo127770a();
        int m127802s = m127802s();
        c24442i.mo127772c(48);
        c24442i.m127778i(m127802s);
        Enumeration mo127747p = mo127747p();
        while (mo127747p.hasMoreElements()) {
            mo127770a.mo127779j((InterfaceC32514a) mo127747p.nextElement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int m127802s = m127802s();
        return AbstractC24439g1.m127763a(m127802s) + 1 + m127802s;
    }

    public C24455o0(C32515b c32515b) {
        super(c32515b);
        this.f117990b = -1;
    }
}
