package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: org.bouncycastle.asn1.v0 */
/* loaded from: classes7.dex */
public class C24469v0 extends AbstractC24444j {

    /* renamed from: b */
    private static final char[] f118006b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private byte[] f118007a;

    public C24469v0(byte[] bArr) {
        this.f118007a = bArr;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24469v0) {
            return AbstractC3634a.m18318a(this.f118007a, ((C24469v0) abstractC24444j).f118007a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(28, m127811m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f118007a.length) + 1 + this.f118007a.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(this.f118007a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: m */
    public byte[] m127811m() {
        return this.f118007a;
    }

    /* renamed from: n */
    public String m127812n() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C24442i(byteArrayOutputStream).mo127779j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i11 = 0; i11 != byteArray.length; i11++) {
                char[] cArr = f118006b;
                stringBuffer.append(cArr[(byteArray[i11] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i11] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new RuntimeException("internal error encoding BitString");
        }
    }

    public String toString() {
        return m127812n();
    }
}
