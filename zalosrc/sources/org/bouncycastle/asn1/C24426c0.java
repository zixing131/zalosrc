package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import eo0.AbstractC18530a;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.bouncycastle.asn1.c0 */
/* loaded from: classes7.dex */
public class C24426c0 extends AbstractC24444j {

    /* renamed from: c */
    private static final char[] f117940c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    protected byte[] f117941a;

    /* renamed from: b */
    protected int f117942b;

    public C24426c0(byte[] bArr, int i11) {
        this.f117941a = bArr;
        this.f117942b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C24426c0 m127721m(int i11, InputStream inputStream) {
        if (i11 < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int read = inputStream.read();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        if (i12 == 0 || AbstractC18530a.m97920c(inputStream, bArr) == i12) {
            return new C24426c0(bArr, read);
        }
        throw new EOFException("EOF encountered in middle of BIT STRING");
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    protected boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (!(abstractC24444j instanceof C24426c0)) {
            return false;
        }
        C24426c0 c24426c0 = (C24426c0) abstractC24444j;
        return this.f117942b == c24426c0.f117942b && AbstractC3634a.m18318a(this.f117941a, c24426c0.f117941a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        int length = m127722n().length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) m127723o();
        System.arraycopy(m127722n(), 0, bArr, 1, length);
        c24442i.m127776g(3, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f117941a.length + 1) + 1 + this.f117941a.length + 1;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return this.f117942b ^ AbstractC3634a.m18321d(this.f117941a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: n */
    public byte[] m127722n() {
        return this.f117941a;
    }

    /* renamed from: o */
    public int m127723o() {
        return this.f117942b;
    }

    /* renamed from: p */
    public String m127724p() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C24442i(byteArrayOutputStream).mo127779j(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i11 = 0; i11 != byteArray.length; i11++) {
                char[] cArr = f117940c;
                stringBuffer.append(cArr[(byteArray[i11] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i11] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new RuntimeException("internal error encoding BitString");
        }
    }

    public String toString() {
        return m127724p();
    }
}
