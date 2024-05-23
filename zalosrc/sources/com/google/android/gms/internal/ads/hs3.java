package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class hs3 implements cl3 {

    /* renamed from: a */
    private final SecretKey f21894a;

    /* renamed from: b */
    private final byte[] f21895b;

    /* renamed from: c */
    private final byte[] f21896c;

    public hs3(byte[] bArr) {
        os3.m25255a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f21894a = secretKeySpec;
        Cipher m23009b = m23009b();
        m23009b.init(1, secretKeySpec);
        byte[] m23384b = ir3.m23384b(m23009b.doFinal(new byte[16]));
        this.f21895b = m23384b;
        this.f21896c = ir3.m23384b(m23384b);
    }

    /* renamed from: b */
    private static Cipher m23009b() {
        if (yg3.m28203a(1)) {
            return (Cipher) vr3.f29467e.m27341a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.cl3
    /* renamed from: a */
    public final byte[] mo20934a(byte[] bArr, int i11) {
        byte[] m23729d;
        if (i11 <= 16) {
            Cipher m23009b = m23009b();
            m23009b.init(1, this.f21894a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                m23729d = jr3.m23730e(bArr, (max - 1) * 16, this.f21895b, 0, 16);
            } else {
                m23729d = jr3.m23729d(ir3.m23383a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f21896c);
            }
            byte[] bArr2 = new byte[16];
            for (int i12 = 0; i12 < max - 1; i12++) {
                bArr2 = m23009b.doFinal(jr3.m23730e(bArr2, 0, bArr, i12 * 16, 16));
            }
            return Arrays.copyOf(m23009b.doFinal(jr3.m23729d(m23729d, bArr2)), i11);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
