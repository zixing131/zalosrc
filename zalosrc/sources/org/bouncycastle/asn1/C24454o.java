package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import co0.AbstractC3635b;

/* renamed from: org.bouncycastle.asn1.o */
/* loaded from: classes7.dex */
public class C24454o extends AbstractC24444j {

    /* renamed from: a */
    private byte[] f117989a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24454o(byte[] bArr) {
        this.f117989a = bArr;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24454o) {
            return AbstractC3634a.m18318a(this.f117989a, ((C24454o) abstractC24444j).f117989a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.mo127772c(23);
        int length = this.f117989a.length;
        c24442i.m127778i(length);
        for (int i11 = 0; i11 != length; i11++) {
            c24442i.mo127772c(this.f117989a[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int length = this.f117989a.length;
        return AbstractC24439g1.m127763a(length) + 1 + length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(this.f117989a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    public String toString() {
        return AbstractC3635b.m18324b(this.f117989a);
    }
}
