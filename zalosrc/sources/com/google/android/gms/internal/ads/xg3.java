package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class xg3 implements pd3 {

    /* renamed from: b */
    private static final ThreadLocal f30445b = new wg3();

    /* renamed from: a */
    private final SecretKey f30446a;

    public xg3(byte[] bArr) {
        os3.m25255a(bArr.length);
        this.f30446a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m27886c(byte[] bArr, int i11, int i12) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i12);
        } catch (ClassNotFoundException unused) {
            if (ns3.m25005b()) {
                return new IvParameterSpec(bArr, 0, i12);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: a */
    public final byte[] mo22153a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec m27886c = m27886c(bArr, 0, 12);
            ThreadLocal threadLocal = f30445b;
            ((Cipher) threadLocal.get()).init(2, this.f30446a, m27886c);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) threadLocal.get()).updateAAD(bArr2);
            }
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.pd3
    /* renamed from: b */
    public final byte[] mo22154b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            byte[] m24706a = ms3.m24706a(12);
            System.arraycopy(m24706a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec m27886c = m27886c(m24706a, 0, m24706a.length);
            ThreadLocal threadLocal = f30445b;
            ((Cipher) threadLocal.get()).init(1, this.f30446a, m27886c);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
