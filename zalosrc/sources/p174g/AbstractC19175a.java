package p174g;

/* renamed from: g.a */
/* loaded from: classes2.dex */
public abstract class AbstractC19175a {

    /* renamed from: a */
    private static final char[] f95305a;

    /* renamed from: b */
    private static final byte[] f95306b;

    static {
        System.getProperty("line.separator");
        f95305a = new char[64];
        char c11 = 'A';
        int i11 = 0;
        while (c11 <= 'Z') {
            f95305a[i11] = c11;
            c11 = (char) (c11 + 1);
            i11++;
        }
        char c12 = 'a';
        while (c12 <= 'z') {
            f95305a[i11] = c12;
            c12 = (char) (c12 + 1);
            i11++;
        }
        char c13 = '0';
        while (c13 <= '9') {
            f95305a[i11] = c13;
            c13 = (char) (c13 + 1);
            i11++;
        }
        char[] cArr = f95305a;
        cArr[i11] = '+';
        cArr[i11 + 1] = '/';
        f95306b = new byte[128];
        int i12 = 0;
        while (true) {
            byte[] bArr = f95306b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            f95306b[f95305a[i13]] = (byte) i13;
        }
    }

    /* renamed from: a */
    public static byte[] m100627a(String str) {
        return m100628b(str.toCharArray());
    }

    /* renamed from: b */
    public static byte[] m100628b(char[] cArr) {
        return m100629c(cArr, 0, cArr.length);
    }

    /* renamed from: c */
    public static byte[] m100629c(char[] cArr, int i11, int i12) {
        char c11;
        if (i12 % 4 != 0) {
            throw new IllegalArgumentException("Length of ZBase64 encoded input string is not a multiple of 4.");
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
                throw new IllegalArgumentException("Illegal character in ZBase64 encoded data.");
            }
            byte[] bArr2 = f95306b;
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c13];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c14];
            if (b11 < 0 || b12 < 0 || b13 < 0 || b14 < 0) {
                throw new IllegalArgumentException("Illegal character in ZBase64 encoded data.");
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

    /* renamed from: d */
    public static byte[] m100630d(String str) {
        char[] cArr = new char[str.length()];
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (charAt != ' ' && charAt != '\r' && charAt != '\n' && charAt != '\t') {
                cArr[i11] = charAt;
                i11++;
            }
        }
        return m100629c(cArr, 0, i11);
    }

    /* renamed from: e */
    public static String m100631e(String str) {
        return new String(m100627a(str));
    }
}
