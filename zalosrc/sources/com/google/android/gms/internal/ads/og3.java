package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class og3 {

    /* renamed from: c */
    private static final ThreadLocal f25626c = new ng3();

    /* renamed from: a */
    private final SecretKey f25627a;

    /* renamed from: b */
    private final boolean f25628b;

    public og3(byte[] bArr, boolean z11) {
        if (yg3.m28203a(2)) {
            os3.m25255a(bArr.length);
            this.f25627a = new SecretKeySpec(bArr, "AES");
            this.f25628b = z11;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m25178c(byte[] bArr, int i11, int i12) {
        if (ns3.m25005b() && ns3.m25004a() <= 19) {
            return new IvParameterSpec(bArr, 0, 12);
        }
        return new GCMParameterSpec(128, bArr, 0, 12);
    }

    /* renamed from: a */
    public final byte[] m25179a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11;
        int i12 = 12;
        if (bArr.length == 12) {
            boolean z11 = this.f25628b;
            if (true != z11) {
                i11 = 16;
            } else {
                i11 = 28;
            }
            int length = bArr2.length;
            if (length >= i11) {
                if (z11 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec m25178c = m25178c(bArr, 0, 12);
                ThreadLocal threadLocal = f25626c;
                ((Cipher) threadLocal.get()).init(2, this.f25627a, m25178c);
                if (bArr3 != null && bArr3.length != 0) {
                    ((Cipher) threadLocal.get()).updateAAD(bArr3);
                }
                boolean z12 = this.f25628b;
                if (true != z12) {
                    i12 = 0;
                }
                if (z12) {
                    length -= 12;
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, i12, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    /* renamed from: b */
    public final byte[] m25180b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11;
        int i12;
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z11 = this.f25628b;
                if (z11) {
                    i11 = length + 28;
                } else {
                    i11 = length + 16;
                }
                byte[] bArr4 = new byte[i11];
                if (z11) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec m25178c = m25178c(bArr, 0, 12);
                ThreadLocal threadLocal = f25626c;
                ((Cipher) threadLocal.get()).init(1, this.f25627a, m25178c);
                if (true != this.f25628b) {
                    i12 = 0;
                } else {
                    i12 = 12;
                }
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, i12);
                if (doFinal == length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
