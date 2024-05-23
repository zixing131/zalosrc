package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class yh3 {

    /* renamed from: g */
    private static final byte[] f30944g = new byte[0];

    /* renamed from: a */
    private final xh3 f30945a;

    /* renamed from: b */
    private final BigInteger f30946b;

    /* renamed from: c */
    private final byte[] f30947c;

    /* renamed from: d */
    private final byte[] f30948d;

    /* renamed from: e */
    private final byte[] f30949e;

    /* renamed from: f */
    private BigInteger f30950f = BigInteger.ZERO;

    private yh3(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, xh3 xh3Var) {
        this.f30949e = bArr;
        this.f30947c = bArr2;
        this.f30948d = bArr3;
        this.f30946b = bigInteger;
        this.f30945a = xh3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static yh3 m28204c(byte[] bArr, byte[] bArr2, bi3 bi3Var, wh3 wh3Var, xh3 xh3Var, byte[] bArr3) {
        byte[] m24298b = li3.m24298b(bi3Var.zzb(), wh3Var.m27613c(), xh3Var.zzb());
        byte[] bArr4 = li3.f23943l;
        byte[] bArr5 = f30944g;
        byte[] m23728c = jr3.m23728c(li3.f23932a, wh3Var.m27615e(bArr4, bArr5, "psk_id_hash", m24298b), wh3Var.m27615e(bArr4, bArr3, "info_hash", m24298b));
        byte[] m27615e = wh3Var.m27615e(bArr2, bArr5, "secret", m24298b);
        byte[] m27614d = wh3Var.m27614d(m27615e, m23728c, "key", m24298b, xh3Var.zza());
        byte[] m27614d2 = wh3Var.m27614d(m27615e, m23728c, "base_nonce", m24298b, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new yh3(bArr, m27614d, m27614d2, bigInteger.shiftLeft(96).subtract(bigInteger), xh3Var);
    }

    /* renamed from: d */
    private final synchronized byte[] m28205d() {
        byte[] m23729d;
        try {
            byte[] bArr = this.f30948d;
            byte[] byteArray = this.f30950f.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length <= 13) {
                    if (length == 13) {
                        if (byteArray[0] == 0) {
                            byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                        } else {
                            throw new GeneralSecurityException("integer too large");
                        }
                    } else {
                        byte[] bArr2 = new byte[12];
                        System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                        byteArray = bArr2;
                    }
                } else {
                    throw new GeneralSecurityException("integer too large");
                }
            }
            m23729d = jr3.m23729d(bArr, byteArray);
            if (this.f30950f.compareTo(this.f30946b) < 0) {
                this.f30950f = this.f30950f.add(BigInteger.ONE);
            } else {
                throw new GeneralSecurityException("message limit reached");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m23729d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] m28206a() {
        return this.f30949e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] m28207b(byte[] bArr, byte[] bArr2) {
        return this.f30945a.mo26966a(this.f30947c, m28205d(), bArr, bArr2);
    }
}
