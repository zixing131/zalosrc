package p227i3;

/* renamed from: i3.b */
/* loaded from: classes2.dex */
public abstract class AbstractC20198b {

    /* renamed from: a */
    private static final char[] f99752a;

    /* renamed from: b */
    private static final byte[] f99753b;

    static {
        System.getProperty("line.separator");
        f99752a = new char[64];
        f99753b = new byte[128];
        char c11 = 'A';
        int i11 = 0;
        while (c11 <= 'Z') {
            f99752a[i11] = c11;
            c11 = (char) (c11 + 1);
            i11++;
        }
        char c12 = 'a';
        while (c12 <= 'z') {
            f99752a[i11] = c12;
            c12 = (char) (c12 + 1);
            i11++;
        }
        char c13 = '0';
        while (c13 <= '9') {
            f99752a[i11] = c13;
            c13 = (char) (c13 + 1);
            i11++;
        }
        char[] cArr = f99752a;
        cArr[i11] = '+';
        cArr[i11 + 1] = '/';
        int i12 = 0;
        while (true) {
            byte[] bArr = f99753b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            f99753b[f99752a[i13]] = (byte) i13;
        }
    }

    /* renamed from: a */
    public static String m105325a(String str, boolean z11) {
        return z11 ? new String(m105326b(new StringBuilder(str).reverse().toString().replace("\n", "").replace("\r", ""))) : new String(m105326b(str));
    }

    /* renamed from: b */
    public static byte[] m105326b(String str) {
        return m105327c(str.toCharArray());
    }

    /* renamed from: c */
    public static byte[] m105327c(char[] cArr) {
        return m105328d(cArr, 0, cArr.length);
    }

    /* renamed from: d */
    public static byte[] m105328d(char[] cArr, int i11, int i12) {
        char c11;
        if (i12 % 4 != 0) {
            throw new IllegalArgumentException("Length of ZAdsBase64 encoded input string is not a multiple of 4.");
        }
        while (i12 > 0 && cArr[(i11 + i12) - 1] == '=') {
            i12--;
        }
        int i13 = (i12 * 3) / 4;
        byte[] bArr = new byte[i13];
        int i14 = i12 + i11;
        int i15 = 0;
        while (i11 < i14) {
            char c12 = cArr[i11];
            int i16 = i11 + 2;
            char c13 = cArr[i11 + 1];
            char c14 = 'A';
            if (i16 < i14) {
                char c15 = cArr[i16];
                i16 = i11 + 3;
                c11 = c15;
            } else {
                c11 = 'A';
            }
            if (i16 < i14) {
                c14 = cArr[i16];
                i16++;
            }
            if (c12 > 127 || c13 > 127 || c11 > 127 || c14 > 127) {
                throw new IllegalArgumentException("Illegal character in ZAdsBase64 encoded data.");
            }
            byte[] bArr2 = f99753b;
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c13];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c14];
            if (b11 < 0 || b12 < 0 || b13 < 0 || b14 < 0) {
                throw new IllegalArgumentException("Illegal character in ZAdsBase64 encoded data.");
            }
            int i17 = (b11 << 2) | (b12 >>> 4);
            int i18 = ((b12 & 15) << 4) | (b13 >>> 2);
            int i19 = ((b13 & 3) << 6) | b14;
            int i21 = i15 + 1;
            bArr[i15] = (byte) i17;
            if (i21 < i13) {
                bArr[i21] = (byte) i18;
                i21 = i15 + 2;
            }
            if (i21 < i13) {
                i15 = i21 + 1;
                bArr[i21] = (byte) i19;
            } else {
                i15 = i21;
            }
            i11 = i16;
        }
        return bArr;
    }

    /* renamed from: e */
    public static char[] m105329e(byte[] bArr) {
        return m105330f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static char[] m105330f(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15 = ((i12 * 4) + 2) / 3;
        char[] cArr = new char[((i12 + 2) / 3) * 4];
        int i16 = i12 + i11;
        int i17 = 0;
        while (i11 < i16) {
            int i18 = i11 + 1;
            byte b11 = bArr[i11];
            int i19 = b11 & 255;
            if (i18 < i16) {
                int i21 = bArr[i18] & 255;
                i18 = i11 + 2;
                i13 = i21;
            } else {
                i13 = 0;
            }
            if (i18 < i16) {
                i14 = bArr[i18] & 255;
                i18++;
            } else {
                i14 = 0;
            }
            int i22 = ((b11 & 3) << 4) | (i13 >>> 4);
            int i23 = ((i13 & 15) << 2) | (i14 >>> 6);
            int i24 = i14 & 63;
            char[] cArr2 = f99752a;
            cArr[i17] = cArr2[i19 >>> 2];
            int i25 = i17 + 2;
            cArr[i17 + 1] = cArr2[i22];
            char c11 = '=';
            cArr[i25] = i25 < i15 ? cArr2[i23] : '=';
            int i26 = i17 + 3;
            if (i26 < i15) {
                c11 = cArr2[i24];
            }
            cArr[i26] = c11;
            i17 += 4;
            i11 = i18;
        }
        return cArr;
    }

    /* renamed from: g */
    public static String m105331g(String str, boolean z11) {
        return z11 ? new StringBuilder(new String(m105329e(str.getBytes()))).reverse().toString() : new String(m105329e(str.getBytes()));
    }
}
