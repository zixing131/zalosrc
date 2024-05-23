package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.v */
/* loaded from: classes7.dex */
public class C24468v extends AbstractC24448l {
    public C24468v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.mo127772c(49);
        c24442i.mo127772c(128);
        Enumeration m127790p = m127790p();
        while (m127790p.hasMoreElements()) {
            c24442i.mo127779j((InterfaceC32514a) m127790p.nextElement());
        }
        c24442i.mo127772c(0);
        c24442i.mo127772c(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        Enumeration m127790p = m127790p();
        int i11 = 0;
        while (m127790p.hasMoreElements()) {
            i11 += ((InterfaceC32514a) m127790p.nextElement()).mo11996c().mo127715h();
        }
        return i11 + 4;
    }

    public C24468v(InterfaceC32514a interfaceC32514a) {
        super(interfaceC32514a);
    }

    public C24468v(C32515b c32515b) {
        super(c32515b, false);
    }

    public C24468v(InterfaceC32514a[] interfaceC32514aArr) {
        super(interfaceC32514aArr, false);
    }
}
