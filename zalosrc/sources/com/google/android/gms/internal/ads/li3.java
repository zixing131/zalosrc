package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class li3 {

    /* renamed from: a */
    public static final byte[] f23932a = m24299c(1, 0);

    /* renamed from: b */
    public static final byte[] f23933b = m24299c(2, 32);

    /* renamed from: c */
    public static final byte[] f23934c = m24299c(2, 16);

    /* renamed from: d */
    public static final byte[] f23935d = m24299c(2, 17);

    /* renamed from: e */
    public static final byte[] f23936e = m24299c(2, 18);

    /* renamed from: f */
    public static final byte[] f23937f = m24299c(2, 1);

    /* renamed from: g */
    public static final byte[] f23938g = m24299c(2, 2);

    /* renamed from: h */
    public static final byte[] f23939h = m24299c(2, 3);

    /* renamed from: i */
    public static final byte[] f23940i = m24299c(2, 1);

    /* renamed from: j */
    public static final byte[] f23941j = m24299c(2, 2);

    /* renamed from: k */
    public static final byte[] f23942k = m24299c(2, 3);

    /* renamed from: l */
    public static final byte[] f23943l = new byte[0];

    /* renamed from: m */
    private static final byte[] f23944m;

    /* renamed from: n */
    private static final byte[] f23945n;

    /* renamed from: o */
    private static final byte[] f23946o;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f23944m = "KEM".getBytes(charset);
        f23945n = "HPKE".getBytes(charset);
        f23946o = "HPKE-v1".getBytes(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24297a(ap3 ap3Var) {
        if (ap3Var.m20219K() != 2 && ap3Var.m20219K() != 1) {
            String str = "UNRECOGNIZED";
            if (ap3Var.m20218J() != 2 && ap3Var.m20218J() != 1) {
                if (ap3Var.m20217I() != 2 && ap3Var.m20217I() != 1) {
                    return;
                }
                int m20217I = ap3Var.m20217I();
                if (m20217I != 2) {
                    if (m20217I != 3) {
                        if (m20217I != 4) {
                            if (m20217I == 5) {
                                str = "CHACHA20_POLY1305";
                            }
                        } else {
                            str = "AES_256_GCM";
                        }
                    } else {
                        str = "AES_128_GCM";
                    }
                } else {
                    str = "AEAD_UNKNOWN";
                }
                throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
            }
            int m20218J = ap3Var.m20218J();
            if (m20218J != 2) {
                if (m20218J != 3) {
                    if (m20218J != 4) {
                        if (m20218J == 5) {
                            str = "HKDF_SHA512";
                        }
                    } else {
                        str = "HKDF_SHA384";
                    }
                } else {
                    str = "HKDF_SHA256";
                }
            } else {
                str = "KDF_UNKNOWN";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(uo3.m27027a(ap3Var.m20219K())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte[] m24298b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return jr3.m23728c(f23945n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m24299c(int i11, int i12) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) ((i12 >> (((i11 - i13) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static byte[] m24300d(byte[] bArr) {
        return jr3.m23728c(f23944m, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static byte[] m24301e(String str, byte[] bArr, byte[] bArr2) {
        return jr3.m23728c(f23946o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static byte[] m24302f(String str, byte[] bArr, byte[] bArr2, int i11) {
        return jr3.m23728c(m24299c(2, i11), f23946o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
