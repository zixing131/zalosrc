package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class fr3 implements pd3 {

    /* renamed from: e */
    private static final ThreadLocal f20264e = new dr3();

    /* renamed from: f */
    private static final ThreadLocal f20265f = new er3();

    /* renamed from: a */
    private final byte[] f20266a;

    /* renamed from: b */
    private final byte[] f20267b;

    /* renamed from: c */
    private final SecretKeySpec f20268c;

    /* renamed from: d */
    private final int f20269d;

    public fr3(byte[] bArr, int i11) {
        if (yg3.m28203a(1)) {
            if (i11 != 12 && i11 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f20269d = i11;
            os3.m25255a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f20268c = secretKeySpec;
            Cipher cipher = (Cipher) f20264e.get();
            cipher.init(1, secretKeySpec);
            byte[] m22150c = m22150c(cipher.doFinal(new byte[16]));
            this.f20266a = m22150c;
            this.f20267b = m22150c(m22150c);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    /* renamed from: c */
    private static byte[] m22150c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i11 = 0;
        while (i11 < 15) {
            byte b11 = bArr[i11];
            int i12 = i11 + 1;
            bArr2[i11] = (byte) (((b11 + b11) ^ ((bArr[i12] & 255) >>> 7)) & 255);
            i11 = i12;
        }
        byte b12 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b12 + b12));
        return bArr2;
    }

    /* renamed from: d */
    private final byte[] m22151d(Cipher cipher, int i11, byte[] bArr, int i12, int i13) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i11;
        if (i13 == 0) {
            return cipher.doFinal(m22152e(bArr3, this.f20266a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i14 = 0;
        int i15 = 0;
        while (i13 - i15 > 16) {
            for (int i16 = 0; i16 < 16; i16++) {
                doFinal[i16] = (byte) (doFinal[i16] ^ bArr[(i12 + i15) + i16]);
            }
            doFinal = cipher.doFinal(doFinal);
            i15 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i15 + i12, i12 + i13);
        if (copyOfRange.length == 16) {
            bArr2 = m22152e(copyOfRange, this.f20266a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f20267b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i14 >= length) {
                    break;
                }
                copyOf[i14] = (byte) (copyOf[i14] ^ copyOfRange[i14]);
                i14++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m22152e(doFinal, bArr2));
    }

    /* renamed from: e */
    private static byte[] m22152e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = (length - this.f20269d) - 16;
        if (i11 >= 0) {
            Cipher cipher = (Cipher) f20264e.get();
            cipher.init(1, this.f20268c);
            byte[] m22151d = m22151d(cipher, 0, bArr, 0, this.f20269d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] m22151d2 = m22151d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] m22151d3 = m22151d(cipher, 2, bArr, this.f20269d, i11);
            int i12 = length - 16;
            byte b11 = 0;
            for (int i13 = 0; i13 < 16; i13++) {
                b11 = (byte) (b11 | (((bArr[i12 + i13] ^ m22151d2[i13]) ^ m22151d[i13]) ^ m22151d3[i13]));
            }
            if (b11 == 0) {
                Cipher cipher2 = (Cipher) f20265f.get();
                cipher2.init(1, this.f20268c, new IvParameterSpec(m22151d));
                return cipher2.doFinal(bArr, this.f20269d, i11);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i11 = this.f20269d;
        if (length <= 2147483631 - i11) {
            byte[] bArr3 = new byte[i11 + length + 16];
            byte[] m24706a = ms3.m24706a(i11);
            System.arraycopy(m24706a, 0, bArr3, 0, this.f20269d);
            Cipher cipher = (Cipher) f20264e.get();
            cipher.init(1, this.f20268c);
            byte[] m22151d = m22151d(cipher, 0, m24706a, 0, m24706a.length);
            byte[] m22151d2 = m22151d(cipher, 1, bArr2, 0, 0);
            Cipher cipher2 = (Cipher) f20265f.get();
            cipher2.init(1, this.f20268c, new IvParameterSpec(m22151d));
            cipher2.doFinal(bArr, 0, length, bArr3, this.f20269d);
            byte[] m22151d3 = m22151d(cipher, 2, bArr3, this.f20269d, length);
            int i12 = length + this.f20269d;
            for (int i13 = 0; i13 < 16; i13++) {
                bArr3[i12 + i13] = (byte) ((m22151d2[i13] ^ m22151d[i13]) ^ m22151d3[i13]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
