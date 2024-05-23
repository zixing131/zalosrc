package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class cr3 implements gs3 {

    /* renamed from: d */
    private static final ThreadLocal f18533d = new br3();

    /* renamed from: a */
    private final SecretKeySpec f18534a;

    /* renamed from: b */
    private final int f18535b;

    /* renamed from: c */
    private final int f18536c;

    public cr3(byte[] bArr, int i11) {
        if (yg3.m28203a(2)) {
            os3.m25255a(bArr.length);
            this.f18534a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f18533d.get()).getBlockSize();
            this.f18536c = blockSize;
            if (i11 >= 12 && i11 <= blockSize) {
                this.f18535b = i11;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    private final void m20991c(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, byte[] bArr3, boolean z11) {
        Cipher cipher = (Cipher) f18533d.get();
        byte[] bArr4 = new byte[this.f18536c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f18535b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z11) {
            cipher.init(1, this.f18534a, ivParameterSpec);
        } else {
            cipher.init(2, this.f18534a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i11, i12, bArr2, i13) == i12) {
        } else {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.ads.gs3
    /* renamed from: a */
    public final byte[] mo20992a(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f18535b;
        if (length >= i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            int i12 = this.f18535b;
            int i13 = length - i12;
            byte[] bArr3 = new byte[i13];
            m20991c(bArr, i12, i13, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.gs3
    /* renamed from: b */
    public final byte[] mo20993b(byte[] bArr) {
        int length = bArr.length;
        int i11 = this.f18535b;
        if (length <= Integer.MAX_VALUE - i11) {
            byte[] bArr2 = new byte[i11 + length];
            byte[] m24706a = ms3.m24706a(i11);
            System.arraycopy(m24706a, 0, bArr2, 0, this.f18535b);
            m20991c(bArr, 0, length, bArr2, this.f18535b, m24706a, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f18535b));
    }
}
