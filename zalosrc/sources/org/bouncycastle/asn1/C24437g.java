package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import zn0.C32521h;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.g */
/* loaded from: classes7.dex */
public class C24437g extends AbstractC24444j {

    /* renamed from: c */
    private static C24437g[][] f117964c = new C24437g[256];

    /* renamed from: a */
    String f117965a;

    /* renamed from: b */
    private byte[] f117966b;

    public C24437g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (m127756t(str)) {
            this.f117965a = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    /* renamed from: n */
    private void m127752n(ByteArrayOutputStream byteArrayOutputStream) {
        C32521h c32521h = new C32521h(this.f117965a);
        int parseInt = Integer.parseInt(c32521h.m157484b()) * 40;
        String m157484b = c32521h.m157484b();
        if (m157484b.length() <= 18) {
            m127757u(byteArrayOutputStream, parseInt + Long.parseLong(m157484b));
        } else {
            m127758v(byteArrayOutputStream, new BigInteger(m157484b).add(BigInteger.valueOf(parseInt)));
        }
        while (c32521h.m157483a()) {
            String m157484b2 = c32521h.m157484b();
            if (m157484b2.length() <= 18) {
                m127757u(byteArrayOutputStream, Long.parseLong(m157484b2));
            } else {
                m127758v(byteArrayOutputStream, new BigInteger(m157484b2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static C24437g m127753o(byte[] bArr) {
        if (bArr.length < 3) {
            return new C24437g(bArr);
        }
        int i11 = bArr[bArr.length - 2] & 255;
        int i12 = bArr[bArr.length - 1] & Byte.MAX_VALUE;
        synchronized (f117964c) {
            try {
                C24437g[][] c24437gArr = f117964c;
                C24437g[] c24437gArr2 = c24437gArr[i11];
                if (c24437gArr2 == null) {
                    c24437gArr2 = new C24437g[128];
                    c24437gArr[i11] = c24437gArr2;
                }
                C24437g c24437g = c24437gArr2[i12];
                if (c24437g == null) {
                    C24437g c24437g2 = new C24437g(bArr);
                    c24437gArr2[i12] = c24437g2;
                    return c24437g2;
                }
                if (AbstractC3634a.m18318a(bArr, c24437g.m127760p())) {
                    return c24437g;
                }
                int i13 = (i11 + 1) & 255;
                C24437g[][] c24437gArr3 = f117964c;
                C24437g[] c24437gArr4 = c24437gArr3[i13];
                if (c24437gArr4 == null) {
                    c24437gArr4 = new C24437g[128];
                    c24437gArr3[i13] = c24437gArr4;
                }
                C24437g c24437g3 = c24437gArr4[i12];
                if (c24437g3 == null) {
                    C24437g c24437g4 = new C24437g(bArr);
                    c24437gArr4[i12] = c24437g4;
                    return c24437g4;
                }
                if (AbstractC3634a.m18318a(bArr, c24437g3.m127760p())) {
                    return c24437g3;
                }
                int i14 = (i12 + 1) & 127;
                C24437g c24437g5 = c24437gArr4[i14];
                if (c24437g5 != null) {
                    return AbstractC3634a.m18318a(bArr, c24437g5.m127760p()) ? c24437g5 : new C24437g(bArr);
                }
                C24437g c24437g6 = new C24437g(bArr);
                c24437gArr4[i14] = c24437g6;
                return c24437g6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public static C24437g m127754r(Object obj) {
        if (obj == null || (obj instanceof C24437g)) {
            return (C24437g) obj;
        }
        if (obj instanceof InterfaceC32514a) {
            InterfaceC32514a interfaceC32514a = (InterfaceC32514a) obj;
            if (interfaceC32514a.mo11996c() instanceof C24437g) {
                return (C24437g) interfaceC32514a.mo11996c();
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C24437g) AbstractC24444j.m127781i((byte[]) obj);
        } catch (IOException e11) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e11.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:            if (r3 != '.') goto L17;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m127755s(String str, int i11) {
        boolean z11;
        int length = str.length();
        do {
            z11 = false;
            while (true) {
                length--;
                if (length < i11) {
                    return z11;
                }
                char charAt = str.charAt(length);
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                z11 = true;
            }
        } while (z11);
        return false;
    }

    /* renamed from: t */
    private static boolean m127756t(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return m127755s(str, 2);
    }

    /* renamed from: u */
    private void m127757u(ByteArrayOutputStream byteArrayOutputStream, long j11) {
        byte[] bArr = new byte[9];
        int i11 = 8;
        bArr[8] = (byte) (((int) j11) & 127);
        while (j11 >= 128) {
            j11 >>= 7;
            i11--;
            bArr[i11] = (byte) ((((int) j11) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i11, 9 - i11);
    }

    /* renamed from: v */
    private void m127758v(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i11 = bitLength - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            bArr[i12] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i11] = (byte) (bArr[i11] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24437g) {
            return this.f117965a.equals(((C24437g) abstractC24444j).f117965a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        byte[] m127760p = m127760p();
        c24442i.mo127772c(6);
        c24442i.m127778i(m127760p.length);
        c24442i.m127773d(m127760p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        int length = m127760p().length;
        return AbstractC24439g1.m127763a(length) + 1 + length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return this.f117965a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: m */
    public C24437g m127759m(String str) {
        return new C24437g(this, str);
    }

    /* renamed from: p */
    protected synchronized byte[] m127760p() {
        try {
            if (this.f117966b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                m127752n(byteArrayOutputStream);
                this.f117966b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f117966b;
    }

    /* renamed from: q */
    public String m127761q() {
        return this.f117965a;
    }

    public String toString() {
        return m127761q();
    }

    C24437g(C24437g c24437g, String str) {
        if (!m127755s(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f117965a = c24437g.m127761q() + "." + str;
    }

    C24437g(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        BigInteger bigInteger = null;
        long j11 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            byte b11 = bArr[i11];
            if (j11 <= 72057594037927808L) {
                long j12 = j11 + (b11 & Byte.MAX_VALUE);
                if ((b11 & 128) == 0) {
                    if (z11) {
                        if (j12 < 40) {
                            stringBuffer.append('0');
                        } else if (j12 < 80) {
                            stringBuffer.append('1');
                            j12 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j12 -= 80;
                        }
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j12);
                    j11 = 0;
                } else {
                    j11 = j12 << 7;
                }
            } else {
                BigInteger or2 = (bigInteger == null ? BigInteger.valueOf(j11) : bigInteger).or(BigInteger.valueOf(b11 & Byte.MAX_VALUE));
                if ((b11 & 128) == 0) {
                    if (z11) {
                        stringBuffer.append('2');
                        or2 = or2.subtract(BigInteger.valueOf(80L));
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or2);
                    bigInteger = null;
                    j11 = 0;
                } else {
                    bigInteger = or2.shiftLeft(7);
                }
            }
        }
        this.f117965a = stringBuffer.toString();
        this.f117966b = AbstractC3634a.m18320c(bArr);
    }
}
