package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class hr3 implements vd3 {

    /* renamed from: c */
    private static final Collection f21884c = Arrays.asList(64);

    /* renamed from: d */
    private static final byte[] f21885d = new byte[16];

    /* renamed from: a */
    private final hs3 f21886a;

    /* renamed from: b */
    private final byte[] f21887b;

    public hr3(byte[] bArr) {
        if (yg3.m28203a(1)) {
            Collection collection = f21884c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i11 = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i11);
                this.f21887b = Arrays.copyOfRange(bArr, i11, length);
                this.f21886a = new hs3(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.vd3
    /* renamed from: a */
    public final byte[] mo21715a(byte[] bArr, byte[] bArr2) {
        byte[] m23729d;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) vr3.f29467e.m27341a("AES/CTR/NoPadding");
            byte[][] bArr3 = {bArr2, bArr};
            byte[] mo20934a = this.f21886a.mo20934a(f21885d, 16);
            for (int i11 = 0; i11 <= 0; i11++) {
                byte[] bArr4 = bArr3[i11];
                if (bArr4 == null) {
                    bArr4 = new byte[0];
                }
                mo20934a = jr3.m23729d(ir3.m23384b(mo20934a), this.f21886a.mo20934a(bArr4, 16));
            }
            byte[] bArr5 = bArr3[1];
            int length = bArr5.length;
            if (length >= 16) {
                int length2 = mo20934a.length;
                if (length >= length2) {
                    int i12 = length - length2;
                    m23729d = Arrays.copyOf(bArr5, length);
                    for (int i13 = 0; i13 < mo20934a.length; i13++) {
                        int i14 = i12 + i13;
                        m23729d[i14] = (byte) (m23729d[i14] ^ mo20934a[i13]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                m23729d = jr3.m23729d(ir3.m23383a(bArr5), ir3.m23384b(mo20934a));
            }
            byte[] mo20934a2 = this.f21886a.mo20934a(m23729d, 16);
            byte[] bArr6 = (byte[]) mo20934a2.clone();
            bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
            bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f21887b, "AES"), new IvParameterSpec(bArr6));
            return jr3.m23728c(mo20934a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
