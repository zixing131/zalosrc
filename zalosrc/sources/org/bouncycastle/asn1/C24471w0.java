package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import co0.AbstractC3635b;

/* renamed from: org.bouncycastle.asn1.w0 */
/* loaded from: classes7.dex */
public class C24471w0 extends AbstractC24444j {

    /* renamed from: a */
    private byte[] f118009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24471w0(byte[] bArr) {
        this.f118009a = bArr;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24471w0) {
            return AbstractC3634a.m18318a(this.f118009a, ((C24471w0) abstractC24444j).f118009a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(26, this.f118009a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f118009a.length) + 1 + this.f118009a.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(this.f118009a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: m */
    public String m127813m() {
        return AbstractC3635b.m18324b(this.f118009a);
    }

    public String toString() {
        return m127813m();
    }
}
