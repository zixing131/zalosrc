package org.bouncycastle.asn1;

import co0.AbstractC3634a;

/* renamed from: org.bouncycastle.asn1.b */
/* loaded from: classes7.dex */
public class C24422b extends AbstractC24444j {

    /* renamed from: b */
    private static C24422b[] f117933b = new C24422b[12];

    /* renamed from: a */
    byte[] f117934a;

    public C24422b(byte[] bArr) {
        this.f117934a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C24422b m127717m(byte[] bArr) {
        if (bArr.length > 1) {
            return new C24422b(AbstractC3634a.m18320c(bArr));
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i11 = bArr[0] & 255;
        C24422b[] c24422bArr = f117933b;
        if (i11 >= c24422bArr.length) {
            return new C24422b(AbstractC3634a.m18320c(bArr));
        }
        C24422b c24422b = c24422bArr[i11];
        if (c24422b != null) {
            return c24422b;
        }
        C24422b c24422b2 = new C24422b(AbstractC3634a.m18320c(bArr));
        c24422bArr[i11] = c24422b2;
        return c24422b2;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24422b) {
            return AbstractC3634a.m18318a(this.f117934a, ((C24422b) abstractC24444j).f117934a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(10, this.f117934a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f117934a.length) + 1 + this.f117934a.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(this.f117934a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }
}
