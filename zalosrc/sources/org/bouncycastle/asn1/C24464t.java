package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.t */
/* loaded from: classes7.dex */
public class C24464t extends AbstractC24446k {
    public C24464t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.mo127772c(48);
        c24442i.mo127772c(128);
        Enumeration mo127747p = mo127747p();
        while (mo127747p.hasMoreElements()) {
            c24442i.mo127779j((InterfaceC32514a) mo127747p.nextElement());
        }
        c24442i.mo127772c(0);
        c24442i.mo127772c(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        Enumeration mo127747p = mo127747p();
        int i11 = 0;
        while (mo127747p.hasMoreElements()) {
            i11 += ((InterfaceC32514a) mo127747p.nextElement()).mo11996c().mo127715h();
        }
        return i11 + 4;
    }

    public C24464t(C32515b c32515b) {
        super(c32515b);
    }
}
