package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import java.math.BigInteger;

/* renamed from: org.bouncycastle.asn1.e */
/* loaded from: classes7.dex */
public class C24431e extends AbstractC24444j {

    /* renamed from: a */
    byte[] f117957a;

    public C24431e(long j11) {
        this.f117957a = BigInteger.valueOf(j11).toByteArray();
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24431e) {
            return AbstractC3634a.m18318a(this.f117957a, ((C24431e) abstractC24444j).f117957a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(2, this.f117957a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f117957a.length) + 1 + this.f117957a.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f117957a;
            if (i11 == bArr.length) {
                return i12;
            }
            i12 ^= (bArr[i11] & 255) << (i11 % 4);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: m */
    public BigInteger m127741m() {
        return new BigInteger(this.f117957a);
    }

    public String toString() {
        return m127741m().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24431e(byte[] bArr, boolean z11) {
        this.f117957a = z11 ? AbstractC3634a.m18320c(bArr) : bArr;
    }
}
