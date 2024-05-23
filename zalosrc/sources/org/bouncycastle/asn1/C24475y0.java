package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.y0 */
/* loaded from: classes7.dex */
public class C24475y0 extends AbstractC24446k {

    /* renamed from: b */
    private int f118013b;

    public C24475y0() {
        this.f118013b = -1;
    }

    /* renamed from: s */
    private int m127814s() {
        if (this.f118013b < 0) {
            Enumeration mo127747p = mo127747p();
            int i11 = 0;
            while (mo127747p.hasMoreElements()) {
                i11 += ((InterfaceC32514a) mo127747p.nextElement()).mo11996c().mo127745l().mo127715h();
            }
            this.f118013b = i11;
        }
        return this.f118013b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        C24442i mo127771b = c24442i.mo127771b();
        int m127814s = m127814s();
        c24442i.mo127772c(48);
        c24442i.m127778i(m127814s);
        Enumeration mo127747p = mo127747p();
        while (mo127747p.hasMoreElements()) {
            mo127771b.mo127779j((InterfaceC32514a) mo127747p.nextElement());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int m127814s = m127814s();
        return AbstractC24439g1.m127763a(m127814s) + 1 + m127814s;
    }

    public C24475y0(C32515b c32515b) {
        super(c32515b);
        this.f118013b = -1;
    }
}
