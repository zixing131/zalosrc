package org.bouncycastle.asn1;

import co0.AbstractC3634a;

/* renamed from: org.bouncycastle.asn1.c */
/* loaded from: classes7.dex */
public class C24425c extends AbstractC24444j {

    /* renamed from: a */
    private byte[] f117939a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24425c(byte[] bArr) {
        this.f117939a = bArr;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24425c) {
            return AbstractC3634a.m18318a(this.f117939a, ((C24425c) abstractC24444j).f117939a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(24, this.f117939a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int length = this.f117939a.length;
        return AbstractC24439g1.m127763a(length) + 1 + length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(this.f117939a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }
}
