package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import co0.AbstractC3635b;

/* renamed from: org.bouncycastle.asn1.h0 */
/* loaded from: classes7.dex */
public class C24441h0 extends AbstractC24444j {

    /* renamed from: a */
    private byte[] f117970a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24441h0(byte[] bArr) {
        this.f117970a = bArr;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24441h0) {
            return AbstractC3634a.m18318a(this.f117970a, ((C24441h0) abstractC24444j).f117970a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(22, this.f117970a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f117970a.length) + 1 + this.f117970a.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(this.f117970a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: m */
    public String m127769m() {
        return AbstractC3635b.m18324b(this.f117970a);
    }

    public String toString() {
        return m127769m();
    }
}
